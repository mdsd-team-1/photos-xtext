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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'System'", "':'", "'{'", "'}'", "'Domain'", "'Entities'", "'Photo'", "'Album'", "'UserDomain'", "'Functionalities'", "'ProfileManagement'", "'ViewProfilePhoto'", "'EditProfileInfo'", "'AppAccess'", "'Login'", "'Register'", "'AlbumManagement'", "'CreateAlbum'", "'SelectAlbum'", "'PhotoActions'", "'ViewAllPhotos'", "'ViewExtendedPhoto'", "'LoadPhoto'", "'LandingActions'", "'ViewCarousel'", "'PassPhoto'", "'DomainRelations'", "'Architecture:'", "'Technology'", "'React'", "'ReactModules'", "'ReactConfiguration'", "'DependenciesStruct'", "'DependencyType'", "'PackageName'", "'PackageVersion'", "'ReactDOMConfigurations'", "'RoutingConf'", "'ServiceWorker'", "'HTMLStructure'", "'Manifest'", "'RepositoriesConf'", "'ReactComponents'", "'LogicComponents'", "'RoutingComponents'", "'AppComponent'", "'IndexComponent'", "'UIComponents'", "'ViewComponent'", "'Subcomponents'", "'Constructor'", "'State'", "'String'", "'Array'", "'Object'", "'Number'", "'null'", "'Boolean'", "'FunctionBindingDeclaration'", "'ComponentDidMount'", "'FunctionStructure'", "'ComponentDidUpdate'", "'ComponentWillUnmount'", "'Render'", "'RenderContent'", "'Props'", "'ReactActions'", "'ServiceType'", "'ServiceContent'", "'ServicesRelations'", "'Wrapper'", "'AuxWrapper'", "'ReactLibraries'", "'LibraryContent'", "'ReactDesign'", "'ReactRouting'", "'ComponentManagement'", "'StoreManagement'", "'ReactDeployment'", "'ConfigurationLibrary'", "'ReactInformation'", "'InformationContent'", "'ReactReadme'", "'ReactAditionalInfo'", "'Spring'", "'PostgreSQL'", "'AmazonWebServices'"
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
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
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
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
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
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

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
    // InternalMyDsl.g:1606:1: ruleArchitecture returns [EObject current=null] : (otherlv_0= 'Architecture:' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}' ) ;
    public final EObject ruleArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1612:2: ( (otherlv_0= 'Architecture:' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}' ) )
            // InternalMyDsl.g:1613:2: (otherlv_0= 'Architecture:' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}' )
            {
            // InternalMyDsl.g:1613:2: (otherlv_0= 'Architecture:' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}' )
            // InternalMyDsl.g:1614:3: otherlv_0= 'Architecture:' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getArchitectureAccess().getArchitectureKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:1622:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:1623:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:1623:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:1624:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getArchitectureAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArchitectureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_3());
            		

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


    // $ANTLR start "entryRuleTechnology"
    // InternalMyDsl.g:1648:1: entryRuleTechnology returns [EObject current=null] : iv_ruleTechnology= ruleTechnology EOF ;
    public final EObject entryRuleTechnology() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTechnology = null;


        try {
            // InternalMyDsl.g:1648:51: (iv_ruleTechnology= ruleTechnology EOF )
            // InternalMyDsl.g:1649:2: iv_ruleTechnology= ruleTechnology EOF
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
    // InternalMyDsl.g:1655:1: ruleTechnology returns [EObject current=null] : (otherlv_0= 'Technology' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleTechnologies ) ) otherlv_5= '}' ) ;
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
            // InternalMyDsl.g:1661:2: ( (otherlv_0= 'Technology' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleTechnologies ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:1662:2: (otherlv_0= 'Technology' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleTechnologies ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:1662:2: (otherlv_0= 'Technology' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleTechnologies ) ) otherlv_5= '}' )
            // InternalMyDsl.g:1663:3: otherlv_0= 'Technology' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_elements_4_0= ruleTechnologies ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTechnologyAccess().getTechnologyKeyword_0());
            		
            // InternalMyDsl.g:1667:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1668:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1668:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1669:5: lv_name_1_0= RULE_ID
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
            		
            otherlv_3=(Token)match(input,13,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1693:3: ( (lv_elements_4_0= ruleTechnologies ) )
            // InternalMyDsl.g:1694:4: (lv_elements_4_0= ruleTechnologies )
            {
            // InternalMyDsl.g:1694:4: (lv_elements_4_0= ruleTechnologies )
            // InternalMyDsl.g:1695:5: lv_elements_4_0= ruleTechnologies
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
    // InternalMyDsl.g:1720:1: entryRuleTechnologies returns [EObject current=null] : iv_ruleTechnologies= ruleTechnologies EOF ;
    public final EObject entryRuleTechnologies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTechnologies = null;


        try {
            // InternalMyDsl.g:1720:53: (iv_ruleTechnologies= ruleTechnologies EOF )
            // InternalMyDsl.g:1721:2: iv_ruleTechnologies= ruleTechnologies EOF
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
    // InternalMyDsl.g:1727:1: ruleTechnologies returns [EObject current=null] : ( ( (lv_factors_0_0= ruleSpring ) ) ( (lv_factors_1_0= ruleReact ) ) ( (lv_factors_2_0= rulePostgreSQL ) ) ( (lv_factors_3_0= ruleAmazonWebServices ) ) ) ;
    public final EObject ruleTechnologies() throws RecognitionException {
        EObject current = null;

        EObject lv_factors_0_0 = null;

        EObject lv_factors_1_0 = null;

        EObject lv_factors_2_0 = null;

        EObject lv_factors_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1733:2: ( ( ( (lv_factors_0_0= ruleSpring ) ) ( (lv_factors_1_0= ruleReact ) ) ( (lv_factors_2_0= rulePostgreSQL ) ) ( (lv_factors_3_0= ruleAmazonWebServices ) ) ) )
            // InternalMyDsl.g:1734:2: ( ( (lv_factors_0_0= ruleSpring ) ) ( (lv_factors_1_0= ruleReact ) ) ( (lv_factors_2_0= rulePostgreSQL ) ) ( (lv_factors_3_0= ruleAmazonWebServices ) ) )
            {
            // InternalMyDsl.g:1734:2: ( ( (lv_factors_0_0= ruleSpring ) ) ( (lv_factors_1_0= ruleReact ) ) ( (lv_factors_2_0= rulePostgreSQL ) ) ( (lv_factors_3_0= ruleAmazonWebServices ) ) )
            // InternalMyDsl.g:1735:3: ( (lv_factors_0_0= ruleSpring ) ) ( (lv_factors_1_0= ruleReact ) ) ( (lv_factors_2_0= rulePostgreSQL ) ) ( (lv_factors_3_0= ruleAmazonWebServices ) )
            {
            // InternalMyDsl.g:1735:3: ( (lv_factors_0_0= ruleSpring ) )
            // InternalMyDsl.g:1736:4: (lv_factors_0_0= ruleSpring )
            {
            // InternalMyDsl.g:1736:4: (lv_factors_0_0= ruleSpring )
            // InternalMyDsl.g:1737:5: lv_factors_0_0= ruleSpring
            {

            					newCompositeNode(grammarAccess.getTechnologiesAccess().getFactorsSpringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
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

            // InternalMyDsl.g:1754:3: ( (lv_factors_1_0= ruleReact ) )
            // InternalMyDsl.g:1755:4: (lv_factors_1_0= ruleReact )
            {
            // InternalMyDsl.g:1755:4: (lv_factors_1_0= ruleReact )
            // InternalMyDsl.g:1756:5: lv_factors_1_0= ruleReact
            {

            					newCompositeNode(grammarAccess.getTechnologiesAccess().getFactorsReactParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_37);
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

            // InternalMyDsl.g:1773:3: ( (lv_factors_2_0= rulePostgreSQL ) )
            // InternalMyDsl.g:1774:4: (lv_factors_2_0= rulePostgreSQL )
            {
            // InternalMyDsl.g:1774:4: (lv_factors_2_0= rulePostgreSQL )
            // InternalMyDsl.g:1775:5: lv_factors_2_0= rulePostgreSQL
            {

            					newCompositeNode(grammarAccess.getTechnologiesAccess().getFactorsPostgreSQLParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_38);
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

            // InternalMyDsl.g:1792:3: ( (lv_factors_3_0= ruleAmazonWebServices ) )
            // InternalMyDsl.g:1793:4: (lv_factors_3_0= ruleAmazonWebServices )
            {
            // InternalMyDsl.g:1793:4: (lv_factors_3_0= ruleAmazonWebServices )
            // InternalMyDsl.g:1794:5: lv_factors_3_0= ruleAmazonWebServices
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
    // InternalMyDsl.g:1815:1: entryRuleReact returns [EObject current=null] : iv_ruleReact= ruleReact EOF ;
    public final EObject entryRuleReact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReact = null;


        try {
            // InternalMyDsl.g:1815:46: (iv_ruleReact= ruleReact EOF )
            // InternalMyDsl.g:1816:2: iv_ruleReact= ruleReact EOF
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
    // InternalMyDsl.g:1822:1: ruleReact returns [EObject current=null] : (otherlv_0= 'React' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_reacts_4_0= ruleReactModules ) ) otherlv_5= '}' ) ;
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
            // InternalMyDsl.g:1828:2: ( (otherlv_0= 'React' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_reacts_4_0= ruleReactModules ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:1829:2: (otherlv_0= 'React' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_reacts_4_0= ruleReactModules ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:1829:2: (otherlv_0= 'React' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_reacts_4_0= ruleReactModules ) ) otherlv_5= '}' )
            // InternalMyDsl.g:1830:3: otherlv_0= 'React' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_reacts_4_0= ruleReactModules ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReactAccess().getReactKeyword_0());
            		
            // InternalMyDsl.g:1834:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1835:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1835:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1836:5: lv_name_1_0= RULE_ID
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
            		
            otherlv_3=(Token)match(input,13,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getReactAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1860:3: ( (lv_reacts_4_0= ruleReactModules ) )
            // InternalMyDsl.g:1861:4: (lv_reacts_4_0= ruleReactModules )
            {
            // InternalMyDsl.g:1861:4: (lv_reacts_4_0= ruleReactModules )
            // InternalMyDsl.g:1862:5: lv_reacts_4_0= ruleReactModules
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
    // InternalMyDsl.g:1887:1: entryRuleReactModules returns [EObject current=null] : iv_ruleReactModules= ruleReactModules EOF ;
    public final EObject entryRuleReactModules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactModules = null;


        try {
            // InternalMyDsl.g:1887:53: (iv_ruleReactModules= ruleReactModules EOF )
            // InternalMyDsl.g:1888:2: iv_ruleReactModules= ruleReactModules EOF
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
    // InternalMyDsl.g:1894:1: ruleReactModules returns [EObject current=null] : (otherlv_0= 'ReactModules' otherlv_1= ':' otherlv_2= '{' ( (lv_reactmodules_3_0= ruleReactSubModules ) ) otherlv_4= '}' ) ;
    public final EObject ruleReactModules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reactmodules_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1900:2: ( (otherlv_0= 'ReactModules' otherlv_1= ':' otherlv_2= '{' ( (lv_reactmodules_3_0= ruleReactSubModules ) ) otherlv_4= '}' ) )
            // InternalMyDsl.g:1901:2: (otherlv_0= 'ReactModules' otherlv_1= ':' otherlv_2= '{' ( (lv_reactmodules_3_0= ruleReactSubModules ) ) otherlv_4= '}' )
            {
            // InternalMyDsl.g:1901:2: (otherlv_0= 'ReactModules' otherlv_1= ':' otherlv_2= '{' ( (lv_reactmodules_3_0= ruleReactSubModules ) ) otherlv_4= '}' )
            // InternalMyDsl.g:1902:3: otherlv_0= 'ReactModules' otherlv_1= ':' otherlv_2= '{' ( (lv_reactmodules_3_0= ruleReactSubModules ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReactModulesAccess().getReactModulesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReactModulesAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getReactModulesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1914:3: ( (lv_reactmodules_3_0= ruleReactSubModules ) )
            // InternalMyDsl.g:1915:4: (lv_reactmodules_3_0= ruleReactSubModules )
            {
            // InternalMyDsl.g:1915:4: (lv_reactmodules_3_0= ruleReactSubModules )
            // InternalMyDsl.g:1916:5: lv_reactmodules_3_0= ruleReactSubModules
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
    // InternalMyDsl.g:1941:1: entryRuleReactSubModules returns [EObject current=null] : iv_ruleReactSubModules= ruleReactSubModules EOF ;
    public final EObject entryRuleReactSubModules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactSubModules = null;


        try {
            // InternalMyDsl.g:1941:56: (iv_ruleReactSubModules= ruleReactSubModules EOF )
            // InternalMyDsl.g:1942:2: iv_ruleReactSubModules= ruleReactSubModules EOF
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
    // InternalMyDsl.g:1948:1: ruleReactSubModules returns [EObject current=null] : ( ( (lv_reactmodules_0_0= ruleReactConfiguration ) ) ( (lv_reactmodules_1_0= ruleReactComponents ) ) ( (lv_reactmodules_2_0= ruleReactActions ) ) ( (lv_reactmodules_3_0= ruleReactLibraries ) ) ( (lv_reactmodules_4_0= ruleReactInfo ) ) ) ;
    public final EObject ruleReactSubModules() throws RecognitionException {
        EObject current = null;

        EObject lv_reactmodules_0_0 = null;

        EObject lv_reactmodules_1_0 = null;

        EObject lv_reactmodules_2_0 = null;

        EObject lv_reactmodules_3_0 = null;

        EObject lv_reactmodules_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1954:2: ( ( ( (lv_reactmodules_0_0= ruleReactConfiguration ) ) ( (lv_reactmodules_1_0= ruleReactComponents ) ) ( (lv_reactmodules_2_0= ruleReactActions ) ) ( (lv_reactmodules_3_0= ruleReactLibraries ) ) ( (lv_reactmodules_4_0= ruleReactInfo ) ) ) )
            // InternalMyDsl.g:1955:2: ( ( (lv_reactmodules_0_0= ruleReactConfiguration ) ) ( (lv_reactmodules_1_0= ruleReactComponents ) ) ( (lv_reactmodules_2_0= ruleReactActions ) ) ( (lv_reactmodules_3_0= ruleReactLibraries ) ) ( (lv_reactmodules_4_0= ruleReactInfo ) ) )
            {
            // InternalMyDsl.g:1955:2: ( ( (lv_reactmodules_0_0= ruleReactConfiguration ) ) ( (lv_reactmodules_1_0= ruleReactComponents ) ) ( (lv_reactmodules_2_0= ruleReactActions ) ) ( (lv_reactmodules_3_0= ruleReactLibraries ) ) ( (lv_reactmodules_4_0= ruleReactInfo ) ) )
            // InternalMyDsl.g:1956:3: ( (lv_reactmodules_0_0= ruleReactConfiguration ) ) ( (lv_reactmodules_1_0= ruleReactComponents ) ) ( (lv_reactmodules_2_0= ruleReactActions ) ) ( (lv_reactmodules_3_0= ruleReactLibraries ) ) ( (lv_reactmodules_4_0= ruleReactInfo ) )
            {
            // InternalMyDsl.g:1956:3: ( (lv_reactmodules_0_0= ruleReactConfiguration ) )
            // InternalMyDsl.g:1957:4: (lv_reactmodules_0_0= ruleReactConfiguration )
            {
            // InternalMyDsl.g:1957:4: (lv_reactmodules_0_0= ruleReactConfiguration )
            // InternalMyDsl.g:1958:5: lv_reactmodules_0_0= ruleReactConfiguration
            {

            					newCompositeNode(grammarAccess.getReactSubModulesAccess().getReactmodulesReactConfigurationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_41);
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

            // InternalMyDsl.g:1975:3: ( (lv_reactmodules_1_0= ruleReactComponents ) )
            // InternalMyDsl.g:1976:4: (lv_reactmodules_1_0= ruleReactComponents )
            {
            // InternalMyDsl.g:1976:4: (lv_reactmodules_1_0= ruleReactComponents )
            // InternalMyDsl.g:1977:5: lv_reactmodules_1_0= ruleReactComponents
            {

            					newCompositeNode(grammarAccess.getReactSubModulesAccess().getReactmodulesReactComponentsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_42);
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

            // InternalMyDsl.g:1994:3: ( (lv_reactmodules_2_0= ruleReactActions ) )
            // InternalMyDsl.g:1995:4: (lv_reactmodules_2_0= ruleReactActions )
            {
            // InternalMyDsl.g:1995:4: (lv_reactmodules_2_0= ruleReactActions )
            // InternalMyDsl.g:1996:5: lv_reactmodules_2_0= ruleReactActions
            {

            					newCompositeNode(grammarAccess.getReactSubModulesAccess().getReactmodulesReactActionsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_43);
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

            // InternalMyDsl.g:2013:3: ( (lv_reactmodules_3_0= ruleReactLibraries ) )
            // InternalMyDsl.g:2014:4: (lv_reactmodules_3_0= ruleReactLibraries )
            {
            // InternalMyDsl.g:2014:4: (lv_reactmodules_3_0= ruleReactLibraries )
            // InternalMyDsl.g:2015:5: lv_reactmodules_3_0= ruleReactLibraries
            {

            					newCompositeNode(grammarAccess.getReactSubModulesAccess().getReactmodulesReactLibrariesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_44);
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

            // InternalMyDsl.g:2032:3: ( (lv_reactmodules_4_0= ruleReactInfo ) )
            // InternalMyDsl.g:2033:4: (lv_reactmodules_4_0= ruleReactInfo )
            {
            // InternalMyDsl.g:2033:4: (lv_reactmodules_4_0= ruleReactInfo )
            // InternalMyDsl.g:2034:5: lv_reactmodules_4_0= ruleReactInfo
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
    // InternalMyDsl.g:2055:1: entryRuleReactConfiguration returns [EObject current=null] : iv_ruleReactConfiguration= ruleReactConfiguration EOF ;
    public final EObject entryRuleReactConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactConfiguration = null;


        try {
            // InternalMyDsl.g:2055:59: (iv_ruleReactConfiguration= ruleReactConfiguration EOF )
            // InternalMyDsl.g:2056:2: iv_ruleReactConfiguration= ruleReactConfiguration EOF
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
    // InternalMyDsl.g:2062:1: ruleReactConfiguration returns [EObject current=null] : (otherlv_0= 'ReactConfiguration' otherlv_1= ':' otherlv_2= '{' ( (lv_dependencies_3_0= ruleReactDependencies ) ) ( (lv_configurations_4_0= ruleReactConfigurations ) ) otherlv_5= '}' ) ;
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
            // InternalMyDsl.g:2068:2: ( (otherlv_0= 'ReactConfiguration' otherlv_1= ':' otherlv_2= '{' ( (lv_dependencies_3_0= ruleReactDependencies ) ) ( (lv_configurations_4_0= ruleReactConfigurations ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:2069:2: (otherlv_0= 'ReactConfiguration' otherlv_1= ':' otherlv_2= '{' ( (lv_dependencies_3_0= ruleReactDependencies ) ) ( (lv_configurations_4_0= ruleReactConfigurations ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:2069:2: (otherlv_0= 'ReactConfiguration' otherlv_1= ':' otherlv_2= '{' ( (lv_dependencies_3_0= ruleReactDependencies ) ) ( (lv_configurations_4_0= ruleReactConfigurations ) ) otherlv_5= '}' )
            // InternalMyDsl.g:2070:3: otherlv_0= 'ReactConfiguration' otherlv_1= ':' otherlv_2= '{' ( (lv_dependencies_3_0= ruleReactDependencies ) ) ( (lv_configurations_4_0= ruleReactConfigurations ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReactConfigurationAccess().getReactConfigurationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReactConfigurationAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getReactConfigurationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2082:3: ( (lv_dependencies_3_0= ruleReactDependencies ) )
            // InternalMyDsl.g:2083:4: (lv_dependencies_3_0= ruleReactDependencies )
            {
            // InternalMyDsl.g:2083:4: (lv_dependencies_3_0= ruleReactDependencies )
            // InternalMyDsl.g:2084:5: lv_dependencies_3_0= ruleReactDependencies
            {

            					newCompositeNode(grammarAccess.getReactConfigurationAccess().getDependenciesReactDependenciesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_46);
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

            // InternalMyDsl.g:2101:3: ( (lv_configurations_4_0= ruleReactConfigurations ) )
            // InternalMyDsl.g:2102:4: (lv_configurations_4_0= ruleReactConfigurations )
            {
            // InternalMyDsl.g:2102:4: (lv_configurations_4_0= ruleReactConfigurations )
            // InternalMyDsl.g:2103:5: lv_configurations_4_0= ruleReactConfigurations
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
    // InternalMyDsl.g:2128:1: entryRuleReactDependencies returns [EObject current=null] : iv_ruleReactDependencies= ruleReactDependencies EOF ;
    public final EObject entryRuleReactDependencies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactDependencies = null;


        try {
            // InternalMyDsl.g:2128:58: (iv_ruleReactDependencies= ruleReactDependencies EOF )
            // InternalMyDsl.g:2129:2: iv_ruleReactDependencies= ruleReactDependencies EOF
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
    // InternalMyDsl.g:2135:1: ruleReactDependencies returns [EObject current=null] : (otherlv_0= 'DependenciesStruct' ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+ ) ;
    public final EObject ruleReactDependencies() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_dependencies_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2141:2: ( (otherlv_0= 'DependenciesStruct' ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+ ) )
            // InternalMyDsl.g:2142:2: (otherlv_0= 'DependenciesStruct' ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+ )
            {
            // InternalMyDsl.g:2142:2: (otherlv_0= 'DependenciesStruct' ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+ )
            // InternalMyDsl.g:2143:3: otherlv_0= 'DependenciesStruct' ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+
            {
            otherlv_0=(Token)match(input,43,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getReactDependenciesAccess().getDependenciesStructKeyword_0());
            		
            // InternalMyDsl.g:2147:3: ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==44) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:2148:4: (lv_dependencies_1_0= ruleReactDependenciesRules )
            	    {
            	    // InternalMyDsl.g:2148:4: (lv_dependencies_1_0= ruleReactDependenciesRules )
            	    // InternalMyDsl.g:2149:5: lv_dependencies_1_0= ruleReactDependenciesRules
            	    {

            	    					newCompositeNode(grammarAccess.getReactDependenciesAccess().getDependenciesReactDependenciesRulesParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_48);
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // InternalMyDsl.g:2170:1: entryRuleReactDependenciesRules returns [EObject current=null] : iv_ruleReactDependenciesRules= ruleReactDependenciesRules EOF ;
    public final EObject entryRuleReactDependenciesRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactDependenciesRules = null;


        try {
            // InternalMyDsl.g:2170:63: (iv_ruleReactDependenciesRules= ruleReactDependenciesRules EOF )
            // InternalMyDsl.g:2171:2: iv_ruleReactDependenciesRules= ruleReactDependenciesRules EOF
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
    // InternalMyDsl.g:2177:1: ruleReactDependenciesRules returns [EObject current=null] : (otherlv_0= 'DependencyType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+ ) ;
    public final EObject ruleReactDependenciesRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_dependencies_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2183:2: ( (otherlv_0= 'DependencyType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+ ) )
            // InternalMyDsl.g:2184:2: (otherlv_0= 'DependencyType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+ )
            {
            // InternalMyDsl.g:2184:2: (otherlv_0= 'DependencyType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+ )
            // InternalMyDsl.g:2185:3: otherlv_0= 'DependencyType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+
            {
            otherlv_0=(Token)match(input,44,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReactDependenciesRulesAccess().getDependencyTypeKeyword_0());
            		
            // InternalMyDsl.g:2189:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2190:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2190:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2191:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_49); 

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

            // InternalMyDsl.g:2207:3: ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==45) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:2208:4: (lv_dependencies_2_0= ruleReactDependenciesSubRules )
            	    {
            	    // InternalMyDsl.g:2208:4: (lv_dependencies_2_0= ruleReactDependenciesSubRules )
            	    // InternalMyDsl.g:2209:5: lv_dependencies_2_0= ruleReactDependenciesSubRules
            	    {

            	    					newCompositeNode(grammarAccess.getReactDependenciesRulesAccess().getDependenciesReactDependenciesSubRulesParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_50);
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // InternalMyDsl.g:2230:1: entryRuleReactDependenciesSubRules returns [EObject current=null] : iv_ruleReactDependenciesSubRules= ruleReactDependenciesSubRules EOF ;
    public final EObject entryRuleReactDependenciesSubRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactDependenciesSubRules = null;


        try {
            // InternalMyDsl.g:2230:66: (iv_ruleReactDependenciesSubRules= ruleReactDependenciesSubRules EOF )
            // InternalMyDsl.g:2231:2: iv_ruleReactDependenciesSubRules= ruleReactDependenciesSubRules EOF
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
    // InternalMyDsl.g:2237:1: ruleReactDependenciesSubRules returns [EObject current=null] : ( (lv_dependencies_0_0= ruleSingleDependencies ) ) ;
    public final EObject ruleReactDependenciesSubRules() throws RecognitionException {
        EObject current = null;

        EObject lv_dependencies_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2243:2: ( ( (lv_dependencies_0_0= ruleSingleDependencies ) ) )
            // InternalMyDsl.g:2244:2: ( (lv_dependencies_0_0= ruleSingleDependencies ) )
            {
            // InternalMyDsl.g:2244:2: ( (lv_dependencies_0_0= ruleSingleDependencies ) )
            // InternalMyDsl.g:2245:3: (lv_dependencies_0_0= ruleSingleDependencies )
            {
            // InternalMyDsl.g:2245:3: (lv_dependencies_0_0= ruleSingleDependencies )
            // InternalMyDsl.g:2246:4: lv_dependencies_0_0= ruleSingleDependencies
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
    // InternalMyDsl.g:2266:1: entryRuleSingleDependencies returns [EObject current=null] : iv_ruleSingleDependencies= ruleSingleDependencies EOF ;
    public final EObject entryRuleSingleDependencies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleDependencies = null;


        try {
            // InternalMyDsl.g:2266:59: (iv_ruleSingleDependencies= ruleSingleDependencies EOF )
            // InternalMyDsl.g:2267:2: iv_ruleSingleDependencies= ruleSingleDependencies EOF
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
    // InternalMyDsl.g:2273:1: ruleSingleDependencies returns [EObject current=null] : ( ( (lv_dependencies_0_0= rulePackageName ) ) ( (lv_dependencies_1_0= rulePackageVersion ) ) ) ;
    public final EObject ruleSingleDependencies() throws RecognitionException {
        EObject current = null;

        EObject lv_dependencies_0_0 = null;

        EObject lv_dependencies_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2279:2: ( ( ( (lv_dependencies_0_0= rulePackageName ) ) ( (lv_dependencies_1_0= rulePackageVersion ) ) ) )
            // InternalMyDsl.g:2280:2: ( ( (lv_dependencies_0_0= rulePackageName ) ) ( (lv_dependencies_1_0= rulePackageVersion ) ) )
            {
            // InternalMyDsl.g:2280:2: ( ( (lv_dependencies_0_0= rulePackageName ) ) ( (lv_dependencies_1_0= rulePackageVersion ) ) )
            // InternalMyDsl.g:2281:3: ( (lv_dependencies_0_0= rulePackageName ) ) ( (lv_dependencies_1_0= rulePackageVersion ) )
            {
            // InternalMyDsl.g:2281:3: ( (lv_dependencies_0_0= rulePackageName ) )
            // InternalMyDsl.g:2282:4: (lv_dependencies_0_0= rulePackageName )
            {
            // InternalMyDsl.g:2282:4: (lv_dependencies_0_0= rulePackageName )
            // InternalMyDsl.g:2283:5: lv_dependencies_0_0= rulePackageName
            {

            					newCompositeNode(grammarAccess.getSingleDependenciesAccess().getDependenciesPackageNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_51);
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

            // InternalMyDsl.g:2300:3: ( (lv_dependencies_1_0= rulePackageVersion ) )
            // InternalMyDsl.g:2301:4: (lv_dependencies_1_0= rulePackageVersion )
            {
            // InternalMyDsl.g:2301:4: (lv_dependencies_1_0= rulePackageVersion )
            // InternalMyDsl.g:2302:5: lv_dependencies_1_0= rulePackageVersion
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
    // InternalMyDsl.g:2323:1: entryRulePackageName returns [EObject current=null] : iv_rulePackageName= rulePackageName EOF ;
    public final EObject entryRulePackageName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageName = null;


        try {
            // InternalMyDsl.g:2323:52: (iv_rulePackageName= rulePackageName EOF )
            // InternalMyDsl.g:2324:2: iv_rulePackageName= rulePackageName EOF
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
    // InternalMyDsl.g:2330:1: rulePackageName returns [EObject current=null] : (otherlv_0= 'PackageName' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePackageName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2336:2: ( (otherlv_0= 'PackageName' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:2337:2: (otherlv_0= 'PackageName' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:2337:2: (otherlv_0= 'PackageName' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:2338:3: otherlv_0= 'PackageName' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageNameAccess().getPackageNameKeyword_0());
            		
            // InternalMyDsl.g:2342:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2343:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2343:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2344:5: lv_name_1_0= RULE_ID
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
    // InternalMyDsl.g:2364:1: entryRulePackageVersion returns [EObject current=null] : iv_rulePackageVersion= rulePackageVersion EOF ;
    public final EObject entryRulePackageVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageVersion = null;


        try {
            // InternalMyDsl.g:2364:55: (iv_rulePackageVersion= rulePackageVersion EOF )
            // InternalMyDsl.g:2365:2: iv_rulePackageVersion= rulePackageVersion EOF
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
    // InternalMyDsl.g:2371:1: rulePackageVersion returns [EObject current=null] : (otherlv_0= 'PackageVersion' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePackageVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2377:2: ( (otherlv_0= 'PackageVersion' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:2378:2: (otherlv_0= 'PackageVersion' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:2378:2: (otherlv_0= 'PackageVersion' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:2379:3: otherlv_0= 'PackageVersion' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageVersionAccess().getPackageVersionKeyword_0());
            		
            // InternalMyDsl.g:2383:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2384:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2384:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2385:5: lv_name_1_0= RULE_ID
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
    // InternalMyDsl.g:2405:1: entryRuleReactConfigurations returns [EObject current=null] : iv_ruleReactConfigurations= ruleReactConfigurations EOF ;
    public final EObject entryRuleReactConfigurations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactConfigurations = null;


        try {
            // InternalMyDsl.g:2405:60: (iv_ruleReactConfigurations= ruleReactConfigurations EOF )
            // InternalMyDsl.g:2406:2: iv_ruleReactConfigurations= ruleReactConfigurations EOF
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
    // InternalMyDsl.g:2412:1: ruleReactConfigurations returns [EObject current=null] : (otherlv_0= 'ReactDOMConfigurations' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configurations_2_0= ruleDOMConfigurations ) )+ ) ;
    public final EObject ruleReactConfigurations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_configurations_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2418:2: ( (otherlv_0= 'ReactDOMConfigurations' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configurations_2_0= ruleDOMConfigurations ) )+ ) )
            // InternalMyDsl.g:2419:2: (otherlv_0= 'ReactDOMConfigurations' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configurations_2_0= ruleDOMConfigurations ) )+ )
            {
            // InternalMyDsl.g:2419:2: (otherlv_0= 'ReactDOMConfigurations' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configurations_2_0= ruleDOMConfigurations ) )+ )
            // InternalMyDsl.g:2420:3: otherlv_0= 'ReactDOMConfigurations' ( (lv_name_1_0= RULE_ID ) ) ( (lv_configurations_2_0= ruleDOMConfigurations ) )+
            {
            otherlv_0=(Token)match(input,47,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReactConfigurationsAccess().getReactDOMConfigurationsKeyword_0());
            		
            // InternalMyDsl.g:2424:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2425:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2425:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2426:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_52); 

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

            // InternalMyDsl.g:2442:3: ( (lv_configurations_2_0= ruleDOMConfigurations ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=48 && LA6_0<=52)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:2443:4: (lv_configurations_2_0= ruleDOMConfigurations )
            	    {
            	    // InternalMyDsl.g:2443:4: (lv_configurations_2_0= ruleDOMConfigurations )
            	    // InternalMyDsl.g:2444:5: lv_configurations_2_0= ruleDOMConfigurations
            	    {

            	    					newCompositeNode(grammarAccess.getReactConfigurationsAccess().getConfigurationsDOMConfigurationsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_53);
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
    // InternalMyDsl.g:2465:1: entryRuleDOMConfigurations returns [EObject current=null] : iv_ruleDOMConfigurations= ruleDOMConfigurations EOF ;
    public final EObject entryRuleDOMConfigurations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOMConfigurations = null;


        try {
            // InternalMyDsl.g:2465:58: (iv_ruleDOMConfigurations= ruleDOMConfigurations EOF )
            // InternalMyDsl.g:2466:2: iv_ruleDOMConfigurations= ruleDOMConfigurations EOF
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
    // InternalMyDsl.g:2472:1: ruleDOMConfigurations returns [EObject current=null] : ( ( (lv_elements_0_0= ruleDOMTypeConf ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDOMConfigurations() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2478:2: ( ( ( (lv_elements_0_0= ruleDOMTypeConf ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:2479:2: ( ( (lv_elements_0_0= ruleDOMTypeConf ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:2479:2: ( ( (lv_elements_0_0= ruleDOMTypeConf ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:2480:3: ( (lv_elements_0_0= ruleDOMTypeConf ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMyDsl.g:2480:3: ( (lv_elements_0_0= ruleDOMTypeConf ) )
            // InternalMyDsl.g:2481:4: (lv_elements_0_0= ruleDOMTypeConf )
            {
            // InternalMyDsl.g:2481:4: (lv_elements_0_0= ruleDOMTypeConf )
            // InternalMyDsl.g:2482:5: lv_elements_0_0= ruleDOMTypeConf
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

            // InternalMyDsl.g:2499:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2500:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2500:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2501:5: lv_name_1_0= RULE_ID
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
    // InternalMyDsl.g:2521:1: entryRuleDOMTypeConf returns [String current=null] : iv_ruleDOMTypeConf= ruleDOMTypeConf EOF ;
    public final String entryRuleDOMTypeConf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOMTypeConf = null;


        try {
            // InternalMyDsl.g:2521:51: (iv_ruleDOMTypeConf= ruleDOMTypeConf EOF )
            // InternalMyDsl.g:2522:2: iv_ruleDOMTypeConf= ruleDOMTypeConf EOF
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
    // InternalMyDsl.g:2528:1: ruleDOMTypeConf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'RoutingConf' | kw= 'ServiceWorker' | kw= 'HTMLStructure' | kw= 'Manifest' | kw= 'RepositoriesConf' ) ;
    public final AntlrDatatypeRuleToken ruleDOMTypeConf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2534:2: ( (kw= 'RoutingConf' | kw= 'ServiceWorker' | kw= 'HTMLStructure' | kw= 'Manifest' | kw= 'RepositoriesConf' ) )
            // InternalMyDsl.g:2535:2: (kw= 'RoutingConf' | kw= 'ServiceWorker' | kw= 'HTMLStructure' | kw= 'Manifest' | kw= 'RepositoriesConf' )
            {
            // InternalMyDsl.g:2535:2: (kw= 'RoutingConf' | kw= 'ServiceWorker' | kw= 'HTMLStructure' | kw= 'Manifest' | kw= 'RepositoriesConf' )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt7=1;
                }
                break;
            case 49:
                {
                alt7=2;
                }
                break;
            case 50:
                {
                alt7=3;
                }
                break;
            case 51:
                {
                alt7=4;
                }
                break;
            case 52:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:2536:3: kw= 'RoutingConf'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMTypeConfAccess().getRoutingConfKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2542:3: kw= 'ServiceWorker'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMTypeConfAccess().getServiceWorkerKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2548:3: kw= 'HTMLStructure'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMTypeConfAccess().getHTMLStructureKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2554:3: kw= 'Manifest'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDOMTypeConfAccess().getManifestKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:2560:3: kw= 'RepositoriesConf'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

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
    // InternalMyDsl.g:2569:1: entryRuleReactComponents returns [EObject current=null] : iv_ruleReactComponents= ruleReactComponents EOF ;
    public final EObject entryRuleReactComponents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactComponents = null;


        try {
            // InternalMyDsl.g:2569:56: (iv_ruleReactComponents= ruleReactComponents EOF )
            // InternalMyDsl.g:2570:2: iv_ruleReactComponents= ruleReactComponents EOF
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
    // InternalMyDsl.g:2576:1: ruleReactComponents returns [EObject current=null] : (otherlv_0= 'ReactComponents' otherlv_1= ':' otherlv_2= '{' ( (lv_componentslogic_3_0= ruleComponentsLogic ) ) ( (lv_componentsui_4_0= ruleComponentsUI ) ) otherlv_5= '}' ) ;
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
            // InternalMyDsl.g:2582:2: ( (otherlv_0= 'ReactComponents' otherlv_1= ':' otherlv_2= '{' ( (lv_componentslogic_3_0= ruleComponentsLogic ) ) ( (lv_componentsui_4_0= ruleComponentsUI ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:2583:2: (otherlv_0= 'ReactComponents' otherlv_1= ':' otherlv_2= '{' ( (lv_componentslogic_3_0= ruleComponentsLogic ) ) ( (lv_componentsui_4_0= ruleComponentsUI ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:2583:2: (otherlv_0= 'ReactComponents' otherlv_1= ':' otherlv_2= '{' ( (lv_componentslogic_3_0= ruleComponentsLogic ) ) ( (lv_componentsui_4_0= ruleComponentsUI ) ) otherlv_5= '}' )
            // InternalMyDsl.g:2584:3: otherlv_0= 'ReactComponents' otherlv_1= ':' otherlv_2= '{' ( (lv_componentslogic_3_0= ruleComponentsLogic ) ) ( (lv_componentsui_4_0= ruleComponentsUI ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReactComponentsAccess().getReactComponentsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReactComponentsAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getReactComponentsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2596:3: ( (lv_componentslogic_3_0= ruleComponentsLogic ) )
            // InternalMyDsl.g:2597:4: (lv_componentslogic_3_0= ruleComponentsLogic )
            {
            // InternalMyDsl.g:2597:4: (lv_componentslogic_3_0= ruleComponentsLogic )
            // InternalMyDsl.g:2598:5: lv_componentslogic_3_0= ruleComponentsLogic
            {

            					newCompositeNode(grammarAccess.getReactComponentsAccess().getComponentslogicComponentsLogicParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_55);
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

            // InternalMyDsl.g:2615:3: ( (lv_componentsui_4_0= ruleComponentsUI ) )
            // InternalMyDsl.g:2616:4: (lv_componentsui_4_0= ruleComponentsUI )
            {
            // InternalMyDsl.g:2616:4: (lv_componentsui_4_0= ruleComponentsUI )
            // InternalMyDsl.g:2617:5: lv_componentsui_4_0= ruleComponentsUI
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
    // InternalMyDsl.g:2642:1: entryRuleComponentsLogic returns [EObject current=null] : iv_ruleComponentsLogic= ruleComponentsLogic EOF ;
    public final EObject entryRuleComponentsLogic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentsLogic = null;


        try {
            // InternalMyDsl.g:2642:56: (iv_ruleComponentsLogic= ruleComponentsLogic EOF )
            // InternalMyDsl.g:2643:2: iv_ruleComponentsLogic= ruleComponentsLogic EOF
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
    // InternalMyDsl.g:2649:1: ruleComponentsLogic returns [EObject current=null] : (otherlv_0= 'LogicComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicContent ) ) ) ;
    public final EObject ruleComponentsLogic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_logiccomponents_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2655:2: ( (otherlv_0= 'LogicComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicContent ) ) ) )
            // InternalMyDsl.g:2656:2: (otherlv_0= 'LogicComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicContent ) ) )
            {
            // InternalMyDsl.g:2656:2: (otherlv_0= 'LogicComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicContent ) ) )
            // InternalMyDsl.g:2657:3: otherlv_0= 'LogicComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicContent ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentsLogicAccess().getLogicComponentsKeyword_0());
            		
            // InternalMyDsl.g:2661:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2662:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2662:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2663:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_56); 

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

            // InternalMyDsl.g:2679:3: ( (lv_logiccomponents_2_0= ruleLogicContent ) )
            // InternalMyDsl.g:2680:4: (lv_logiccomponents_2_0= ruleLogicContent )
            {
            // InternalMyDsl.g:2680:4: (lv_logiccomponents_2_0= ruleLogicContent )
            // InternalMyDsl.g:2681:5: lv_logiccomponents_2_0= ruleLogicContent
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
    // InternalMyDsl.g:2702:1: entryRuleLogicContent returns [EObject current=null] : iv_ruleLogicContent= ruleLogicContent EOF ;
    public final EObject entryRuleLogicContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicContent = null;


        try {
            // InternalMyDsl.g:2702:53: (iv_ruleLogicContent= ruleLogicContent EOF )
            // InternalMyDsl.g:2703:2: iv_ruleLogicContent= ruleLogicContent EOF
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
    // InternalMyDsl.g:2709:1: ruleLogicContent returns [EObject current=null] : (otherlv_0= 'RoutingComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicStructure ) ) ) ;
    public final EObject ruleLogicContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_logiccomponents_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2715:2: ( (otherlv_0= 'RoutingComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicStructure ) ) ) )
            // InternalMyDsl.g:2716:2: (otherlv_0= 'RoutingComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicStructure ) ) )
            {
            // InternalMyDsl.g:2716:2: (otherlv_0= 'RoutingComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicStructure ) ) )
            // InternalMyDsl.g:2717:3: otherlv_0= 'RoutingComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleLogicStructure ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicContentAccess().getRoutingComponentsKeyword_0());
            		
            // InternalMyDsl.g:2721:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2722:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2722:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2723:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_57); 

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

            // InternalMyDsl.g:2739:3: ( (lv_logiccomponents_2_0= ruleLogicStructure ) )
            // InternalMyDsl.g:2740:4: (lv_logiccomponents_2_0= ruleLogicStructure )
            {
            // InternalMyDsl.g:2740:4: (lv_logiccomponents_2_0= ruleLogicStructure )
            // InternalMyDsl.g:2741:5: lv_logiccomponents_2_0= ruleLogicStructure
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
    // InternalMyDsl.g:2762:1: entryRuleLogicStructure returns [EObject current=null] : iv_ruleLogicStructure= ruleLogicStructure EOF ;
    public final EObject entryRuleLogicStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicStructure = null;


        try {
            // InternalMyDsl.g:2762:55: (iv_ruleLogicStructure= ruleLogicStructure EOF )
            // InternalMyDsl.g:2763:2: iv_ruleLogicStructure= ruleLogicStructure EOF
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
    // InternalMyDsl.g:2769:1: ruleLogicStructure returns [EObject current=null] : (otherlv_0= 'AppComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleComponentClass ) ) otherlv_3= 'IndexComponent' ( (lv_name_4_0= RULE_ID ) ) ) ;
    public final EObject ruleLogicStructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        EObject lv_logiccomponents_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2775:2: ( (otherlv_0= 'AppComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleComponentClass ) ) otherlv_3= 'IndexComponent' ( (lv_name_4_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:2776:2: (otherlv_0= 'AppComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleComponentClass ) ) otherlv_3= 'IndexComponent' ( (lv_name_4_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:2776:2: (otherlv_0= 'AppComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleComponentClass ) ) otherlv_3= 'IndexComponent' ( (lv_name_4_0= RULE_ID ) ) )
            // InternalMyDsl.g:2777:3: otherlv_0= 'AppComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_logiccomponents_2_0= ruleComponentClass ) ) otherlv_3= 'IndexComponent' ( (lv_name_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLogicStructureAccess().getAppComponentKeyword_0());
            		
            // InternalMyDsl.g:2781:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2782:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2782:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2783:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_58); 

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

            // InternalMyDsl.g:2799:3: ( (lv_logiccomponents_2_0= ruleComponentClass ) )
            // InternalMyDsl.g:2800:4: (lv_logiccomponents_2_0= ruleComponentClass )
            {
            // InternalMyDsl.g:2800:4: (lv_logiccomponents_2_0= ruleComponentClass )
            // InternalMyDsl.g:2801:5: lv_logiccomponents_2_0= ruleComponentClass
            {

            					newCompositeNode(grammarAccess.getLogicStructureAccess().getLogiccomponentsComponentClassParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_59);
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

            otherlv_3=(Token)match(input,57,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicStructureAccess().getIndexComponentKeyword_3());
            		
            // InternalMyDsl.g:2822:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMyDsl.g:2823:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMyDsl.g:2823:4: (lv_name_4_0= RULE_ID )
            // InternalMyDsl.g:2824:5: lv_name_4_0= RULE_ID
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
    // InternalMyDsl.g:2844:1: entryRuleComponentsUI returns [EObject current=null] : iv_ruleComponentsUI= ruleComponentsUI EOF ;
    public final EObject entryRuleComponentsUI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentsUI = null;


        try {
            // InternalMyDsl.g:2844:53: (iv_ruleComponentsUI= ruleComponentsUI EOF )
            // InternalMyDsl.g:2845:2: iv_ruleComponentsUI= ruleComponentsUI EOF
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
    // InternalMyDsl.g:2851:1: ruleComponentsUI returns [EObject current=null] : (otherlv_0= 'UIComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicomponents_2_0= ruleUIContent ) ) ) ;
    public final EObject ruleComponentsUI() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_uicomponents_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2857:2: ( (otherlv_0= 'UIComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicomponents_2_0= ruleUIContent ) ) ) )
            // InternalMyDsl.g:2858:2: (otherlv_0= 'UIComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicomponents_2_0= ruleUIContent ) ) )
            {
            // InternalMyDsl.g:2858:2: (otherlv_0= 'UIComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicomponents_2_0= ruleUIContent ) ) )
            // InternalMyDsl.g:2859:3: otherlv_0= 'UIComponents' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicomponents_2_0= ruleUIContent ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentsUIAccess().getUIComponentsKeyword_0());
            		
            // InternalMyDsl.g:2863:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2864:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2864:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2865:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_60); 

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

            // InternalMyDsl.g:2881:3: ( (lv_uicomponents_2_0= ruleUIContent ) )
            // InternalMyDsl.g:2882:4: (lv_uicomponents_2_0= ruleUIContent )
            {
            // InternalMyDsl.g:2882:4: (lv_uicomponents_2_0= ruleUIContent )
            // InternalMyDsl.g:2883:5: lv_uicomponents_2_0= ruleUIContent
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
    // InternalMyDsl.g:2904:1: entryRuleUIContent returns [EObject current=null] : iv_ruleUIContent= ruleUIContent EOF ;
    public final EObject entryRuleUIContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIContent = null;


        try {
            // InternalMyDsl.g:2904:50: (iv_ruleUIContent= ruleUIContent EOF )
            // InternalMyDsl.g:2905:2: iv_ruleUIContent= ruleUIContent EOF
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
    // InternalMyDsl.g:2911:1: ruleUIContent returns [EObject current=null] : ( (otherlv_0= 'ViewComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) ) )+ (otherlv_3= 'Subcomponents' ( (lv_name_4_0= RULE_ID ) ) ( (lv_uicontent_5_0= ruleComponentClass ) ) )+ ) ;
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
            // InternalMyDsl.g:2917:2: ( ( (otherlv_0= 'ViewComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) ) )+ (otherlv_3= 'Subcomponents' ( (lv_name_4_0= RULE_ID ) ) ( (lv_uicontent_5_0= ruleComponentClass ) ) )+ ) )
            // InternalMyDsl.g:2918:2: ( (otherlv_0= 'ViewComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) ) )+ (otherlv_3= 'Subcomponents' ( (lv_name_4_0= RULE_ID ) ) ( (lv_uicontent_5_0= ruleComponentClass ) ) )+ )
            {
            // InternalMyDsl.g:2918:2: ( (otherlv_0= 'ViewComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) ) )+ (otherlv_3= 'Subcomponents' ( (lv_name_4_0= RULE_ID ) ) ( (lv_uicontent_5_0= ruleComponentClass ) ) )+ )
            // InternalMyDsl.g:2919:3: (otherlv_0= 'ViewComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) ) )+ (otherlv_3= 'Subcomponents' ( (lv_name_4_0= RULE_ID ) ) ( (lv_uicontent_5_0= ruleComponentClass ) ) )+
            {
            // InternalMyDsl.g:2919:3: (otherlv_0= 'ViewComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==59) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:2920:4: otherlv_0= 'ViewComponent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uicontent_2_0= ruleComponentClass ) )
            	    {
            	    otherlv_0=(Token)match(input,59,FOLLOW_9); 

            	    				newLeafNode(otherlv_0, grammarAccess.getUIContentAccess().getViewComponentKeyword_0_0());
            	    			
            	    // InternalMyDsl.g:2924:4: ( (lv_name_1_0= RULE_ID ) )
            	    // InternalMyDsl.g:2925:5: (lv_name_1_0= RULE_ID )
            	    {
            	    // InternalMyDsl.g:2925:5: (lv_name_1_0= RULE_ID )
            	    // InternalMyDsl.g:2926:6: lv_name_1_0= RULE_ID
            	    {
            	    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_58); 

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

            	    // InternalMyDsl.g:2942:4: ( (lv_uicontent_2_0= ruleComponentClass ) )
            	    // InternalMyDsl.g:2943:5: (lv_uicontent_2_0= ruleComponentClass )
            	    {
            	    // InternalMyDsl.g:2943:5: (lv_uicontent_2_0= ruleComponentClass )
            	    // InternalMyDsl.g:2944:6: lv_uicontent_2_0= ruleComponentClass
            	    {

            	    						newCompositeNode(grammarAccess.getUIContentAccess().getUicontentComponentClassParserRuleCall_0_2_0());
            	    					
            	    pushFollow(FOLLOW_61);
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // InternalMyDsl.g:2962:3: (otherlv_3= 'Subcomponents' ( (lv_name_4_0= RULE_ID ) ) ( (lv_uicontent_5_0= ruleComponentClass ) ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==60) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:2963:4: otherlv_3= 'Subcomponents' ( (lv_name_4_0= RULE_ID ) ) ( (lv_uicontent_5_0= ruleComponentClass ) )
            	    {
            	    otherlv_3=(Token)match(input,60,FOLLOW_9); 

            	    				newLeafNode(otherlv_3, grammarAccess.getUIContentAccess().getSubcomponentsKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:2967:4: ( (lv_name_4_0= RULE_ID ) )
            	    // InternalMyDsl.g:2968:5: (lv_name_4_0= RULE_ID )
            	    {
            	    // InternalMyDsl.g:2968:5: (lv_name_4_0= RULE_ID )
            	    // InternalMyDsl.g:2969:6: lv_name_4_0= RULE_ID
            	    {
            	    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_58); 

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

            	    // InternalMyDsl.g:2985:4: ( (lv_uicontent_5_0= ruleComponentClass ) )
            	    // InternalMyDsl.g:2986:5: (lv_uicontent_5_0= ruleComponentClass )
            	    {
            	    // InternalMyDsl.g:2986:5: (lv_uicontent_5_0= ruleComponentClass )
            	    // InternalMyDsl.g:2987:6: lv_uicontent_5_0= ruleComponentClass
            	    {

            	    						newCompositeNode(grammarAccess.getUIContentAccess().getUicontentComponentClassParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_62);
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
    // $ANTLR end "ruleUIContent"


    // $ANTLR start "entryRuleComponentClass"
    // InternalMyDsl.g:3009:1: entryRuleComponentClass returns [EObject current=null] : iv_ruleComponentClass= ruleComponentClass EOF ;
    public final EObject entryRuleComponentClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentClass = null;


        try {
            // InternalMyDsl.g:3009:55: (iv_ruleComponentClass= ruleComponentClass EOF )
            // InternalMyDsl.g:3010:2: iv_ruleComponentClass= ruleComponentClass EOF
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
    // InternalMyDsl.g:3016:1: ruleComponentClass returns [EObject current=null] : ( ( (lv_componentclass_0_0= ruleReactFunctions ) ) ( (lv_componentclass_1_0= ruleProps ) ) ) ;
    public final EObject ruleComponentClass() throws RecognitionException {
        EObject current = null;

        EObject lv_componentclass_0_0 = null;

        EObject lv_componentclass_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3022:2: ( ( ( (lv_componentclass_0_0= ruleReactFunctions ) ) ( (lv_componentclass_1_0= ruleProps ) ) ) )
            // InternalMyDsl.g:3023:2: ( ( (lv_componentclass_0_0= ruleReactFunctions ) ) ( (lv_componentclass_1_0= ruleProps ) ) )
            {
            // InternalMyDsl.g:3023:2: ( ( (lv_componentclass_0_0= ruleReactFunctions ) ) ( (lv_componentclass_1_0= ruleProps ) ) )
            // InternalMyDsl.g:3024:3: ( (lv_componentclass_0_0= ruleReactFunctions ) ) ( (lv_componentclass_1_0= ruleProps ) )
            {
            // InternalMyDsl.g:3024:3: ( (lv_componentclass_0_0= ruleReactFunctions ) )
            // InternalMyDsl.g:3025:4: (lv_componentclass_0_0= ruleReactFunctions )
            {
            // InternalMyDsl.g:3025:4: (lv_componentclass_0_0= ruleReactFunctions )
            // InternalMyDsl.g:3026:5: lv_componentclass_0_0= ruleReactFunctions
            {

            					newCompositeNode(grammarAccess.getComponentClassAccess().getComponentclassReactFunctionsParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_63);
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

            // InternalMyDsl.g:3043:3: ( (lv_componentclass_1_0= ruleProps ) )
            // InternalMyDsl.g:3044:4: (lv_componentclass_1_0= ruleProps )
            {
            // InternalMyDsl.g:3044:4: (lv_componentclass_1_0= ruleProps )
            // InternalMyDsl.g:3045:5: lv_componentclass_1_0= ruleProps
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
    // InternalMyDsl.g:3066:1: entryRuleReactFunctions returns [EObject current=null] : iv_ruleReactFunctions= ruleReactFunctions EOF ;
    public final EObject entryRuleReactFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactFunctions = null;


        try {
            // InternalMyDsl.g:3066:55: (iv_ruleReactFunctions= ruleReactFunctions EOF )
            // InternalMyDsl.g:3067:2: iv_ruleReactFunctions= ruleReactFunctions EOF
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
    // InternalMyDsl.g:3073:1: ruleReactFunctions returns [EObject current=null] : ( ( (lv_componentclass_0_0= ruleReactConstructor ) ) ( (lv_lifecycleclass_1_0= ruleReactLifeCycle ) )* ( (lv_componentclass_2_0= ruleReactCoreFunctions ) )* ( (lv_renderclass_3_0= ruleReactRender ) ) ) ;
    public final EObject ruleReactFunctions() throws RecognitionException {
        EObject current = null;

        EObject lv_componentclass_0_0 = null;

        AntlrDatatypeRuleToken lv_lifecycleclass_1_0 = null;

        EObject lv_componentclass_2_0 = null;

        AntlrDatatypeRuleToken lv_renderclass_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3079:2: ( ( ( (lv_componentclass_0_0= ruleReactConstructor ) ) ( (lv_lifecycleclass_1_0= ruleReactLifeCycle ) )* ( (lv_componentclass_2_0= ruleReactCoreFunctions ) )* ( (lv_renderclass_3_0= ruleReactRender ) ) ) )
            // InternalMyDsl.g:3080:2: ( ( (lv_componentclass_0_0= ruleReactConstructor ) ) ( (lv_lifecycleclass_1_0= ruleReactLifeCycle ) )* ( (lv_componentclass_2_0= ruleReactCoreFunctions ) )* ( (lv_renderclass_3_0= ruleReactRender ) ) )
            {
            // InternalMyDsl.g:3080:2: ( ( (lv_componentclass_0_0= ruleReactConstructor ) ) ( (lv_lifecycleclass_1_0= ruleReactLifeCycle ) )* ( (lv_componentclass_2_0= ruleReactCoreFunctions ) )* ( (lv_renderclass_3_0= ruleReactRender ) ) )
            // InternalMyDsl.g:3081:3: ( (lv_componentclass_0_0= ruleReactConstructor ) ) ( (lv_lifecycleclass_1_0= ruleReactLifeCycle ) )* ( (lv_componentclass_2_0= ruleReactCoreFunctions ) )* ( (lv_renderclass_3_0= ruleReactRender ) )
            {
            // InternalMyDsl.g:3081:3: ( (lv_componentclass_0_0= ruleReactConstructor ) )
            // InternalMyDsl.g:3082:4: (lv_componentclass_0_0= ruleReactConstructor )
            {
            // InternalMyDsl.g:3082:4: (lv_componentclass_0_0= ruleReactConstructor )
            // InternalMyDsl.g:3083:5: lv_componentclass_0_0= ruleReactConstructor
            {

            					newCompositeNode(grammarAccess.getReactFunctionsAccess().getComponentclassReactConstructorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_64);
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

            // InternalMyDsl.g:3100:3: ( (lv_lifecycleclass_1_0= ruleReactLifeCycle ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==70||(LA10_0>=72 && LA10_0<=73)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:3101:4: (lv_lifecycleclass_1_0= ruleReactLifeCycle )
            	    {
            	    // InternalMyDsl.g:3101:4: (lv_lifecycleclass_1_0= ruleReactLifeCycle )
            	    // InternalMyDsl.g:3102:5: lv_lifecycleclass_1_0= ruleReactLifeCycle
            	    {

            	    					newCompositeNode(grammarAccess.getReactFunctionsAccess().getLifecycleclassReactLifeCycleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_64);
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
            	    break loop10;
                }
            } while (true);

            // InternalMyDsl.g:3119:3: ( (lv_componentclass_2_0= ruleReactCoreFunctions ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:3120:4: (lv_componentclass_2_0= ruleReactCoreFunctions )
            	    {
            	    // InternalMyDsl.g:3120:4: (lv_componentclass_2_0= ruleReactCoreFunctions )
            	    // InternalMyDsl.g:3121:5: lv_componentclass_2_0= ruleReactCoreFunctions
            	    {

            	    					newCompositeNode(grammarAccess.getReactFunctionsAccess().getComponentclassReactCoreFunctionsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_64);
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
            	    break loop11;
                }
            } while (true);

            // InternalMyDsl.g:3138:3: ( (lv_renderclass_3_0= ruleReactRender ) )
            // InternalMyDsl.g:3139:4: (lv_renderclass_3_0= ruleReactRender )
            {
            // InternalMyDsl.g:3139:4: (lv_renderclass_3_0= ruleReactRender )
            // InternalMyDsl.g:3140:5: lv_renderclass_3_0= ruleReactRender
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
    // InternalMyDsl.g:3161:1: entryRuleReactConstructor returns [EObject current=null] : iv_ruleReactConstructor= ruleReactConstructor EOF ;
    public final EObject entryRuleReactConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactConstructor = null;


        try {
            // InternalMyDsl.g:3161:57: (iv_ruleReactConstructor= ruleReactConstructor EOF )
            // InternalMyDsl.g:3162:2: iv_ruleReactConstructor= ruleReactConstructor EOF
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
    // InternalMyDsl.g:3168:1: ruleReactConstructor returns [EObject current=null] : (otherlv_0= 'Constructor' ( (lv_componentclass_1_0= ruleState ) ) ( (lv_componentclass_2_0= ruleCoreFunctionsDeclaration ) )* ) ;
    public final EObject ruleReactConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_componentclass_1_0 = null;

        EObject lv_componentclass_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3174:2: ( (otherlv_0= 'Constructor' ( (lv_componentclass_1_0= ruleState ) ) ( (lv_componentclass_2_0= ruleCoreFunctionsDeclaration ) )* ) )
            // InternalMyDsl.g:3175:2: (otherlv_0= 'Constructor' ( (lv_componentclass_1_0= ruleState ) ) ( (lv_componentclass_2_0= ruleCoreFunctionsDeclaration ) )* )
            {
            // InternalMyDsl.g:3175:2: (otherlv_0= 'Constructor' ( (lv_componentclass_1_0= ruleState ) ) ( (lv_componentclass_2_0= ruleCoreFunctionsDeclaration ) )* )
            // InternalMyDsl.g:3176:3: otherlv_0= 'Constructor' ( (lv_componentclass_1_0= ruleState ) ) ( (lv_componentclass_2_0= ruleCoreFunctionsDeclaration ) )*
            {
            otherlv_0=(Token)match(input,61,FOLLOW_65); 

            			newLeafNode(otherlv_0, grammarAccess.getReactConstructorAccess().getConstructorKeyword_0());
            		
            // InternalMyDsl.g:3180:3: ( (lv_componentclass_1_0= ruleState ) )
            // InternalMyDsl.g:3181:4: (lv_componentclass_1_0= ruleState )
            {
            // InternalMyDsl.g:3181:4: (lv_componentclass_1_0= ruleState )
            // InternalMyDsl.g:3182:5: lv_componentclass_1_0= ruleState
            {

            					newCompositeNode(grammarAccess.getReactConstructorAccess().getComponentclassStateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_66);
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

            // InternalMyDsl.g:3199:3: ( (lv_componentclass_2_0= ruleCoreFunctionsDeclaration ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==69) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:3200:4: (lv_componentclass_2_0= ruleCoreFunctionsDeclaration )
            	    {
            	    // InternalMyDsl.g:3200:4: (lv_componentclass_2_0= ruleCoreFunctionsDeclaration )
            	    // InternalMyDsl.g:3201:5: lv_componentclass_2_0= ruleCoreFunctionsDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getReactConstructorAccess().getComponentclassCoreFunctionsDeclarationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_66);
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
            	    break loop12;
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
    // InternalMyDsl.g:3222:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMyDsl.g:3222:46: (iv_ruleState= ruleState EOF )
            // InternalMyDsl.g:3223:2: iv_ruleState= ruleState EOF
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
    // InternalMyDsl.g:3229:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )* ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_componentclass_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3235:2: ( (otherlv_0= 'State' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )* ) )
            // InternalMyDsl.g:3236:2: (otherlv_0= 'State' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )* )
            {
            // InternalMyDsl.g:3236:2: (otherlv_0= 'State' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )* )
            // InternalMyDsl.g:3237:3: otherlv_0= 'State' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )*
            {
            otherlv_0=(Token)match(input,62,FOLLOW_66); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalMyDsl.g:3241:3: ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    int LA13_1 = input.LA(2);

                    if ( ((LA13_1>=63 && LA13_1<=68)) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:3242:4: ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) )
            	    {
            	    // InternalMyDsl.g:3242:4: ( (lv_name_1_0= RULE_ID ) )
            	    // InternalMyDsl.g:3243:5: (lv_name_1_0= RULE_ID )
            	    {
            	    // InternalMyDsl.g:3243:5: (lv_name_1_0= RULE_ID )
            	    // InternalMyDsl.g:3244:6: lv_name_1_0= RULE_ID
            	    {
            	    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_67); 

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

            	    // InternalMyDsl.g:3260:4: ( (lv_componentclass_2_0= ruleDataType ) )
            	    // InternalMyDsl.g:3261:5: (lv_componentclass_2_0= ruleDataType )
            	    {
            	    // InternalMyDsl.g:3261:5: (lv_componentclass_2_0= ruleDataType )
            	    // InternalMyDsl.g:3262:6: lv_componentclass_2_0= ruleDataType
            	    {

            	    						newCompositeNode(grammarAccess.getStateAccess().getComponentclassDataTypeParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_66);
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
            	    break loop13;
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
    // InternalMyDsl.g:3284:1: entryRuleDataType returns [String current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final String entryRuleDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataType = null;


        try {
            // InternalMyDsl.g:3284:48: (iv_ruleDataType= ruleDataType EOF )
            // InternalMyDsl.g:3285:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalMyDsl.g:3291:1: ruleDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'String' | kw= 'Array' | kw= 'Object' | kw= 'Number' | kw= 'null' | kw= 'Boolean' ) ;
    public final AntlrDatatypeRuleToken ruleDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3297:2: ( (kw= 'String' | kw= 'Array' | kw= 'Object' | kw= 'Number' | kw= 'null' | kw= 'Boolean' ) )
            // InternalMyDsl.g:3298:2: (kw= 'String' | kw= 'Array' | kw= 'Object' | kw= 'Number' | kw= 'null' | kw= 'Boolean' )
            {
            // InternalMyDsl.g:3298:2: (kw= 'String' | kw= 'Array' | kw= 'Object' | kw= 'Number' | kw= 'null' | kw= 'Boolean' )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt14=1;
                }
                break;
            case 64:
                {
                alt14=2;
                }
                break;
            case 65:
                {
                alt14=3;
                }
                break;
            case 66:
                {
                alt14=4;
                }
                break;
            case 67:
                {
                alt14=5;
                }
                break;
            case 68:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:3299:3: kw= 'String'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getStringKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3305:3: kw= 'Array'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getArrayKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3311:3: kw= 'Object'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getObjectKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:3317:3: kw= 'Number'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getNumberKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:3323:3: kw= 'null'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getNullKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:3329:3: kw= 'Boolean'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

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
    // InternalMyDsl.g:3338:1: entryRuleCoreFunctionsDeclaration returns [EObject current=null] : iv_ruleCoreFunctionsDeclaration= ruleCoreFunctionsDeclaration EOF ;
    public final EObject entryRuleCoreFunctionsDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoreFunctionsDeclaration = null;


        try {
            // InternalMyDsl.g:3338:65: (iv_ruleCoreFunctionsDeclaration= ruleCoreFunctionsDeclaration EOF )
            // InternalMyDsl.g:3339:2: iv_ruleCoreFunctionsDeclaration= ruleCoreFunctionsDeclaration EOF
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
    // InternalMyDsl.g:3345:1: ruleCoreFunctionsDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionBindingDeclaration' ) ;
    public final EObject ruleCoreFunctionsDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3351:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionBindingDeclaration' ) )
            // InternalMyDsl.g:3352:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionBindingDeclaration' )
            {
            // InternalMyDsl.g:3352:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionBindingDeclaration' )
            // InternalMyDsl.g:3353:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionBindingDeclaration'
            {
            // InternalMyDsl.g:3353:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:3354:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:3354:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:3355:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_68); 

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

            otherlv_1=(Token)match(input,69,FOLLOW_2); 

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
    // InternalMyDsl.g:3379:1: entryRuleReactLifeCycle returns [String current=null] : iv_ruleReactLifeCycle= ruleReactLifeCycle EOF ;
    public final String entryRuleReactLifeCycle() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReactLifeCycle = null;


        try {
            // InternalMyDsl.g:3379:54: (iv_ruleReactLifeCycle= ruleReactLifeCycle EOF )
            // InternalMyDsl.g:3380:2: iv_ruleReactLifeCycle= ruleReactLifeCycle EOF
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
    // InternalMyDsl.g:3386:1: ruleReactLifeCycle returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'ComponentDidMount' kw= 'FunctionStructure' ) | (kw= 'ComponentDidUpdate' kw= 'FunctionStructure' ) | (kw= 'ComponentWillUnmount' kw= 'FunctionStructure' ) ) ;
    public final AntlrDatatypeRuleToken ruleReactLifeCycle() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3392:2: ( ( (kw= 'ComponentDidMount' kw= 'FunctionStructure' ) | (kw= 'ComponentDidUpdate' kw= 'FunctionStructure' ) | (kw= 'ComponentWillUnmount' kw= 'FunctionStructure' ) ) )
            // InternalMyDsl.g:3393:2: ( (kw= 'ComponentDidMount' kw= 'FunctionStructure' ) | (kw= 'ComponentDidUpdate' kw= 'FunctionStructure' ) | (kw= 'ComponentWillUnmount' kw= 'FunctionStructure' ) )
            {
            // InternalMyDsl.g:3393:2: ( (kw= 'ComponentDidMount' kw= 'FunctionStructure' ) | (kw= 'ComponentDidUpdate' kw= 'FunctionStructure' ) | (kw= 'ComponentWillUnmount' kw= 'FunctionStructure' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt15=1;
                }
                break;
            case 72:
                {
                alt15=2;
                }
                break;
            case 73:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:3394:3: (kw= 'ComponentDidMount' kw= 'FunctionStructure' )
                    {
                    // InternalMyDsl.g:3394:3: (kw= 'ComponentDidMount' kw= 'FunctionStructure' )
                    // InternalMyDsl.g:3395:4: kw= 'ComponentDidMount' kw= 'FunctionStructure'
                    {
                    kw=(Token)match(input,70,FOLLOW_69); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReactLifeCycleAccess().getComponentDidMountKeyword_0_0());
                    			
                    kw=(Token)match(input,71,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReactLifeCycleAccess().getFunctionStructureKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3407:3: (kw= 'ComponentDidUpdate' kw= 'FunctionStructure' )
                    {
                    // InternalMyDsl.g:3407:3: (kw= 'ComponentDidUpdate' kw= 'FunctionStructure' )
                    // InternalMyDsl.g:3408:4: kw= 'ComponentDidUpdate' kw= 'FunctionStructure'
                    {
                    kw=(Token)match(input,72,FOLLOW_69); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReactLifeCycleAccess().getComponentDidUpdateKeyword_1_0());
                    			
                    kw=(Token)match(input,71,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReactLifeCycleAccess().getFunctionStructureKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3420:3: (kw= 'ComponentWillUnmount' kw= 'FunctionStructure' )
                    {
                    // InternalMyDsl.g:3420:3: (kw= 'ComponentWillUnmount' kw= 'FunctionStructure' )
                    // InternalMyDsl.g:3421:4: kw= 'ComponentWillUnmount' kw= 'FunctionStructure'
                    {
                    kw=(Token)match(input,73,FOLLOW_69); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReactLifeCycleAccess().getComponentWillUnmountKeyword_2_0());
                    			
                    kw=(Token)match(input,71,FOLLOW_2); 

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
    // InternalMyDsl.g:3436:1: entryRuleReactRender returns [String current=null] : iv_ruleReactRender= ruleReactRender EOF ;
    public final String entryRuleReactRender() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReactRender = null;


        try {
            // InternalMyDsl.g:3436:51: (iv_ruleReactRender= ruleReactRender EOF )
            // InternalMyDsl.g:3437:2: iv_ruleReactRender= ruleReactRender EOF
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
    // InternalMyDsl.g:3443:1: ruleReactRender returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Render' kw= 'RenderContent' ) ;
    public final AntlrDatatypeRuleToken ruleReactRender() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3449:2: ( (kw= 'Render' kw= 'RenderContent' ) )
            // InternalMyDsl.g:3450:2: (kw= 'Render' kw= 'RenderContent' )
            {
            // InternalMyDsl.g:3450:2: (kw= 'Render' kw= 'RenderContent' )
            // InternalMyDsl.g:3451:3: kw= 'Render' kw= 'RenderContent'
            {
            kw=(Token)match(input,74,FOLLOW_70); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getReactRenderAccess().getRenderKeyword_0());
            		
            kw=(Token)match(input,75,FOLLOW_2); 

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
    // InternalMyDsl.g:3465:1: entryRuleProps returns [EObject current=null] : iv_ruleProps= ruleProps EOF ;
    public final EObject entryRuleProps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProps = null;


        try {
            // InternalMyDsl.g:3465:46: (iv_ruleProps= ruleProps EOF )
            // InternalMyDsl.g:3466:2: iv_ruleProps= ruleProps EOF
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
    // InternalMyDsl.g:3472:1: ruleProps returns [EObject current=null] : (otherlv_0= 'Props' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )* ) ;
    public final EObject ruleProps() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_componentclass_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3478:2: ( (otherlv_0= 'Props' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )* ) )
            // InternalMyDsl.g:3479:2: (otherlv_0= 'Props' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )* )
            {
            // InternalMyDsl.g:3479:2: (otherlv_0= 'Props' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )* )
            // InternalMyDsl.g:3480:3: otherlv_0= 'Props' ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )*
            {
            otherlv_0=(Token)match(input,76,FOLLOW_66); 

            			newLeafNode(otherlv_0, grammarAccess.getPropsAccess().getPropsKeyword_0());
            		
            // InternalMyDsl.g:3484:3: ( ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:3485:4: ( (lv_name_1_0= RULE_ID ) ) ( (lv_componentclass_2_0= ruleDataType ) )
            	    {
            	    // InternalMyDsl.g:3485:4: ( (lv_name_1_0= RULE_ID ) )
            	    // InternalMyDsl.g:3486:5: (lv_name_1_0= RULE_ID )
            	    {
            	    // InternalMyDsl.g:3486:5: (lv_name_1_0= RULE_ID )
            	    // InternalMyDsl.g:3487:6: lv_name_1_0= RULE_ID
            	    {
            	    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_67); 

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

            	    // InternalMyDsl.g:3503:4: ( (lv_componentclass_2_0= ruleDataType ) )
            	    // InternalMyDsl.g:3504:5: (lv_componentclass_2_0= ruleDataType )
            	    {
            	    // InternalMyDsl.g:3504:5: (lv_componentclass_2_0= ruleDataType )
            	    // InternalMyDsl.g:3505:6: lv_componentclass_2_0= ruleDataType
            	    {

            	    						newCompositeNode(grammarAccess.getPropsAccess().getComponentclassDataTypeParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_66);
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
            	    break loop16;
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
    // InternalMyDsl.g:3527:1: entryRuleReactCoreFunctions returns [EObject current=null] : iv_ruleReactCoreFunctions= ruleReactCoreFunctions EOF ;
    public final EObject entryRuleReactCoreFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactCoreFunctions = null;


        try {
            // InternalMyDsl.g:3527:59: (iv_ruleReactCoreFunctions= ruleReactCoreFunctions EOF )
            // InternalMyDsl.g:3528:2: iv_ruleReactCoreFunctions= ruleReactCoreFunctions EOF
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
    // InternalMyDsl.g:3534:1: ruleReactCoreFunctions returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionStructure' ) ;
    public final EObject ruleReactCoreFunctions() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3540:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionStructure' ) )
            // InternalMyDsl.g:3541:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionStructure' )
            {
            // InternalMyDsl.g:3541:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionStructure' )
            // InternalMyDsl.g:3542:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'FunctionStructure'
            {
            // InternalMyDsl.g:3542:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:3543:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:3543:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:3544:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_69); 

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

            otherlv_1=(Token)match(input,71,FOLLOW_2); 

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
    // InternalMyDsl.g:3568:1: entryRuleReactActions returns [EObject current=null] : iv_ruleReactActions= ruleReactActions EOF ;
    public final EObject entryRuleReactActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactActions = null;


        try {
            // InternalMyDsl.g:3568:53: (iv_ruleReactActions= ruleReactActions EOF )
            // InternalMyDsl.g:3569:2: iv_ruleReactActions= ruleReactActions EOF
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
    // InternalMyDsl.g:3575:1: ruleReactActions returns [EObject current=null] : (otherlv_0= 'ReactActions' otherlv_1= ':' otherlv_2= '{' ( (lv_reactactcontent_3_0= ruleReactActionsContent ) ) otherlv_4= '}' ) ;
    public final EObject ruleReactActions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reactactcontent_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3581:2: ( (otherlv_0= 'ReactActions' otherlv_1= ':' otherlv_2= '{' ( (lv_reactactcontent_3_0= ruleReactActionsContent ) ) otherlv_4= '}' ) )
            // InternalMyDsl.g:3582:2: (otherlv_0= 'ReactActions' otherlv_1= ':' otherlv_2= '{' ( (lv_reactactcontent_3_0= ruleReactActionsContent ) ) otherlv_4= '}' )
            {
            // InternalMyDsl.g:3582:2: (otherlv_0= 'ReactActions' otherlv_1= ':' otherlv_2= '{' ( (lv_reactactcontent_3_0= ruleReactActionsContent ) ) otherlv_4= '}' )
            // InternalMyDsl.g:3583:3: otherlv_0= 'ReactActions' otherlv_1= ':' otherlv_2= '{' ( (lv_reactactcontent_3_0= ruleReactActionsContent ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReactActionsAccess().getReactActionsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReactActionsAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_71); 

            			newLeafNode(otherlv_2, grammarAccess.getReactActionsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:3595:3: ( (lv_reactactcontent_3_0= ruleReactActionsContent ) )
            // InternalMyDsl.g:3596:4: (lv_reactactcontent_3_0= ruleReactActionsContent )
            {
            // InternalMyDsl.g:3596:4: (lv_reactactcontent_3_0= ruleReactActionsContent )
            // InternalMyDsl.g:3597:5: lv_reactactcontent_3_0= ruleReactActionsContent
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
    // InternalMyDsl.g:3622:1: entryRuleReactActionsContent returns [EObject current=null] : iv_ruleReactActionsContent= ruleReactActionsContent EOF ;
    public final EObject entryRuleReactActionsContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactActionsContent = null;


        try {
            // InternalMyDsl.g:3622:60: (iv_ruleReactActionsContent= ruleReactActionsContent EOF )
            // InternalMyDsl.g:3623:2: iv_ruleReactActionsContent= ruleReactActionsContent EOF
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
    // InternalMyDsl.g:3629:1: ruleReactActionsContent returns [EObject current=null] : ( (lv_reactrelcontent_0_0= ruleReactServicesRelation ) )+ ;
    public final EObject ruleReactActionsContent() throws RecognitionException {
        EObject current = null;

        EObject lv_reactrelcontent_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3635:2: ( ( (lv_reactrelcontent_0_0= ruleReactServicesRelation ) )+ )
            // InternalMyDsl.g:3636:2: ( (lv_reactrelcontent_0_0= ruleReactServicesRelation ) )+
            {
            // InternalMyDsl.g:3636:2: ( (lv_reactrelcontent_0_0= ruleReactServicesRelation ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==80) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:3637:3: (lv_reactrelcontent_0_0= ruleReactServicesRelation )
            	    {
            	    // InternalMyDsl.g:3637:3: (lv_reactrelcontent_0_0= ruleReactServicesRelation )
            	    // InternalMyDsl.g:3638:4: lv_reactrelcontent_0_0= ruleReactServicesRelation
            	    {

            	    				newCompositeNode(grammarAccess.getReactActionsContentAccess().getReactrelcontentReactServicesRelationParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_72);
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
    // InternalMyDsl.g:3658:1: entryRuleReactServicesType returns [EObject current=null] : iv_ruleReactServicesType= ruleReactServicesType EOF ;
    public final EObject entryRuleReactServicesType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactServicesType = null;


        try {
            // InternalMyDsl.g:3658:58: (iv_ruleReactServicesType= ruleReactServicesType EOF )
            // InternalMyDsl.g:3659:2: iv_ruleReactServicesType= ruleReactServicesType EOF
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
    // InternalMyDsl.g:3665:1: ruleReactServicesType returns [EObject current=null] : (otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ServiceContent' ) ;
    public final EObject ruleReactServicesType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3671:2: ( (otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ServiceContent' ) )
            // InternalMyDsl.g:3672:2: (otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ServiceContent' )
            {
            // InternalMyDsl.g:3672:2: (otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ServiceContent' )
            // InternalMyDsl.g:3673:3: otherlv_0= 'ServiceType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ServiceContent'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReactServicesTypeAccess().getServiceTypeKeyword_0());
            		
            // InternalMyDsl.g:3677:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:3678:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:3678:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:3679:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_73); 

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

            otherlv_2=(Token)match(input,79,FOLLOW_2); 

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
    // InternalMyDsl.g:3703:1: entryRuleReactServicesRelation returns [EObject current=null] : iv_ruleReactServicesRelation= ruleReactServicesRelation EOF ;
    public final EObject entryRuleReactServicesRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactServicesRelation = null;


        try {
            // InternalMyDsl.g:3703:62: (iv_ruleReactServicesRelation= ruleReactServicesRelation EOF )
            // InternalMyDsl.g:3704:2: iv_ruleReactServicesRelation= ruleReactServicesRelation EOF
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
    // InternalMyDsl.g:3710:1: ruleReactServicesRelation returns [EObject current=null] : (otherlv_0= 'ServicesRelations' ( ( (lv_reactrelationcontent_1_0= ruleReactServicesType ) ) ( (lv_name_2_0= RULE_ID ) ) ruleReactRequest )+ ) ;
    public final EObject ruleReactServicesRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        EObject lv_reactrelationcontent_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3716:2: ( (otherlv_0= 'ServicesRelations' ( ( (lv_reactrelationcontent_1_0= ruleReactServicesType ) ) ( (lv_name_2_0= RULE_ID ) ) ruleReactRequest )+ ) )
            // InternalMyDsl.g:3717:2: (otherlv_0= 'ServicesRelations' ( ( (lv_reactrelationcontent_1_0= ruleReactServicesType ) ) ( (lv_name_2_0= RULE_ID ) ) ruleReactRequest )+ )
            {
            // InternalMyDsl.g:3717:2: (otherlv_0= 'ServicesRelations' ( ( (lv_reactrelationcontent_1_0= ruleReactServicesType ) ) ( (lv_name_2_0= RULE_ID ) ) ruleReactRequest )+ )
            // InternalMyDsl.g:3718:3: otherlv_0= 'ServicesRelations' ( ( (lv_reactrelationcontent_1_0= ruleReactServicesType ) ) ( (lv_name_2_0= RULE_ID ) ) ruleReactRequest )+
            {
            otherlv_0=(Token)match(input,80,FOLLOW_74); 

            			newLeafNode(otherlv_0, grammarAccess.getReactServicesRelationAccess().getServicesRelationsKeyword_0());
            		
            // InternalMyDsl.g:3722:3: ( ( (lv_reactrelationcontent_1_0= ruleReactServicesType ) ) ( (lv_name_2_0= RULE_ID ) ) ruleReactRequest )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==78) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:3723:4: ( (lv_reactrelationcontent_1_0= ruleReactServicesType ) ) ( (lv_name_2_0= RULE_ID ) ) ruleReactRequest
            	    {
            	    // InternalMyDsl.g:3723:4: ( (lv_reactrelationcontent_1_0= ruleReactServicesType ) )
            	    // InternalMyDsl.g:3724:5: (lv_reactrelationcontent_1_0= ruleReactServicesType )
            	    {
            	    // InternalMyDsl.g:3724:5: (lv_reactrelationcontent_1_0= ruleReactServicesType )
            	    // InternalMyDsl.g:3725:6: lv_reactrelationcontent_1_0= ruleReactServicesType
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

            	    // InternalMyDsl.g:3742:4: ( (lv_name_2_0= RULE_ID ) )
            	    // InternalMyDsl.g:3743:5: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalMyDsl.g:3743:5: (lv_name_2_0= RULE_ID )
            	    // InternalMyDsl.g:3744:6: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_75); 

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
            	    			
            	    pushFollow(FOLLOW_76);
            	    ruleReactRequest();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
    // InternalMyDsl.g:3772:1: entryRuleReactRequest returns [String current=null] : iv_ruleReactRequest= ruleReactRequest EOF ;
    public final String entryRuleReactRequest() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReactRequest = null;


        try {
            // InternalMyDsl.g:3772:52: (iv_ruleReactRequest= ruleReactRequest EOF )
            // InternalMyDsl.g:3773:2: iv_ruleReactRequest= ruleReactRequest EOF
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
    // InternalMyDsl.g:3779:1: ruleReactRequest returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Wrapper' | kw= 'AuxWrapper' ) ;
    public final AntlrDatatypeRuleToken ruleReactRequest() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3785:2: ( (kw= 'Wrapper' | kw= 'AuxWrapper' ) )
            // InternalMyDsl.g:3786:2: (kw= 'Wrapper' | kw= 'AuxWrapper' )
            {
            // InternalMyDsl.g:3786:2: (kw= 'Wrapper' | kw= 'AuxWrapper' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==81) ) {
                alt19=1;
            }
            else if ( (LA19_0==82) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:3787:3: kw= 'Wrapper'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactRequestAccess().getWrapperKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3793:3: kw= 'AuxWrapper'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); 

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
    // InternalMyDsl.g:3802:1: entryRuleReactLibraries returns [EObject current=null] : iv_ruleReactLibraries= ruleReactLibraries EOF ;
    public final EObject entryRuleReactLibraries() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactLibraries = null;


        try {
            // InternalMyDsl.g:3802:55: (iv_ruleReactLibraries= ruleReactLibraries EOF )
            // InternalMyDsl.g:3803:2: iv_ruleReactLibraries= ruleReactLibraries EOF
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
    // InternalMyDsl.g:3809:1: ruleReactLibraries returns [EObject current=null] : (otherlv_0= 'ReactLibraries' otherlv_1= ':' otherlv_2= '{' ( (lv_reactlibraries_3_0= ruleReactLibrary ) )+ otherlv_4= '}' ) ;
    public final EObject ruleReactLibraries() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reactlibraries_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3815:2: ( (otherlv_0= 'ReactLibraries' otherlv_1= ':' otherlv_2= '{' ( (lv_reactlibraries_3_0= ruleReactLibrary ) )+ otherlv_4= '}' ) )
            // InternalMyDsl.g:3816:2: (otherlv_0= 'ReactLibraries' otherlv_1= ':' otherlv_2= '{' ( (lv_reactlibraries_3_0= ruleReactLibrary ) )+ otherlv_4= '}' )
            {
            // InternalMyDsl.g:3816:2: (otherlv_0= 'ReactLibraries' otherlv_1= ':' otherlv_2= '{' ( (lv_reactlibraries_3_0= ruleReactLibrary ) )+ otherlv_4= '}' )
            // InternalMyDsl.g:3817:3: otherlv_0= 'ReactLibraries' otherlv_1= ':' otherlv_2= '{' ( (lv_reactlibraries_3_0= ruleReactLibrary ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,83,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReactLibrariesAccess().getReactLibrariesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReactLibrariesAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_77); 

            			newLeafNode(otherlv_2, grammarAccess.getReactLibrariesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:3829:3: ( (lv_reactlibraries_3_0= ruleReactLibrary ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=85 && LA20_0<=90)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:3830:4: (lv_reactlibraries_3_0= ruleReactLibrary )
            	    {
            	    // InternalMyDsl.g:3830:4: (lv_reactlibraries_3_0= ruleReactLibrary )
            	    // InternalMyDsl.g:3831:5: lv_reactlibraries_3_0= ruleReactLibrary
            	    {

            	    					newCompositeNode(grammarAccess.getReactLibrariesAccess().getReactlibrariesReactLibraryParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_78);
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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
    // InternalMyDsl.g:3856:1: entryRuleReactLibrary returns [EObject current=null] : iv_ruleReactLibrary= ruleReactLibrary EOF ;
    public final EObject entryRuleReactLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactLibrary = null;


        try {
            // InternalMyDsl.g:3856:53: (iv_ruleReactLibrary= ruleReactLibrary EOF )
            // InternalMyDsl.g:3857:2: iv_ruleReactLibrary= ruleReactLibrary EOF
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
    // InternalMyDsl.g:3863:1: ruleReactLibrary returns [EObject current=null] : ( ruleReactLibraryType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'LibraryContent' ) ;
    public final EObject ruleReactLibrary() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3869:2: ( ( ruleReactLibraryType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'LibraryContent' ) )
            // InternalMyDsl.g:3870:2: ( ruleReactLibraryType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'LibraryContent' )
            {
            // InternalMyDsl.g:3870:2: ( ruleReactLibraryType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'LibraryContent' )
            // InternalMyDsl.g:3871:3: ruleReactLibraryType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'LibraryContent'
            {

            			newCompositeNode(grammarAccess.getReactLibraryAccess().getReactLibraryTypeParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            ruleReactLibraryType();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:3878:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:3879:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:3879:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:3880:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_79); 

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

            otherlv_2=(Token)match(input,84,FOLLOW_2); 

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
    // InternalMyDsl.g:3904:1: entryRuleReactLibraryType returns [String current=null] : iv_ruleReactLibraryType= ruleReactLibraryType EOF ;
    public final String entryRuleReactLibraryType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReactLibraryType = null;


        try {
            // InternalMyDsl.g:3904:56: (iv_ruleReactLibraryType= ruleReactLibraryType EOF )
            // InternalMyDsl.g:3905:2: iv_ruleReactLibraryType= ruleReactLibraryType EOF
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
    // InternalMyDsl.g:3911:1: ruleReactLibraryType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ReactDesign' | kw= 'ReactRouting' | kw= 'ComponentManagement' | kw= 'StoreManagement' | kw= 'ReactDeployment' | kw= 'ConfigurationLibrary' ) ;
    public final AntlrDatatypeRuleToken ruleReactLibraryType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3917:2: ( (kw= 'ReactDesign' | kw= 'ReactRouting' | kw= 'ComponentManagement' | kw= 'StoreManagement' | kw= 'ReactDeployment' | kw= 'ConfigurationLibrary' ) )
            // InternalMyDsl.g:3918:2: (kw= 'ReactDesign' | kw= 'ReactRouting' | kw= 'ComponentManagement' | kw= 'StoreManagement' | kw= 'ReactDeployment' | kw= 'ConfigurationLibrary' )
            {
            // InternalMyDsl.g:3918:2: (kw= 'ReactDesign' | kw= 'ReactRouting' | kw= 'ComponentManagement' | kw= 'StoreManagement' | kw= 'ReactDeployment' | kw= 'ConfigurationLibrary' )
            int alt21=6;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt21=1;
                }
                break;
            case 86:
                {
                alt21=2;
                }
                break;
            case 87:
                {
                alt21=3;
                }
                break;
            case 88:
                {
                alt21=4;
                }
                break;
            case 89:
                {
                alt21=5;
                }
                break;
            case 90:
                {
                alt21=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:3919:3: kw= 'ReactDesign'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactLibraryTypeAccess().getReactDesignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3925:3: kw= 'ReactRouting'
                    {
                    kw=(Token)match(input,86,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactLibraryTypeAccess().getReactRoutingKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3931:3: kw= 'ComponentManagement'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactLibraryTypeAccess().getComponentManagementKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:3937:3: kw= 'StoreManagement'
                    {
                    kw=(Token)match(input,88,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactLibraryTypeAccess().getStoreManagementKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:3943:3: kw= 'ReactDeployment'
                    {
                    kw=(Token)match(input,89,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactLibraryTypeAccess().getReactDeploymentKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:3949:3: kw= 'ConfigurationLibrary'
                    {
                    kw=(Token)match(input,90,FOLLOW_2); 

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
    // InternalMyDsl.g:3958:1: entryRuleReactInfo returns [EObject current=null] : iv_ruleReactInfo= ruleReactInfo EOF ;
    public final EObject entryRuleReactInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactInfo = null;


        try {
            // InternalMyDsl.g:3958:50: (iv_ruleReactInfo= ruleReactInfo EOF )
            // InternalMyDsl.g:3959:2: iv_ruleReactInfo= ruleReactInfo EOF
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
    // InternalMyDsl.g:3965:1: ruleReactInfo returns [EObject current=null] : (otherlv_0= 'ReactInformation' otherlv_1= ':' otherlv_2= '{' ( (lv_reactinformation_3_0= ruleReactInformation ) )+ otherlv_4= '}' ) ;
    public final EObject ruleReactInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reactinformation_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3971:2: ( (otherlv_0= 'ReactInformation' otherlv_1= ':' otherlv_2= '{' ( (lv_reactinformation_3_0= ruleReactInformation ) )+ otherlv_4= '}' ) )
            // InternalMyDsl.g:3972:2: (otherlv_0= 'ReactInformation' otherlv_1= ':' otherlv_2= '{' ( (lv_reactinformation_3_0= ruleReactInformation ) )+ otherlv_4= '}' )
            {
            // InternalMyDsl.g:3972:2: (otherlv_0= 'ReactInformation' otherlv_1= ':' otherlv_2= '{' ( (lv_reactinformation_3_0= ruleReactInformation ) )+ otherlv_4= '}' )
            // InternalMyDsl.g:3973:3: otherlv_0= 'ReactInformation' otherlv_1= ':' otherlv_2= '{' ( (lv_reactinformation_3_0= ruleReactInformation ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,91,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReactInfoAccess().getReactInformationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReactInfoAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_80); 

            			newLeafNode(otherlv_2, grammarAccess.getReactInfoAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:3985:3: ( (lv_reactinformation_3_0= ruleReactInformation ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=93 && LA22_0<=94)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:3986:4: (lv_reactinformation_3_0= ruleReactInformation )
            	    {
            	    // InternalMyDsl.g:3986:4: (lv_reactinformation_3_0= ruleReactInformation )
            	    // InternalMyDsl.g:3987:5: lv_reactinformation_3_0= ruleReactInformation
            	    {

            	    					newCompositeNode(grammarAccess.getReactInfoAccess().getReactinformationReactInformationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_81);
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
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
    // InternalMyDsl.g:4012:1: entryRuleReactInformation returns [EObject current=null] : iv_ruleReactInformation= ruleReactInformation EOF ;
    public final EObject entryRuleReactInformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactInformation = null;


        try {
            // InternalMyDsl.g:4012:57: (iv_ruleReactInformation= ruleReactInformation EOF )
            // InternalMyDsl.g:4013:2: iv_ruleReactInformation= ruleReactInformation EOF
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
    // InternalMyDsl.g:4019:1: ruleReactInformation returns [EObject current=null] : ( ruleReactInformationType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'InformationContent' ) ;
    public final EObject ruleReactInformation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:4025:2: ( ( ruleReactInformationType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'InformationContent' ) )
            // InternalMyDsl.g:4026:2: ( ruleReactInformationType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'InformationContent' )
            {
            // InternalMyDsl.g:4026:2: ( ruleReactInformationType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'InformationContent' )
            // InternalMyDsl.g:4027:3: ruleReactInformationType ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'InformationContent'
            {

            			newCompositeNode(grammarAccess.getReactInformationAccess().getReactInformationTypeParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            ruleReactInformationType();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:4034:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:4035:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:4035:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:4036:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_82); 

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

            otherlv_2=(Token)match(input,92,FOLLOW_2); 

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
    // InternalMyDsl.g:4060:1: entryRuleReactInformationType returns [String current=null] : iv_ruleReactInformationType= ruleReactInformationType EOF ;
    public final String entryRuleReactInformationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReactInformationType = null;


        try {
            // InternalMyDsl.g:4060:60: (iv_ruleReactInformationType= ruleReactInformationType EOF )
            // InternalMyDsl.g:4061:2: iv_ruleReactInformationType= ruleReactInformationType EOF
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
    // InternalMyDsl.g:4067:1: ruleReactInformationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ReactReadme' | kw= 'ReactAditionalInfo' ) ;
    public final AntlrDatatypeRuleToken ruleReactInformationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:4073:2: ( (kw= 'ReactReadme' | kw= 'ReactAditionalInfo' ) )
            // InternalMyDsl.g:4074:2: (kw= 'ReactReadme' | kw= 'ReactAditionalInfo' )
            {
            // InternalMyDsl.g:4074:2: (kw= 'ReactReadme' | kw= 'ReactAditionalInfo' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==93) ) {
                alt23=1;
            }
            else if ( (LA23_0==94) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:4075:3: kw= 'ReactReadme'
                    {
                    kw=(Token)match(input,93,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReactInformationTypeAccess().getReactReadmeKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:4081:3: kw= 'ReactAditionalInfo'
                    {
                    kw=(Token)match(input,94,FOLLOW_2); 

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
    // InternalMyDsl.g:4090:1: entryRuleSpring returns [EObject current=null] : iv_ruleSpring= ruleSpring EOF ;
    public final EObject entryRuleSpring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpring = null;


        try {
            // InternalMyDsl.g:4090:47: (iv_ruleSpring= ruleSpring EOF )
            // InternalMyDsl.g:4091:2: iv_ruleSpring= ruleSpring EOF
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
    // InternalMyDsl.g:4097:1: ruleSpring returns [EObject current=null] : (otherlv_0= 'Spring' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSpring() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:4103:2: ( (otherlv_0= 'Spring' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:4104:2: (otherlv_0= 'Spring' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:4104:2: (otherlv_0= 'Spring' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:4105:3: otherlv_0= 'Spring' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,95,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSpringAccess().getSpringKeyword_0());
            		
            // InternalMyDsl.g:4109:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:4110:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:4110:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:4111:5: lv_name_1_0= RULE_ID
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
    // InternalMyDsl.g:4131:1: entryRulePostgreSQL returns [EObject current=null] : iv_rulePostgreSQL= rulePostgreSQL EOF ;
    public final EObject entryRulePostgreSQL() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostgreSQL = null;


        try {
            // InternalMyDsl.g:4131:51: (iv_rulePostgreSQL= rulePostgreSQL EOF )
            // InternalMyDsl.g:4132:2: iv_rulePostgreSQL= rulePostgreSQL EOF
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
    // InternalMyDsl.g:4138:1: rulePostgreSQL returns [EObject current=null] : (otherlv_0= 'PostgreSQL' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePostgreSQL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:4144:2: ( (otherlv_0= 'PostgreSQL' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:4145:2: (otherlv_0= 'PostgreSQL' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:4145:2: (otherlv_0= 'PostgreSQL' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:4146:3: otherlv_0= 'PostgreSQL' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,96,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPostgreSQLAccess().getPostgreSQLKeyword_0());
            		
            // InternalMyDsl.g:4150:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:4151:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:4151:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:4152:5: lv_name_1_0= RULE_ID
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
    // InternalMyDsl.g:4172:1: entryRuleAmazonWebServices returns [EObject current=null] : iv_ruleAmazonWebServices= ruleAmazonWebServices EOF ;
    public final EObject entryRuleAmazonWebServices() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmazonWebServices = null;


        try {
            // InternalMyDsl.g:4172:58: (iv_ruleAmazonWebServices= ruleAmazonWebServices EOF )
            // InternalMyDsl.g:4173:2: iv_ruleAmazonWebServices= ruleAmazonWebServices EOF
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
    // InternalMyDsl.g:4179:1: ruleAmazonWebServices returns [EObject current=null] : (otherlv_0= 'AmazonWebServices' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAmazonWebServices() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:4185:2: ( (otherlv_0= 'AmazonWebServices' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:4186:2: (otherlv_0= 'AmazonWebServices' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:4186:2: (otherlv_0= 'AmazonWebServices' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:4187:3: otherlv_0= 'AmazonWebServices' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,97,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAmazonWebServicesAccess().getAmazonWebServicesKeyword_0());
            		
            // InternalMyDsl.g:4191:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:4192:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:4192:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:4193:5: lv_name_1_0= RULE_ID
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000008000000000L});
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
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x001F000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000740L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x8000000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000007E00000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000004000L,0x0000000007E00000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000004000L,0x0000000060000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});

}