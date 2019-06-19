package org.xtext.photos.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.photos.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ProfileManagement'", "'AppAccess'", "'AlbumManagement'", "'PhotoActions'", "'Domain:'", "'{'", "'}'", "'Architecture:'", "'Technology:'", "'Entities'", "'Functionalities'", "'Photo'", "'Album'", "'User_d'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalMyDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDomain"
    // InternalMyDsl.g:78:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleDomain EOF )
            // InternalMyDsl.g:80:1: ruleDomain EOF
            {
             before(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_1);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getDomainRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalMyDsl.g:87:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Domain__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Domain__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Domain__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Domain__Group__0 )
            // InternalMyDsl.g:94:4: rule__Domain__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleArchitecture"
    // InternalMyDsl.g:103:1: entryRuleArchitecture : ruleArchitecture EOF ;
    public final void entryRuleArchitecture() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleArchitecture EOF )
            // InternalMyDsl.g:105:1: ruleArchitecture EOF
            {
             before(grammarAccess.getArchitectureRule()); 
            pushFollow(FOLLOW_1);
            ruleArchitecture();

            state._fsp--;

             after(grammarAccess.getArchitectureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArchitecture"


    // $ANTLR start "ruleArchitecture"
    // InternalMyDsl.g:112:1: ruleArchitecture : ( ( rule__Architecture__Group__0 ) ) ;
    public final void ruleArchitecture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Architecture__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Architecture__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Architecture__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Architecture__Group__0 )
            {
             before(grammarAccess.getArchitectureAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Architecture__Group__0 )
            // InternalMyDsl.g:119:4: rule__Architecture__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Architecture__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArchitecture"


    // $ANTLR start "entryRuleTechnology"
    // InternalMyDsl.g:128:1: entryRuleTechnology : ruleTechnology EOF ;
    public final void entryRuleTechnology() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleTechnology EOF )
            // InternalMyDsl.g:130:1: ruleTechnology EOF
            {
             before(grammarAccess.getTechnologyRule()); 
            pushFollow(FOLLOW_1);
            ruleTechnology();

            state._fsp--;

             after(grammarAccess.getTechnologyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTechnology"


    // $ANTLR start "ruleTechnology"
    // InternalMyDsl.g:137:1: ruleTechnology : ( ( rule__Technology__Group__0 ) ) ;
    public final void ruleTechnology() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Technology__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Technology__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Technology__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Technology__Group__0 )
            {
             before(grammarAccess.getTechnologyAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Technology__Group__0 )
            // InternalMyDsl.g:144:4: rule__Technology__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Technology__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTechnologyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTechnology"


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:153:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleEntity EOF )
            // InternalMyDsl.g:155:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyDsl.g:162:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Entity__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Entity__Group__0 )
            // InternalMyDsl.g:169:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFunctionality"
    // InternalMyDsl.g:178:1: entryRuleFunctionality : ruleFunctionality EOF ;
    public final void entryRuleFunctionality() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleFunctionality EOF )
            // InternalMyDsl.g:180:1: ruleFunctionality EOF
            {
             before(grammarAccess.getFunctionalityRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionality();

            state._fsp--;

             after(grammarAccess.getFunctionalityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionality"


    // $ANTLR start "ruleFunctionality"
    // InternalMyDsl.g:187:1: ruleFunctionality : ( ( rule__Functionality__Group__0 ) ) ;
    public final void ruleFunctionality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Functionality__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Functionality__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Functionality__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Functionality__Group__0 )
            {
             before(grammarAccess.getFunctionalityAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Functionality__Group__0 )
            // InternalMyDsl.g:194:4: rule__Functionality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Functionality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionality"


    // $ANTLR start "entryRuleEntities"
    // InternalMyDsl.g:203:1: entryRuleEntities : ruleEntities EOF ;
    public final void entryRuleEntities() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleEntities EOF )
            // InternalMyDsl.g:205:1: ruleEntities EOF
            {
             before(grammarAccess.getEntitiesRule()); 
            pushFollow(FOLLOW_1);
            ruleEntities();

            state._fsp--;

             after(grammarAccess.getEntitiesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntities"


    // $ANTLR start "ruleEntities"
    // InternalMyDsl.g:212:1: ruleEntities : ( ( rule__Entities__Group__0 ) ) ;
    public final void ruleEntities() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Entities__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Entities__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Entities__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Entities__Group__0 )
            {
             before(grammarAccess.getEntitiesAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Entities__Group__0 )
            // InternalMyDsl.g:219:4: rule__Entities__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entities__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntitiesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntities"


    // $ANTLR start "entryRulePhoto"
    // InternalMyDsl.g:228:1: entryRulePhoto : rulePhoto EOF ;
    public final void entryRulePhoto() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( rulePhoto EOF )
            // InternalMyDsl.g:230:1: rulePhoto EOF
            {
             before(grammarAccess.getPhotoRule()); 
            pushFollow(FOLLOW_1);
            rulePhoto();

            state._fsp--;

             after(grammarAccess.getPhotoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePhoto"


    // $ANTLR start "rulePhoto"
    // InternalMyDsl.g:237:1: rulePhoto : ( ( rule__Photo__Group__0 ) ) ;
    public final void rulePhoto() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Photo__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Photo__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Photo__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Photo__Group__0 )
            {
             before(grammarAccess.getPhotoAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Photo__Group__0 )
            // InternalMyDsl.g:244:4: rule__Photo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Photo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPhotoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePhoto"


    // $ANTLR start "entryRuleAlbum"
    // InternalMyDsl.g:253:1: entryRuleAlbum : ruleAlbum EOF ;
    public final void entryRuleAlbum() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleAlbum EOF )
            // InternalMyDsl.g:255:1: ruleAlbum EOF
            {
             before(grammarAccess.getAlbumRule()); 
            pushFollow(FOLLOW_1);
            ruleAlbum();

            state._fsp--;

             after(grammarAccess.getAlbumRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlbum"


    // $ANTLR start "ruleAlbum"
    // InternalMyDsl.g:262:1: ruleAlbum : ( ( rule__Album__Group__0 ) ) ;
    public final void ruleAlbum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Album__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Album__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Album__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Album__Group__0 )
            {
             before(grammarAccess.getAlbumAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Album__Group__0 )
            // InternalMyDsl.g:269:4: rule__Album__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Album__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlbumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlbum"


    // $ANTLR start "entryRuleUser_d"
    // InternalMyDsl.g:278:1: entryRuleUser_d : ruleUser_d EOF ;
    public final void entryRuleUser_d() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleUser_d EOF )
            // InternalMyDsl.g:280:1: ruleUser_d EOF
            {
             before(grammarAccess.getUser_dRule()); 
            pushFollow(FOLLOW_1);
            ruleUser_d();

            state._fsp--;

             after(grammarAccess.getUser_dRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUser_d"


    // $ANTLR start "ruleUser_d"
    // InternalMyDsl.g:287:1: ruleUser_d : ( ( rule__User_d__Group__0 ) ) ;
    public final void ruleUser_d() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__User_d__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__User_d__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__User_d__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__User_d__Group__0 )
            {
             before(grammarAccess.getUser_dAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__User_d__Group__0 )
            // InternalMyDsl.g:294:4: rule__User_d__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__User_d__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUser_dAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUser_d"


    // $ANTLR start "entryRuleFunctionalities"
    // InternalMyDsl.g:303:1: entryRuleFunctionalities : ruleFunctionalities EOF ;
    public final void entryRuleFunctionalities() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleFunctionalities EOF )
            // InternalMyDsl.g:305:1: ruleFunctionalities EOF
            {
             before(grammarAccess.getFunctionalitiesRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionalities();

            state._fsp--;

             after(grammarAccess.getFunctionalitiesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionalities"


    // $ANTLR start "ruleFunctionalities"
    // InternalMyDsl.g:312:1: ruleFunctionalities : ( ( rule__Functionalities__Group__0 ) ) ;
    public final void ruleFunctionalities() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Functionalities__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Functionalities__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Functionalities__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Functionalities__Group__0 )
            {
             before(grammarAccess.getFunctionalitiesAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Functionalities__Group__0 )
            // InternalMyDsl.g:319:4: rule__Functionalities__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Functionalities__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalitiesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionalities"


    // $ANTLR start "entryRuleProfileManagement"
    // InternalMyDsl.g:328:1: entryRuleProfileManagement : ruleProfileManagement EOF ;
    public final void entryRuleProfileManagement() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleProfileManagement EOF )
            // InternalMyDsl.g:330:1: ruleProfileManagement EOF
            {
             before(grammarAccess.getProfileManagementRule()); 
            pushFollow(FOLLOW_1);
            ruleProfileManagement();

            state._fsp--;

             after(grammarAccess.getProfileManagementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProfileManagement"


    // $ANTLR start "ruleProfileManagement"
    // InternalMyDsl.g:337:1: ruleProfileManagement : ( 'ProfileManagement' ) ;
    public final void ruleProfileManagement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( 'ProfileManagement' ) )
            // InternalMyDsl.g:342:2: ( 'ProfileManagement' )
            {
            // InternalMyDsl.g:342:2: ( 'ProfileManagement' )
            // InternalMyDsl.g:343:3: 'ProfileManagement'
            {
             before(grammarAccess.getProfileManagementAccess().getProfileManagementKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getProfileManagementAccess().getProfileManagementKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProfileManagement"


    // $ANTLR start "entryRuleAppAccess"
    // InternalMyDsl.g:353:1: entryRuleAppAccess : ruleAppAccess EOF ;
    public final void entryRuleAppAccess() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleAppAccess EOF )
            // InternalMyDsl.g:355:1: ruleAppAccess EOF
            {
             before(grammarAccess.getAppAccessRule()); 
            pushFollow(FOLLOW_1);
            ruleAppAccess();

            state._fsp--;

             after(grammarAccess.getAppAccessRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAppAccess"


    // $ANTLR start "ruleAppAccess"
    // InternalMyDsl.g:362:1: ruleAppAccess : ( 'AppAccess' ) ;
    public final void ruleAppAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( 'AppAccess' ) )
            // InternalMyDsl.g:367:2: ( 'AppAccess' )
            {
            // InternalMyDsl.g:367:2: ( 'AppAccess' )
            // InternalMyDsl.g:368:3: 'AppAccess'
            {
             before(grammarAccess.getAppAccessAccess().getAppAccessKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAppAccessAccess().getAppAccessKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAppAccess"


    // $ANTLR start "entryRuleAlbumManagement"
    // InternalMyDsl.g:378:1: entryRuleAlbumManagement : ruleAlbumManagement EOF ;
    public final void entryRuleAlbumManagement() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleAlbumManagement EOF )
            // InternalMyDsl.g:380:1: ruleAlbumManagement EOF
            {
             before(grammarAccess.getAlbumManagementRule()); 
            pushFollow(FOLLOW_1);
            ruleAlbumManagement();

            state._fsp--;

             after(grammarAccess.getAlbumManagementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlbumManagement"


    // $ANTLR start "ruleAlbumManagement"
    // InternalMyDsl.g:387:1: ruleAlbumManagement : ( 'AlbumManagement' ) ;
    public final void ruleAlbumManagement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( 'AlbumManagement' ) )
            // InternalMyDsl.g:392:2: ( 'AlbumManagement' )
            {
            // InternalMyDsl.g:392:2: ( 'AlbumManagement' )
            // InternalMyDsl.g:393:3: 'AlbumManagement'
            {
             before(grammarAccess.getAlbumManagementAccess().getAlbumManagementKeyword()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAlbumManagementAccess().getAlbumManagementKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlbumManagement"


    // $ANTLR start "entryRulePhotoActions"
    // InternalMyDsl.g:403:1: entryRulePhotoActions : rulePhotoActions EOF ;
    public final void entryRulePhotoActions() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( rulePhotoActions EOF )
            // InternalMyDsl.g:405:1: rulePhotoActions EOF
            {
             before(grammarAccess.getPhotoActionsRule()); 
            pushFollow(FOLLOW_1);
            rulePhotoActions();

            state._fsp--;

             after(grammarAccess.getPhotoActionsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePhotoActions"


    // $ANTLR start "rulePhotoActions"
    // InternalMyDsl.g:412:1: rulePhotoActions : ( 'PhotoActions' ) ;
    public final void rulePhotoActions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( 'PhotoActions' ) )
            // InternalMyDsl.g:417:2: ( 'PhotoActions' )
            {
            // InternalMyDsl.g:417:2: ( 'PhotoActions' )
            // InternalMyDsl.g:418:3: 'PhotoActions'
            {
             before(grammarAccess.getPhotoActionsAccess().getPhotoActionsKeyword()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPhotoActionsAccess().getPhotoActionsKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePhotoActions"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMyDsl.g:427:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:431:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyDsl.g:432:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMyDsl.g:439:1: rule__Model__Group__0__Impl : ( ( rule__Model__ElementsAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:443:1: ( ( ( rule__Model__ElementsAssignment_0 ) ) )
            // InternalMyDsl.g:444:1: ( ( rule__Model__ElementsAssignment_0 ) )
            {
            // InternalMyDsl.g:444:1: ( ( rule__Model__ElementsAssignment_0 ) )
            // InternalMyDsl.g:445:2: ( rule__Model__ElementsAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_0()); 
            // InternalMyDsl.g:446:2: ( rule__Model__ElementsAssignment_0 )
            // InternalMyDsl.g:446:3: rule__Model__ElementsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__ElementsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMyDsl.g:454:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:458:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalMyDsl.g:459:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMyDsl.g:466:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementsAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:470:1: ( ( ( rule__Model__ElementsAssignment_1 ) ) )
            // InternalMyDsl.g:471:1: ( ( rule__Model__ElementsAssignment_1 ) )
            {
            // InternalMyDsl.g:471:1: ( ( rule__Model__ElementsAssignment_1 ) )
            // InternalMyDsl.g:472:2: ( rule__Model__ElementsAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            // InternalMyDsl.g:473:2: ( rule__Model__ElementsAssignment_1 )
            // InternalMyDsl.g:473:3: rule__Model__ElementsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__ElementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalMyDsl.g:481:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:485:1: ( rule__Model__Group__2__Impl )
            // InternalMyDsl.g:486:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalMyDsl.g:492:1: rule__Model__Group__2__Impl : ( ( rule__Model__ElementsAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:496:1: ( ( ( rule__Model__ElementsAssignment_2 ) ) )
            // InternalMyDsl.g:497:1: ( ( rule__Model__ElementsAssignment_2 ) )
            {
            // InternalMyDsl.g:497:1: ( ( rule__Model__ElementsAssignment_2 ) )
            // InternalMyDsl.g:498:2: ( rule__Model__ElementsAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_2()); 
            // InternalMyDsl.g:499:2: ( rule__Model__ElementsAssignment_2 )
            // InternalMyDsl.g:499:3: rule__Model__ElementsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Domain__Group__0"
    // InternalMyDsl.g:508:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:512:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalMyDsl.g:513:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Domain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__0"


    // $ANTLR start "rule__Domain__Group__0__Impl"
    // InternalMyDsl.g:520:1: rule__Domain__Group__0__Impl : ( 'Domain:' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:524:1: ( ( 'Domain:' ) )
            // InternalMyDsl.g:525:1: ( 'Domain:' )
            {
            // InternalMyDsl.g:525:1: ( 'Domain:' )
            // InternalMyDsl.g:526:2: 'Domain:'
            {
             before(grammarAccess.getDomainAccess().getDomainKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getDomainKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__0__Impl"


    // $ANTLR start "rule__Domain__Group__1"
    // InternalMyDsl.g:535:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:539:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // InternalMyDsl.g:540:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Domain__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__1"


    // $ANTLR start "rule__Domain__Group__1__Impl"
    // InternalMyDsl.g:547:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__NameAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:551:1: ( ( ( rule__Domain__NameAssignment_1 ) ) )
            // InternalMyDsl.g:552:1: ( ( rule__Domain__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:552:1: ( ( rule__Domain__NameAssignment_1 ) )
            // InternalMyDsl.g:553:2: ( rule__Domain__NameAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:554:2: ( rule__Domain__NameAssignment_1 )
            // InternalMyDsl.g:554:3: rule__Domain__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Domain__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__1__Impl"


    // $ANTLR start "rule__Domain__Group__2"
    // InternalMyDsl.g:562:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // InternalMyDsl.g:567:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Domain__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__2"


    // $ANTLR start "rule__Domain__Group__2__Impl"
    // InternalMyDsl.g:574:1: rule__Domain__Group__2__Impl : ( '{' ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:578:1: ( ( '{' ) )
            // InternalMyDsl.g:579:1: ( '{' )
            {
            // InternalMyDsl.g:579:1: ( '{' )
            // InternalMyDsl.g:580:2: '{'
            {
             before(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__2__Impl"


    // $ANTLR start "rule__Domain__Group__3"
    // InternalMyDsl.g:589:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl rule__Domain__Group__4 ;
    public final void rule__Domain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:593:1: ( rule__Domain__Group__3__Impl rule__Domain__Group__4 )
            // InternalMyDsl.g:594:2: rule__Domain__Group__3__Impl rule__Domain__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Domain__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__3"


    // $ANTLR start "rule__Domain__Group__3__Impl"
    // InternalMyDsl.g:601:1: rule__Domain__Group__3__Impl : ( ( rule__Domain__ElementsAssignment_3 ) ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:605:1: ( ( ( rule__Domain__ElementsAssignment_3 ) ) )
            // InternalMyDsl.g:606:1: ( ( rule__Domain__ElementsAssignment_3 ) )
            {
            // InternalMyDsl.g:606:1: ( ( rule__Domain__ElementsAssignment_3 ) )
            // InternalMyDsl.g:607:2: ( rule__Domain__ElementsAssignment_3 )
            {
             before(grammarAccess.getDomainAccess().getElementsAssignment_3()); 
            // InternalMyDsl.g:608:2: ( rule__Domain__ElementsAssignment_3 )
            // InternalMyDsl.g:608:3: rule__Domain__ElementsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Domain__ElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__3__Impl"


    // $ANTLR start "rule__Domain__Group__4"
    // InternalMyDsl.g:616:1: rule__Domain__Group__4 : rule__Domain__Group__4__Impl rule__Domain__Group__5 ;
    public final void rule__Domain__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:620:1: ( rule__Domain__Group__4__Impl rule__Domain__Group__5 )
            // InternalMyDsl.g:621:2: rule__Domain__Group__4__Impl rule__Domain__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Domain__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__4"


    // $ANTLR start "rule__Domain__Group__4__Impl"
    // InternalMyDsl.g:628:1: rule__Domain__Group__4__Impl : ( ( rule__Domain__ElementsAssignment_4 ) ) ;
    public final void rule__Domain__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:632:1: ( ( ( rule__Domain__ElementsAssignment_4 ) ) )
            // InternalMyDsl.g:633:1: ( ( rule__Domain__ElementsAssignment_4 ) )
            {
            // InternalMyDsl.g:633:1: ( ( rule__Domain__ElementsAssignment_4 ) )
            // InternalMyDsl.g:634:2: ( rule__Domain__ElementsAssignment_4 )
            {
             before(grammarAccess.getDomainAccess().getElementsAssignment_4()); 
            // InternalMyDsl.g:635:2: ( rule__Domain__ElementsAssignment_4 )
            // InternalMyDsl.g:635:3: rule__Domain__ElementsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Domain__ElementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__4__Impl"


    // $ANTLR start "rule__Domain__Group__5"
    // InternalMyDsl.g:643:1: rule__Domain__Group__5 : rule__Domain__Group__5__Impl ;
    public final void rule__Domain__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:647:1: ( rule__Domain__Group__5__Impl )
            // InternalMyDsl.g:648:2: rule__Domain__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__5"


    // $ANTLR start "rule__Domain__Group__5__Impl"
    // InternalMyDsl.g:654:1: rule__Domain__Group__5__Impl : ( '}' ) ;
    public final void rule__Domain__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:658:1: ( ( '}' ) )
            // InternalMyDsl.g:659:1: ( '}' )
            {
            // InternalMyDsl.g:659:1: ( '}' )
            // InternalMyDsl.g:660:2: '}'
            {
             before(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__5__Impl"


    // $ANTLR start "rule__Architecture__Group__0"
    // InternalMyDsl.g:670:1: rule__Architecture__Group__0 : rule__Architecture__Group__0__Impl rule__Architecture__Group__1 ;
    public final void rule__Architecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:674:1: ( rule__Architecture__Group__0__Impl rule__Architecture__Group__1 )
            // InternalMyDsl.g:675:2: rule__Architecture__Group__0__Impl rule__Architecture__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Architecture__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__0"


    // $ANTLR start "rule__Architecture__Group__0__Impl"
    // InternalMyDsl.g:682:1: rule__Architecture__Group__0__Impl : ( 'Architecture:' ) ;
    public final void rule__Architecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:686:1: ( ( 'Architecture:' ) )
            // InternalMyDsl.g:687:1: ( 'Architecture:' )
            {
            // InternalMyDsl.g:687:1: ( 'Architecture:' )
            // InternalMyDsl.g:688:2: 'Architecture:'
            {
             before(grammarAccess.getArchitectureAccess().getArchitectureKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getArchitectureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__0__Impl"


    // $ANTLR start "rule__Architecture__Group__1"
    // InternalMyDsl.g:697:1: rule__Architecture__Group__1 : rule__Architecture__Group__1__Impl rule__Architecture__Group__2 ;
    public final void rule__Architecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:701:1: ( rule__Architecture__Group__1__Impl rule__Architecture__Group__2 )
            // InternalMyDsl.g:702:2: rule__Architecture__Group__1__Impl rule__Architecture__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Architecture__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__1"


    // $ANTLR start "rule__Architecture__Group__1__Impl"
    // InternalMyDsl.g:709:1: rule__Architecture__Group__1__Impl : ( '{' ) ;
    public final void rule__Architecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:713:1: ( ( '{' ) )
            // InternalMyDsl.g:714:1: ( '{' )
            {
            // InternalMyDsl.g:714:1: ( '{' )
            // InternalMyDsl.g:715:2: '{'
            {
             before(grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__1__Impl"


    // $ANTLR start "rule__Architecture__Group__2"
    // InternalMyDsl.g:724:1: rule__Architecture__Group__2 : rule__Architecture__Group__2__Impl rule__Architecture__Group__3 ;
    public final void rule__Architecture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:728:1: ( rule__Architecture__Group__2__Impl rule__Architecture__Group__3 )
            // InternalMyDsl.g:729:2: rule__Architecture__Group__2__Impl rule__Architecture__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Architecture__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__2"


    // $ANTLR start "rule__Architecture__Group__2__Impl"
    // InternalMyDsl.g:736:1: rule__Architecture__Group__2__Impl : ( ( rule__Architecture__NameAssignment_2 ) ) ;
    public final void rule__Architecture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:740:1: ( ( ( rule__Architecture__NameAssignment_2 ) ) )
            // InternalMyDsl.g:741:1: ( ( rule__Architecture__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:741:1: ( ( rule__Architecture__NameAssignment_2 ) )
            // InternalMyDsl.g:742:2: ( rule__Architecture__NameAssignment_2 )
            {
             before(grammarAccess.getArchitectureAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:743:2: ( rule__Architecture__NameAssignment_2 )
            // InternalMyDsl.g:743:3: rule__Architecture__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Architecture__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__2__Impl"


    // $ANTLR start "rule__Architecture__Group__3"
    // InternalMyDsl.g:751:1: rule__Architecture__Group__3 : rule__Architecture__Group__3__Impl ;
    public final void rule__Architecture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:755:1: ( rule__Architecture__Group__3__Impl )
            // InternalMyDsl.g:756:2: rule__Architecture__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Architecture__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__3"


    // $ANTLR start "rule__Architecture__Group__3__Impl"
    // InternalMyDsl.g:762:1: rule__Architecture__Group__3__Impl : ( '}' ) ;
    public final void rule__Architecture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:1: ( ( '}' ) )
            // InternalMyDsl.g:767:1: ( '}' )
            {
            // InternalMyDsl.g:767:1: ( '}' )
            // InternalMyDsl.g:768:2: '}'
            {
             before(grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__3__Impl"


    // $ANTLR start "rule__Technology__Group__0"
    // InternalMyDsl.g:778:1: rule__Technology__Group__0 : rule__Technology__Group__0__Impl rule__Technology__Group__1 ;
    public final void rule__Technology__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:782:1: ( rule__Technology__Group__0__Impl rule__Technology__Group__1 )
            // InternalMyDsl.g:783:2: rule__Technology__Group__0__Impl rule__Technology__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Technology__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technology__Group__0"


    // $ANTLR start "rule__Technology__Group__0__Impl"
    // InternalMyDsl.g:790:1: rule__Technology__Group__0__Impl : ( 'Technology:' ) ;
    public final void rule__Technology__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:794:1: ( ( 'Technology:' ) )
            // InternalMyDsl.g:795:1: ( 'Technology:' )
            {
            // InternalMyDsl.g:795:1: ( 'Technology:' )
            // InternalMyDsl.g:796:2: 'Technology:'
            {
             before(grammarAccess.getTechnologyAccess().getTechnologyKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getTechnologyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technology__Group__0__Impl"


    // $ANTLR start "rule__Technology__Group__1"
    // InternalMyDsl.g:805:1: rule__Technology__Group__1 : rule__Technology__Group__1__Impl rule__Technology__Group__2 ;
    public final void rule__Technology__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:809:1: ( rule__Technology__Group__1__Impl rule__Technology__Group__2 )
            // InternalMyDsl.g:810:2: rule__Technology__Group__1__Impl rule__Technology__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Technology__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technology__Group__1"


    // $ANTLR start "rule__Technology__Group__1__Impl"
    // InternalMyDsl.g:817:1: rule__Technology__Group__1__Impl : ( '{' ) ;
    public final void rule__Technology__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:821:1: ( ( '{' ) )
            // InternalMyDsl.g:822:1: ( '{' )
            {
            // InternalMyDsl.g:822:1: ( '{' )
            // InternalMyDsl.g:823:2: '{'
            {
             before(grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technology__Group__1__Impl"


    // $ANTLR start "rule__Technology__Group__2"
    // InternalMyDsl.g:832:1: rule__Technology__Group__2 : rule__Technology__Group__2__Impl rule__Technology__Group__3 ;
    public final void rule__Technology__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:836:1: ( rule__Technology__Group__2__Impl rule__Technology__Group__3 )
            // InternalMyDsl.g:837:2: rule__Technology__Group__2__Impl rule__Technology__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Technology__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technology__Group__2"


    // $ANTLR start "rule__Technology__Group__2__Impl"
    // InternalMyDsl.g:844:1: rule__Technology__Group__2__Impl : ( ( rule__Technology__NameAssignment_2 ) ) ;
    public final void rule__Technology__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:848:1: ( ( ( rule__Technology__NameAssignment_2 ) ) )
            // InternalMyDsl.g:849:1: ( ( rule__Technology__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:849:1: ( ( rule__Technology__NameAssignment_2 ) )
            // InternalMyDsl.g:850:2: ( rule__Technology__NameAssignment_2 )
            {
             before(grammarAccess.getTechnologyAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:851:2: ( rule__Technology__NameAssignment_2 )
            // InternalMyDsl.g:851:3: rule__Technology__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Technology__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTechnologyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technology__Group__2__Impl"


    // $ANTLR start "rule__Technology__Group__3"
    // InternalMyDsl.g:859:1: rule__Technology__Group__3 : rule__Technology__Group__3__Impl ;
    public final void rule__Technology__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:863:1: ( rule__Technology__Group__3__Impl )
            // InternalMyDsl.g:864:2: rule__Technology__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Technology__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technology__Group__3"


    // $ANTLR start "rule__Technology__Group__3__Impl"
    // InternalMyDsl.g:870:1: rule__Technology__Group__3__Impl : ( '}' ) ;
    public final void rule__Technology__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:874:1: ( ( '}' ) )
            // InternalMyDsl.g:875:1: ( '}' )
            {
            // InternalMyDsl.g:875:1: ( '}' )
            // InternalMyDsl.g:876:2: '}'
            {
             before(grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technology__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalMyDsl.g:886:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:890:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalMyDsl.g:891:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalMyDsl.g:898:1: rule__Entity__Group__0__Impl : ( 'Entities' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:902:1: ( ( 'Entities' ) )
            // InternalMyDsl.g:903:1: ( 'Entities' )
            {
            // InternalMyDsl.g:903:1: ( 'Entities' )
            // InternalMyDsl.g:904:2: 'Entities'
            {
             before(grammarAccess.getEntityAccess().getEntitiesKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntitiesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalMyDsl.g:913:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:917:1: ( rule__Entity__Group__1__Impl )
            // InternalMyDsl.g:918:2: rule__Entity__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalMyDsl.g:924:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__ElementsAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:928:1: ( ( ( rule__Entity__ElementsAssignment_1 ) ) )
            // InternalMyDsl.g:929:1: ( ( rule__Entity__ElementsAssignment_1 ) )
            {
            // InternalMyDsl.g:929:1: ( ( rule__Entity__ElementsAssignment_1 ) )
            // InternalMyDsl.g:930:2: ( rule__Entity__ElementsAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getElementsAssignment_1()); 
            // InternalMyDsl.g:931:2: ( rule__Entity__ElementsAssignment_1 )
            // InternalMyDsl.g:931:3: rule__Entity__ElementsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__ElementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Functionality__Group__0"
    // InternalMyDsl.g:940:1: rule__Functionality__Group__0 : rule__Functionality__Group__0__Impl rule__Functionality__Group__1 ;
    public final void rule__Functionality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:944:1: ( rule__Functionality__Group__0__Impl rule__Functionality__Group__1 )
            // InternalMyDsl.g:945:2: rule__Functionality__Group__0__Impl rule__Functionality__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Functionality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functionality__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group__0"


    // $ANTLR start "rule__Functionality__Group__0__Impl"
    // InternalMyDsl.g:952:1: rule__Functionality__Group__0__Impl : ( 'Functionalities' ) ;
    public final void rule__Functionality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:956:1: ( ( 'Functionalities' ) )
            // InternalMyDsl.g:957:1: ( 'Functionalities' )
            {
            // InternalMyDsl.g:957:1: ( 'Functionalities' )
            // InternalMyDsl.g:958:2: 'Functionalities'
            {
             before(grammarAccess.getFunctionalityAccess().getFunctionalitiesKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFunctionalityAccess().getFunctionalitiesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group__0__Impl"


    // $ANTLR start "rule__Functionality__Group__1"
    // InternalMyDsl.g:967:1: rule__Functionality__Group__1 : rule__Functionality__Group__1__Impl ;
    public final void rule__Functionality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:971:1: ( rule__Functionality__Group__1__Impl )
            // InternalMyDsl.g:972:2: rule__Functionality__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Functionality__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group__1"


    // $ANTLR start "rule__Functionality__Group__1__Impl"
    // InternalMyDsl.g:978:1: rule__Functionality__Group__1__Impl : ( ( rule__Functionality__ElementsAssignment_1 ) ) ;
    public final void rule__Functionality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:982:1: ( ( ( rule__Functionality__ElementsAssignment_1 ) ) )
            // InternalMyDsl.g:983:1: ( ( rule__Functionality__ElementsAssignment_1 ) )
            {
            // InternalMyDsl.g:983:1: ( ( rule__Functionality__ElementsAssignment_1 ) )
            // InternalMyDsl.g:984:2: ( rule__Functionality__ElementsAssignment_1 )
            {
             before(grammarAccess.getFunctionalityAccess().getElementsAssignment_1()); 
            // InternalMyDsl.g:985:2: ( rule__Functionality__ElementsAssignment_1 )
            // InternalMyDsl.g:985:3: rule__Functionality__ElementsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Functionality__ElementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalityAccess().getElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__Group__1__Impl"


    // $ANTLR start "rule__Entities__Group__0"
    // InternalMyDsl.g:994:1: rule__Entities__Group__0 : rule__Entities__Group__0__Impl rule__Entities__Group__1 ;
    public final void rule__Entities__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:998:1: ( rule__Entities__Group__0__Impl rule__Entities__Group__1 )
            // InternalMyDsl.g:999:2: rule__Entities__Group__0__Impl rule__Entities__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Entities__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entities__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__Group__0"


    // $ANTLR start "rule__Entities__Group__0__Impl"
    // InternalMyDsl.g:1006:1: rule__Entities__Group__0__Impl : ( ( rule__Entities__ElementsAssignment_0 ) ) ;
    public final void rule__Entities__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1010:1: ( ( ( rule__Entities__ElementsAssignment_0 ) ) )
            // InternalMyDsl.g:1011:1: ( ( rule__Entities__ElementsAssignment_0 ) )
            {
            // InternalMyDsl.g:1011:1: ( ( rule__Entities__ElementsAssignment_0 ) )
            // InternalMyDsl.g:1012:2: ( rule__Entities__ElementsAssignment_0 )
            {
             before(grammarAccess.getEntitiesAccess().getElementsAssignment_0()); 
            // InternalMyDsl.g:1013:2: ( rule__Entities__ElementsAssignment_0 )
            // InternalMyDsl.g:1013:3: rule__Entities__ElementsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Entities__ElementsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntitiesAccess().getElementsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__Group__0__Impl"


    // $ANTLR start "rule__Entities__Group__1"
    // InternalMyDsl.g:1021:1: rule__Entities__Group__1 : rule__Entities__Group__1__Impl rule__Entities__Group__2 ;
    public final void rule__Entities__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1025:1: ( rule__Entities__Group__1__Impl rule__Entities__Group__2 )
            // InternalMyDsl.g:1026:2: rule__Entities__Group__1__Impl rule__Entities__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Entities__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entities__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__Group__1"


    // $ANTLR start "rule__Entities__Group__1__Impl"
    // InternalMyDsl.g:1033:1: rule__Entities__Group__1__Impl : ( ( rule__Entities__ElementsAssignment_1 ) ) ;
    public final void rule__Entities__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1037:1: ( ( ( rule__Entities__ElementsAssignment_1 ) ) )
            // InternalMyDsl.g:1038:1: ( ( rule__Entities__ElementsAssignment_1 ) )
            {
            // InternalMyDsl.g:1038:1: ( ( rule__Entities__ElementsAssignment_1 ) )
            // InternalMyDsl.g:1039:2: ( rule__Entities__ElementsAssignment_1 )
            {
             before(grammarAccess.getEntitiesAccess().getElementsAssignment_1()); 
            // InternalMyDsl.g:1040:2: ( rule__Entities__ElementsAssignment_1 )
            // InternalMyDsl.g:1040:3: rule__Entities__ElementsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entities__ElementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntitiesAccess().getElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__Group__1__Impl"


    // $ANTLR start "rule__Entities__Group__2"
    // InternalMyDsl.g:1048:1: rule__Entities__Group__2 : rule__Entities__Group__2__Impl ;
    public final void rule__Entities__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1052:1: ( rule__Entities__Group__2__Impl )
            // InternalMyDsl.g:1053:2: rule__Entities__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entities__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__Group__2"


    // $ANTLR start "rule__Entities__Group__2__Impl"
    // InternalMyDsl.g:1059:1: rule__Entities__Group__2__Impl : ( ( rule__Entities__ElementsAssignment_2 ) ) ;
    public final void rule__Entities__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1063:1: ( ( ( rule__Entities__ElementsAssignment_2 ) ) )
            // InternalMyDsl.g:1064:1: ( ( rule__Entities__ElementsAssignment_2 ) )
            {
            // InternalMyDsl.g:1064:1: ( ( rule__Entities__ElementsAssignment_2 ) )
            // InternalMyDsl.g:1065:2: ( rule__Entities__ElementsAssignment_2 )
            {
             before(grammarAccess.getEntitiesAccess().getElementsAssignment_2()); 
            // InternalMyDsl.g:1066:2: ( rule__Entities__ElementsAssignment_2 )
            // InternalMyDsl.g:1066:3: rule__Entities__ElementsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Entities__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntitiesAccess().getElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__Group__2__Impl"


    // $ANTLR start "rule__Photo__Group__0"
    // InternalMyDsl.g:1075:1: rule__Photo__Group__0 : rule__Photo__Group__0__Impl rule__Photo__Group__1 ;
    public final void rule__Photo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1079:1: ( rule__Photo__Group__0__Impl rule__Photo__Group__1 )
            // InternalMyDsl.g:1080:2: rule__Photo__Group__0__Impl rule__Photo__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Photo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Photo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__0"


    // $ANTLR start "rule__Photo__Group__0__Impl"
    // InternalMyDsl.g:1087:1: rule__Photo__Group__0__Impl : ( 'Photo' ) ;
    public final void rule__Photo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1091:1: ( ( 'Photo' ) )
            // InternalMyDsl.g:1092:1: ( 'Photo' )
            {
            // InternalMyDsl.g:1092:1: ( 'Photo' )
            // InternalMyDsl.g:1093:2: 'Photo'
            {
             before(grammarAccess.getPhotoAccess().getPhotoKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPhotoAccess().getPhotoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__0__Impl"


    // $ANTLR start "rule__Photo__Group__1"
    // InternalMyDsl.g:1102:1: rule__Photo__Group__1 : rule__Photo__Group__1__Impl ;
    public final void rule__Photo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1106:1: ( rule__Photo__Group__1__Impl )
            // InternalMyDsl.g:1107:2: rule__Photo__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Photo__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__1"


    // $ANTLR start "rule__Photo__Group__1__Impl"
    // InternalMyDsl.g:1113:1: rule__Photo__Group__1__Impl : ( ( rule__Photo__NameAssignment_1 ) ) ;
    public final void rule__Photo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1117:1: ( ( ( rule__Photo__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1118:1: ( ( rule__Photo__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1118:1: ( ( rule__Photo__NameAssignment_1 ) )
            // InternalMyDsl.g:1119:2: ( rule__Photo__NameAssignment_1 )
            {
             before(grammarAccess.getPhotoAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1120:2: ( rule__Photo__NameAssignment_1 )
            // InternalMyDsl.g:1120:3: rule__Photo__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Photo__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPhotoAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__1__Impl"


    // $ANTLR start "rule__Album__Group__0"
    // InternalMyDsl.g:1129:1: rule__Album__Group__0 : rule__Album__Group__0__Impl rule__Album__Group__1 ;
    public final void rule__Album__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1133:1: ( rule__Album__Group__0__Impl rule__Album__Group__1 )
            // InternalMyDsl.g:1134:2: rule__Album__Group__0__Impl rule__Album__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Album__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Album__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Album__Group__0"


    // $ANTLR start "rule__Album__Group__0__Impl"
    // InternalMyDsl.g:1141:1: rule__Album__Group__0__Impl : ( 'Album' ) ;
    public final void rule__Album__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1145:1: ( ( 'Album' ) )
            // InternalMyDsl.g:1146:1: ( 'Album' )
            {
            // InternalMyDsl.g:1146:1: ( 'Album' )
            // InternalMyDsl.g:1147:2: 'Album'
            {
             before(grammarAccess.getAlbumAccess().getAlbumKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAlbumAccess().getAlbumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Album__Group__0__Impl"


    // $ANTLR start "rule__Album__Group__1"
    // InternalMyDsl.g:1156:1: rule__Album__Group__1 : rule__Album__Group__1__Impl ;
    public final void rule__Album__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1160:1: ( rule__Album__Group__1__Impl )
            // InternalMyDsl.g:1161:2: rule__Album__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Album__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Album__Group__1"


    // $ANTLR start "rule__Album__Group__1__Impl"
    // InternalMyDsl.g:1167:1: rule__Album__Group__1__Impl : ( ( rule__Album__NameAssignment_1 ) ) ;
    public final void rule__Album__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1171:1: ( ( ( rule__Album__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1172:1: ( ( rule__Album__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1172:1: ( ( rule__Album__NameAssignment_1 ) )
            // InternalMyDsl.g:1173:2: ( rule__Album__NameAssignment_1 )
            {
             before(grammarAccess.getAlbumAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1174:2: ( rule__Album__NameAssignment_1 )
            // InternalMyDsl.g:1174:3: rule__Album__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Album__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAlbumAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Album__Group__1__Impl"


    // $ANTLR start "rule__User_d__Group__0"
    // InternalMyDsl.g:1183:1: rule__User_d__Group__0 : rule__User_d__Group__0__Impl rule__User_d__Group__1 ;
    public final void rule__User_d__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1187:1: ( rule__User_d__Group__0__Impl rule__User_d__Group__1 )
            // InternalMyDsl.g:1188:2: rule__User_d__Group__0__Impl rule__User_d__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__User_d__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User_d__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_d__Group__0"


    // $ANTLR start "rule__User_d__Group__0__Impl"
    // InternalMyDsl.g:1195:1: rule__User_d__Group__0__Impl : ( 'User_d' ) ;
    public final void rule__User_d__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1199:1: ( ( 'User_d' ) )
            // InternalMyDsl.g:1200:1: ( 'User_d' )
            {
            // InternalMyDsl.g:1200:1: ( 'User_d' )
            // InternalMyDsl.g:1201:2: 'User_d'
            {
             before(grammarAccess.getUser_dAccess().getUser_dKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getUser_dAccess().getUser_dKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_d__Group__0__Impl"


    // $ANTLR start "rule__User_d__Group__1"
    // InternalMyDsl.g:1210:1: rule__User_d__Group__1 : rule__User_d__Group__1__Impl ;
    public final void rule__User_d__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1214:1: ( rule__User_d__Group__1__Impl )
            // InternalMyDsl.g:1215:2: rule__User_d__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User_d__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_d__Group__1"


    // $ANTLR start "rule__User_d__Group__1__Impl"
    // InternalMyDsl.g:1221:1: rule__User_d__Group__1__Impl : ( ( rule__User_d__NameAssignment_1 ) ) ;
    public final void rule__User_d__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1225:1: ( ( ( rule__User_d__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1226:1: ( ( rule__User_d__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1226:1: ( ( rule__User_d__NameAssignment_1 ) )
            // InternalMyDsl.g:1227:2: ( rule__User_d__NameAssignment_1 )
            {
             before(grammarAccess.getUser_dAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1228:2: ( rule__User_d__NameAssignment_1 )
            // InternalMyDsl.g:1228:3: rule__User_d__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__User_d__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUser_dAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_d__Group__1__Impl"


    // $ANTLR start "rule__Functionalities__Group__0"
    // InternalMyDsl.g:1237:1: rule__Functionalities__Group__0 : rule__Functionalities__Group__0__Impl rule__Functionalities__Group__1 ;
    public final void rule__Functionalities__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1241:1: ( rule__Functionalities__Group__0__Impl rule__Functionalities__Group__1 )
            // InternalMyDsl.g:1242:2: rule__Functionalities__Group__0__Impl rule__Functionalities__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Functionalities__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functionalities__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionalities__Group__0"


    // $ANTLR start "rule__Functionalities__Group__0__Impl"
    // InternalMyDsl.g:1249:1: rule__Functionalities__Group__0__Impl : ( ( rule__Functionalities__ElementsAssignment_0 ) ) ;
    public final void rule__Functionalities__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1253:1: ( ( ( rule__Functionalities__ElementsAssignment_0 ) ) )
            // InternalMyDsl.g:1254:1: ( ( rule__Functionalities__ElementsAssignment_0 ) )
            {
            // InternalMyDsl.g:1254:1: ( ( rule__Functionalities__ElementsAssignment_0 ) )
            // InternalMyDsl.g:1255:2: ( rule__Functionalities__ElementsAssignment_0 )
            {
             before(grammarAccess.getFunctionalitiesAccess().getElementsAssignment_0()); 
            // InternalMyDsl.g:1256:2: ( rule__Functionalities__ElementsAssignment_0 )
            // InternalMyDsl.g:1256:3: rule__Functionalities__ElementsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Functionalities__ElementsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalitiesAccess().getElementsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionalities__Group__0__Impl"


    // $ANTLR start "rule__Functionalities__Group__1"
    // InternalMyDsl.g:1264:1: rule__Functionalities__Group__1 : rule__Functionalities__Group__1__Impl rule__Functionalities__Group__2 ;
    public final void rule__Functionalities__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1268:1: ( rule__Functionalities__Group__1__Impl rule__Functionalities__Group__2 )
            // InternalMyDsl.g:1269:2: rule__Functionalities__Group__1__Impl rule__Functionalities__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Functionalities__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functionalities__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionalities__Group__1"


    // $ANTLR start "rule__Functionalities__Group__1__Impl"
    // InternalMyDsl.g:1276:1: rule__Functionalities__Group__1__Impl : ( ( rule__Functionalities__ElementsAssignment_1 ) ) ;
    public final void rule__Functionalities__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1280:1: ( ( ( rule__Functionalities__ElementsAssignment_1 ) ) )
            // InternalMyDsl.g:1281:1: ( ( rule__Functionalities__ElementsAssignment_1 ) )
            {
            // InternalMyDsl.g:1281:1: ( ( rule__Functionalities__ElementsAssignment_1 ) )
            // InternalMyDsl.g:1282:2: ( rule__Functionalities__ElementsAssignment_1 )
            {
             before(grammarAccess.getFunctionalitiesAccess().getElementsAssignment_1()); 
            // InternalMyDsl.g:1283:2: ( rule__Functionalities__ElementsAssignment_1 )
            // InternalMyDsl.g:1283:3: rule__Functionalities__ElementsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Functionalities__ElementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalitiesAccess().getElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionalities__Group__1__Impl"


    // $ANTLR start "rule__Functionalities__Group__2"
    // InternalMyDsl.g:1291:1: rule__Functionalities__Group__2 : rule__Functionalities__Group__2__Impl rule__Functionalities__Group__3 ;
    public final void rule__Functionalities__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1295:1: ( rule__Functionalities__Group__2__Impl rule__Functionalities__Group__3 )
            // InternalMyDsl.g:1296:2: rule__Functionalities__Group__2__Impl rule__Functionalities__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Functionalities__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functionalities__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionalities__Group__2"


    // $ANTLR start "rule__Functionalities__Group__2__Impl"
    // InternalMyDsl.g:1303:1: rule__Functionalities__Group__2__Impl : ( ( rule__Functionalities__ElementsAssignment_2 ) ) ;
    public final void rule__Functionalities__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1307:1: ( ( ( rule__Functionalities__ElementsAssignment_2 ) ) )
            // InternalMyDsl.g:1308:1: ( ( rule__Functionalities__ElementsAssignment_2 ) )
            {
            // InternalMyDsl.g:1308:1: ( ( rule__Functionalities__ElementsAssignment_2 ) )
            // InternalMyDsl.g:1309:2: ( rule__Functionalities__ElementsAssignment_2 )
            {
             before(grammarAccess.getFunctionalitiesAccess().getElementsAssignment_2()); 
            // InternalMyDsl.g:1310:2: ( rule__Functionalities__ElementsAssignment_2 )
            // InternalMyDsl.g:1310:3: rule__Functionalities__ElementsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Functionalities__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalitiesAccess().getElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionalities__Group__2__Impl"


    // $ANTLR start "rule__Functionalities__Group__3"
    // InternalMyDsl.g:1318:1: rule__Functionalities__Group__3 : rule__Functionalities__Group__3__Impl ;
    public final void rule__Functionalities__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1322:1: ( rule__Functionalities__Group__3__Impl )
            // InternalMyDsl.g:1323:2: rule__Functionalities__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Functionalities__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionalities__Group__3"


    // $ANTLR start "rule__Functionalities__Group__3__Impl"
    // InternalMyDsl.g:1329:1: rule__Functionalities__Group__3__Impl : ( ( rule__Functionalities__ElementsAssignment_3 ) ) ;
    public final void rule__Functionalities__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1333:1: ( ( ( rule__Functionalities__ElementsAssignment_3 ) ) )
            // InternalMyDsl.g:1334:1: ( ( rule__Functionalities__ElementsAssignment_3 ) )
            {
            // InternalMyDsl.g:1334:1: ( ( rule__Functionalities__ElementsAssignment_3 ) )
            // InternalMyDsl.g:1335:2: ( rule__Functionalities__ElementsAssignment_3 )
            {
             before(grammarAccess.getFunctionalitiesAccess().getElementsAssignment_3()); 
            // InternalMyDsl.g:1336:2: ( rule__Functionalities__ElementsAssignment_3 )
            // InternalMyDsl.g:1336:3: rule__Functionalities__ElementsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Functionalities__ElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalitiesAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionalities__Group__3__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment_0"
    // InternalMyDsl.g:1345:1: rule__Model__ElementsAssignment_0 : ( ruleDomain ) ;
    public final void rule__Model__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1349:1: ( ( ruleDomain ) )
            // InternalMyDsl.g:1350:2: ( ruleDomain )
            {
            // InternalMyDsl.g:1350:2: ( ruleDomain )
            // InternalMyDsl.g:1351:3: ruleDomain
            {
             before(grammarAccess.getModelAccess().getElementsDomainParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsDomainParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment_0"


    // $ANTLR start "rule__Model__ElementsAssignment_1"
    // InternalMyDsl.g:1360:1: rule__Model__ElementsAssignment_1 : ( ruleArchitecture ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1364:1: ( ( ruleArchitecture ) )
            // InternalMyDsl.g:1365:2: ( ruleArchitecture )
            {
            // InternalMyDsl.g:1365:2: ( ruleArchitecture )
            // InternalMyDsl.g:1366:3: ruleArchitecture
            {
             before(grammarAccess.getModelAccess().getElementsArchitectureParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArchitecture();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsArchitectureParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment_1"


    // $ANTLR start "rule__Model__ElementsAssignment_2"
    // InternalMyDsl.g:1375:1: rule__Model__ElementsAssignment_2 : ( ruleTechnology ) ;
    public final void rule__Model__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1379:1: ( ( ruleTechnology ) )
            // InternalMyDsl.g:1380:2: ( ruleTechnology )
            {
            // InternalMyDsl.g:1380:2: ( ruleTechnology )
            // InternalMyDsl.g:1381:3: ruleTechnology
            {
             before(grammarAccess.getModelAccess().getElementsTechnologyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTechnology();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsTechnologyParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment_2"


    // $ANTLR start "rule__Domain__NameAssignment_1"
    // InternalMyDsl.g:1390:1: rule__Domain__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1394:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1395:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1395:2: ( RULE_ID )
            // InternalMyDsl.g:1396:3: RULE_ID
            {
             before(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__NameAssignment_1"


    // $ANTLR start "rule__Domain__ElementsAssignment_3"
    // InternalMyDsl.g:1405:1: rule__Domain__ElementsAssignment_3 : ( ruleEntity ) ;
    public final void rule__Domain__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1409:1: ( ( ruleEntity ) )
            // InternalMyDsl.g:1410:2: ( ruleEntity )
            {
            // InternalMyDsl.g:1410:2: ( ruleEntity )
            // InternalMyDsl.g:1411:3: ruleEntity
            {
             before(grammarAccess.getDomainAccess().getElementsEntityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getElementsEntityParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__ElementsAssignment_3"


    // $ANTLR start "rule__Domain__ElementsAssignment_4"
    // InternalMyDsl.g:1420:1: rule__Domain__ElementsAssignment_4 : ( ruleFunctionality ) ;
    public final void rule__Domain__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1424:1: ( ( ruleFunctionality ) )
            // InternalMyDsl.g:1425:2: ( ruleFunctionality )
            {
            // InternalMyDsl.g:1425:2: ( ruleFunctionality )
            // InternalMyDsl.g:1426:3: ruleFunctionality
            {
             before(grammarAccess.getDomainAccess().getElementsFunctionalityParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionality();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getElementsFunctionalityParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__ElementsAssignment_4"


    // $ANTLR start "rule__Architecture__NameAssignment_2"
    // InternalMyDsl.g:1435:1: rule__Architecture__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Architecture__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1439:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1440:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1440:2: ( RULE_ID )
            // InternalMyDsl.g:1441:3: RULE_ID
            {
             before(grammarAccess.getArchitectureAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__NameAssignment_2"


    // $ANTLR start "rule__Technology__NameAssignment_2"
    // InternalMyDsl.g:1450:1: rule__Technology__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Technology__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1454:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1455:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1455:2: ( RULE_ID )
            // InternalMyDsl.g:1456:3: RULE_ID
            {
             before(grammarAccess.getTechnologyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technology__NameAssignment_2"


    // $ANTLR start "rule__Entity__ElementsAssignment_1"
    // InternalMyDsl.g:1465:1: rule__Entity__ElementsAssignment_1 : ( ruleEntities ) ;
    public final void rule__Entity__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1469:1: ( ( ruleEntities ) )
            // InternalMyDsl.g:1470:2: ( ruleEntities )
            {
            // InternalMyDsl.g:1470:2: ( ruleEntities )
            // InternalMyDsl.g:1471:3: ruleEntities
            {
             before(grammarAccess.getEntityAccess().getElementsEntitiesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntities();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getElementsEntitiesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__ElementsAssignment_1"


    // $ANTLR start "rule__Functionality__ElementsAssignment_1"
    // InternalMyDsl.g:1480:1: rule__Functionality__ElementsAssignment_1 : ( ruleFunctionalities ) ;
    public final void rule__Functionality__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1484:1: ( ( ruleFunctionalities ) )
            // InternalMyDsl.g:1485:2: ( ruleFunctionalities )
            {
            // InternalMyDsl.g:1485:2: ( ruleFunctionalities )
            // InternalMyDsl.g:1486:3: ruleFunctionalities
            {
             before(grammarAccess.getFunctionalityAccess().getElementsFunctionalitiesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionalities();

            state._fsp--;

             after(grammarAccess.getFunctionalityAccess().getElementsFunctionalitiesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionality__ElementsAssignment_1"


    // $ANTLR start "rule__Entities__ElementsAssignment_0"
    // InternalMyDsl.g:1495:1: rule__Entities__ElementsAssignment_0 : ( rulePhoto ) ;
    public final void rule__Entities__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1499:1: ( ( rulePhoto ) )
            // InternalMyDsl.g:1500:2: ( rulePhoto )
            {
            // InternalMyDsl.g:1500:2: ( rulePhoto )
            // InternalMyDsl.g:1501:3: rulePhoto
            {
             before(grammarAccess.getEntitiesAccess().getElementsPhotoParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePhoto();

            state._fsp--;

             after(grammarAccess.getEntitiesAccess().getElementsPhotoParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__ElementsAssignment_0"


    // $ANTLR start "rule__Entities__ElementsAssignment_1"
    // InternalMyDsl.g:1510:1: rule__Entities__ElementsAssignment_1 : ( ruleAlbum ) ;
    public final void rule__Entities__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1514:1: ( ( ruleAlbum ) )
            // InternalMyDsl.g:1515:2: ( ruleAlbum )
            {
            // InternalMyDsl.g:1515:2: ( ruleAlbum )
            // InternalMyDsl.g:1516:3: ruleAlbum
            {
             before(grammarAccess.getEntitiesAccess().getElementsAlbumParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAlbum();

            state._fsp--;

             after(grammarAccess.getEntitiesAccess().getElementsAlbumParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__ElementsAssignment_1"


    // $ANTLR start "rule__Entities__ElementsAssignment_2"
    // InternalMyDsl.g:1525:1: rule__Entities__ElementsAssignment_2 : ( ruleUser_d ) ;
    public final void rule__Entities__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1529:1: ( ( ruleUser_d ) )
            // InternalMyDsl.g:1530:2: ( ruleUser_d )
            {
            // InternalMyDsl.g:1530:2: ( ruleUser_d )
            // InternalMyDsl.g:1531:3: ruleUser_d
            {
             before(grammarAccess.getEntitiesAccess().getElementsUser_dParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUser_d();

            state._fsp--;

             after(grammarAccess.getEntitiesAccess().getElementsUser_dParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entities__ElementsAssignment_2"


    // $ANTLR start "rule__Photo__NameAssignment_1"
    // InternalMyDsl.g:1540:1: rule__Photo__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Photo__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1544:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1545:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1545:2: ( RULE_ID )
            // InternalMyDsl.g:1546:3: RULE_ID
            {
             before(grammarAccess.getPhotoAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPhotoAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__NameAssignment_1"


    // $ANTLR start "rule__Album__NameAssignment_1"
    // InternalMyDsl.g:1555:1: rule__Album__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Album__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1559:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1560:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1560:2: ( RULE_ID )
            // InternalMyDsl.g:1561:3: RULE_ID
            {
             before(grammarAccess.getAlbumAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAlbumAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Album__NameAssignment_1"


    // $ANTLR start "rule__User_d__NameAssignment_1"
    // InternalMyDsl.g:1570:1: rule__User_d__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__User_d__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1574:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1575:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1575:2: ( RULE_ID )
            // InternalMyDsl.g:1576:3: RULE_ID
            {
             before(grammarAccess.getUser_dAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUser_dAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_d__NameAssignment_1"


    // $ANTLR start "rule__Functionalities__ElementsAssignment_0"
    // InternalMyDsl.g:1585:1: rule__Functionalities__ElementsAssignment_0 : ( ruleProfileManagement ) ;
    public final void rule__Functionalities__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1589:1: ( ( ruleProfileManagement ) )
            // InternalMyDsl.g:1590:2: ( ruleProfileManagement )
            {
            // InternalMyDsl.g:1590:2: ( ruleProfileManagement )
            // InternalMyDsl.g:1591:3: ruleProfileManagement
            {
             before(grammarAccess.getFunctionalitiesAccess().getElementsProfileManagementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProfileManagement();

            state._fsp--;

             after(grammarAccess.getFunctionalitiesAccess().getElementsProfileManagementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionalities__ElementsAssignment_0"


    // $ANTLR start "rule__Functionalities__ElementsAssignment_1"
    // InternalMyDsl.g:1600:1: rule__Functionalities__ElementsAssignment_1 : ( ruleAppAccess ) ;
    public final void rule__Functionalities__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1604:1: ( ( ruleAppAccess ) )
            // InternalMyDsl.g:1605:2: ( ruleAppAccess )
            {
            // InternalMyDsl.g:1605:2: ( ruleAppAccess )
            // InternalMyDsl.g:1606:3: ruleAppAccess
            {
             before(grammarAccess.getFunctionalitiesAccess().getElementsAppAccessParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAppAccess();

            state._fsp--;

             after(grammarAccess.getFunctionalitiesAccess().getElementsAppAccessParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionalities__ElementsAssignment_1"


    // $ANTLR start "rule__Functionalities__ElementsAssignment_2"
    // InternalMyDsl.g:1615:1: rule__Functionalities__ElementsAssignment_2 : ( ruleAlbumManagement ) ;
    public final void rule__Functionalities__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1619:1: ( ( ruleAlbumManagement ) )
            // InternalMyDsl.g:1620:2: ( ruleAlbumManagement )
            {
            // InternalMyDsl.g:1620:2: ( ruleAlbumManagement )
            // InternalMyDsl.g:1621:3: ruleAlbumManagement
            {
             before(grammarAccess.getFunctionalitiesAccess().getElementsAlbumManagementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAlbumManagement();

            state._fsp--;

             after(grammarAccess.getFunctionalitiesAccess().getElementsAlbumManagementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionalities__ElementsAssignment_2"


    // $ANTLR start "rule__Functionalities__ElementsAssignment_3"
    // InternalMyDsl.g:1630:1: rule__Functionalities__ElementsAssignment_3 : ( rulePhotoActions ) ;
    public final void rule__Functionalities__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1634:1: ( ( rulePhotoActions ) )
            // InternalMyDsl.g:1635:2: ( rulePhotoActions )
            {
            // InternalMyDsl.g:1635:2: ( rulePhotoActions )
            // InternalMyDsl.g:1636:3: rulePhotoActions
            {
             before(grammarAccess.getFunctionalitiesAccess().getElementsPhotoActionsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePhotoActions();

            state._fsp--;

             after(grammarAccess.getFunctionalitiesAccess().getElementsPhotoActionsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Functionalities__ElementsAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000004000L});

}