package org.xtext.photos.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.photos.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Domain:'", "'{'", "'}'", "'Architecture:'", "'Technology:'", "'Entities'", "'Functionalities'", "'Photo'", "'Album'", "'User_d'", "'ProfileManagement'", "'AppAccess'", "'AlbumManagement'", "'PhotoActions'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_elements_0_0= ruleDomain ) ) ( (lv_elements_1_0= ruleArchitecture ) ) ( (lv_elements_2_0= ruleTechnology ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;

        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_elements_0_0= ruleDomain ) ) ( (lv_elements_1_0= ruleArchitecture ) ) ( (lv_elements_2_0= ruleTechnology ) ) ) )
            // InternalMyDsl.g:78:2: ( ( (lv_elements_0_0= ruleDomain ) ) ( (lv_elements_1_0= ruleArchitecture ) ) ( (lv_elements_2_0= ruleTechnology ) ) )
            {
            // InternalMyDsl.g:78:2: ( ( (lv_elements_0_0= ruleDomain ) ) ( (lv_elements_1_0= ruleArchitecture ) ) ( (lv_elements_2_0= ruleTechnology ) ) )
            // InternalMyDsl.g:79:3: ( (lv_elements_0_0= ruleDomain ) ) ( (lv_elements_1_0= ruleArchitecture ) ) ( (lv_elements_2_0= ruleTechnology ) )
            {
            // InternalMyDsl.g:79:3: ( (lv_elements_0_0= ruleDomain ) )
            // InternalMyDsl.g:80:4: (lv_elements_0_0= ruleDomain )
            {
            // InternalMyDsl.g:80:4: (lv_elements_0_0= ruleDomain )
            // InternalMyDsl.g:81:5: lv_elements_0_0= ruleDomain
            {

            					newCompositeNode(grammarAccess.getModelAccess().getElementsDomainParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_elements_0_0=ruleDomain();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_0_0,
            						"org.xtext.photos.mydsl.MyDsl.Domain");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:98:3: ( (lv_elements_1_0= ruleArchitecture ) )
            // InternalMyDsl.g:99:4: (lv_elements_1_0= ruleArchitecture )
            {
            // InternalMyDsl.g:99:4: (lv_elements_1_0= ruleArchitecture )
            // InternalMyDsl.g:100:5: lv_elements_1_0= ruleArchitecture
            {

            					newCompositeNode(grammarAccess.getModelAccess().getElementsArchitectureParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_elements_1_0=ruleArchitecture();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"org.xtext.photos.mydsl.MyDsl.Architecture");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:117:3: ( (lv_elements_2_0= ruleTechnology ) )
            // InternalMyDsl.g:118:4: (lv_elements_2_0= ruleTechnology )
            {
            // InternalMyDsl.g:118:4: (lv_elements_2_0= ruleTechnology )
            // InternalMyDsl.g:119:5: lv_elements_2_0= ruleTechnology
            {

            					newCompositeNode(grammarAccess.getModelAccess().getElementsTechnologyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_2_0=ruleTechnology();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_2_0,
            						"org.xtext.photos.mydsl.MyDsl.Technology");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDomain"
    // InternalMyDsl.g:140:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalMyDsl.g:140:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalMyDsl.g:141:2: iv_ruleDomain= ruleDomain EOF
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
    // InternalMyDsl.g:147:1: ruleDomain returns [EObject current=null] : (otherlv_0= 'Domain:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEntity ) ) ( (lv_elements_4_0= ruleFunctionality ) ) otherlv_5= '}' ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:153:2: ( (otherlv_0= 'Domain:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEntity ) ) ( (lv_elements_4_0= ruleFunctionality ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:154:2: (otherlv_0= 'Domain:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEntity ) ) ( (lv_elements_4_0= ruleFunctionality ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:154:2: (otherlv_0= 'Domain:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEntity ) ) ( (lv_elements_4_0= ruleFunctionality ) ) otherlv_5= '}' )
            // InternalMyDsl.g:155:3: otherlv_0= 'Domain:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEntity ) ) ( (lv_elements_4_0= ruleFunctionality ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainAccess().getDomainKeyword_0());
            		
            // InternalMyDsl.g:159:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:160:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:160:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:161:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:181:3: ( (lv_elements_3_0= ruleEntity ) )
            // InternalMyDsl.g:182:4: (lv_elements_3_0= ruleEntity )
            {
            // InternalMyDsl.g:182:4: (lv_elements_3_0= ruleEntity )
            // InternalMyDsl.g:183:5: lv_elements_3_0= ruleEntity
            {

            					newCompositeNode(grammarAccess.getDomainAccess().getElementsEntityParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_elements_3_0=ruleEntity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_3_0,
            						"org.xtext.photos.mydsl.MyDsl.Entity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:200:3: ( (lv_elements_4_0= ruleFunctionality ) )
            // InternalMyDsl.g:201:4: (lv_elements_4_0= ruleFunctionality )
            {
            // InternalMyDsl.g:201:4: (lv_elements_4_0= ruleFunctionality )
            // InternalMyDsl.g:202:5: lv_elements_4_0= ruleFunctionality
            {

            					newCompositeNode(grammarAccess.getDomainAccess().getElementsFunctionalityParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_elements_4_0=ruleFunctionality();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_4_0,
            						"org.xtext.photos.mydsl.MyDsl.Functionality");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleArchitecture"
    // InternalMyDsl.g:227:1: entryRuleArchitecture returns [EObject current=null] : iv_ruleArchitecture= ruleArchitecture EOF ;
    public final EObject entryRuleArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitecture = null;


        try {
            // InternalMyDsl.g:227:53: (iv_ruleArchitecture= ruleArchitecture EOF )
            // InternalMyDsl.g:228:2: iv_ruleArchitecture= ruleArchitecture EOF
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
    // InternalMyDsl.g:234:1: ruleArchitecture returns [EObject current=null] : (otherlv_0= 'Architecture:' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}' ) ;
    public final EObject ruleArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:240:2: ( (otherlv_0= 'Architecture:' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}' ) )
            // InternalMyDsl.g:241:2: (otherlv_0= 'Architecture:' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}' )
            {
            // InternalMyDsl.g:241:2: (otherlv_0= 'Architecture:' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}' )
            // InternalMyDsl.g:242:3: otherlv_0= 'Architecture:' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getArchitectureAccess().getArchitectureKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:250:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:251:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:251:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:252:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

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
    // InternalMyDsl.g:276:1: entryRuleTechnology returns [EObject current=null] : iv_ruleTechnology= ruleTechnology EOF ;
    public final EObject entryRuleTechnology() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTechnology = null;


        try {
            // InternalMyDsl.g:276:51: (iv_ruleTechnology= ruleTechnology EOF )
            // InternalMyDsl.g:277:2: iv_ruleTechnology= ruleTechnology EOF
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
    // InternalMyDsl.g:283:1: ruleTechnology returns [EObject current=null] : (otherlv_0= 'Technology:' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}' ) ;
    public final EObject ruleTechnology() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:289:2: ( (otherlv_0= 'Technology:' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}' ) )
            // InternalMyDsl.g:290:2: (otherlv_0= 'Technology:' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}' )
            {
            // InternalMyDsl.g:290:2: (otherlv_0= 'Technology:' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}' )
            // InternalMyDsl.g:291:3: otherlv_0= 'Technology:' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTechnologyAccess().getTechnologyKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:299:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:300:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:300:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:301:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTechnologyAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTechnologyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_3());
            		

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


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:325:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalMyDsl.g:325:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalMyDsl.g:326:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalMyDsl.g:332:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entities' ( (lv_elements_1_0= ruleEntities ) ) ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:338:2: ( (otherlv_0= 'Entities' ( (lv_elements_1_0= ruleEntities ) ) ) )
            // InternalMyDsl.g:339:2: (otherlv_0= 'Entities' ( (lv_elements_1_0= ruleEntities ) ) )
            {
            // InternalMyDsl.g:339:2: (otherlv_0= 'Entities' ( (lv_elements_1_0= ruleEntities ) ) )
            // InternalMyDsl.g:340:3: otherlv_0= 'Entities' ( (lv_elements_1_0= ruleEntities ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntitiesKeyword_0());
            		
            // InternalMyDsl.g:344:3: ( (lv_elements_1_0= ruleEntities ) )
            // InternalMyDsl.g:345:4: (lv_elements_1_0= ruleEntities )
            {
            // InternalMyDsl.g:345:4: (lv_elements_1_0= ruleEntities )
            // InternalMyDsl.g:346:5: lv_elements_1_0= ruleEntities
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getElementsEntitiesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_1_0=ruleEntities();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"org.xtext.photos.mydsl.MyDsl.Entities");
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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFunctionality"
    // InternalMyDsl.g:367:1: entryRuleFunctionality returns [EObject current=null] : iv_ruleFunctionality= ruleFunctionality EOF ;
    public final EObject entryRuleFunctionality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionality = null;


        try {
            // InternalMyDsl.g:367:54: (iv_ruleFunctionality= ruleFunctionality EOF )
            // InternalMyDsl.g:368:2: iv_ruleFunctionality= ruleFunctionality EOF
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
    // InternalMyDsl.g:374:1: ruleFunctionality returns [EObject current=null] : (otherlv_0= 'Functionalities' ( (lv_elements_1_0= ruleFunctionalities ) ) ) ;
    public final EObject ruleFunctionality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:380:2: ( (otherlv_0= 'Functionalities' ( (lv_elements_1_0= ruleFunctionalities ) ) ) )
            // InternalMyDsl.g:381:2: (otherlv_0= 'Functionalities' ( (lv_elements_1_0= ruleFunctionalities ) ) )
            {
            // InternalMyDsl.g:381:2: (otherlv_0= 'Functionalities' ( (lv_elements_1_0= ruleFunctionalities ) ) )
            // InternalMyDsl.g:382:3: otherlv_0= 'Functionalities' ( (lv_elements_1_0= ruleFunctionalities ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionalityAccess().getFunctionalitiesKeyword_0());
            		
            // InternalMyDsl.g:386:3: ( (lv_elements_1_0= ruleFunctionalities ) )
            // InternalMyDsl.g:387:4: (lv_elements_1_0= ruleFunctionalities )
            {
            // InternalMyDsl.g:387:4: (lv_elements_1_0= ruleFunctionalities )
            // InternalMyDsl.g:388:5: lv_elements_1_0= ruleFunctionalities
            {

            					newCompositeNode(grammarAccess.getFunctionalityAccess().getElementsFunctionalitiesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_1_0=ruleFunctionalities();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionalityRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"org.xtext.photos.mydsl.MyDsl.Functionalities");
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
    // $ANTLR end "ruleFunctionality"


    // $ANTLR start "entryRuleEntities"
    // InternalMyDsl.g:409:1: entryRuleEntities returns [EObject current=null] : iv_ruleEntities= ruleEntities EOF ;
    public final EObject entryRuleEntities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntities = null;


        try {
            // InternalMyDsl.g:409:49: (iv_ruleEntities= ruleEntities EOF )
            // InternalMyDsl.g:410:2: iv_ruleEntities= ruleEntities EOF
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
    // InternalMyDsl.g:416:1: ruleEntities returns [EObject current=null] : ( ( (lv_elements_0_0= rulePhoto ) ) ( (lv_elements_1_0= ruleAlbum ) ) ( (lv_elements_2_0= ruleUser_d ) ) ) ;
    public final EObject ruleEntities() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;

        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:422:2: ( ( ( (lv_elements_0_0= rulePhoto ) ) ( (lv_elements_1_0= ruleAlbum ) ) ( (lv_elements_2_0= ruleUser_d ) ) ) )
            // InternalMyDsl.g:423:2: ( ( (lv_elements_0_0= rulePhoto ) ) ( (lv_elements_1_0= ruleAlbum ) ) ( (lv_elements_2_0= ruleUser_d ) ) )
            {
            // InternalMyDsl.g:423:2: ( ( (lv_elements_0_0= rulePhoto ) ) ( (lv_elements_1_0= ruleAlbum ) ) ( (lv_elements_2_0= ruleUser_d ) ) )
            // InternalMyDsl.g:424:3: ( (lv_elements_0_0= rulePhoto ) ) ( (lv_elements_1_0= ruleAlbum ) ) ( (lv_elements_2_0= ruleUser_d ) )
            {
            // InternalMyDsl.g:424:3: ( (lv_elements_0_0= rulePhoto ) )
            // InternalMyDsl.g:425:4: (lv_elements_0_0= rulePhoto )
            {
            // InternalMyDsl.g:425:4: (lv_elements_0_0= rulePhoto )
            // InternalMyDsl.g:426:5: lv_elements_0_0= rulePhoto
            {

            					newCompositeNode(grammarAccess.getEntitiesAccess().getElementsPhotoParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_elements_0_0=rulePhoto();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntitiesRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_0_0,
            						"org.xtext.photos.mydsl.MyDsl.Photo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:443:3: ( (lv_elements_1_0= ruleAlbum ) )
            // InternalMyDsl.g:444:4: (lv_elements_1_0= ruleAlbum )
            {
            // InternalMyDsl.g:444:4: (lv_elements_1_0= ruleAlbum )
            // InternalMyDsl.g:445:5: lv_elements_1_0= ruleAlbum
            {

            					newCompositeNode(grammarAccess.getEntitiesAccess().getElementsAlbumParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_elements_1_0=ruleAlbum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntitiesRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"org.xtext.photos.mydsl.MyDsl.Album");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:462:3: ( (lv_elements_2_0= ruleUser_d ) )
            // InternalMyDsl.g:463:4: (lv_elements_2_0= ruleUser_d )
            {
            // InternalMyDsl.g:463:4: (lv_elements_2_0= ruleUser_d )
            // InternalMyDsl.g:464:5: lv_elements_2_0= ruleUser_d
            {

            					newCompositeNode(grammarAccess.getEntitiesAccess().getElementsUser_dParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_2_0=ruleUser_d();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntitiesRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_2_0,
            						"org.xtext.photos.mydsl.MyDsl.User_d");
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
    // InternalMyDsl.g:485:1: entryRulePhoto returns [EObject current=null] : iv_rulePhoto= rulePhoto EOF ;
    public final EObject entryRulePhoto() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhoto = null;


        try {
            // InternalMyDsl.g:485:46: (iv_rulePhoto= rulePhoto EOF )
            // InternalMyDsl.g:486:2: iv_rulePhoto= rulePhoto EOF
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
    // InternalMyDsl.g:492:1: rulePhoto returns [EObject current=null] : (otherlv_0= 'Photo' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePhoto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:498:2: ( (otherlv_0= 'Photo' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:499:2: (otherlv_0= 'Photo' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:499:2: (otherlv_0= 'Photo' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:500:3: otherlv_0= 'Photo' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPhotoAccess().getPhotoKeyword_0());
            		
            // InternalMyDsl.g:504:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:505:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:505:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:506:5: lv_name_1_0= RULE_ID
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
    // InternalMyDsl.g:526:1: entryRuleAlbum returns [EObject current=null] : iv_ruleAlbum= ruleAlbum EOF ;
    public final EObject entryRuleAlbum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlbum = null;


        try {
            // InternalMyDsl.g:526:46: (iv_ruleAlbum= ruleAlbum EOF )
            // InternalMyDsl.g:527:2: iv_ruleAlbum= ruleAlbum EOF
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
    // InternalMyDsl.g:533:1: ruleAlbum returns [EObject current=null] : (otherlv_0= 'Album' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAlbum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:539:2: ( (otherlv_0= 'Album' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:540:2: (otherlv_0= 'Album' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:540:2: (otherlv_0= 'Album' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:541:3: otherlv_0= 'Album' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAlbumAccess().getAlbumKeyword_0());
            		
            // InternalMyDsl.g:545:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:546:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:546:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:547:5: lv_name_1_0= RULE_ID
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


    // $ANTLR start "entryRuleUser_d"
    // InternalMyDsl.g:567:1: entryRuleUser_d returns [EObject current=null] : iv_ruleUser_d= ruleUser_d EOF ;
    public final EObject entryRuleUser_d() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser_d = null;


        try {
            // InternalMyDsl.g:567:47: (iv_ruleUser_d= ruleUser_d EOF )
            // InternalMyDsl.g:568:2: iv_ruleUser_d= ruleUser_d EOF
            {
             newCompositeNode(grammarAccess.getUser_dRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUser_d=ruleUser_d();

            state._fsp--;

             current =iv_ruleUser_d; 
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
    // $ANTLR end "entryRuleUser_d"


    // $ANTLR start "ruleUser_d"
    // InternalMyDsl.g:574:1: ruleUser_d returns [EObject current=null] : (otherlv_0= 'User_d' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleUser_d() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:580:2: ( (otherlv_0= 'User_d' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:581:2: (otherlv_0= 'User_d' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:581:2: (otherlv_0= 'User_d' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:582:3: otherlv_0= 'User_d' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getUser_dAccess().getUser_dKeyword_0());
            		
            // InternalMyDsl.g:586:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:587:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:587:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:588:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUser_dAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUser_dRule());
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
    // $ANTLR end "ruleUser_d"


    // $ANTLR start "entryRuleFunctionalities"
    // InternalMyDsl.g:608:1: entryRuleFunctionalities returns [EObject current=null] : iv_ruleFunctionalities= ruleFunctionalities EOF ;
    public final EObject entryRuleFunctionalities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionalities = null;


        try {
            // InternalMyDsl.g:608:56: (iv_ruleFunctionalities= ruleFunctionalities EOF )
            // InternalMyDsl.g:609:2: iv_ruleFunctionalities= ruleFunctionalities EOF
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
    // InternalMyDsl.g:615:1: ruleFunctionalities returns [EObject current=null] : ( ( (lv_elements_0_0= ruleProfileManagement ) ) ( (lv_elements_1_0= ruleAppAccess ) ) ( (lv_elements_2_0= ruleAlbumManagement ) ) ( (lv_elements_3_0= rulePhotoActions ) ) ) ;
    public final EObject ruleFunctionalities() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_elements_0_0 = null;

        AntlrDatatypeRuleToken lv_elements_1_0 = null;

        AntlrDatatypeRuleToken lv_elements_2_0 = null;

        AntlrDatatypeRuleToken lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:621:2: ( ( ( (lv_elements_0_0= ruleProfileManagement ) ) ( (lv_elements_1_0= ruleAppAccess ) ) ( (lv_elements_2_0= ruleAlbumManagement ) ) ( (lv_elements_3_0= rulePhotoActions ) ) ) )
            // InternalMyDsl.g:622:2: ( ( (lv_elements_0_0= ruleProfileManagement ) ) ( (lv_elements_1_0= ruleAppAccess ) ) ( (lv_elements_2_0= ruleAlbumManagement ) ) ( (lv_elements_3_0= rulePhotoActions ) ) )
            {
            // InternalMyDsl.g:622:2: ( ( (lv_elements_0_0= ruleProfileManagement ) ) ( (lv_elements_1_0= ruleAppAccess ) ) ( (lv_elements_2_0= ruleAlbumManagement ) ) ( (lv_elements_3_0= rulePhotoActions ) ) )
            // InternalMyDsl.g:623:3: ( (lv_elements_0_0= ruleProfileManagement ) ) ( (lv_elements_1_0= ruleAppAccess ) ) ( (lv_elements_2_0= ruleAlbumManagement ) ) ( (lv_elements_3_0= rulePhotoActions ) )
            {
            // InternalMyDsl.g:623:3: ( (lv_elements_0_0= ruleProfileManagement ) )
            // InternalMyDsl.g:624:4: (lv_elements_0_0= ruleProfileManagement )
            {
            // InternalMyDsl.g:624:4: (lv_elements_0_0= ruleProfileManagement )
            // InternalMyDsl.g:625:5: lv_elements_0_0= ruleProfileManagement
            {

            					newCompositeNode(grammarAccess.getFunctionalitiesAccess().getElementsProfileManagementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_elements_0_0=ruleProfileManagement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionalitiesRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_0_0,
            						"org.xtext.photos.mydsl.MyDsl.ProfileManagement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:642:3: ( (lv_elements_1_0= ruleAppAccess ) )
            // InternalMyDsl.g:643:4: (lv_elements_1_0= ruleAppAccess )
            {
            // InternalMyDsl.g:643:4: (lv_elements_1_0= ruleAppAccess )
            // InternalMyDsl.g:644:5: lv_elements_1_0= ruleAppAccess
            {

            					newCompositeNode(grammarAccess.getFunctionalitiesAccess().getElementsAppAccessParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_elements_1_0=ruleAppAccess();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionalitiesRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"org.xtext.photos.mydsl.MyDsl.AppAccess");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:661:3: ( (lv_elements_2_0= ruleAlbumManagement ) )
            // InternalMyDsl.g:662:4: (lv_elements_2_0= ruleAlbumManagement )
            {
            // InternalMyDsl.g:662:4: (lv_elements_2_0= ruleAlbumManagement )
            // InternalMyDsl.g:663:5: lv_elements_2_0= ruleAlbumManagement
            {

            					newCompositeNode(grammarAccess.getFunctionalitiesAccess().getElementsAlbumManagementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_elements_2_0=ruleAlbumManagement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionalitiesRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_2_0,
            						"org.xtext.photos.mydsl.MyDsl.AlbumManagement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:680:3: ( (lv_elements_3_0= rulePhotoActions ) )
            // InternalMyDsl.g:681:4: (lv_elements_3_0= rulePhotoActions )
            {
            // InternalMyDsl.g:681:4: (lv_elements_3_0= rulePhotoActions )
            // InternalMyDsl.g:682:5: lv_elements_3_0= rulePhotoActions
            {

            					newCompositeNode(grammarAccess.getFunctionalitiesAccess().getElementsPhotoActionsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_elements_3_0=rulePhotoActions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionalitiesRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_3_0,
            						"org.xtext.photos.mydsl.MyDsl.PhotoActions");
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
    // InternalMyDsl.g:703:1: entryRuleProfileManagement returns [String current=null] : iv_ruleProfileManagement= ruleProfileManagement EOF ;
    public final String entryRuleProfileManagement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProfileManagement = null;


        try {
            // InternalMyDsl.g:703:57: (iv_ruleProfileManagement= ruleProfileManagement EOF )
            // InternalMyDsl.g:704:2: iv_ruleProfileManagement= ruleProfileManagement EOF
            {
             newCompositeNode(grammarAccess.getProfileManagementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProfileManagement=ruleProfileManagement();

            state._fsp--;

             current =iv_ruleProfileManagement.getText(); 
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
    // InternalMyDsl.g:710:1: ruleProfileManagement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ProfileManagement' ;
    public final AntlrDatatypeRuleToken ruleProfileManagement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:716:2: (kw= 'ProfileManagement' )
            // InternalMyDsl.g:717:2: kw= 'ProfileManagement'
            {
            kw=(Token)match(input,21,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getProfileManagementAccess().getProfileManagementKeyword());
            	

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


    // $ANTLR start "entryRuleAppAccess"
    // InternalMyDsl.g:725:1: entryRuleAppAccess returns [String current=null] : iv_ruleAppAccess= ruleAppAccess EOF ;
    public final String entryRuleAppAccess() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAppAccess = null;


        try {
            // InternalMyDsl.g:725:49: (iv_ruleAppAccess= ruleAppAccess EOF )
            // InternalMyDsl.g:726:2: iv_ruleAppAccess= ruleAppAccess EOF
            {
             newCompositeNode(grammarAccess.getAppAccessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppAccess=ruleAppAccess();

            state._fsp--;

             current =iv_ruleAppAccess.getText(); 
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
    // InternalMyDsl.g:732:1: ruleAppAccess returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'AppAccess' ;
    public final AntlrDatatypeRuleToken ruleAppAccess() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:738:2: (kw= 'AppAccess' )
            // InternalMyDsl.g:739:2: kw= 'AppAccess'
            {
            kw=(Token)match(input,22,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getAppAccessAccess().getAppAccessKeyword());
            	

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


    // $ANTLR start "entryRuleAlbumManagement"
    // InternalMyDsl.g:747:1: entryRuleAlbumManagement returns [String current=null] : iv_ruleAlbumManagement= ruleAlbumManagement EOF ;
    public final String entryRuleAlbumManagement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAlbumManagement = null;


        try {
            // InternalMyDsl.g:747:55: (iv_ruleAlbumManagement= ruleAlbumManagement EOF )
            // InternalMyDsl.g:748:2: iv_ruleAlbumManagement= ruleAlbumManagement EOF
            {
             newCompositeNode(grammarAccess.getAlbumManagementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlbumManagement=ruleAlbumManagement();

            state._fsp--;

             current =iv_ruleAlbumManagement.getText(); 
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
    // InternalMyDsl.g:754:1: ruleAlbumManagement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'AlbumManagement' ;
    public final AntlrDatatypeRuleToken ruleAlbumManagement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:760:2: (kw= 'AlbumManagement' )
            // InternalMyDsl.g:761:2: kw= 'AlbumManagement'
            {
            kw=(Token)match(input,23,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getAlbumManagementAccess().getAlbumManagementKeyword());
            	

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


    // $ANTLR start "entryRulePhotoActions"
    // InternalMyDsl.g:769:1: entryRulePhotoActions returns [String current=null] : iv_rulePhotoActions= rulePhotoActions EOF ;
    public final String entryRulePhotoActions() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePhotoActions = null;


        try {
            // InternalMyDsl.g:769:52: (iv_rulePhotoActions= rulePhotoActions EOF )
            // InternalMyDsl.g:770:2: iv_rulePhotoActions= rulePhotoActions EOF
            {
             newCompositeNode(grammarAccess.getPhotoActionsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhotoActions=rulePhotoActions();

            state._fsp--;

             current =iv_rulePhotoActions.getText(); 
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
    // InternalMyDsl.g:776:1: rulePhotoActions returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'PhotoActions' ;
    public final AntlrDatatypeRuleToken rulePhotoActions() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:782:2: (kw= 'PhotoActions' )
            // InternalMyDsl.g:783:2: kw= 'PhotoActions'
            {
            kw=(Token)match(input,24,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getPhotoActionsAccess().getPhotoActionsKeyword());
            	

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});

}