package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'System'", "':'", "'{'", "'}'", "'Domain'", "'Entities'", "'Photo'", "'Album'", "'UserDomain'", "'Functionalities'", "'ProfileManagement'", "'ViewProfilePhoto'", "'EditProfileInfo'", "'AppAccess'", "'Login'", "'Register'", "'AlbumManagement'", "'CreateAlbum'", "'SelectAlbum'", "'PhotoActions'", "'ViewAllPhotos'", "'ViewExtendedPhoto'", "'LoadPhoto'", "'LandingActions'", "'ViewCarousel'", "'PassPhoto'", "'DomainRelations'", "'Architecture:'", "'Layers'", "'LayersRelations'", "'ArchitectureComponents'", "'PresentationLayer'", "'PresentationSegments'", "'PresentationView'", "'PresentationComponent'", "'PresentationAction'", "'BusinessLogicLayer'", "'BusinessLogicSegments'", "'ControllerSegment'", "'ModelSegment'", "'RepositorySegment'", "'SecuritySegment'", "'DataPersistenceLayer'", "'DataPersistenceSegments'", "'PostgreSLQSegment'", "'AmazonS3Storage'", "'SegmentStructure'", "'Directories'", "'Directory'", "'SingleFile'", "'CommonFile'", "'AllowedToUse'", "'AllowToUseBelow'", "'source'", "'target'", "'PersistenceDataLayer'", "'SystemComponents'", "'FrontEndComponent'", "'BackEndComponent'", "'PersistenceDataComponent'", "'Connectors'", "'REST'", "'PostgreSQLConnection'", "'AmazonS3API'", "'AmazonService'", "'Technology'", "'React'", "'ReactModules'", "'ReactConfiguration'", "'DependenciesStruct'", "'DependencyType'", "'PackageName'", "'PackageVersion'", "'ReactDOMConfigurations'", "'RoutingConf'", "'ServiceWorker'", "'HTMLStructure'", "'Manifest'", "'RepositoriesConf'", "'ReactComponents'", "'LogicComponents'", "'RoutingComponents'", "'AppComponent'", "'IndexComponent'", "'UIComponents'", "'ViewComponent'", "'Subcomponents'", "'Constructor'", "'State'", "'String'", "'Array'", "'Object'", "'Number'", "'null'", "'Boolean'", "'FunctionBindingDeclaration'", "'ComponentDidMount'", "'FunctionStructure'", "'ComponentDidUpdate'", "'ComponentWillUnmount'", "'Render'", "'RenderContent'", "'Props'", "'ReactActions'", "'ServiceType'", "'ServiceContent'", "'ServicesRelations'", "'Wrapper'", "'AuxWrapper'", "'ReactLibraries'", "'LibraryContent'", "'ReactDesign'", "'ReactRouting'", "'ComponentManagement'", "'StoreManagement'", "'ReactDeployment'", "'ConfigurationLibrary'", "'ReactInformation'", "'InformationContent'", "'ReactReadme'", "'ReactAditionalInfo'", "'Spring'", "'PostgreSQL'", "'AmazonWebServices'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=4;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'System' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomain ) ) ( (lv_elements_4_0= ruleArchitecture ) ) ( (lv_elements_5_0= ruleTechnology ) ) otherlv_6= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_4_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'System' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomain ) ) ( (lv_elements_4_0= ruleArchitecture ) ) ( (lv_elements_5_0= ruleTechnology ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'System' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomain ) ) ( (lv_elements_4_0= ruleArchitecture ) ) ( (lv_elements_5_0= ruleTechnology ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'System' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomain ) ) ( (lv_elements_4_0= ruleArchitecture ) ) ( (lv_elements_5_0= ruleTechnology ) ) otherlv_6= '}' )
            // InternalMyDsl.g:79:3: otherlv_0= 'System' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomain ) ) ( (lv_elements_4_0= ruleArchitecture ) ) ( (lv_elements_5_0= ruleTechnology ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:91:3: ( (lv_elements_3_0= ruleDomain ) )
            // InternalMyDsl.g:92:4: (lv_elements_3_0= ruleDomain )
            {
            // InternalMyDsl.g:92:4: (lv_elements_3_0= ruleDomain )
            // InternalMyDsl.g:93:5: lv_elements_3_0= ruleDomain
            {

            					newCompositeNode(grammarAccess.getModelAccess().getElementsDomainParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_elements_3_0=ruleDomain();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_3_0,
            						"org.xtext.example.mydsl.MyDsl.Domain");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:110:3: ( (lv_elements_4_0= ruleArchitecture ) )
            // InternalMyDsl.g:111:4: (lv_elements_4_0= ruleArchitecture )
            {
            // InternalMyDsl.g:111:4: (lv_elements_4_0= ruleArchitecture )
            // InternalMyDsl.g:112:5: lv_elements_4_0= ruleArchitecture
            {

            					newCompositeNode(grammarAccess.getModelAccess().getElementsArchitectureParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_elements_4_0=ruleArchitecture();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_4_0,
            						"org.xtext.example.mydsl.MyDsl.Architecture");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:129:3: ( (lv_elements_5_0= ruleTechnology ) )
            // InternalMyDsl.g:130:4: (lv_elements_5_0= ruleTechnology )
            {
            // InternalMyDsl.g:130:4: (lv_elements_5_0= ruleTechnology )
            // InternalMyDsl.g:131:5: lv_elements_5_0= ruleTechnology
            {

            					newCompositeNode(grammarAccess.getModelAccess().getElementsTechnologyParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_elements_5_0=ruleTechnology();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_5_0,
            						"org.xtext.example.mydsl.MyDsl.Technology");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDomain"
    // InternalMyDsl.g:156:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalMyDsl.g:156:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalMyDsl.g:157:2: iv_ruleDomain= ruleDomain EOF
            {
             newCompositeNode(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomain=ruleDomain();

            state._fsp--;

             current =iv_ruleDomain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalMyDsl.g:163:1: ruleDomain returns [EObject current=null] : (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleEntity ) ) ( (lv_elements_5_0= ruleFunctionality ) ) ( (lv_elements_6_0= ruleDomainConnection ) ) otherlv_7= '}' ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject lv_elements_4_0 = null;

        EObject lv_elements_5_0 = null;

        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:169:2: ( (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleEntity ) ) ( (lv_elements_5_0= ruleFunctionality ) ) ( (lv_elements_6_0= ruleDomainConnection ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:170:2: (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleEntity ) ) ( (lv_elements_5_0= ruleFunctionality ) ) ( (lv_elements_6_0= ruleDomainConnection ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:170:2: (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleEntity ) ) ( (lv_elements_5_0= ruleFunctionality ) ) ( (lv_elements_6_0= ruleDomainConnection ) ) otherlv_7= '}' )
            // InternalMyDsl.g:171:3: otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleEntity ) ) ( (lv_elements_5_0= ruleFunctionality ) ) ( (lv_elements_6_0= ruleDomainConnection ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainAccess().getDomainKeyword_0());
            		
            // InternalMyDsl.g:175:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:176:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:176:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:177:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDomainAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:201:3: ( (lv_elements_4_0= ruleEntity ) )
            // InternalMyDsl.g:202:4: (lv_elements_4_0= ruleEntity )
            {
            // InternalMyDsl.g:202:4: (lv_elements_4_0= ruleEntity )
            // InternalMyDsl.g:203:5: lv_elements_4_0= ruleEntity
            {

            					newCompositeNode(grammarAccess.getDomainAccess().getElementsEntityParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_elements_4_0=ruleEntity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_4_0,
            						"org.xtext.example.mydsl.MyDsl.Entity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:220:3: ( (lv_elements_5_0= ruleFunctionality ) )
            // InternalMyDsl.g:221:4: (lv_elements_5_0= ruleFunctionality )
            {
            // InternalMyDsl.g:221:4: (lv_elements_5_0= ruleFunctionality )
            // InternalMyDsl.g:222:5: lv_elements_5_0= ruleFunctionality
            {

            					newCompositeNode(grammarAccess.getDomainAccess().getElementsFunctionalityParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_elements_5_0=ruleFunctionality();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_5_0,
            						"org.xtext.example.mydsl.MyDsl.Functionality");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:239:3: ( (lv_elements_6_0= ruleDomainConnection ) )
            // InternalMyDsl.g:240:4: (lv_elements_6_0= ruleDomainConnection )
            {
            // InternalMyDsl.g:240:4: (lv_elements_6_0= ruleDomainConnection )
            // InternalMyDsl.g:241:5: lv_elements_6_0= ruleDomainConnection
            {

            					newCompositeNode(grammarAccess.getDomainAccess().getElementsDomainConnectionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_elements_6_0=ruleDomainConnection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_6_0,
            						"org.xtext.example.mydsl.MyDsl.DomainConnection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:266:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalMyDsl.g:266:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalMyDsl.g:267:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyDsl.g:273:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleEntities ) ) otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:279:2: ( (otherlv_0= 'Entities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleEntities ) ) otherlv_4= '}' ) )
            // InternalMyDsl.g:280:2: (otherlv_0= 'Entities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleEntities ) ) otherlv_4= '}' )
            {
            // InternalMyDsl.g:280:2: (otherlv_0= 'Entities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleEntities ) ) otherlv_4= '}' )
            // InternalMyDsl.g:281:3: otherlv_0= 'Entities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleEntities ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntitiesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:293:3: ( (lv_elements_3_0= ruleEntities ) )
            // InternalMyDsl.g:294:4: (lv_elements_3_0= ruleEntities )
            {
            // InternalMyDsl.g:294:4: (lv_elements_3_0= ruleEntities )
            // InternalMyDsl.g:295:5: lv_elements_3_0= ruleEntities
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getElementsEntitiesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_elements_3_0=ruleEntities();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_3_0,
            						"org.xtext.example.mydsl.MyDsl.Entities");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEntities"
    // InternalMyDsl.g:320:1: entryRuleEntities returns [EObject current=null] : iv_ruleEntities= ruleEntities EOF ;
    public final EObject entryRuleEntities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntities = null;


        try {
            // InternalMyDsl.g:320:49: (iv_ruleEntities= ruleEntities EOF )
            // InternalMyDsl.g:321:2: iv_ruleEntities= ruleEntities EOF
            {
             newCompositeNode(grammarAccess.getEntitiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntities=ruleEntities();

            state._fsp--;

             current =iv_ruleEntities; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntities"


    // $ANTLR start "ruleEntities"
    // InternalMyDsl.g:327:1: ruleEntities returns [EObject current=null] : ( ( (lv_elements_0_0= rulePhoto ) )+ ( (lv_elements_1_0= ruleAlbum ) )+ ( (lv_elements_2_0= ruleUserDomain ) )+ ) ;
    public final EObject ruleEntities() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;

        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:333:2: ( ( ( (lv_elements_0_0= rulePhoto ) )+ ( (lv_elements_1_0= ruleAlbum ) )+ ( (lv_elements_2_0= ruleUserDomain ) )+ ) )
            // InternalMyDsl.g:334:2: ( ( (lv_elements_0_0= rulePhoto ) )+ ( (lv_elements_1_0= ruleAlbum ) )+ ( (lv_elements_2_0= ruleUserDomain ) )+ )
            {
            // InternalMyDsl.g:334:2: ( ( (lv_elements_0_0= rulePhoto ) )+ ( (lv_elements_1_0= ruleAlbum ) )+ ( (lv_elements_2_0= ruleUserDomain ) )+ )
            // InternalMyDsl.g:335:3: ( (lv_elements_0_0= rulePhoto ) )+ ( (lv_elements_1_0= ruleAlbum ) )+ ( (lv_elements_2_0= ruleUserDomain ) )+
            {
            // InternalMyDsl.g:335:3: ( (lv_elements_0_0= rulePhoto ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:336:4: (lv_elements_0_0= rulePhoto )
            	    {
            	    // InternalMyDsl.g:336:4: (lv_elements_0_0= rulePhoto )
            	    // InternalMyDsl.g:337:5: lv_elements_0_0= rulePhoto
            	    {

            	    					newCompositeNode(grammarAccess.getEntitiesAccess().getElementsPhotoParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_elements_0_0=rulePhoto();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntitiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_0_0,
            	    						"org.xtext.example.mydsl.MyDsl.Photo");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalMyDsl.g:354:3: ( (lv_elements_1_0= ruleAlbum ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:355:4: (lv_elements_1_0= ruleAlbum )
            	    {
            	    // InternalMyDsl.g:355:4: (lv_elements_1_0= ruleAlbum )
            	    // InternalMyDsl.g:356:5: lv_elements_1_0= ruleAlbum
            	    {

            	    					newCompositeNode(grammarAccess.getEntitiesAccess().getElementsAlbumParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_elements_1_0=ruleAlbum();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntitiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Album");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // InternalMyDsl.g:373:3: ( (lv_elements_2_0= ruleUserDomain ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:374:4: (lv_elements_2_0= ruleUserDomain )
            	    {
            	    // InternalMyDsl.g:374:4: (lv_elements_2_0= ruleUserDomain )
            	    // InternalMyDsl.g:375:5: lv_elements_2_0= ruleUserDomain
            	    {

            	    					newCompositeNode(grammarAccess.getEntitiesAccess().getElementsUserDomainParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_elements_2_0=ruleUserDomain();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntitiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.UserDomain");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntities"


    // $ANTLR start "entryRulePhoto"
    // InternalMyDsl.g:396:1: entryRulePhoto returns [EObject current=null] : iv_rulePhoto= rulePhoto EOF ;
    public final EObject entryRulePhoto() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhoto = null;


        try {
            // InternalMyDsl.g:396:46: (iv_rulePhoto= rulePhoto EOF )
            // InternalMyDsl.g:397:2: iv_rulePhoto= rulePhoto EOF
            {
             newCompositeNode(grammarAccess.getPhotoRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhoto=rulePhoto();

            state._fsp--;

             current =iv_rulePhoto; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhoto"


    // $ANTLR start "rulePhoto"
    // InternalMyDsl.g:403:1: rulePhoto returns [EObject current=null] : (otherlv_0= 'Photo' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePhoto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:409:2: ( (otherlv_0= 'Photo' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:410:2: (otherlv_0= 'Photo' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:410:2: (otherlv_0= 'Photo' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:411:3: otherlv_0= 'Photo' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPhotoAccess().getPhotoKeyword_0());
            		
            // InternalMyDsl.g:415:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:416:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:416:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:417:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPhotoAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhotoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhoto"


    // $ANTLR start "entryRuleAlbum"
    // InternalMyDsl.g:437:1: entryRuleAlbum returns [EObject current=null] : iv_ruleAlbum= ruleAlbum EOF ;
    public final EObject entryRuleAlbum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlbum = null;


        try {
            // InternalMyDsl.g:437:46: (iv_ruleAlbum= ruleAlbum EOF )
            // InternalMyDsl.g:438:2: iv_ruleAlbum= ruleAlbum EOF
            {
             newCompositeNode(grammarAccess.getAlbumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlbum=ruleAlbum();

            state._fsp--;

             current =iv_ruleAlbum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlbum"


    // $ANTLR start "ruleAlbum"
    // InternalMyDsl.g:444:1: ruleAlbum returns [EObject current=null] : (otherlv_0= 'Album' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAlbum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:450:2: ( (otherlv_0= 'Album' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:451:2: (otherlv_0= 'Album' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:451:2: (otherlv_0= 'Album' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:452:3: otherlv_0= 'Album' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAlbumAccess().getAlbumKeyword_0());
            		
            // InternalMyDsl.g:456:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:457:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:457:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:458:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAlbumAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlbumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlbum"


    // $ANTLR start "entryRuleUserDomain"
    // InternalMyDsl.g:478:1: entryRuleUserDomain returns [EObject current=null] : iv_ruleUserDomain= ruleUserDomain EOF ;
    public final EObject entryRuleUserDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserDomain = null;


        try {
            // InternalMyDsl.g:478:51: (iv_ruleUserDomain= ruleUserDomain EOF )
            // InternalMyDsl.g:479:2: iv_ruleUserDomain= ruleUserDomain EOF
            {
             newCompositeNode(grammarAccess.getUserDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUserDomain=ruleUserDomain();

            state._fsp--;

             current =iv_ruleUserDomain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUserDomain"


    // $ANTLR start "ruleUserDomain"
    // InternalMyDsl.g:485:1: ruleUserDomain returns [EObject current=null] : (otherlv_0= 'UserDomain' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleUserDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:491:2: ( (otherlv_0= 'UserDomain' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:492:2: (otherlv_0= 'UserDomain' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:492:2: (otherlv_0= 'UserDomain' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:493:3: otherlv_0= 'UserDomain' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getUserDomainAccess().getUserDomainKeyword_0());
            		
            // InternalMyDsl.g:497:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:498:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:498:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:499:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUserDomainAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserDomainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUserDomain"


    // $ANTLR start "entryRuleFunctionality"
    // InternalMyDsl.g:519:1: entryRuleFunctionality returns [EObject current=null] : iv_ruleFunctionality= ruleFunctionality EOF ;
    public final EObject entryRuleFunctionality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionality = null;


        try {
            // InternalMyDsl.g:519:54: (iv_ruleFunctionality= ruleFunctionality EOF )
            // InternalMyDsl.g:520:2: iv_ruleFunctionality= ruleFunctionality EOF
            {
             newCompositeNode(grammarAccess.getFunctionalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionality=ruleFunctionality();

            state._fsp--;

             current =iv_ruleFunctionality; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionality"


    // $ANTLR start "ruleFunctionality"
    // InternalMyDsl.g:526:1: ruleFunctionality returns [EObject current=null] : (otherlv_0= 'Functionalities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleFunctionalities ) ) otherlv_4= '}' ) ;
    public final EObject ruleFunctionality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:532:2: ( (otherlv_0= 'Functionalities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleFunctionalities ) ) otherlv_4= '}' ) )
            // InternalMyDsl.g:533:2: (otherlv_0= 'Functionalities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleFunctionalities ) ) otherlv_4= '}' )
            {
            // InternalMyDsl.g:533:2: (otherlv_0= 'Functionalities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleFunctionalities ) ) otherlv_4= '}' )
            // InternalMyDsl.g:534:3: otherlv_0= 'Functionalities' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleFunctionalities ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionalityAccess().getFunctionalitiesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionalityAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionalityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:546:3: ( (lv_elements_3_0= ruleFunctionalities ) )
            // InternalMyDsl.g:547:4: (lv_elements_3_0= ruleFunctionalities )
            {
            // InternalMyDsl.g:547:4: (lv_elements_3_0= ruleFunctionalities )
            // InternalMyDsl.g:548:5: lv_elements_3_0= ruleFunctionalities
            {

            					newCompositeNode(grammarAccess.getFunctionalityAccess().getElementsFunctionalitiesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_elements_3_0=ruleFunctionalities();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionalityRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_3_0,
            						"org.xtext.example.mydsl.MyDsl.Functionalities");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionalityAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionality"


    // $ANTLR start "entryRuleFunctionalities"
    // InternalMyDsl.g:573:1: entryRuleFunctionalities returns [EObject current=null] : iv_ruleFunctionalities= ruleFunctionalities EOF ;
    public final EObject entryRuleFunctionalities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionalities = null;


        try {
            // InternalMyDsl.g:573:56: (iv_ruleFunctionalities= ruleFunctionalities EOF )
            // InternalMyDsl.g:574:2: iv_ruleFunctionalities= ruleFunctionalities EOF
            {
             newCompositeNode(grammarAccess.getFunctionalitiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionalities=ruleFunctionalities();

            state._fsp--;

             current =iv_ruleFunctionalities; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionalities"


    // $ANTLR start "ruleFunctionalities"
    // InternalMyDsl.g:580:1: ruleFunctionalities returns [EObject current=null] : ( ( (lv_functions_0_0= ruleProfileManagement ) ) ( (lv_elements_1_0= ruleAppAccess ) ) ( (lv_items_2_0= ruleAlbumManagement ) ) ( (lv_resources_3_0= rulePhotoActions ) ) ( (lv_aditionals_4_0= ruleLandingActions ) ) ) ;
    public final EObject ruleFunctionalities() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_0_0 = null;

        EObject lv_elements_1_0 = null;

        EObject lv_items_2_0 = null;

        EObject lv_resources_3_0 = null;

        EObject lv_aditionals_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:586:2: ( ( ( (lv_functions_0_0= ruleProfileManagement ) ) ( (lv_elements_1_0= ruleAppAccess ) ) ( (lv_items_2_0= ruleAlbumManagement ) ) ( (lv_resources_3_0= rulePhotoActions ) ) ( (lv_aditionals_4_0= ruleLandingActions ) ) ) )
            // InternalMyDsl.g:587:2: ( ( (lv_functions_0_0= ruleProfileManagement ) ) ( (lv_elements_1_0= ruleAppAccess ) ) ( (lv_items_2_0= ruleAlbumManagement ) ) ( (lv_resources_3_0= rulePhotoActions ) ) ( (lv_aditionals_4_0= ruleLandingActions ) ) )
            {
            // InternalMyDsl.g:587:2: ( ( (lv_functions_0_0= ruleProfileManagement ) ) ( (lv_elements_1_0= ruleAppAccess ) ) ( (lv_items_2_0= ruleAlbumManagement ) ) ( (lv_resources_3_0= rulePhotoActions ) ) ( (lv_aditionals_4_0= ruleLandingActions ) ) )
            // InternalMyDsl.g:588:3: ( (lv_functions_0_0= ruleProfileManagement ) ) ( (lv_elements_1_0= ruleAppAccess ) ) ( (lv_items_2_0= ruleAlbumManagement ) ) ( (lv_resources_3_0= rulePhotoActions ) ) ( (lv_aditionals_4_0= ruleLandingActions ) )
            {
            // InternalMyDsl.g:588:3: ( (lv_functions_0_0= ruleProfileManagement ) )
            // InternalMyDsl.g:589:4: (lv_functions_0_0= ruleProfileManagement )
            {
            // InternalMyDsl.g:589:4: (lv_functions_0_0= ruleProfileManagement )
            // InternalMyDsl.g:590:5: lv_functions_0_0= ruleProfileManagement
            {

            					newCompositeNode(grammarAccess.getFunctionalitiesAccess().getFunctionsProfileManagementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_functions_0_0=ruleProfileManagement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionalitiesRule());
            					}
            					add(
            						current,
            						"functions",
            						lv_functions_0_0,
            						"org.xtext.example.mydsl.MyDsl.ProfileManagement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:607:3: ( (lv_elements_1_0= ruleAppAccess ) )
            // InternalMyDsl.g:608:4: (lv_elements_1_0= ruleAppAccess )
            {
            // InternalMyDsl.g:608:4: (lv_elements_1_0= ruleAppAccess )
            // InternalMyDsl.g:609:5: lv_elements_1_0= ruleAppAccess
            {

            					newCompositeNode(grammarAccess.getFunctionalitiesAccess().getElementsAppAccessParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_elements_1_0=ruleAppAccess();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionalitiesRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"org.xtext.example.mydsl.MyDsl.AppAccess");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:626:3: ( (lv_items_2_0= ruleAlbumManagement ) )
            // InternalMyDsl.g:627:4: (lv_items_2_0= ruleAlbumManagement )
            {
            // InternalMyDsl.g:627:4: (lv_items_2_0= ruleAlbumManagement )
            // InternalMyDsl.g:628:5: lv_items_2_0= ruleAlbumManagement
            {

            					newCompositeNode(grammarAccess.getFunctionalitiesAccess().getItemsAlbumManagementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_items_2_0=ruleAlbumManagement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionalitiesRule());
            					}
            					add(
            						current,
            						"items",
            						lv_items_2_0,
            						"org.xtext.example.mydsl.MyDsl.AlbumManagement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:645:3: ( (lv_resources_3_0= rulePhotoActions ) )
            // InternalMyDsl.g:646:4: (lv_resources_3_0= rulePhotoActions )
            {
            // InternalMyDsl.g:646:4: (lv_resources_3_0= rulePhotoActions )
            // InternalMyDsl.g:647:5: lv_resources_3_0= rulePhotoActions
            {

            					newCompositeNode(grammarAccess.getFunctionalitiesAccess().getResourcesPhotoActionsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_resources_3_0=rulePhotoActions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionalitiesRule());
            					}
            					add(
            						current,
            						"resources",
            						lv_resources_3_0,
            						"org.xtext.example.mydsl.MyDsl.PhotoActions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:664:3: ( (lv_aditionals_4_0= ruleLandingActions ) )
            // InternalMyDsl.g:665:4: (lv_aditionals_4_0= ruleLandingActions )
            {
            // InternalMyDsl.g:665:4: (lv_aditionals_4_0= ruleLandingActions )
            // InternalMyDsl.g:666:5: lv_aditionals_4_0= ruleLandingActions
            {

            					newCompositeNode(grammarAccess.getFunctionalitiesAccess().getAditionalsLandingActionsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_aditionals_4_0=ruleLandingActions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionalitiesRule());
            					}
            					add(
            						current,
            						"aditionals",
            						lv_aditionals_4_0,
            						"org.xtext.example.mydsl.MyDsl.LandingActions");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionalities"


    // $ANTLR start "entryRuleProfileManagement"
    // InternalMyDsl.g:687:1: entryRuleProfileManagement returns [EObject current=null] : iv_ruleProfileManagement= ruleProfileManagement EOF ;
    public final EObject entryRuleProfileManagement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProfileManagement = null;


        try {
            // InternalMyDsl.g:687:58: (iv_ruleProfileManagement= ruleProfileManagement EOF )
            // InternalMyDsl.g:688:2: iv_ruleProfileManagement= ruleProfileManagement EOF
            {
             newCompositeNode(grammarAccess.getProfileManagementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProfileManagement=ruleProfileManagement();

            state._fsp--;

             current =iv_ruleProfileManagement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProfileManagement"


    // $ANTLR start "ruleProfileManagement"
    // InternalMyDsl.g:694:1: ruleProfileManagement returns [EObject current=null] : (otherlv_0= 'ProfileManagement' otherlv_1= ':' ( (lv_items_2_0= ruleProfileManagementFunctions ) ) ) ;
    public final EObject ruleProfileManagement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_items_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:700:2: ( (otherlv_0= 'ProfileManagement' otherlv_1= ':' ( (lv_items_2_0= ruleProfileManagementFunctions ) ) ) )
            // InternalMyDsl.g:701:2: (otherlv_0= 'ProfileManagement' otherlv_1= ':' ( (lv_items_2_0= ruleProfileManagementFunctions ) ) )
            {
            // InternalMyDsl.g:701:2: (otherlv_0= 'ProfileManagement' otherlv_1= ':' ( (lv_items_2_0= ruleProfileManagementFunctions ) ) )
            // InternalMyDsl.g:702:3: otherlv_0= 'ProfileManagement' otherlv_1= ':' ( (lv_items_2_0= ruleProfileManagementFunctions ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProfileManagementAccess().getProfileManagementKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getProfileManagementAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:710:3: ( (lv_items_2_0= ruleProfileManagementFunctions ) )
            // InternalMyDsl.g:711:4: (lv_items_2_0= ruleProfileManagementFunctions )
            {
            // InternalMyDsl.g:711:4: (lv_items_2_0= ruleProfileManagementFunctions )
            // InternalMyDsl.g:712:5: lv_items_2_0= ruleProfileManagementFunctions
            {

            					newCompositeNode(grammarAccess.getProfileManagementAccess().getItemsProfileManagementFunctionsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_items_2_0=ruleProfileManagementFunctions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProfileManagementRule());
            					}
            					add(
            						current,
            						"items",
            						lv_items_2_0,
            						"org.xtext.example.mydsl.MyDsl.ProfileManagementFunctions");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProfileManagement"


    // $ANTLR start "entryRuleProfileManagementFunctions"
    // InternalMyDsl.g:733:1: entryRuleProfileManagementFunctions returns [EObject current=null] : iv_ruleProfileManagementFunctions= ruleProfileManagementFunctions EOF ;
    public final EObject entryRuleProfileManagementFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProfileManagementFunctions = null;


        try {
            // InternalMyDsl.g:733:67: (iv_ruleProfileManagementFunctions= ruleProfileManagementFunctions EOF )
            // InternalMyDsl.g:734:2: iv_ruleProfileManagementFunctions= ruleProfileManagementFunctions EOF
            {
             newCompositeNode(grammarAccess.getProfileManagementFunctionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProfileManagementFunctions=ruleProfileManagementFunctions();

            state._fsp--;

             current =iv_ruleProfileManagementFunctions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProfileManagementFunctions"


    // $ANTLR start "ruleProfileManagementFunctions"
    // InternalMyDsl.g:740:1: ruleProfileManagementFunctions returns [EObject current=null] : (otherlv_0= 'ViewProfilePhoto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'EditProfileInfo' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleProfileManagementFunctions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:746:2: ( (otherlv_0= 'ViewProfilePhoto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'EditProfileInfo' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:747:2: (otherlv_0= 'ViewProfilePhoto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'EditProfileInfo' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:747:2: (otherlv_0= 'ViewProfilePhoto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'EditProfileInfo' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalMyDsl.g:748:3: otherlv_0= 'ViewProfilePhoto' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'EditProfileInfo' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getProfileManagementFunctionsAccess().getViewProfilePhotoKeyword_0());
            		
            // InternalMyDsl.g:752:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:753:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:753:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:754:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProfileManagementFunctionsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProfileManagementFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getProfileManagementFunctionsAccess().getEditProfileInfoKeyword_2());
            		
            // InternalMyDsl.g:774:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMyDsl.g:775:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMyDsl.g:775:4: (lv_name_3_0= RULE_ID )
            // InternalMyDsl.g:776:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getProfileManagementFunctionsAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProfileManagementFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProfileManagementFunctions"


    // $ANTLR start "entryRuleAppAccess"
    // InternalMyDsl.g:796:1: entryRuleAppAccess returns [EObject current=null] : iv_ruleAppAccess= ruleAppAccess EOF ;
    public final EObject entryRuleAppAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppAccess = null;


        try {
            // InternalMyDsl.g:796:50: (iv_ruleAppAccess= ruleAppAccess EOF )
            // InternalMyDsl.g:797:2: iv_ruleAppAccess= ruleAppAccess EOF
            {
             newCompositeNode(grammarAccess.getAppAccessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppAccess=ruleAppAccess();

            state._fsp--;

             current =iv_ruleAppAccess; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAppAccess"


    // $ANTLR start "ruleAppAccess"
    // InternalMyDsl.g:803:1: ruleAppAccess returns [EObject current=null] : (otherlv_0= 'AppAccess' otherlv_1= ':' ( (lv_items_2_0= ruleAppAccessFunctions ) ) ) ;
    public final EObject ruleAppAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_items_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:809:2: ( (otherlv_0= 'AppAccess' otherlv_1= ':' ( (lv_items_2_0= ruleAppAccessFunctions ) ) ) )
            // InternalMyDsl.g:810:2: (otherlv_0= 'AppAccess' otherlv_1= ':' ( (lv_items_2_0= ruleAppAccessFunctions ) ) )
            {
            // InternalMyDsl.g:810:2: (otherlv_0= 'AppAccess' otherlv_1= ':' ( (lv_items_2_0= ruleAppAccessFunctions ) ) )
            // InternalMyDsl.g:811:3: otherlv_0= 'AppAccess' otherlv_1= ':' ( (lv_items_2_0= ruleAppAccessFunctions ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAppAccessAccess().getAppAccessKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getAppAccessAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:819:3: ( (lv_items_2_0= ruleAppAccessFunctions ) )
            // InternalMyDsl.g:820:4: (lv_items_2_0= ruleAppAccessFunctions )
            {
            // InternalMyDsl.g:820:4: (lv_items_2_0= ruleAppAccessFunctions )
            // InternalMyDsl.g:821:5: lv_items_2_0= ruleAppAccessFunctions
            {

            					newCompositeNode(grammarAccess.getAppAccessAccess().getItemsAppAccessFunctionsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_items_2_0=ruleAppAccessFunctions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppAccessRule());
            					}
            					add(
            						current,
            						"items",
            						lv_items_2_0,
            						"org.xtext.example.mydsl.MyDsl.AppAccessFunctions");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAppAccess"


    // $ANTLR start "entryRuleAppAccessFunctions"
    // InternalMyDsl.g:842:1: entryRuleAppAccessFunctions returns [EObject current=null] : iv_ruleAppAccessFunctions= ruleAppAccessFunctions EOF ;
    public final EObject entryRuleAppAccessFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppAccessFunctions = null;


        try {
            // InternalMyDsl.g:842:59: (iv_ruleAppAccessFunctions= ruleAppAccessFunctions EOF )
            // InternalMyDsl.g:843:2: iv_ruleAppAccessFunctions= ruleAppAccessFunctions EOF
            {
             newCompositeNode(grammarAccess.getAppAccessFunctionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppAccessFunctions=ruleAppAccessFunctions();

            state._fsp--;

             current =iv_ruleAppAccessFunctions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAppAccessFunctions"


    // $ANTLR start "ruleAppAccessFunctions"
    // InternalMyDsl.g:849:1: ruleAppAccessFunctions returns [EObject current=null] : (otherlv_0= 'Login' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Register' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleAppAccessFunctions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:855:2: ( (otherlv_0= 'Login' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Register' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:856:2: (otherlv_0= 'Login' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Register' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:856:2: (otherlv_0= 'Login' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Register' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalMyDsl.g:857:3: otherlv_0= 'Login' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Register' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAppAccessFunctionsAccess().getLoginKeyword_0());
            		
            // InternalMyDsl.g:861:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:862:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:862:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:863:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAppAccessFunctionsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAppAccessFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getAppAccessFunctionsAccess().getRegisterKeyword_2());
            		
            // InternalMyDsl.g:883:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMyDsl.g:884:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMyDsl.g:884:4: (lv_name_3_0= RULE_ID )
            // InternalMyDsl.g:885:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getAppAccessFunctionsAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAppAccessFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAppAccessFunctions"


    // $ANTLR start "entryRuleAlbumManagement"
    // InternalMyDsl.g:905:1: entryRuleAlbumManagement returns [EObject current=null] : iv_ruleAlbumManagement= ruleAlbumManagement EOF ;
    public final EObject entryRuleAlbumManagement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlbumManagement = null;


        try {
            // InternalMyDsl.g:905:56: (iv_ruleAlbumManagement= ruleAlbumManagement EOF )
            // InternalMyDsl.g:906:2: iv_ruleAlbumManagement= ruleAlbumManagement EOF
            {
             newCompositeNode(grammarAccess.getAlbumManagementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlbumManagement=ruleAlbumManagement();

            state._fsp--;

             current =iv_ruleAlbumManagement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlbumManagement"


    // $ANTLR start "ruleAlbumManagement"
    // InternalMyDsl.g:912:1: ruleAlbumManagement returns [EObject current=null] : (otherlv_0= 'AlbumManagement' otherlv_1= ':' ( (lv_items_2_0= ruleAlbumManagementFunctions ) ) ) ;
    public final EObject ruleAlbumManagement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_items_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:918:2: ( (otherlv_0= 'AlbumManagement' otherlv_1= ':' ( (lv_items_2_0= ruleAlbumManagementFunctions ) ) ) )
            // InternalMyDsl.g:919:2: (otherlv_0= 'AlbumManagement' otherlv_1= ':' ( (lv_items_2_0= ruleAlbumManagementFunctions ) ) )
            {
            // InternalMyDsl.g:919:2: (otherlv_0= 'AlbumManagement' otherlv_1= ':' ( (lv_items_2_0= ruleAlbumManagementFunctions ) ) )
            // InternalMyDsl.g:920:3: otherlv_0= 'AlbumManagement' otherlv_1= ':' ( (lv_items_2_0= ruleAlbumManagementFunctions ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAlbumManagementAccess().getAlbumManagementKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getAlbumManagementAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:928:3: ( (lv_items_2_0= ruleAlbumManagementFunctions ) )
            // InternalMyDsl.g:929:4: (lv_items_2_0= ruleAlbumManagementFunctions )
            {
            // InternalMyDsl.g:929:4: (lv_items_2_0= ruleAlbumManagementFunctions )
            // InternalMyDsl.g:930:5: lv_items_2_0= ruleAlbumManagementFunctions
            {

            					newCompositeNode(grammarAccess.getAlbumManagementAccess().getItemsAlbumManagementFunctionsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_items_2_0=ruleAlbumManagementFunctions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlbumManagementRule());
            					}
            					add(
            						current,
            						"items",
            						lv_items_2_0,
            						"org.xtext.example.mydsl.MyDsl.AlbumManagementFunctions");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlbumManagement"


    // $ANTLR start "entryRuleAlbumManagementFunctions"
    // InternalMyDsl.g:951:1: entryRuleAlbumManagementFunctions returns [EObject current=null] : iv_ruleAlbumManagementFunctions= ruleAlbumManagementFunctions EOF ;
    public final EObject entryRuleAlbumManagementFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlbumManagementFunctions = null;


        try {
            // InternalMyDsl.g:951:65: (iv_ruleAlbumManagementFunctions= ruleAlbumManagementFunctions EOF )
            // InternalMyDsl.g:952:2: iv_ruleAlbumManagementFunctions= ruleAlbumManagementFunctions EOF
            {
             newCompositeNode(grammarAccess.getAlbumManagementFunctionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlbumManagementFunctions=ruleAlbumManagementFunctions();

            state._fsp--;

             current =iv_ruleAlbumManagementFunctions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlbumManagementFunctions"


    // $ANTLR start "ruleAlbumManagementFunctions"
    // InternalMyDsl.g:958:1: ruleAlbumManagementFunctions returns [EObject current=null] : (otherlv_0= 'CreateAlbum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'SelectAlbum' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleAlbumManagementFunctions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:964:2: ( (otherlv_0= 'CreateAlbum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'SelectAlbum' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:965:2: (otherlv_0= 'CreateAlbum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'SelectAlbum' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:965:2: (otherlv_0= 'CreateAlbum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'SelectAlbum' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalMyDsl.g:966:3: otherlv_0= 'CreateAlbum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'SelectAlbum' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAlbumManagementFunctionsAccess().getCreateAlbumKeyword_0());
            		
            // InternalMyDsl.g:970:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:971:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:971:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:972:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAlbumManagementFunctionsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlbumManagementFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getAlbumManagementFunctionsAccess().getSelectAlbumKeyword_2());
            		
            // InternalMyDsl.g:992:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMyDsl.g:993:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMyDsl.g:993:4: (lv_name_3_0= RULE_ID )
            // InternalMyDsl.g:994:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getAlbumManagementFunctionsAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlbumManagementFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlbumManagementFunctions"


    // $ANTLR start "entryRulePhotoActions"
    // InternalMyDsl.g:1014:1: entryRulePhotoActions returns [EObject current=null] : iv_rulePhotoActions= rulePhotoActions EOF ;
    public final EObject entryRulePhotoActions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhotoActions = null;


        try {
            // InternalMyDsl.g:1014:53: (iv_rulePhotoActions= rulePhotoActions EOF )
            // InternalMyDsl.g:1015:2: iv_rulePhotoActions= rulePhotoActions EOF
            {
             newCompositeNode(grammarAccess.getPhotoActionsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhotoActions=rulePhotoActions();

            state._fsp--;

             current =iv_rulePhotoActions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhotoActions"


    // $ANTLR start "rulePhotoActions"
    // InternalMyDsl.g:1021:1: rulePhotoActions returns [EObject current=null] : (otherlv_0= 'PhotoActions' otherlv_1= ':' ( (lv_items_2_0= rulePhotoActionsFunctions ) ) ) ;
    public final EObject rulePhotoActions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_items_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1027:2: ( (otherlv_0= 'PhotoActions' otherlv_1= ':' ( (lv_items_2_0= rulePhotoActionsFunctions ) ) ) )
            // InternalMyDsl.g:1028:2: (otherlv_0= 'PhotoActions' otherlv_1= ':' ( (lv_items_2_0= rulePhotoActionsFunctions ) ) )
            {
            // InternalMyDsl.g:1028:2: (otherlv_0= 'PhotoActions' otherlv_1= ':' ( (lv_items_2_0= rulePhotoActionsFunctions ) ) )
            // InternalMyDsl.g:1029:3: otherlv_0= 'PhotoActions' otherlv_1= ':' ( (lv_items_2_0= rulePhotoActionsFunctions ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPhotoActionsAccess().getPhotoActionsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getPhotoActionsAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:1037:3: ( (lv_items_2_0= rulePhotoActionsFunctions ) )
            // InternalMyDsl.g:1038:4: (lv_items_2_0= rulePhotoActionsFunctions )
            {
            // InternalMyDsl.g:1038:4: (lv_items_2_0= rulePhotoActionsFunctions )
            // InternalMyDsl.g:1039:5: lv_items_2_0= rulePhotoActionsFunctions
            {

            					newCompositeNode(grammarAccess.getPhotoActionsAccess().getItemsPhotoActionsFunctionsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_items_2_0=rulePhotoActionsFunctions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhotoActionsRule());
            					}
            					add(
            						current,
            						"items",
            						lv_items_2_0,
            						"org.xtext.example.mydsl.MyDsl.PhotoActionsFunctions");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhotoActions"


    // $ANTLR start "entryRulePhotoActionsFunctions"
    // InternalMyDsl.g:1060:1: entryRulePhotoActionsFunctions returns [EObject current=null] : iv_rulePhotoActionsFunctions= rulePhotoActionsFunctions EOF ;
    public final EObject entryRulePhotoActionsFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhotoActionsFunctions = null;


        try {
            // InternalMyDsl.g:1060:62: (iv_rulePhotoActionsFunctions= rulePhotoActionsFunctions EOF )
            // InternalMyDsl.g:1061:2: iv_rulePhotoActionsFunctions= rulePhotoActionsFunctions EOF
            {
             newCompositeNode(grammarAccess.getPhotoActionsFunctionsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhotoActionsFunctions=rulePhotoActionsFunctions();

            state._fsp--;

             current =iv_rulePhotoActionsFunctions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhotoActionsFunctions"


    // $ANTLR start "rulePhotoActionsFunctions"
    // InternalMyDsl.g:1067:1: rulePhotoActionsFunctions returns [EObject current=null] : (otherlv_0= 'ViewAllPhotos' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ViewExtendedPhoto' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'LoadPhoto' ( (lv_name_5_0= RULE_ID ) ) ) ;
    public final EObject rulePhotoActionsFunctions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1073:2: ( (otherlv_0= 'ViewAllPhotos' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ViewExtendedPhoto' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'LoadPhoto' ( (lv_name_5_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:1074:2: (otherlv_0= 'ViewAllPhotos' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ViewExtendedPhoto' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'LoadPhoto' ( (lv_name_5_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1074:2: (otherlv_0= 'ViewAllPhotos' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ViewExtendedPhoto' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'LoadPhoto' ( (lv_name_5_0= RULE_ID ) ) )
            // InternalMyDsl.g:1075:3: otherlv_0= 'ViewAllPhotos' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ViewExtendedPhoto' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'LoadPhoto' ( (lv_name_5_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPhotoActionsFunctionsAccess().getViewAllPhotosKeyword_0());
            		
            // InternalMyDsl.g:1079:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1080:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1080:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1081:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPhotoActionsFunctionsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhotoActionsFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getPhotoActionsFunctionsAccess().getViewExtendedPhotoKeyword_2());
            		
            // InternalMyDsl.g:1101:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMyDsl.g:1102:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMyDsl.g:1102:4: (lv_name_3_0= RULE_ID )
            // InternalMyDsl.g:1103:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_name_3_0, grammarAccess.getPhotoActionsFunctionsAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhotoActionsFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getPhotoActionsFunctionsAccess().getLoadPhotoKeyword_4());
            		
            // InternalMyDsl.g:1123:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalMyDsl.g:1124:4: (lv_name_5_0= RULE_ID )
            {
            // InternalMyDsl.g:1124:4: (lv_name_5_0= RULE_ID )
            // InternalMyDsl.g:1125:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_5_0, grammarAccess.getPhotoActionsFunctionsAccess().getNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhotoActionsFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhotoActionsFunctions"


    // $ANTLR start "entryRuleLandingActions"
    // InternalMyDsl.g:1145:1: entryRuleLandingActions returns [EObject current=null] : iv_ruleLandingActions= ruleLandingActions EOF ;
    public final EObject entryRuleLandingActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLandingActions = null;


        try {
            // InternalMyDsl.g:1145:55: (iv_ruleLandingActions= ruleLandingActions EOF )
            // InternalMyDsl.g:1146:2: iv_ruleLandingActions= ruleLandingActions EOF
            {
             newCompositeNode(grammarAccess.getLandingActionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLandingActions=ruleLandingActions();

            state._fsp--;

             current =iv_ruleLandingActions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLandingActions"


    // $ANTLR start "ruleLandingActions"
    // InternalMyDsl.g:1152:1: ruleLandingActions returns [EObject current=null] : (otherlv_0= 'LandingActions' otherlv_1= ':' ( (lv_items_2_0= ruleLandingFunctions ) ) ) ;
    public final EObject ruleLandingActions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_items_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1158:2: ( (otherlv_0= 'LandingActions' otherlv_1= ':' ( (lv_items_2_0= ruleLandingFunctions ) ) ) )
            // InternalMyDsl.g:1159:2: (otherlv_0= 'LandingActions' otherlv_1= ':' ( (lv_items_2_0= ruleLandingFunctions ) ) )
            {
            // InternalMyDsl.g:1159:2: (otherlv_0= 'LandingActions' otherlv_1= ':' ( (lv_items_2_0= ruleLandingFunctions ) ) )
            // InternalMyDsl.g:1160:3: otherlv_0= 'LandingActions' otherlv_1= ':' ( (lv_items_2_0= ruleLandingFunctions ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLandingActionsAccess().getLandingActionsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getLandingActionsAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:1168:3: ( (lv_items_2_0= ruleLandingFunctions ) )
            // InternalMyDsl.g:1169:4: (lv_items_2_0= ruleLandingFunctions )
            {
            // InternalMyDsl.g:1169:4: (lv_items_2_0= ruleLandingFunctions )
            // InternalMyDsl.g:1170:5: lv_items_2_0= ruleLandingFunctions
            {

            					newCompositeNode(grammarAccess.getLandingActionsAccess().getItemsLandingFunctionsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_items_2_0=ruleLandingFunctions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLandingActionsRule());
            					}
            					add(
            						current,
            						"items",
            						lv_items_2_0,
            						"org.xtext.example.mydsl.MyDsl.LandingFunctions");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLandingActions"


    // $ANTLR start "entryRuleLandingFunctions"
    // InternalMyDsl.g:1191:1: entryRuleLandingFunctions returns [EObject current=null] : iv_ruleLandingFunctions= ruleLandingFunctions EOF ;
    public final EObject entryRuleLandingFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLandingFunctions = null;


        try {
            // InternalMyDsl.g:1191:57: (iv_ruleLandingFunctions= ruleLandingFunctions EOF )
            // InternalMyDsl.g:1192:2: iv_ruleLandingFunctions= ruleLandingFunctions EOF
            {
             newCompositeNode(grammarAccess.getLandingFunctionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLandingFunctions=ruleLandingFunctions();

            state._fsp--;

             current =iv_ruleLandingFunctions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLandingFunctions"


    // $ANTLR start "ruleLandingFunctions"
    // InternalMyDsl.g:1198:1: ruleLandingFunctions returns [EObject current=null] : (otherlv_0= 'ViewCarousel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'PassPhoto' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleLandingFunctions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1204:2: ( (otherlv_0= 'ViewCarousel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'PassPhoto' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:1205:2: (otherlv_0= 'ViewCarousel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'PassPhoto' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1205:2: (otherlv_0= 'ViewCarousel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'PassPhoto' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalMyDsl.g:1206:3: otherlv_0= 'ViewCarousel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'PassPhoto' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLandingFunctionsAccess().getViewCarouselKeyword_0());
            		
            // InternalMyDsl.g:1210:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1211:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1211:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1212:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLandingFunctionsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLandingFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getLandingFunctionsAccess().getPassPhotoKeyword_2());
            		
            // InternalMyDsl.g:1232:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMyDsl.g:1233:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMyDsl.g:1233:4: (lv_name_3_0= RULE_ID )
            // InternalMyDsl.g:1234:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getLandingFunctionsAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLandingFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLandingFunctions"


    // $ANTLR start "entryRuleDomainConnection"
    // InternalMyDsl.g:1254:1: entryRuleDomainConnection returns [EObject current=null] : iv_ruleDomainConnection= ruleDomainConnection EOF ;
    public final EObject entryRuleDomainConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainConnection = null;


        try {
            // InternalMyDsl.g:1254:57: (iv_ruleDomainConnection= ruleDomainConnection EOF )
            // InternalMyDsl.g:1255:2: iv_ruleDomainConnection= ruleDomainConnection EOF
            {
             newCompositeNode(grammarAccess.getDomainConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainConnection=ruleDomainConnection();

            state._fsp--;

             current =iv_ruleDomainConnection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainConnection"


    // $ANTLR start "ruleDomainConnection"
    // InternalMyDsl.g:1261:1: ruleDomainConnection returns [EObject current=null] : (otherlv_0= 'DomainRelations' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomainRelations ) ) otherlv_4= '}' ) ;
    public final EObject ruleDomainConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1267:2: ( (otherlv_0= 'DomainRelations' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomainRelations ) ) otherlv_4= '}' ) )
            // InternalMyDsl.g:1268:2: (otherlv_0= 'DomainRelations' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomainRelations ) ) otherlv_4= '}' )
            {
            // InternalMyDsl.g:1268:2: (otherlv_0= 'DomainRelations' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomainRelations ) ) otherlv_4= '}' )
            // InternalMyDsl.g:1269:3: otherlv_0= 'DomainRelations' otherlv_1= ':' otherlv_2= '{' ( (lv_elements_3_0= ruleDomainRelations ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainConnectionAccess().getDomainRelationsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDomainConnectionAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getDomainConnectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1281:3: ( (lv_elements_3_0= ruleDomainRelations ) )
            // InternalMyDsl.g:1282:4: (lv_elements_3_0= ruleDomainRelations )
            {
            // InternalMyDsl.g:1282:4: (lv_elements_3_0= ruleDomainRelations )
            // InternalMyDsl.g:1283:5: lv_elements_3_0= ruleDomainRelations
            {

            					newCompositeNode(grammarAccess.getDomainConnectionAccess().getElementsDomainRelationsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_elements_3_0=ruleDomainRelations();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainConnectionRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_3_0,
            						"org.xtext.example.mydsl.MyDsl.DomainRelations");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDomainConnectionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainConnection"


    // $ANTLR start "entryRuleDomainRelations"
    // InternalMyDsl.g:1308:1: entryRuleDomainRelations returns [EObject current=null] : iv_ruleDomainRelations= ruleDomainRelations EOF ;
    public final EObject entryRuleDomainRelations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainRelations = null;


        try {
            // InternalMyDsl.g:1308:56: (iv_ruleDomainRelations= ruleDomainRelations EOF )
            // InternalMyDsl.g:1309:2: iv_ruleDomainRelations= ruleDomainRelations EOF
            {
             newCompositeNode(grammarAccess.getDomainRelationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainRelations=ruleDomainRelations();

            state._fsp--;

             current =iv_ruleDomainRelations; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainRelations"


    // $ANTLR start "ruleDomainRelations"
    // InternalMyDsl.g:1315:1: ruleDomainRelations returns [EObject current=null] : ( ( (lv_elements_0_0= ruleUserDomain ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleFunctionalities ) ) otherlv_5= '}' ( (lv_elements_6_0= ruleAlbum ) ) ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ':' otherlv_9= '{' ( (lv_elements_10_0= ruleAlbumManagementFunctions ) ) otherlv_11= '}' ( (lv_elements_12_0= rulePhoto ) ) ( (lv_name_13_0= RULE_ID ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_elements_16_0= rulePhotoActionsFunctions ) ) otherlv_17= '}' ( (lv_elements_18_0= rulePhotoActions ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' otherlv_21= '{' ( (lv_elements_22_0= ruleAlbumManagement ) ) otherlv_23= '}' ) ;
    public final EObject ruleDomainRelations() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_name_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token lv_name_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_4_0 = null;

        EObject lv_elements_6_0 = null;

        EObject lv_elements_10_0 = null;

        EObject lv_elements_12_0 = null;

        EObject lv_elements_16_0 = null;

        EObject lv_elements_18_0 = null;

        EObject lv_elements_22_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1321:2: ( ( ( (lv_elements_0_0= ruleUserDomain ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleFunctionalities ) ) otherlv_5= '}' ( (lv_elements_6_0= ruleAlbum ) ) ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ':' otherlv_9= '{' ( (lv_elements_10_0= ruleAlbumManagementFunctions ) ) otherlv_11= '}' ( (lv_elements_12_0= rulePhoto ) ) ( (lv_name_13_0= RULE_ID ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_elements_16_0= rulePhotoActionsFunctions ) ) otherlv_17= '}' ( (lv_elements_18_0= rulePhotoActions ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' otherlv_21= '{' ( (lv_elements_22_0= ruleAlbumManagement ) ) otherlv_23= '}' ) )
            // InternalMyDsl.g:1322:2: ( ( (lv_elements_0_0= ruleUserDomain ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleFunctionalities ) ) otherlv_5= '}' ( (lv_elements_6_0= ruleAlbum ) ) ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ':' otherlv_9= '{' ( (lv_elements_10_0= ruleAlbumManagementFunctions ) ) otherlv_11= '}' ( (lv_elements_12_0= rulePhoto ) ) ( (lv_name_13_0= RULE_ID ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_elements_16_0= rulePhotoActionsFunctions ) ) otherlv_17= '}' ( (lv_elements_18_0= rulePhotoActions ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' otherlv_21= '{' ( (lv_elements_22_0= ruleAlbumManagement ) ) otherlv_23= '}' )
            {
            // InternalMyDsl.g:1322:2: ( ( (lv_elements_0_0= ruleUserDomain ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleFunctionalities ) ) otherlv_5= '}' ( (lv_elements_6_0= ruleAlbum ) ) ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ':' otherlv_9= '{' ( (lv_elements_10_0= ruleAlbumManagementFunctions ) ) otherlv_11= '}' ( (lv_elements_12_0= rulePhoto ) ) ( (lv_name_13_0= RULE_ID ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_elements_16_0= rulePhotoActionsFunctions ) ) otherlv_17= '}' ( (lv_elements_18_0= rulePhotoActions ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' otherlv_21= '{' ( (lv_elements_22_0= ruleAlbumManagement ) ) otherlv_23= '}' )
            // InternalMyDsl.g:1323:3: ( (lv_elements_0_0= ruleUserDomain ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleFunctionalities ) ) otherlv_5= '}' ( (lv_elements_6_0= ruleAlbum ) ) ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ':' otherlv_9= '{' ( (lv_elements_10_0= ruleAlbumManagementFunctions ) ) otherlv_11= '}' ( (lv_elements_12_0= rulePhoto ) ) ( (lv_name_13_0= RULE_ID ) ) otherlv_14= ':' otherlv_15= '{' ( (lv_elements_16_0= rulePhotoActionsFunctions ) ) otherlv_17= '}' ( (lv_elements_18_0= rulePhotoActions ) ) ( (lv_name_19_0= RULE_ID ) ) otherlv_20= ':' otherlv_21= '{' ( (lv_elements_22_0= ruleAlbumManagement ) ) otherlv_23= '}'
            {
            // InternalMyDsl.g:1323:3: ( (lv_elements_0_0= ruleUserDomain ) )
            // InternalMyDsl.g:1324:4: (lv_elements_0_0= ruleUserDomain )
            {
            // InternalMyDsl.g:1324:4: (lv_elements_0_0= ruleUserDomain )
            // InternalMyDsl.g:1325:5: lv_elements_0_0= ruleUserDomain
            {

            					newCompositeNode(grammarAccess.getDomainRelationsAccess().getElementsUserDomainParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_elements_0_0=ruleUserDomain();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRelationsRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_0_0,
            						"org.xtext.example.mydsl.MyDsl.UserDomain");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1342:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1343:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1343:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1344:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDomainRelationsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainRelationsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDomainRelationsAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getDomainRelationsAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1368:3: ( (lv_elements_4_0= ruleFunctionalities ) )
            // InternalMyDsl.g:1369:4: (lv_elements_4_0= ruleFunctionalities )
            {
            // InternalMyDsl.g:1369:4: (lv_elements_4_0= ruleFunctionalities )
            // InternalMyDsl.g:1370:5: lv_elements_4_0= ruleFunctionalities
            {

            					newCompositeNode(grammarAccess.getDomainRelationsAccess().getElementsFunctionalitiesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_elements_4_0=ruleFunctionalities();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRelationsRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_4_0,
            						"org.xtext.example.mydsl.MyDsl.Functionalities");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_34); 

            			newLeafNode(otherlv_5, grammarAccess.getDomainRelationsAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:1391:3: ( (lv_elements_6_0= ruleAlbum ) )
            // InternalMyDsl.g:1392:4: (lv_elements_6_0= ruleAlbum )
            {
            // InternalMyDsl.g:1392:4: (lv_elements_6_0= ruleAlbum )
            // InternalMyDsl.g:1393:5: lv_elements_6_0= ruleAlbum
            {

            					newCompositeNode(grammarAccess.getDomainRelationsAccess().getElementsAlbumParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_elements_6_0=ruleAlbum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRelationsRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_6_0,
            						"org.xtext.example.mydsl.MyDsl.Album");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1410:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalMyDsl.g:1411:4: (lv_name_7_0= RULE_ID )
            {
            // InternalMyDsl.g:1411:4: (lv_name_7_0= RULE_ID )
            // InternalMyDsl.g:1412:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_7_0, grammarAccess.getDomainRelationsAccess().getNameIDTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainRelationsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_8=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getDomainRelationsAccess().getColonKeyword_8());
            		
            otherlv_9=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_9, grammarAccess.getDomainRelationsAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalMyDsl.g:1436:3: ( (lv_elements_10_0= ruleAlbumManagementFunctions ) )
            // InternalMyDsl.g:1437:4: (lv_elements_10_0= ruleAlbumManagementFunctions )
            {
            // InternalMyDsl.g:1437:4: (lv_elements_10_0= ruleAlbumManagementFunctions )
            // InternalMyDsl.g:1438:5: lv_elements_10_0= ruleAlbumManagementFunctions
            {

            					newCompositeNode(grammarAccess.getDomainRelationsAccess().getElementsAlbumManagementFunctionsParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_8);
            lv_elements_10_0=ruleAlbumManagementFunctions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRelationsRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_10_0,
            						"org.xtext.example.mydsl.MyDsl.AlbumManagementFunctions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_11, grammarAccess.getDomainRelationsAccess().getRightCurlyBracketKeyword_11());
            		
            // InternalMyDsl.g:1459:3: ( (lv_elements_12_0= rulePhoto ) )
            // InternalMyDsl.g:1460:4: (lv_elements_12_0= rulePhoto )
            {
            // InternalMyDsl.g:1460:4: (lv_elements_12_0= rulePhoto )
            // InternalMyDsl.g:1461:5: lv_elements_12_0= rulePhoto
            {

            					newCompositeNode(grammarAccess.getDomainRelationsAccess().getElementsPhotoParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_9);
            lv_elements_12_0=rulePhoto();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRelationsRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_12_0,
            						"org.xtext.example.mydsl.MyDsl.Photo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1478:3: ( (lv_name_13_0= RULE_ID ) )
            // InternalMyDsl.g:1479:4: (lv_name_13_0= RULE_ID )
            {
            // InternalMyDsl.g:1479:4: (lv_name_13_0= RULE_ID )
            // InternalMyDsl.g:1480:5: lv_name_13_0= RULE_ID
            {
            lv_name_13_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_13_0, grammarAccess.getDomainRelationsAccess().getNameIDTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainRelationsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_13_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_14=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_14, grammarAccess.getDomainRelationsAccess().getColonKeyword_14());
            		
            otherlv_15=(Token)match(input,13,FOLLOW_28); 

            			newLeafNode(otherlv_15, grammarAccess.getDomainRelationsAccess().getLeftCurlyBracketKeyword_15());
            		
            // InternalMyDsl.g:1504:3: ( (lv_elements_16_0= rulePhotoActionsFunctions ) )
            // InternalMyDsl.g:1505:4: (lv_elements_16_0= rulePhotoActionsFunctions )
            {
            // InternalMyDsl.g:1505:4: (lv_elements_16_0= rulePhotoActionsFunctions )
            // InternalMyDsl.g:1506:5: lv_elements_16_0= rulePhotoActionsFunctions
            {

            					newCompositeNode(grammarAccess.getDomainRelationsAccess().getElementsPhotoActionsFunctionsParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_8);
            lv_elements_16_0=rulePhotoActionsFunctions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRelationsRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_16_0,
            						"org.xtext.example.mydsl.MyDsl.PhotoActionsFunctions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_17, grammarAccess.getDomainRelationsAccess().getRightCurlyBracketKeyword_17());
            		
            // InternalMyDsl.g:1527:3: ( (lv_elements_18_0= rulePhotoActions ) )
            // InternalMyDsl.g:1528:4: (lv_elements_18_0= rulePhotoActions )
            {
            // InternalMyDsl.g:1528:4: (lv_elements_18_0= rulePhotoActions )
            // InternalMyDsl.g:1529:5: lv_elements_18_0= rulePhotoActions
            {

            					newCompositeNode(grammarAccess.getDomainRelationsAccess().getElementsPhotoActionsParserRuleCall_18_0());
            				
            pushFollow(FOLLOW_9);
            lv_elements_18_0=rulePhotoActions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRelationsRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_18_0,
            						"org.xtext.example.mydsl.MyDsl.PhotoActions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1546:3: ( (lv_name_19_0= RULE_ID ) )
            // InternalMyDsl.g:1547:4: (lv_name_19_0= RULE_ID )
            {
            // InternalMyDsl.g:1547:4: (lv_name_19_0= RULE_ID )
            // InternalMyDsl.g:1548:5: lv_name_19_0= RULE_ID
            {
            lv_name_19_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_19_0, grammarAccess.getDomainRelationsAccess().getNameIDTerminalRuleCall_19_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainRelationsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_19_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_20=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_20, grammarAccess.getDomainRelationsAccess().getColonKeyword_20());
            		
            otherlv_21=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_21, grammarAccess.getDomainRelationsAccess().getLeftCurlyBracketKeyword_21());
            		
            // InternalMyDsl.g:1572:3: ( (lv_elements_22_0= ruleAlbumManagement ) )
            // InternalMyDsl.g:1573:4: (lv_elements_22_0= ruleAlbumManagement )
            {
            // InternalMyDsl.g:1573:4: (lv_elements_22_0= ruleAlbumManagement )
            // InternalMyDsl.g:1574:5: lv_elements_22_0= ruleAlbumManagement
            {

            					newCompositeNode(grammarAccess.getDomainRelationsAccess().getElementsAlbumManagementParserRuleCall_22_0());
            				
            pushFollow(FOLLOW_8);
            lv_elements_22_0=ruleAlbumManagement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRelationsRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_22_0,
            						"org.xtext.example.mydsl.MyDsl.AlbumManagement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_23=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getDomainRelationsAccess().getRightCurlyBracketKeyword_23());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainRelations"


    // $ANTLR start "entryRuleArchitecture"
    // InternalMyDsl.g:1599:1: entryRuleArchitecture returns [EObject current=null] : iv_ruleArchitecture= ruleArchitecture EOF ;
    public final EObject entryRuleArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitecture = null;


        try {
            // InternalMyDsl.g:1599:53: (iv_ruleArchitecture= ruleArchitecture EOF )
            // InternalMyDsl.g:1600:2: iv_ruleArchitecture= ruleArchitecture EOF
            {
             newCompositeNode(grammarAccess.getArchitectureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArchitecture=ruleArchitecture();

            state._fsp--;

             current =iv_ruleArchitecture; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArchitecture"


    // $ANTLR start "ruleArchitecture"
    // InternalMyDsl.g:1606:1: ruleArchitecture returns [EObject current=null] : (otherlv_0= 'Architecture:' otherlv_1= '{' ( (lv_elements_2_0= ruleNTiers ) )+ ( (lv_elements_3_0= ruleNTiersConnections ) )+ otherlv_4= '}' ) ;
    public final EObject ruleArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1612:2: ( (otherlv_0= 'Architecture:' otherlv_1= '{' ( (lv_elements_2_0= ruleNTiers ) )+ ( (lv_elements_3_0= ruleNTiersConnections ) )+ otherlv_4= '}' ) )
            // InternalMyDsl.g:1613:2: (otherlv_0= 'Architecture:' otherlv_1= '{' ( (lv_elements_2_0= ruleNTiers ) )+ ( (lv_elements_3_0= ruleNTiersConnections ) )+ otherlv_4= '}' )
            {
            // InternalMyDsl.g:1613:2: (otherlv_0= 'Architecture:' otherlv_1= '{' ( (lv_elements_2_0= ruleNTiers ) )+ ( (lv_elements_3_0= ruleNTiersConnections ) )+ otherlv_4= '}' )
            // InternalMyDsl.g:1614:3: otherlv_0= 'Architecture:' otherlv_1= '{' ( (lv_elements_2_0= ruleNTiers ) )+ ( (lv_elements_3_0= ruleNTiersConnections ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getArchitectureAccess().getArchitectureKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:1622:3: ( (lv_elements_2_0= ruleNTiers ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==39) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:1623:4: (lv_elements_2_0= ruleNTiers )
            	    {
            	    // InternalMyDsl.g:1623:4: (lv_elements_2_0= ruleNTiers )
            	    // InternalMyDsl.g:1624:5: lv_elements_2_0= ruleNTiers
            	    {

            	    					newCompositeNode(grammarAccess.getArchitectureAccess().getElementsNTiersParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_36);
            	    lv_elements_2_0=ruleNTiers();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArchitectureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.NTiers");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // InternalMyDsl.g:1641:3: ( (lv_elements_3_0= ruleNTiersConnections ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==71) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:1642:4: (lv_elements_3_0= ruleNTiersConnections )
            	    {
            	    // InternalMyDsl.g:1642:4: (lv_elements_3_0= ruleNTiersConnections )
            	    // InternalMyDsl.g:1643:5: lv_elements_3_0= ruleNTiersConnections
            	    {

            	    					newCompositeNode(grammarAccess.getArchitectureAccess().getElementsNTiersConnectionsParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_elements_3_0=ruleNTiersConnections();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArchitectureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.NTiersConnections");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArchitecture"


    // $ANTLR start "entryRuleNTiers"
    // InternalMyDsl.g:1668:1: entryRuleNTiers returns [EObject current=null] : iv_ruleNTiers= ruleNTiers EOF ;
    public final EObject entryRuleNTiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNTiers = null;


        try {
            // InternalMyDsl.g:1668:47: (iv_ruleNTiers= ruleNTiers EOF )
            // InternalMyDsl.g:1669:2: iv_ruleNTiers= ruleNTiers EOF
            {
             newCompositeNode(grammarAccess.getNTiersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNTiers=ruleNTiers();

            state._fsp--;

             current =iv_ruleNTiers; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNTiers"


    // $ANTLR start "ruleNTiers"
    // InternalMyDsl.g:1675:1: ruleNTiers returns [EObject current=null] : (otherlv_0= 'Layers' ( (lv_elements_1_0= ruleLayer ) )+ otherlv_2= 'LayersRelations' ( (lv_elements_3_0= ruleLayerRelations ) )+ otherlv_4= 'ArchitectureComponents' ( (lv_elements_5_0= ruleArchitectureComponents ) )+ ) ;
    public final EObject ruleNTiers() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1681:2: ( (otherlv_0= 'Layers' ( (lv_elements_1_0= ruleLayer ) )+ otherlv_2= 'LayersRelations' ( (lv_elements_3_0= ruleLayerRelations ) )+ otherlv_4= 'ArchitectureComponents' ( (lv_elements_5_0= ruleArchitectureComponents ) )+ ) )
            // InternalMyDsl.g:1682:2: (otherlv_0= 'Layers' ( (lv_elements_1_0= ruleLayer ) )+ otherlv_2= 'LayersRelations' ( (lv_elements_3_0= ruleLayerRelations ) )+ otherlv_4= 'ArchitectureComponents' ( (lv_elements_5_0= ruleArchitectureComponents ) )+ )
            {
            // InternalMyDsl.g:1682:2: (otherlv_0= 'Layers' ( (lv_elements_1_0= ruleLayer ) )+ otherlv_2= 'LayersRelations' ( (lv_elements_3_0= ruleLayerRelations ) )+ otherlv_4= 'ArchitectureComponents' ( (lv_elements_5_0= ruleArchitectureComponents ) )+ )
            // InternalMyDsl.g:1683:3: otherlv_0= 'Layers' ( (lv_elements_1_0= ruleLayer ) )+ otherlv_2= 'LayersRelations' ( (lv_elements_3_0= ruleLayerRelations ) )+ otherlv_4= 'ArchitectureComponents' ( (lv_elements_5_0= ruleArchitectureComponents ) )+
            {
            otherlv_0=(Token)match(input,39,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getNTiersAccess().getLayersKeyword_0());
            		
            // InternalMyDsl.g:1687:3: ( (lv_elements_1_0= ruleLayer ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==42) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:1688:4: (lv_elements_1_0= ruleLayer )
            	    {
            	    // InternalMyDsl.g:1688:4: (lv_elements_1_0= ruleLayer )
            	    // InternalMyDsl.g:1689:5: lv_elements_1_0= ruleLayer
            	    {

            	    					newCompositeNode(grammarAccess.getNTiersAccess().getElementsLayerParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_39);
            	    lv_elements_1_0=ruleLayer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNTiersRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Layer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_2=(Token)match(input,40,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getNTiersAccess().getLayersRelationsKeyword_2());
            		
            // InternalMyDsl.g:1710:3: ( (lv_elements_3_0= ruleLayerRelations ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=62 && LA7_0<=63)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:1711:4: (lv_elements_3_0= ruleLayerRelations )
            	    {
            	    // InternalMyDsl.g:1711:4: (lv_elements_3_0= ruleLayerRelations )
            	    // InternalMyDsl.g:1712:5: lv_elements_3_0= ruleLayerRelations
            	    {

            	    					newCompositeNode(grammarAccess.getNTiersAccess().getElementsLayerRelationsParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_41);
            	    lv_elements_3_0=ruleLayerRelations();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNTiersRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.LayerRelations");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_4=(Token)match(input,41,FOLLOW_42); 

            			newLeafNode(otherlv_4, grammarAccess.getNTiersAccess().getArchitectureComponentsKeyword_4());
            		
            // InternalMyDsl.g:1733:3: ( (lv_elements_5_0= ruleArchitectureComponents ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==67) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1734:4: (lv_elements_5_0= ruleArchitectureComponents )
            	    {
            	    // InternalMyDsl.g:1734:4: (lv_elements_5_0= ruleArchitectureComponents )
            	    // InternalMyDsl.g:1735:5: lv_elements_5_0= ruleArchitectureComponents
            	    {

            	    					newCompositeNode(grammarAccess.getNTiersAccess().getElementsArchitectureComponentsParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_43);
            	    lv_elements_5_0=ruleArchitectureComponents();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNTiersRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_5_0,
            	    						"org.xtext.example.mydsl.MyDsl.ArchitectureComponents");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNTiers"


    // $ANTLR start "entryRuleLayer"
    // InternalMyDsl.g:1756:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // InternalMyDsl.g:1756:46: (iv_ruleLayer= ruleLayer EOF )
            // InternalMyDsl.g:1757:2: iv_ruleLayer= ruleLayer EOF
            {
             newCompositeNode(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayer=ruleLayer();

            state._fsp--;

             current =iv_ruleLayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalMyDsl.g:1763:1: ruleLayer returns [EObject current=null] : ( ( (lv_elements_0_0= rulePresentationLayer ) ) ( (lv_elements_1_0= ruleBusinessLogicLayer ) ) ( (lv_elements_2_0= ruleDataPersistenceLayer ) ) ) ;
    public final EObject ruleLayer() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;

        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1769:2: ( ( ( (lv_elements_0_0= rulePresentationLayer ) ) ( (lv_elements_1_0= ruleBusinessLogicLayer ) ) ( (lv_elements_2_0= ruleDataPersistenceLayer ) ) ) )
            // InternalMyDsl.g:1770:2: ( ( (lv_elements_0_0= rulePresentationLayer ) ) ( (lv_elements_1_0= ruleBusinessLogicLayer ) ) ( (lv_elements_2_0= ruleDataPersistenceLayer ) ) )
            {
            // InternalMyDsl.g:1770:2: ( ( (lv_elements_0_0= rulePresentationLayer ) ) ( (lv_elements_1_0= ruleBusinessLogicLayer ) ) ( (lv_elements_2_0= ruleDataPersistenceLayer ) ) )
            // InternalMyDsl.g:1771:3: ( (lv_elements_0_0= rulePresentationLayer ) ) ( (lv_elements_1_0= ruleBusinessLogicLayer ) ) ( (lv_elements_2_0= ruleDataPersistenceLayer ) )
            {
            // InternalMyDsl.g:1771:3: ( (lv_elements_0_0= rulePresentationLayer ) )
            // InternalMyDsl.g:1772:4: (lv_elements_0_0= rulePresentationLayer )
            {
            // InternalMyDsl.g:1772:4: (lv_elements_0_0= rulePresentationLayer )
            // InternalMyDsl.g:1773:5: lv_elements_0_0= rulePresentationLayer
            {

            					newCompositeNode(grammarAccess.getLayerAccess().getElementsPresentationLayerParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_44);
            lv_elements_0_0=rulePresentationLayer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLayerRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_0_0,
            						"org.xtext.example.mydsl.MyDsl.PresentationLayer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1790:3: ( (lv_elements_1_0= ruleBusinessLogicLayer ) )
            // InternalMyDsl.g:1791:4: (lv_elements_1_0= ruleBusinessLogicLayer )
            {
            // InternalMyDsl.g:1791:4: (lv_elements_1_0= ruleBusinessLogicLayer )
            // InternalMyDsl.g:1792:5: lv_elements_1_0= ruleBusinessLogicLayer
            {

            					newCompositeNode(grammarAccess.getLayerAccess().getElementsBusinessLogicLayerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_45);
            lv_elements_1_0=ruleBusinessLogicLayer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLayerRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"org.xtext.example.mydsl.MyDsl.BusinessLogicLayer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1809:3: ( (lv_elements_2_0= ruleDataPersistenceLayer ) )
            // InternalMyDsl.g:1810:4: (lv_elements_2_0= ruleDataPersistenceLayer )
            {
            // InternalMyDsl.g:1810:4: (lv_elements_2_0= ruleDataPersistenceLayer )
            // InternalMyDsl.g:1811:5: lv_elements_2_0= ruleDataPersistenceLayer
            {

            					newCompositeNode(grammarAccess.getLayerAccess().getElementsDataPersistenceLayerParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_2_0=ruleDataPersistenceLayer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLayerRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_2_0,
            						"org.xtext.example.mydsl.MyDsl.DataPersistenceLayer");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRulePresentationLayer"
    // InternalMyDsl.g:1832:1: entryRulePresentationLayer returns [EObject current=null] : iv_rulePresentationLayer= rulePresentationLayer EOF ;
    public final EObject entryRulePresentationLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentationLayer = null;


        try {
            // InternalMyDsl.g:1832:58: (iv_rulePresentationLayer= rulePresentationLayer EOF )
            // InternalMyDsl.g:1833:2: iv_rulePresentationLayer= rulePresentationLayer EOF
            {
             newCompositeNode(grammarAccess.getPresentationLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePresentationLayer=rulePresentationLayer();

            state._fsp--;

             current =iv_rulePresentationLayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePresentationLayer"


    // $ANTLR start "rulePresentationLayer"
    // InternalMyDsl.g:1839:1: rulePresentationLayer returns [EObject current=null] : (otherlv_0= 'PresentationLayer' ( (lv_elements_1_0= rulePresentationContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) ) ) ;
    public final EObject rulePresentationLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1845:2: ( (otherlv_0= 'PresentationLayer' ( (lv_elements_1_0= rulePresentationContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) ) ) )
            // InternalMyDsl.g:1846:2: (otherlv_0= 'PresentationLayer' ( (lv_elements_1_0= rulePresentationContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) ) )
            {
            // InternalMyDsl.g:1846:2: (otherlv_0= 'PresentationLayer' ( (lv_elements_1_0= rulePresentationContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) ) )
            // InternalMyDsl.g:1847:3: otherlv_0= 'PresentationLayer' ( (lv_elements_1_0= rulePresentationContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getPresentationLayerAccess().getPresentationLayerKeyword_0());
            		
            // InternalMyDsl.g:1851:3: ( (lv_elements_1_0= rulePresentationContent ) )
            // InternalMyDsl.g:1852:4: (lv_elements_1_0= rulePresentationContent )
            {
            // InternalMyDsl.g:1852:4: (lv_elements_1_0= rulePresentationContent )
            // InternalMyDsl.g:1853:5: lv_elements_1_0= rulePresentationContent
            {

            					newCompositeNode(grammarAccess.getPresentationLayerAccess().getElementsPresentationContentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_47);
            lv_elements_1_0=rulePresentationContent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPresentationLayerRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"org.xtext.example.mydsl.MyDsl.PresentationContent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1870:3: ( (lv_elements_2_0= ruleSegmentStructure ) )
            // InternalMyDsl.g:1871:4: (lv_elements_2_0= ruleSegmentStructure )
            {
            // InternalMyDsl.g:1871:4: (lv_elements_2_0= ruleSegmentStructure )
            // InternalMyDsl.g:1872:5: lv_elements_2_0= ruleSegmentStructure
            {

            					newCompositeNode(grammarAccess.getPresentationLayerAccess().getElementsSegmentStructureParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_2_0=ruleSegmentStructure();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPresentationLayerRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_2_0,
            						"org.xtext.example.mydsl.MyDsl.SegmentStructure");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePresentationLayer"


    // $ANTLR start "entryRulePresentationContent"
    // InternalMyDsl.g:1893:1: entryRulePresentationContent returns [EObject current=null] : iv_rulePresentationContent= rulePresentationContent EOF ;
    public final EObject entryRulePresentationContent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentationContent = null;


        try {
            // InternalMyDsl.g:1893:60: (iv_rulePresentationContent= rulePresentationContent EOF )
            // InternalMyDsl.g:1894:2: iv_rulePresentationContent= rulePresentationContent EOF
            {
             newCompositeNode(grammarAccess.getPresentationContentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePresentationContent=rulePresentationContent();

            state._fsp--;

             current =iv_rulePresentationContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePresentationContent"


    // $ANTLR start "rulePresentationContent"
    // InternalMyDsl.g:1900:1: rulePresentationContent returns [EObject current=null] : (otherlv_0= 'PresentationSegments' ( (lv_elements_1_0= rulePresentationSegments ) ) ) ;
    public final EObject rulePresentationContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1906:2: ( (otherlv_0= 'PresentationSegments' ( (lv_elements_1_0= rulePresentationSegments ) ) ) )
            // InternalMyDsl.g:1907:2: (otherlv_0= 'PresentationSegments' ( (lv_elements_1_0= rulePresentationSegments ) ) )
            {
            // InternalMyDsl.g:1907:2: (otherlv_0= 'PresentationSegments' ( (lv_elements_1_0= rulePresentationSegments ) ) )
            // InternalMyDsl.g:1908:3: otherlv_0= 'PresentationSegments' ( (lv_elements_1_0= rulePresentationSegments ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_48); 

            			newLeafNode(otherlv_0, grammarAccess.getPresentationContentAccess().getPresentationSegmentsKeyword_0());
            		
            // InternalMyDsl.g:1912:3: ( (lv_elements_1_0= rulePresentationSegments ) )
            // InternalMyDsl.g:1913:4: (lv_elements_1_0= rulePresentationSegments )
            {
            // InternalMyDsl.g:1913:4: (lv_elements_1_0= rulePresentationSegments )
            // InternalMyDsl.g:1914:5: lv_elements_1_0= rulePresentationSegments
            {

            					newCompositeNode(grammarAccess.getPresentationContentAccess().getElementsPresentationSegmentsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_1_0=rulePresentationSegments();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPresentationContentRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"org.xtext.example.mydsl.MyDsl.PresentationSegments");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePresentationContent"


    // $ANTLR start "entryRulePresentationSegments"
    // InternalMyDsl.g:1935:1: entryRulePresentationSegments returns [EObject current=null] : iv_rulePresentationSegments= rulePresentationSegments EOF ;
    public final EObject entryRulePresentationSegments() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentationSegments = null;


        try {
            // InternalMyDsl.g:1935:61: (iv_rulePresentationSegments= rulePresentationSegments EOF )
            // InternalMyDsl.g:1936:2: iv_rulePresentationSegments= rulePresentationSegments EOF
            {
             newCompositeNode(grammarAccess.getPresentationSegmentsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePresentationSegments=rulePresentationSegments();

            state._fsp--;

             current =iv_rulePresentationSegments; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePresentationSegments"


    // $ANTLR start "rulePresentationSegments"
    // InternalMyDsl.g:1942:1: rulePresentationSegments returns [EObject current=null] : (otherlv_0= 'PresentationView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'PresentationComponent' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'PresentationAction' ( (lv_name_5_0= RULE_ID ) ) ) ;
    public final EObject rulePresentationSegments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1948:2: ( (otherlv_0= 'PresentationView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'PresentationComponent' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'PresentationAction' ( (lv_name_5_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:1949:2: (otherlv_0= 'PresentationView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'PresentationComponent' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'PresentationAction' ( (lv_name_5_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1949:2: (otherlv_0= 'PresentationView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'PresentationComponent' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'PresentationAction' ( (lv_name_5_0= RULE_ID ) ) )
            // InternalMyDsl.g:1950:3: otherlv_0= 'PresentationView' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'PresentationComponent' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'PresentationAction' ( (lv_name_5_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPresentationSegmentsAccess().getPresentationViewKeyword_0());
            		
            // InternalMyDsl.g:1954:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1955:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1955:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1956:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_49); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPresentationSegmentsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPresentationSegmentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,45,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getPresentationSegmentsAccess().getPresentationComponentKeyword_2());
            		
            // InternalMyDsl.g:1976:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMyDsl.g:1977:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMyDsl.g:1977:4: (lv_name_3_0= RULE_ID )
            // InternalMyDsl.g:1978:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_50); 

            					newLeafNode(lv_name_3_0, grammarAccess.getPresentationSegmentsAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPresentationSegmentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,46,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getPresentationSegmentsAccess().getPresentationActionKeyword_4());
            		
            // InternalMyDsl.g:1998:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalMyDsl.g:1999:4: (lv_name_5_0= RULE_ID )
            {
            // InternalMyDsl.g:1999:4: (lv_name_5_0= RULE_ID )
            // InternalMyDsl.g:2000:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_5_0, grammarAccess.getPresentationSegmentsAccess().getNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPresentationSegmentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePresentationSegments"


    // $ANTLR start "entryRuleBusinessLogicLayer"
    // InternalMyDsl.g:2020:1: entryRuleBusinessLogicLayer returns [EObject current=null] : iv_ruleBusinessLogicLayer= ruleBusinessLogicLayer EOF ;
    public final EObject entryRuleBusinessLogicLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessLogicLayer = null;


        try {
            // InternalMyDsl.g:2020:59: (iv_ruleBusinessLogicLayer= ruleBusinessLogicLayer EOF )
            // InternalMyDsl.g:2021:2: iv_ruleBusinessLogicLayer= ruleBusinessLogicLayer EOF
            {
             newCompositeNode(grammarAccess.getBusinessLogicLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBusinessLogicLayer=ruleBusinessLogicLayer();

            state._fsp--;

             current =iv_ruleBusinessLogicLayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBusinessLogicLayer"


    // $ANTLR start "ruleBusinessLogicLayer"
    // InternalMyDsl.g:2027:1: ruleBusinessLogicLayer returns [EObject current=null] : (otherlv_0= 'BusinessLogicLayer' ( (lv_elements_1_0= ruleBusinessLogicContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) ) ) ;
    public final EObject ruleBusinessLogicLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2033:2: ( (otherlv_0= 'BusinessLogicLayer' ( (lv_elements_1_0= ruleBusinessLogicContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) ) ) )
            // InternalMyDsl.g:2034:2: (otherlv_0= 'BusinessLogicLayer' ( (lv_elements_1_0= ruleBusinessLogicContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) ) )
            {
            // InternalMyDsl.g:2034:2: (otherlv_0= 'BusinessLogicLayer' ( (lv_elements_1_0= ruleBusinessLogicContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) ) )
            // InternalMyDsl.g:2035:3: otherlv_0= 'BusinessLogicLayer' ( (lv_elements_1_0= ruleBusinessLogicContent ) ) ( (lv_elements_2_0= ruleSegmentStructure ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_51); 

            			newLeafNode(otherlv_0, grammarAccess.getBusinessLogicLayerAccess().getBusinessLogicLayerKeyword_0());
            		
            // InternalMyDsl.g:2039:3: ( (lv_elements_1_0= ruleBusinessLogicContent ) )
            // InternalMyDsl.g:2040:4: (lv_elements_1_0= ruleBusinessLogicContent )
            {
            // InternalMyDsl.g:2040:4: (lv_elements_1_0= ruleBusinessLogicContent )
            // InternalMyDsl.g:2041:5: lv_elements_1_0= ruleBusinessLogicContent
            {

            					newCompositeNode(grammarAccess.getBusinessLogicLayerAccess().getElementsBusinessLogicContentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_47);
            lv_elements_1_0=ruleBusinessLogicContent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBusinessLogicLayerRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"org.xtext.example.mydsl.MyDsl.BusinessLogicContent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2058:3: ( (lv_elements_2_0= ruleSegmentStructure ) )
            // InternalMyDsl.g:2059:4: (lv_elements_2_0= ruleSegmentStructure )
            {
            // InternalMyDsl.g:2059:4: (lv_elements_2_0= ruleSegmentStructure )
            // InternalMyDsl.g:2060:5: lv_elements_2_0= ruleSegmentStructure
            {

            					newCompositeNode(grammarAccess.getBusinessLogicLayerAccess().getElementsSegmentStructureParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_2_0=ruleSegmentStructure();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBusinessLogicLayerRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_2_0,
            						"org.xtext.example.mydsl.MyDsl.SegmentStructure");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBusinessLogicLayer"


    // $ANTLR start "entryRuleBusinessLogicContent"
    // InternalMyDsl.g:2081:1: entryRuleBusinessLogicContent returns [EObject current=null] : iv_ruleBusinessLogicContent= ruleBusinessLogicContent EOF ;
    public final EObject entryRuleBusinessLogicContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessLogicContent = null;


        try {
            // InternalMyDsl.g:2081:61: (iv_ruleBusinessLogicContent= ruleBusinessLogicContent EOF )
            // InternalMyDsl.g:2082:2: iv_ruleBusinessLogicContent= ruleBusinessLogicContent EOF
            {
             newCompositeNode(grammarAccess.getBusinessLogicContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBusinessLogicContent=ruleBusinessLogicContent();

            state._fsp--;

             current =iv_ruleBusinessLogicContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBusinessLogicContent"


    // $ANTLR start "ruleBusinessLogicContent"
    // InternalMyDsl.g:2088:1: ruleBusinessLogicContent returns [EObject current=null] : (otherlv_0= 'BusinessLogicSegments' ( (lv_elements_1_0= ruleBusinessLogicSegments ) ) ) ;
    public final EObject ruleBusinessLogicContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2094:2: ( (otherlv_0= 'BusinessLogicSegments' ( (lv_elements_1_0= ruleBusinessLogicSegments ) ) ) )
            // InternalMyDsl.g:2095:2: (otherlv_0= 'BusinessLogicSegments' ( (lv_elements_1_0= ruleBusinessLogicSegments ) ) )
            {
            // InternalMyDsl.g:2095:2: (otherlv_0= 'BusinessLogicSegments' ( (lv_elements_1_0= ruleBusinessLogicSegments ) ) )
            // InternalMyDsl.g:2096:3: otherlv_0= 'BusinessLogicSegments' ( (lv_elements_1_0= ruleBusinessLogicSegments ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_52); 

            			newLeafNode(otherlv_0, grammarAccess.getBusinessLogicContentAccess().getBusinessLogicSegmentsKeyword_0());
            		
            // InternalMyDsl.g:2100:3: ( (lv_elements_1_0= ruleBusinessLogicSegments ) )
            // InternalMyDsl.g:2101:4: (lv_elements_1_0= ruleBusinessLogicSegments )
            {
            // InternalMyDsl.g:2101:4: (lv_elements_1_0= ruleBusinessLogicSegments )
            // InternalMyDsl.g:2102:5: lv_elements_1_0= ruleBusinessLogicSegments
            {

            					newCompositeNode(grammarAccess.getBusinessLogicContentAccess().getElementsBusinessLogicSegmentsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_1_0=ruleBusinessLogicSegments();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBusinessLogicContentRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"org.xtext.example.mydsl.MyDsl.BusinessLogicSegments");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBusinessLogicContent"


    // $ANTLR start "entryRuleBusinessLogicSegments"
    // InternalMyDsl.g:2123:1: entryRuleBusinessLogicSegments returns [EObject current=null] : iv_ruleBusinessLogicSegments= ruleBusinessLogicSegments EOF ;
    public final EObject entryRuleBusinessLogicSegments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessLogicSegments = null;


        try {
            // InternalMyDsl.g:2123:62: (iv_ruleBusinessLogicSegments= ruleBusinessLogicSegments EOF )
            // InternalMyDsl.g:2124:2: iv_ruleBusinessLogicSegments= ruleBusinessLogicSegments EOF
            {
             newCompositeNode(grammarAccess.getBusinessLogicSegmentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBusinessLogicSegments=ruleBusinessLogicSegments();

            state._fsp--;

             current =iv_ruleBusinessLogicSegments; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBusinessLogicSegments"


    // $ANTLR start "ruleBusinessLogicSegments"
    // InternalMyDsl.g:2130:1: ruleBusinessLogicSegments returns [EObject current=null] : (otherlv_0= 'ControllerSegment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ModelSegment' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'RepositorySegment' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= 'SecuritySegment' ( (lv_name_7_0= RULE_ID ) ) ) ;
    public final EObject ruleBusinessLogicSegments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2136:2: ( (otherlv_0= 'ControllerSegment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ModelSegment' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'RepositorySegment' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= 'SecuritySegment' ( (lv_name_7_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:2137:2: (otherlv_0= 'ControllerSegment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ModelSegment' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'RepositorySegment' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= 'SecuritySegment' ( (lv_name_7_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:2137:2: (otherlv_0= 'ControllerSegment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ModelSegment' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'RepositorySegment' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= 'SecuritySegment' ( (lv_name_7_0= RULE_ID ) ) )
            // InternalMyDsl.g:2138:3: otherlv_0= 'ControllerSegment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ModelSegment' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'RepositorySegment' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= 'SecuritySegment' ( (lv_name_7_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getBusinessLogicSegmentsAccess().getControllerSegmentKeyword_0());
            		
            // InternalMyDsl.g:2142:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2143:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2143:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2144:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_53); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBusinessLogicSegmentsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBusinessLogicSegmentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,50,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getBusinessLogicSegmentsAccess().getModelSegmentKeyword_2());
            		
            // InternalMyDsl.g:2164:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMyDsl.g:2165:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMyDsl.g:2165:4: (lv_name_3_0= RULE_ID )
            // InternalMyDsl.g:2166:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_54); 

            					newLeafNode(lv_name_3_0, grammarAccess.getBusinessLogicSegmentsAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBusinessLogicSegmentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,51,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getBusinessLogicSegmentsAccess().getRepositorySegmentKeyword_4());
            		
            // InternalMyDsl.g:2186:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalMyDsl.g:2187:4: (lv_name_5_0= RULE_ID )
            {
            // InternalMyDsl.g:2187:4: (lv_name_5_0= RULE_ID )
            // InternalMyDsl.g:2188:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_55); 

            					newLeafNode(lv_name_5_0, grammarAccess.getBusinessLogicSegmentsAccess().getNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBusinessLogicSegmentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,52,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getBusinessLogicSegmentsAccess().getSecuritySegmentKeyword_6());
            		
            // InternalMyDsl.g:2208:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalMyDsl.g:2209:4: (lv_name_7_0= RULE_ID )
            {
            // InternalMyDsl.g:2209:4: (lv_name_7_0= RULE_ID )
            // InternalMyDsl.g:2210:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_7_0, grammarAccess.getBusinessLogicSegmentsAccess().getNameIDTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBusinessLogicSegmentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBusinessLogicSegments"


    // $ANTLR start "entryRuleDataPersistenceLayer"
    // InternalMyDsl.g:2230:1: entryRuleDataPersistenceLayer returns [EObject current=null] : iv_ruleDataPersistenceLayer= ruleDataPersistenceLayer EOF ;
    public final EObject entryRuleDataPersistenceLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataPersistenceLayer = null;


        try {
            // InternalMyDsl.g:2230:61: (iv_ruleDataPersistenceLayer= ruleDataPersistenceLayer EOF )
            // InternalMyDsl.g:2231:2: iv_ruleDataPersistenceLayer= ruleDataPersistenceLayer EOF
            {
             newCompositeNode(grammarAccess.getDataPersistenceLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataPersistenceLayer=ruleDataPersistenceLayer();

            state._fsp--;

             current =iv_ruleDataPersistenceLayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataPersistenceLayer"


    // $ANTLR start "ruleDataPersistenceLayer"
    // InternalMyDsl.g:2237:1: ruleDataPersistenceLayer returns [EObject current=null] : (otherlv_0= 'DataPersistenceLayer' ( (lv_elements_1_0= ruleDataPersistenceContent ) ) ) ;
    public final EObject ruleDataPersistenceLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2243:2: ( (otherlv_0= 'DataPersistenceLayer' ( (lv_elements_1_0= ruleDataPersistenceContent ) ) ) )
            // InternalMyDsl.g:2244:2: (otherlv_0= 'DataPersistenceLayer' ( (lv_elements_1_0= ruleDataPersistenceContent ) ) )
            {
            // InternalMyDsl.g:2244:2: (otherlv_0= 'DataPersistenceLayer' ( (lv_elements_1_0= ruleDataPersistenceContent ) ) )
            // InternalMyDsl.g:2245:3: otherlv_0= 'DataPersistenceLayer' ( (lv_elements_1_0= ruleDataPersistenceContent ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_56); 

            			newLeafNode(otherlv_0, grammarAccess.getDataPersistenceLayerAccess().getDataPersistenceLayerKeyword_0());
            		
            // InternalMyDsl.g:2249:3: ( (lv_elements_1_0= ruleDataPersistenceContent ) )
            // InternalMyDsl.g:2250:4: (lv_elements_1_0= ruleDataPersistenceContent )
            {
            // InternalMyDsl.g:2250:4: (lv_elements_1_0= ruleDataPersistenceContent )
            // InternalMyDsl.g:2251:5: lv_elements_1_0= ruleDataPersistenceContent
            {

            					newCompositeNode(grammarAccess.getDataPersistenceLayerAccess().getElementsDataPersistenceContentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_1_0=ruleDataPersistenceContent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataPersistenceLayerRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"org.xtext.example.mydsl.MyDsl.DataPersistenceContent");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataPersistenceLayer"


    // $ANTLR start "entryRuleDataPersistenceContent"
    // InternalMyDsl.g:2272:1: entryRuleDataPersistenceContent returns [EObject current=null] : iv_ruleDataPersistenceContent= ruleDataPersistenceContent EOF ;
    public final EObject entryRuleDataPersistenceContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataPersistenceContent = null;


        try {
            // InternalMyDsl.g:2272:63: (iv_ruleDataPersistenceContent= ruleDataPersistenceContent EOF )
            // InternalMyDsl.g:2273:2: iv_ruleDataPersistenceContent= ruleDataPersistenceContent EOF
            {
             newCompositeNode(grammarAccess.getDataPersistenceContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataPersistenceContent=ruleDataPersistenceContent();

            state._fsp--;

             current =iv_ruleDataPersistenceContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataPersistenceContent"


    // $ANTLR start "ruleDataPersistenceContent"
    // InternalMyDsl.g:2279:1: ruleDataPersistenceContent returns [EObject current=null] : (otherlv_0= 'DataPersistenceSegments' ( (lv_elements_1_0= ruleDataPersistenceSegments ) ) ) ;
    public final EObject ruleDataPersistenceContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2285:2: ( (otherlv_0= 'DataPersistenceSegments' ( (lv_elements_1_0= ruleDataPersistenceSegments ) ) ) )
            // InternalMyDsl.g:2286:2: (otherlv_0= 'DataPersistenceSegments' ( (lv_elements_1_0= ruleDataPersistenceSegments ) ) )
            {
            // InternalMyDsl.g:2286:2: (otherlv_0= 'DataPersistenceSegments' ( (lv_elements_1_0= ruleDataPersistenceSegments ) ) )
            // InternalMyDsl.g:2287:3: otherlv_0= 'DataPersistenceSegments' ( (lv_elements_1_0= ruleDataPersistenceSegments ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_57); 

            			newLeafNode(otherlv_0, grammarAccess.getDataPersistenceContentAccess().getDataPersistenceSegmentsKeyword_0());
            		
            // InternalMyDsl.g:2291:3: ( (lv_elements_1_0= ruleDataPersistenceSegments ) )
            // InternalMyDsl.g:2292:4: (lv_elements_1_0= ruleDataPersistenceSegments )
            {
            // InternalMyDsl.g:2292:4: (lv_elements_1_0= ruleDataPersistenceSegments )
            // InternalMyDsl.g:2293:5: lv_elements_1_0= ruleDataPersistenceSegments
            {

            					newCompositeNode(grammarAccess.getDataPersistenceContentAccess().getElementsDataPersistenceSegmentsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_1_0=ruleDataPersistenceSegments();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataPersistenceContentRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"org.xtext.example.mydsl.MyDsl.DataPersistenceSegments");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataPersistenceContent"


    // $ANTLR start "entryRuleDataPersistenceSegments"
    // InternalMyDsl.g:2314:1: entryRuleDataPersistenceSegments returns [EObject current=null] : iv_ruleDataPersistenceSegments= ruleDataPersistenceSegments EOF ;
    public final EObject entryRuleDataPersistenceSegments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataPersistenceSegments = null;


        try {
            // InternalMyDsl.g:2314:64: (iv_ruleDataPersistenceSegments= ruleDataPersistenceSegments EOF )
            // InternalMyDsl.g:2315:2: iv_ruleDataPersistenceSegments= ruleDataPersistenceSegments EOF
            {
             newCompositeNode(grammarAccess.getDataPersistenceSegmentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataPersistenceSegments=ruleDataPersistenceSegments();

            state._fsp--;

             current =iv_ruleDataPersistenceSegments; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataPersistenceSegments"


    // $ANTLR start "ruleDataPersistenceSegments"
    // InternalMyDsl.g:2321:1: ruleDataPersistenceSegments returns [EObject current=null] : (otherlv_0= 'PostgreSLQSegment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'AmazonS3Storage' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleDataPersistenceSegments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2327:2: ( (otherlv_0= 'PostgreSLQSegment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'AmazonS3Storage' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:2328:2: (otherlv_0= 'PostgreSLQSegment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'AmazonS3Storage' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:2328:2: (otherlv_0= 'PostgreSLQSegment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'AmazonS3Storage' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalMyDsl.g:2329:3: otherlv_0= 'PostgreSLQSegment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'AmazonS3Storage' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDataPersistenceSegmentsAccess().getPostgreSLQSegmentKeyword_0());
            		
            // InternalMyDsl.g:2333:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2334:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2334:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2335:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_58); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataPersistenceSegmentsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataPersistenceSegmentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,56,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getDataPersistenceSegmentsAccess().getAmazonS3StorageKeyword_2());
            		
            // InternalMyDsl.g:2355:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMyDsl.g:2356:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMyDsl.g:2356:4: (lv_name_3_0= RULE_ID )
            // InternalMyDsl.g:2357:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getDataPersistenceSegmentsAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataPersistenceSegmentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataPersistenceSegments"


    // $ANTLR start "entryRuleSegmentStructure"
    // InternalMyDsl.g:2377:1: entryRuleSegmentStructure returns [EObject current=null] : iv_ruleSegmentStructure= ruleSegmentStructure EOF ;
    public final EObject entryRuleSegmentStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSegmentStructure = null;


        try {
            // InternalMyDsl.g:2377:57: (iv_ruleSegmentStructure= ruleSegmentStructure EOF )
            // InternalMyDsl.g:2378:2: iv_ruleSegmentStructure= ruleSegmentStructure EOF
            {
             newCompositeNode(grammarAccess.getSegmentStructureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSegmentStructure=ruleSegmentStructure();

            state._fsp--;

             current =iv_ruleSegmentStructure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSegmentStructure"


    // $ANTLR start "ruleSegmentStructure"
    // InternalMyDsl.g:2384:1: ruleSegmentStructure returns [EObject current=null] : (otherlv_0= 'SegmentStructure' ( (lv_elements_1_0= ruleSegmentStructureContent ) ) ) ;
    public final EObject ruleSegmentStructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2390:2: ( (otherlv_0= 'SegmentStructure' ( (lv_elements_1_0= ruleSegmentStructureContent ) ) ) )
            // InternalMyDsl.g:2391:2: (otherlv_0= 'SegmentStructure' ( (lv_elements_1_0= ruleSegmentStructureContent ) ) )
            {
            // InternalMyDsl.g:2391:2: (otherlv_0= 'SegmentStructure' ( (lv_elements_1_0= ruleSegmentStructureContent ) ) )
            // InternalMyDsl.g:2392:3: otherlv_0= 'SegmentStructure' ( (lv_elements_1_0= ruleSegmentStructureContent ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getSegmentStructureAccess().getSegmentStructureKeyword_0());
            		
            // InternalMyDsl.g:2396:3: ( (lv_elements_1_0= ruleSegmentStructureContent ) )
            // InternalMyDsl.g:2397:4: (lv_elements_1_0= ruleSegmentStructureContent )
            {
            // InternalMyDsl.g:2397:4: (lv_elements_1_0= ruleSegmentStructureContent )
            // InternalMyDsl.g:2398:5: lv_elements_1_0= ruleSegmentStructureContent
            {

            					newCompositeNode(grammarAccess.getSegmentStructureAccess().getElementsSegmentStructureContentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_1_0=ruleSegmentStructureContent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSegmentStructureRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"org.xtext.example.mydsl.MyDsl.SegmentStructureContent");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSegmentStructure"


    // $ANTLR start "entryRuleSegmentStructureContent"
    // InternalMyDsl.g:2419:1: entryRuleSegmentStructureContent returns [EObject current=null] : iv_ruleSegmentStructureContent= ruleSegmentStructureContent EOF ;
    public final EObject entryRuleSegmentStructureContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSegmentStructureContent = null;


        try {
            // InternalMyDsl.g:2419:64: (iv_ruleSegmentStructureContent= ruleSegmentStructureContent EOF )
            // InternalMyDsl.g:2420:2: iv_ruleSegmentStructureContent= ruleSegmentStructureContent EOF
            {
             newCompositeNode(grammarAccess.getSegmentStructureContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSegmentStructureContent=ruleSegmentStructureContent();

            state._fsp--;

             current =iv_ruleSegmentStructureContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSegmentStructureContent"


    // $ANTLR start "ruleSegmentStructureContent"
    // InternalMyDsl.g:2426:1: ruleSegmentStructureContent returns [EObject current=null] : (otherlv_0= 'Directories' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectoryContent ) )+ ) ;
    public final EObject ruleSegmentStructureContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2432:2: ( (otherlv_0= 'Directories' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectoryContent ) )+ ) )
            // InternalMyDsl.g:2433:2: (otherlv_0= 'Directories' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectoryContent ) )+ )
            {
            // InternalMyDsl.g:2433:2: (otherlv_0= 'Directories' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectoryContent ) )+ )
            // InternalMyDsl.g:2434:3: otherlv_0= 'Directories' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectoryContent ) )+
            {
            otherlv_0=(Token)match(input,58,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSegmentStructureContentAccess().getDirectoriesKeyword_0());
            		
            // InternalMyDsl.g:2438:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2439:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2439:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2440:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_60); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSegmentStructureContentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSegmentStructureContentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:2456:3: ( (lv_elements_2_0= ruleDirectoryContent ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=59 && LA9_0<=60)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:2457:4: (lv_elements_2_0= ruleDirectoryContent )
            	    {
            	    // InternalMyDsl.g:2457:4: (lv_elements_2_0= ruleDirectoryContent )
            	    // InternalMyDsl.g:2458:5: lv_elements_2_0= ruleDirectoryContent
            	    {

            	    					newCompositeNode(grammarAccess.getSegmentStructureContentAccess().getElementsDirectoryContentParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_61);
            	    lv_elements_2_0=ruleDirectoryContent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSegmentStructureContentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.DirectoryContent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSegmentStructureContent"


    // $ANTLR start "entryRuleDirectoryContent"
    // InternalMyDsl.g:2479:1: entryRuleDirectoryContent returns [EObject current=null] : iv_ruleDirectoryContent= ruleDirectoryContent EOF ;
    public final EObject entryRuleDirectoryContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectoryContent = null;


        try {
            // InternalMyDsl.g:2479:57: (iv_ruleDirectoryContent= ruleDirectoryContent EOF )
            // InternalMyDsl.g:2480:2: iv_ruleDirectoryContent= ruleDirectoryContent EOF
            {
             newCompositeNode(grammarAccess.getDirectoryContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectoryContent=ruleDirectoryContent();

            state._fsp--;

             current =iv_ruleDirectoryContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirectoryContent"


    // $ANTLR start "ruleDirectoryContent"
    // InternalMyDsl.g:2486:1: ruleDirectoryContent returns [EObject current=null] : ( (otherlv_0= 'Directory' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectories ) ) )+ | ( (lv_elements_3_0= ruleSingleFile ) )+ ) ;
    public final EObject ruleDirectoryContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2492:2: ( ( (otherlv_0= 'Directory' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectories ) ) )+ | ( (lv_elements_3_0= ruleSingleFile ) )+ ) )
            // InternalMyDsl.g:2493:2: ( (otherlv_0= 'Directory' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectories ) ) )+ | ( (lv_elements_3_0= ruleSingleFile ) )+ )
            {
            // InternalMyDsl.g:2493:2: ( (otherlv_0= 'Directory' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectories ) ) )+ | ( (lv_elements_3_0= ruleSingleFile ) )+ )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==59) ) {
                alt12=1;
            }
            else if ( (LA12_0==60) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:2494:3: (otherlv_0= 'Directory' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectories ) ) )+
                    {
                    // InternalMyDsl.g:2494:3: (otherlv_0= 'Directory' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectories ) ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==59) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMyDsl.g:2495:4: otherlv_0= 'Directory' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleDirectories ) )
                    	    {
                    	    otherlv_0=(Token)match(input,59,FOLLOW_9); 

                    	    				newLeafNode(otherlv_0, grammarAccess.getDirectoryContentAccess().getDirectoryKeyword_0_0());
                    	    			
                    	    // InternalMyDsl.g:2499:4: ( (lv_name_1_0= RULE_ID ) )
                    	    // InternalMyDsl.g:2500:5: (lv_name_1_0= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:2500:5: (lv_name_1_0= RULE_ID )
                    	    // InternalMyDsl.g:2501:6: lv_name_1_0= RULE_ID
                    	    {
                    	    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_62); 

                    	    						newLeafNode(lv_name_1_0, grammarAccess.getDirectoryContentAccess().getNameIDTerminalRuleCall_0_1_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getDirectoryContentRule());
                    	    						}
                    	    						setWithLastConsumed(
                    	    							current,
                    	    							"name",
                    	    							lv_name_1_0,
                    	    							"org.eclipse.xtext.common.Terminals.ID");
                    	    					

                    	    }


                    	    }

                    	    // InternalMyDsl.g:2517:4: ( (lv_elements_2_0= ruleDirectories ) )
                    	    // InternalMyDsl.g:2518:5: (lv_elements_2_0= ruleDirectories )
                    	    {
                    	    // InternalMyDsl.g:2518:5: (lv_elements_2_0= ruleDirectories )
                    	    // InternalMyDsl.g:2519:6: lv_elements_2_0= ruleDirectories
                    	    {

                    	    						newCompositeNode(grammarAccess.getDirectoryContentAccess().getElementsDirectoriesParserRuleCall_0_2_0());
                    	    					
                    	    pushFollow(FOLLOW_63);
                    	    lv_elements_2_0=ruleDirectories();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDirectoryContentRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"elements",
                    	    							lv_elements_2_0,
                    	    							"org.xtext.example.mydsl.MyDsl.Directories");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2538:3: ( (lv_elements_3_0= ruleSingleFile ) )+
                    {
                    // InternalMyDsl.g:2538:3: ( (lv_elements_3_0= ruleSingleFile ) )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==60) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMyDsl.g:2539:4: (lv_elements_3_0= ruleSingleFile )
                    	    {
                    	    // InternalMyDsl.g:2539:4: (lv_elements_3_0= ruleSingleFile )
                    	    // InternalMyDsl.g:2540:5: lv_elements_3_0= ruleSingleFile
                    	    {

                    	    					newCompositeNode(grammarAccess.getDirectoryContentAccess().getElementsSingleFileParserRuleCall_1_0());
                    	    				
                    	    pushFollow(FOLLOW_61);
                    	    lv_elements_3_0=ruleSingleFile();

                    	    state._fsp--;


                    	    					if (current==null) {
                    	    						current = createModelElementForParent(grammarAccess.getDirectoryContentRule());
                    	    					}
                    	    					add(
                    	    						current,
                    	    						"elements",
                    	    						lv_elements_3_0,
                    	    						"org.xtext.example.mydsl.MyDsl.SingleFile");
                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirectoryContent"


    // $ANTLR start "entryRuleDirectories"
    // InternalMyDsl.g:2561:1: entryRuleDirectories returns [EObject current=null] : iv_ruleDirectories= ruleDirectories EOF ;
    public final EObject entryRuleDirectories() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectories = null;


        try {
            // InternalMyDsl.g:2561:52: (iv_ruleDirectories= ruleDirectories EOF )
            // InternalMyDsl.g:2562:2: iv_ruleDirectories= ruleDirectories EOF
            {
             newCompositeNode(grammarAccess.getDirectoriesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectories=ruleDirectories();

            state._fsp--;

             current =iv_ruleDirectories; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirectories"


    // $ANTLR start "ruleDirectories"
    // InternalMyDsl.g:2568:1: ruleDirectories returns [EObject current=null] : ( (lv_elements_0_0= ruleMultipleFile ) )+ ;
    public final EObject ruleDirectories() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2574:2: ( ( (lv_elements_0_0= ruleMultipleFile ) )+ )
            // InternalMyDsl.g:2575:2: ( (lv_elements_0_0= ruleMultipleFile ) )+
            {
            // InternalMyDsl.g:2575:2: ( (lv_elements_0_0= ruleMultipleFile ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==61) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:2576:3: (lv_elements_0_0= ruleMultipleFile )
            	    {
            	    // InternalMyDsl.g:2576:3: (lv_elements_0_0= ruleMultipleFile )
            	    // InternalMyDsl.g:2577:4: lv_elements_0_0= ruleMultipleFile
            	    {

            	    				newCompositeNode(grammarAccess.getDirectoriesAccess().getElementsMultipleFileParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_64);
            	    lv_elements_0_0=ruleMultipleFile();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDirectoriesRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.MultipleFile");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirectories"


    // $ANTLR start "entryRuleSingleFile"
    // InternalMyDsl.g:2597:1: entryRuleSingleFile returns [EObject current=null] : iv_ruleSingleFile= ruleSingleFile EOF ;
    public final EObject entryRuleSingleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleFile = null;


        try {
            // InternalMyDsl.g:2597:51: (iv_ruleSingleFile= ruleSingleFile EOF )
            // InternalMyDsl.g:2598:2: iv_ruleSingleFile= ruleSingleFile EOF
            {
             newCompositeNode(grammarAccess.getSingleFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleFile=ruleSingleFile();

            state._fsp--;

             current =iv_ruleSingleFile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleFile"


    // $ANTLR start "ruleSingleFile"
    // InternalMyDsl.g:2604:1: ruleSingleFile returns [EObject current=null] : (otherlv_0= 'SingleFile' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSingleFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2610:2: ( (otherlv_0= 'SingleFile' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:2611:2: (otherlv_0= 'SingleFile' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:2611:2: (otherlv_0= 'SingleFile' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:2612:3: otherlv_0= 'SingleFile' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSingleFileAccess().getSingleFileKeyword_0());
            		
            // InternalMyDsl.g:2616:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2617:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2617:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2618:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSingleFileAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleFileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleFile"


    // $ANTLR start "entryRuleMultipleFile"
    // InternalMyDsl.g:2638:1: entryRuleMultipleFile returns [EObject current=null] : iv_ruleMultipleFile= ruleMultipleFile EOF ;
    public final EObject entryRuleMultipleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleFile = null;


        try {
            // InternalMyDsl.g:2638:53: (iv_ruleMultipleFile= ruleMultipleFile EOF )
            // InternalMyDsl.g:2639:2: iv_ruleMultipleFile= ruleMultipleFile EOF
            {
             newCompositeNode(grammarAccess.getMultipleFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultipleFile=ruleMultipleFile();

            state._fsp--;

             current =iv_ruleMultipleFile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultipleFile"


    // $ANTLR start "ruleMultipleFile"
    // InternalMyDsl.g:2645:1: ruleMultipleFile returns [EObject current=null] : (otherlv_0= 'CommonFile' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMultipleFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2651:2: ( (otherlv_0= 'CommonFile' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:2652:2: (otherlv_0= 'CommonFile' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:2652:2: (otherlv_0= 'CommonFile' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:2653:3: otherlv_0= 'CommonFile' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMultipleFileAccess().getCommonFileKeyword_0());
            		
            // InternalMyDsl.g:2657:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2658:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2658:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2659:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMultipleFileAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultipleFileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultipleFile"


    // $ANTLR start "entryRuleLayerRelations"
    // InternalMyDsl.g:2679:1: entryRuleLayerRelations returns [EObject current=null] : iv_ruleLayerRelations= ruleLayerRelations EOF ;
    public final EObject entryRuleLayerRelations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayerRelations = null;


        try {
            // InternalMyDsl.g:2679:55: (iv_ruleLayerRelations= ruleLayerRelations EOF )
            // InternalMyDsl.g:2680:2: iv_ruleLayerRelations= ruleLayerRelations EOF
            {
             newCompositeNode(grammarAccess.getLayerRelationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayerRelations=ruleLayerRelations();

            state._fsp--;

             current =iv_ruleLayerRelations; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayerRelations"


    // $ANTLR start "ruleLayerRelations"
    // InternalMyDsl.g:2686:1: ruleLayerRelations returns [EObject current=null] : ( ( (lv_layerelations_0_0= ruleRelationType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_layerorigin_2_0= ruleLayerSource ) ) ( (lv_layertarget_3_0= ruleLayerTarget ) ) )+ ;
    public final EObject ruleLayerRelations() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_layerelations_0_0 = null;

        EObject lv_layerorigin_2_0 = null;

        EObject lv_layertarget_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2692:2: ( ( ( (lv_layerelations_0_0= ruleRelationType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_layerorigin_2_0= ruleLayerSource ) ) ( (lv_layertarget_3_0= ruleLayerTarget ) ) )+ )
            // InternalMyDsl.g:2693:2: ( ( (lv_layerelations_0_0= ruleRelationType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_layerorigin_2_0= ruleLayerSource ) ) ( (lv_layertarget_3_0= ruleLayerTarget ) ) )+
            {
            // InternalMyDsl.g:2693:2: ( ( (lv_layerelations_0_0= ruleRelationType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_layerorigin_2_0= ruleLayerSource ) ) ( (lv_layertarget_3_0= ruleLayerTarget ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==62) ) {
                    alt14=1;
                }
                else if ( (LA14_0==63) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:2694:3: ( (lv_layerelations_0_0= ruleRelationType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_layerorigin_2_0= ruleLayerSource ) ) ( (lv_layertarget_3_0= ruleLayerTarget ) )
            	    {
            	    // InternalMyDsl.g:2694:3: ( (lv_layerelations_0_0= ruleRelationType ) )
            	    // InternalMyDsl.g:2695:4: (lv_layerelations_0_0= ruleRelationType )
            	    {
            	    // InternalMyDsl.g:2695:4: (lv_layerelations_0_0= ruleRelationType )
            	    // InternalMyDsl.g:2696:5: lv_layerelations_0_0= ruleRelationType
            	    {

            	    					newCompositeNode(grammarAccess.getLayerRelationsAccess().getLayerelationsRelationTypeParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_layerelations_0_0=ruleRelationType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLayerRelationsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"layerelations",
            	    						lv_layerelations_0_0,
            	    						"org.xtext.example.mydsl.MyDsl.RelationType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }

            	    // InternalMyDsl.g:2713:3: ( (lv_name_1_0= RULE_ID ) )
            	    // InternalMyDsl.g:2714:4: (lv_name_1_0= RULE_ID )
            	    {
            	    // InternalMyDsl.g:2714:4: (lv_name_1_0= RULE_ID )
            	    // InternalMyDsl.g:2715:5: lv_name_1_0= RULE_ID
            	    {
            	    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_65); 

            	    					newLeafNode(lv_name_1_0, grammarAccess.getLayerRelationsAccess().getNameIDTerminalRuleCall_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLayerRelationsRule());
            	    					}
            	    					setWithLastConsumed(
            	    						current,
            	    						"name",
            	    						lv_name_1_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


            	    }

            	    // InternalMyDsl.g:2731:3: ( (lv_layerorigin_2_0= ruleLayerSource ) )
            	    // InternalMyDsl.g:2732:4: (lv_layerorigin_2_0= ruleLayerSource )
            	    {
            	    // InternalMyDsl.g:2732:4: (lv_layerorigin_2_0= ruleLayerSource )
            	    // InternalMyDsl.g:2733:5: lv_layerorigin_2_0= ruleLayerSource
            	    {

            	    					newCompositeNode(grammarAccess.getLayerRelationsAccess().getLayeroriginLayerSourceParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_66);
            	    lv_layerorigin_2_0=ruleLayerSource();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLayerRelationsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"layerorigin",
            	    						lv_layerorigin_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.LayerSource");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }

            	    // InternalMyDsl.g:2750:3: ( (lv_layertarget_3_0= ruleLayerTarget ) )
            	    // InternalMyDsl.g:2751:4: (lv_layertarget_3_0= ruleLayerTarget )
            	    {
            	    // InternalMyDsl.g:2751:4: (lv_layertarget_3_0= ruleLayerTarget )
            	    // InternalMyDsl.g:2752:5: lv_layertarget_3_0= ruleLayerTarget
            	    {

            	    					newCompositeNode(grammarAccess.getLayerRelationsAccess().getLayertargetLayerTargetParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_67);
            	    lv_layertarget_3_0=ruleLayerTarget();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLayerRelationsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"layertarget",
            	    						lv_layertarget_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.LayerTarget");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayerRelations"


    // $ANTLR start "entryRuleRelationType"
    // InternalMyDsl.g:2773:1: entryRuleRelationType returns [String current=null] : iv_ruleRelationType= ruleRelationType EOF ;
    public final String entryRuleRelationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationType = null;


        try {
            // InternalMyDsl.g:2773:52: (iv_ruleRelationType= ruleRelationType EOF )
            // InternalMyDsl.g:2774:2: iv_ruleRelationType= ruleRelationType EOF
            {
             newCompositeNode(grammarAccess.getRelationTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationType=ruleRelationType();

            state._fsp--;

             current =iv_ruleRelationType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationType"


    // $ANTLR start "ruleRelationType"
    // InternalMyDsl.g:2780:1: ruleRelationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AllowedToUse' | kw= 'AllowToUseBelow' ) ;
    public final AntlrDatatypeRuleToken ruleRelationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2786:2: ( (kw= 'AllowedToUse' | kw= 'AllowToUseBelow' ) )
            // InternalMyDsl.g:2787:2: (kw= 'AllowedToUse' | kw= 'AllowToUseBelow' )
            {
            // InternalMyDsl.g:2787:2: (kw= 'AllowedToUse' | kw= 'AllowToUseBelow' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==62) ) {
                alt15=1;
            }
            else if ( (LA15_0==63) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:2788:3: kw= 'AllowedToUse'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationTypeAccess().getAllowedToUseKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2794:3: kw= 'AllowToUseBelow'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationTypeAccess().getAllowToUseBelowKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationType"


    // $ANTLR start "entryRuleLayerSource"
    // InternalMyDsl.g:2803:1: entryRuleLayerSource returns [EObject current=null] : iv_ruleLayerSource= ruleLayerSource EOF ;
    public final EObject entryRuleLayerSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayerSource = null;


        try {
            // InternalMyDsl.g:2803:52: (iv_ruleLayerSource= ruleLayerSource EOF )
            // InternalMyDsl.g:2804:2: iv_ruleLayerSource= ruleLayerSource EOF
            {
             newCompositeNode(grammarAccess.getLayerSourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayerSource=ruleLayerSource();

            state._fsp--;

             current =iv_ruleLayerSource; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayerSource"


    // $ANTLR start "ruleLayerSource"
    // InternalMyDsl.g:2810:1: ruleLayerSource returns [EObject current=null] : (otherlv_0= 'source' ( (lv_layerelations_1_0= ruleLayerRelationName ) ) ) ;
    public final EObject ruleLayerSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_layerelations_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2816:2: ( (otherlv_0= 'source' ( (lv_layerelations_1_0= ruleLayerRelationName ) ) ) )
            // InternalMyDsl.g:2817:2: (otherlv_0= 'source' ( (lv_layerelations_1_0= ruleLayerRelationName ) ) )
            {
            // InternalMyDsl.g:2817:2: (otherlv_0= 'source' ( (lv_layerelations_1_0= ruleLayerRelationName ) ) )
            // InternalMyDsl.g:2818:3: otherlv_0= 'source' ( (lv_layerelations_1_0= ruleLayerRelationName ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_68); 

            			newLeafNode(otherlv_0, grammarAccess.getLayerSourceAccess().getSourceKeyword_0());
            		
            // InternalMyDsl.g:2822:3: ( (lv_layerelations_1_0= ruleLayerRelationName ) )
            // InternalMyDsl.g:2823:4: (lv_layerelations_1_0= ruleLayerRelationName )
            {
            // InternalMyDsl.g:2823:4: (lv_layerelations_1_0= ruleLayerRelationName )
            // InternalMyDsl.g:2824:5: lv_layerelations_1_0= ruleLayerRelationName
            {

            					newCompositeNode(grammarAccess.getLayerSourceAccess().getLayerelationsLayerRelationNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_layerelations_1_0=ruleLayerRelationName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLayerSourceRule());
            					}
            					add(
            						current,
            						"layerelations",
            						lv_layerelations_1_0,
            						"org.xtext.example.mydsl.MyDsl.LayerRelationName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayerSource"


    // $ANTLR start "entryRuleLayerTarget"
    // InternalMyDsl.g:2845:1: entryRuleLayerTarget returns [EObject current=null] : iv_ruleLayerTarget= ruleLayerTarget EOF ;
    public final EObject entryRuleLayerTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayerTarget = null;


        try {
            // InternalMyDsl.g:2845:52: (iv_ruleLayerTarget= ruleLayerTarget EOF )
            // InternalMyDsl.g:2846:2: iv_ruleLayerTarget= ruleLayerTarget EOF
            {
             newCompositeNode(grammarAccess.getLayerTargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayerTarget=ruleLayerTarget();

            state._fsp--;

             current =iv_ruleLayerTarget; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayerTarget"


    // $ANTLR start "ruleLayerTarget"
    // InternalMyDsl.g:2852:1: ruleLayerTarget returns [EObject current=null] : (otherlv_0= 'target' ( (lv_layerelations_1_0= ruleLayerRelationName ) ) ) ;
    public final EObject ruleLayerTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_layerelations_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2858:2: ( (otherlv_0= 'target' ( (lv_layerelations_1_0= ruleLayerRelationName ) ) ) )
            // InternalMyDsl.g:2859:2: (otherlv_0= 'target' ( (lv_layerelations_1_0= ruleLayerRelationName ) ) )
            {
            // InternalMyDsl.g:2859:2: (otherlv_0= 'target' ( (lv_layerelations_1_0= ruleLayerRelationName ) ) )
            // InternalMyDsl.g:2860:3: otherlv_0= 'target' ( (lv_layerelations_1_0= ruleLayerRelationName ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_68); 

            			newLeafNode(otherlv_0, grammarAccess.getLayerTargetAccess().getTargetKeyword_0());
            		
            // InternalMyDsl.g:2864:3: ( (lv_layerelations_1_0= ruleLayerRelationName ) )
            // InternalMyDsl.g:2865:4: (lv_layerelations_1_0= ruleLayerRelationName )
            {
            // InternalMyDsl.g:2865:4: (lv_layerelations_1_0= ruleLayerRelationName )
            // InternalMyDsl.g:2866:5: lv_layerelations_1_0= ruleLayerRelationName
            {

            					newCompositeNode(grammarAccess.getLayerTargetAccess().getLayerelationsLayerRelationNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_layerelations_1_0=ruleLayerRelationName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLayerTargetRule());
            					}
            					add(
            						current,
            						"layerelations",
            						lv_layerelations_1_0,
            						"org.xtext.example.mydsl.MyDsl.LayerRelationName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayerTarget"


    // $ANTLR start "entryRuleLayerRelationName"
    // InternalMyDsl.g:2887:1: entryRuleLayerRelationName returns [String current=null] : iv_ruleLayerRelationName= ruleLayerRelationName EOF ;
    public final String entryRuleLayerRelationName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLayerRelationName = null;


        try {
            // InternalMyDsl.g:2887:57: (iv_ruleLayerRelationName= ruleLayerRelationName EOF )
            // InternalMyDsl.g:2888:2: iv_ruleLayerRelationName= ruleLayerRelationName EOF
            {
             newCompositeNode(grammarAccess.getLayerRelationNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayerRelationName=ruleLayerRelationName();

            state._fsp--;

             current =iv_ruleLayerRelationName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayerRelationName"


    // $ANTLR start "ruleLayerRelationName"
    // InternalMyDsl.g:2894:1: ruleLayerRelationName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'PresentationLayer' | kw= 'BusinessLogicLayer' | kw= 'PersistenceDataLayer' ) ;
    public final AntlrDatatypeRuleToken ruleLayerRelationName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2900:2: ( (kw= 'PresentationLayer' | kw= 'BusinessLogicLayer' | kw= 'PersistenceDataLayer' ) )
            // InternalMyDsl.g:2901:2: (kw= 'PresentationLayer' | kw= 'BusinessLogicLayer' | kw= 'PersistenceDataLayer' )
            {
            // InternalMyDsl.g:2901:2: (kw= 'PresentationLayer' | kw= 'BusinessLogicLayer' | kw= 'PersistenceDataLayer' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt16=1;
                }
                break;
            case 47:
                {
                alt16=2;
                }
                break;
            case 66:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:2902:3: kw= 'PresentationLayer'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLayerRelationNameAccess().getPresentationLayerKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2908:3: kw= 'BusinessLogicLayer'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLayerRelationNameAccess().getBusinessLogicLayerKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2914:3: kw= 'PersistenceDataLayer'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLayerRelationNameAccess().getPersistenceDataLayerKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayerRelationName"


    // $ANTLR start "entryRuleArchitectureComponents"
    // InternalMyDsl.g:2923:1: entryRuleArchitectureComponents returns [EObject current=null] : iv_ruleArchitectureComponents= ruleArchitectureComponents EOF ;
    public final EObject entryRuleArchitectureComponents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureComponents = null;


        try {
            // InternalMyDsl.g:2923:63: (iv_ruleArchitectureComponents= ruleArchitectureComponents EOF )
            // InternalMyDsl.g:2924:2: iv_ruleArchitectureComponents= ruleArchitectureComponents EOF
            {
             newCompositeNode(grammarAccess.getArchitectureComponentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArchitectureComponents=ruleArchitectureComponents();

            state._fsp--;

             current =iv_ruleArchitectureComponents; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArchitectureComponents"


    // $ANTLR start "ruleArchitectureComponents"
    // InternalMyDsl.g:2930:1: ruleArchitectureComponents returns [EObject current=null] : (otherlv_0= 'SystemComponents' ( (lv_archcomponent_1_0= ruleFrontEnd ) ) ( (lv_archcomponent_2_0= ruleBackEnd ) ) ( (lv_archcomponent_3_0= rulePersistenceDataComponent ) ) ) ;
    public final EObject ruleArchitectureComponents() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_archcomponent_1_0 = null;

        EObject lv_archcomponent_2_0 = null;

        EObject lv_archcomponent_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2936:2: ( (otherlv_0= 'SystemComponents' ( (lv_archcomponent_1_0= ruleFrontEnd ) ) ( (lv_archcomponent_2_0= ruleBackEnd ) ) ( (lv_archcomponent_3_0= rulePersistenceDataComponent ) ) ) )
            // InternalMyDsl.g:2937:2: (otherlv_0= 'SystemComponents' ( (lv_archcomponent_1_0= ruleFrontEnd ) ) ( (lv_archcomponent_2_0= ruleBackEnd ) ) ( (lv_archcomponent_3_0= rulePersistenceDataComponent ) ) )
            {
            // InternalMyDsl.g:2937:2: (otherlv_0= 'SystemComponents' ( (lv_archcomponent_1_0= ruleFrontEnd ) ) ( (lv_archcomponent_2_0= ruleBackEnd ) ) ( (lv_archcomponent_3_0= rulePersistenceDataComponent ) ) )
            // InternalMyDsl.g:2938:3: otherlv_0= 'SystemComponents' ( (lv_archcomponent_1_0= ruleFrontEnd ) ) ( (lv_archcomponent_2_0= ruleBackEnd ) ) ( (lv_archcomponent_3_0= rulePersistenceDataComponent ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_69); 

            			newLeafNode(otherlv_0, grammarAccess.getArchitectureComponentsAccess().getSystemComponentsKeyword_0());
            		
            // InternalMyDsl.g:2942:3: ( (lv_archcomponent_1_0= ruleFrontEnd ) )
            // InternalMyDsl.g:2943:4: (lv_archcomponent_1_0= ruleFrontEnd )
            {
            // InternalMyDsl.g:2943:4: (lv_archcomponent_1_0= ruleFrontEnd )
            // InternalMyDsl.g:2944:5: lv_archcomponent_1_0= ruleFrontEnd
            {

            					newCompositeNode(grammarAccess.getArchitectureComponentsAccess().getArchcomponentFrontEndParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_70);
            lv_archcomponent_1_0=ruleFrontEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArchitectureComponentsRule());
            					}
            					add(
            						current,
            						"archcomponent",
            						lv_archcomponent_1_0,
            						"org.xtext.example.mydsl.MyDsl.FrontEnd");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2961:3: ( (lv_archcomponent_2_0= ruleBackEnd ) )
            // InternalMyDsl.g:2962:4: (lv_archcomponent_2_0= ruleBackEnd )
            {
            // InternalMyDsl.g:2962:4: (lv_archcomponent_2_0= ruleBackEnd )
            // InternalMyDsl.g:2963:5: lv_archcomponent_2_0= ruleBackEnd
            {

            					newCompositeNode(grammarAccess.getArchitectureComponentsAccess().getArchcomponentBackEndParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_71);
            lv_archcomponent_2_0=ruleBackEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArchitectureComponentsRule());
            					}
            					add(
            						current,
            						"archcomponent",
            						lv_archcomponent_2_0,
            						"org.xtext.example.mydsl.MyDsl.BackEnd");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2980:3: ( (lv_archcomponent_3_0= rulePersistenceDataComponent ) )
            // InternalMyDsl.g:2981:4: (lv_archcomponent_3_0= rulePersistenceDataComponent )
            {
            // InternalMyDsl.g:2981:4: (lv_archcomponent_3_0= rulePersistenceDataComponent )
            // InternalMyDsl.g:2982:5: lv_archcomponent_3_0= rulePersistenceDataComponent
            {

            					newCompositeNode(grammarAccess.getArchitectureComponentsAccess().getArchcomponentPersistenceDataComponentParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_archcomponent_3_0=rulePersistenceDataComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArchitectureComponentsRule());
            					}
            					add(
            						current,
            						"archcomponent",
            						lv_archcomponent_3_0,
            						"org.xtext.example.mydsl.MyDsl.PersistenceDataComponent");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArchitectureComponents"


    // $ANTLR start "entryRuleFrontEnd"
    // InternalMyDsl.g:3003:1: entryRuleFrontEnd returns [EObject current=null] : iv_ruleFrontEnd= ruleFrontEnd EOF ;
    public final EObject entryRuleFrontEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrontEnd = null;


        try {
            // InternalMyDsl.g:3003:49: (iv_ruleFrontEnd= ruleFrontEnd EOF )
            // InternalMyDsl.g:3004:2: iv_ruleFrontEnd= ruleFrontEnd EOF
            {
             newCompositeNode(grammarAccess.getFrontEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFrontEnd=ruleFrontEnd();

            state._fsp--;

             current =iv_ruleFrontEnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFrontEnd"


    // $ANTLR start "ruleFrontEnd"
    // InternalMyDsl.g:3010:1: ruleFrontEnd returns [EObject current=null] : (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFrontEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3016:2: ( (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:3017:2: (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:3017:2: (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:3018:3: otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getFrontEndAccess().getFrontEndComponentKeyword_0());
            		
            // InternalMyDsl.g:3022:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:3023:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:3023:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:3024:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFrontEndAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFrontEndRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFrontEnd"


    // $ANTLR start "entryRuleBackEnd"
    // InternalMyDsl.g:3044:1: entryRuleBackEnd returns [EObject current=null] : iv_ruleBackEnd= ruleBackEnd EOF ;
    public final EObject entryRuleBackEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackEnd = null;


        try {
            // InternalMyDsl.g:3044:48: (iv_ruleBackEnd= ruleBackEnd EOF )
            // InternalMyDsl.g:3045:2: iv_ruleBackEnd= ruleBackEnd EOF
            {
             newCompositeNode(grammarAccess.getBackEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBackEnd=ruleBackEnd();

            state._fsp--;

             current =iv_ruleBackEnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBackEnd"


    // $ANTLR start "ruleBackEnd"
    // InternalMyDsl.g:3051:1: ruleBackEnd returns [EObject current=null] : (otherlv_0= 'BackEndComponent' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleBackEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3057:2: ( (otherlv_0= 'BackEndComponent' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:3058:2: (otherlv_0= 'BackEndComponent' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:3058:2: (otherlv_0= 'BackEndComponent' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:3059:3: otherlv_0= 'BackEndComponent' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getBackEndAccess().getBackEndComponentKeyword_0());
            		
            // InternalMyDsl.g:3063:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:3064:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:3064:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:3065:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBackEndAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBackEndRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBackEnd"


    // $ANTLR start "entryRulePersistenceDataComponent"
    // InternalMyDsl.g:3085:1: entryRulePersistenceDataComponent returns [EObject current=null] : iv_rulePersistenceDataComponent= rulePersistenceDataComponent EOF ;
    public final EObject entryRulePersistenceDataComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersistenceDataComponent = null;


        try {
            // InternalMyDsl.g:3085:65: (iv_rulePersistenceDataComponent= rulePersistenceDataComponent EOF )
            // InternalMyDsl.g:3086:2: iv_rulePersistenceDataComponent= rulePersistenceDataComponent EOF
            {
             newCompositeNode(grammarAccess.getPersistenceDataComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePersistenceDataComponent=rulePersistenceDataComponent();

            state._fsp--;

             current =iv_rulePersistenceDataComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePersistenceDataComponent"


    // $ANTLR start "rulePersistenceDataComponent"
    // InternalMyDsl.g:3092:1: rulePersistenceDataComponent returns [EObject current=null] : (otherlv_0= 'PersistenceDataComponent' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePersistenceDataComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3098:2: ( (otherlv_0= 'PersistenceDataComponent' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:3099:2: (otherlv_0= 'PersistenceDataComponent' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:3099:2: (otherlv_0= 'PersistenceDataComponent' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:3100:3: otherlv_0= 'PersistenceDataComponent' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPersistenceDataComponentAccess().getPersistenceDataComponentKeyword_0());
            		
            // InternalMyDsl.g:3104:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:3105:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:3105:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:3106:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPersistenceDataComponentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersistenceDataComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePersistenceDataComponent"


    // $ANTLR start "entryRuleNTiersConnections"
    // InternalMyDsl.g:3126:1: entryRuleNTiersConnections returns [EObject current=null] : iv_ruleNTiersConnections= ruleNTiersConnections EOF ;
    public final EObject entryRuleNTiersConnections() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNTiersConnections = null;


        try {
            // InternalMyDsl.g:3126:58: (iv_ruleNTiersConnections= ruleNTiersConnections EOF )
            // InternalMyDsl.g:3127:2: iv_ruleNTiersConnections= ruleNTiersConnections EOF
            {
             newCompositeNode(grammarAccess.getNTiersConnectionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNTiersConnections=ruleNTiersConnections();

            state._fsp--;

             current =iv_ruleNTiersConnections; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNTiersConnections"


    // $ANTLR start "ruleNTiersConnections"
    // InternalMyDsl.g:3133:1: ruleNTiersConnections returns [EObject current=null] : (otherlv_0= 'Connectors' ( ( (lv_ntierconnection_1_0= ruleConnectionType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_ntierorigin_3_0= ruleNTierSource ) ) ( (lv_ntiertarget_4_0= ruleNTierTarget ) ) )+ ) ;
    public final EObject ruleNTiersConnections() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_ntierconnection_1_0 = null;

        EObject lv_ntierorigin_3_0 = null;

        EObject lv_ntiertarget_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3139:2: ( (otherlv_0= 'Connectors' ( ( (lv_ntierconnection_1_0= ruleConnectionType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_ntierorigin_3_0= ruleNTierSource ) ) ( (lv_ntiertarget_4_0= ruleNTierTarget ) ) )+ ) )
            // InternalMyDsl.g:3140:2: (otherlv_0= 'Connectors' ( ( (lv_ntierconnection_1_0= ruleConnectionType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_ntierorigin_3_0= ruleNTierSource ) ) ( (lv_ntiertarget_4_0= ruleNTierTarget ) ) )+ )
            {
            // InternalMyDsl.g:3140:2: (otherlv_0= 'Connectors' ( ( (lv_ntierconnection_1_0= ruleConnectionType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_ntierorigin_3_0= ruleNTierSource ) ) ( (lv_ntiertarget_4_0= ruleNTierTarget ) ) )+ )
            // InternalMyDsl.g:3141:3: otherlv_0= 'Connectors' ( ( (lv_ntierconnection_1_0= ruleConnectionType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_ntierorigin_3_0= ruleNTierSource ) ) ( (lv_ntiertarget_4_0= ruleNTierTarget ) ) )+
            {
            otherlv_0=(Token)match(input,71,FOLLOW_72); 

            			newLeafNode(otherlv_0, grammarAccess.getNTiersConnectionsAccess().getConnectorsKeyword_0());
            		
            // InternalMyDsl.g:3145:3: ( ( (lv_ntierconnection_1_0= ruleConnectionType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_ntierorigin_3_0= ruleNTierSource ) ) ( (lv_ntiertarget_4_0= ruleNTierTarget ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=72 && LA17_0<=74)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:3146:4: ( (lv_ntierconnection_1_0= ruleConnectionType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_ntierorigin_3_0= ruleNTierSource ) ) ( (lv_ntiertarget_4_0= ruleNTierTarget ) )
            	    {
            	    // InternalMyDsl.g:3146:4: ( (lv_ntierconnection_1_0= ruleConnectionType ) )
            	    // InternalMyDsl.g:3147:5: (lv_ntierconnection_1_0= ruleConnectionType )
            	    {
            	    // InternalMyDsl.g:3147:5: (lv_ntierconnection_1_0= ruleConnectionType )
            	    // InternalMyDsl.g:3148:6: lv_ntierconnection_1_0= ruleConnectionType
            	    {

            	    						newCompositeNode(grammarAccess.getNTiersConnectionsAccess().getNtierconnectionConnectionTypeParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_ntierconnection_1_0=ruleConnectionType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNTiersConnectionsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ntierconnection",
            	    							lv_ntierconnection_1_0,
            	    							"org.xtext.example.mydsl.MyDsl.ConnectionType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMyDsl.g:3165:4: ( (lv_name_2_0= RULE_ID ) )
            	    // InternalMyDsl.g:3166:5: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalMyDsl.g:3166:5: (lv_name_2_0= RULE_ID )
            	    // InternalMyDsl.g:3167:6: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_65); 

            	    						newLeafNode(lv_name_2_0, grammarAccess.getNTiersConnectionsAccess().getNameIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getNTiersConnectionsRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_2_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalMyDsl.g:3183:4: ( (lv_ntierorigin_3_0= ruleNTierSource ) )
            	    // InternalMyDsl.g:3184:5: (lv_ntierorigin_3_0= ruleNTierSource )
            	    {
            	    // InternalMyDsl.g:3184:5: (lv_ntierorigin_3_0= ruleNTierSource )
            	    // InternalMyDsl.g:3185:6: lv_ntierorigin_3_0= ruleNTierSource
            	    {

            	    						newCompositeNode(grammarAccess.getNTiersConnectionsAccess().getNtieroriginNTierSourceParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_66);
            	    lv_ntierorigin_3_0=ruleNTierSource();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNTiersConnectionsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ntierorigin",
            	    							lv_ntierorigin_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.NTierSource");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMyDsl.g:3202:4: ( (lv_ntiertarget_4_0= ruleNTierTarget ) )
            	    // InternalMyDsl.g:3203:5: (lv_ntiertarget_4_0= ruleNTierTarget )
            	    {
            	    // InternalMyDsl.g:3203:5: (lv_ntiertarget_4_0= ruleNTierTarget )
            	    // InternalMyDsl.g:3204:6: lv_ntiertarget_4_0= ruleNTierTarget
            	    {

            	    						newCompositeNode(grammarAccess.getNTiersConnectionsAccess().getNtiertargetNTierTargetParserRuleCall_1_3_0());
            	    					
            	    pushFollow(FOLLOW_73);
            	    lv_ntiertarget_4_0=ruleNTierTarget();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNTiersConnectionsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ntiertarget",
            	    							lv_ntiertarget_4_0,
            	    							"org.xtext.example.mydsl.MyDsl.NTierTarget");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNTiersConnections"


    // $ANTLR start "entryRuleConnectionType"
    // InternalMyDsl.g:3226:1: entryRuleConnectionType returns [String current=null] : iv_ruleConnectionType= ruleConnectionType EOF ;
    public final String entryRuleConnectionType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConnectionType = null;


        try {
            // InternalMyDsl.g:3226:54: (iv_ruleConnectionType= ruleConnectionType EOF )
            // InternalMyDsl.g:3227:2: iv_ruleConnectionType= ruleConnectionType EOF
            {
             newCompositeNode(grammarAccess.getConnectionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectionType=ruleConnectionType();

            state._fsp--;

             current =iv_ruleConnectionType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnectionType"


    // $ANTLR start "ruleConnectionType"
    // InternalMyDsl.g:3233:1: ruleConnectionType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'REST' | kw= 'PostgreSQLConnection' | kw= 'AmazonS3API' ) ;
    public final AntlrDatatypeRuleToken ruleConnectionType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3239:2: ( (kw= 'REST' | kw= 'PostgreSQLConnection' | kw= 'AmazonS3API' ) )
            // InternalMyDsl.g:3240:2: (kw= 'REST' | kw= 'PostgreSQLConnection' | kw= 'AmazonS3API' )
            {
            // InternalMyDsl.g:3240:2: (kw= 'REST' | kw= 'PostgreSQLConnection' | kw= 'AmazonS3API' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt18=1;
                }
                break;
            case 73:
                {
                alt18=2;
                }
                break;
            case 74:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:3241:3: kw= 'REST'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConnectionTypeAccess().getRESTKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3247:3: kw= 'PostgreSQLConnection'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConnectionTypeAccess().getPostgreSQLConnectionKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3253:3: kw= 'AmazonS3API'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConnectionTypeAccess().getAmazonS3APIKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnectionType"


    // $ANTLR start "entryRuleNTierSource"
    // InternalMyDsl.g:3262:1: entryRuleNTierSource returns [EObject current=null] : iv_ruleNTierSource= ruleNTierSource EOF ;
    public final EObject entryRuleNTierSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNTierSource = null;


        try {
            // InternalMyDsl.g:3262:52: (iv_ruleNTierSource= ruleNTierSource EOF )
            // InternalMyDsl.g:3263:2: iv_ruleNTierSource= ruleNTierSource EOF
            {
             newCompositeNode(grammarAccess.getNTierSourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNTierSource=ruleNTierSource();

            state._fsp--;

             current =iv_ruleNTierSource; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNTierSource"


    // $ANTLR start "ruleNTierSource"
    // InternalMyDsl.g:3269:1: ruleNTierSource returns [EObject current=null] : (otherlv_0= 'source' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) ) ) ;
    public final EObject ruleNTierSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ntierconnection_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3275:2: ( (otherlv_0= 'source' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) ) ) )
            // InternalMyDsl.g:3276:2: (otherlv_0= 'source' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) ) )
            {
            // InternalMyDsl.g:3276:2: (otherlv_0= 'source' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) ) )
            // InternalMyDsl.g:3277:3: otherlv_0= 'source' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_74); 

            			newLeafNode(otherlv_0, grammarAccess.getNTierSourceAccess().getSourceKeyword_0());
            		
            // InternalMyDsl.g:3281:3: ( (lv_ntierconnection_1_0= ruleNTiersRelations ) )
            // InternalMyDsl.g:3282:4: (lv_ntierconnection_1_0= ruleNTiersRelations )
            {
            // InternalMyDsl.g:3282:4: (lv_ntierconnection_1_0= ruleNTiersRelations )
            // InternalMyDsl.g:3283:5: lv_ntierconnection_1_0= ruleNTiersRelations
            {

            					newCompositeNode(grammarAccess.getNTierSourceAccess().getNtierconnectionNTiersRelationsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ntierconnection_1_0=ruleNTiersRelations();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNTierSourceRule());
            					}
            					add(
            						current,
            						"ntierconnection",
            						lv_ntierconnection_1_0,
            						"org.xtext.example.mydsl.MyDsl.NTiersRelations");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNTierSource"


    // $ANTLR start "entryRuleNTierTarget"
    // InternalMyDsl.g:3304:1: entryRuleNTierTarget returns [EObject current=null] : iv_ruleNTierTarget= ruleNTierTarget EOF ;
    public final EObject entryRuleNTierTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNTierTarget = null;


        try {
            // InternalMyDsl.g:3304:52: (iv_ruleNTierTarget= ruleNTierTarget EOF )
            // InternalMyDsl.g:3305:2: iv_ruleNTierTarget= ruleNTierTarget EOF
            {
             newCompositeNode(grammarAccess.getNTierTargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNTierTarget=ruleNTierTarget();

            state._fsp--;

             current =iv_ruleNTierTarget; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNTierTarget"


    // $ANTLR start "ruleNTierTarget"
    // InternalMyDsl.g:3311:1: ruleNTierTarget returns [EObject current=null] : (otherlv_0= 'target' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) ) ) ;
    public final EObject ruleNTierTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ntierconnection_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3317:2: ( (otherlv_0= 'target' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) ) ) )
            // InternalMyDsl.g:3318:2: (otherlv_0= 'target' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) ) )
            {
            // InternalMyDsl.g:3318:2: (otherlv_0= 'target' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) ) )
            // InternalMyDsl.g:3319:3: otherlv_0= 'target' ( (lv_ntierconnection_1_0= ruleNTiersRelations ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_74); 

            			newLeafNode(otherlv_0, grammarAccess.getNTierTargetAccess().getTargetKeyword_0());
            		
            // InternalMyDsl.g:3323:3: ( (lv_ntierconnection_1_0= ruleNTiersRelations ) )
            // InternalMyDsl.g:3324:4: (lv_ntierconnection_1_0= ruleNTiersRelations )
            {
            // InternalMyDsl.g:3324:4: (lv_ntierconnection_1_0= ruleNTiersRelations )
            // InternalMyDsl.g:3325:5: lv_ntierconnection_1_0= ruleNTiersRelations
            {

            					newCompositeNode(grammarAccess.getNTierTargetAccess().getNtierconnectionNTiersRelationsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ntierconnection_1_0=ruleNTiersRelations();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNTierTargetRule());
            					}
            					add(
            						current,
            						"ntierconnection",
            						lv_ntierconnection_1_0,
            						"org.xtext.example.mydsl.MyDsl.NTiersRelations");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNTierTarget"


    // $ANTLR start "entryRuleNTiersRelations"
    // InternalMyDsl.g:3346:1: entryRuleNTiersRelations returns [EObject current=null] : iv_ruleNTiersRelations= ruleNTiersRelations EOF ;
    public final EObject entryRuleNTiersRelations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNTiersRelations = null;


        try {
            // InternalMyDsl.g:3346:56: (iv_ruleNTiersRelations= ruleNTiersRelations EOF )
            // InternalMyDsl.g:3347:2: iv_ruleNTiersRelations= ruleNTiersRelations EOF
            {
             newCompositeNode(grammarAccess.getNTiersRelationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNTiersRelations=ruleNTiersRelations();

            state._fsp--;

             current =iv_ruleNTiersRelations; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNTiersRelations"


    // $ANTLR start "ruleNTiersRelations"
    // InternalMyDsl.g:3353:1: ruleNTiersRelations returns [EObject current=null] : ( (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'BackEndComponent' ( (lv_name_3_0= RULE_ID ) ) ) | (otherlv_4= 'PersistenceDataComponent' ( (lv_name_5_0= RULE_ID ) ) ) | (otherlv_6= 'AmazonService' ( (lv_name_7_0= RULE_ID ) ) ) ) ;
    public final EObject ruleNTiersRelations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3359:2: ( ( (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'BackEndComponent' ( (lv_name_3_0= RULE_ID ) ) ) | (otherlv_4= 'PersistenceDataComponent' ( (lv_name_5_0= RULE_ID ) ) ) | (otherlv_6= 'AmazonService' ( (lv_name_7_0= RULE_ID ) ) ) ) )
            // InternalMyDsl.g:3360:2: ( (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'BackEndComponent' ( (lv_name_3_0= RULE_ID ) ) ) | (otherlv_4= 'PersistenceDataComponent' ( (lv_name_5_0= RULE_ID ) ) ) | (otherlv_6= 'AmazonService' ( (lv_name_7_0= RULE_ID ) ) ) )
            {
            // InternalMyDsl.g:3360:2: ( (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'BackEndComponent' ( (lv_name_3_0= RULE_ID ) ) ) | (otherlv_4= 'PersistenceDataComponent' ( (lv_name_5_0= RULE_ID ) ) ) | (otherlv_6= 'AmazonService' ( (lv_name_7_0= RULE_ID ) ) ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt19=1;
                }
                break;
            case 69:
                {
                alt19=2;
                }
                break;
            case 70:
                {
                alt19=3;
                }
                break;
            case 75:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:3361:3: (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // InternalMyDsl.g:3361:3: (otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) ) )
                    // InternalMyDsl.g:3362:4: otherlv_0= 'FrontEndComponent' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,68,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getNTiersRelationsAccess().getFrontEndComponentKeyword_0_0());
                    			
                    // InternalMyDsl.g:3366:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalMyDsl.g:3367:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:3367:5: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:3368:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getNTiersRelationsAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNTiersRelationsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3386:3: (otherlv_2= 'BackEndComponent' ( (lv_name_3_0= RULE_ID ) ) )
                    {
                    // InternalMyDsl.g:3386:3: (otherlv_2= 'BackEndComponent' ( (lv_name_3_0= RULE_ID ) ) )
                    // InternalMyDsl.g:3387:4: otherlv_2= 'BackEndComponent' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,69,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getNTiersRelationsAccess().getBackEndComponentKeyword_1_0());
                    			
                    // InternalMyDsl.g:3391:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalMyDsl.g:3392:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalMyDsl.g:3392:5: (lv_name_3_0= RULE_ID )
                    // InternalMyDsl.g:3393:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getNTiersRelationsAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNTiersRelationsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3411:3: (otherlv_4= 'PersistenceDataComponent' ( (lv_name_5_0= RULE_ID ) ) )
                    {
                    // InternalMyDsl.g:3411:3: (otherlv_4= 'PersistenceDataComponent' ( (lv_name_5_0= RULE_ID ) ) )
                    // InternalMyDsl.g:3412:4: otherlv_4= 'PersistenceDataComponent' ( (lv_name_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,70,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getNTiersRelationsAccess().getPersistenceDataComponentKeyword_2_0());
                    			
                    // InternalMyDsl.g:3416:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalMyDsl.g:3417:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalMyDsl.g:3417:5: (lv_name_5_0= RULE_ID )
                    // InternalMyDsl.g:3418:6: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_5_0, grammarAccess.getNTiersRelationsAccess().getNameIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNTiersRelationsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:3436:3: (otherlv_6= 'AmazonService' ( (lv_name_7_0= RULE_ID ) ) )
                    {
                    // InternalMyDsl.g:3436:3: (otherlv_6= 'AmazonService' ( (lv_name_7_0= RULE_ID ) ) )
                    // InternalMyDsl.g:3437:4: otherlv_6= 'AmazonService' ( (lv_name_7_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,75,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getNTiersRelationsAccess().getAmazonServiceKeyword_3_0());
                    			
                    // InternalMyDsl.g:3441:4: ( (lv_name_7_0= RULE_ID ) )
                    // InternalMyDsl.g:3442:5: (lv_name_7_0= RULE_ID )
                    {
                    // InternalMyDsl.g:3442:5: (lv_name_7_0= RULE_ID )
                    // InternalMyDsl.g:3443:6: lv_name_7_0= RULE_ID
                    {
                    lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_7_0, grammarAccess.getNTiersRelationsAccess().getNameIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNTiersRelationsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_7_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNTiersRelations"


    // $ANTLR start "entryRuleTechnology"
    // InternalMyDsl.g:3464:1: entryRuleTechnology returns [EObject current=null] : iv_ruleTechnology= ruleTechnology EOF ;
    public final EObject entryRuleTechnology() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTechnology = null;


        try {
            // InternalMyDsl.g:3464:51: (iv_ruleTechnology= ruleTechnology EOF )
            // InternalMyDsl.g:3465:2: iv_ruleTechnology= ruleTechnology EOF
            {
             newCompositeNode(grammarAccess.getTechnologyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTechnology=ruleTechnology();

            state._fsp--;

             current =iv_ruleTechnology; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTechnology"


    // $ANTLR start "ruleTechnology"
    // InternalMyDsl.g:3471:1: ruleTechnology returns [EObject current=null] : (otherlv_0= 'Technology' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleTechnologies ) ) otherlv_5= '}' ) ;
    public final EObject ruleTechnology() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3477:2: ( (otherlv_0= 'Technology' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleTechnologies ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:3478:2: (otherlv_0= 'Technology' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleTechnologies ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:3478:2: (otherlv_0= 'Technology' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleTechnologies ) ) otherlv_5= '}' )
            // InternalMyDsl.g:3479:3: otherlv_0= 'Technology' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleTechnologies ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTechnologyAccess().getTechnologyKeyword_0());
            		
            // InternalMyDsl.g:3483:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:3484:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:3484:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:3485:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTechnologyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTechnologyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getTechnologyAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_75); 

            			newLeafNode(otherlv_3, grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:3509:3: ( (lv_elements_4_0= ruleTechnologies ) )
            // InternalMyDsl.g:3510:4: (lv_elements_4_0= ruleTechnologies )
            {
            // InternalMyDsl.g:3510:4: (lv_elements_4_0= ruleTechnologies )
            // InternalMyDsl.g:3511:5: lv_elements_4_0= ruleTechnologies
            {

            					newCompositeNode(grammarAccess.getTechnologyAccess().getElementsTechnologiesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_elements_4_0=ruleTechnologies();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTechnologyRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_4_0,
            						"org.xtext.example.mydsl.MyDsl.Technologies");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTechnology"


    // $ANTLR start "entryRuleTechnologies"
    // InternalMyDsl.g:3536:1: entryRuleTechnologies returns [EObject current=null] : iv_ruleTechnologies= ruleTechnologies EOF ;
    public final EObject entryRuleTechnologies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTechnologies = null;


        try {
            // InternalMyDsl.g:3536:53: (iv_ruleTechnologies= ruleTechnologies EOF )
            // InternalMyDsl.g:3537:2: iv_ruleTechnologies= ruleTechnologies EOF
            {
             newCompositeNode(grammarAccess.getTechnologiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTechnologies=ruleTechnologies();

            state._fsp--;

             current =iv_ruleTechnologies; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTechnologies"


    // $ANTLR start "ruleTechnologies"
    // InternalMyDsl.g:3543:1: ruleTechnologies returns [EObject current=null] : ( ( (lv_factors_0_0= ruleSpring ) ) ( (lv_factors_1_0= ruleReact ) ) ( (lv_factors_2_0= rulePostgreSQL ) ) ( (lv_factors_3_0= ruleAmazonWebServices ) ) ) ;
    public final EObject ruleTechnologies() throws RecognitionException {
        EObject current = null;

        EObject lv_factors_0_0 = null;

        EObject lv_factors_1_0 = null;

        EObject lv_factors_2_0 = null;

        EObject lv_factors_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3549:2: ( ( ( (lv_factors_0_0= ruleSpring ) ) ( (lv_factors_1_0= ruleReact ) ) ( (lv_factors_2_0= rulePostgreSQL ) ) ( (lv_factors_3_0= ruleAmazonWebServices ) ) ) )
            // InternalMyDsl.g:3550:2: ( ( (lv_factors_0_0= ruleSpring ) ) ( (lv_factors_1_0= ruleReact ) ) ( (lv_factors_2_0= rulePostgreSQL ) ) ( (lv_factors_3_0= ruleAmazonWebServices ) ) )
            {
            // InternalMyDsl.g:3550:2: ( ( (lv_factors_0_0= ruleSpring ) ) ( (lv_factors_1_0= ruleReact ) ) ( (lv_factors_2_0= rulePostgreSQL ) ) ( (lv_factors_3_0= ruleAmazonWebServices ) ) )
            // InternalMyDsl.g:3551:3: ( (lv_factors_0_0= ruleSpring ) ) ( (lv_factors_1_0= ruleReact ) ) ( (lv_factors_2_0= rulePostgreSQL ) ) ( (lv_factors_3_0= ruleAmazonWebServices ) )
            {
            // InternalMyDsl.g:3551:3: ( (lv_factors_0_0= ruleSpring ) )
            // InternalMyDsl.g:3552:4: (lv_factors_0_0= ruleSpring )
            {
            // InternalMyDsl.g:3552:4: (lv_factors_0_0= ruleSpring )
            // InternalMyDsl.g:3553:5: lv_factors_0_0= ruleSpring
            {

            					newCompositeNode(grammarAccess.getTechnologiesAccess().getFactorsSpringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_76);
            lv_factors_0_0=ruleSpring();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTechnologiesRule());
            					}
            					add(
            						current,
            						"factors",
            						lv_factors_0_0,
            						"org.xtext.example.mydsl.MyDsl.Spring");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:3570:3: ( (lv_factors_1_0= ruleReact ) )
            // InternalMyDsl.g:3571:4: (lv_factors_1_0= ruleReact )
            {
            // InternalMyDsl.g:3571:4: (lv_factors_1_0= ruleReact )
            // InternalMyDsl.g:3572:5: lv_factors_1_0= ruleReact
            {

            					newCompositeNode(grammarAccess.getTechnologiesAccess().getFactorsReactParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_77);
            lv_factors_1_0=ruleReact();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTechnologiesRule());
            					}
            					add(
            						current,
            						"factors",
            						lv_factors_1_0,
            						"org.xtext.example.mydsl.MyDsl.React");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:3589:3: ( (lv_factors_2_0= rulePostgreSQL ) )
            // InternalMyDsl.g:3590:4: (lv_factors_2_0= rulePostgreSQL )
            {
            // InternalMyDsl.g:3590:4: (lv_factors_2_0= rulePostgreSQL )
            // InternalMyDsl.g:3591:5: lv_factors_2_0= rulePostgreSQL
            {

            					newCompositeNode(grammarAccess.getTechnologiesAccess().getFactorsPostgreSQLParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_78);
            lv_factors_2_0=rulePostgreSQL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTechnologiesRule());
            					}
            					add(
            						current,
            						"factors",
            						lv_factors_2_0,
            						"org.xtext.example.mydsl.MyDsl.PostgreSQL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:3608:3: ( (lv_factors_3_0= ruleAmazonWebServices ) )
            // InternalMyDsl.g:3609:4: (lv_factors_3_0= ruleAmazonWebServices )
            {
            // InternalMyDsl.g:3609:4: (lv_factors_3_0= ruleAmazonWebServices )
            // InternalMyDsl.g:3610:5: lv_factors_3_0= ruleAmazonWebServices
            {

            					newCompositeNode(grammarAccess.getTechnologiesAccess().getFactorsAmazonWebServicesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_factors_3_0=ruleAmazonWebServices();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTechnologiesRule());
            					}
            					add(
            						current,
            						"factors",
            						lv_factors_3_0,
            						"org.xtext.example.mydsl.MyDsl.AmazonWebServices");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTechnologies"


    // $ANTLR start "entryRuleReact"
    // InternalMyDsl.g:3631:1: entryRuleReact returns [EObject current=null] : iv_ruleReact= ruleReact EOF ;
    public final EObject entryRuleReact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReact = null;


        try {
            // InternalMyDsl.g:3631:46: (iv_ruleReact= ruleReact EOF )
            // InternalMyDsl.g:3632:2: iv_ruleReact= ruleReact EOF
            {
             newCompositeNode(grammarAccess.getReactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReact=ruleReact();

            state._fsp--;

             current =iv_ruleReact; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReact"


    // $ANTLR start "ruleReact"
    // InternalMyDsl.g:3638:1: ruleReact returns [EObject current=null] : (otherlv_0= 'React' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_reacts_4_0= ruleReactModules ) ) otherlv_5= '}' ) ;
    public final EObject ruleReact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_reacts_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3644:2: ( (otherlv_0= 'React' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_reacts_4_0= ruleReactModules ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:3645:2: (otherlv_0= 'React' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_reacts_4_0= ruleReactModules ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:3645:2: (otherlv_0= 'React' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_reacts_4_0= ruleReactModules ) ) otherlv_5= '}' )
            // InternalMyDsl.g:3646:3: otherlv_0= 'React' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_reacts_4_0= ruleReactModules ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReactAccess().getReactKeyword_0());
            		
            // InternalMyDsl.g:3650:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:3651:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:3651:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:3652:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getReactAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReactRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getReactAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_79); 

            			newLeafNode(otherlv_3, grammarAccess.getReactAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:3676:3: ( (lv_reacts_4_0= ruleReactModules ) )
            // InternalMyDsl.g:3677:4: (lv_reacts_4_0= ruleReactModules )
            {
            // InternalMyDsl.g:3677:4: (lv_reacts_4_0= ruleReactModules )
            // InternalMyDsl.g:3678:5: lv_reacts_4_0= ruleReactModules
            {

            					newCompositeNode(grammarAccess.getReactAccess().getReactsReactModulesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_reacts_4_0=ruleReactModules();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactRule());
            					}
            					add(
            						current,
            						"reacts",
            						lv_reacts_4_0,
            						"org.xtext.example.mydsl.MyDsl.ReactModules");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getReactAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReact"


    // $ANTLR start "entryRuleReactModules"
    // InternalMyDsl.g:3703:1: entryRuleReactModules returns [EObject current=null] : iv_ruleReactModules= ruleReactModules EOF ;
    public final EObject entryRuleReactModules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactModules = null;


        try {
            // InternalMyDsl.g:3703:53: (iv_ruleReactModules= ruleReactModules EOF )
            // InternalMyDsl.g:3704:2: iv_ruleReactModules= ruleReactModules EOF
            {
             newCompositeNode(grammarAccess.getReactModulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactModules=ruleReactModules();

            state._fsp--;

             current =iv_ruleReactModules; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactModules"


    // $ANTLR start "ruleReactModules"
    // InternalMyDsl.g:3710:1: ruleReactModules returns [EObject current=null] : (otherlv_0= 'ReactModules' otherlv_1= ':' otherlv_2= '{' ( (lv_reactmodules_3_0= ruleReactSubModules ) ) otherlv_4= '}' ) ;
    public final EObject ruleReactModules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reactmodules_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3716:2: ( (otherlv_0= 'ReactModules' otherlv_1= ':' otherlv_2= '{' ( (lv_reactmodules_3_0= ruleReactSubModules ) ) otherlv_4= '}' ) )
            // InternalMyDsl.g:3717:2: (otherlv_0= 'ReactModules' otherlv_1= ':' otherlv_2= '{' ( (lv_reactmodules_3_0= ruleReactSubModules ) ) otherlv_4= '}' )
            {
            // InternalMyDsl.g:3717:2: (otherlv_0= 'ReactModules' otherlv_1= ':' otherlv_2= '{' ( (lv_reactmodules_3_0= ruleReactSubModules ) ) otherlv_4= '}' )
            // InternalMyDsl.g:3718:3: otherlv_0= 'ReactModules' otherlv_1= ':' otherlv_2= '{' ( (lv_reactmodules_3_0= ruleReactSubModules ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReactModulesAccess().getReactModulesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReactModulesAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_80); 

            			newLeafNode(otherlv_2, grammarAccess.getReactModulesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:3730:3: ( (lv_reactmodules_3_0= ruleReactSubModules ) )
            // InternalMyDsl.g:3731:4: (lv_reactmodules_3_0= ruleReactSubModules )
            {
            // InternalMyDsl.g:3731:4: (lv_reactmodules_3_0= ruleReactSubModules )
            // InternalMyDsl.g:3732:5: lv_reactmodules_3_0= ruleReactSubModules
            {

            					newCompositeNode(grammarAccess.getReactModulesAccess().getReactmodulesReactSubModulesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_reactmodules_3_0=ruleReactSubModules();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactModulesRule());
            					}
            					add(
            						current,
            						"reactmodules",
            						lv_reactmodules_3_0,
            						"org.xtext.example.mydsl.MyDsl.ReactSubModules");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getReactModulesAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactModules"


    // $ANTLR start "entryRuleReactSubModules"
    // InternalMyDsl.g:3757:1: entryRuleReactSubModules returns [EObject current=null] : iv_ruleReactSubModules= ruleReactSubModules EOF ;
    public final EObject entryRuleReactSubModules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactSubModules = null;


        try {
            // InternalMyDsl.g:3757:56: (iv_ruleReactSubModules= ruleReactSubModules EOF )
            // InternalMyDsl.g:3758:2: iv_ruleReactSubModules= ruleReactSubModules EOF
            {
             newCompositeNode(grammarAccess.getReactSubModulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactSubModules=ruleReactSubModules();

            state._fsp--;

             current =iv_ruleReactSubModules; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactSubModules"


    // $ANTLR start "ruleReactSubModules"
    // InternalMyDsl.g:3764:1: ruleReactSubModules returns [EObject current=null] : ( ( (lv_reactmodules_0_0= ruleReactConfiguration ) ) ( (lv_reactmodules_1_0= ruleReactComponents ) ) ( (lv_reactmodules_2_0= ruleReactActions ) ) ( (lv_reactmodules_3_0= ruleReactLibraries ) ) ( (lv_reactmodules_4_0= ruleReactInfo ) ) ) ;
    public final EObject ruleReactSubModules() throws RecognitionException {
        EObject current = null;

        EObject lv_reactmodules_0_0 = null;

        EObject lv_reactmodules_1_0 = null;

        EObject lv_reactmodules_2_0 = null;

        EObject lv_reactmodules_3_0 = null;

        EObject lv_reactmodules_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3770:2: ( ( ( (lv_reactmodules_0_0= ruleReactConfiguration ) ) ( (lv_reactmodules_1_0= ruleReactComponents ) ) ( (lv_reactmodules_2_0= ruleReactActions ) ) ( (lv_reactmodules_3_0= ruleReactLibraries ) ) ( (lv_reactmodules_4_0= ruleReactInfo ) ) ) )
            // InternalMyDsl.g:3771:2: ( ( (lv_reactmodules_0_0= ruleReactConfiguration ) ) ( (lv_reactmodules_1_0= ruleReactComponents ) ) ( (lv_reactmodules_2_0= ruleReactActions ) ) ( (lv_reactmodules_3_0= ruleReactLibraries ) ) ( (lv_reactmodules_4_0= ruleReactInfo ) ) )
            {
            // InternalMyDsl.g:3771:2: ( ( (lv_reactmodules_0_0= ruleReactConfiguration ) ) ( (lv_reactmodules_1_0= ruleReactComponents ) ) ( (lv_reactmodules_2_0= ruleReactActions ) ) ( (lv_reactmodules_3_0= ruleReactLibraries ) ) ( (lv_reactmodules_4_0= ruleReactInfo ) ) )
            // InternalMyDsl.g:3772:3: ( (lv_reactmodules_0_0= ruleReactConfiguration ) ) ( (lv_reactmodules_1_0= ruleReactComponents ) ) ( (lv_reactmodules_2_0= ruleReactActions ) ) ( (lv_reactmodules_3_0= ruleReactLibraries ) ) ( (lv_reactmodules_4_0= ruleReactInfo ) )
            {
            // InternalMyDsl.g:3772:3: ( (lv_reactmodules_0_0= ruleReactConfiguration ) )
            // InternalMyDsl.g:3773:4: (lv_reactmodules_0_0= ruleReactConfiguration )
            {
            // InternalMyDsl.g:3773:4: (lv_reactmodules_0_0= ruleReactConfiguration )
            // InternalMyDsl.g:3774:5: lv_reactmodules_0_0= ruleReactConfiguration
            {

            					newCompositeNode(grammarAccess.getReactSubModulesAccess().getReactmodulesReactConfigurationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_81);
            lv_reactmodules_0_0=ruleReactConfiguration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactSubModulesRule());
            					}
            					add(
            						current,
            						"reactmodules",
            						lv_reactmodules_0_0,
            						"org.xtext.example.mydsl.MyDsl.ReactConfiguration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:3791:3: ( (lv_reactmodules_1_0= ruleReactComponents ) )
            // InternalMyDsl.g:3792:4: (lv_reactmodules_1_0= ruleReactComponents )
            {
            // InternalMyDsl.g:3792:4: (lv_reactmodules_1_0= ruleReactComponents )
            // InternalMyDsl.g:3793:5: lv_reactmodules_1_0= ruleReactComponents
            {

            					newCompositeNode(grammarAccess.getReactSubModulesAccess().getReactmodulesReactComponentsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_82);
            lv_reactmodules_1_0=ruleReactComponents();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactSubModulesRule());
            					}
            					add(
            						current,
            						"reactmodules",
            						lv_reactmodules_1_0,
            						"org.xtext.example.mydsl.MyDsl.ReactComponents");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:3810:3: ( (lv_reactmodules_2_0= ruleReactActions ) )
            // InternalMyDsl.g:3811:4: (lv_reactmodules_2_0= ruleReactActions )
            {
            // InternalMyDsl.g:3811:4: (lv_reactmodules_2_0= ruleReactActions )
            // InternalMyDsl.g:3812:5: lv_reactmodules_2_0= ruleReactActions
            {

            					newCompositeNode(grammarAccess.getReactSubModulesAccess().getReactmodulesReactActionsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_83);
            lv_reactmodules_2_0=ruleReactActions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactSubModulesRule());
            					}
            					add(
            						current,
            						"reactmodules",
            						lv_reactmodules_2_0,
            						"org.xtext.example.mydsl.MyDsl.ReactActions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:3829:3: ( (lv_reactmodules_3_0= ruleReactLibraries ) )
            // InternalMyDsl.g:3830:4: (lv_reactmodules_3_0= ruleReactLibraries )
            {
            // InternalMyDsl.g:3830:4: (lv_reactmodules_3_0= ruleReactLibraries )
            // InternalMyDsl.g:3831:5: lv_reactmodules_3_0= ruleReactLibraries
            {

            					newCompositeNode(grammarAccess.getReactSubModulesAccess().getReactmodulesReactLibrariesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_84);
            lv_reactmodules_3_0=ruleReactLibraries();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactSubModulesRule());
            					}
            					add(
            						current,
            						"reactmodules",
            						lv_reactmodules_3_0,
            						"org.xtext.example.mydsl.MyDsl.ReactLibraries");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:3848:3: ( (lv_reactmodules_4_0= ruleReactInfo ) )
            // InternalMyDsl.g:3849:4: (lv_reactmodules_4_0= ruleReactInfo )
            {
            // InternalMyDsl.g:3849:4: (lv_reactmodules_4_0= ruleReactInfo )
            // InternalMyDsl.g:3850:5: lv_reactmodules_4_0= ruleReactInfo
            {

            					newCompositeNode(grammarAccess.getReactSubModulesAccess().getReactmodulesReactInfoParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_reactmodules_4_0=ruleReactInfo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactSubModulesRule());
            					}
            					add(
            						current,
            						"reactmodules",
            						lv_reactmodules_4_0,
            						"org.xtext.example.mydsl.MyDsl.ReactInfo");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactSubModules"


    // $ANTLR start "entryRuleReactConfiguration"
    // InternalMyDsl.g:3871:1: entryRuleReactConfiguration returns [EObject current=null] : iv_ruleReactConfiguration= ruleReactConfiguration EOF ;
    public final EObject entryRuleReactConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactConfiguration = null;


        try {
            // InternalMyDsl.g:3871:59: (iv_ruleReactConfiguration= ruleReactConfiguration EOF )
            // InternalMyDsl.g:3872:2: iv_ruleReactConfiguration= ruleReactConfiguration EOF
            {
             newCompositeNode(grammarAccess.getReactConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactConfiguration=ruleReactConfiguration();

            state._fsp--;

             current =iv_ruleReactConfiguration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactConfiguration"


    // $ANTLR start "ruleReactConfiguration"
    // InternalMyDsl.g:3878:1: ruleReactConfiguration returns [EObject current=null] : (otherlv_0= 'ReactConfiguration' otherlv_1= ':' otherlv_2= '{' ( (lv_dependencies_3_0= ruleReactDependencies ) ) ( (lv_configurations_4_0= ruleReactConfigurations ) ) otherlv_5= '}' ) ;
    public final EObject ruleReactConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_dependencies_3_0 = null;

        EObject lv_configurations_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3884:2: ( (otherlv_0= 'ReactConfiguration' otherlv_1= ':' otherlv_2= '{' ( (lv_dependencies_3_0= ruleReactDependencies ) ) ( (lv_configurations_4_0= ruleReactConfigurations ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:3885:2: (otherlv_0= 'ReactConfiguration' otherlv_1= ':' otherlv_2= '{' ( (lv_dependencies_3_0= ruleReactDependencies ) ) ( (lv_configurations_4_0= ruleReactConfigurations ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:3885:2: (otherlv_0= 'ReactConfiguration' otherlv_1= ':' otherlv_2= '{' ( (lv_dependencies_3_0= ruleReactDependencies ) ) ( (lv_configurations_4_0= ruleReactConfigurations ) ) otherlv_5= '}' )
            // InternalMyDsl.g:3886:3: otherlv_0= 'ReactConfiguration' otherlv_1= ':' otherlv_2= '{' ( (lv_dependencies_3_0= ruleReactDependencies ) ) ( (lv_configurations_4_0= ruleReactConfigurations ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReactConfigurationAccess().getReactConfigurationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReactConfigurationAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_85); 

            			newLeafNode(otherlv_2, grammarAccess.getReactConfigurationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:3898:3: ( (lv_dependencies_3_0= ruleReactDependencies ) )
            // InternalMyDsl.g:3899:4: (lv_dependencies_3_0= ruleReactDependencies )
            {
            // InternalMyDsl.g:3899:4: (lv_dependencies_3_0= ruleReactDependencies )
            // InternalMyDsl.g:3900:5: lv_dependencies_3_0= ruleReactDependencies
            {

            					newCompositeNode(grammarAccess.getReactConfigurationAccess().getDependenciesReactDependenciesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_86);
            lv_dependencies_3_0=ruleReactDependencies();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactConfigurationRule());
            					}
            					add(
            						current,
            						"dependencies",
            						lv_dependencies_3_0,
            						"org.xtext.example.mydsl.MyDsl.ReactDependencies");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:3917:3: ( (lv_configurations_4_0= ruleReactConfigurations ) )
            // InternalMyDsl.g:3918:4: (lv_configurations_4_0= ruleReactConfigurations )
            {
            // InternalMyDsl.g:3918:4: (lv_configurations_4_0= ruleReactConfigurations )
            // InternalMyDsl.g:3919:5: lv_configurations_4_0= ruleReactConfigurations
            {

            					newCompositeNode(grammarAccess.getReactConfigurationAccess().getConfigurationsReactConfigurationsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_configurations_4_0=ruleReactConfigurations();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactConfigurationRule());
            					}
            					add(
            						current,
            						"configurations",
            						lv_configurations_4_0,
            						"org.xtext.example.mydsl.MyDsl.ReactConfigurations");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getReactConfigurationAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactConfiguration"


    // $ANTLR start "entryRuleReactDependencies"
    // InternalMyDsl.g:3944:1: entryRuleReactDependencies returns [EObject current=null] : iv_ruleReactDependencies= ruleReactDependencies EOF ;
    public final EObject entryRuleReactDependencies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactDependencies = null;


        try {
            // InternalMyDsl.g:3944:58: (iv_ruleReactDependencies= ruleReactDependencies EOF )
            // InternalMyDsl.g:3945:2: iv_ruleReactDependencies= ruleReactDependencies EOF
            {
             newCompositeNode(grammarAccess.getReactDependenciesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactDependencies=ruleReactDependencies();

            state._fsp--;

             current =iv_ruleReactDependencies; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactDependencies"


    // $ANTLR start "ruleReactDependencies"
    // InternalMyDsl.g:3951:1: ruleReactDependencies returns [EObject current=null] : (otherlv_0= 'DependenciesStruct' ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+ ) ;
    public final EObject ruleReactDependencies() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_dependencies_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3957:2: ( (otherlv_0= 'DependenciesStruct' ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+ ) )
            // InternalMyDsl.g:3958:2: (otherlv_0= 'DependenciesStruct' ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+ )
            {
            // InternalMyDsl.g:3958:2: (otherlv_0= 'DependenciesStruct' ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+ )
            // InternalMyDsl.g:3959:3: otherlv_0= 'DependenciesStruct' ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+
            {
            otherlv_0=(Token)match(input,80,FOLLOW_87); 

            			newLeafNode(otherlv_0, grammarAccess.getReactDependenciesAccess().getDependenciesStructKeyword_0());
            		
            // InternalMyDsl.g:3963:3: ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==81) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:3964:4: (lv_dependencies_1_0= ruleReactDependenciesRules )
            	    {
            	    // InternalMyDsl.g:3964:4: (lv_dependencies_1_0= ruleReactDependenciesRules )
            	    // InternalMyDsl.g:3965:5: lv_dependencies_1_0= ruleReactDependenciesRules
            	    {

            	    					newCompositeNode(grammarAccess.getReactDependenciesAccess().getDependenciesReactDependenciesRulesParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_88);
            	    lv_dependencies_1_0=ruleReactDependenciesRules();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactDependenciesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dependencies",
            	    						lv_dependencies_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.ReactDependenciesRules");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactDependencies"


    // $ANTLR start "entryRuleReactDependenciesRules"
    // InternalMyDsl.g:3986:1: entryRuleReactDependenciesRules returns [EObject current=null] : iv_ruleReactDependenciesRules= ruleReactDependenciesRules EOF ;
    public final EObject entryRuleReactDependenciesRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactDependenciesRules = null;


        try {
            // InternalMyDsl.g:3986:63: (iv_ruleReactDependenciesRules= ruleReactDependenciesRules EOF )
            // InternalMyDsl.g:3987:2: iv_ruleReactDependenciesRules= ruleReactDependenciesRules EOF
            {
             newCompositeNode(grammarAccess.getReactDependenciesRulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactDependenciesRules=ruleReactDependenciesRules();

            state._fsp--;

             current =iv_ruleReactDependenciesRules; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactDependenciesRules"


    // $ANTLR start "ruleReactDependenciesRules"
    // InternalMyDsl.g:3993:1: ruleReactDependenciesRules returns [EObject current=null] : (otherlv_0= 'DependencyType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+ ) ;
    public final EObject ruleReactDependenciesRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_dependencies_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3999:2: ( (otherlv_0= 'DependencyType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+ ) )
            // InternalMyDsl.g:4000:2: (otherlv_0= 'DependencyType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+ )
            {
            // InternalMyDsl.g:4000:2: (otherlv_0= 'DependencyType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+ )
            // InternalMyDsl.g:4001:3: otherlv_0= 'DependencyType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+
            {
            otherlv_0=(Token)match(input,81,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReactDependenciesRulesAccess().getDependencyTypeKeyword_0());
            		
            // InternalMyDsl.g:4005:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:4006:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:4006:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:4007:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_89); 

            					newLeafNode(lv_name_1_0, grammarAccess.getReactDependenciesRulesAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReactDependenciesRulesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:4023:3: ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==82) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:4024:4: (lv_dependencies_2_0= ruleReactDependenciesSubRules )
            	    {
            	    // InternalMyDsl.g:4024:4: (lv_dependencies_2_0= ruleReactDependenciesSubRules )
            	    // InternalMyDsl.g:4025:5: lv_dependencies_2_0= ruleReactDependenciesSubRules
            	    {

            	    					newCompositeNode(grammarAccess.getReactDependenciesRulesAccess().getDependenciesReactDependenciesSubRulesParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_90);
            	    lv_dependencies_2_0=ruleReactDependenciesSubRules();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactDependenciesRulesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dependencies",
            	    						lv_dependencies_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.ReactDependenciesSubRules");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactDependenciesRules"


    // $ANTLR start "entryRuleReactDependenciesSubRules"
    // InternalMyDsl.g:4046:1: entryRuleReactDependenciesSubRules returns [EObject current=null] : iv_ruleReactDependenciesSubRules= ruleReactDependenciesSubRules EOF ;
    public final EObject entryRuleReactDependenciesSubRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactDependenciesSubRules = null;


        try {
            // InternalMyDsl.g:4046:66: (iv_ruleReactDependenciesSubRules= ruleReactDependenciesSubRules EOF )
            // InternalMyDsl.g:4047:2: iv_ruleReactDependenciesSubRules= ruleReactDependenciesSubRules EOF
            {
             newCompositeNode(grammarAccess.getReactDependenciesSubRulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactDependenciesSubRules=ruleReactDependenciesSubRules();

            state._fsp--;

             current =iv_ruleReactDependenciesSubRules; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactDependenciesSubRules"


    // $ANTLR start "ruleReactDependenciesSubRules"
    // InternalMyDsl.g:4053:1: ruleReactDependenciesSubRules returns [EObject current=null] : ( (lv_dependencies_0_0= ruleSingleDependencies ) ) ;
    public final EObject ruleReactDependenciesSubRules() throws RecognitionException {
        EObject current = null;

        EObject lv_dependencies_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4059:2: ( ( (lv_dependencies_0_0= ruleSingleDependencies ) ) )
            // InternalMyDsl.g:4060:2: ( (lv_dependencies_0_0= ruleSingleDependencies ) )
            {
            // InternalMyDsl.g:4060:2: ( (lv_dependencies_0_0= ruleSingleDependencies ) )
            // InternalMyDsl.g:4061:3: (lv_dependencies_0_0= ruleSingleDependencies )
            {
            // InternalMyDsl.g:4061:3: (lv_dependencies_0_0= ruleSingleDependencies )
            // InternalMyDsl.g:4062:4: lv_dependencies_0_0= ruleSingleDependencies
            {

            				newCompositeNode(grammarAccess.getReactDependenciesSubRulesAccess().getDependenciesSingleDependenciesParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_dependencies_0_0=ruleSingleDependencies();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getReactDependenciesSubRulesRule());
            				}
            				add(
            					current,
            					"dependencies",
            					lv_dependencies_0_0,
            					"org.xtext.example.mydsl.MyDsl.SingleDependencies");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactDependenciesSubRules"


    // $ANTLR start "entryRuleSingleDependencies"
    // InternalMyDsl.g:4082:1: entryRuleSingleDependencies returns [EObject current=null] : iv_ruleSingleDependencies= ruleSingleDependencies EOF ;
    public final EObject entryRuleSingleDependencies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleDependencies = null;


        try {
            // InternalMyDsl.g:4082:59: (iv_ruleSingleDependencies= ruleSingleDependencies EOF )
            // InternalMyDsl.g:4083:2: iv_ruleSingleDependencies= ruleSingleDependencies EOF
            {
             newCompositeNode(grammarAccess.getSingleDependenciesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleDependencies=ruleSingleDependencies();

            state._fsp--;

             current =iv_ruleSingleDependencies; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleDependencies"


    // $ANTLR start "ruleSingleDependencies"
    // InternalMyDsl.g:4089:1: ruleSingleDependencies returns [EObject current=null] : ( ( (lv_dependencies_0_0= rulePackageName ) ) ( (lv_dependencies_1_0= rulePackageVersion ) ) ) ;
    public final EObject ruleSingleDependencies() throws RecognitionException {
        EObject current = null;

        EObject lv_dependencies_0_0 = null;

        EObject lv_dependencies_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4095:2: ( ( ( (lv_dependencies_0_0= rulePackageName ) ) ( (lv_dependencies_1_0= rulePackageVersion ) ) ) )
            // InternalMyDsl.g:4096:2: ( ( (lv_dependencies_0_0= rulePackageName ) ) ( (lv_dependencies_1_0= rulePackageVersion ) ) )
            {
            // InternalMyDsl.g:4096:2: ( ( (lv_dependencies_0_0= rulePackageName ) ) ( (lv_dependencies_1_0= rulePackageVersion ) ) )
            // InternalMyDsl.g:4097:3: ( (lv_dependencies_0_0= rulePackageName ) ) ( (lv_dependencies_1_0= rulePackageVersion ) )
            {
            // InternalMyDsl.g:4097:3: ( (lv_dependencies_0_0= rulePackageName ) )
            // InternalMyDsl.g:4098:4: (lv_dependencies_0_0= rulePackageName )
            {
            // InternalMyDsl.g:4098:4: (lv_dependencies_0_0= rulePackageName )
            // InternalMyDsl.g:4099:5: lv_dependencies_0_0= rulePackageName
            {

            					newCompositeNode(grammarAccess.getSingleDependenciesAccess().getDependenciesPackageNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_91);
            lv_dependencies_0_0=rulePackageName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleDependenciesRule());
            					}
            					add(
            						current,
            						"dependencies",
            						lv_dependencies_0_0,
            						"org.xtext.example.mydsl.MyDsl.PackageName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:4116:3: ( (lv_dependencies_1_0= rulePackageVersion ) )
            // InternalMyDsl.g:4117:4: (lv_dependencies_1_0= rulePackageVersion )
            {
            // InternalMyDsl.g:4117:4: (lv_dependencies_1_0= rulePackageVersion )
            // InternalMyDsl.g:4118:5: lv_dependencies_1_0= rulePackageVersion
            {

            					newCompositeNode(grammarAccess.getSingleDependenciesAccess().getDependenciesPackageVersionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_dependencies_1_0=rulePackageVersion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleDependenciesRule());
            					}
            					add(
            						current,
            						"dependencies",
            						lv_dependencies_1_0,
            						"org.xtext.example.mydsl.MyDsl.PackageVersion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleDependencies"


    // $ANTLR start "entryRulePackageName"
    // InternalMyDsl.g:4139:1: entryRulePackageName returns [EObject current=null] : iv_rulePackageName= rulePackageName EOF ;
    public final EObject entryRulePackageName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageName = null;


        try {
            // InternalMyDsl.g:4139:52: (iv_rulePackageName= rulePackageName EOF )
            // InternalMyDsl.g:4140:2: iv_rulePackageName= rulePackageName EOF
            {
             newCompositeNode(grammarAccess.getPackageNameRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageName=rulePackageName();

            state._fsp--;

             current =iv_rulePackageName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageName"


    // $ANTLR start "rulePackageName"
    // InternalMyDsl.g:4146:1: rulePackageName returns [EObject current=null] : (otherlv_0= 'PackageName' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePackageName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:4152:2: ( (otherlv_0= 'PackageName' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:4153:2: (otherlv_0= 'PackageName' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:4153:2: (otherlv_0= 'PackageName' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:4154:3: otherlv_0= 'PackageName' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,82,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageNameAccess().getPackageNameKeyword_0());
            		
            // InternalMyDsl.g:4158:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:4159:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:4159:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:4160:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPackageNameAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackageNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageName"


    // $ANTLR start "entryRulePackageVersion"
    // InternalMyDsl.g:4180:1: entryRulePackageVersion returns [EObject current=null] : iv_rulePackageVersion= rulePackageVersion EOF ;
    public final EObject entryRulePackageVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageVersion = null;


        try {
            // InternalMyDsl.g:4180:55: (iv_rulePackageVersion= rulePackageVersion EOF )
            // InternalMyDsl.g:4181:2: iv_rulePackageVersion= rulePackageVersion EOF
            {
             newCompositeNode(grammarAccess.getPackageVersionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageVersion=rulePackageVersion();

            state._fsp--;

             current =iv_rulePackageVersion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageVersion"


    // $ANTLR start "rulePackageVersion"
    // InternalMyDsl.g:4187:1: rulePackageVersion returns [EObject current=null] : (otherlv_0= 'PackageVersion' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePackageVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:4193:2: ( (otherlv_0= 'PackageVersion' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:4194:2: (otherlv_0= 'PackageVersion' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:4194:2: (otherlv_0= 'PackageVersion' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:4195:3: otherlv_0= 'PackageVersion' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,83,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageVersionAccess().getPackageVersionKeyword_0());
            		
            // InternalMyDsl.g:4199:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:4200:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:4200:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:4201:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPackageVersionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackageVersionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageVersion"


    // $ANTLR start "entryRuleReactConfigurations"
    // InternalMyDsl.g:4221:1: entryRuleReactConfigurations returns [EObject current=null] : iv_ruleReactConfigurations= ruleReactConfigurations EOF ;
    public final EObject entryRuleReactConfigurations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactConfigurations = null;


        try {
            // InternalMyDsl.g:4221:60: (iv_ruleReactConfigurations= ruleReactConfigurations EOF )
            // InternalMyDsl.g:4222:2: iv_ruleReactConfigurations= ruleReactConfigurations EOF
            {
             newCompositeNode(grammarAccess.getReactConfigurationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactConfigurations=ruleReactConfigurations();

            state._fsp--;

             current =iv_ruleReactConfigurations; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactConfigurations"


    // $ANTLR start "ruleReactConfigurations"
    // InternalMyDsl.g:4228:1: ruleReactConfigurations returns [EObject current=null] : (otherlv_0= 'ReactDOMConfigurations' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configurations_2_0= ruleDOMConfigurations ) )+ ) ;
    public final EObject ruleReactConfigurations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_configurations_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4234:2: ( (otherlv_0= 'ReactDOMConfigurations' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configurations_2_0= ruleDOMConfigurations ) )+ ) )
            // InternalMyDsl.g:4235:2: (otherlv_0= 'ReactDOMConfigurations' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configurations_2_0= ruleDOMConfigurations ) )+ )
            {
            // InternalMyDsl.g:4235:2: (otherlv_0= 'ReactDOMConfigurations' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configurations_2_0= ruleDOMConfigurations ) )+ )
            // InternalMyDsl.g:4236:3: otherlv_0= 'ReactDOMConfigurations' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configurations_2_0= ruleDOMConfigurations ) )+
            {
            otherlv_0=(Token)match(input,84,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReactConfigurationsAccess().getReactDOMConfigurationsKeyword_0());
            		
            // InternalMyDsl.g:4240:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:4241:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:4241:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:4242:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_92); 

            					newLeafNode(lv_name_1_0, grammarAccess.getReactConfigurationsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReactConfigurationsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:4258:3: ( (lv_configurations_2_0= ruleDOMConfigurations ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=85 && LA22_0<=89)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:4259:4: (lv_configurations_2_0= ruleDOMConfigurations )
            	    {
            	    // InternalMyDsl.g:4259:4: (lv_configurations_2_0= ruleDOMConfigurations )
            	    // InternalMyDsl.g:4260:5: lv_configurations_2_0= ruleDOMConfigurations
            	    {

            	    					newCompositeNode(grammarAccess.getReactConfigurationsAccess().getConfigurationsDOMConfigurationsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_93);
            	    lv_configurations_2_0=ruleDOMConfigurations();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactConfigurationsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"configurations",
            	    						lv_configurations_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.DOMConfigurations");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactConfigurations"


    // $ANTLR start "entryRuleDOMConfigurations"
    // InternalMyDsl.g:4281:1: entryRuleDOMConfigurations returns [EObject current=null] : iv_ruleDOMConfigurations= ruleDOMConfigurations EOF ;
    public final EObject entryRuleDOMConfigurations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOMConfigurations = null;


        try {
            // InternalMyDsl.g:4281:58: (iv_ruleDOMConfigurations= ruleDOMConfigurations EOF )
            // InternalMyDsl.g:4282:2: iv_ruleDOMConfigurations= ruleDOMConfigurations EOF
            {
             newCompositeNode(grammarAccess.getDOMConfigurationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOMConfigurations=ruleDOMConfigurations();

            state._fsp--;

             current =iv_ruleDOMConfigurations; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOMConfigurations"


    // $ANTLR start "ruleDOMConfigurations"
    // InternalMyDsl.g:4288:1: ruleDOMConfigurations returns [EObject current=null] : ( ( (lv_elements_0_0= ruleDOMTypeConf ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDOMConfigurations() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4294:2: ( ( ( (lv_elements_0_0= ruleDOMTypeConf ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:4295:2: ( ( (lv_elements_0_0= ruleDOMTypeConf ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:4295:2: ( ( (lv_elements_0_0= ruleDOMTypeConf ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:4296:3: ( (lv_elements_0_0= ruleDOMTypeConf ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMyDsl.g:4296:3: ( (lv_elements_0_0= ruleDOMTypeConf ) )
            // InternalMyDsl.g:4297:4: (lv_elements_0_0= ruleDOMTypeConf )
            {
            // InternalMyDsl.g:4297:4: (lv_elements_0_0= ruleDOMTypeConf )
            // InternalMyDsl.g:4298:5: lv_elements_0_0= ruleDOMTypeConf
            {

            					newCompositeNode(grammarAccess.getDOMConfigurationsAccess().getElementsDOMTypeConfParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_elements_0_0=ruleDOMTypeConf();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDOMConfigurationsRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_0_0,
            						"org.xtext.example.mydsl.MyDsl.DOMTypeConf");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:4315:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:4316:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:4316:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:4317:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDOMConfigurationsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDOMConfigurationsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOMConfigurations"


    // $ANTLR start "entryRuleDOMTypeConf"
    // InternalMyDsl.g:4337:1: entryRuleDOMTypeConf returns [String current=null] : iv_ruleDOMTypeConf= ruleDOMTypeConf EOF ;
    public final String entryRuleDOMTypeConf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOMTypeConf = null;


        try {
            // InternalMyDsl.g:4337:51: (iv_ruleDOMTypeConf= ruleDOMTypeConf EOF )
            // InternalMyDsl.g:4338:2: iv_ruleDOMTypeConf= ruleDOMTypeConf EOF
            {
             newCompositeNode(grammarAccess.getDOMTypeConfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOMTypeConf=ruleDOMTypeConf();

            state._fsp--;

             current =iv_ruleDOMTypeConf.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOMTypeConf"


    // $ANTLR start "ruleDOMTypeConf"
    // InternalMyDsl.g:4344:1: ruleDOMTypeConf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'RoutingConf' | kw= 'ServiceWorker' | kw= 'HTMLStructure' | kw= 'Manifest' | kw= 'RepositoriesConf' ) ;
    public final AntlrDatatypeRuleToken ruleDOMTypeConf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:4350:2: ( (kw= 'RoutingConf' | kw= 'ServiceWorker' | kw= 'HTMLStructure' | kw= 'Manifest' | kw= 'RepositoriesConf' ) )
            // InternalMyDsl.g:4351:2: (kw= 'RoutingConf' | kw= 'ServiceWorker' | kw= 'HTMLStructure' | kw= 'Manifest' | kw= 'RepositoriesConf' )
            {
            // InternalMyDsl.g:4351:2: (kw= 'RoutingConf' | kw= 'ServiceWorker' | kw= 'HTMLStructure' | kw= 'Manifest' | kw= 'RepositoriesConf' )
            int alt23=5;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt23=1;
                }
                break;
            case 86:
                {
                alt23=2;
                }
                break;
            case 87:
                {
                alt23=3;
                }
                break;
            case 88:
                {
                alt23=4;
                }
                break;
            case 89:
                {
                alt23=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:4352:3: kw= 'RoutingConf'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMTypeConfAccess().getRoutingConfKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:4358:3: kw= 'ServiceWorker'
                    {
                    kw=(Token)match(input,86,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMTypeConfAccess().getServiceWorkerKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:4364:3: kw= 'HTMLStructure'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMTypeConfAccess().getHTMLStructureKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:4370:3: kw= 'Manifest'
                    {
                    kw=(Token)match(input,88,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMTypeConfAccess().getManifestKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:4376:3: kw= 'RepositoriesConf'
                    {
                    kw=(Token)match(input,89,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMTypeConfAccess().getRepositoriesConfKeyword_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOMTypeConf"


    // $ANTLR start "entryRuleReactComponents"
    // InternalMyDsl.g:4385:1: entryRuleReactComponents returns [EObject current=null] : iv_ruleReactComponents= ruleReactComponents EOF ;
    public final EObject entryRuleReactComponents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactComponents = null;


        try {
            // InternalMyDsl.g:4385:56: (iv_ruleReactComponents= ruleReactComponents EOF )
            // InternalMyDsl.g:4386:2: iv_ruleReactComponents= ruleReactComponents EOF
            {
             newCompositeNode(grammarAccess.getReactComponentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactComponents=ruleReactComponents();

            state._fsp--;

             current =iv_ruleReactComponents; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactComponents"


    // $ANTLR start "ruleReactComponents"
    // InternalMyDsl.g:4392:1: ruleReactComponents returns [EObject current=null] : (otherlv_0= 'ReactComponents' otherlv_1= ':' otherlv_2= '{' ( (lv_componentslogic_3_0= ruleComponentsLogic ) ) ( (lv_componentsui_4_0= ruleComponentsUI ) ) otherlv_5= '}' ) ;
    public final EObject ruleReactComponents() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_componentslogic_3_0 = null;

        EObject lv_componentsui_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4398:2: ( (otherlv_0= 'ReactComponents' otherlv_1= ':' otherlv_2= '{' ( (lv_componentslogic_3_0= ruleComponentsLogic ) ) ( (lv_componentsui_4_0= ruleComponentsUI ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:4399:2: (otherlv_0= 'ReactComponents' otherlv_1= ':' otherlv_2= '{' ( (lv_componentslogic_3_0= ruleComponentsLogic ) ) ( (lv_componentsui_4_0= ruleComponentsUI ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:4399:2: (otherlv_0= 'ReactComponents' otherlv_1= ':' otherlv_2= '{' ( (lv_componentslogic_3_0= ruleComponentsLogic ) ) ( (lv_componentsui_4_0= ruleComponentsUI ) ) otherlv_5= '}' )
            // InternalMyDsl.g:4400:3: otherlv_0= 'ReactComponents' otherlv_1= ':' otherlv_2= '{' ( (lv_componentslogic_3_0= ruleComponentsLogic ) ) ( (lv_componentsui_4_0= ruleComponentsUI ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,90,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReactComponentsAccess().getReactComponentsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReactComponentsAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_94); 

            			newLeafNode(otherlv_2, grammarAccess.getReactComponentsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:4412:3: ( (lv_componentslogic_3_0= ruleComponentsLogic ) )
            // InternalMyDsl.g:4413:4: (lv_componentslogic_3_0= ruleComponentsLogic )
            {
            // InternalMyDsl.g:4413:4: (lv_componentslogic_3_0= ruleComponentsLogic )
            // InternalMyDsl.g:4414:5: lv_componentslogic_3_0= ruleComponentsLogic
            {

            					newCompositeNode(grammarAccess.getReactComponentsAccess().getComponentslogicComponentsLogicParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_95);
            lv_componentslogic_3_0=ruleComponentsLogic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactComponentsRule());
            					}
            					add(
            						current,
            						"componentslogic",
            						lv_componentslogic_3_0,
            						"org.xtext.example.mydsl.MyDsl.ComponentsLogic");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:4431:3: ( (lv_componentsui_4_0= ruleComponentsUI ) )
            // InternalMyDsl.g:4432:4: (lv_componentsui_4_0= ruleComponentsUI )
            {
            // InternalMyDsl.g:4432:4: (lv_componentsui_4_0= ruleComponentsUI )
            // InternalMyDsl.g:4433:5: lv_componentsui_4_0= ruleComponentsUI
            {

            					newCompositeNode(grammarAccess.getReactComponentsAccess().getComponentsuiComponentsUIParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_componentsui_4_0=ruleComponentsUI();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactComponentsRule());
            					}
            					add(
            						current,
            						"componentsui",
            						lv_componentsui_4_0,
            						"org.xtext.example.mydsl.MyDsl.ComponentsUI");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getReactComponentsAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactComponents"


    // $ANTLR start "entryRuleComponentsLogic"
    // InternalMyDsl.g:4458:1: entryRuleComponentsLogic returns [EObject current=null] : iv_ruleComponentsLogic= ruleComponentsLogic EOF ;
    public final EObject entryRuleComponentsLogic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentsLogic = null;


        try {
            // InternalMyDsl.g:4458:56: (iv_ruleComponentsLogic= ruleComponentsLogic EOF )
            // InternalMyDsl.g:4459:2: iv_ruleComponentsLogic= ruleComponentsLogic EOF
            {
             newCompositeNode(grammarAccess.getComponentsLogicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentsLogic=ruleComponentsLogic();

            state._fsp--;

             current =iv_ruleComponentsLogic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentsLogic"


    // $ANTLR start "ruleComponentsLogic"
    // InternalMyDsl.g:4465:1: ruleComponentsLogic returns [EObject current=null] : (otherlv_0= 'LogicComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicContent ) ) ) ;
    public final EObject ruleComponentsLogic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_logiccomponents_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4471:2: ( (otherlv_0= 'LogicComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicContent ) ) ) )
            // InternalMyDsl.g:4472:2: (otherlv_0= 'LogicComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicContent ) ) )
            {
            // InternalMyDsl.g:4472:2: (otherlv_0= 'LogicComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicContent ) ) )
            // InternalMyDsl.g:4473:3: otherlv_0= 'LogicComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicContent ) )
            {
            otherlv_0=(Token)match(input,91,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentsLogicAccess().getLogicComponentsKeyword_0());
            		
            // InternalMyDsl.g:4477:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:4478:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:4478:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:4479:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_96); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponentsLogicAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentsLogicRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:4495:3: ( (lv_logiccomponents_2_0= ruleLogicContent ) )
            // InternalMyDsl.g:4496:4: (lv_logiccomponents_2_0= ruleLogicContent )
            {
            // InternalMyDsl.g:4496:4: (lv_logiccomponents_2_0= ruleLogicContent )
            // InternalMyDsl.g:4497:5: lv_logiccomponents_2_0= ruleLogicContent
            {

            					newCompositeNode(grammarAccess.getComponentsLogicAccess().getLogiccomponentsLogicContentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_logiccomponents_2_0=ruleLogicContent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentsLogicRule());
            					}
            					add(
            						current,
            						"logiccomponents",
            						lv_logiccomponents_2_0,
            						"org.xtext.example.mydsl.MyDsl.LogicContent");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentsLogic"


    // $ANTLR start "entryRuleLogicContent"
    // InternalMyDsl.g:4518:1: entryRuleLogicContent returns [EObject current=null] : iv_ruleLogicContent= ruleLogicContent EOF ;
    public final EObject entryRuleLogicContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicContent = null;


        try {
            // InternalMyDsl.g:4518:53: (iv_ruleLogicContent= ruleLogicContent EOF )
            // InternalMyDsl.g:4519:2: iv_ruleLogicContent= ruleLogicContent EOF
            {
             newCompositeNode(grammarAccess.getLogicContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicContent=ruleLogicContent();

            state._fsp--;

             current =iv_ruleLogicContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicContent"


    // $ANTLR start "ruleLogicContent"
    // InternalMyDsl.g:4525:1: ruleLogicContent returns [EObject current=null] : (otherlv_0= 'RoutingComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicStructure ) ) ) ;
    public final EObject ruleLogicContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_logiccomponents_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4531:2: ( (otherlv_0= 'RoutingComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicStructure ) ) ) )
            // InternalMyDsl.g:4532:2: (otherlv_0= 'RoutingComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicStructure ) ) )
            {
            // InternalMyDsl.g:4532:2: (otherlv_0= 'RoutingComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicStructure ) ) )
            // InternalMyDsl.g:4533:3: otherlv_0= 'RoutingComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicStructure ) )
            {
            otherlv_0=(Token)match(input,92,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicContentAccess().getRoutingComponentsKeyword_0());
            		
            // InternalMyDsl.g:4537:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:4538:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:4538:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:4539:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_97); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicContentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicContentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:4555:3: ( (lv_logiccomponents_2_0= ruleLogicStructure ) )
            // InternalMyDsl.g:4556:4: (lv_logiccomponents_2_0= ruleLogicStructure )
            {
            // InternalMyDsl.g:4556:4: (lv_logiccomponents_2_0= ruleLogicStructure )
            // InternalMyDsl.g:4557:5: lv_logiccomponents_2_0= ruleLogicStructure
            {

            					newCompositeNode(grammarAccess.getLogicContentAccess().getLogiccomponentsLogicStructureParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_logiccomponents_2_0=ruleLogicStructure();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicContentRule());
            					}
            					add(
            						current,
            						"logiccomponents",
            						lv_logiccomponents_2_0,
            						"org.xtext.example.mydsl.MyDsl.LogicStructure");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicContent"


    // $ANTLR start "entryRuleLogicStructure"
    // InternalMyDsl.g:4578:1: entryRuleLogicStructure returns [EObject current=null] : iv_ruleLogicStructure= ruleLogicStructure EOF ;
    public final EObject entryRuleLogicStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicStructure = null;


        try {
            // InternalMyDsl.g:4578:55: (iv_ruleLogicStructure= ruleLogicStructure EOF )
            // InternalMyDsl.g:4579:2: iv_ruleLogicStructure= ruleLogicStructure EOF
            {
             newCompositeNode(grammarAccess.getLogicStructureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicStructure=ruleLogicStructure();

            state._fsp--;

             current =iv_ruleLogicStructure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicStructure"


    // $ANTLR start "ruleLogicStructure"
    // InternalMyDsl.g:4585:1: ruleLogicStructure returns [EObject current=null] : (otherlv_0= 'AppComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleComponentClass ) ) otherlv_3= 'IndexComponent' ( (lv_name_4_0= RULE_ID ) ) ) ;
    public final EObject ruleLogicStructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        EObject lv_logiccomponents_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4591:2: ( (otherlv_0= 'AppComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleComponentClass ) ) otherlv_3= 'IndexComponent' ( (lv_name_4_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:4592:2: (otherlv_0= 'AppComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleComponentClass ) ) otherlv_3= 'IndexComponent' ( (lv_name_4_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:4592:2: (otherlv_0= 'AppComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleComponentClass ) ) otherlv_3= 'IndexComponent' ( (lv_name_4_0= RULE_ID ) ) )
            // InternalMyDsl.g:4593:3: otherlv_0= 'AppComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleComponentClass ) ) otherlv_3= 'IndexComponent' ( (lv_name_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,93,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicStructureAccess().getAppComponentKeyword_0());
            		
            // InternalMyDsl.g:4597:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:4598:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:4598:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:4599:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_98); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogicStructureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicStructureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:4615:3: ( (lv_logiccomponents_2_0= ruleComponentClass ) )
            // InternalMyDsl.g:4616:4: (lv_logiccomponents_2_0= ruleComponentClass )
            {
            // InternalMyDsl.g:4616:4: (lv_logiccomponents_2_0= ruleComponentClass )
            // InternalMyDsl.g:4617:5: lv_logiccomponents_2_0= ruleComponentClass
            {

            					newCompositeNode(grammarAccess.getLogicStructureAccess().getLogiccomponentsComponentClassParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_99);
            lv_logiccomponents_2_0=ruleComponentClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicStructureRule());
            					}
            					add(
            						current,
            						"logiccomponents",
            						lv_logiccomponents_2_0,
            						"org.xtext.example.mydsl.MyDsl.ComponentClass");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,94,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicStructureAccess().getIndexComponentKeyword_3());
            		
            // InternalMyDsl.g:4638:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMyDsl.g:4639:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMyDsl.g:4639:4: (lv_name_4_0= RULE_ID )
            // InternalMyDsl.g:4640:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_4_0, grammarAccess.getLogicStructureAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogicStructureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicStructure"


    // $ANTLR start "entryRuleComponentsUI"
    // InternalMyDsl.g:4660:1: entryRuleComponentsUI returns [EObject current=null] : iv_ruleComponentsUI= ruleComponentsUI EOF ;
    public final EObject entryRuleComponentsUI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentsUI = null;


        try {
            // InternalMyDsl.g:4660:53: (iv_ruleComponentsUI= ruleComponentsUI EOF )
            // InternalMyDsl.g:4661:2: iv_ruleComponentsUI= ruleComponentsUI EOF
            {
             newCompositeNode(grammarAccess.getComponentsUIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentsUI=ruleComponentsUI();

            state._fsp--;

             current =iv_ruleComponentsUI; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentsUI"


    // $ANTLR start "ruleComponentsUI"
    // InternalMyDsl.g:4667:1: ruleComponentsUI returns [EObject current=null] : (otherlv_0= 'UIComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicomponents_2_0= ruleUIContent ) ) ) ;
    public final EObject ruleComponentsUI() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_uicomponents_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4673:2: ( (otherlv_0= 'UIComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicomponents_2_0= ruleUIContent ) ) ) )
            // InternalMyDsl.g:4674:2: (otherlv_0= 'UIComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicomponents_2_0= ruleUIContent ) ) )
            {
            // InternalMyDsl.g:4674:2: (otherlv_0= 'UIComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicomponents_2_0= ruleUIContent ) ) )
            // InternalMyDsl.g:4675:3: otherlv_0= 'UIComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicomponents_2_0= ruleUIContent ) )
            {
            otherlv_0=(Token)match(input,95,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentsUIAccess().getUIComponentsKeyword_0());
            		
            // InternalMyDsl.g:4679:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:4680:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:4680:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:4681:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_100); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponentsUIAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentsUIRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:4697:3: ( (lv_uicomponents_2_0= ruleUIContent ) )
            // InternalMyDsl.g:4698:4: (lv_uicomponents_2_0= ruleUIContent )
            {
            // InternalMyDsl.g:4698:4: (lv_uicomponents_2_0= ruleUIContent )
            // InternalMyDsl.g:4699:5: lv_uicomponents_2_0= ruleUIContent
            {

            					newCompositeNode(grammarAccess.getComponentsUIAccess().getUicomponentsUIContentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_uicomponents_2_0=ruleUIContent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentsUIRule());
            					}
            					add(
            						current,
            						"uicomponents",
            						lv_uicomponents_2_0,
            						"org.xtext.example.mydsl.MyDsl.UIContent");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentsUI"


    // $ANTLR start "entryRuleUIContent"
    // InternalMyDsl.g:4720:1: entryRuleUIContent returns [EObject current=null] : iv_ruleUIContent= ruleUIContent EOF ;
    public final EObject entryRuleUIContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIContent = null;


        try {
            // InternalMyDsl.g:4720:50: (iv_ruleUIContent= ruleUIContent EOF )
            // InternalMyDsl.g:4721:2: iv_ruleUIContent= ruleUIContent EOF
            {
             newCompositeNode(grammarAccess.getUIContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUIContent=ruleUIContent();

            state._fsp--;

             current =iv_ruleUIContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUIContent"


    // $ANTLR start "ruleUIContent"
    // InternalMyDsl.g:4727:1: ruleUIContent returns [EObject current=null] : ( (otherlv_0= 'ViewComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) ) )+ (otherlv_3= 'Subcomponents' ( (lv_name_4_0= RULE_ID ) ) ( (lv_uicontent_5_0= ruleComponentClass ) ) )+ ) ;
    public final EObject ruleUIContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        EObject lv_uicontent_2_0 = null;

        EObject lv_uicontent_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4733:2: ( ( (otherlv_0= 'ViewComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) ) )+ (otherlv_3= 'Subcomponents' ( (lv_name_4_0= RULE_ID ) ) ( (lv_uicontent_5_0= ruleComponentClass ) ) )+ ) )
            // InternalMyDsl.g:4734:2: ( (otherlv_0= 'ViewComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) ) )+ (otherlv_3= 'Subcomponents' ( (lv_name_4_0= RULE_ID ) ) ( (lv_uicontent_5_0= ruleComponentClass ) ) )+ )
            {
            // InternalMyDsl.g:4734:2: ( (otherlv_0= 'ViewComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) ) )+ (otherlv_3= 'Subcomponents' ( (lv_name_4_0= RULE_ID ) ) ( (lv_uicontent_5_0= ruleComponentClass ) ) )+ )
            // InternalMyDsl.g:4735:3: (otherlv_0= 'ViewComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) ) )+ (otherlv_3= 'Subcomponents' ( (lv_name_4_0= RULE_ID ) ) ( (lv_uicontent_5_0= ruleComponentClass ) ) )+
            {
            // InternalMyDsl.g:4735:3: (otherlv_0= 'ViewComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==96) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyDsl.g:4736:4: otherlv_0= 'ViewComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) )
            	    {
            	    otherlv_0=(Token)match(input,96,FOLLOW_9); 

            	    				newLeafNode(otherlv_0, grammarAccess.getUIContentAccess().getViewComponentKeyword_0_0());
            	    			
            	    // InternalMyDsl.g:4740:4: ( (lv_name_1_0= RULE_ID ) )
            	    // InternalMyDsl.g:4741:5: (lv_name_1_0= RULE_ID )
            	    {
            	    // InternalMyDsl.g:4741:5: (lv_name_1_0= RULE_ID )
            	    // InternalMyDsl.g:4742:6: lv_name_1_0= RULE_ID
            	    {
            	    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_98); 

            	    						newLeafNode(lv_name_1_0, grammarAccess.getUIContentAccess().getNameIDTerminalRuleCall_0_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getUIContentRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_1_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalMyDsl.g:4758:4: ( (lv_uicontent_2_0= ruleComponentClass ) )
            	    // InternalMyDsl.g:4759:5: (lv_uicontent_2_0= ruleComponentClass )
            	    {
            	    // InternalMyDsl.g:4759:5: (lv_uicontent_2_0= ruleComponentClass )
            	    // InternalMyDsl.g:4760:6: lv_uicontent_2_0= ruleComponentClass
            	    {

            	    						newCompositeNode(grammarAccess.getUIContentAccess().getUicontentComponentClassParserRuleCall_0_2_0());
            	    					
            	    pushFollow(FOLLOW_101);
            	    lv_uicontent_2_0=ruleComponentClass();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUIContentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"uicontent",
            	    							lv_uicontent_2_0,
            	    							"org.xtext.example.mydsl.MyDsl.ComponentClass");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            // InternalMyDsl.g:4778:3: (otherlv_3= 'Subcomponents' ( (lv_name_4_0= RULE_ID ) ) ( (lv_uicontent_5_0= ruleComponentClass ) ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==97) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:4779:4: otherlv_3= 'Subcomponents' ( (lv_name_4_0= RULE_ID ) ) ( (lv_uicontent_5_0= ruleComponentClass ) )
            	    {
            	    otherlv_3=(Token)match(input,97,FOLLOW_9); 

            	    				newLeafNode(otherlv_3, grammarAccess.getUIContentAccess().getSubcomponentsKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:4783:4: ( (lv_name_4_0= RULE_ID ) )
            	    // InternalMyDsl.g:4784:5: (lv_name_4_0= RULE_ID )
            	    {
            	    // InternalMyDsl.g:4784:5: (lv_name_4_0= RULE_ID )
            	    // InternalMyDsl.g:4785:6: lv_name_4_0= RULE_ID
            	    {
            	    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_98); 

            	    						newLeafNode(lv_name_4_0, grammarAccess.getUIContentAccess().getNameIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getUIContentRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_4_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalMyDsl.g:4801:4: ( (lv_uicontent_5_0= ruleComponentClass ) )
            	    // InternalMyDsl.g:4802:5: (lv_uicontent_5_0= ruleComponentClass )
            	    {
            	    // InternalMyDsl.g:4802:5: (lv_uicontent_5_0= ruleComponentClass )
            	    // InternalMyDsl.g:4803:6: lv_uicontent_5_0= ruleComponentClass
            	    {

            	    						newCompositeNode(grammarAccess.getUIContentAccess().getUicontentComponentClassParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_102);
            	    lv_uicontent_5_0=ruleComponentClass();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUIContentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"uicontent",
            	    							lv_uicontent_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.ComponentClass");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUIContent"


    // $ANTLR start "entryRuleComponentClass"
    // InternalMyDsl.g:4825:1: entryRuleComponentClass returns [EObject current=null] : iv_ruleComponentClass= ruleComponentClass EOF ;
    public final EObject entryRuleComponentClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentClass = null;


        try {
            // InternalMyDsl.g:4825:55: (iv_ruleComponentClass= ruleComponentClass EOF )
            // InternalMyDsl.g:4826:2: iv_ruleComponentClass= ruleComponentClass EOF
            {
             newCompositeNode(grammarAccess.getComponentClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentClass=ruleComponentClass();

            state._fsp--;

             current =iv_ruleComponentClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentClass"


    // $ANTLR start "ruleComponentClass"
    // InternalMyDsl.g:4832:1: ruleComponentClass returns [EObject current=null] : ( ( (lv_componentclass_0_0= ruleReactFunctions ) ) ( (lv_componentclass_1_0= ruleProps ) ) ) ;
    public final EObject ruleComponentClass() throws RecognitionException {
        EObject current = null;

        EObject lv_componentclass_0_0 = null;

        EObject lv_componentclass_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4838:2: ( ( ( (lv_componentclass_0_0= ruleReactFunctions ) ) ( (lv_componentclass_1_0= ruleProps ) ) ) )
            // InternalMyDsl.g:4839:2: ( ( (lv_componentclass_0_0= ruleReactFunctions ) ) ( (lv_componentclass_1_0= ruleProps ) ) )
            {
            // InternalMyDsl.g:4839:2: ( ( (lv_componentclass_0_0= ruleReactFunctions ) ) ( (lv_componentclass_1_0= ruleProps ) ) )
            // InternalMyDsl.g:4840:3: ( (lv_componentclass_0_0= ruleReactFunctions ) ) ( (lv_componentclass_1_0= ruleProps ) )
            {
            // InternalMyDsl.g:4840:3: ( (lv_componentclass_0_0= ruleReactFunctions ) )
            // InternalMyDsl.g:4841:4: (lv_componentclass_0_0= ruleReactFunctions )
            {
            // InternalMyDsl.g:4841:4: (lv_componentclass_0_0= ruleReactFunctions )
            // InternalMyDsl.g:4842:5: lv_componentclass_0_0= ruleReactFunctions
            {

            					newCompositeNode(grammarAccess.getComponentClassAccess().getComponentclassReactFunctionsParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_103);
            lv_componentclass_0_0=ruleReactFunctions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentClassRule());
            					}
            					add(
            						current,
            						"componentclass",
            						lv_componentclass_0_0,
            						"org.xtext.example.mydsl.MyDsl.ReactFunctions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:4859:3: ( (lv_componentclass_1_0= ruleProps ) )
            // InternalMyDsl.g:4860:4: (lv_componentclass_1_0= ruleProps )
            {
            // InternalMyDsl.g:4860:4: (lv_componentclass_1_0= ruleProps )
            // InternalMyDsl.g:4861:5: lv_componentclass_1_0= ruleProps
            {

            					newCompositeNode(grammarAccess.getComponentClassAccess().getComponentclassPropsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_componentclass_1_0=ruleProps();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentClassRule());
            					}
            					add(
            						current,
            						"componentclass",
            						lv_componentclass_1_0,
            						"org.xtext.example.mydsl.MyDsl.Props");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentClass"


    // $ANTLR start "entryRuleReactFunctions"
    // InternalMyDsl.g:4882:1: entryRuleReactFunctions returns [EObject current=null] : iv_ruleReactFunctions= ruleReactFunctions EOF ;
    public final EObject entryRuleReactFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactFunctions = null;


        try {
            // InternalMyDsl.g:4882:55: (iv_ruleReactFunctions= ruleReactFunctions EOF )
            // InternalMyDsl.g:4883:2: iv_ruleReactFunctions= ruleReactFunctions EOF
            {
             newCompositeNode(grammarAccess.getReactFunctionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactFunctions=ruleReactFunctions();

            state._fsp--;

             current =iv_ruleReactFunctions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactFunctions"


    // $ANTLR start "ruleReactFunctions"
    // InternalMyDsl.g:4889:1: ruleReactFunctions returns [EObject current=null] : ( ( (lv_componentclass_0_0= ruleReactConstructor ) ) ( (lv_lifecycleclass_1_0= ruleReactLifeCycle ) )* ( (lv_componentclass_2_0= ruleReactCoreFunctions ) )* ( (lv_renderclass_3_0= ruleReactRender ) ) ) ;
    public final EObject ruleReactFunctions() throws RecognitionException {
        EObject current = null;

        EObject lv_componentclass_0_0 = null;

        AntlrDatatypeRuleToken lv_lifecycleclass_1_0 = null;

        EObject lv_componentclass_2_0 = null;

        AntlrDatatypeRuleToken lv_renderclass_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4895:2: ( ( ( (lv_componentclass_0_0= ruleReactConstructor ) ) ( (lv_lifecycleclass_1_0= ruleReactLifeCycle ) )* ( (lv_componentclass_2_0= ruleReactCoreFunctions ) )* ( (lv_renderclass_3_0= ruleReactRender ) ) ) )
            // InternalMyDsl.g:4896:2: ( ( (lv_componentclass_0_0= ruleReactConstructor ) ) ( (lv_lifecycleclass_1_0= ruleReactLifeCycle ) )* ( (lv_componentclass_2_0= ruleReactCoreFunctions ) )* ( (lv_renderclass_3_0= ruleReactRender ) ) )
            {
            // InternalMyDsl.g:4896:2: ( ( (lv_componentclass_0_0= ruleReactConstructor ) ) ( (lv_lifecycleclass_1_0= ruleReactLifeCycle ) )* ( (lv_componentclass_2_0= ruleReactCoreFunctions ) )* ( (lv_renderclass_3_0= ruleReactRender ) ) )
            // InternalMyDsl.g:4897:3: ( (lv_componentclass_0_0= ruleReactConstructor ) ) ( (lv_lifecycleclass_1_0= ruleReactLifeCycle ) )* ( (lv_componentclass_2_0= ruleReactCoreFunctions ) )* ( (lv_renderclass_3_0= ruleReactRender ) )
            {
            // InternalMyDsl.g:4897:3: ( (lv_componentclass_0_0= ruleReactConstructor ) )
            // InternalMyDsl.g:4898:4: (lv_componentclass_0_0= ruleReactConstructor )
            {
            // InternalMyDsl.g:4898:4: (lv_componentclass_0_0= ruleReactConstructor )
            // InternalMyDsl.g:4899:5: lv_componentclass_0_0= ruleReactConstructor
            {

            					newCompositeNode(grammarAccess.getReactFunctionsAccess().getComponentclassReactConstructorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_104);
            lv_componentclass_0_0=ruleReactConstructor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactFunctionsRule());
            					}
            					add(
            						current,
            						"componentclass",
            						lv_componentclass_0_0,
            						"org.xtext.example.mydsl.MyDsl.ReactConstructor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:4916:3: ( (lv_lifecycleclass_1_0= ruleReactLifeCycle ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==107||(LA26_0>=109 && LA26_0<=110)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyDsl.g:4917:4: (lv_lifecycleclass_1_0= ruleReactLifeCycle )
            	    {
            	    // InternalMyDsl.g:4917:4: (lv_lifecycleclass_1_0= ruleReactLifeCycle )
            	    // InternalMyDsl.g:4918:5: lv_lifecycleclass_1_0= ruleReactLifeCycle
            	    {

            	    					newCompositeNode(grammarAccess.getReactFunctionsAccess().getLifecycleclassReactLifeCycleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_104);
            	    lv_lifecycleclass_1_0=ruleReactLifeCycle();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactFunctionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lifecycleclass",
            	    						lv_lifecycleclass_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.ReactLifeCycle");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // InternalMyDsl.g:4935:3: ( (lv_componentclass_2_0= ruleReactCoreFunctions ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyDsl.g:4936:4: (lv_componentclass_2_0= ruleReactCoreFunctions )
            	    {
            	    // InternalMyDsl.g:4936:4: (lv_componentclass_2_0= ruleReactCoreFunctions )
            	    // InternalMyDsl.g:4937:5: lv_componentclass_2_0= ruleReactCoreFunctions
            	    {

            	    					newCompositeNode(grammarAccess.getReactFunctionsAccess().getComponentclassReactCoreFunctionsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_104);
            	    lv_componentclass_2_0=ruleReactCoreFunctions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactFunctionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"componentclass",
            	    						lv_componentclass_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.ReactCoreFunctions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // InternalMyDsl.g:4954:3: ( (lv_renderclass_3_0= ruleReactRender ) )
            // InternalMyDsl.g:4955:4: (lv_renderclass_3_0= ruleReactRender )
            {
            // InternalMyDsl.g:4955:4: (lv_renderclass_3_0= ruleReactRender )
            // InternalMyDsl.g:4956:5: lv_renderclass_3_0= ruleReactRender
            {

            					newCompositeNode(grammarAccess.getReactFunctionsAccess().getRenderclassReactRenderParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_renderclass_3_0=ruleReactRender();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactFunctionsRule());
            					}
            					add(
            						current,
            						"renderclass",
            						lv_renderclass_3_0,
            						"org.xtext.example.mydsl.MyDsl.ReactRender");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactFunctions"


    // $ANTLR start "entryRuleReactConstructor"
    // InternalMyDsl.g:4977:1: entryRuleReactConstructor returns [EObject current=null] : iv_ruleReactConstructor= ruleReactConstructor EOF ;
    public final EObject entryRuleReactConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactConstructor = null;


        try {
            // InternalMyDsl.g:4977:57: (iv_ruleReactConstructor= ruleReactConstructor EOF )
            // InternalMyDsl.g:4978:2: iv_ruleReactConstructor= ruleReactConstructor EOF
            {
             newCompositeNode(grammarAccess.getReactConstructorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactConstructor=ruleReactConstructor();

            state._fsp--;

             current =iv_ruleReactConstructor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactConstructor"


    // $ANTLR start "ruleReactConstructor"
    // InternalMyDsl.g:4984:1: ruleReactConstructor returns [EObject current=null] : (otherlv_0= 'Constructor' ( (lv_componentclass_1_0= ruleState ) ) ( (lv_componentclass_2_0= ruleCoreFunctionsDeclaration ) )* ) ;
    public final EObject ruleReactConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_componentclass_1_0 = null;

        EObject lv_componentclass_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4990:2: ( (otherlv_0= 'Constructor' ( (lv_componentclass_1_0= ruleState ) ) ( (lv_componentclass_2_0= ruleCoreFunctionsDeclaration ) )* ) )
            // InternalMyDsl.g:4991:2: (otherlv_0= 'Constructor' ( (lv_componentclass_1_0= ruleState ) ) ( (lv_componentclass_2_0= ruleCoreFunctionsDeclaration ) )* )
            {
            // InternalMyDsl.g:4991:2: (otherlv_0= 'Constructor' ( (lv_componentclass_1_0= ruleState ) ) ( (lv_componentclass_2_0= ruleCoreFunctionsDeclaration ) )* )
            // InternalMyDsl.g:4992:3: otherlv_0= 'Constructor' ( (lv_componentclass_1_0= ruleState ) ) ( (lv_componentclass_2_0= ruleCoreFunctionsDeclaration ) )*
            {
            otherlv_0=(Token)match(input,98,FOLLOW_105); 

            			newLeafNode(otherlv_0, grammarAccess.getReactConstructorAccess().getConstructorKeyword_0());
            		
            // InternalMyDsl.g:4996:3: ( (lv_componentclass_1_0= ruleState ) )
            // InternalMyDsl.g:4997:4: (lv_componentclass_1_0= ruleState )
            {
            // InternalMyDsl.g:4997:4: (lv_componentclass_1_0= ruleState )
            // InternalMyDsl.g:4998:5: lv_componentclass_1_0= ruleState
            {

            					newCompositeNode(grammarAccess.getReactConstructorAccess().getComponentclassStateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_106);
            lv_componentclass_1_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactConstructorRule());
            					}
            					add(
            						current,
            						"componentclass",
            						lv_componentclass_1_0,
            						"org.xtext.example.mydsl.MyDsl.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:5015:3: ( (lv_componentclass_2_0= ruleCoreFunctionsDeclaration ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    int LA28_2 = input.LA(2);

                    if ( (LA28_2==106) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:5016:4: (lv_componentclass_2_0= ruleCoreFunctionsDeclaration )
            	    {
            	    // InternalMyDsl.g:5016:4: (lv_componentclass_2_0= ruleCoreFunctionsDeclaration )
            	    // InternalMyDsl.g:5017:5: lv_componentclass_2_0= ruleCoreFunctionsDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getReactConstructorAccess().getComponentclassCoreFunctionsDeclarationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_106);
            	    lv_componentclass_2_0=ruleCoreFunctionsDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactConstructorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"componentclass",
            	    						lv_componentclass_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.CoreFunctionsDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactConstructor"


    // $ANTLR start "entryRuleState"
    // InternalMyDsl.g:5038:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMyDsl.g:5038:46: (iv_ruleState= ruleState EOF )
            // InternalMyDsl.g:5039:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMyDsl.g:5045:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )* ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_componentclass_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5051:2: ( (otherlv_0= 'State' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )* ) )
            // InternalMyDsl.g:5052:2: (otherlv_0= 'State' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )* )
            {
            // InternalMyDsl.g:5052:2: (otherlv_0= 'State' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )* )
            // InternalMyDsl.g:5053:3: otherlv_0= 'State' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )*
            {
            otherlv_0=(Token)match(input,99,FOLLOW_106); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalMyDsl.g:5057:3: ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    int LA29_1 = input.LA(2);

                    if ( ((LA29_1>=100 && LA29_1<=105)) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // InternalMyDsl.g:5058:4: ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) )
            	    {
            	    // InternalMyDsl.g:5058:4: ( (lv_name_1_0= RULE_ID ) )
            	    // InternalMyDsl.g:5059:5: (lv_name_1_0= RULE_ID )
            	    {
            	    // InternalMyDsl.g:5059:5: (lv_name_1_0= RULE_ID )
            	    // InternalMyDsl.g:5060:6: lv_name_1_0= RULE_ID
            	    {
            	    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_107); 

            	    						newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getStateRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_1_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalMyDsl.g:5076:4: ( (lv_componentclass_2_0= ruleDataType ) )
            	    // InternalMyDsl.g:5077:5: (lv_componentclass_2_0= ruleDataType )
            	    {
            	    // InternalMyDsl.g:5077:5: (lv_componentclass_2_0= ruleDataType )
            	    // InternalMyDsl.g:5078:6: lv_componentclass_2_0= ruleDataType
            	    {

            	    						newCompositeNode(grammarAccess.getStateAccess().getComponentclassDataTypeParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_106);
            	    lv_componentclass_2_0=ruleDataType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"componentclass",
            	    							lv_componentclass_2_0,
            	    							"org.xtext.example.mydsl.MyDsl.DataType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleDataType"
    // InternalMyDsl.g:5100:1: entryRuleDataType returns [String current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final String entryRuleDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataType = null;


        try {
            // InternalMyDsl.g:5100:48: (iv_ruleDataType= ruleDataType EOF )
            // InternalMyDsl.g:5101:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalMyDsl.g:5107:1: ruleDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'String' | kw= 'Array' | kw= 'Object' | kw= 'Number' | kw= 'null' | kw= 'Boolean' ) ;
    public final AntlrDatatypeRuleToken ruleDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:5113:2: ( (kw= 'String' | kw= 'Array' | kw= 'Object' | kw= 'Number' | kw= 'null' | kw= 'Boolean' ) )
            // InternalMyDsl.g:5114:2: (kw= 'String' | kw= 'Array' | kw= 'Object' | kw= 'Number' | kw= 'null' | kw= 'Boolean' )
            {
            // InternalMyDsl.g:5114:2: (kw= 'String' | kw= 'Array' | kw= 'Object' | kw= 'Number' | kw= 'null' | kw= 'Boolean' )
            int alt30=6;
            switch ( input.LA(1) ) {
            case 100:
                {
                alt30=1;
                }
                break;
            case 101:
                {
                alt30=2;
                }
                break;
            case 102:
                {
                alt30=3;
                }
                break;
            case 103:
                {
                alt30=4;
                }
                break;
            case 104:
                {
                alt30=5;
                }
                break;
            case 105:
                {
                alt30=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:5115:3: kw= 'String'
                    {
                    kw=(Token)match(input,100,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getStringKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5121:3: kw= 'Array'
                    {
                    kw=(Token)match(input,101,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getArrayKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:5127:3: kw= 'Object'
                    {
                    kw=(Token)match(input,102,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getObjectKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:5133:3: kw= 'Number'
                    {
                    kw=(Token)match(input,103,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getNumberKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:5139:3: kw= 'null'
                    {
                    kw=(Token)match(input,104,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getNullKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:5145:3: kw= 'Boolean'
                    {
                    kw=(Token)match(input,105,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getBooleanKeyword_5());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleCoreFunctionsDeclaration"
    // InternalMyDsl.g:5154:1: entryRuleCoreFunctionsDeclaration returns [EObject current=null] : iv_ruleCoreFunctionsDeclaration= ruleCoreFunctionsDeclaration EOF ;
    public final EObject entryRuleCoreFunctionsDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoreFunctionsDeclaration = null;


        try {
            // InternalMyDsl.g:5154:65: (iv_ruleCoreFunctionsDeclaration= ruleCoreFunctionsDeclaration EOF )
            // InternalMyDsl.g:5155:2: iv_ruleCoreFunctionsDeclaration= ruleCoreFunctionsDeclaration EOF
            {
             newCompositeNode(grammarAccess.getCoreFunctionsDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoreFunctionsDeclaration=ruleCoreFunctionsDeclaration();

            state._fsp--;

             current =iv_ruleCoreFunctionsDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCoreFunctionsDeclaration"


    // $ANTLR start "ruleCoreFunctionsDeclaration"
    // InternalMyDsl.g:5161:1: ruleCoreFunctionsDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionBindingDeclaration' ) ;
    public final EObject ruleCoreFunctionsDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:5167:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionBindingDeclaration' ) )
            // InternalMyDsl.g:5168:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionBindingDeclaration' )
            {
            // InternalMyDsl.g:5168:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionBindingDeclaration' )
            // InternalMyDsl.g:5169:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionBindingDeclaration'
            {
            // InternalMyDsl.g:5169:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:5170:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:5170:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:5171:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_108); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCoreFunctionsDeclarationAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoreFunctionsDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,106,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCoreFunctionsDeclarationAccess().getFunctionBindingDeclarationKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCoreFunctionsDeclaration"


    // $ANTLR start "entryRuleReactLifeCycle"
    // InternalMyDsl.g:5195:1: entryRuleReactLifeCycle returns [String current=null] : iv_ruleReactLifeCycle= ruleReactLifeCycle EOF ;
    public final String entryRuleReactLifeCycle() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReactLifeCycle = null;


        try {
            // InternalMyDsl.g:5195:54: (iv_ruleReactLifeCycle= ruleReactLifeCycle EOF )
            // InternalMyDsl.g:5196:2: iv_ruleReactLifeCycle= ruleReactLifeCycle EOF
            {
             newCompositeNode(grammarAccess.getReactLifeCycleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactLifeCycle=ruleReactLifeCycle();

            state._fsp--;

             current =iv_ruleReactLifeCycle.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactLifeCycle"


    // $ANTLR start "ruleReactLifeCycle"
    // InternalMyDsl.g:5202:1: ruleReactLifeCycle returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'ComponentDidMount' kw= 'FunctionStructure' ) | (kw= 'ComponentDidUpdate' kw= 'FunctionStructure' ) | (kw= 'ComponentWillUnmount' kw= 'FunctionStructure' ) ) ;
    public final AntlrDatatypeRuleToken ruleReactLifeCycle() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:5208:2: ( ( (kw= 'ComponentDidMount' kw= 'FunctionStructure' ) | (kw= 'ComponentDidUpdate' kw= 'FunctionStructure' ) | (kw= 'ComponentWillUnmount' kw= 'FunctionStructure' ) ) )
            // InternalMyDsl.g:5209:2: ( (kw= 'ComponentDidMount' kw= 'FunctionStructure' ) | (kw= 'ComponentDidUpdate' kw= 'FunctionStructure' ) | (kw= 'ComponentWillUnmount' kw= 'FunctionStructure' ) )
            {
            // InternalMyDsl.g:5209:2: ( (kw= 'ComponentDidMount' kw= 'FunctionStructure' ) | (kw= 'ComponentDidUpdate' kw= 'FunctionStructure' ) | (kw= 'ComponentWillUnmount' kw= 'FunctionStructure' ) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 107:
                {
                alt31=1;
                }
                break;
            case 109:
                {
                alt31=2;
                }
                break;
            case 110:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:5210:3: (kw= 'ComponentDidMount' kw= 'FunctionStructure' )
                    {
                    // InternalMyDsl.g:5210:3: (kw= 'ComponentDidMount' kw= 'FunctionStructure' )
                    // InternalMyDsl.g:5211:4: kw= 'ComponentDidMount' kw= 'FunctionStructure'
                    {
                    kw=(Token)match(input,107,FOLLOW_109); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReactLifeCycleAccess().getComponentDidMountKeyword_0_0());
                    			
                    kw=(Token)match(input,108,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReactLifeCycleAccess().getFunctionStructureKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5223:3: (kw= 'ComponentDidUpdate' kw= 'FunctionStructure' )
                    {
                    // InternalMyDsl.g:5223:3: (kw= 'ComponentDidUpdate' kw= 'FunctionStructure' )
                    // InternalMyDsl.g:5224:4: kw= 'ComponentDidUpdate' kw= 'FunctionStructure'
                    {
                    kw=(Token)match(input,109,FOLLOW_109); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReactLifeCycleAccess().getComponentDidUpdateKeyword_1_0());
                    			
                    kw=(Token)match(input,108,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReactLifeCycleAccess().getFunctionStructureKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:5236:3: (kw= 'ComponentWillUnmount' kw= 'FunctionStructure' )
                    {
                    // InternalMyDsl.g:5236:3: (kw= 'ComponentWillUnmount' kw= 'FunctionStructure' )
                    // InternalMyDsl.g:5237:4: kw= 'ComponentWillUnmount' kw= 'FunctionStructure'
                    {
                    kw=(Token)match(input,110,FOLLOW_109); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReactLifeCycleAccess().getComponentWillUnmountKeyword_2_0());
                    			
                    kw=(Token)match(input,108,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReactLifeCycleAccess().getFunctionStructureKeyword_2_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactLifeCycle"


    // $ANTLR start "entryRuleReactRender"
    // InternalMyDsl.g:5252:1: entryRuleReactRender returns [String current=null] : iv_ruleReactRender= ruleReactRender EOF ;
    public final String entryRuleReactRender() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReactRender = null;


        try {
            // InternalMyDsl.g:5252:51: (iv_ruleReactRender= ruleReactRender EOF )
            // InternalMyDsl.g:5253:2: iv_ruleReactRender= ruleReactRender EOF
            {
             newCompositeNode(grammarAccess.getReactRenderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactRender=ruleReactRender();

            state._fsp--;

             current =iv_ruleReactRender.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactRender"


    // $ANTLR start "ruleReactRender"
    // InternalMyDsl.g:5259:1: ruleReactRender returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Render' kw= 'RenderContent' ) ;
    public final AntlrDatatypeRuleToken ruleReactRender() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:5265:2: ( (kw= 'Render' kw= 'RenderContent' ) )
            // InternalMyDsl.g:5266:2: (kw= 'Render' kw= 'RenderContent' )
            {
            // InternalMyDsl.g:5266:2: (kw= 'Render' kw= 'RenderContent' )
            // InternalMyDsl.g:5267:3: kw= 'Render' kw= 'RenderContent'
            {
            kw=(Token)match(input,111,FOLLOW_110); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getReactRenderAccess().getRenderKeyword_0());
            		
            kw=(Token)match(input,112,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getReactRenderAccess().getRenderContentKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactRender"


    // $ANTLR start "entryRuleProps"
    // InternalMyDsl.g:5281:1: entryRuleProps returns [EObject current=null] : iv_ruleProps= ruleProps EOF ;
    public final EObject entryRuleProps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProps = null;


        try {
            // InternalMyDsl.g:5281:46: (iv_ruleProps= ruleProps EOF )
            // InternalMyDsl.g:5282:2: iv_ruleProps= ruleProps EOF
            {
             newCompositeNode(grammarAccess.getPropsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProps=ruleProps();

            state._fsp--;

             current =iv_ruleProps; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProps"


    // $ANTLR start "ruleProps"
    // InternalMyDsl.g:5288:1: ruleProps returns [EObject current=null] : (otherlv_0= 'Props' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )* ) ;
    public final EObject ruleProps() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_componentclass_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5294:2: ( (otherlv_0= 'Props' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )* ) )
            // InternalMyDsl.g:5295:2: (otherlv_0= 'Props' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )* )
            {
            // InternalMyDsl.g:5295:2: (otherlv_0= 'Props' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )* )
            // InternalMyDsl.g:5296:3: otherlv_0= 'Props' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )*
            {
            otherlv_0=(Token)match(input,113,FOLLOW_106); 

            			newLeafNode(otherlv_0, grammarAccess.getPropsAccess().getPropsKeyword_0());
            		
            // InternalMyDsl.g:5300:3: ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMyDsl.g:5301:4: ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) )
            	    {
            	    // InternalMyDsl.g:5301:4: ( (lv_name_1_0= RULE_ID ) )
            	    // InternalMyDsl.g:5302:5: (lv_name_1_0= RULE_ID )
            	    {
            	    // InternalMyDsl.g:5302:5: (lv_name_1_0= RULE_ID )
            	    // InternalMyDsl.g:5303:6: lv_name_1_0= RULE_ID
            	    {
            	    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_107); 

            	    						newLeafNode(lv_name_1_0, grammarAccess.getPropsAccess().getNameIDTerminalRuleCall_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPropsRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_1_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalMyDsl.g:5319:4: ( (lv_componentclass_2_0= ruleDataType ) )
            	    // InternalMyDsl.g:5320:5: (lv_componentclass_2_0= ruleDataType )
            	    {
            	    // InternalMyDsl.g:5320:5: (lv_componentclass_2_0= ruleDataType )
            	    // InternalMyDsl.g:5321:6: lv_componentclass_2_0= ruleDataType
            	    {

            	    						newCompositeNode(grammarAccess.getPropsAccess().getComponentclassDataTypeParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_106);
            	    lv_componentclass_2_0=ruleDataType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPropsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"componentclass",
            	    							lv_componentclass_2_0,
            	    							"org.xtext.example.mydsl.MyDsl.DataType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProps"


    // $ANTLR start "entryRuleReactCoreFunctions"
    // InternalMyDsl.g:5343:1: entryRuleReactCoreFunctions returns [EObject current=null] : iv_ruleReactCoreFunctions= ruleReactCoreFunctions EOF ;
    public final EObject entryRuleReactCoreFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactCoreFunctions = null;


        try {
            // InternalMyDsl.g:5343:59: (iv_ruleReactCoreFunctions= ruleReactCoreFunctions EOF )
            // InternalMyDsl.g:5344:2: iv_ruleReactCoreFunctions= ruleReactCoreFunctions EOF
            {
             newCompositeNode(grammarAccess.getReactCoreFunctionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactCoreFunctions=ruleReactCoreFunctions();

            state._fsp--;

             current =iv_ruleReactCoreFunctions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactCoreFunctions"


    // $ANTLR start "ruleReactCoreFunctions"
    // InternalMyDsl.g:5350:1: ruleReactCoreFunctions returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionStructure' ) ;
    public final EObject ruleReactCoreFunctions() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:5356:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionStructure' ) )
            // InternalMyDsl.g:5357:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionStructure' )
            {
            // InternalMyDsl.g:5357:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionStructure' )
            // InternalMyDsl.g:5358:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionStructure'
            {
            // InternalMyDsl.g:5358:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:5359:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:5359:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:5360:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_109); 

            					newLeafNode(lv_name_0_0, grammarAccess.getReactCoreFunctionsAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReactCoreFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,108,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getReactCoreFunctionsAccess().getFunctionStructureKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactCoreFunctions"


    // $ANTLR start "entryRuleReactActions"
    // InternalMyDsl.g:5384:1: entryRuleReactActions returns [EObject current=null] : iv_ruleReactActions= ruleReactActions EOF ;
    public final EObject entryRuleReactActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactActions = null;


        try {
            // InternalMyDsl.g:5384:53: (iv_ruleReactActions= ruleReactActions EOF )
            // InternalMyDsl.g:5385:2: iv_ruleReactActions= ruleReactActions EOF
            {
             newCompositeNode(grammarAccess.getReactActionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactActions=ruleReactActions();

            state._fsp--;

             current =iv_ruleReactActions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactActions"


    // $ANTLR start "ruleReactActions"
    // InternalMyDsl.g:5391:1: ruleReactActions returns [EObject current=null] : (otherlv_0= 'ReactActions' otherlv_1= ':' otherlv_2= '{' ( (lv_reactactcontent_3_0= ruleReactActionsContent ) ) otherlv_4= '}' ) ;
    public final EObject ruleReactActions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reactactcontent_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5397:2: ( (otherlv_0= 'ReactActions' otherlv_1= ':' otherlv_2= '{' ( (lv_reactactcontent_3_0= ruleReactActionsContent ) ) otherlv_4= '}' ) )
            // InternalMyDsl.g:5398:2: (otherlv_0= 'ReactActions' otherlv_1= ':' otherlv_2= '{' ( (lv_reactactcontent_3_0= ruleReactActionsContent ) ) otherlv_4= '}' )
            {
            // InternalMyDsl.g:5398:2: (otherlv_0= 'ReactActions' otherlv_1= ':' otherlv_2= '{' ( (lv_reactactcontent_3_0= ruleReactActionsContent ) ) otherlv_4= '}' )
            // InternalMyDsl.g:5399:3: otherlv_0= 'ReactActions' otherlv_1= ':' otherlv_2= '{' ( (lv_reactactcontent_3_0= ruleReactActionsContent ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,114,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReactActionsAccess().getReactActionsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReactActionsAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_111); 

            			newLeafNode(otherlv_2, grammarAccess.getReactActionsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:5411:3: ( (lv_reactactcontent_3_0= ruleReactActionsContent ) )
            // InternalMyDsl.g:5412:4: (lv_reactactcontent_3_0= ruleReactActionsContent )
            {
            // InternalMyDsl.g:5412:4: (lv_reactactcontent_3_0= ruleReactActionsContent )
            // InternalMyDsl.g:5413:5: lv_reactactcontent_3_0= ruleReactActionsContent
            {

            					newCompositeNode(grammarAccess.getReactActionsAccess().getReactactcontentReactActionsContentParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_reactactcontent_3_0=ruleReactActionsContent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactActionsRule());
            					}
            					add(
            						current,
            						"reactactcontent",
            						lv_reactactcontent_3_0,
            						"org.xtext.example.mydsl.MyDsl.ReactActionsContent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getReactActionsAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactActions"


    // $ANTLR start "entryRuleReactActionsContent"
    // InternalMyDsl.g:5438:1: entryRuleReactActionsContent returns [EObject current=null] : iv_ruleReactActionsContent= ruleReactActionsContent EOF ;
    public final EObject entryRuleReactActionsContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactActionsContent = null;


        try {
            // InternalMyDsl.g:5438:60: (iv_ruleReactActionsContent= ruleReactActionsContent EOF )
            // InternalMyDsl.g:5439:2: iv_ruleReactActionsContent= ruleReactActionsContent EOF
            {
             newCompositeNode(grammarAccess.getReactActionsContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactActionsContent=ruleReactActionsContent();

            state._fsp--;

             current =iv_ruleReactActionsContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactActionsContent"


    // $ANTLR start "ruleReactActionsContent"
    // InternalMyDsl.g:5445:1: ruleReactActionsContent returns [EObject current=null] : ( (lv_reactrelcontent_0_0= ruleReactServicesRelation ) )+ ;
    public final EObject ruleReactActionsContent() throws RecognitionException {
        EObject current = null;

        EObject lv_reactrelcontent_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5451:2: ( ( (lv_reactrelcontent_0_0= ruleReactServicesRelation ) )+ )
            // InternalMyDsl.g:5452:2: ( (lv_reactrelcontent_0_0= ruleReactServicesRelation ) )+
            {
            // InternalMyDsl.g:5452:2: ( (lv_reactrelcontent_0_0= ruleReactServicesRelation ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==117) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMyDsl.g:5453:3: (lv_reactrelcontent_0_0= ruleReactServicesRelation )
            	    {
            	    // InternalMyDsl.g:5453:3: (lv_reactrelcontent_0_0= ruleReactServicesRelation )
            	    // InternalMyDsl.g:5454:4: lv_reactrelcontent_0_0= ruleReactServicesRelation
            	    {

            	    				newCompositeNode(grammarAccess.getReactActionsContentAccess().getReactrelcontentReactServicesRelationParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_112);
            	    lv_reactrelcontent_0_0=ruleReactServicesRelation();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getReactActionsContentRule());
            	    				}
            	    				add(
            	    					current,
            	    					"reactrelcontent",
            	    					lv_reactrelcontent_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.ReactServicesRelation");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactActionsContent"


    // $ANTLR start "entryRuleReactServicesType"
    // InternalMyDsl.g:5474:1: entryRuleReactServicesType returns [EObject current=null] : iv_ruleReactServicesType= ruleReactServicesType EOF ;
    public final EObject entryRuleReactServicesType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactServicesType = null;


        try {
            // InternalMyDsl.g:5474:58: (iv_ruleReactServicesType= ruleReactServicesType EOF )
            // InternalMyDsl.g:5475:2: iv_ruleReactServicesType= ruleReactServicesType EOF
            {
             newCompositeNode(grammarAccess.getReactServicesTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactServicesType=ruleReactServicesType();

            state._fsp--;

             current =iv_ruleReactServicesType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactServicesType"


    // $ANTLR start "ruleReactServicesType"
    // InternalMyDsl.g:5481:1: ruleReactServicesType returns [EObject current=null] : (otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ServiceContent' ) ;
    public final EObject ruleReactServicesType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:5487:2: ( (otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ServiceContent' ) )
            // InternalMyDsl.g:5488:2: (otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ServiceContent' )
            {
            // InternalMyDsl.g:5488:2: (otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ServiceContent' )
            // InternalMyDsl.g:5489:3: otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ServiceContent'
            {
            otherlv_0=(Token)match(input,115,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReactServicesTypeAccess().getServiceTypeKeyword_0());
            		
            // InternalMyDsl.g:5493:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:5494:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:5494:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:5495:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_113); 

            					newLeafNode(lv_name_1_0, grammarAccess.getReactServicesTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReactServicesTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,116,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getReactServicesTypeAccess().getServiceContentKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactServicesType"


    // $ANTLR start "entryRuleReactServicesRelation"
    // InternalMyDsl.g:5519:1: entryRuleReactServicesRelation returns [EObject current=null] : iv_ruleReactServicesRelation= ruleReactServicesRelation EOF ;
    public final EObject entryRuleReactServicesRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactServicesRelation = null;


        try {
            // InternalMyDsl.g:5519:62: (iv_ruleReactServicesRelation= ruleReactServicesRelation EOF )
            // InternalMyDsl.g:5520:2: iv_ruleReactServicesRelation= ruleReactServicesRelation EOF
            {
             newCompositeNode(grammarAccess.getReactServicesRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactServicesRelation=ruleReactServicesRelation();

            state._fsp--;

             current =iv_ruleReactServicesRelation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactServicesRelation"


    // $ANTLR start "ruleReactServicesRelation"
    // InternalMyDsl.g:5526:1: ruleReactServicesRelation returns [EObject current=null] : (otherlv_0= 'ServicesRelations' ( ( (lv_reactrelationcontent_1_0= ruleReactServicesType ) ) ( (lv_name_2_0= RULE_ID ) ) ruleReactRequest )+ ) ;
    public final EObject ruleReactServicesRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        EObject lv_reactrelationcontent_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5532:2: ( (otherlv_0= 'ServicesRelations' ( ( (lv_reactrelationcontent_1_0= ruleReactServicesType ) ) ( (lv_name_2_0= RULE_ID ) ) ruleReactRequest )+ ) )
            // InternalMyDsl.g:5533:2: (otherlv_0= 'ServicesRelations' ( ( (lv_reactrelationcontent_1_0= ruleReactServicesType ) ) ( (lv_name_2_0= RULE_ID ) ) ruleReactRequest )+ )
            {
            // InternalMyDsl.g:5533:2: (otherlv_0= 'ServicesRelations' ( ( (lv_reactrelationcontent_1_0= ruleReactServicesType ) ) ( (lv_name_2_0= RULE_ID ) ) ruleReactRequest )+ )
            // InternalMyDsl.g:5534:3: otherlv_0= 'ServicesRelations' ( ( (lv_reactrelationcontent_1_0= ruleReactServicesType ) ) ( (lv_name_2_0= RULE_ID ) ) ruleReactRequest )+
            {
            otherlv_0=(Token)match(input,117,FOLLOW_114); 

            			newLeafNode(otherlv_0, grammarAccess.getReactServicesRelationAccess().getServicesRelationsKeyword_0());
            		
            // InternalMyDsl.g:5538:3: ( ( (lv_reactrelationcontent_1_0= ruleReactServicesType ) ) ( (lv_name_2_0= RULE_ID ) ) ruleReactRequest )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==115) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMyDsl.g:5539:4: ( (lv_reactrelationcontent_1_0= ruleReactServicesType ) ) ( (lv_name_2_0= RULE_ID ) ) ruleReactRequest
            	    {
            	    // InternalMyDsl.g:5539:4: ( (lv_reactrelationcontent_1_0= ruleReactServicesType ) )
            	    // InternalMyDsl.g:5540:5: (lv_reactrelationcontent_1_0= ruleReactServicesType )
            	    {
            	    // InternalMyDsl.g:5540:5: (lv_reactrelationcontent_1_0= ruleReactServicesType )
            	    // InternalMyDsl.g:5541:6: lv_reactrelationcontent_1_0= ruleReactServicesType
            	    {

            	    						newCompositeNode(grammarAccess.getReactServicesRelationAccess().getReactrelationcontentReactServicesTypeParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_reactrelationcontent_1_0=ruleReactServicesType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getReactServicesRelationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"reactrelationcontent",
            	    							lv_reactrelationcontent_1_0,
            	    							"org.xtext.example.mydsl.MyDsl.ReactServicesType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMyDsl.g:5558:4: ( (lv_name_2_0= RULE_ID ) )
            	    // InternalMyDsl.g:5559:5: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalMyDsl.g:5559:5: (lv_name_2_0= RULE_ID )
            	    // InternalMyDsl.g:5560:6: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_115); 

            	    						newLeafNode(lv_name_2_0, grammarAccess.getReactServicesRelationAccess().getNameIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getReactServicesRelationRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_2_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    				newCompositeNode(grammarAccess.getReactServicesRelationAccess().getReactRequestParserRuleCall_1_2());
            	    			
            	    pushFollow(FOLLOW_116);
            	    ruleReactRequest();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactServicesRelation"


    // $ANTLR start "entryRuleReactRequest"
    // InternalMyDsl.g:5588:1: entryRuleReactRequest returns [String current=null] : iv_ruleReactRequest= ruleReactRequest EOF ;
    public final String entryRuleReactRequest() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReactRequest = null;


        try {
            // InternalMyDsl.g:5588:52: (iv_ruleReactRequest= ruleReactRequest EOF )
            // InternalMyDsl.g:5589:2: iv_ruleReactRequest= ruleReactRequest EOF
            {
             newCompositeNode(grammarAccess.getReactRequestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactRequest=ruleReactRequest();

            state._fsp--;

             current =iv_ruleReactRequest.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactRequest"


    // $ANTLR start "ruleReactRequest"
    // InternalMyDsl.g:5595:1: ruleReactRequest returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Wrapper' | kw= 'AuxWrapper' ) ;
    public final AntlrDatatypeRuleToken ruleReactRequest() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:5601:2: ( (kw= 'Wrapper' | kw= 'AuxWrapper' ) )
            // InternalMyDsl.g:5602:2: (kw= 'Wrapper' | kw= 'AuxWrapper' )
            {
            // InternalMyDsl.g:5602:2: (kw= 'Wrapper' | kw= 'AuxWrapper' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==118) ) {
                alt35=1;
            }
            else if ( (LA35_0==119) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:5603:3: kw= 'Wrapper'
                    {
                    kw=(Token)match(input,118,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactRequestAccess().getWrapperKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5609:3: kw= 'AuxWrapper'
                    {
                    kw=(Token)match(input,119,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactRequestAccess().getAuxWrapperKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactRequest"


    // $ANTLR start "entryRuleReactLibraries"
    // InternalMyDsl.g:5618:1: entryRuleReactLibraries returns [EObject current=null] : iv_ruleReactLibraries= ruleReactLibraries EOF ;
    public final EObject entryRuleReactLibraries() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactLibraries = null;


        try {
            // InternalMyDsl.g:5618:55: (iv_ruleReactLibraries= ruleReactLibraries EOF )
            // InternalMyDsl.g:5619:2: iv_ruleReactLibraries= ruleReactLibraries EOF
            {
             newCompositeNode(grammarAccess.getReactLibrariesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactLibraries=ruleReactLibraries();

            state._fsp--;

             current =iv_ruleReactLibraries; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactLibraries"


    // $ANTLR start "ruleReactLibraries"
    // InternalMyDsl.g:5625:1: ruleReactLibraries returns [EObject current=null] : (otherlv_0= 'ReactLibraries' otherlv_1= ':' otherlv_2= '{' ( (lv_reactlibraries_3_0= ruleReactLibrary ) )+ otherlv_4= '}' ) ;
    public final EObject ruleReactLibraries() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reactlibraries_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5631:2: ( (otherlv_0= 'ReactLibraries' otherlv_1= ':' otherlv_2= '{' ( (lv_reactlibraries_3_0= ruleReactLibrary ) )+ otherlv_4= '}' ) )
            // InternalMyDsl.g:5632:2: (otherlv_0= 'ReactLibraries' otherlv_1= ':' otherlv_2= '{' ( (lv_reactlibraries_3_0= ruleReactLibrary ) )+ otherlv_4= '}' )
            {
            // InternalMyDsl.g:5632:2: (otherlv_0= 'ReactLibraries' otherlv_1= ':' otherlv_2= '{' ( (lv_reactlibraries_3_0= ruleReactLibrary ) )+ otherlv_4= '}' )
            // InternalMyDsl.g:5633:3: otherlv_0= 'ReactLibraries' otherlv_1= ':' otherlv_2= '{' ( (lv_reactlibraries_3_0= ruleReactLibrary ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,120,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReactLibrariesAccess().getReactLibrariesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReactLibrariesAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_117); 

            			newLeafNode(otherlv_2, grammarAccess.getReactLibrariesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:5645:3: ( (lv_reactlibraries_3_0= ruleReactLibrary ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=122 && LA36_0<=127)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalMyDsl.g:5646:4: (lv_reactlibraries_3_0= ruleReactLibrary )
            	    {
            	    // InternalMyDsl.g:5646:4: (lv_reactlibraries_3_0= ruleReactLibrary )
            	    // InternalMyDsl.g:5647:5: lv_reactlibraries_3_0= ruleReactLibrary
            	    {

            	    					newCompositeNode(grammarAccess.getReactLibrariesAccess().getReactlibrariesReactLibraryParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_118);
            	    lv_reactlibraries_3_0=ruleReactLibrary();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactLibrariesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"reactlibraries",
            	    						lv_reactlibraries_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.ReactLibrary");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getReactLibrariesAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactLibraries"


    // $ANTLR start "entryRuleReactLibrary"
    // InternalMyDsl.g:5672:1: entryRuleReactLibrary returns [EObject current=null] : iv_ruleReactLibrary= ruleReactLibrary EOF ;
    public final EObject entryRuleReactLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactLibrary = null;


        try {
            // InternalMyDsl.g:5672:53: (iv_ruleReactLibrary= ruleReactLibrary EOF )
            // InternalMyDsl.g:5673:2: iv_ruleReactLibrary= ruleReactLibrary EOF
            {
             newCompositeNode(grammarAccess.getReactLibraryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactLibrary=ruleReactLibrary();

            state._fsp--;

             current =iv_ruleReactLibrary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactLibrary"


    // $ANTLR start "ruleReactLibrary"
    // InternalMyDsl.g:5679:1: ruleReactLibrary returns [EObject current=null] : ( ruleReactLibraryType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'LibraryContent' ) ;
    public final EObject ruleReactLibrary() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:5685:2: ( ( ruleReactLibraryType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'LibraryContent' ) )
            // InternalMyDsl.g:5686:2: ( ruleReactLibraryType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'LibraryContent' )
            {
            // InternalMyDsl.g:5686:2: ( ruleReactLibraryType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'LibraryContent' )
            // InternalMyDsl.g:5687:3: ruleReactLibraryType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'LibraryContent'
            {

            			newCompositeNode(grammarAccess.getReactLibraryAccess().getReactLibraryTypeParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            ruleReactLibraryType();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:5694:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:5695:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:5695:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:5696:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_119); 

            					newLeafNode(lv_name_1_0, grammarAccess.getReactLibraryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReactLibraryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,121,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getReactLibraryAccess().getLibraryContentKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactLibrary"


    // $ANTLR start "entryRuleReactLibraryType"
    // InternalMyDsl.g:5720:1: entryRuleReactLibraryType returns [String current=null] : iv_ruleReactLibraryType= ruleReactLibraryType EOF ;
    public final String entryRuleReactLibraryType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReactLibraryType = null;


        try {
            // InternalMyDsl.g:5720:56: (iv_ruleReactLibraryType= ruleReactLibraryType EOF )
            // InternalMyDsl.g:5721:2: iv_ruleReactLibraryType= ruleReactLibraryType EOF
            {
             newCompositeNode(grammarAccess.getReactLibraryTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactLibraryType=ruleReactLibraryType();

            state._fsp--;

             current =iv_ruleReactLibraryType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactLibraryType"


    // $ANTLR start "ruleReactLibraryType"
    // InternalMyDsl.g:5727:1: ruleReactLibraryType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ReactDesign' | kw= 'ReactRouting' | kw= 'ComponentManagement' | kw= 'StoreManagement' | kw= 'ReactDeployment' | kw= 'ConfigurationLibrary' ) ;
    public final AntlrDatatypeRuleToken ruleReactLibraryType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:5733:2: ( (kw= 'ReactDesign' | kw= 'ReactRouting' | kw= 'ComponentManagement' | kw= 'StoreManagement' | kw= 'ReactDeployment' | kw= 'ConfigurationLibrary' ) )
            // InternalMyDsl.g:5734:2: (kw= 'ReactDesign' | kw= 'ReactRouting' | kw= 'ComponentManagement' | kw= 'StoreManagement' | kw= 'ReactDeployment' | kw= 'ConfigurationLibrary' )
            {
            // InternalMyDsl.g:5734:2: (kw= 'ReactDesign' | kw= 'ReactRouting' | kw= 'ComponentManagement' | kw= 'StoreManagement' | kw= 'ReactDeployment' | kw= 'ConfigurationLibrary' )
            int alt37=6;
            switch ( input.LA(1) ) {
            case 122:
                {
                alt37=1;
                }
                break;
            case 123:
                {
                alt37=2;
                }
                break;
            case 124:
                {
                alt37=3;
                }
                break;
            case 125:
                {
                alt37=4;
                }
                break;
            case 126:
                {
                alt37=5;
                }
                break;
            case 127:
                {
                alt37=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:5735:3: kw= 'ReactDesign'
                    {
                    kw=(Token)match(input,122,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactLibraryTypeAccess().getReactDesignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5741:3: kw= 'ReactRouting'
                    {
                    kw=(Token)match(input,123,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactLibraryTypeAccess().getReactRoutingKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:5747:3: kw= 'ComponentManagement'
                    {
                    kw=(Token)match(input,124,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactLibraryTypeAccess().getComponentManagementKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:5753:3: kw= 'StoreManagement'
                    {
                    kw=(Token)match(input,125,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactLibraryTypeAccess().getStoreManagementKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:5759:3: kw= 'ReactDeployment'
                    {
                    kw=(Token)match(input,126,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactLibraryTypeAccess().getReactDeploymentKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:5765:3: kw= 'ConfigurationLibrary'
                    {
                    kw=(Token)match(input,127,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactLibraryTypeAccess().getConfigurationLibraryKeyword_5());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactLibraryType"


    // $ANTLR start "entryRuleReactInfo"
    // InternalMyDsl.g:5774:1: entryRuleReactInfo returns [EObject current=null] : iv_ruleReactInfo= ruleReactInfo EOF ;
    public final EObject entryRuleReactInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactInfo = null;


        try {
            // InternalMyDsl.g:5774:50: (iv_ruleReactInfo= ruleReactInfo EOF )
            // InternalMyDsl.g:5775:2: iv_ruleReactInfo= ruleReactInfo EOF
            {
             newCompositeNode(grammarAccess.getReactInfoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactInfo=ruleReactInfo();

            state._fsp--;

             current =iv_ruleReactInfo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactInfo"


    // $ANTLR start "ruleReactInfo"
    // InternalMyDsl.g:5781:1: ruleReactInfo returns [EObject current=null] : (otherlv_0= 'ReactInformation' otherlv_1= ':' otherlv_2= '{' ( (lv_reactinformation_3_0= ruleReactInformation ) )+ otherlv_4= '}' ) ;
    public final EObject ruleReactInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reactinformation_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5787:2: ( (otherlv_0= 'ReactInformation' otherlv_1= ':' otherlv_2= '{' ( (lv_reactinformation_3_0= ruleReactInformation ) )+ otherlv_4= '}' ) )
            // InternalMyDsl.g:5788:2: (otherlv_0= 'ReactInformation' otherlv_1= ':' otherlv_2= '{' ( (lv_reactinformation_3_0= ruleReactInformation ) )+ otherlv_4= '}' )
            {
            // InternalMyDsl.g:5788:2: (otherlv_0= 'ReactInformation' otherlv_1= ':' otherlv_2= '{' ( (lv_reactinformation_3_0= ruleReactInformation ) )+ otherlv_4= '}' )
            // InternalMyDsl.g:5789:3: otherlv_0= 'ReactInformation' otherlv_1= ':' otherlv_2= '{' ( (lv_reactinformation_3_0= ruleReactInformation ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,128,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReactInfoAccess().getReactInformationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReactInfoAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_120); 

            			newLeafNode(otherlv_2, grammarAccess.getReactInfoAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:5801:3: ( (lv_reactinformation_3_0= ruleReactInformation ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=130 && LA38_0<=131)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMyDsl.g:5802:4: (lv_reactinformation_3_0= ruleReactInformation )
            	    {
            	    // InternalMyDsl.g:5802:4: (lv_reactinformation_3_0= ruleReactInformation )
            	    // InternalMyDsl.g:5803:5: lv_reactinformation_3_0= ruleReactInformation
            	    {

            	    					newCompositeNode(grammarAccess.getReactInfoAccess().getReactinformationReactInformationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_121);
            	    lv_reactinformation_3_0=ruleReactInformation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactInfoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"reactinformation",
            	    						lv_reactinformation_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.ReactInformation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getReactInfoAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactInfo"


    // $ANTLR start "entryRuleReactInformation"
    // InternalMyDsl.g:5828:1: entryRuleReactInformation returns [EObject current=null] : iv_ruleReactInformation= ruleReactInformation EOF ;
    public final EObject entryRuleReactInformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactInformation = null;


        try {
            // InternalMyDsl.g:5828:57: (iv_ruleReactInformation= ruleReactInformation EOF )
            // InternalMyDsl.g:5829:2: iv_ruleReactInformation= ruleReactInformation EOF
            {
             newCompositeNode(grammarAccess.getReactInformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactInformation=ruleReactInformation();

            state._fsp--;

             current =iv_ruleReactInformation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactInformation"


    // $ANTLR start "ruleReactInformation"
    // InternalMyDsl.g:5835:1: ruleReactInformation returns [EObject current=null] : ( ruleReactInformationType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'InformationContent' ) ;
    public final EObject ruleReactInformation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:5841:2: ( ( ruleReactInformationType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'InformationContent' ) )
            // InternalMyDsl.g:5842:2: ( ruleReactInformationType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'InformationContent' )
            {
            // InternalMyDsl.g:5842:2: ( ruleReactInformationType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'InformationContent' )
            // InternalMyDsl.g:5843:3: ruleReactInformationType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'InformationContent'
            {

            			newCompositeNode(grammarAccess.getReactInformationAccess().getReactInformationTypeParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            ruleReactInformationType();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:5850:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:5851:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:5851:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:5852:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_122); 

            					newLeafNode(lv_name_1_0, grammarAccess.getReactInformationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReactInformationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,129,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getReactInformationAccess().getInformationContentKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactInformation"


    // $ANTLR start "entryRuleReactInformationType"
    // InternalMyDsl.g:5876:1: entryRuleReactInformationType returns [String current=null] : iv_ruleReactInformationType= ruleReactInformationType EOF ;
    public final String entryRuleReactInformationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReactInformationType = null;


        try {
            // InternalMyDsl.g:5876:60: (iv_ruleReactInformationType= ruleReactInformationType EOF )
            // InternalMyDsl.g:5877:2: iv_ruleReactInformationType= ruleReactInformationType EOF
            {
             newCompositeNode(grammarAccess.getReactInformationTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactInformationType=ruleReactInformationType();

            state._fsp--;

             current =iv_ruleReactInformationType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactInformationType"


    // $ANTLR start "ruleReactInformationType"
    // InternalMyDsl.g:5883:1: ruleReactInformationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ReactReadme' | kw= 'ReactAditionalInfo' ) ;
    public final AntlrDatatypeRuleToken ruleReactInformationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:5889:2: ( (kw= 'ReactReadme' | kw= 'ReactAditionalInfo' ) )
            // InternalMyDsl.g:5890:2: (kw= 'ReactReadme' | kw= 'ReactAditionalInfo' )
            {
            // InternalMyDsl.g:5890:2: (kw= 'ReactReadme' | kw= 'ReactAditionalInfo' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==130) ) {
                alt39=1;
            }
            else if ( (LA39_0==131) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:5891:3: kw= 'ReactReadme'
                    {
                    kw=(Token)match(input,130,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactInformationTypeAccess().getReactReadmeKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5897:3: kw= 'ReactAditionalInfo'
                    {
                    kw=(Token)match(input,131,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactInformationTypeAccess().getReactAditionalInfoKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactInformationType"


    // $ANTLR start "entryRuleSpring"
    // InternalMyDsl.g:5906:1: entryRuleSpring returns [EObject current=null] : iv_ruleSpring= ruleSpring EOF ;
    public final EObject entryRuleSpring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpring = null;


        try {
            // InternalMyDsl.g:5906:47: (iv_ruleSpring= ruleSpring EOF )
            // InternalMyDsl.g:5907:2: iv_ruleSpring= ruleSpring EOF
            {
             newCompositeNode(grammarAccess.getSpringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpring=ruleSpring();

            state._fsp--;

             current =iv_ruleSpring; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpring"


    // $ANTLR start "ruleSpring"
    // InternalMyDsl.g:5913:1: ruleSpring returns [EObject current=null] : (otherlv_0= 'Spring' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSpring() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:5919:2: ( (otherlv_0= 'Spring' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:5920:2: (otherlv_0= 'Spring' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:5920:2: (otherlv_0= 'Spring' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:5921:3: otherlv_0= 'Spring' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,132,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSpringAccess().getSpringKeyword_0());
            		
            // InternalMyDsl.g:5925:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:5926:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:5926:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:5927:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSpringAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpring"


    // $ANTLR start "entryRulePostgreSQL"
    // InternalMyDsl.g:5947:1: entryRulePostgreSQL returns [EObject current=null] : iv_rulePostgreSQL= rulePostgreSQL EOF ;
    public final EObject entryRulePostgreSQL() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostgreSQL = null;


        try {
            // InternalMyDsl.g:5947:51: (iv_rulePostgreSQL= rulePostgreSQL EOF )
            // InternalMyDsl.g:5948:2: iv_rulePostgreSQL= rulePostgreSQL EOF
            {
             newCompositeNode(grammarAccess.getPostgreSQLRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePostgreSQL=rulePostgreSQL();

            state._fsp--;

             current =iv_rulePostgreSQL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePostgreSQL"


    // $ANTLR start "rulePostgreSQL"
    // InternalMyDsl.g:5954:1: rulePostgreSQL returns [EObject current=null] : (otherlv_0= 'PostgreSQL' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePostgreSQL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:5960:2: ( (otherlv_0= 'PostgreSQL' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:5961:2: (otherlv_0= 'PostgreSQL' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:5961:2: (otherlv_0= 'PostgreSQL' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:5962:3: otherlv_0= 'PostgreSQL' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,133,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPostgreSQLAccess().getPostgreSQLKeyword_0());
            		
            // InternalMyDsl.g:5966:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:5967:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:5967:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:5968:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPostgreSQLAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPostgreSQLRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePostgreSQL"


    // $ANTLR start "entryRuleAmazonWebServices"
    // InternalMyDsl.g:5988:1: entryRuleAmazonWebServices returns [EObject current=null] : iv_ruleAmazonWebServices= ruleAmazonWebServices EOF ;
    public final EObject entryRuleAmazonWebServices() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmazonWebServices = null;


        try {
            // InternalMyDsl.g:5988:58: (iv_ruleAmazonWebServices= ruleAmazonWebServices EOF )
            // InternalMyDsl.g:5989:2: iv_ruleAmazonWebServices= ruleAmazonWebServices EOF
            {
             newCompositeNode(grammarAccess.getAmazonWebServicesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAmazonWebServices=ruleAmazonWebServices();

            state._fsp--;

             current =iv_ruleAmazonWebServices; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAmazonWebServices"


    // $ANTLR start "ruleAmazonWebServices"
    // InternalMyDsl.g:5995:1: ruleAmazonWebServices returns [EObject current=null] : (otherlv_0= 'AmazonWebServices' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAmazonWebServices() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:6001:2: ( (otherlv_0= 'AmazonWebServices' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:6002:2: (otherlv_0= 'AmazonWebServices' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:6002:2: (otherlv_0= 'AmazonWebServices' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:6003:3: otherlv_0= 'AmazonWebServices' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,134,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAmazonWebServicesAccess().getAmazonWebServicesKeyword_0());
            		
            // InternalMyDsl.g:6007:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:6008:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:6008:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:6009:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAmazonWebServicesAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAmazonWebServicesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAmazonWebServices"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000080L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0xC000020000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000840000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000700L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000700L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000870L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000002L,0x0000000003E00000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000010L,0x0000E80000000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000000L,0x000003F000000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000000000L,0x00C0000000000000L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000000004000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});

}