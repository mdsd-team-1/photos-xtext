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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'System'", "':'", "'{'", "'}'", "'Domain'", "'Entities'", "'Photo'", "'Album'", "'UserDomain'", "'Functionalities'", "'ProfileManagement'", "'ViewProfilePhoto'", "'EditProfileInfo'", "'AppAccess'", "'Login'", "'Register'", "'AlbumManagement'", "'CreateAlbum'", "'SelectAlbum'", "'PhotoActions'", "'ViewAllPhotos'", "'ViewExtendedPhoto'", "'LoadPhoto'", "'LandingActions'", "'ViewCarousel'", "'PassPhoto'", "'DomainRelations'", "'Architecture:'", "'Technology'", "'React'", "'ReactModules'", "'ReactConfiguration'", "'DependenciesStruct'", "'DependencyType'", "'PackageName'", "'PackageVersion'", "'ReactDOMConfigurations'", "'ReactComponents'", "'LogicComponents'", "'UIComponents'", "'ReactActions'", "'Libraries'", "'Information'", "'Spring'", "'PostgreSQL'", "'AmazonWebServices'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    // InternalMyDsl.g:327:1: ruleEntities returns [EObject current=null] : ( ( (lv_elements_0_0= rulePhoto ) ) ( (lv_elements_1_0= ruleAlbum ) ) ( (lv_elements_2_0= ruleUserDomain ) ) ) ;
    public final EObject ruleEntities() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;

        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:333:2: ( ( ( (lv_elements_0_0= rulePhoto ) ) ( (lv_elements_1_0= ruleAlbum ) ) ( (lv_elements_2_0= ruleUserDomain ) ) ) )
            // InternalMyDsl.g:334:2: ( ( (lv_elements_0_0= rulePhoto ) ) ( (lv_elements_1_0= ruleAlbum ) ) ( (lv_elements_2_0= ruleUserDomain ) ) )
            {
            // InternalMyDsl.g:334:2: ( ( (lv_elements_0_0= rulePhoto ) ) ( (lv_elements_1_0= ruleAlbum ) ) ( (lv_elements_2_0= ruleUserDomain ) ) )
            // InternalMyDsl.g:335:3: ( (lv_elements_0_0= rulePhoto ) ) ( (lv_elements_1_0= ruleAlbum ) ) ( (lv_elements_2_0= ruleUserDomain ) )
            {
            // InternalMyDsl.g:335:3: ( (lv_elements_0_0= rulePhoto ) )
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

            // InternalMyDsl.g:354:3: ( (lv_elements_1_0= ruleAlbum ) )
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

            // InternalMyDsl.g:373:3: ( (lv_elements_2_0= ruleUserDomain ) )
            // InternalMyDsl.g:374:4: (lv_elements_2_0= ruleUserDomain )
            {
            // InternalMyDsl.g:374:4: (lv_elements_2_0= ruleUserDomain )
            // InternalMyDsl.g:375:5: lv_elements_2_0= ruleUserDomain
            {

            					newCompositeNode(grammarAccess.getEntitiesAccess().getElementsUserDomainParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
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
            		
            otherlv_2=(Token)match(input,13,FOLLOW_16); 

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
            				
            pushFollow(FOLLOW_17);
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
            				
            pushFollow(FOLLOW_18);
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
            				
            pushFollow(FOLLOW_19);
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
            				
            pushFollow(FOLLOW_20);
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
            		
            otherlv_1=(Token)match(input,12,FOLLOW_21); 

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
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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
            		
            otherlv_1=(Token)match(input,12,FOLLOW_23); 

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
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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
            		
            otherlv_1=(Token)match(input,12,FOLLOW_25); 

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
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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
            		
            otherlv_1=(Token)match(input,12,FOLLOW_27); 

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
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

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
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_29); 

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
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

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
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); 

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
            		
            otherlv_2=(Token)match(input,13,FOLLOW_15); 

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
            		
            otherlv_3=(Token)match(input,13,FOLLOW_16); 

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

            otherlv_5=(Token)match(input,14,FOLLOW_14); 

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
            		
            otherlv_9=(Token)match(input,13,FOLLOW_25); 

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
            		
            otherlv_15=(Token)match(input,13,FOLLOW_27); 

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

            otherlv_17=(Token)match(input,14,FOLLOW_19); 

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
            		
            otherlv_21=(Token)match(input,13,FOLLOW_18); 

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
            		
            otherlv_3=(Token)match(input,13,FOLLOW_32); 

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
            				
            pushFollow(FOLLOW_33);
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
            				
            pushFollow(FOLLOW_34);
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
            				
            pushFollow(FOLLOW_35);
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
            		
            otherlv_3=(Token)match(input,13,FOLLOW_36); 

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
            		
            otherlv_2=(Token)match(input,13,FOLLOW_37); 

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
            				
            pushFollow(FOLLOW_38);
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
            				
            pushFollow(FOLLOW_39);
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
            				
            pushFollow(FOLLOW_40);
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
            				
            pushFollow(FOLLOW_41);
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
    // InternalMyDsl.g:2062:1: ruleReactConfiguration returns [EObject current=null] : (otherlv_0= 'ReactConfiguration' ( (lv_dependencies_1_0= ruleReactDependencies ) ) ( (lv_configurations_2_0= ruleReactConfigurations ) ) ) ;
    public final EObject ruleReactConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_dependencies_1_0 = null;

        EObject lv_configurations_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2068:2: ( (otherlv_0= 'ReactConfiguration' ( (lv_dependencies_1_0= ruleReactDependencies ) ) ( (lv_configurations_2_0= ruleReactConfigurations ) ) ) )
            // InternalMyDsl.g:2069:2: (otherlv_0= 'ReactConfiguration' ( (lv_dependencies_1_0= ruleReactDependencies ) ) ( (lv_configurations_2_0= ruleReactConfigurations ) ) )
            {
            // InternalMyDsl.g:2069:2: (otherlv_0= 'ReactConfiguration' ( (lv_dependencies_1_0= ruleReactDependencies ) ) ( (lv_configurations_2_0= ruleReactConfigurations ) ) )
            // InternalMyDsl.g:2070:3: otherlv_0= 'ReactConfiguration' ( (lv_dependencies_1_0= ruleReactDependencies ) ) ( (lv_configurations_2_0= ruleReactConfigurations ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42); 

            			newLeafNode(otherlv_0, grammarAccess.getReactConfigurationAccess().getReactConfigurationKeyword_0());
            		
            // InternalMyDsl.g:2074:3: ( (lv_dependencies_1_0= ruleReactDependencies ) )
            // InternalMyDsl.g:2075:4: (lv_dependencies_1_0= ruleReactDependencies )
            {
            // InternalMyDsl.g:2075:4: (lv_dependencies_1_0= ruleReactDependencies )
            // InternalMyDsl.g:2076:5: lv_dependencies_1_0= ruleReactDependencies
            {

            					newCompositeNode(grammarAccess.getReactConfigurationAccess().getDependenciesReactDependenciesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_43);
            lv_dependencies_1_0=ruleReactDependencies();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactConfigurationRule());
            					}
            					add(
            						current,
            						"dependencies",
            						lv_dependencies_1_0,
            						"org.xtext.example.mydsl.MyDsl.ReactDependencies");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2093:3: ( (lv_configurations_2_0= ruleReactConfigurations ) )
            // InternalMyDsl.g:2094:4: (lv_configurations_2_0= ruleReactConfigurations )
            {
            // InternalMyDsl.g:2094:4: (lv_configurations_2_0= ruleReactConfigurations )
            // InternalMyDsl.g:2095:5: lv_configurations_2_0= ruleReactConfigurations
            {

            					newCompositeNode(grammarAccess.getReactConfigurationAccess().getConfigurationsReactConfigurationsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_configurations_2_0=ruleReactConfigurations();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactConfigurationRule());
            					}
            					add(
            						current,
            						"configurations",
            						lv_configurations_2_0,
            						"org.xtext.example.mydsl.MyDsl.ReactConfigurations");
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
    // $ANTLR end "ruleReactConfiguration"


    // $ANTLR start "entryRuleReactDependencies"
    // InternalMyDsl.g:2116:1: entryRuleReactDependencies returns [EObject current=null] : iv_ruleReactDependencies= ruleReactDependencies EOF ;
    public final EObject entryRuleReactDependencies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactDependencies = null;


        try {
            // InternalMyDsl.g:2116:58: (iv_ruleReactDependencies= ruleReactDependencies EOF )
            // InternalMyDsl.g:2117:2: iv_ruleReactDependencies= ruleReactDependencies EOF
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
    // InternalMyDsl.g:2123:1: ruleReactDependencies returns [EObject current=null] : (otherlv_0= 'DependenciesStruct' ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+ ) ;
    public final EObject ruleReactDependencies() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_dependencies_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2129:2: ( (otherlv_0= 'DependenciesStruct' ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+ ) )
            // InternalMyDsl.g:2130:2: (otherlv_0= 'DependenciesStruct' ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+ )
            {
            // InternalMyDsl.g:2130:2: (otherlv_0= 'DependenciesStruct' ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+ )
            // InternalMyDsl.g:2131:3: otherlv_0= 'DependenciesStruct' ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+
            {
            otherlv_0=(Token)match(input,43,FOLLOW_44); 

            			newLeafNode(otherlv_0, grammarAccess.getReactDependenciesAccess().getDependenciesStructKeyword_0());
            		
            // InternalMyDsl.g:2135:3: ( (lv_dependencies_1_0= ruleReactDependenciesRules ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==44) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:2136:4: (lv_dependencies_1_0= ruleReactDependenciesRules )
            	    {
            	    // InternalMyDsl.g:2136:4: (lv_dependencies_1_0= ruleReactDependenciesRules )
            	    // InternalMyDsl.g:2137:5: lv_dependencies_1_0= ruleReactDependenciesRules
            	    {

            	    					newCompositeNode(grammarAccess.getReactDependenciesAccess().getDependenciesReactDependenciesRulesParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_45);
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
    // InternalMyDsl.g:2158:1: entryRuleReactDependenciesRules returns [EObject current=null] : iv_ruleReactDependenciesRules= ruleReactDependenciesRules EOF ;
    public final EObject entryRuleReactDependenciesRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactDependenciesRules = null;


        try {
            // InternalMyDsl.g:2158:63: (iv_ruleReactDependenciesRules= ruleReactDependenciesRules EOF )
            // InternalMyDsl.g:2159:2: iv_ruleReactDependenciesRules= ruleReactDependenciesRules EOF
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
    // InternalMyDsl.g:2165:1: ruleReactDependenciesRules returns [EObject current=null] : (otherlv_0= 'DependencyType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+ ) ;
    public final EObject ruleReactDependenciesRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_dependencies_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2171:2: ( (otherlv_0= 'DependencyType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+ ) )
            // InternalMyDsl.g:2172:2: (otherlv_0= 'DependencyType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+ )
            {
            // InternalMyDsl.g:2172:2: (otherlv_0= 'DependencyType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+ )
            // InternalMyDsl.g:2173:3: otherlv_0= 'DependencyType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+
            {
            otherlv_0=(Token)match(input,44,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReactDependenciesRulesAccess().getDependencyTypeKeyword_0());
            		
            // InternalMyDsl.g:2177:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2178:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2178:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2179:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_46); 

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

            // InternalMyDsl.g:2195:3: ( (lv_dependencies_2_0= ruleReactDependenciesSubRules ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==45) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:2196:4: (lv_dependencies_2_0= ruleReactDependenciesSubRules )
            	    {
            	    // InternalMyDsl.g:2196:4: (lv_dependencies_2_0= ruleReactDependenciesSubRules )
            	    // InternalMyDsl.g:2197:5: lv_dependencies_2_0= ruleReactDependenciesSubRules
            	    {

            	    					newCompositeNode(grammarAccess.getReactDependenciesRulesAccess().getDependenciesReactDependenciesSubRulesParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_47);
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // InternalMyDsl.g:2218:1: entryRuleReactDependenciesSubRules returns [EObject current=null] : iv_ruleReactDependenciesSubRules= ruleReactDependenciesSubRules EOF ;
    public final EObject entryRuleReactDependenciesSubRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactDependenciesSubRules = null;


        try {
            // InternalMyDsl.g:2218:66: (iv_ruleReactDependenciesSubRules= ruleReactDependenciesSubRules EOF )
            // InternalMyDsl.g:2219:2: iv_ruleReactDependenciesSubRules= ruleReactDependenciesSubRules EOF
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
    // InternalMyDsl.g:2225:1: ruleReactDependenciesSubRules returns [EObject current=null] : ( (lv_dependencies_0_0= ruleSingleDependencies ) ) ;
    public final EObject ruleReactDependenciesSubRules() throws RecognitionException {
        EObject current = null;

        EObject lv_dependencies_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2231:2: ( ( (lv_dependencies_0_0= ruleSingleDependencies ) ) )
            // InternalMyDsl.g:2232:2: ( (lv_dependencies_0_0= ruleSingleDependencies ) )
            {
            // InternalMyDsl.g:2232:2: ( (lv_dependencies_0_0= ruleSingleDependencies ) )
            // InternalMyDsl.g:2233:3: (lv_dependencies_0_0= ruleSingleDependencies )
            {
            // InternalMyDsl.g:2233:3: (lv_dependencies_0_0= ruleSingleDependencies )
            // InternalMyDsl.g:2234:4: lv_dependencies_0_0= ruleSingleDependencies
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
    // InternalMyDsl.g:2254:1: entryRuleSingleDependencies returns [EObject current=null] : iv_ruleSingleDependencies= ruleSingleDependencies EOF ;
    public final EObject entryRuleSingleDependencies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleDependencies = null;


        try {
            // InternalMyDsl.g:2254:59: (iv_ruleSingleDependencies= ruleSingleDependencies EOF )
            // InternalMyDsl.g:2255:2: iv_ruleSingleDependencies= ruleSingleDependencies EOF
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
    // InternalMyDsl.g:2261:1: ruleSingleDependencies returns [EObject current=null] : ( ( (lv_dependencies_0_0= rulePackageName ) ) ( (lv_dependencies_1_0= rulePackageVersion ) ) ) ;
    public final EObject ruleSingleDependencies() throws RecognitionException {
        EObject current = null;

        EObject lv_dependencies_0_0 = null;

        EObject lv_dependencies_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2267:2: ( ( ( (lv_dependencies_0_0= rulePackageName ) ) ( (lv_dependencies_1_0= rulePackageVersion ) ) ) )
            // InternalMyDsl.g:2268:2: ( ( (lv_dependencies_0_0= rulePackageName ) ) ( (lv_dependencies_1_0= rulePackageVersion ) ) )
            {
            // InternalMyDsl.g:2268:2: ( ( (lv_dependencies_0_0= rulePackageName ) ) ( (lv_dependencies_1_0= rulePackageVersion ) ) )
            // InternalMyDsl.g:2269:3: ( (lv_dependencies_0_0= rulePackageName ) ) ( (lv_dependencies_1_0= rulePackageVersion ) )
            {
            // InternalMyDsl.g:2269:3: ( (lv_dependencies_0_0= rulePackageName ) )
            // InternalMyDsl.g:2270:4: (lv_dependencies_0_0= rulePackageName )
            {
            // InternalMyDsl.g:2270:4: (lv_dependencies_0_0= rulePackageName )
            // InternalMyDsl.g:2271:5: lv_dependencies_0_0= rulePackageName
            {

            					newCompositeNode(grammarAccess.getSingleDependenciesAccess().getDependenciesPackageNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_48);
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

            // InternalMyDsl.g:2288:3: ( (lv_dependencies_1_0= rulePackageVersion ) )
            // InternalMyDsl.g:2289:4: (lv_dependencies_1_0= rulePackageVersion )
            {
            // InternalMyDsl.g:2289:4: (lv_dependencies_1_0= rulePackageVersion )
            // InternalMyDsl.g:2290:5: lv_dependencies_1_0= rulePackageVersion
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
    // InternalMyDsl.g:2311:1: entryRulePackageName returns [EObject current=null] : iv_rulePackageName= rulePackageName EOF ;
    public final EObject entryRulePackageName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageName = null;


        try {
            // InternalMyDsl.g:2311:52: (iv_rulePackageName= rulePackageName EOF )
            // InternalMyDsl.g:2312:2: iv_rulePackageName= rulePackageName EOF
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
    // InternalMyDsl.g:2318:1: rulePackageName returns [EObject current=null] : (otherlv_0= 'PackageName' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePackageName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2324:2: ( (otherlv_0= 'PackageName' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:2325:2: (otherlv_0= 'PackageName' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:2325:2: (otherlv_0= 'PackageName' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:2326:3: otherlv_0= 'PackageName' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageNameAccess().getPackageNameKeyword_0());
            		
            // InternalMyDsl.g:2330:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2331:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2331:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2332:5: lv_name_1_0= RULE_ID
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
    // InternalMyDsl.g:2352:1: entryRulePackageVersion returns [EObject current=null] : iv_rulePackageVersion= rulePackageVersion EOF ;
    public final EObject entryRulePackageVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageVersion = null;


        try {
            // InternalMyDsl.g:2352:55: (iv_rulePackageVersion= rulePackageVersion EOF )
            // InternalMyDsl.g:2353:2: iv_rulePackageVersion= rulePackageVersion EOF
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
    // InternalMyDsl.g:2359:1: rulePackageVersion returns [EObject current=null] : (otherlv_0= 'PackageVersion' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePackageVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2365:2: ( (otherlv_0= 'PackageVersion' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:2366:2: (otherlv_0= 'PackageVersion' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:2366:2: (otherlv_0= 'PackageVersion' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:2367:3: otherlv_0= 'PackageVersion' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageVersionAccess().getPackageVersionKeyword_0());
            		
            // InternalMyDsl.g:2371:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2372:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2372:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2373:5: lv_name_1_0= RULE_ID
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
    // InternalMyDsl.g:2393:1: entryRuleReactConfigurations returns [EObject current=null] : iv_ruleReactConfigurations= ruleReactConfigurations EOF ;
    public final EObject entryRuleReactConfigurations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactConfigurations = null;


        try {
            // InternalMyDsl.g:2393:60: (iv_ruleReactConfigurations= ruleReactConfigurations EOF )
            // InternalMyDsl.g:2394:2: iv_ruleReactConfigurations= ruleReactConfigurations EOF
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
    // InternalMyDsl.g:2400:1: ruleReactConfigurations returns [EObject current=null] : (otherlv_0= 'ReactDOMConfigurations' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleReactConfigurations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2406:2: ( (otherlv_0= 'ReactDOMConfigurations' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:2407:2: (otherlv_0= 'ReactDOMConfigurations' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:2407:2: (otherlv_0= 'ReactDOMConfigurations' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:2408:3: otherlv_0= 'ReactDOMConfigurations' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReactConfigurationsAccess().getReactDOMConfigurationsKeyword_0());
            		
            // InternalMyDsl.g:2412:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2413:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2413:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2414:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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


    // $ANTLR start "entryRuleReactComponents"
    // InternalMyDsl.g:2434:1: entryRuleReactComponents returns [EObject current=null] : iv_ruleReactComponents= ruleReactComponents EOF ;
    public final EObject entryRuleReactComponents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactComponents = null;


        try {
            // InternalMyDsl.g:2434:56: (iv_ruleReactComponents= ruleReactComponents EOF )
            // InternalMyDsl.g:2435:2: iv_ruleReactComponents= ruleReactComponents EOF
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
    // InternalMyDsl.g:2441:1: ruleReactComponents returns [EObject current=null] : (otherlv_0= 'ReactComponents' ( (lv_componentslogic_1_0= ruleComponentsLogic ) ) ( (lv_componentsui_2_0= ruleComponentsUI ) ) ) ;
    public final EObject ruleReactComponents() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_componentslogic_1_0 = null;

        EObject lv_componentsui_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2447:2: ( (otherlv_0= 'ReactComponents' ( (lv_componentslogic_1_0= ruleComponentsLogic ) ) ( (lv_componentsui_2_0= ruleComponentsUI ) ) ) )
            // InternalMyDsl.g:2448:2: (otherlv_0= 'ReactComponents' ( (lv_componentslogic_1_0= ruleComponentsLogic ) ) ( (lv_componentsui_2_0= ruleComponentsUI ) ) )
            {
            // InternalMyDsl.g:2448:2: (otherlv_0= 'ReactComponents' ( (lv_componentslogic_1_0= ruleComponentsLogic ) ) ( (lv_componentsui_2_0= ruleComponentsUI ) ) )
            // InternalMyDsl.g:2449:3: otherlv_0= 'ReactComponents' ( (lv_componentslogic_1_0= ruleComponentsLogic ) ) ( (lv_componentsui_2_0= ruleComponentsUI ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_49); 

            			newLeafNode(otherlv_0, grammarAccess.getReactComponentsAccess().getReactComponentsKeyword_0());
            		
            // InternalMyDsl.g:2453:3: ( (lv_componentslogic_1_0= ruleComponentsLogic ) )
            // InternalMyDsl.g:2454:4: (lv_componentslogic_1_0= ruleComponentsLogic )
            {
            // InternalMyDsl.g:2454:4: (lv_componentslogic_1_0= ruleComponentsLogic )
            // InternalMyDsl.g:2455:5: lv_componentslogic_1_0= ruleComponentsLogic
            {

            					newCompositeNode(grammarAccess.getReactComponentsAccess().getComponentslogicComponentsLogicParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_50);
            lv_componentslogic_1_0=ruleComponentsLogic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactComponentsRule());
            					}
            					add(
            						current,
            						"componentslogic",
            						lv_componentslogic_1_0,
            						"org.xtext.example.mydsl.MyDsl.ComponentsLogic");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2472:3: ( (lv_componentsui_2_0= ruleComponentsUI ) )
            // InternalMyDsl.g:2473:4: (lv_componentsui_2_0= ruleComponentsUI )
            {
            // InternalMyDsl.g:2473:4: (lv_componentsui_2_0= ruleComponentsUI )
            // InternalMyDsl.g:2474:5: lv_componentsui_2_0= ruleComponentsUI
            {

            					newCompositeNode(grammarAccess.getReactComponentsAccess().getComponentsuiComponentsUIParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_componentsui_2_0=ruleComponentsUI();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactComponentsRule());
            					}
            					add(
            						current,
            						"componentsui",
            						lv_componentsui_2_0,
            						"org.xtext.example.mydsl.MyDsl.ComponentsUI");
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
    // $ANTLR end "ruleReactComponents"


    // $ANTLR start "entryRuleComponentsLogic"
    // InternalMyDsl.g:2495:1: entryRuleComponentsLogic returns [EObject current=null] : iv_ruleComponentsLogic= ruleComponentsLogic EOF ;
    public final EObject entryRuleComponentsLogic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentsLogic = null;


        try {
            // InternalMyDsl.g:2495:56: (iv_ruleComponentsLogic= ruleComponentsLogic EOF )
            // InternalMyDsl.g:2496:2: iv_ruleComponentsLogic= ruleComponentsLogic EOF
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
    // InternalMyDsl.g:2502:1: ruleComponentsLogic returns [EObject current=null] : (otherlv_0= 'LogicComponents' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleComponentsLogic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2508:2: ( (otherlv_0= 'LogicComponents' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:2509:2: (otherlv_0= 'LogicComponents' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:2509:2: (otherlv_0= 'LogicComponents' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:2510:3: otherlv_0= 'LogicComponents' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentsLogicAccess().getLogicComponentsKeyword_0());
            		
            // InternalMyDsl.g:2514:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2515:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2515:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2516:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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


    // $ANTLR start "entryRuleComponentsUI"
    // InternalMyDsl.g:2536:1: entryRuleComponentsUI returns [EObject current=null] : iv_ruleComponentsUI= ruleComponentsUI EOF ;
    public final EObject entryRuleComponentsUI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentsUI = null;


        try {
            // InternalMyDsl.g:2536:53: (iv_ruleComponentsUI= ruleComponentsUI EOF )
            // InternalMyDsl.g:2537:2: iv_ruleComponentsUI= ruleComponentsUI EOF
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
    // InternalMyDsl.g:2543:1: ruleComponentsUI returns [EObject current=null] : (otherlv_0= 'UIComponents' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleComponentsUI() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2549:2: ( (otherlv_0= 'UIComponents' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:2550:2: (otherlv_0= 'UIComponents' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:2550:2: (otherlv_0= 'UIComponents' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:2551:3: otherlv_0= 'UIComponents' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentsUIAccess().getUIComponentsKeyword_0());
            		
            // InternalMyDsl.g:2555:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2556:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2556:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2557:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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


    // $ANTLR start "entryRuleReactActions"
    // InternalMyDsl.g:2577:1: entryRuleReactActions returns [EObject current=null] : iv_ruleReactActions= ruleReactActions EOF ;
    public final EObject entryRuleReactActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactActions = null;


        try {
            // InternalMyDsl.g:2577:53: (iv_ruleReactActions= ruleReactActions EOF )
            // InternalMyDsl.g:2578:2: iv_ruleReactActions= ruleReactActions EOF
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
    // InternalMyDsl.g:2584:1: ruleReactActions returns [EObject current=null] : (otherlv_0= 'ReactActions' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleReactActions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2590:2: ( (otherlv_0= 'ReactActions' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:2591:2: (otherlv_0= 'ReactActions' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:2591:2: (otherlv_0= 'ReactActions' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:2592:3: otherlv_0= 'ReactActions' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReactActionsAccess().getReactActionsKeyword_0());
            		
            // InternalMyDsl.g:2596:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2597:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2597:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2598:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getReactActionsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReactActionsRule());
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
    // $ANTLR end "ruleReactActions"


    // $ANTLR start "entryRuleReactLibraries"
    // InternalMyDsl.g:2618:1: entryRuleReactLibraries returns [EObject current=null] : iv_ruleReactLibraries= ruleReactLibraries EOF ;
    public final EObject entryRuleReactLibraries() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactLibraries = null;


        try {
            // InternalMyDsl.g:2618:55: (iv_ruleReactLibraries= ruleReactLibraries EOF )
            // InternalMyDsl.g:2619:2: iv_ruleReactLibraries= ruleReactLibraries EOF
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
    // InternalMyDsl.g:2625:1: ruleReactLibraries returns [EObject current=null] : (otherlv_0= 'Libraries' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleReactLibraries() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2631:2: ( (otherlv_0= 'Libraries' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:2632:2: (otherlv_0= 'Libraries' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:2632:2: (otherlv_0= 'Libraries' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:2633:3: otherlv_0= 'Libraries' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReactLibrariesAccess().getLibrariesKeyword_0());
            		
            // InternalMyDsl.g:2637:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2638:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2638:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2639:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getReactLibrariesAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReactLibrariesRule());
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
    // $ANTLR end "ruleReactLibraries"


    // $ANTLR start "entryRuleReactInfo"
    // InternalMyDsl.g:2659:1: entryRuleReactInfo returns [EObject current=null] : iv_ruleReactInfo= ruleReactInfo EOF ;
    public final EObject entryRuleReactInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactInfo = null;


        try {
            // InternalMyDsl.g:2659:50: (iv_ruleReactInfo= ruleReactInfo EOF )
            // InternalMyDsl.g:2660:2: iv_ruleReactInfo= ruleReactInfo EOF
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
    // InternalMyDsl.g:2666:1: ruleReactInfo returns [EObject current=null] : (otherlv_0= 'Information' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleReactInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2672:2: ( (otherlv_0= 'Information' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:2673:2: (otherlv_0= 'Information' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:2673:2: (otherlv_0= 'Information' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:2674:3: otherlv_0= 'Information' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReactInfoAccess().getInformationKeyword_0());
            		
            // InternalMyDsl.g:2678:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2679:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2679:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2680:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getReactInfoAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReactInfoRule());
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
    // $ANTLR end "ruleReactInfo"


    // $ANTLR start "entryRuleSpring"
    // InternalMyDsl.g:2700:1: entryRuleSpring returns [EObject current=null] : iv_ruleSpring= ruleSpring EOF ;
    public final EObject entryRuleSpring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpring = null;


        try {
            // InternalMyDsl.g:2700:47: (iv_ruleSpring= ruleSpring EOF )
            // InternalMyDsl.g:2701:2: iv_ruleSpring= ruleSpring EOF
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
    // InternalMyDsl.g:2707:1: ruleSpring returns [EObject current=null] : (otherlv_0= 'Spring' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSpring() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2713:2: ( (otherlv_0= 'Spring' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:2714:2: (otherlv_0= 'Spring' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:2714:2: (otherlv_0= 'Spring' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:2715:3: otherlv_0= 'Spring' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSpringAccess().getSpringKeyword_0());
            		
            // InternalMyDsl.g:2719:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2720:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2720:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2721:5: lv_name_1_0= RULE_ID
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
    // InternalMyDsl.g:2741:1: entryRulePostgreSQL returns [EObject current=null] : iv_rulePostgreSQL= rulePostgreSQL EOF ;
    public final EObject entryRulePostgreSQL() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostgreSQL = null;


        try {
            // InternalMyDsl.g:2741:51: (iv_rulePostgreSQL= rulePostgreSQL EOF )
            // InternalMyDsl.g:2742:2: iv_rulePostgreSQL= rulePostgreSQL EOF
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
    // InternalMyDsl.g:2748:1: rulePostgreSQL returns [EObject current=null] : (otherlv_0= 'PostgreSQL' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePostgreSQL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2754:2: ( (otherlv_0= 'PostgreSQL' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:2755:2: (otherlv_0= 'PostgreSQL' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:2755:2: (otherlv_0= 'PostgreSQL' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:2756:3: otherlv_0= 'PostgreSQL' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPostgreSQLAccess().getPostgreSQLKeyword_0());
            		
            // InternalMyDsl.g:2760:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2761:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2761:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2762:5: lv_name_1_0= RULE_ID
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
    // InternalMyDsl.g:2782:1: entryRuleAmazonWebServices returns [EObject current=null] : iv_ruleAmazonWebServices= ruleAmazonWebServices EOF ;
    public final EObject entryRuleAmazonWebServices() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmazonWebServices = null;


        try {
            // InternalMyDsl.g:2782:58: (iv_ruleAmazonWebServices= ruleAmazonWebServices EOF )
            // InternalMyDsl.g:2783:2: iv_ruleAmazonWebServices= ruleAmazonWebServices EOF
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
    // InternalMyDsl.g:2789:1: ruleAmazonWebServices returns [EObject current=null] : (otherlv_0= 'AmazonWebServices' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAmazonWebServices() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2795:2: ( (otherlv_0= 'AmazonWebServices' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:2796:2: (otherlv_0= 'AmazonWebServices' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:2796:2: (otherlv_0= 'AmazonWebServices' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:2797:3: otherlv_0= 'AmazonWebServices' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAmazonWebServicesAccess().getAmazonWebServicesKeyword_0());
            		
            // InternalMyDsl.g:2801:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2802:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2802:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2803:5: lv_name_1_0= RULE_ID
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
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0004000000000000L});

}