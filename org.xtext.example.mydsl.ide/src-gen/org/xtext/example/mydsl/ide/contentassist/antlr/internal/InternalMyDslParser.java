package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
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


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:103:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleEntity EOF )
            // InternalMyDsl.g:105:1: ruleEntity EOF
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
    // InternalMyDsl.g:112:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Entity__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Entity__Group__0 )
            // InternalMyDsl.g:119:4: rule__Entity__Group__0
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


    // $ANTLR start "entryRuleEntities"
    // InternalMyDsl.g:128:1: entryRuleEntities : ruleEntities EOF ;
    public final void entryRuleEntities() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleEntities EOF )
            // InternalMyDsl.g:130:1: ruleEntities EOF
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
    // InternalMyDsl.g:137:1: ruleEntities : ( ( rule__Entities__Group__0 ) ) ;
    public final void ruleEntities() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Entities__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Entities__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Entities__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Entities__Group__0 )
            {
             before(grammarAccess.getEntitiesAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Entities__Group__0 )
            // InternalMyDsl.g:144:4: rule__Entities__Group__0
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
    // InternalMyDsl.g:153:1: entryRulePhoto : rulePhoto EOF ;
    public final void entryRulePhoto() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( rulePhoto EOF )
            // InternalMyDsl.g:155:1: rulePhoto EOF
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
    // InternalMyDsl.g:162:1: rulePhoto : ( ( rule__Photo__Group__0 ) ) ;
    public final void rulePhoto() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Photo__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Photo__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Photo__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Photo__Group__0 )
            {
             before(grammarAccess.getPhotoAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Photo__Group__0 )
            // InternalMyDsl.g:169:4: rule__Photo__Group__0
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
    // InternalMyDsl.g:178:1: entryRuleAlbum : ruleAlbum EOF ;
    public final void entryRuleAlbum() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleAlbum EOF )
            // InternalMyDsl.g:180:1: ruleAlbum EOF
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
    // InternalMyDsl.g:187:1: ruleAlbum : ( ( rule__Album__Group__0 ) ) ;
    public final void ruleAlbum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Album__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Album__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Album__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Album__Group__0 )
            {
             before(grammarAccess.getAlbumAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Album__Group__0 )
            // InternalMyDsl.g:194:4: rule__Album__Group__0
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


    // $ANTLR start "entryRuleUserDomain"
    // InternalMyDsl.g:203:1: entryRuleUserDomain : ruleUserDomain EOF ;
    public final void entryRuleUserDomain() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleUserDomain EOF )
            // InternalMyDsl.g:205:1: ruleUserDomain EOF
            {
             before(grammarAccess.getUserDomainRule()); 
            pushFollow(FOLLOW_1);
            ruleUserDomain();

            state._fsp--;

             after(grammarAccess.getUserDomainRule()); 
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
    // $ANTLR end "entryRuleUserDomain"


    // $ANTLR start "ruleUserDomain"
    // InternalMyDsl.g:212:1: ruleUserDomain : ( ( rule__UserDomain__Group__0 ) ) ;
    public final void ruleUserDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__UserDomain__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__UserDomain__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__UserDomain__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__UserDomain__Group__0 )
            {
             before(grammarAccess.getUserDomainAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__UserDomain__Group__0 )
            // InternalMyDsl.g:219:4: rule__UserDomain__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UserDomain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserDomainAccess().getGroup()); 

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
    // $ANTLR end "ruleUserDomain"


    // $ANTLR start "entryRuleFunctionality"
    // InternalMyDsl.g:228:1: entryRuleFunctionality : ruleFunctionality EOF ;
    public final void entryRuleFunctionality() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleFunctionality EOF )
            // InternalMyDsl.g:230:1: ruleFunctionality EOF
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
    // InternalMyDsl.g:237:1: ruleFunctionality : ( ( rule__Functionality__Group__0 ) ) ;
    public final void ruleFunctionality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Functionality__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Functionality__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Functionality__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Functionality__Group__0 )
            {
             before(grammarAccess.getFunctionalityAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Functionality__Group__0 )
            // InternalMyDsl.g:244:4: rule__Functionality__Group__0
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


    // $ANTLR start "entryRuleFunctionalities"
    // InternalMyDsl.g:253:1: entryRuleFunctionalities : ruleFunctionalities EOF ;
    public final void entryRuleFunctionalities() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleFunctionalities EOF )
            // InternalMyDsl.g:255:1: ruleFunctionalities EOF
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
    // InternalMyDsl.g:262:1: ruleFunctionalities : ( ( rule__Functionalities__Group__0 ) ) ;
    public final void ruleFunctionalities() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Functionalities__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Functionalities__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Functionalities__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Functionalities__Group__0 )
            {
             before(grammarAccess.getFunctionalitiesAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Functionalities__Group__0 )
            // InternalMyDsl.g:269:4: rule__Functionalities__Group__0
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
    // InternalMyDsl.g:278:1: entryRuleProfileManagement : ruleProfileManagement EOF ;
    public final void entryRuleProfileManagement() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleProfileManagement EOF )
            // InternalMyDsl.g:280:1: ruleProfileManagement EOF
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
    // InternalMyDsl.g:287:1: ruleProfileManagement : ( ( rule__ProfileManagement__Group__0 ) ) ;
    public final void ruleProfileManagement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__ProfileManagement__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__ProfileManagement__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__ProfileManagement__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__ProfileManagement__Group__0 )
            {
             before(grammarAccess.getProfileManagementAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__ProfileManagement__Group__0 )
            // InternalMyDsl.g:294:4: rule__ProfileManagement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProfileManagement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProfileManagementAccess().getGroup()); 

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


    // $ANTLR start "entryRuleProfileManagementFunctions"
    // InternalMyDsl.g:303:1: entryRuleProfileManagementFunctions : ruleProfileManagementFunctions EOF ;
    public final void entryRuleProfileManagementFunctions() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleProfileManagementFunctions EOF )
            // InternalMyDsl.g:305:1: ruleProfileManagementFunctions EOF
            {
             before(grammarAccess.getProfileManagementFunctionsRule()); 
            pushFollow(FOLLOW_1);
            ruleProfileManagementFunctions();

            state._fsp--;

             after(grammarAccess.getProfileManagementFunctionsRule()); 
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
    // $ANTLR end "entryRuleProfileManagementFunctions"


    // $ANTLR start "ruleProfileManagementFunctions"
    // InternalMyDsl.g:312:1: ruleProfileManagementFunctions : ( ( rule__ProfileManagementFunctions__Group__0 ) ) ;
    public final void ruleProfileManagementFunctions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__ProfileManagementFunctions__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__ProfileManagementFunctions__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__ProfileManagementFunctions__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__ProfileManagementFunctions__Group__0 )
            {
             before(grammarAccess.getProfileManagementFunctionsAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__ProfileManagementFunctions__Group__0 )
            // InternalMyDsl.g:319:4: rule__ProfileManagementFunctions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProfileManagementFunctions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProfileManagementFunctionsAccess().getGroup()); 

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
    // $ANTLR end "ruleProfileManagementFunctions"


    // $ANTLR start "entryRuleAppAccess"
    // InternalMyDsl.g:328:1: entryRuleAppAccess : ruleAppAccess EOF ;
    public final void entryRuleAppAccess() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleAppAccess EOF )
            // InternalMyDsl.g:330:1: ruleAppAccess EOF
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
    // InternalMyDsl.g:337:1: ruleAppAccess : ( ( rule__AppAccess__Group__0 ) ) ;
    public final void ruleAppAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__AppAccess__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__AppAccess__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__AppAccess__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__AppAccess__Group__0 )
            {
             before(grammarAccess.getAppAccessAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__AppAccess__Group__0 )
            // InternalMyDsl.g:344:4: rule__AppAccess__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AppAccess__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAppAccessAccess().getGroup()); 

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


    // $ANTLR start "entryRuleAppAccessFunctions"
    // InternalMyDsl.g:353:1: entryRuleAppAccessFunctions : ruleAppAccessFunctions EOF ;
    public final void entryRuleAppAccessFunctions() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleAppAccessFunctions EOF )
            // InternalMyDsl.g:355:1: ruleAppAccessFunctions EOF
            {
             before(grammarAccess.getAppAccessFunctionsRule()); 
            pushFollow(FOLLOW_1);
            ruleAppAccessFunctions();

            state._fsp--;

             after(grammarAccess.getAppAccessFunctionsRule()); 
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
    // $ANTLR end "entryRuleAppAccessFunctions"


    // $ANTLR start "ruleAppAccessFunctions"
    // InternalMyDsl.g:362:1: ruleAppAccessFunctions : ( ( rule__AppAccessFunctions__Group__0 ) ) ;
    public final void ruleAppAccessFunctions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__AppAccessFunctions__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__AppAccessFunctions__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__AppAccessFunctions__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__AppAccessFunctions__Group__0 )
            {
             before(grammarAccess.getAppAccessFunctionsAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__AppAccessFunctions__Group__0 )
            // InternalMyDsl.g:369:4: rule__AppAccessFunctions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AppAccessFunctions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAppAccessFunctionsAccess().getGroup()); 

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
    // $ANTLR end "ruleAppAccessFunctions"


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
    // InternalMyDsl.g:387:1: ruleAlbumManagement : ( ( rule__AlbumManagement__Group__0 ) ) ;
    public final void ruleAlbumManagement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__AlbumManagement__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__AlbumManagement__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__AlbumManagement__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__AlbumManagement__Group__0 )
            {
             before(grammarAccess.getAlbumManagementAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__AlbumManagement__Group__0 )
            // InternalMyDsl.g:394:4: rule__AlbumManagement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AlbumManagement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlbumManagementAccess().getGroup()); 

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


    // $ANTLR start "entryRuleAlbumManagementFunctions"
    // InternalMyDsl.g:403:1: entryRuleAlbumManagementFunctions : ruleAlbumManagementFunctions EOF ;
    public final void entryRuleAlbumManagementFunctions() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleAlbumManagementFunctions EOF )
            // InternalMyDsl.g:405:1: ruleAlbumManagementFunctions EOF
            {
             before(grammarAccess.getAlbumManagementFunctionsRule()); 
            pushFollow(FOLLOW_1);
            ruleAlbumManagementFunctions();

            state._fsp--;

             after(grammarAccess.getAlbumManagementFunctionsRule()); 
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
    // $ANTLR end "entryRuleAlbumManagementFunctions"


    // $ANTLR start "ruleAlbumManagementFunctions"
    // InternalMyDsl.g:412:1: ruleAlbumManagementFunctions : ( ( rule__AlbumManagementFunctions__Group__0 ) ) ;
    public final void ruleAlbumManagementFunctions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__AlbumManagementFunctions__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__AlbumManagementFunctions__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__AlbumManagementFunctions__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__AlbumManagementFunctions__Group__0 )
            {
             before(grammarAccess.getAlbumManagementFunctionsAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__AlbumManagementFunctions__Group__0 )
            // InternalMyDsl.g:419:4: rule__AlbumManagementFunctions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AlbumManagementFunctions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlbumManagementFunctionsAccess().getGroup()); 

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
    // $ANTLR end "ruleAlbumManagementFunctions"


    // $ANTLR start "entryRulePhotoActions"
    // InternalMyDsl.g:428:1: entryRulePhotoActions : rulePhotoActions EOF ;
    public final void entryRulePhotoActions() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( rulePhotoActions EOF )
            // InternalMyDsl.g:430:1: rulePhotoActions EOF
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
    // InternalMyDsl.g:437:1: rulePhotoActions : ( ( rule__PhotoActions__Group__0 ) ) ;
    public final void rulePhotoActions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__PhotoActions__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__PhotoActions__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__PhotoActions__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__PhotoActions__Group__0 )
            {
             before(grammarAccess.getPhotoActionsAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__PhotoActions__Group__0 )
            // InternalMyDsl.g:444:4: rule__PhotoActions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PhotoActions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPhotoActionsAccess().getGroup()); 

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


    // $ANTLR start "entryRulePhotoActionsFunctions"
    // InternalMyDsl.g:453:1: entryRulePhotoActionsFunctions : rulePhotoActionsFunctions EOF ;
    public final void entryRulePhotoActionsFunctions() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( rulePhotoActionsFunctions EOF )
            // InternalMyDsl.g:455:1: rulePhotoActionsFunctions EOF
            {
             before(grammarAccess.getPhotoActionsFunctionsRule()); 
            pushFollow(FOLLOW_1);
            rulePhotoActionsFunctions();

            state._fsp--;

             after(grammarAccess.getPhotoActionsFunctionsRule()); 
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
    // $ANTLR end "entryRulePhotoActionsFunctions"


    // $ANTLR start "rulePhotoActionsFunctions"
    // InternalMyDsl.g:462:1: rulePhotoActionsFunctions : ( ( rule__PhotoActionsFunctions__Group__0 ) ) ;
    public final void rulePhotoActionsFunctions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__PhotoActionsFunctions__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__PhotoActionsFunctions__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__PhotoActionsFunctions__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__PhotoActionsFunctions__Group__0 )
            {
             before(grammarAccess.getPhotoActionsFunctionsAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__PhotoActionsFunctions__Group__0 )
            // InternalMyDsl.g:469:4: rule__PhotoActionsFunctions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PhotoActionsFunctions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPhotoActionsFunctionsAccess().getGroup()); 

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
    // $ANTLR end "rulePhotoActionsFunctions"


    // $ANTLR start "entryRuleLandingActions"
    // InternalMyDsl.g:478:1: entryRuleLandingActions : ruleLandingActions EOF ;
    public final void entryRuleLandingActions() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleLandingActions EOF )
            // InternalMyDsl.g:480:1: ruleLandingActions EOF
            {
             before(grammarAccess.getLandingActionsRule()); 
            pushFollow(FOLLOW_1);
            ruleLandingActions();

            state._fsp--;

             after(grammarAccess.getLandingActionsRule()); 
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
    // $ANTLR end "entryRuleLandingActions"


    // $ANTLR start "ruleLandingActions"
    // InternalMyDsl.g:487:1: ruleLandingActions : ( ( rule__LandingActions__Group__0 ) ) ;
    public final void ruleLandingActions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__LandingActions__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__LandingActions__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__LandingActions__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__LandingActions__Group__0 )
            {
             before(grammarAccess.getLandingActionsAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__LandingActions__Group__0 )
            // InternalMyDsl.g:494:4: rule__LandingActions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LandingActions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLandingActionsAccess().getGroup()); 

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
    // $ANTLR end "ruleLandingActions"


    // $ANTLR start "entryRuleLandingFunctions"
    // InternalMyDsl.g:503:1: entryRuleLandingFunctions : ruleLandingFunctions EOF ;
    public final void entryRuleLandingFunctions() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleLandingFunctions EOF )
            // InternalMyDsl.g:505:1: ruleLandingFunctions EOF
            {
             before(grammarAccess.getLandingFunctionsRule()); 
            pushFollow(FOLLOW_1);
            ruleLandingFunctions();

            state._fsp--;

             after(grammarAccess.getLandingFunctionsRule()); 
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
    // $ANTLR end "entryRuleLandingFunctions"


    // $ANTLR start "ruleLandingFunctions"
    // InternalMyDsl.g:512:1: ruleLandingFunctions : ( ( rule__LandingFunctions__Group__0 ) ) ;
    public final void ruleLandingFunctions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__LandingFunctions__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__LandingFunctions__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__LandingFunctions__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__LandingFunctions__Group__0 )
            {
             before(grammarAccess.getLandingFunctionsAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__LandingFunctions__Group__0 )
            // InternalMyDsl.g:519:4: rule__LandingFunctions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LandingFunctions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLandingFunctionsAccess().getGroup()); 

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
    // $ANTLR end "ruleLandingFunctions"


    // $ANTLR start "entryRuleDomainConnection"
    // InternalMyDsl.g:528:1: entryRuleDomainConnection : ruleDomainConnection EOF ;
    public final void entryRuleDomainConnection() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleDomainConnection EOF )
            // InternalMyDsl.g:530:1: ruleDomainConnection EOF
            {
             before(grammarAccess.getDomainConnectionRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainConnection();

            state._fsp--;

             after(grammarAccess.getDomainConnectionRule()); 
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
    // $ANTLR end "entryRuleDomainConnection"


    // $ANTLR start "ruleDomainConnection"
    // InternalMyDsl.g:537:1: ruleDomainConnection : ( ( rule__DomainConnection__Group__0 ) ) ;
    public final void ruleDomainConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__DomainConnection__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__DomainConnection__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__DomainConnection__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__DomainConnection__Group__0 )
            {
             before(grammarAccess.getDomainConnectionAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__DomainConnection__Group__0 )
            // InternalMyDsl.g:544:4: rule__DomainConnection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DomainConnection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainConnectionAccess().getGroup()); 

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
    // $ANTLR end "ruleDomainConnection"


    // $ANTLR start "entryRuleDomainRelations"
    // InternalMyDsl.g:553:1: entryRuleDomainRelations : ruleDomainRelations EOF ;
    public final void entryRuleDomainRelations() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleDomainRelations EOF )
            // InternalMyDsl.g:555:1: ruleDomainRelations EOF
            {
             before(grammarAccess.getDomainRelationsRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainRelations();

            state._fsp--;

             after(grammarAccess.getDomainRelationsRule()); 
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
    // $ANTLR end "entryRuleDomainRelations"


    // $ANTLR start "ruleDomainRelations"
    // InternalMyDsl.g:562:1: ruleDomainRelations : ( ( rule__DomainRelations__Group__0 ) ) ;
    public final void ruleDomainRelations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__DomainRelations__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__DomainRelations__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__DomainRelations__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__DomainRelations__Group__0 )
            {
             before(grammarAccess.getDomainRelationsAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__DomainRelations__Group__0 )
            // InternalMyDsl.g:569:4: rule__DomainRelations__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DomainRelations__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainRelationsAccess().getGroup()); 

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
    // $ANTLR end "ruleDomainRelations"


    // $ANTLR start "entryRuleArchitecture"
    // InternalMyDsl.g:578:1: entryRuleArchitecture : ruleArchitecture EOF ;
    public final void entryRuleArchitecture() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleArchitecture EOF )
            // InternalMyDsl.g:580:1: ruleArchitecture EOF
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
    // InternalMyDsl.g:587:1: ruleArchitecture : ( ( rule__Architecture__Group__0 ) ) ;
    public final void ruleArchitecture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__Architecture__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__Architecture__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__Architecture__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__Architecture__Group__0 )
            {
             before(grammarAccess.getArchitectureAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__Architecture__Group__0 )
            // InternalMyDsl.g:594:4: rule__Architecture__Group__0
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
    // InternalMyDsl.g:603:1: entryRuleTechnology : ruleTechnology EOF ;
    public final void entryRuleTechnology() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleTechnology EOF )
            // InternalMyDsl.g:605:1: ruleTechnology EOF
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
    // InternalMyDsl.g:612:1: ruleTechnology : ( ( rule__Technology__Group__0 ) ) ;
    public final void ruleTechnology() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__Technology__Group__0 ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__Technology__Group__0 ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__Technology__Group__0 ) )
            // InternalMyDsl.g:618:3: ( rule__Technology__Group__0 )
            {
             before(grammarAccess.getTechnologyAccess().getGroup()); 
            // InternalMyDsl.g:619:3: ( rule__Technology__Group__0 )
            // InternalMyDsl.g:619:4: rule__Technology__Group__0
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


    // $ANTLR start "entryRuleTechnologies"
    // InternalMyDsl.g:628:1: entryRuleTechnologies : ruleTechnologies EOF ;
    public final void entryRuleTechnologies() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleTechnologies EOF )
            // InternalMyDsl.g:630:1: ruleTechnologies EOF
            {
             before(grammarAccess.getTechnologiesRule()); 
            pushFollow(FOLLOW_1);
            ruleTechnologies();

            state._fsp--;

             after(grammarAccess.getTechnologiesRule()); 
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
    // $ANTLR end "entryRuleTechnologies"


    // $ANTLR start "ruleTechnologies"
    // InternalMyDsl.g:637:1: ruleTechnologies : ( ( rule__Technologies__Group__0 ) ) ;
    public final void ruleTechnologies() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__Technologies__Group__0 ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__Technologies__Group__0 ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__Technologies__Group__0 ) )
            // InternalMyDsl.g:643:3: ( rule__Technologies__Group__0 )
            {
             before(grammarAccess.getTechnologiesAccess().getGroup()); 
            // InternalMyDsl.g:644:3: ( rule__Technologies__Group__0 )
            // InternalMyDsl.g:644:4: rule__Technologies__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Technologies__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTechnologiesAccess().getGroup()); 

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
    // $ANTLR end "ruleTechnologies"


    // $ANTLR start "entryRuleReact"
    // InternalMyDsl.g:653:1: entryRuleReact : ruleReact EOF ;
    public final void entryRuleReact() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleReact EOF )
            // InternalMyDsl.g:655:1: ruleReact EOF
            {
             before(grammarAccess.getReactRule()); 
            pushFollow(FOLLOW_1);
            ruleReact();

            state._fsp--;

             after(grammarAccess.getReactRule()); 
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
    // $ANTLR end "entryRuleReact"


    // $ANTLR start "ruleReact"
    // InternalMyDsl.g:662:1: ruleReact : ( ( rule__React__Group__0 ) ) ;
    public final void ruleReact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__React__Group__0 ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__React__Group__0 ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__React__Group__0 ) )
            // InternalMyDsl.g:668:3: ( rule__React__Group__0 )
            {
             before(grammarAccess.getReactAccess().getGroup()); 
            // InternalMyDsl.g:669:3: ( rule__React__Group__0 )
            // InternalMyDsl.g:669:4: rule__React__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__React__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReactAccess().getGroup()); 

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
    // $ANTLR end "ruleReact"


    // $ANTLR start "entryRuleReactModules"
    // InternalMyDsl.g:678:1: entryRuleReactModules : ruleReactModules EOF ;
    public final void entryRuleReactModules() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleReactModules EOF )
            // InternalMyDsl.g:680:1: ruleReactModules EOF
            {
             before(grammarAccess.getReactModulesRule()); 
            pushFollow(FOLLOW_1);
            ruleReactModules();

            state._fsp--;

             after(grammarAccess.getReactModulesRule()); 
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
    // $ANTLR end "entryRuleReactModules"


    // $ANTLR start "ruleReactModules"
    // InternalMyDsl.g:687:1: ruleReactModules : ( ( rule__ReactModules__Group__0 ) ) ;
    public final void ruleReactModules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( ( rule__ReactModules__Group__0 ) ) )
            // InternalMyDsl.g:692:2: ( ( rule__ReactModules__Group__0 ) )
            {
            // InternalMyDsl.g:692:2: ( ( rule__ReactModules__Group__0 ) )
            // InternalMyDsl.g:693:3: ( rule__ReactModules__Group__0 )
            {
             before(grammarAccess.getReactModulesAccess().getGroup()); 
            // InternalMyDsl.g:694:3: ( rule__ReactModules__Group__0 )
            // InternalMyDsl.g:694:4: rule__ReactModules__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReactModules__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReactModulesAccess().getGroup()); 

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
    // $ANTLR end "ruleReactModules"


    // $ANTLR start "entryRuleReactSubModules"
    // InternalMyDsl.g:703:1: entryRuleReactSubModules : ruleReactSubModules EOF ;
    public final void entryRuleReactSubModules() throws RecognitionException {
        try {
            // InternalMyDsl.g:704:1: ( ruleReactSubModules EOF )
            // InternalMyDsl.g:705:1: ruleReactSubModules EOF
            {
             before(grammarAccess.getReactSubModulesRule()); 
            pushFollow(FOLLOW_1);
            ruleReactSubModules();

            state._fsp--;

             after(grammarAccess.getReactSubModulesRule()); 
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
    // $ANTLR end "entryRuleReactSubModules"


    // $ANTLR start "ruleReactSubModules"
    // InternalMyDsl.g:712:1: ruleReactSubModules : ( ( rule__ReactSubModules__Group__0 ) ) ;
    public final void ruleReactSubModules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:2: ( ( ( rule__ReactSubModules__Group__0 ) ) )
            // InternalMyDsl.g:717:2: ( ( rule__ReactSubModules__Group__0 ) )
            {
            // InternalMyDsl.g:717:2: ( ( rule__ReactSubModules__Group__0 ) )
            // InternalMyDsl.g:718:3: ( rule__ReactSubModules__Group__0 )
            {
             before(grammarAccess.getReactSubModulesAccess().getGroup()); 
            // InternalMyDsl.g:719:3: ( rule__ReactSubModules__Group__0 )
            // InternalMyDsl.g:719:4: rule__ReactSubModules__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReactSubModules__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReactSubModulesAccess().getGroup()); 

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
    // $ANTLR end "ruleReactSubModules"


    // $ANTLR start "entryRuleReactConfiguration"
    // InternalMyDsl.g:728:1: entryRuleReactConfiguration : ruleReactConfiguration EOF ;
    public final void entryRuleReactConfiguration() throws RecognitionException {
        try {
            // InternalMyDsl.g:729:1: ( ruleReactConfiguration EOF )
            // InternalMyDsl.g:730:1: ruleReactConfiguration EOF
            {
             before(grammarAccess.getReactConfigurationRule()); 
            pushFollow(FOLLOW_1);
            ruleReactConfiguration();

            state._fsp--;

             after(grammarAccess.getReactConfigurationRule()); 
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
    // $ANTLR end "entryRuleReactConfiguration"


    // $ANTLR start "ruleReactConfiguration"
    // InternalMyDsl.g:737:1: ruleReactConfiguration : ( ( rule__ReactConfiguration__Group__0 ) ) ;
    public final void ruleReactConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:2: ( ( ( rule__ReactConfiguration__Group__0 ) ) )
            // InternalMyDsl.g:742:2: ( ( rule__ReactConfiguration__Group__0 ) )
            {
            // InternalMyDsl.g:742:2: ( ( rule__ReactConfiguration__Group__0 ) )
            // InternalMyDsl.g:743:3: ( rule__ReactConfiguration__Group__0 )
            {
             before(grammarAccess.getReactConfigurationAccess().getGroup()); 
            // InternalMyDsl.g:744:3: ( rule__ReactConfiguration__Group__0 )
            // InternalMyDsl.g:744:4: rule__ReactConfiguration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReactConfiguration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReactConfigurationAccess().getGroup()); 

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
    // $ANTLR end "ruleReactConfiguration"


    // $ANTLR start "entryRuleReactDependencies"
    // InternalMyDsl.g:753:1: entryRuleReactDependencies : ruleReactDependencies EOF ;
    public final void entryRuleReactDependencies() throws RecognitionException {
        try {
            // InternalMyDsl.g:754:1: ( ruleReactDependencies EOF )
            // InternalMyDsl.g:755:1: ruleReactDependencies EOF
            {
             before(grammarAccess.getReactDependenciesRule()); 
            pushFollow(FOLLOW_1);
            ruleReactDependencies();

            state._fsp--;

             after(grammarAccess.getReactDependenciesRule()); 
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
    // $ANTLR end "entryRuleReactDependencies"


    // $ANTLR start "ruleReactDependencies"
    // InternalMyDsl.g:762:1: ruleReactDependencies : ( ( rule__ReactDependencies__Group__0 ) ) ;
    public final void ruleReactDependencies() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:2: ( ( ( rule__ReactDependencies__Group__0 ) ) )
            // InternalMyDsl.g:767:2: ( ( rule__ReactDependencies__Group__0 ) )
            {
            // InternalMyDsl.g:767:2: ( ( rule__ReactDependencies__Group__0 ) )
            // InternalMyDsl.g:768:3: ( rule__ReactDependencies__Group__0 )
            {
             before(grammarAccess.getReactDependenciesAccess().getGroup()); 
            // InternalMyDsl.g:769:3: ( rule__ReactDependencies__Group__0 )
            // InternalMyDsl.g:769:4: rule__ReactDependencies__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReactDependencies__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReactDependenciesAccess().getGroup()); 

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
    // $ANTLR end "ruleReactDependencies"


    // $ANTLR start "entryRuleReactDependenciesRules"
    // InternalMyDsl.g:778:1: entryRuleReactDependenciesRules : ruleReactDependenciesRules EOF ;
    public final void entryRuleReactDependenciesRules() throws RecognitionException {
        try {
            // InternalMyDsl.g:779:1: ( ruleReactDependenciesRules EOF )
            // InternalMyDsl.g:780:1: ruleReactDependenciesRules EOF
            {
             before(grammarAccess.getReactDependenciesRulesRule()); 
            pushFollow(FOLLOW_1);
            ruleReactDependenciesRules();

            state._fsp--;

             after(grammarAccess.getReactDependenciesRulesRule()); 
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
    // $ANTLR end "entryRuleReactDependenciesRules"


    // $ANTLR start "ruleReactDependenciesRules"
    // InternalMyDsl.g:787:1: ruleReactDependenciesRules : ( ( rule__ReactDependenciesRules__Group__0 ) ) ;
    public final void ruleReactDependenciesRules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:791:2: ( ( ( rule__ReactDependenciesRules__Group__0 ) ) )
            // InternalMyDsl.g:792:2: ( ( rule__ReactDependenciesRules__Group__0 ) )
            {
            // InternalMyDsl.g:792:2: ( ( rule__ReactDependenciesRules__Group__0 ) )
            // InternalMyDsl.g:793:3: ( rule__ReactDependenciesRules__Group__0 )
            {
             before(grammarAccess.getReactDependenciesRulesAccess().getGroup()); 
            // InternalMyDsl.g:794:3: ( rule__ReactDependenciesRules__Group__0 )
            // InternalMyDsl.g:794:4: rule__ReactDependenciesRules__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReactDependenciesRules__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReactDependenciesRulesAccess().getGroup()); 

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
    // $ANTLR end "ruleReactDependenciesRules"


    // $ANTLR start "entryRuleReactDependenciesSubRules"
    // InternalMyDsl.g:803:1: entryRuleReactDependenciesSubRules : ruleReactDependenciesSubRules EOF ;
    public final void entryRuleReactDependenciesSubRules() throws RecognitionException {
        try {
            // InternalMyDsl.g:804:1: ( ruleReactDependenciesSubRules EOF )
            // InternalMyDsl.g:805:1: ruleReactDependenciesSubRules EOF
            {
             before(grammarAccess.getReactDependenciesSubRulesRule()); 
            pushFollow(FOLLOW_1);
            ruleReactDependenciesSubRules();

            state._fsp--;

             after(grammarAccess.getReactDependenciesSubRulesRule()); 
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
    // $ANTLR end "entryRuleReactDependenciesSubRules"


    // $ANTLR start "ruleReactDependenciesSubRules"
    // InternalMyDsl.g:812:1: ruleReactDependenciesSubRules : ( ( rule__ReactDependenciesSubRules__DependenciesAssignment ) ) ;
    public final void ruleReactDependenciesSubRules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:816:2: ( ( ( rule__ReactDependenciesSubRules__DependenciesAssignment ) ) )
            // InternalMyDsl.g:817:2: ( ( rule__ReactDependenciesSubRules__DependenciesAssignment ) )
            {
            // InternalMyDsl.g:817:2: ( ( rule__ReactDependenciesSubRules__DependenciesAssignment ) )
            // InternalMyDsl.g:818:3: ( rule__ReactDependenciesSubRules__DependenciesAssignment )
            {
             before(grammarAccess.getReactDependenciesSubRulesAccess().getDependenciesAssignment()); 
            // InternalMyDsl.g:819:3: ( rule__ReactDependenciesSubRules__DependenciesAssignment )
            // InternalMyDsl.g:819:4: rule__ReactDependenciesSubRules__DependenciesAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ReactDependenciesSubRules__DependenciesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getReactDependenciesSubRulesAccess().getDependenciesAssignment()); 

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
    // $ANTLR end "ruleReactDependenciesSubRules"


    // $ANTLR start "entryRuleSingleDependencies"
    // InternalMyDsl.g:828:1: entryRuleSingleDependencies : ruleSingleDependencies EOF ;
    public final void entryRuleSingleDependencies() throws RecognitionException {
        try {
            // InternalMyDsl.g:829:1: ( ruleSingleDependencies EOF )
            // InternalMyDsl.g:830:1: ruleSingleDependencies EOF
            {
             before(grammarAccess.getSingleDependenciesRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleDependencies();

            state._fsp--;

             after(grammarAccess.getSingleDependenciesRule()); 
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
    // $ANTLR end "entryRuleSingleDependencies"


    // $ANTLR start "ruleSingleDependencies"
    // InternalMyDsl.g:837:1: ruleSingleDependencies : ( ( rule__SingleDependencies__Group__0 ) ) ;
    public final void ruleSingleDependencies() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:841:2: ( ( ( rule__SingleDependencies__Group__0 ) ) )
            // InternalMyDsl.g:842:2: ( ( rule__SingleDependencies__Group__0 ) )
            {
            // InternalMyDsl.g:842:2: ( ( rule__SingleDependencies__Group__0 ) )
            // InternalMyDsl.g:843:3: ( rule__SingleDependencies__Group__0 )
            {
             before(grammarAccess.getSingleDependenciesAccess().getGroup()); 
            // InternalMyDsl.g:844:3: ( rule__SingleDependencies__Group__0 )
            // InternalMyDsl.g:844:4: rule__SingleDependencies__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SingleDependencies__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleDependenciesAccess().getGroup()); 

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
    // $ANTLR end "ruleSingleDependencies"


    // $ANTLR start "entryRulePackageName"
    // InternalMyDsl.g:853:1: entryRulePackageName : rulePackageName EOF ;
    public final void entryRulePackageName() throws RecognitionException {
        try {
            // InternalMyDsl.g:854:1: ( rulePackageName EOF )
            // InternalMyDsl.g:855:1: rulePackageName EOF
            {
             before(grammarAccess.getPackageNameRule()); 
            pushFollow(FOLLOW_1);
            rulePackageName();

            state._fsp--;

             after(grammarAccess.getPackageNameRule()); 
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
    // $ANTLR end "entryRulePackageName"


    // $ANTLR start "rulePackageName"
    // InternalMyDsl.g:862:1: rulePackageName : ( ( rule__PackageName__Group__0 ) ) ;
    public final void rulePackageName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:2: ( ( ( rule__PackageName__Group__0 ) ) )
            // InternalMyDsl.g:867:2: ( ( rule__PackageName__Group__0 ) )
            {
            // InternalMyDsl.g:867:2: ( ( rule__PackageName__Group__0 ) )
            // InternalMyDsl.g:868:3: ( rule__PackageName__Group__0 )
            {
             before(grammarAccess.getPackageNameAccess().getGroup()); 
            // InternalMyDsl.g:869:3: ( rule__PackageName__Group__0 )
            // InternalMyDsl.g:869:4: rule__PackageName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PackageName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageNameAccess().getGroup()); 

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
    // $ANTLR end "rulePackageName"


    // $ANTLR start "entryRulePackageVersion"
    // InternalMyDsl.g:878:1: entryRulePackageVersion : rulePackageVersion EOF ;
    public final void entryRulePackageVersion() throws RecognitionException {
        try {
            // InternalMyDsl.g:879:1: ( rulePackageVersion EOF )
            // InternalMyDsl.g:880:1: rulePackageVersion EOF
            {
             before(grammarAccess.getPackageVersionRule()); 
            pushFollow(FOLLOW_1);
            rulePackageVersion();

            state._fsp--;

             after(grammarAccess.getPackageVersionRule()); 
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
    // $ANTLR end "entryRulePackageVersion"


    // $ANTLR start "rulePackageVersion"
    // InternalMyDsl.g:887:1: rulePackageVersion : ( ( rule__PackageVersion__Group__0 ) ) ;
    public final void rulePackageVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:2: ( ( ( rule__PackageVersion__Group__0 ) ) )
            // InternalMyDsl.g:892:2: ( ( rule__PackageVersion__Group__0 ) )
            {
            // InternalMyDsl.g:892:2: ( ( rule__PackageVersion__Group__0 ) )
            // InternalMyDsl.g:893:3: ( rule__PackageVersion__Group__0 )
            {
             before(grammarAccess.getPackageVersionAccess().getGroup()); 
            // InternalMyDsl.g:894:3: ( rule__PackageVersion__Group__0 )
            // InternalMyDsl.g:894:4: rule__PackageVersion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PackageVersion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageVersionAccess().getGroup()); 

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
    // $ANTLR end "rulePackageVersion"


    // $ANTLR start "entryRuleReactConfigurations"
    // InternalMyDsl.g:903:1: entryRuleReactConfigurations : ruleReactConfigurations EOF ;
    public final void entryRuleReactConfigurations() throws RecognitionException {
        try {
            // InternalMyDsl.g:904:1: ( ruleReactConfigurations EOF )
            // InternalMyDsl.g:905:1: ruleReactConfigurations EOF
            {
             before(grammarAccess.getReactConfigurationsRule()); 
            pushFollow(FOLLOW_1);
            ruleReactConfigurations();

            state._fsp--;

             after(grammarAccess.getReactConfigurationsRule()); 
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
    // $ANTLR end "entryRuleReactConfigurations"


    // $ANTLR start "ruleReactConfigurations"
    // InternalMyDsl.g:912:1: ruleReactConfigurations : ( ( rule__ReactConfigurations__Group__0 ) ) ;
    public final void ruleReactConfigurations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:916:2: ( ( ( rule__ReactConfigurations__Group__0 ) ) )
            // InternalMyDsl.g:917:2: ( ( rule__ReactConfigurations__Group__0 ) )
            {
            // InternalMyDsl.g:917:2: ( ( rule__ReactConfigurations__Group__0 ) )
            // InternalMyDsl.g:918:3: ( rule__ReactConfigurations__Group__0 )
            {
             before(grammarAccess.getReactConfigurationsAccess().getGroup()); 
            // InternalMyDsl.g:919:3: ( rule__ReactConfigurations__Group__0 )
            // InternalMyDsl.g:919:4: rule__ReactConfigurations__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReactConfigurations__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReactConfigurationsAccess().getGroup()); 

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
    // $ANTLR end "ruleReactConfigurations"


    // $ANTLR start "entryRuleReactComponents"
    // InternalMyDsl.g:928:1: entryRuleReactComponents : ruleReactComponents EOF ;
    public final void entryRuleReactComponents() throws RecognitionException {
        try {
            // InternalMyDsl.g:929:1: ( ruleReactComponents EOF )
            // InternalMyDsl.g:930:1: ruleReactComponents EOF
            {
             before(grammarAccess.getReactComponentsRule()); 
            pushFollow(FOLLOW_1);
            ruleReactComponents();

            state._fsp--;

             after(grammarAccess.getReactComponentsRule()); 
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
    // $ANTLR end "entryRuleReactComponents"


    // $ANTLR start "ruleReactComponents"
    // InternalMyDsl.g:937:1: ruleReactComponents : ( ( rule__ReactComponents__Group__0 ) ) ;
    public final void ruleReactComponents() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:941:2: ( ( ( rule__ReactComponents__Group__0 ) ) )
            // InternalMyDsl.g:942:2: ( ( rule__ReactComponents__Group__0 ) )
            {
            // InternalMyDsl.g:942:2: ( ( rule__ReactComponents__Group__0 ) )
            // InternalMyDsl.g:943:3: ( rule__ReactComponents__Group__0 )
            {
             before(grammarAccess.getReactComponentsAccess().getGroup()); 
            // InternalMyDsl.g:944:3: ( rule__ReactComponents__Group__0 )
            // InternalMyDsl.g:944:4: rule__ReactComponents__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReactComponents__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReactComponentsAccess().getGroup()); 

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
    // $ANTLR end "ruleReactComponents"


    // $ANTLR start "entryRuleComponentsLogic"
    // InternalMyDsl.g:953:1: entryRuleComponentsLogic : ruleComponentsLogic EOF ;
    public final void entryRuleComponentsLogic() throws RecognitionException {
        try {
            // InternalMyDsl.g:954:1: ( ruleComponentsLogic EOF )
            // InternalMyDsl.g:955:1: ruleComponentsLogic EOF
            {
             before(grammarAccess.getComponentsLogicRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentsLogic();

            state._fsp--;

             after(grammarAccess.getComponentsLogicRule()); 
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
    // $ANTLR end "entryRuleComponentsLogic"


    // $ANTLR start "ruleComponentsLogic"
    // InternalMyDsl.g:962:1: ruleComponentsLogic : ( ( rule__ComponentsLogic__Group__0 ) ) ;
    public final void ruleComponentsLogic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:966:2: ( ( ( rule__ComponentsLogic__Group__0 ) ) )
            // InternalMyDsl.g:967:2: ( ( rule__ComponentsLogic__Group__0 ) )
            {
            // InternalMyDsl.g:967:2: ( ( rule__ComponentsLogic__Group__0 ) )
            // InternalMyDsl.g:968:3: ( rule__ComponentsLogic__Group__0 )
            {
             before(grammarAccess.getComponentsLogicAccess().getGroup()); 
            // InternalMyDsl.g:969:3: ( rule__ComponentsLogic__Group__0 )
            // InternalMyDsl.g:969:4: rule__ComponentsLogic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentsLogic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentsLogicAccess().getGroup()); 

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
    // $ANTLR end "ruleComponentsLogic"


    // $ANTLR start "entryRuleComponentsUI"
    // InternalMyDsl.g:978:1: entryRuleComponentsUI : ruleComponentsUI EOF ;
    public final void entryRuleComponentsUI() throws RecognitionException {
        try {
            // InternalMyDsl.g:979:1: ( ruleComponentsUI EOF )
            // InternalMyDsl.g:980:1: ruleComponentsUI EOF
            {
             before(grammarAccess.getComponentsUIRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentsUI();

            state._fsp--;

             after(grammarAccess.getComponentsUIRule()); 
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
    // $ANTLR end "entryRuleComponentsUI"


    // $ANTLR start "ruleComponentsUI"
    // InternalMyDsl.g:987:1: ruleComponentsUI : ( ( rule__ComponentsUI__Group__0 ) ) ;
    public final void ruleComponentsUI() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:991:2: ( ( ( rule__ComponentsUI__Group__0 ) ) )
            // InternalMyDsl.g:992:2: ( ( rule__ComponentsUI__Group__0 ) )
            {
            // InternalMyDsl.g:992:2: ( ( rule__ComponentsUI__Group__0 ) )
            // InternalMyDsl.g:993:3: ( rule__ComponentsUI__Group__0 )
            {
             before(grammarAccess.getComponentsUIAccess().getGroup()); 
            // InternalMyDsl.g:994:3: ( rule__ComponentsUI__Group__0 )
            // InternalMyDsl.g:994:4: rule__ComponentsUI__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentsUI__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentsUIAccess().getGroup()); 

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
    // $ANTLR end "ruleComponentsUI"


    // $ANTLR start "entryRuleReactActions"
    // InternalMyDsl.g:1003:1: entryRuleReactActions : ruleReactActions EOF ;
    public final void entryRuleReactActions() throws RecognitionException {
        try {
            // InternalMyDsl.g:1004:1: ( ruleReactActions EOF )
            // InternalMyDsl.g:1005:1: ruleReactActions EOF
            {
             before(grammarAccess.getReactActionsRule()); 
            pushFollow(FOLLOW_1);
            ruleReactActions();

            state._fsp--;

             after(grammarAccess.getReactActionsRule()); 
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
    // $ANTLR end "entryRuleReactActions"


    // $ANTLR start "ruleReactActions"
    // InternalMyDsl.g:1012:1: ruleReactActions : ( ( rule__ReactActions__Group__0 ) ) ;
    public final void ruleReactActions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1016:2: ( ( ( rule__ReactActions__Group__0 ) ) )
            // InternalMyDsl.g:1017:2: ( ( rule__ReactActions__Group__0 ) )
            {
            // InternalMyDsl.g:1017:2: ( ( rule__ReactActions__Group__0 ) )
            // InternalMyDsl.g:1018:3: ( rule__ReactActions__Group__0 )
            {
             before(grammarAccess.getReactActionsAccess().getGroup()); 
            // InternalMyDsl.g:1019:3: ( rule__ReactActions__Group__0 )
            // InternalMyDsl.g:1019:4: rule__ReactActions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReactActions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReactActionsAccess().getGroup()); 

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
    // $ANTLR end "ruleReactActions"


    // $ANTLR start "entryRuleReactLibraries"
    // InternalMyDsl.g:1028:1: entryRuleReactLibraries : ruleReactLibraries EOF ;
    public final void entryRuleReactLibraries() throws RecognitionException {
        try {
            // InternalMyDsl.g:1029:1: ( ruleReactLibraries EOF )
            // InternalMyDsl.g:1030:1: ruleReactLibraries EOF
            {
             before(grammarAccess.getReactLibrariesRule()); 
            pushFollow(FOLLOW_1);
            ruleReactLibraries();

            state._fsp--;

             after(grammarAccess.getReactLibrariesRule()); 
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
    // $ANTLR end "entryRuleReactLibraries"


    // $ANTLR start "ruleReactLibraries"
    // InternalMyDsl.g:1037:1: ruleReactLibraries : ( ( rule__ReactLibraries__Group__0 ) ) ;
    public final void ruleReactLibraries() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1041:2: ( ( ( rule__ReactLibraries__Group__0 ) ) )
            // InternalMyDsl.g:1042:2: ( ( rule__ReactLibraries__Group__0 ) )
            {
            // InternalMyDsl.g:1042:2: ( ( rule__ReactLibraries__Group__0 ) )
            // InternalMyDsl.g:1043:3: ( rule__ReactLibraries__Group__0 )
            {
             before(grammarAccess.getReactLibrariesAccess().getGroup()); 
            // InternalMyDsl.g:1044:3: ( rule__ReactLibraries__Group__0 )
            // InternalMyDsl.g:1044:4: rule__ReactLibraries__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReactLibraries__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReactLibrariesAccess().getGroup()); 

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
    // $ANTLR end "ruleReactLibraries"


    // $ANTLR start "entryRuleReactInfo"
    // InternalMyDsl.g:1053:1: entryRuleReactInfo : ruleReactInfo EOF ;
    public final void entryRuleReactInfo() throws RecognitionException {
        try {
            // InternalMyDsl.g:1054:1: ( ruleReactInfo EOF )
            // InternalMyDsl.g:1055:1: ruleReactInfo EOF
            {
             before(grammarAccess.getReactInfoRule()); 
            pushFollow(FOLLOW_1);
            ruleReactInfo();

            state._fsp--;

             after(grammarAccess.getReactInfoRule()); 
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
    // $ANTLR end "entryRuleReactInfo"


    // $ANTLR start "ruleReactInfo"
    // InternalMyDsl.g:1062:1: ruleReactInfo : ( ( rule__ReactInfo__Group__0 ) ) ;
    public final void ruleReactInfo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1066:2: ( ( ( rule__ReactInfo__Group__0 ) ) )
            // InternalMyDsl.g:1067:2: ( ( rule__ReactInfo__Group__0 ) )
            {
            // InternalMyDsl.g:1067:2: ( ( rule__ReactInfo__Group__0 ) )
            // InternalMyDsl.g:1068:3: ( rule__ReactInfo__Group__0 )
            {
             before(grammarAccess.getReactInfoAccess().getGroup()); 
            // InternalMyDsl.g:1069:3: ( rule__ReactInfo__Group__0 )
            // InternalMyDsl.g:1069:4: rule__ReactInfo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReactInfo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReactInfoAccess().getGroup()); 

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
    // $ANTLR end "ruleReactInfo"


    // $ANTLR start "entryRuleSpring"
    // InternalMyDsl.g:1078:1: entryRuleSpring : ruleSpring EOF ;
    public final void entryRuleSpring() throws RecognitionException {
        try {
            // InternalMyDsl.g:1079:1: ( ruleSpring EOF )
            // InternalMyDsl.g:1080:1: ruleSpring EOF
            {
             before(grammarAccess.getSpringRule()); 
            pushFollow(FOLLOW_1);
            ruleSpring();

            state._fsp--;

             after(grammarAccess.getSpringRule()); 
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
    // $ANTLR end "entryRuleSpring"


    // $ANTLR start "ruleSpring"
    // InternalMyDsl.g:1087:1: ruleSpring : ( ( rule__Spring__Group__0 ) ) ;
    public final void ruleSpring() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1091:2: ( ( ( rule__Spring__Group__0 ) ) )
            // InternalMyDsl.g:1092:2: ( ( rule__Spring__Group__0 ) )
            {
            // InternalMyDsl.g:1092:2: ( ( rule__Spring__Group__0 ) )
            // InternalMyDsl.g:1093:3: ( rule__Spring__Group__0 )
            {
             before(grammarAccess.getSpringAccess().getGroup()); 
            // InternalMyDsl.g:1094:3: ( rule__Spring__Group__0 )
            // InternalMyDsl.g:1094:4: rule__Spring__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Spring__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpringAccess().getGroup()); 

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
    // $ANTLR end "ruleSpring"


    // $ANTLR start "entryRulePostgreSQL"
    // InternalMyDsl.g:1103:1: entryRulePostgreSQL : rulePostgreSQL EOF ;
    public final void entryRulePostgreSQL() throws RecognitionException {
        try {
            // InternalMyDsl.g:1104:1: ( rulePostgreSQL EOF )
            // InternalMyDsl.g:1105:1: rulePostgreSQL EOF
            {
             before(grammarAccess.getPostgreSQLRule()); 
            pushFollow(FOLLOW_1);
            rulePostgreSQL();

            state._fsp--;

             after(grammarAccess.getPostgreSQLRule()); 
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
    // $ANTLR end "entryRulePostgreSQL"


    // $ANTLR start "rulePostgreSQL"
    // InternalMyDsl.g:1112:1: rulePostgreSQL : ( ( rule__PostgreSQL__Group__0 ) ) ;
    public final void rulePostgreSQL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1116:2: ( ( ( rule__PostgreSQL__Group__0 ) ) )
            // InternalMyDsl.g:1117:2: ( ( rule__PostgreSQL__Group__0 ) )
            {
            // InternalMyDsl.g:1117:2: ( ( rule__PostgreSQL__Group__0 ) )
            // InternalMyDsl.g:1118:3: ( rule__PostgreSQL__Group__0 )
            {
             before(grammarAccess.getPostgreSQLAccess().getGroup()); 
            // InternalMyDsl.g:1119:3: ( rule__PostgreSQL__Group__0 )
            // InternalMyDsl.g:1119:4: rule__PostgreSQL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PostgreSQL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPostgreSQLAccess().getGroup()); 

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
    // $ANTLR end "rulePostgreSQL"


    // $ANTLR start "entryRuleAmazonWebServices"
    // InternalMyDsl.g:1128:1: entryRuleAmazonWebServices : ruleAmazonWebServices EOF ;
    public final void entryRuleAmazonWebServices() throws RecognitionException {
        try {
            // InternalMyDsl.g:1129:1: ( ruleAmazonWebServices EOF )
            // InternalMyDsl.g:1130:1: ruleAmazonWebServices EOF
            {
             before(grammarAccess.getAmazonWebServicesRule()); 
            pushFollow(FOLLOW_1);
            ruleAmazonWebServices();

            state._fsp--;

             after(grammarAccess.getAmazonWebServicesRule()); 
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
    // $ANTLR end "entryRuleAmazonWebServices"


    // $ANTLR start "ruleAmazonWebServices"
    // InternalMyDsl.g:1137:1: ruleAmazonWebServices : ( ( rule__AmazonWebServices__Group__0 ) ) ;
    public final void ruleAmazonWebServices() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1141:2: ( ( ( rule__AmazonWebServices__Group__0 ) ) )
            // InternalMyDsl.g:1142:2: ( ( rule__AmazonWebServices__Group__0 ) )
            {
            // InternalMyDsl.g:1142:2: ( ( rule__AmazonWebServices__Group__0 ) )
            // InternalMyDsl.g:1143:3: ( rule__AmazonWebServices__Group__0 )
            {
             before(grammarAccess.getAmazonWebServicesAccess().getGroup()); 
            // InternalMyDsl.g:1144:3: ( rule__AmazonWebServices__Group__0 )
            // InternalMyDsl.g:1144:4: rule__AmazonWebServices__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AmazonWebServices__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAmazonWebServicesAccess().getGroup()); 

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
    // $ANTLR end "ruleAmazonWebServices"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMyDsl.g:1152:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1156:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyDsl.g:1157:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalMyDsl.g:1164:1: rule__Model__Group__0__Impl : ( 'System' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1168:1: ( ( 'System' ) )
            // InternalMyDsl.g:1169:1: ( 'System' )
            {
            // InternalMyDsl.g:1169:1: ( 'System' )
            // InternalMyDsl.g:1170:2: 'System'
            {
             before(grammarAccess.getModelAccess().getSystemKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getSystemKeyword_0()); 

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
    // InternalMyDsl.g:1179:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1183:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalMyDsl.g:1184:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalMyDsl.g:1191:1: rule__Model__Group__1__Impl : ( ':' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1195:1: ( ( ':' ) )
            // InternalMyDsl.g:1196:1: ( ':' )
            {
            // InternalMyDsl.g:1196:1: ( ':' )
            // InternalMyDsl.g:1197:2: ':'
            {
             before(grammarAccess.getModelAccess().getColonKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getColonKeyword_1()); 

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
    // InternalMyDsl.g:1206:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1210:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalMyDsl.g:1211:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

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
    // InternalMyDsl.g:1218:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1222:1: ( ( '{' ) )
            // InternalMyDsl.g:1223:1: ( '{' )
            {
            // InternalMyDsl.g:1223:1: ( '{' )
            // InternalMyDsl.g:1224:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 

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


    // $ANTLR start "rule__Model__Group__3"
    // InternalMyDsl.g:1233:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1237:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalMyDsl.g:1238:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalMyDsl.g:1245:1: rule__Model__Group__3__Impl : ( ( rule__Model__ElementsAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1249:1: ( ( ( rule__Model__ElementsAssignment_3 ) ) )
            // InternalMyDsl.g:1250:1: ( ( rule__Model__ElementsAssignment_3 ) )
            {
            // InternalMyDsl.g:1250:1: ( ( rule__Model__ElementsAssignment_3 ) )
            // InternalMyDsl.g:1251:2: ( rule__Model__ElementsAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_3()); 
            // InternalMyDsl.g:1252:2: ( rule__Model__ElementsAssignment_3 )
            // InternalMyDsl.g:1252:3: rule__Model__ElementsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Model__ElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementsAssignment_3()); 

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalMyDsl.g:1260:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1264:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalMyDsl.g:1265:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalMyDsl.g:1272:1: rule__Model__Group__4__Impl : ( ( rule__Model__ElementsAssignment_4 ) ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1276:1: ( ( ( rule__Model__ElementsAssignment_4 ) ) )
            // InternalMyDsl.g:1277:1: ( ( rule__Model__ElementsAssignment_4 ) )
            {
            // InternalMyDsl.g:1277:1: ( ( rule__Model__ElementsAssignment_4 ) )
            // InternalMyDsl.g:1278:2: ( rule__Model__ElementsAssignment_4 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_4()); 
            // InternalMyDsl.g:1279:2: ( rule__Model__ElementsAssignment_4 )
            // InternalMyDsl.g:1279:3: rule__Model__ElementsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Model__ElementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementsAssignment_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalMyDsl.g:1287:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1291:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalMyDsl.g:1292:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__6();

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
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalMyDsl.g:1299:1: rule__Model__Group__5__Impl : ( ( rule__Model__ElementsAssignment_5 ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1303:1: ( ( ( rule__Model__ElementsAssignment_5 ) ) )
            // InternalMyDsl.g:1304:1: ( ( rule__Model__ElementsAssignment_5 ) )
            {
            // InternalMyDsl.g:1304:1: ( ( rule__Model__ElementsAssignment_5 ) )
            // InternalMyDsl.g:1305:2: ( rule__Model__ElementsAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_5()); 
            // InternalMyDsl.g:1306:2: ( rule__Model__ElementsAssignment_5 )
            // InternalMyDsl.g:1306:3: rule__Model__ElementsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Model__ElementsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementsAssignment_5()); 

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
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // InternalMyDsl.g:1314:1: rule__Model__Group__6 : rule__Model__Group__6__Impl ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1318:1: ( rule__Model__Group__6__Impl )
            // InternalMyDsl.g:1319:2: rule__Model__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__6__Impl();

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
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // InternalMyDsl.g:1325:1: rule__Model__Group__6__Impl : ( '}' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1329:1: ( ( '}' ) )
            // InternalMyDsl.g:1330:1: ( '}' )
            {
            // InternalMyDsl.g:1330:1: ( '}' )
            // InternalMyDsl.g:1331:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Domain__Group__0"
    // InternalMyDsl.g:1341:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1345:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalMyDsl.g:1346:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1353:1: rule__Domain__Group__0__Impl : ( 'Domain' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1357:1: ( ( 'Domain' ) )
            // InternalMyDsl.g:1358:1: ( 'Domain' )
            {
            // InternalMyDsl.g:1358:1: ( 'Domain' )
            // InternalMyDsl.g:1359:2: 'Domain'
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
    // InternalMyDsl.g:1368:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1372:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // InternalMyDsl.g:1373:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:1380:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__NameAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1384:1: ( ( ( rule__Domain__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1385:1: ( ( rule__Domain__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1385:1: ( ( rule__Domain__NameAssignment_1 ) )
            // InternalMyDsl.g:1386:2: ( rule__Domain__NameAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1387:2: ( rule__Domain__NameAssignment_1 )
            // InternalMyDsl.g:1387:3: rule__Domain__NameAssignment_1
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
    // InternalMyDsl.g:1395:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1399:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // InternalMyDsl.g:1400:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1407:1: rule__Domain__Group__2__Impl : ( ':' ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1411:1: ( ( ':' ) )
            // InternalMyDsl.g:1412:1: ( ':' )
            {
            // InternalMyDsl.g:1412:1: ( ':' )
            // InternalMyDsl.g:1413:2: ':'
            {
             before(grammarAccess.getDomainAccess().getColonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getColonKeyword_2()); 

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
    // InternalMyDsl.g:1422:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl rule__Domain__Group__4 ;
    public final void rule__Domain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1426:1: ( rule__Domain__Group__3__Impl rule__Domain__Group__4 )
            // InternalMyDsl.g:1427:2: rule__Domain__Group__3__Impl rule__Domain__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1434:1: rule__Domain__Group__3__Impl : ( '{' ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1438:1: ( ( '{' ) )
            // InternalMyDsl.g:1439:1: ( '{' )
            {
            // InternalMyDsl.g:1439:1: ( '{' )
            // InternalMyDsl.g:1440:2: '{'
            {
             before(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_3()); 

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
    // InternalMyDsl.g:1449:1: rule__Domain__Group__4 : rule__Domain__Group__4__Impl rule__Domain__Group__5 ;
    public final void rule__Domain__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1453:1: ( rule__Domain__Group__4__Impl rule__Domain__Group__5 )
            // InternalMyDsl.g:1454:2: rule__Domain__Group__4__Impl rule__Domain__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:1461:1: rule__Domain__Group__4__Impl : ( ( rule__Domain__ElementsAssignment_4 ) ) ;
    public final void rule__Domain__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1465:1: ( ( ( rule__Domain__ElementsAssignment_4 ) ) )
            // InternalMyDsl.g:1466:1: ( ( rule__Domain__ElementsAssignment_4 ) )
            {
            // InternalMyDsl.g:1466:1: ( ( rule__Domain__ElementsAssignment_4 ) )
            // InternalMyDsl.g:1467:2: ( rule__Domain__ElementsAssignment_4 )
            {
             before(grammarAccess.getDomainAccess().getElementsAssignment_4()); 
            // InternalMyDsl.g:1468:2: ( rule__Domain__ElementsAssignment_4 )
            // InternalMyDsl.g:1468:3: rule__Domain__ElementsAssignment_4
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
    // InternalMyDsl.g:1476:1: rule__Domain__Group__5 : rule__Domain__Group__5__Impl rule__Domain__Group__6 ;
    public final void rule__Domain__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1480:1: ( rule__Domain__Group__5__Impl rule__Domain__Group__6 )
            // InternalMyDsl.g:1481:2: rule__Domain__Group__5__Impl rule__Domain__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Domain__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__6();

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
    // InternalMyDsl.g:1488:1: rule__Domain__Group__5__Impl : ( ( rule__Domain__ElementsAssignment_5 ) ) ;
    public final void rule__Domain__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1492:1: ( ( ( rule__Domain__ElementsAssignment_5 ) ) )
            // InternalMyDsl.g:1493:1: ( ( rule__Domain__ElementsAssignment_5 ) )
            {
            // InternalMyDsl.g:1493:1: ( ( rule__Domain__ElementsAssignment_5 ) )
            // InternalMyDsl.g:1494:2: ( rule__Domain__ElementsAssignment_5 )
            {
             before(grammarAccess.getDomainAccess().getElementsAssignment_5()); 
            // InternalMyDsl.g:1495:2: ( rule__Domain__ElementsAssignment_5 )
            // InternalMyDsl.g:1495:3: rule__Domain__ElementsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Domain__ElementsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getElementsAssignment_5()); 

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


    // $ANTLR start "rule__Domain__Group__6"
    // InternalMyDsl.g:1503:1: rule__Domain__Group__6 : rule__Domain__Group__6__Impl rule__Domain__Group__7 ;
    public final void rule__Domain__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1507:1: ( rule__Domain__Group__6__Impl rule__Domain__Group__7 )
            // InternalMyDsl.g:1508:2: rule__Domain__Group__6__Impl rule__Domain__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Domain__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__7();

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
    // $ANTLR end "rule__Domain__Group__6"


    // $ANTLR start "rule__Domain__Group__6__Impl"
    // InternalMyDsl.g:1515:1: rule__Domain__Group__6__Impl : ( ( rule__Domain__ElementsAssignment_6 ) ) ;
    public final void rule__Domain__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1519:1: ( ( ( rule__Domain__ElementsAssignment_6 ) ) )
            // InternalMyDsl.g:1520:1: ( ( rule__Domain__ElementsAssignment_6 ) )
            {
            // InternalMyDsl.g:1520:1: ( ( rule__Domain__ElementsAssignment_6 ) )
            // InternalMyDsl.g:1521:2: ( rule__Domain__ElementsAssignment_6 )
            {
             before(grammarAccess.getDomainAccess().getElementsAssignment_6()); 
            // InternalMyDsl.g:1522:2: ( rule__Domain__ElementsAssignment_6 )
            // InternalMyDsl.g:1522:3: rule__Domain__ElementsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Domain__ElementsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getElementsAssignment_6()); 

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
    // $ANTLR end "rule__Domain__Group__6__Impl"


    // $ANTLR start "rule__Domain__Group__7"
    // InternalMyDsl.g:1530:1: rule__Domain__Group__7 : rule__Domain__Group__7__Impl ;
    public final void rule__Domain__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1534:1: ( rule__Domain__Group__7__Impl )
            // InternalMyDsl.g:1535:2: rule__Domain__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group__7__Impl();

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
    // $ANTLR end "rule__Domain__Group__7"


    // $ANTLR start "rule__Domain__Group__7__Impl"
    // InternalMyDsl.g:1541:1: rule__Domain__Group__7__Impl : ( '}' ) ;
    public final void rule__Domain__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1545:1: ( ( '}' ) )
            // InternalMyDsl.g:1546:1: ( '}' )
            {
            // InternalMyDsl.g:1546:1: ( '}' )
            // InternalMyDsl.g:1547:2: '}'
            {
             before(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Domain__Group__7__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalMyDsl.g:1557:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1561:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalMyDsl.g:1562:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:1569:1: rule__Entity__Group__0__Impl : ( 'Entities' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1573:1: ( ( 'Entities' ) )
            // InternalMyDsl.g:1574:1: ( 'Entities' )
            {
            // InternalMyDsl.g:1574:1: ( 'Entities' )
            // InternalMyDsl.g:1575:2: 'Entities'
            {
             before(grammarAccess.getEntityAccess().getEntitiesKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:1584:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1588:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalMyDsl.g:1589:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // InternalMyDsl.g:1596:1: rule__Entity__Group__1__Impl : ( ':' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1600:1: ( ( ':' ) )
            // InternalMyDsl.g:1601:1: ( ':' )
            {
            // InternalMyDsl.g:1601:1: ( ':' )
            // InternalMyDsl.g:1602:2: ':'
            {
             before(grammarAccess.getEntityAccess().getColonKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getColonKeyword_1()); 

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


    // $ANTLR start "rule__Entity__Group__2"
    // InternalMyDsl.g:1611:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1615:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalMyDsl.g:1616:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalMyDsl.g:1623:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1627:1: ( ( '{' ) )
            // InternalMyDsl.g:1628:1: ( '{' )
            {
            // InternalMyDsl.g:1628:1: ( '{' )
            // InternalMyDsl.g:1629:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalMyDsl.g:1638:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1642:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalMyDsl.g:1643:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalMyDsl.g:1650:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__ElementsAssignment_3 ) ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1654:1: ( ( ( rule__Entity__ElementsAssignment_3 ) ) )
            // InternalMyDsl.g:1655:1: ( ( rule__Entity__ElementsAssignment_3 ) )
            {
            // InternalMyDsl.g:1655:1: ( ( rule__Entity__ElementsAssignment_3 ) )
            // InternalMyDsl.g:1656:2: ( rule__Entity__ElementsAssignment_3 )
            {
             before(grammarAccess.getEntityAccess().getElementsAssignment_3()); 
            // InternalMyDsl.g:1657:2: ( rule__Entity__ElementsAssignment_3 )
            // InternalMyDsl.g:1657:3: rule__Entity__ElementsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Entity__ElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getElementsAssignment_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalMyDsl.g:1665:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1669:1: ( rule__Entity__Group__4__Impl )
            // InternalMyDsl.g:1670:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__4__Impl();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalMyDsl.g:1676:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1680:1: ( ( '}' ) )
            // InternalMyDsl.g:1681:1: ( '}' )
            {
            // InternalMyDsl.g:1681:1: ( '}' )
            // InternalMyDsl.g:1682:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entities__Group__0"
    // InternalMyDsl.g:1692:1: rule__Entities__Group__0 : rule__Entities__Group__0__Impl rule__Entities__Group__1 ;
    public final void rule__Entities__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1696:1: ( rule__Entities__Group__0__Impl rule__Entities__Group__1 )
            // InternalMyDsl.g:1697:2: rule__Entities__Group__0__Impl rule__Entities__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1704:1: rule__Entities__Group__0__Impl : ( ( rule__Entities__ElementsAssignment_0 ) ) ;
    public final void rule__Entities__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1708:1: ( ( ( rule__Entities__ElementsAssignment_0 ) ) )
            // InternalMyDsl.g:1709:1: ( ( rule__Entities__ElementsAssignment_0 ) )
            {
            // InternalMyDsl.g:1709:1: ( ( rule__Entities__ElementsAssignment_0 ) )
            // InternalMyDsl.g:1710:2: ( rule__Entities__ElementsAssignment_0 )
            {
             before(grammarAccess.getEntitiesAccess().getElementsAssignment_0()); 
            // InternalMyDsl.g:1711:2: ( rule__Entities__ElementsAssignment_0 )
            // InternalMyDsl.g:1711:3: rule__Entities__ElementsAssignment_0
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
    // InternalMyDsl.g:1719:1: rule__Entities__Group__1 : rule__Entities__Group__1__Impl rule__Entities__Group__2 ;
    public final void rule__Entities__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1723:1: ( rule__Entities__Group__1__Impl rule__Entities__Group__2 )
            // InternalMyDsl.g:1724:2: rule__Entities__Group__1__Impl rule__Entities__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1731:1: rule__Entities__Group__1__Impl : ( ( rule__Entities__ElementsAssignment_1 ) ) ;
    public final void rule__Entities__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1735:1: ( ( ( rule__Entities__ElementsAssignment_1 ) ) )
            // InternalMyDsl.g:1736:1: ( ( rule__Entities__ElementsAssignment_1 ) )
            {
            // InternalMyDsl.g:1736:1: ( ( rule__Entities__ElementsAssignment_1 ) )
            // InternalMyDsl.g:1737:2: ( rule__Entities__ElementsAssignment_1 )
            {
             before(grammarAccess.getEntitiesAccess().getElementsAssignment_1()); 
            // InternalMyDsl.g:1738:2: ( rule__Entities__ElementsAssignment_1 )
            // InternalMyDsl.g:1738:3: rule__Entities__ElementsAssignment_1
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
    // InternalMyDsl.g:1746:1: rule__Entities__Group__2 : rule__Entities__Group__2__Impl ;
    public final void rule__Entities__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1750:1: ( rule__Entities__Group__2__Impl )
            // InternalMyDsl.g:1751:2: rule__Entities__Group__2__Impl
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
    // InternalMyDsl.g:1757:1: rule__Entities__Group__2__Impl : ( ( rule__Entities__ElementsAssignment_2 ) ) ;
    public final void rule__Entities__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1761:1: ( ( ( rule__Entities__ElementsAssignment_2 ) ) )
            // InternalMyDsl.g:1762:1: ( ( rule__Entities__ElementsAssignment_2 ) )
            {
            // InternalMyDsl.g:1762:1: ( ( rule__Entities__ElementsAssignment_2 ) )
            // InternalMyDsl.g:1763:2: ( rule__Entities__ElementsAssignment_2 )
            {
             before(grammarAccess.getEntitiesAccess().getElementsAssignment_2()); 
            // InternalMyDsl.g:1764:2: ( rule__Entities__ElementsAssignment_2 )
            // InternalMyDsl.g:1764:3: rule__Entities__ElementsAssignment_2
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
    // InternalMyDsl.g:1773:1: rule__Photo__Group__0 : rule__Photo__Group__0__Impl rule__Photo__Group__1 ;
    public final void rule__Photo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1777:1: ( rule__Photo__Group__0__Impl rule__Photo__Group__1 )
            // InternalMyDsl.g:1778:2: rule__Photo__Group__0__Impl rule__Photo__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1785:1: rule__Photo__Group__0__Impl : ( 'Photo' ) ;
    public final void rule__Photo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1789:1: ( ( 'Photo' ) )
            // InternalMyDsl.g:1790:1: ( 'Photo' )
            {
            // InternalMyDsl.g:1790:1: ( 'Photo' )
            // InternalMyDsl.g:1791:2: 'Photo'
            {
             before(grammarAccess.getPhotoAccess().getPhotoKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:1800:1: rule__Photo__Group__1 : rule__Photo__Group__1__Impl ;
    public final void rule__Photo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1804:1: ( rule__Photo__Group__1__Impl )
            // InternalMyDsl.g:1805:2: rule__Photo__Group__1__Impl
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
    // InternalMyDsl.g:1811:1: rule__Photo__Group__1__Impl : ( ( rule__Photo__NameAssignment_1 ) ) ;
    public final void rule__Photo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1815:1: ( ( ( rule__Photo__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1816:1: ( ( rule__Photo__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1816:1: ( ( rule__Photo__NameAssignment_1 ) )
            // InternalMyDsl.g:1817:2: ( rule__Photo__NameAssignment_1 )
            {
             before(grammarAccess.getPhotoAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1818:2: ( rule__Photo__NameAssignment_1 )
            // InternalMyDsl.g:1818:3: rule__Photo__NameAssignment_1
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
    // InternalMyDsl.g:1827:1: rule__Album__Group__0 : rule__Album__Group__0__Impl rule__Album__Group__1 ;
    public final void rule__Album__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1831:1: ( rule__Album__Group__0__Impl rule__Album__Group__1 )
            // InternalMyDsl.g:1832:2: rule__Album__Group__0__Impl rule__Album__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1839:1: rule__Album__Group__0__Impl : ( 'Album' ) ;
    public final void rule__Album__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1843:1: ( ( 'Album' ) )
            // InternalMyDsl.g:1844:1: ( 'Album' )
            {
            // InternalMyDsl.g:1844:1: ( 'Album' )
            // InternalMyDsl.g:1845:2: 'Album'
            {
             before(grammarAccess.getAlbumAccess().getAlbumKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:1854:1: rule__Album__Group__1 : rule__Album__Group__1__Impl ;
    public final void rule__Album__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1858:1: ( rule__Album__Group__1__Impl )
            // InternalMyDsl.g:1859:2: rule__Album__Group__1__Impl
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
    // InternalMyDsl.g:1865:1: rule__Album__Group__1__Impl : ( ( rule__Album__NameAssignment_1 ) ) ;
    public final void rule__Album__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1869:1: ( ( ( rule__Album__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1870:1: ( ( rule__Album__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1870:1: ( ( rule__Album__NameAssignment_1 ) )
            // InternalMyDsl.g:1871:2: ( rule__Album__NameAssignment_1 )
            {
             before(grammarAccess.getAlbumAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1872:2: ( rule__Album__NameAssignment_1 )
            // InternalMyDsl.g:1872:3: rule__Album__NameAssignment_1
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


    // $ANTLR start "rule__UserDomain__Group__0"
    // InternalMyDsl.g:1881:1: rule__UserDomain__Group__0 : rule__UserDomain__Group__0__Impl rule__UserDomain__Group__1 ;
    public final void rule__UserDomain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1885:1: ( rule__UserDomain__Group__0__Impl rule__UserDomain__Group__1 )
            // InternalMyDsl.g:1886:2: rule__UserDomain__Group__0__Impl rule__UserDomain__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__UserDomain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserDomain__Group__1();

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
    // $ANTLR end "rule__UserDomain__Group__0"


    // $ANTLR start "rule__UserDomain__Group__0__Impl"
    // InternalMyDsl.g:1893:1: rule__UserDomain__Group__0__Impl : ( 'UserDomain' ) ;
    public final void rule__UserDomain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1897:1: ( ( 'UserDomain' ) )
            // InternalMyDsl.g:1898:1: ( 'UserDomain' )
            {
            // InternalMyDsl.g:1898:1: ( 'UserDomain' )
            // InternalMyDsl.g:1899:2: 'UserDomain'
            {
             before(grammarAccess.getUserDomainAccess().getUserDomainKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUserDomainAccess().getUserDomainKeyword_0()); 

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
    // $ANTLR end "rule__UserDomain__Group__0__Impl"


    // $ANTLR start "rule__UserDomain__Group__1"
    // InternalMyDsl.g:1908:1: rule__UserDomain__Group__1 : rule__UserDomain__Group__1__Impl ;
    public final void rule__UserDomain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1912:1: ( rule__UserDomain__Group__1__Impl )
            // InternalMyDsl.g:1913:2: rule__UserDomain__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UserDomain__Group__1__Impl();

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
    // $ANTLR end "rule__UserDomain__Group__1"


    // $ANTLR start "rule__UserDomain__Group__1__Impl"
    // InternalMyDsl.g:1919:1: rule__UserDomain__Group__1__Impl : ( ( rule__UserDomain__NameAssignment_1 ) ) ;
    public final void rule__UserDomain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1923:1: ( ( ( rule__UserDomain__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1924:1: ( ( rule__UserDomain__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1924:1: ( ( rule__UserDomain__NameAssignment_1 ) )
            // InternalMyDsl.g:1925:2: ( rule__UserDomain__NameAssignment_1 )
            {
             before(grammarAccess.getUserDomainAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1926:2: ( rule__UserDomain__NameAssignment_1 )
            // InternalMyDsl.g:1926:3: rule__UserDomain__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UserDomain__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUserDomainAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__UserDomain__Group__1__Impl"


    // $ANTLR start "rule__Functionality__Group__0"
    // InternalMyDsl.g:1935:1: rule__Functionality__Group__0 : rule__Functionality__Group__0__Impl rule__Functionality__Group__1 ;
    public final void rule__Functionality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1939:1: ( rule__Functionality__Group__0__Impl rule__Functionality__Group__1 )
            // InternalMyDsl.g:1940:2: rule__Functionality__Group__0__Impl rule__Functionality__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:1947:1: rule__Functionality__Group__0__Impl : ( 'Functionalities' ) ;
    public final void rule__Functionality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1951:1: ( ( 'Functionalities' ) )
            // InternalMyDsl.g:1952:1: ( 'Functionalities' )
            {
            // InternalMyDsl.g:1952:1: ( 'Functionalities' )
            // InternalMyDsl.g:1953:2: 'Functionalities'
            {
             before(grammarAccess.getFunctionalityAccess().getFunctionalitiesKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:1962:1: rule__Functionality__Group__1 : rule__Functionality__Group__1__Impl rule__Functionality__Group__2 ;
    public final void rule__Functionality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1966:1: ( rule__Functionality__Group__1__Impl rule__Functionality__Group__2 )
            // InternalMyDsl.g:1967:2: rule__Functionality__Group__1__Impl rule__Functionality__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Functionality__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functionality__Group__2();

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
    // InternalMyDsl.g:1974:1: rule__Functionality__Group__1__Impl : ( ':' ) ;
    public final void rule__Functionality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1978:1: ( ( ':' ) )
            // InternalMyDsl.g:1979:1: ( ':' )
            {
            // InternalMyDsl.g:1979:1: ( ':' )
            // InternalMyDsl.g:1980:2: ':'
            {
             before(grammarAccess.getFunctionalityAccess().getColonKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFunctionalityAccess().getColonKeyword_1()); 

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


    // $ANTLR start "rule__Functionality__Group__2"
    // InternalMyDsl.g:1989:1: rule__Functionality__Group__2 : rule__Functionality__Group__2__Impl rule__Functionality__Group__3 ;
    public final void rule__Functionality__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1993:1: ( rule__Functionality__Group__2__Impl rule__Functionality__Group__3 )
            // InternalMyDsl.g:1994:2: rule__Functionality__Group__2__Impl rule__Functionality__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Functionality__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functionality__Group__3();

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
    // $ANTLR end "rule__Functionality__Group__2"


    // $ANTLR start "rule__Functionality__Group__2__Impl"
    // InternalMyDsl.g:2001:1: rule__Functionality__Group__2__Impl : ( '{' ) ;
    public final void rule__Functionality__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2005:1: ( ( '{' ) )
            // InternalMyDsl.g:2006:1: ( '{' )
            {
            // InternalMyDsl.g:2006:1: ( '{' )
            // InternalMyDsl.g:2007:2: '{'
            {
             before(grammarAccess.getFunctionalityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFunctionalityAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Functionality__Group__2__Impl"


    // $ANTLR start "rule__Functionality__Group__3"
    // InternalMyDsl.g:2016:1: rule__Functionality__Group__3 : rule__Functionality__Group__3__Impl rule__Functionality__Group__4 ;
    public final void rule__Functionality__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2020:1: ( rule__Functionality__Group__3__Impl rule__Functionality__Group__4 )
            // InternalMyDsl.g:2021:2: rule__Functionality__Group__3__Impl rule__Functionality__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Functionality__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functionality__Group__4();

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
    // $ANTLR end "rule__Functionality__Group__3"


    // $ANTLR start "rule__Functionality__Group__3__Impl"
    // InternalMyDsl.g:2028:1: rule__Functionality__Group__3__Impl : ( ( rule__Functionality__ElementsAssignment_3 ) ) ;
    public final void rule__Functionality__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2032:1: ( ( ( rule__Functionality__ElementsAssignment_3 ) ) )
            // InternalMyDsl.g:2033:1: ( ( rule__Functionality__ElementsAssignment_3 ) )
            {
            // InternalMyDsl.g:2033:1: ( ( rule__Functionality__ElementsAssignment_3 ) )
            // InternalMyDsl.g:2034:2: ( rule__Functionality__ElementsAssignment_3 )
            {
             before(grammarAccess.getFunctionalityAccess().getElementsAssignment_3()); 
            // InternalMyDsl.g:2035:2: ( rule__Functionality__ElementsAssignment_3 )
            // InternalMyDsl.g:2035:3: rule__Functionality__ElementsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Functionality__ElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalityAccess().getElementsAssignment_3()); 

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
    // $ANTLR end "rule__Functionality__Group__3__Impl"


    // $ANTLR start "rule__Functionality__Group__4"
    // InternalMyDsl.g:2043:1: rule__Functionality__Group__4 : rule__Functionality__Group__4__Impl ;
    public final void rule__Functionality__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2047:1: ( rule__Functionality__Group__4__Impl )
            // InternalMyDsl.g:2048:2: rule__Functionality__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Functionality__Group__4__Impl();

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
    // $ANTLR end "rule__Functionality__Group__4"


    // $ANTLR start "rule__Functionality__Group__4__Impl"
    // InternalMyDsl.g:2054:1: rule__Functionality__Group__4__Impl : ( '}' ) ;
    public final void rule__Functionality__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2058:1: ( ( '}' ) )
            // InternalMyDsl.g:2059:1: ( '}' )
            {
            // InternalMyDsl.g:2059:1: ( '}' )
            // InternalMyDsl.g:2060:2: '}'
            {
             before(grammarAccess.getFunctionalityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFunctionalityAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Functionality__Group__4__Impl"


    // $ANTLR start "rule__Functionalities__Group__0"
    // InternalMyDsl.g:2070:1: rule__Functionalities__Group__0 : rule__Functionalities__Group__0__Impl rule__Functionalities__Group__1 ;
    public final void rule__Functionalities__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2074:1: ( rule__Functionalities__Group__0__Impl rule__Functionalities__Group__1 )
            // InternalMyDsl.g:2075:2: rule__Functionalities__Group__0__Impl rule__Functionalities__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2082:1: rule__Functionalities__Group__0__Impl : ( ( rule__Functionalities__FunctionsAssignment_0 ) ) ;
    public final void rule__Functionalities__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2086:1: ( ( ( rule__Functionalities__FunctionsAssignment_0 ) ) )
            // InternalMyDsl.g:2087:1: ( ( rule__Functionalities__FunctionsAssignment_0 ) )
            {
            // InternalMyDsl.g:2087:1: ( ( rule__Functionalities__FunctionsAssignment_0 ) )
            // InternalMyDsl.g:2088:2: ( rule__Functionalities__FunctionsAssignment_0 )
            {
             before(grammarAccess.getFunctionalitiesAccess().getFunctionsAssignment_0()); 
            // InternalMyDsl.g:2089:2: ( rule__Functionalities__FunctionsAssignment_0 )
            // InternalMyDsl.g:2089:3: rule__Functionalities__FunctionsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Functionalities__FunctionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalitiesAccess().getFunctionsAssignment_0()); 

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
    // InternalMyDsl.g:2097:1: rule__Functionalities__Group__1 : rule__Functionalities__Group__1__Impl rule__Functionalities__Group__2 ;
    public final void rule__Functionalities__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2101:1: ( rule__Functionalities__Group__1__Impl rule__Functionalities__Group__2 )
            // InternalMyDsl.g:2102:2: rule__Functionalities__Group__1__Impl rule__Functionalities__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2109:1: rule__Functionalities__Group__1__Impl : ( ( rule__Functionalities__ElementsAssignment_1 ) ) ;
    public final void rule__Functionalities__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2113:1: ( ( ( rule__Functionalities__ElementsAssignment_1 ) ) )
            // InternalMyDsl.g:2114:1: ( ( rule__Functionalities__ElementsAssignment_1 ) )
            {
            // InternalMyDsl.g:2114:1: ( ( rule__Functionalities__ElementsAssignment_1 ) )
            // InternalMyDsl.g:2115:2: ( rule__Functionalities__ElementsAssignment_1 )
            {
             before(grammarAccess.getFunctionalitiesAccess().getElementsAssignment_1()); 
            // InternalMyDsl.g:2116:2: ( rule__Functionalities__ElementsAssignment_1 )
            // InternalMyDsl.g:2116:3: rule__Functionalities__ElementsAssignment_1
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
    // InternalMyDsl.g:2124:1: rule__Functionalities__Group__2 : rule__Functionalities__Group__2__Impl rule__Functionalities__Group__3 ;
    public final void rule__Functionalities__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2128:1: ( rule__Functionalities__Group__2__Impl rule__Functionalities__Group__3 )
            // InternalMyDsl.g:2129:2: rule__Functionalities__Group__2__Impl rule__Functionalities__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2136:1: rule__Functionalities__Group__2__Impl : ( ( rule__Functionalities__ItemsAssignment_2 ) ) ;
    public final void rule__Functionalities__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2140:1: ( ( ( rule__Functionalities__ItemsAssignment_2 ) ) )
            // InternalMyDsl.g:2141:1: ( ( rule__Functionalities__ItemsAssignment_2 ) )
            {
            // InternalMyDsl.g:2141:1: ( ( rule__Functionalities__ItemsAssignment_2 ) )
            // InternalMyDsl.g:2142:2: ( rule__Functionalities__ItemsAssignment_2 )
            {
             before(grammarAccess.getFunctionalitiesAccess().getItemsAssignment_2()); 
            // InternalMyDsl.g:2143:2: ( rule__Functionalities__ItemsAssignment_2 )
            // InternalMyDsl.g:2143:3: rule__Functionalities__ItemsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Functionalities__ItemsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalitiesAccess().getItemsAssignment_2()); 

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
    // InternalMyDsl.g:2151:1: rule__Functionalities__Group__3 : rule__Functionalities__Group__3__Impl rule__Functionalities__Group__4 ;
    public final void rule__Functionalities__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2155:1: ( rule__Functionalities__Group__3__Impl rule__Functionalities__Group__4 )
            // InternalMyDsl.g:2156:2: rule__Functionalities__Group__3__Impl rule__Functionalities__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Functionalities__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functionalities__Group__4();

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
    // InternalMyDsl.g:2163:1: rule__Functionalities__Group__3__Impl : ( ( rule__Functionalities__ResourcesAssignment_3 ) ) ;
    public final void rule__Functionalities__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2167:1: ( ( ( rule__Functionalities__ResourcesAssignment_3 ) ) )
            // InternalMyDsl.g:2168:1: ( ( rule__Functionalities__ResourcesAssignment_3 ) )
            {
            // InternalMyDsl.g:2168:1: ( ( rule__Functionalities__ResourcesAssignment_3 ) )
            // InternalMyDsl.g:2169:2: ( rule__Functionalities__ResourcesAssignment_3 )
            {
             before(grammarAccess.getFunctionalitiesAccess().getResourcesAssignment_3()); 
            // InternalMyDsl.g:2170:2: ( rule__Functionalities__ResourcesAssignment_3 )
            // InternalMyDsl.g:2170:3: rule__Functionalities__ResourcesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Functionalities__ResourcesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalitiesAccess().getResourcesAssignment_3()); 

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


    // $ANTLR start "rule__Functionalities__Group__4"
    // InternalMyDsl.g:2178:1: rule__Functionalities__Group__4 : rule__Functionalities__Group__4__Impl ;
    public final void rule__Functionalities__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2182:1: ( rule__Functionalities__Group__4__Impl )
            // InternalMyDsl.g:2183:2: rule__Functionalities__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Functionalities__Group__4__Impl();

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
    // $ANTLR end "rule__Functionalities__Group__4"


    // $ANTLR start "rule__Functionalities__Group__4__Impl"
    // InternalMyDsl.g:2189:1: rule__Functionalities__Group__4__Impl : ( ( rule__Functionalities__AditionalsAssignment_4 ) ) ;
    public final void rule__Functionalities__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2193:1: ( ( ( rule__Functionalities__AditionalsAssignment_4 ) ) )
            // InternalMyDsl.g:2194:1: ( ( rule__Functionalities__AditionalsAssignment_4 ) )
            {
            // InternalMyDsl.g:2194:1: ( ( rule__Functionalities__AditionalsAssignment_4 ) )
            // InternalMyDsl.g:2195:2: ( rule__Functionalities__AditionalsAssignment_4 )
            {
             before(grammarAccess.getFunctionalitiesAccess().getAditionalsAssignment_4()); 
            // InternalMyDsl.g:2196:2: ( rule__Functionalities__AditionalsAssignment_4 )
            // InternalMyDsl.g:2196:3: rule__Functionalities__AditionalsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Functionalities__AditionalsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalitiesAccess().getAditionalsAssignment_4()); 

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
    // $ANTLR end "rule__Functionalities__Group__4__Impl"


    // $ANTLR start "rule__ProfileManagement__Group__0"
    // InternalMyDsl.g:2205:1: rule__ProfileManagement__Group__0 : rule__ProfileManagement__Group__0__Impl rule__ProfileManagement__Group__1 ;
    public final void rule__ProfileManagement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2209:1: ( rule__ProfileManagement__Group__0__Impl rule__ProfileManagement__Group__1 )
            // InternalMyDsl.g:2210:2: rule__ProfileManagement__Group__0__Impl rule__ProfileManagement__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ProfileManagement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProfileManagement__Group__1();

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
    // $ANTLR end "rule__ProfileManagement__Group__0"


    // $ANTLR start "rule__ProfileManagement__Group__0__Impl"
    // InternalMyDsl.g:2217:1: rule__ProfileManagement__Group__0__Impl : ( 'ProfileManagement' ) ;
    public final void rule__ProfileManagement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2221:1: ( ( 'ProfileManagement' ) )
            // InternalMyDsl.g:2222:1: ( 'ProfileManagement' )
            {
            // InternalMyDsl.g:2222:1: ( 'ProfileManagement' )
            // InternalMyDsl.g:2223:2: 'ProfileManagement'
            {
             before(grammarAccess.getProfileManagementAccess().getProfileManagementKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getProfileManagementAccess().getProfileManagementKeyword_0()); 

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
    // $ANTLR end "rule__ProfileManagement__Group__0__Impl"


    // $ANTLR start "rule__ProfileManagement__Group__1"
    // InternalMyDsl.g:2232:1: rule__ProfileManagement__Group__1 : rule__ProfileManagement__Group__1__Impl rule__ProfileManagement__Group__2 ;
    public final void rule__ProfileManagement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2236:1: ( rule__ProfileManagement__Group__1__Impl rule__ProfileManagement__Group__2 )
            // InternalMyDsl.g:2237:2: rule__ProfileManagement__Group__1__Impl rule__ProfileManagement__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__ProfileManagement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProfileManagement__Group__2();

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
    // $ANTLR end "rule__ProfileManagement__Group__1"


    // $ANTLR start "rule__ProfileManagement__Group__1__Impl"
    // InternalMyDsl.g:2244:1: rule__ProfileManagement__Group__1__Impl : ( ':' ) ;
    public final void rule__ProfileManagement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2248:1: ( ( ':' ) )
            // InternalMyDsl.g:2249:1: ( ':' )
            {
            // InternalMyDsl.g:2249:1: ( ':' )
            // InternalMyDsl.g:2250:2: ':'
            {
             before(grammarAccess.getProfileManagementAccess().getColonKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getProfileManagementAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__ProfileManagement__Group__1__Impl"


    // $ANTLR start "rule__ProfileManagement__Group__2"
    // InternalMyDsl.g:2259:1: rule__ProfileManagement__Group__2 : rule__ProfileManagement__Group__2__Impl ;
    public final void rule__ProfileManagement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2263:1: ( rule__ProfileManagement__Group__2__Impl )
            // InternalMyDsl.g:2264:2: rule__ProfileManagement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProfileManagement__Group__2__Impl();

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
    // $ANTLR end "rule__ProfileManagement__Group__2"


    // $ANTLR start "rule__ProfileManagement__Group__2__Impl"
    // InternalMyDsl.g:2270:1: rule__ProfileManagement__Group__2__Impl : ( ( rule__ProfileManagement__ItemsAssignment_2 ) ) ;
    public final void rule__ProfileManagement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2274:1: ( ( ( rule__ProfileManagement__ItemsAssignment_2 ) ) )
            // InternalMyDsl.g:2275:1: ( ( rule__ProfileManagement__ItemsAssignment_2 ) )
            {
            // InternalMyDsl.g:2275:1: ( ( rule__ProfileManagement__ItemsAssignment_2 ) )
            // InternalMyDsl.g:2276:2: ( rule__ProfileManagement__ItemsAssignment_2 )
            {
             before(grammarAccess.getProfileManagementAccess().getItemsAssignment_2()); 
            // InternalMyDsl.g:2277:2: ( rule__ProfileManagement__ItemsAssignment_2 )
            // InternalMyDsl.g:2277:3: rule__ProfileManagement__ItemsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ProfileManagement__ItemsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProfileManagementAccess().getItemsAssignment_2()); 

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
    // $ANTLR end "rule__ProfileManagement__Group__2__Impl"


    // $ANTLR start "rule__ProfileManagementFunctions__Group__0"
    // InternalMyDsl.g:2286:1: rule__ProfileManagementFunctions__Group__0 : rule__ProfileManagementFunctions__Group__0__Impl rule__ProfileManagementFunctions__Group__1 ;
    public final void rule__ProfileManagementFunctions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2290:1: ( rule__ProfileManagementFunctions__Group__0__Impl rule__ProfileManagementFunctions__Group__1 )
            // InternalMyDsl.g:2291:2: rule__ProfileManagementFunctions__Group__0__Impl rule__ProfileManagementFunctions__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ProfileManagementFunctions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProfileManagementFunctions__Group__1();

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
    // $ANTLR end "rule__ProfileManagementFunctions__Group__0"


    // $ANTLR start "rule__ProfileManagementFunctions__Group__0__Impl"
    // InternalMyDsl.g:2298:1: rule__ProfileManagementFunctions__Group__0__Impl : ( 'ViewProfilePhoto' ) ;
    public final void rule__ProfileManagementFunctions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2302:1: ( ( 'ViewProfilePhoto' ) )
            // InternalMyDsl.g:2303:1: ( 'ViewProfilePhoto' )
            {
            // InternalMyDsl.g:2303:1: ( 'ViewProfilePhoto' )
            // InternalMyDsl.g:2304:2: 'ViewProfilePhoto'
            {
             before(grammarAccess.getProfileManagementFunctionsAccess().getViewProfilePhotoKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProfileManagementFunctionsAccess().getViewProfilePhotoKeyword_0()); 

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
    // $ANTLR end "rule__ProfileManagementFunctions__Group__0__Impl"


    // $ANTLR start "rule__ProfileManagementFunctions__Group__1"
    // InternalMyDsl.g:2313:1: rule__ProfileManagementFunctions__Group__1 : rule__ProfileManagementFunctions__Group__1__Impl rule__ProfileManagementFunctions__Group__2 ;
    public final void rule__ProfileManagementFunctions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2317:1: ( rule__ProfileManagementFunctions__Group__1__Impl rule__ProfileManagementFunctions__Group__2 )
            // InternalMyDsl.g:2318:2: rule__ProfileManagementFunctions__Group__1__Impl rule__ProfileManagementFunctions__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__ProfileManagementFunctions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProfileManagementFunctions__Group__2();

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
    // $ANTLR end "rule__ProfileManagementFunctions__Group__1"


    // $ANTLR start "rule__ProfileManagementFunctions__Group__1__Impl"
    // InternalMyDsl.g:2325:1: rule__ProfileManagementFunctions__Group__1__Impl : ( ( rule__ProfileManagementFunctions__NameAssignment_1 ) ) ;
    public final void rule__ProfileManagementFunctions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2329:1: ( ( ( rule__ProfileManagementFunctions__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2330:1: ( ( rule__ProfileManagementFunctions__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2330:1: ( ( rule__ProfileManagementFunctions__NameAssignment_1 ) )
            // InternalMyDsl.g:2331:2: ( rule__ProfileManagementFunctions__NameAssignment_1 )
            {
             before(grammarAccess.getProfileManagementFunctionsAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2332:2: ( rule__ProfileManagementFunctions__NameAssignment_1 )
            // InternalMyDsl.g:2332:3: rule__ProfileManagementFunctions__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProfileManagementFunctions__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProfileManagementFunctionsAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ProfileManagementFunctions__Group__1__Impl"


    // $ANTLR start "rule__ProfileManagementFunctions__Group__2"
    // InternalMyDsl.g:2340:1: rule__ProfileManagementFunctions__Group__2 : rule__ProfileManagementFunctions__Group__2__Impl rule__ProfileManagementFunctions__Group__3 ;
    public final void rule__ProfileManagementFunctions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2344:1: ( rule__ProfileManagementFunctions__Group__2__Impl rule__ProfileManagementFunctions__Group__3 )
            // InternalMyDsl.g:2345:2: rule__ProfileManagementFunctions__Group__2__Impl rule__ProfileManagementFunctions__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ProfileManagementFunctions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProfileManagementFunctions__Group__3();

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
    // $ANTLR end "rule__ProfileManagementFunctions__Group__2"


    // $ANTLR start "rule__ProfileManagementFunctions__Group__2__Impl"
    // InternalMyDsl.g:2352:1: rule__ProfileManagementFunctions__Group__2__Impl : ( 'EditProfileInfo' ) ;
    public final void rule__ProfileManagementFunctions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2356:1: ( ( 'EditProfileInfo' ) )
            // InternalMyDsl.g:2357:1: ( 'EditProfileInfo' )
            {
            // InternalMyDsl.g:2357:1: ( 'EditProfileInfo' )
            // InternalMyDsl.g:2358:2: 'EditProfileInfo'
            {
             before(grammarAccess.getProfileManagementFunctionsAccess().getEditProfileInfoKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProfileManagementFunctionsAccess().getEditProfileInfoKeyword_2()); 

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
    // $ANTLR end "rule__ProfileManagementFunctions__Group__2__Impl"


    // $ANTLR start "rule__ProfileManagementFunctions__Group__3"
    // InternalMyDsl.g:2367:1: rule__ProfileManagementFunctions__Group__3 : rule__ProfileManagementFunctions__Group__3__Impl ;
    public final void rule__ProfileManagementFunctions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2371:1: ( rule__ProfileManagementFunctions__Group__3__Impl )
            // InternalMyDsl.g:2372:2: rule__ProfileManagementFunctions__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProfileManagementFunctions__Group__3__Impl();

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
    // $ANTLR end "rule__ProfileManagementFunctions__Group__3"


    // $ANTLR start "rule__ProfileManagementFunctions__Group__3__Impl"
    // InternalMyDsl.g:2378:1: rule__ProfileManagementFunctions__Group__3__Impl : ( ( rule__ProfileManagementFunctions__NameAssignment_3 ) ) ;
    public final void rule__ProfileManagementFunctions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2382:1: ( ( ( rule__ProfileManagementFunctions__NameAssignment_3 ) ) )
            // InternalMyDsl.g:2383:1: ( ( rule__ProfileManagementFunctions__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:2383:1: ( ( rule__ProfileManagementFunctions__NameAssignment_3 ) )
            // InternalMyDsl.g:2384:2: ( rule__ProfileManagementFunctions__NameAssignment_3 )
            {
             before(grammarAccess.getProfileManagementFunctionsAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:2385:2: ( rule__ProfileManagementFunctions__NameAssignment_3 )
            // InternalMyDsl.g:2385:3: rule__ProfileManagementFunctions__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ProfileManagementFunctions__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProfileManagementFunctionsAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__ProfileManagementFunctions__Group__3__Impl"


    // $ANTLR start "rule__AppAccess__Group__0"
    // InternalMyDsl.g:2394:1: rule__AppAccess__Group__0 : rule__AppAccess__Group__0__Impl rule__AppAccess__Group__1 ;
    public final void rule__AppAccess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2398:1: ( rule__AppAccess__Group__0__Impl rule__AppAccess__Group__1 )
            // InternalMyDsl.g:2399:2: rule__AppAccess__Group__0__Impl rule__AppAccess__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AppAccess__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppAccess__Group__1();

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
    // $ANTLR end "rule__AppAccess__Group__0"


    // $ANTLR start "rule__AppAccess__Group__0__Impl"
    // InternalMyDsl.g:2406:1: rule__AppAccess__Group__0__Impl : ( 'AppAccess' ) ;
    public final void rule__AppAccess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2410:1: ( ( 'AppAccess' ) )
            // InternalMyDsl.g:2411:1: ( 'AppAccess' )
            {
            // InternalMyDsl.g:2411:1: ( 'AppAccess' )
            // InternalMyDsl.g:2412:2: 'AppAccess'
            {
             before(grammarAccess.getAppAccessAccess().getAppAccessKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAppAccessAccess().getAppAccessKeyword_0()); 

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
    // $ANTLR end "rule__AppAccess__Group__0__Impl"


    // $ANTLR start "rule__AppAccess__Group__1"
    // InternalMyDsl.g:2421:1: rule__AppAccess__Group__1 : rule__AppAccess__Group__1__Impl rule__AppAccess__Group__2 ;
    public final void rule__AppAccess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2425:1: ( rule__AppAccess__Group__1__Impl rule__AppAccess__Group__2 )
            // InternalMyDsl.g:2426:2: rule__AppAccess__Group__1__Impl rule__AppAccess__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__AppAccess__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppAccess__Group__2();

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
    // $ANTLR end "rule__AppAccess__Group__1"


    // $ANTLR start "rule__AppAccess__Group__1__Impl"
    // InternalMyDsl.g:2433:1: rule__AppAccess__Group__1__Impl : ( ':' ) ;
    public final void rule__AppAccess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2437:1: ( ( ':' ) )
            // InternalMyDsl.g:2438:1: ( ':' )
            {
            // InternalMyDsl.g:2438:1: ( ':' )
            // InternalMyDsl.g:2439:2: ':'
            {
             before(grammarAccess.getAppAccessAccess().getColonKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAppAccessAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__AppAccess__Group__1__Impl"


    // $ANTLR start "rule__AppAccess__Group__2"
    // InternalMyDsl.g:2448:1: rule__AppAccess__Group__2 : rule__AppAccess__Group__2__Impl ;
    public final void rule__AppAccess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2452:1: ( rule__AppAccess__Group__2__Impl )
            // InternalMyDsl.g:2453:2: rule__AppAccess__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AppAccess__Group__2__Impl();

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
    // $ANTLR end "rule__AppAccess__Group__2"


    // $ANTLR start "rule__AppAccess__Group__2__Impl"
    // InternalMyDsl.g:2459:1: rule__AppAccess__Group__2__Impl : ( ( rule__AppAccess__ItemsAssignment_2 ) ) ;
    public final void rule__AppAccess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2463:1: ( ( ( rule__AppAccess__ItemsAssignment_2 ) ) )
            // InternalMyDsl.g:2464:1: ( ( rule__AppAccess__ItemsAssignment_2 ) )
            {
            // InternalMyDsl.g:2464:1: ( ( rule__AppAccess__ItemsAssignment_2 ) )
            // InternalMyDsl.g:2465:2: ( rule__AppAccess__ItemsAssignment_2 )
            {
             before(grammarAccess.getAppAccessAccess().getItemsAssignment_2()); 
            // InternalMyDsl.g:2466:2: ( rule__AppAccess__ItemsAssignment_2 )
            // InternalMyDsl.g:2466:3: rule__AppAccess__ItemsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AppAccess__ItemsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAppAccessAccess().getItemsAssignment_2()); 

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
    // $ANTLR end "rule__AppAccess__Group__2__Impl"


    // $ANTLR start "rule__AppAccessFunctions__Group__0"
    // InternalMyDsl.g:2475:1: rule__AppAccessFunctions__Group__0 : rule__AppAccessFunctions__Group__0__Impl rule__AppAccessFunctions__Group__1 ;
    public final void rule__AppAccessFunctions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2479:1: ( rule__AppAccessFunctions__Group__0__Impl rule__AppAccessFunctions__Group__1 )
            // InternalMyDsl.g:2480:2: rule__AppAccessFunctions__Group__0__Impl rule__AppAccessFunctions__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__AppAccessFunctions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppAccessFunctions__Group__1();

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
    // $ANTLR end "rule__AppAccessFunctions__Group__0"


    // $ANTLR start "rule__AppAccessFunctions__Group__0__Impl"
    // InternalMyDsl.g:2487:1: rule__AppAccessFunctions__Group__0__Impl : ( 'Login' ) ;
    public final void rule__AppAccessFunctions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2491:1: ( ( 'Login' ) )
            // InternalMyDsl.g:2492:1: ( 'Login' )
            {
            // InternalMyDsl.g:2492:1: ( 'Login' )
            // InternalMyDsl.g:2493:2: 'Login'
            {
             before(grammarAccess.getAppAccessFunctionsAccess().getLoginKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAppAccessFunctionsAccess().getLoginKeyword_0()); 

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
    // $ANTLR end "rule__AppAccessFunctions__Group__0__Impl"


    // $ANTLR start "rule__AppAccessFunctions__Group__1"
    // InternalMyDsl.g:2502:1: rule__AppAccessFunctions__Group__1 : rule__AppAccessFunctions__Group__1__Impl rule__AppAccessFunctions__Group__2 ;
    public final void rule__AppAccessFunctions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2506:1: ( rule__AppAccessFunctions__Group__1__Impl rule__AppAccessFunctions__Group__2 )
            // InternalMyDsl.g:2507:2: rule__AppAccessFunctions__Group__1__Impl rule__AppAccessFunctions__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__AppAccessFunctions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppAccessFunctions__Group__2();

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
    // $ANTLR end "rule__AppAccessFunctions__Group__1"


    // $ANTLR start "rule__AppAccessFunctions__Group__1__Impl"
    // InternalMyDsl.g:2514:1: rule__AppAccessFunctions__Group__1__Impl : ( ( rule__AppAccessFunctions__NameAssignment_1 ) ) ;
    public final void rule__AppAccessFunctions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2518:1: ( ( ( rule__AppAccessFunctions__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2519:1: ( ( rule__AppAccessFunctions__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2519:1: ( ( rule__AppAccessFunctions__NameAssignment_1 ) )
            // InternalMyDsl.g:2520:2: ( rule__AppAccessFunctions__NameAssignment_1 )
            {
             before(grammarAccess.getAppAccessFunctionsAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2521:2: ( rule__AppAccessFunctions__NameAssignment_1 )
            // InternalMyDsl.g:2521:3: rule__AppAccessFunctions__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AppAccessFunctions__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAppAccessFunctionsAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__AppAccessFunctions__Group__1__Impl"


    // $ANTLR start "rule__AppAccessFunctions__Group__2"
    // InternalMyDsl.g:2529:1: rule__AppAccessFunctions__Group__2 : rule__AppAccessFunctions__Group__2__Impl rule__AppAccessFunctions__Group__3 ;
    public final void rule__AppAccessFunctions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2533:1: ( rule__AppAccessFunctions__Group__2__Impl rule__AppAccessFunctions__Group__3 )
            // InternalMyDsl.g:2534:2: rule__AppAccessFunctions__Group__2__Impl rule__AppAccessFunctions__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__AppAccessFunctions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppAccessFunctions__Group__3();

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
    // $ANTLR end "rule__AppAccessFunctions__Group__2"


    // $ANTLR start "rule__AppAccessFunctions__Group__2__Impl"
    // InternalMyDsl.g:2541:1: rule__AppAccessFunctions__Group__2__Impl : ( 'Register' ) ;
    public final void rule__AppAccessFunctions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2545:1: ( ( 'Register' ) )
            // InternalMyDsl.g:2546:1: ( 'Register' )
            {
            // InternalMyDsl.g:2546:1: ( 'Register' )
            // InternalMyDsl.g:2547:2: 'Register'
            {
             before(grammarAccess.getAppAccessFunctionsAccess().getRegisterKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAppAccessFunctionsAccess().getRegisterKeyword_2()); 

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
    // $ANTLR end "rule__AppAccessFunctions__Group__2__Impl"


    // $ANTLR start "rule__AppAccessFunctions__Group__3"
    // InternalMyDsl.g:2556:1: rule__AppAccessFunctions__Group__3 : rule__AppAccessFunctions__Group__3__Impl ;
    public final void rule__AppAccessFunctions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2560:1: ( rule__AppAccessFunctions__Group__3__Impl )
            // InternalMyDsl.g:2561:2: rule__AppAccessFunctions__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AppAccessFunctions__Group__3__Impl();

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
    // $ANTLR end "rule__AppAccessFunctions__Group__3"


    // $ANTLR start "rule__AppAccessFunctions__Group__3__Impl"
    // InternalMyDsl.g:2567:1: rule__AppAccessFunctions__Group__3__Impl : ( ( rule__AppAccessFunctions__NameAssignment_3 ) ) ;
    public final void rule__AppAccessFunctions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2571:1: ( ( ( rule__AppAccessFunctions__NameAssignment_3 ) ) )
            // InternalMyDsl.g:2572:1: ( ( rule__AppAccessFunctions__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:2572:1: ( ( rule__AppAccessFunctions__NameAssignment_3 ) )
            // InternalMyDsl.g:2573:2: ( rule__AppAccessFunctions__NameAssignment_3 )
            {
             before(grammarAccess.getAppAccessFunctionsAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:2574:2: ( rule__AppAccessFunctions__NameAssignment_3 )
            // InternalMyDsl.g:2574:3: rule__AppAccessFunctions__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AppAccessFunctions__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAppAccessFunctionsAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__AppAccessFunctions__Group__3__Impl"


    // $ANTLR start "rule__AlbumManagement__Group__0"
    // InternalMyDsl.g:2583:1: rule__AlbumManagement__Group__0 : rule__AlbumManagement__Group__0__Impl rule__AlbumManagement__Group__1 ;
    public final void rule__AlbumManagement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2587:1: ( rule__AlbumManagement__Group__0__Impl rule__AlbumManagement__Group__1 )
            // InternalMyDsl.g:2588:2: rule__AlbumManagement__Group__0__Impl rule__AlbumManagement__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AlbumManagement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlbumManagement__Group__1();

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
    // $ANTLR end "rule__AlbumManagement__Group__0"


    // $ANTLR start "rule__AlbumManagement__Group__0__Impl"
    // InternalMyDsl.g:2595:1: rule__AlbumManagement__Group__0__Impl : ( 'AlbumManagement' ) ;
    public final void rule__AlbumManagement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2599:1: ( ( 'AlbumManagement' ) )
            // InternalMyDsl.g:2600:1: ( 'AlbumManagement' )
            {
            // InternalMyDsl.g:2600:1: ( 'AlbumManagement' )
            // InternalMyDsl.g:2601:2: 'AlbumManagement'
            {
             before(grammarAccess.getAlbumManagementAccess().getAlbumManagementKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAlbumManagementAccess().getAlbumManagementKeyword_0()); 

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
    // $ANTLR end "rule__AlbumManagement__Group__0__Impl"


    // $ANTLR start "rule__AlbumManagement__Group__1"
    // InternalMyDsl.g:2610:1: rule__AlbumManagement__Group__1 : rule__AlbumManagement__Group__1__Impl rule__AlbumManagement__Group__2 ;
    public final void rule__AlbumManagement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2614:1: ( rule__AlbumManagement__Group__1__Impl rule__AlbumManagement__Group__2 )
            // InternalMyDsl.g:2615:2: rule__AlbumManagement__Group__1__Impl rule__AlbumManagement__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__AlbumManagement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlbumManagement__Group__2();

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
    // $ANTLR end "rule__AlbumManagement__Group__1"


    // $ANTLR start "rule__AlbumManagement__Group__1__Impl"
    // InternalMyDsl.g:2622:1: rule__AlbumManagement__Group__1__Impl : ( ':' ) ;
    public final void rule__AlbumManagement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2626:1: ( ( ':' ) )
            // InternalMyDsl.g:2627:1: ( ':' )
            {
            // InternalMyDsl.g:2627:1: ( ':' )
            // InternalMyDsl.g:2628:2: ':'
            {
             before(grammarAccess.getAlbumManagementAccess().getColonKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAlbumManagementAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__AlbumManagement__Group__1__Impl"


    // $ANTLR start "rule__AlbumManagement__Group__2"
    // InternalMyDsl.g:2637:1: rule__AlbumManagement__Group__2 : rule__AlbumManagement__Group__2__Impl ;
    public final void rule__AlbumManagement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2641:1: ( rule__AlbumManagement__Group__2__Impl )
            // InternalMyDsl.g:2642:2: rule__AlbumManagement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AlbumManagement__Group__2__Impl();

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
    // $ANTLR end "rule__AlbumManagement__Group__2"


    // $ANTLR start "rule__AlbumManagement__Group__2__Impl"
    // InternalMyDsl.g:2648:1: rule__AlbumManagement__Group__2__Impl : ( ( rule__AlbumManagement__ItemsAssignment_2 ) ) ;
    public final void rule__AlbumManagement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2652:1: ( ( ( rule__AlbumManagement__ItemsAssignment_2 ) ) )
            // InternalMyDsl.g:2653:1: ( ( rule__AlbumManagement__ItemsAssignment_2 ) )
            {
            // InternalMyDsl.g:2653:1: ( ( rule__AlbumManagement__ItemsAssignment_2 ) )
            // InternalMyDsl.g:2654:2: ( rule__AlbumManagement__ItemsAssignment_2 )
            {
             before(grammarAccess.getAlbumManagementAccess().getItemsAssignment_2()); 
            // InternalMyDsl.g:2655:2: ( rule__AlbumManagement__ItemsAssignment_2 )
            // InternalMyDsl.g:2655:3: rule__AlbumManagement__ItemsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AlbumManagement__ItemsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAlbumManagementAccess().getItemsAssignment_2()); 

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
    // $ANTLR end "rule__AlbumManagement__Group__2__Impl"


    // $ANTLR start "rule__AlbumManagementFunctions__Group__0"
    // InternalMyDsl.g:2664:1: rule__AlbumManagementFunctions__Group__0 : rule__AlbumManagementFunctions__Group__0__Impl rule__AlbumManagementFunctions__Group__1 ;
    public final void rule__AlbumManagementFunctions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2668:1: ( rule__AlbumManagementFunctions__Group__0__Impl rule__AlbumManagementFunctions__Group__1 )
            // InternalMyDsl.g:2669:2: rule__AlbumManagementFunctions__Group__0__Impl rule__AlbumManagementFunctions__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__AlbumManagementFunctions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlbumManagementFunctions__Group__1();

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
    // $ANTLR end "rule__AlbumManagementFunctions__Group__0"


    // $ANTLR start "rule__AlbumManagementFunctions__Group__0__Impl"
    // InternalMyDsl.g:2676:1: rule__AlbumManagementFunctions__Group__0__Impl : ( 'CreateAlbum' ) ;
    public final void rule__AlbumManagementFunctions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2680:1: ( ( 'CreateAlbum' ) )
            // InternalMyDsl.g:2681:1: ( 'CreateAlbum' )
            {
            // InternalMyDsl.g:2681:1: ( 'CreateAlbum' )
            // InternalMyDsl.g:2682:2: 'CreateAlbum'
            {
             before(grammarAccess.getAlbumManagementFunctionsAccess().getCreateAlbumKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAlbumManagementFunctionsAccess().getCreateAlbumKeyword_0()); 

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
    // $ANTLR end "rule__AlbumManagementFunctions__Group__0__Impl"


    // $ANTLR start "rule__AlbumManagementFunctions__Group__1"
    // InternalMyDsl.g:2691:1: rule__AlbumManagementFunctions__Group__1 : rule__AlbumManagementFunctions__Group__1__Impl rule__AlbumManagementFunctions__Group__2 ;
    public final void rule__AlbumManagementFunctions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2695:1: ( rule__AlbumManagementFunctions__Group__1__Impl rule__AlbumManagementFunctions__Group__2 )
            // InternalMyDsl.g:2696:2: rule__AlbumManagementFunctions__Group__1__Impl rule__AlbumManagementFunctions__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__AlbumManagementFunctions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlbumManagementFunctions__Group__2();

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
    // $ANTLR end "rule__AlbumManagementFunctions__Group__1"


    // $ANTLR start "rule__AlbumManagementFunctions__Group__1__Impl"
    // InternalMyDsl.g:2703:1: rule__AlbumManagementFunctions__Group__1__Impl : ( ( rule__AlbumManagementFunctions__NameAssignment_1 ) ) ;
    public final void rule__AlbumManagementFunctions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2707:1: ( ( ( rule__AlbumManagementFunctions__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2708:1: ( ( rule__AlbumManagementFunctions__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2708:1: ( ( rule__AlbumManagementFunctions__NameAssignment_1 ) )
            // InternalMyDsl.g:2709:2: ( rule__AlbumManagementFunctions__NameAssignment_1 )
            {
             before(grammarAccess.getAlbumManagementFunctionsAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2710:2: ( rule__AlbumManagementFunctions__NameAssignment_1 )
            // InternalMyDsl.g:2710:3: rule__AlbumManagementFunctions__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AlbumManagementFunctions__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAlbumManagementFunctionsAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__AlbumManagementFunctions__Group__1__Impl"


    // $ANTLR start "rule__AlbumManagementFunctions__Group__2"
    // InternalMyDsl.g:2718:1: rule__AlbumManagementFunctions__Group__2 : rule__AlbumManagementFunctions__Group__2__Impl rule__AlbumManagementFunctions__Group__3 ;
    public final void rule__AlbumManagementFunctions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2722:1: ( rule__AlbumManagementFunctions__Group__2__Impl rule__AlbumManagementFunctions__Group__3 )
            // InternalMyDsl.g:2723:2: rule__AlbumManagementFunctions__Group__2__Impl rule__AlbumManagementFunctions__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__AlbumManagementFunctions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlbumManagementFunctions__Group__3();

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
    // $ANTLR end "rule__AlbumManagementFunctions__Group__2"


    // $ANTLR start "rule__AlbumManagementFunctions__Group__2__Impl"
    // InternalMyDsl.g:2730:1: rule__AlbumManagementFunctions__Group__2__Impl : ( 'SelectAlbum' ) ;
    public final void rule__AlbumManagementFunctions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2734:1: ( ( 'SelectAlbum' ) )
            // InternalMyDsl.g:2735:1: ( 'SelectAlbum' )
            {
            // InternalMyDsl.g:2735:1: ( 'SelectAlbum' )
            // InternalMyDsl.g:2736:2: 'SelectAlbum'
            {
             before(grammarAccess.getAlbumManagementFunctionsAccess().getSelectAlbumKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAlbumManagementFunctionsAccess().getSelectAlbumKeyword_2()); 

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
    // $ANTLR end "rule__AlbumManagementFunctions__Group__2__Impl"


    // $ANTLR start "rule__AlbumManagementFunctions__Group__3"
    // InternalMyDsl.g:2745:1: rule__AlbumManagementFunctions__Group__3 : rule__AlbumManagementFunctions__Group__3__Impl ;
    public final void rule__AlbumManagementFunctions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2749:1: ( rule__AlbumManagementFunctions__Group__3__Impl )
            // InternalMyDsl.g:2750:2: rule__AlbumManagementFunctions__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AlbumManagementFunctions__Group__3__Impl();

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
    // $ANTLR end "rule__AlbumManagementFunctions__Group__3"


    // $ANTLR start "rule__AlbumManagementFunctions__Group__3__Impl"
    // InternalMyDsl.g:2756:1: rule__AlbumManagementFunctions__Group__3__Impl : ( ( rule__AlbumManagementFunctions__NameAssignment_3 ) ) ;
    public final void rule__AlbumManagementFunctions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2760:1: ( ( ( rule__AlbumManagementFunctions__NameAssignment_3 ) ) )
            // InternalMyDsl.g:2761:1: ( ( rule__AlbumManagementFunctions__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:2761:1: ( ( rule__AlbumManagementFunctions__NameAssignment_3 ) )
            // InternalMyDsl.g:2762:2: ( rule__AlbumManagementFunctions__NameAssignment_3 )
            {
             before(grammarAccess.getAlbumManagementFunctionsAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:2763:2: ( rule__AlbumManagementFunctions__NameAssignment_3 )
            // InternalMyDsl.g:2763:3: rule__AlbumManagementFunctions__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AlbumManagementFunctions__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAlbumManagementFunctionsAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__AlbumManagementFunctions__Group__3__Impl"


    // $ANTLR start "rule__PhotoActions__Group__0"
    // InternalMyDsl.g:2772:1: rule__PhotoActions__Group__0 : rule__PhotoActions__Group__0__Impl rule__PhotoActions__Group__1 ;
    public final void rule__PhotoActions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2776:1: ( rule__PhotoActions__Group__0__Impl rule__PhotoActions__Group__1 )
            // InternalMyDsl.g:2777:2: rule__PhotoActions__Group__0__Impl rule__PhotoActions__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PhotoActions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhotoActions__Group__1();

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
    // $ANTLR end "rule__PhotoActions__Group__0"


    // $ANTLR start "rule__PhotoActions__Group__0__Impl"
    // InternalMyDsl.g:2784:1: rule__PhotoActions__Group__0__Impl : ( 'PhotoActions' ) ;
    public final void rule__PhotoActions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2788:1: ( ( 'PhotoActions' ) )
            // InternalMyDsl.g:2789:1: ( 'PhotoActions' )
            {
            // InternalMyDsl.g:2789:1: ( 'PhotoActions' )
            // InternalMyDsl.g:2790:2: 'PhotoActions'
            {
             before(grammarAccess.getPhotoActionsAccess().getPhotoActionsKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPhotoActionsAccess().getPhotoActionsKeyword_0()); 

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
    // $ANTLR end "rule__PhotoActions__Group__0__Impl"


    // $ANTLR start "rule__PhotoActions__Group__1"
    // InternalMyDsl.g:2799:1: rule__PhotoActions__Group__1 : rule__PhotoActions__Group__1__Impl rule__PhotoActions__Group__2 ;
    public final void rule__PhotoActions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2803:1: ( rule__PhotoActions__Group__1__Impl rule__PhotoActions__Group__2 )
            // InternalMyDsl.g:2804:2: rule__PhotoActions__Group__1__Impl rule__PhotoActions__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__PhotoActions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhotoActions__Group__2();

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
    // $ANTLR end "rule__PhotoActions__Group__1"


    // $ANTLR start "rule__PhotoActions__Group__1__Impl"
    // InternalMyDsl.g:2811:1: rule__PhotoActions__Group__1__Impl : ( ':' ) ;
    public final void rule__PhotoActions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2815:1: ( ( ':' ) )
            // InternalMyDsl.g:2816:1: ( ':' )
            {
            // InternalMyDsl.g:2816:1: ( ':' )
            // InternalMyDsl.g:2817:2: ':'
            {
             before(grammarAccess.getPhotoActionsAccess().getColonKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPhotoActionsAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__PhotoActions__Group__1__Impl"


    // $ANTLR start "rule__PhotoActions__Group__2"
    // InternalMyDsl.g:2826:1: rule__PhotoActions__Group__2 : rule__PhotoActions__Group__2__Impl ;
    public final void rule__PhotoActions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2830:1: ( rule__PhotoActions__Group__2__Impl )
            // InternalMyDsl.g:2831:2: rule__PhotoActions__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PhotoActions__Group__2__Impl();

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
    // $ANTLR end "rule__PhotoActions__Group__2"


    // $ANTLR start "rule__PhotoActions__Group__2__Impl"
    // InternalMyDsl.g:2837:1: rule__PhotoActions__Group__2__Impl : ( ( rule__PhotoActions__ItemsAssignment_2 ) ) ;
    public final void rule__PhotoActions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2841:1: ( ( ( rule__PhotoActions__ItemsAssignment_2 ) ) )
            // InternalMyDsl.g:2842:1: ( ( rule__PhotoActions__ItemsAssignment_2 ) )
            {
            // InternalMyDsl.g:2842:1: ( ( rule__PhotoActions__ItemsAssignment_2 ) )
            // InternalMyDsl.g:2843:2: ( rule__PhotoActions__ItemsAssignment_2 )
            {
             before(grammarAccess.getPhotoActionsAccess().getItemsAssignment_2()); 
            // InternalMyDsl.g:2844:2: ( rule__PhotoActions__ItemsAssignment_2 )
            // InternalMyDsl.g:2844:3: rule__PhotoActions__ItemsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PhotoActions__ItemsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPhotoActionsAccess().getItemsAssignment_2()); 

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
    // $ANTLR end "rule__PhotoActions__Group__2__Impl"


    // $ANTLR start "rule__PhotoActionsFunctions__Group__0"
    // InternalMyDsl.g:2853:1: rule__PhotoActionsFunctions__Group__0 : rule__PhotoActionsFunctions__Group__0__Impl rule__PhotoActionsFunctions__Group__1 ;
    public final void rule__PhotoActionsFunctions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2857:1: ( rule__PhotoActionsFunctions__Group__0__Impl rule__PhotoActionsFunctions__Group__1 )
            // InternalMyDsl.g:2858:2: rule__PhotoActionsFunctions__Group__0__Impl rule__PhotoActionsFunctions__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__PhotoActionsFunctions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhotoActionsFunctions__Group__1();

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
    // $ANTLR end "rule__PhotoActionsFunctions__Group__0"


    // $ANTLR start "rule__PhotoActionsFunctions__Group__0__Impl"
    // InternalMyDsl.g:2865:1: rule__PhotoActionsFunctions__Group__0__Impl : ( 'ViewAllPhotos' ) ;
    public final void rule__PhotoActionsFunctions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2869:1: ( ( 'ViewAllPhotos' ) )
            // InternalMyDsl.g:2870:1: ( 'ViewAllPhotos' )
            {
            // InternalMyDsl.g:2870:1: ( 'ViewAllPhotos' )
            // InternalMyDsl.g:2871:2: 'ViewAllPhotos'
            {
             before(grammarAccess.getPhotoActionsFunctionsAccess().getViewAllPhotosKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPhotoActionsFunctionsAccess().getViewAllPhotosKeyword_0()); 

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
    // $ANTLR end "rule__PhotoActionsFunctions__Group__0__Impl"


    // $ANTLR start "rule__PhotoActionsFunctions__Group__1"
    // InternalMyDsl.g:2880:1: rule__PhotoActionsFunctions__Group__1 : rule__PhotoActionsFunctions__Group__1__Impl rule__PhotoActionsFunctions__Group__2 ;
    public final void rule__PhotoActionsFunctions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2884:1: ( rule__PhotoActionsFunctions__Group__1__Impl rule__PhotoActionsFunctions__Group__2 )
            // InternalMyDsl.g:2885:2: rule__PhotoActionsFunctions__Group__1__Impl rule__PhotoActionsFunctions__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__PhotoActionsFunctions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhotoActionsFunctions__Group__2();

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
    // $ANTLR end "rule__PhotoActionsFunctions__Group__1"


    // $ANTLR start "rule__PhotoActionsFunctions__Group__1__Impl"
    // InternalMyDsl.g:2892:1: rule__PhotoActionsFunctions__Group__1__Impl : ( ( rule__PhotoActionsFunctions__NameAssignment_1 ) ) ;
    public final void rule__PhotoActionsFunctions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2896:1: ( ( ( rule__PhotoActionsFunctions__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2897:1: ( ( rule__PhotoActionsFunctions__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2897:1: ( ( rule__PhotoActionsFunctions__NameAssignment_1 ) )
            // InternalMyDsl.g:2898:2: ( rule__PhotoActionsFunctions__NameAssignment_1 )
            {
             before(grammarAccess.getPhotoActionsFunctionsAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2899:2: ( rule__PhotoActionsFunctions__NameAssignment_1 )
            // InternalMyDsl.g:2899:3: rule__PhotoActionsFunctions__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PhotoActionsFunctions__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPhotoActionsFunctionsAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__PhotoActionsFunctions__Group__1__Impl"


    // $ANTLR start "rule__PhotoActionsFunctions__Group__2"
    // InternalMyDsl.g:2907:1: rule__PhotoActionsFunctions__Group__2 : rule__PhotoActionsFunctions__Group__2__Impl rule__PhotoActionsFunctions__Group__3 ;
    public final void rule__PhotoActionsFunctions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2911:1: ( rule__PhotoActionsFunctions__Group__2__Impl rule__PhotoActionsFunctions__Group__3 )
            // InternalMyDsl.g:2912:2: rule__PhotoActionsFunctions__Group__2__Impl rule__PhotoActionsFunctions__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__PhotoActionsFunctions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhotoActionsFunctions__Group__3();

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
    // $ANTLR end "rule__PhotoActionsFunctions__Group__2"


    // $ANTLR start "rule__PhotoActionsFunctions__Group__2__Impl"
    // InternalMyDsl.g:2919:1: rule__PhotoActionsFunctions__Group__2__Impl : ( 'ViewExtendedPhoto' ) ;
    public final void rule__PhotoActionsFunctions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2923:1: ( ( 'ViewExtendedPhoto' ) )
            // InternalMyDsl.g:2924:1: ( 'ViewExtendedPhoto' )
            {
            // InternalMyDsl.g:2924:1: ( 'ViewExtendedPhoto' )
            // InternalMyDsl.g:2925:2: 'ViewExtendedPhoto'
            {
             before(grammarAccess.getPhotoActionsFunctionsAccess().getViewExtendedPhotoKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPhotoActionsFunctionsAccess().getViewExtendedPhotoKeyword_2()); 

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
    // $ANTLR end "rule__PhotoActionsFunctions__Group__2__Impl"


    // $ANTLR start "rule__PhotoActionsFunctions__Group__3"
    // InternalMyDsl.g:2934:1: rule__PhotoActionsFunctions__Group__3 : rule__PhotoActionsFunctions__Group__3__Impl rule__PhotoActionsFunctions__Group__4 ;
    public final void rule__PhotoActionsFunctions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2938:1: ( rule__PhotoActionsFunctions__Group__3__Impl rule__PhotoActionsFunctions__Group__4 )
            // InternalMyDsl.g:2939:2: rule__PhotoActionsFunctions__Group__3__Impl rule__PhotoActionsFunctions__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__PhotoActionsFunctions__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhotoActionsFunctions__Group__4();

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
    // $ANTLR end "rule__PhotoActionsFunctions__Group__3"


    // $ANTLR start "rule__PhotoActionsFunctions__Group__3__Impl"
    // InternalMyDsl.g:2946:1: rule__PhotoActionsFunctions__Group__3__Impl : ( ( rule__PhotoActionsFunctions__NameAssignment_3 ) ) ;
    public final void rule__PhotoActionsFunctions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2950:1: ( ( ( rule__PhotoActionsFunctions__NameAssignment_3 ) ) )
            // InternalMyDsl.g:2951:1: ( ( rule__PhotoActionsFunctions__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:2951:1: ( ( rule__PhotoActionsFunctions__NameAssignment_3 ) )
            // InternalMyDsl.g:2952:2: ( rule__PhotoActionsFunctions__NameAssignment_3 )
            {
             before(grammarAccess.getPhotoActionsFunctionsAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:2953:2: ( rule__PhotoActionsFunctions__NameAssignment_3 )
            // InternalMyDsl.g:2953:3: rule__PhotoActionsFunctions__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PhotoActionsFunctions__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPhotoActionsFunctionsAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__PhotoActionsFunctions__Group__3__Impl"


    // $ANTLR start "rule__PhotoActionsFunctions__Group__4"
    // InternalMyDsl.g:2961:1: rule__PhotoActionsFunctions__Group__4 : rule__PhotoActionsFunctions__Group__4__Impl rule__PhotoActionsFunctions__Group__5 ;
    public final void rule__PhotoActionsFunctions__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2965:1: ( rule__PhotoActionsFunctions__Group__4__Impl rule__PhotoActionsFunctions__Group__5 )
            // InternalMyDsl.g:2966:2: rule__PhotoActionsFunctions__Group__4__Impl rule__PhotoActionsFunctions__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__PhotoActionsFunctions__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhotoActionsFunctions__Group__5();

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
    // $ANTLR end "rule__PhotoActionsFunctions__Group__4"


    // $ANTLR start "rule__PhotoActionsFunctions__Group__4__Impl"
    // InternalMyDsl.g:2973:1: rule__PhotoActionsFunctions__Group__4__Impl : ( 'LoadPhoto' ) ;
    public final void rule__PhotoActionsFunctions__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2977:1: ( ( 'LoadPhoto' ) )
            // InternalMyDsl.g:2978:1: ( 'LoadPhoto' )
            {
            // InternalMyDsl.g:2978:1: ( 'LoadPhoto' )
            // InternalMyDsl.g:2979:2: 'LoadPhoto'
            {
             before(grammarAccess.getPhotoActionsFunctionsAccess().getLoadPhotoKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPhotoActionsFunctionsAccess().getLoadPhotoKeyword_4()); 

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
    // $ANTLR end "rule__PhotoActionsFunctions__Group__4__Impl"


    // $ANTLR start "rule__PhotoActionsFunctions__Group__5"
    // InternalMyDsl.g:2988:1: rule__PhotoActionsFunctions__Group__5 : rule__PhotoActionsFunctions__Group__5__Impl ;
    public final void rule__PhotoActionsFunctions__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2992:1: ( rule__PhotoActionsFunctions__Group__5__Impl )
            // InternalMyDsl.g:2993:2: rule__PhotoActionsFunctions__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PhotoActionsFunctions__Group__5__Impl();

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
    // $ANTLR end "rule__PhotoActionsFunctions__Group__5"


    // $ANTLR start "rule__PhotoActionsFunctions__Group__5__Impl"
    // InternalMyDsl.g:2999:1: rule__PhotoActionsFunctions__Group__5__Impl : ( ( rule__PhotoActionsFunctions__NameAssignment_5 ) ) ;
    public final void rule__PhotoActionsFunctions__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3003:1: ( ( ( rule__PhotoActionsFunctions__NameAssignment_5 ) ) )
            // InternalMyDsl.g:3004:1: ( ( rule__PhotoActionsFunctions__NameAssignment_5 ) )
            {
            // InternalMyDsl.g:3004:1: ( ( rule__PhotoActionsFunctions__NameAssignment_5 ) )
            // InternalMyDsl.g:3005:2: ( rule__PhotoActionsFunctions__NameAssignment_5 )
            {
             before(grammarAccess.getPhotoActionsFunctionsAccess().getNameAssignment_5()); 
            // InternalMyDsl.g:3006:2: ( rule__PhotoActionsFunctions__NameAssignment_5 )
            // InternalMyDsl.g:3006:3: rule__PhotoActionsFunctions__NameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__PhotoActionsFunctions__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPhotoActionsFunctionsAccess().getNameAssignment_5()); 

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
    // $ANTLR end "rule__PhotoActionsFunctions__Group__5__Impl"


    // $ANTLR start "rule__LandingActions__Group__0"
    // InternalMyDsl.g:3015:1: rule__LandingActions__Group__0 : rule__LandingActions__Group__0__Impl rule__LandingActions__Group__1 ;
    public final void rule__LandingActions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3019:1: ( rule__LandingActions__Group__0__Impl rule__LandingActions__Group__1 )
            // InternalMyDsl.g:3020:2: rule__LandingActions__Group__0__Impl rule__LandingActions__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__LandingActions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LandingActions__Group__1();

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
    // $ANTLR end "rule__LandingActions__Group__0"


    // $ANTLR start "rule__LandingActions__Group__0__Impl"
    // InternalMyDsl.g:3027:1: rule__LandingActions__Group__0__Impl : ( 'LandingActions' ) ;
    public final void rule__LandingActions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3031:1: ( ( 'LandingActions' ) )
            // InternalMyDsl.g:3032:1: ( 'LandingActions' )
            {
            // InternalMyDsl.g:3032:1: ( 'LandingActions' )
            // InternalMyDsl.g:3033:2: 'LandingActions'
            {
             before(grammarAccess.getLandingActionsAccess().getLandingActionsKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getLandingActionsAccess().getLandingActionsKeyword_0()); 

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
    // $ANTLR end "rule__LandingActions__Group__0__Impl"


    // $ANTLR start "rule__LandingActions__Group__1"
    // InternalMyDsl.g:3042:1: rule__LandingActions__Group__1 : rule__LandingActions__Group__1__Impl rule__LandingActions__Group__2 ;
    public final void rule__LandingActions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3046:1: ( rule__LandingActions__Group__1__Impl rule__LandingActions__Group__2 )
            // InternalMyDsl.g:3047:2: rule__LandingActions__Group__1__Impl rule__LandingActions__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__LandingActions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LandingActions__Group__2();

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
    // $ANTLR end "rule__LandingActions__Group__1"


    // $ANTLR start "rule__LandingActions__Group__1__Impl"
    // InternalMyDsl.g:3054:1: rule__LandingActions__Group__1__Impl : ( ':' ) ;
    public final void rule__LandingActions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3058:1: ( ( ':' ) )
            // InternalMyDsl.g:3059:1: ( ':' )
            {
            // InternalMyDsl.g:3059:1: ( ':' )
            // InternalMyDsl.g:3060:2: ':'
            {
             before(grammarAccess.getLandingActionsAccess().getColonKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLandingActionsAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__LandingActions__Group__1__Impl"


    // $ANTLR start "rule__LandingActions__Group__2"
    // InternalMyDsl.g:3069:1: rule__LandingActions__Group__2 : rule__LandingActions__Group__2__Impl ;
    public final void rule__LandingActions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3073:1: ( rule__LandingActions__Group__2__Impl )
            // InternalMyDsl.g:3074:2: rule__LandingActions__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LandingActions__Group__2__Impl();

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
    // $ANTLR end "rule__LandingActions__Group__2"


    // $ANTLR start "rule__LandingActions__Group__2__Impl"
    // InternalMyDsl.g:3080:1: rule__LandingActions__Group__2__Impl : ( ( rule__LandingActions__ItemsAssignment_2 ) ) ;
    public final void rule__LandingActions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3084:1: ( ( ( rule__LandingActions__ItemsAssignment_2 ) ) )
            // InternalMyDsl.g:3085:1: ( ( rule__LandingActions__ItemsAssignment_2 ) )
            {
            // InternalMyDsl.g:3085:1: ( ( rule__LandingActions__ItemsAssignment_2 ) )
            // InternalMyDsl.g:3086:2: ( rule__LandingActions__ItemsAssignment_2 )
            {
             before(grammarAccess.getLandingActionsAccess().getItemsAssignment_2()); 
            // InternalMyDsl.g:3087:2: ( rule__LandingActions__ItemsAssignment_2 )
            // InternalMyDsl.g:3087:3: rule__LandingActions__ItemsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LandingActions__ItemsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLandingActionsAccess().getItemsAssignment_2()); 

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
    // $ANTLR end "rule__LandingActions__Group__2__Impl"


    // $ANTLR start "rule__LandingFunctions__Group__0"
    // InternalMyDsl.g:3096:1: rule__LandingFunctions__Group__0 : rule__LandingFunctions__Group__0__Impl rule__LandingFunctions__Group__1 ;
    public final void rule__LandingFunctions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3100:1: ( rule__LandingFunctions__Group__0__Impl rule__LandingFunctions__Group__1 )
            // InternalMyDsl.g:3101:2: rule__LandingFunctions__Group__0__Impl rule__LandingFunctions__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__LandingFunctions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LandingFunctions__Group__1();

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
    // $ANTLR end "rule__LandingFunctions__Group__0"


    // $ANTLR start "rule__LandingFunctions__Group__0__Impl"
    // InternalMyDsl.g:3108:1: rule__LandingFunctions__Group__0__Impl : ( 'ViewCarousel' ) ;
    public final void rule__LandingFunctions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3112:1: ( ( 'ViewCarousel' ) )
            // InternalMyDsl.g:3113:1: ( 'ViewCarousel' )
            {
            // InternalMyDsl.g:3113:1: ( 'ViewCarousel' )
            // InternalMyDsl.g:3114:2: 'ViewCarousel'
            {
             before(grammarAccess.getLandingFunctionsAccess().getViewCarouselKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getLandingFunctionsAccess().getViewCarouselKeyword_0()); 

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
    // $ANTLR end "rule__LandingFunctions__Group__0__Impl"


    // $ANTLR start "rule__LandingFunctions__Group__1"
    // InternalMyDsl.g:3123:1: rule__LandingFunctions__Group__1 : rule__LandingFunctions__Group__1__Impl rule__LandingFunctions__Group__2 ;
    public final void rule__LandingFunctions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3127:1: ( rule__LandingFunctions__Group__1__Impl rule__LandingFunctions__Group__2 )
            // InternalMyDsl.g:3128:2: rule__LandingFunctions__Group__1__Impl rule__LandingFunctions__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__LandingFunctions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LandingFunctions__Group__2();

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
    // $ANTLR end "rule__LandingFunctions__Group__1"


    // $ANTLR start "rule__LandingFunctions__Group__1__Impl"
    // InternalMyDsl.g:3135:1: rule__LandingFunctions__Group__1__Impl : ( ( rule__LandingFunctions__NameAssignment_1 ) ) ;
    public final void rule__LandingFunctions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3139:1: ( ( ( rule__LandingFunctions__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3140:1: ( ( rule__LandingFunctions__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3140:1: ( ( rule__LandingFunctions__NameAssignment_1 ) )
            // InternalMyDsl.g:3141:2: ( rule__LandingFunctions__NameAssignment_1 )
            {
             before(grammarAccess.getLandingFunctionsAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3142:2: ( rule__LandingFunctions__NameAssignment_1 )
            // InternalMyDsl.g:3142:3: rule__LandingFunctions__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LandingFunctions__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLandingFunctionsAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__LandingFunctions__Group__1__Impl"


    // $ANTLR start "rule__LandingFunctions__Group__2"
    // InternalMyDsl.g:3150:1: rule__LandingFunctions__Group__2 : rule__LandingFunctions__Group__2__Impl rule__LandingFunctions__Group__3 ;
    public final void rule__LandingFunctions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3154:1: ( rule__LandingFunctions__Group__2__Impl rule__LandingFunctions__Group__3 )
            // InternalMyDsl.g:3155:2: rule__LandingFunctions__Group__2__Impl rule__LandingFunctions__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__LandingFunctions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LandingFunctions__Group__3();

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
    // $ANTLR end "rule__LandingFunctions__Group__2"


    // $ANTLR start "rule__LandingFunctions__Group__2__Impl"
    // InternalMyDsl.g:3162:1: rule__LandingFunctions__Group__2__Impl : ( 'PassPhoto' ) ;
    public final void rule__LandingFunctions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3166:1: ( ( 'PassPhoto' ) )
            // InternalMyDsl.g:3167:1: ( 'PassPhoto' )
            {
            // InternalMyDsl.g:3167:1: ( 'PassPhoto' )
            // InternalMyDsl.g:3168:2: 'PassPhoto'
            {
             before(grammarAccess.getLandingFunctionsAccess().getPassPhotoKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getLandingFunctionsAccess().getPassPhotoKeyword_2()); 

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
    // $ANTLR end "rule__LandingFunctions__Group__2__Impl"


    // $ANTLR start "rule__LandingFunctions__Group__3"
    // InternalMyDsl.g:3177:1: rule__LandingFunctions__Group__3 : rule__LandingFunctions__Group__3__Impl ;
    public final void rule__LandingFunctions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3181:1: ( rule__LandingFunctions__Group__3__Impl )
            // InternalMyDsl.g:3182:2: rule__LandingFunctions__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LandingFunctions__Group__3__Impl();

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
    // $ANTLR end "rule__LandingFunctions__Group__3"


    // $ANTLR start "rule__LandingFunctions__Group__3__Impl"
    // InternalMyDsl.g:3188:1: rule__LandingFunctions__Group__3__Impl : ( ( rule__LandingFunctions__NameAssignment_3 ) ) ;
    public final void rule__LandingFunctions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3192:1: ( ( ( rule__LandingFunctions__NameAssignment_3 ) ) )
            // InternalMyDsl.g:3193:1: ( ( rule__LandingFunctions__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:3193:1: ( ( rule__LandingFunctions__NameAssignment_3 ) )
            // InternalMyDsl.g:3194:2: ( rule__LandingFunctions__NameAssignment_3 )
            {
             before(grammarAccess.getLandingFunctionsAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:3195:2: ( rule__LandingFunctions__NameAssignment_3 )
            // InternalMyDsl.g:3195:3: rule__LandingFunctions__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LandingFunctions__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLandingFunctionsAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__LandingFunctions__Group__3__Impl"


    // $ANTLR start "rule__DomainConnection__Group__0"
    // InternalMyDsl.g:3204:1: rule__DomainConnection__Group__0 : rule__DomainConnection__Group__0__Impl rule__DomainConnection__Group__1 ;
    public final void rule__DomainConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3208:1: ( rule__DomainConnection__Group__0__Impl rule__DomainConnection__Group__1 )
            // InternalMyDsl.g:3209:2: rule__DomainConnection__Group__0__Impl rule__DomainConnection__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DomainConnection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainConnection__Group__1();

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
    // $ANTLR end "rule__DomainConnection__Group__0"


    // $ANTLR start "rule__DomainConnection__Group__0__Impl"
    // InternalMyDsl.g:3216:1: rule__DomainConnection__Group__0__Impl : ( 'DomainRelations' ) ;
    public final void rule__DomainConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3220:1: ( ( 'DomainRelations' ) )
            // InternalMyDsl.g:3221:1: ( 'DomainRelations' )
            {
            // InternalMyDsl.g:3221:1: ( 'DomainRelations' )
            // InternalMyDsl.g:3222:2: 'DomainRelations'
            {
             before(grammarAccess.getDomainConnectionAccess().getDomainRelationsKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDomainConnectionAccess().getDomainRelationsKeyword_0()); 

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
    // $ANTLR end "rule__DomainConnection__Group__0__Impl"


    // $ANTLR start "rule__DomainConnection__Group__1"
    // InternalMyDsl.g:3231:1: rule__DomainConnection__Group__1 : rule__DomainConnection__Group__1__Impl rule__DomainConnection__Group__2 ;
    public final void rule__DomainConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3235:1: ( rule__DomainConnection__Group__1__Impl rule__DomainConnection__Group__2 )
            // InternalMyDsl.g:3236:2: rule__DomainConnection__Group__1__Impl rule__DomainConnection__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DomainConnection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainConnection__Group__2();

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
    // $ANTLR end "rule__DomainConnection__Group__1"


    // $ANTLR start "rule__DomainConnection__Group__1__Impl"
    // InternalMyDsl.g:3243:1: rule__DomainConnection__Group__1__Impl : ( ':' ) ;
    public final void rule__DomainConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3247:1: ( ( ':' ) )
            // InternalMyDsl.g:3248:1: ( ':' )
            {
            // InternalMyDsl.g:3248:1: ( ':' )
            // InternalMyDsl.g:3249:2: ':'
            {
             before(grammarAccess.getDomainConnectionAccess().getColonKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDomainConnectionAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__DomainConnection__Group__1__Impl"


    // $ANTLR start "rule__DomainConnection__Group__2"
    // InternalMyDsl.g:3258:1: rule__DomainConnection__Group__2 : rule__DomainConnection__Group__2__Impl rule__DomainConnection__Group__3 ;
    public final void rule__DomainConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3262:1: ( rule__DomainConnection__Group__2__Impl rule__DomainConnection__Group__3 )
            // InternalMyDsl.g:3263:2: rule__DomainConnection__Group__2__Impl rule__DomainConnection__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__DomainConnection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainConnection__Group__3();

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
    // $ANTLR end "rule__DomainConnection__Group__2"


    // $ANTLR start "rule__DomainConnection__Group__2__Impl"
    // InternalMyDsl.g:3270:1: rule__DomainConnection__Group__2__Impl : ( '{' ) ;
    public final void rule__DomainConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3274:1: ( ( '{' ) )
            // InternalMyDsl.g:3275:1: ( '{' )
            {
            // InternalMyDsl.g:3275:1: ( '{' )
            // InternalMyDsl.g:3276:2: '{'
            {
             before(grammarAccess.getDomainConnectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDomainConnectionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__DomainConnection__Group__2__Impl"


    // $ANTLR start "rule__DomainConnection__Group__3"
    // InternalMyDsl.g:3285:1: rule__DomainConnection__Group__3 : rule__DomainConnection__Group__3__Impl rule__DomainConnection__Group__4 ;
    public final void rule__DomainConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3289:1: ( rule__DomainConnection__Group__3__Impl rule__DomainConnection__Group__4 )
            // InternalMyDsl.g:3290:2: rule__DomainConnection__Group__3__Impl rule__DomainConnection__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__DomainConnection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainConnection__Group__4();

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
    // $ANTLR end "rule__DomainConnection__Group__3"


    // $ANTLR start "rule__DomainConnection__Group__3__Impl"
    // InternalMyDsl.g:3297:1: rule__DomainConnection__Group__3__Impl : ( ( rule__DomainConnection__ElementsAssignment_3 ) ) ;
    public final void rule__DomainConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3301:1: ( ( ( rule__DomainConnection__ElementsAssignment_3 ) ) )
            // InternalMyDsl.g:3302:1: ( ( rule__DomainConnection__ElementsAssignment_3 ) )
            {
            // InternalMyDsl.g:3302:1: ( ( rule__DomainConnection__ElementsAssignment_3 ) )
            // InternalMyDsl.g:3303:2: ( rule__DomainConnection__ElementsAssignment_3 )
            {
             before(grammarAccess.getDomainConnectionAccess().getElementsAssignment_3()); 
            // InternalMyDsl.g:3304:2: ( rule__DomainConnection__ElementsAssignment_3 )
            // InternalMyDsl.g:3304:3: rule__DomainConnection__ElementsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DomainConnection__ElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDomainConnectionAccess().getElementsAssignment_3()); 

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
    // $ANTLR end "rule__DomainConnection__Group__3__Impl"


    // $ANTLR start "rule__DomainConnection__Group__4"
    // InternalMyDsl.g:3312:1: rule__DomainConnection__Group__4 : rule__DomainConnection__Group__4__Impl ;
    public final void rule__DomainConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3316:1: ( rule__DomainConnection__Group__4__Impl )
            // InternalMyDsl.g:3317:2: rule__DomainConnection__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainConnection__Group__4__Impl();

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
    // $ANTLR end "rule__DomainConnection__Group__4"


    // $ANTLR start "rule__DomainConnection__Group__4__Impl"
    // InternalMyDsl.g:3323:1: rule__DomainConnection__Group__4__Impl : ( '}' ) ;
    public final void rule__DomainConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3327:1: ( ( '}' ) )
            // InternalMyDsl.g:3328:1: ( '}' )
            {
            // InternalMyDsl.g:3328:1: ( '}' )
            // InternalMyDsl.g:3329:2: '}'
            {
             before(grammarAccess.getDomainConnectionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDomainConnectionAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__DomainConnection__Group__4__Impl"


    // $ANTLR start "rule__DomainRelations__Group__0"
    // InternalMyDsl.g:3339:1: rule__DomainRelations__Group__0 : rule__DomainRelations__Group__0__Impl rule__DomainRelations__Group__1 ;
    public final void rule__DomainRelations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3343:1: ( rule__DomainRelations__Group__0__Impl rule__DomainRelations__Group__1 )
            // InternalMyDsl.g:3344:2: rule__DomainRelations__Group__0__Impl rule__DomainRelations__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__DomainRelations__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainRelations__Group__1();

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
    // $ANTLR end "rule__DomainRelations__Group__0"


    // $ANTLR start "rule__DomainRelations__Group__0__Impl"
    // InternalMyDsl.g:3351:1: rule__DomainRelations__Group__0__Impl : ( ( rule__DomainRelations__ElementsAssignment_0 ) ) ;
    public final void rule__DomainRelations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3355:1: ( ( ( rule__DomainRelations__ElementsAssignment_0 ) ) )
            // InternalMyDsl.g:3356:1: ( ( rule__DomainRelations__ElementsAssignment_0 ) )
            {
            // InternalMyDsl.g:3356:1: ( ( rule__DomainRelations__ElementsAssignment_0 ) )
            // InternalMyDsl.g:3357:2: ( rule__DomainRelations__ElementsAssignment_0 )
            {
             before(grammarAccess.getDomainRelationsAccess().getElementsAssignment_0()); 
            // InternalMyDsl.g:3358:2: ( rule__DomainRelations__ElementsAssignment_0 )
            // InternalMyDsl.g:3358:3: rule__DomainRelations__ElementsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DomainRelations__ElementsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDomainRelationsAccess().getElementsAssignment_0()); 

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
    // $ANTLR end "rule__DomainRelations__Group__0__Impl"


    // $ANTLR start "rule__DomainRelations__Group__1"
    // InternalMyDsl.g:3366:1: rule__DomainRelations__Group__1 : rule__DomainRelations__Group__1__Impl rule__DomainRelations__Group__2 ;
    public final void rule__DomainRelations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3370:1: ( rule__DomainRelations__Group__1__Impl rule__DomainRelations__Group__2 )
            // InternalMyDsl.g:3371:2: rule__DomainRelations__Group__1__Impl rule__DomainRelations__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__DomainRelations__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainRelations__Group__2();

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
    // $ANTLR end "rule__DomainRelations__Group__1"


    // $ANTLR start "rule__DomainRelations__Group__1__Impl"
    // InternalMyDsl.g:3378:1: rule__DomainRelations__Group__1__Impl : ( ( rule__DomainRelations__NameAssignment_1 ) ) ;
    public final void rule__DomainRelations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3382:1: ( ( ( rule__DomainRelations__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3383:1: ( ( rule__DomainRelations__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3383:1: ( ( rule__DomainRelations__NameAssignment_1 ) )
            // InternalMyDsl.g:3384:2: ( rule__DomainRelations__NameAssignment_1 )
            {
             before(grammarAccess.getDomainRelationsAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3385:2: ( rule__DomainRelations__NameAssignment_1 )
            // InternalMyDsl.g:3385:3: rule__DomainRelations__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DomainRelations__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainRelationsAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DomainRelations__Group__1__Impl"


    // $ANTLR start "rule__DomainRelations__Group__2"
    // InternalMyDsl.g:3393:1: rule__DomainRelations__Group__2 : rule__DomainRelations__Group__2__Impl rule__DomainRelations__Group__3 ;
    public final void rule__DomainRelations__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3397:1: ( rule__DomainRelations__Group__2__Impl rule__DomainRelations__Group__3 )
            // InternalMyDsl.g:3398:2: rule__DomainRelations__Group__2__Impl rule__DomainRelations__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__DomainRelations__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainRelations__Group__3();

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
    // $ANTLR end "rule__DomainRelations__Group__2"


    // $ANTLR start "rule__DomainRelations__Group__2__Impl"
    // InternalMyDsl.g:3405:1: rule__DomainRelations__Group__2__Impl : ( ':' ) ;
    public final void rule__DomainRelations__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3409:1: ( ( ':' ) )
            // InternalMyDsl.g:3410:1: ( ':' )
            {
            // InternalMyDsl.g:3410:1: ( ':' )
            // InternalMyDsl.g:3411:2: ':'
            {
             before(grammarAccess.getDomainRelationsAccess().getColonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDomainRelationsAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__DomainRelations__Group__2__Impl"


    // $ANTLR start "rule__DomainRelations__Group__3"
    // InternalMyDsl.g:3420:1: rule__DomainRelations__Group__3 : rule__DomainRelations__Group__3__Impl rule__DomainRelations__Group__4 ;
    public final void rule__DomainRelations__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3424:1: ( rule__DomainRelations__Group__3__Impl rule__DomainRelations__Group__4 )
            // InternalMyDsl.g:3425:2: rule__DomainRelations__Group__3__Impl rule__DomainRelations__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__DomainRelations__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainRelations__Group__4();

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
    // $ANTLR end "rule__DomainRelations__Group__3"


    // $ANTLR start "rule__DomainRelations__Group__3__Impl"
    // InternalMyDsl.g:3432:1: rule__DomainRelations__Group__3__Impl : ( '{' ) ;
    public final void rule__DomainRelations__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3436:1: ( ( '{' ) )
            // InternalMyDsl.g:3437:1: ( '{' )
            {
            // InternalMyDsl.g:3437:1: ( '{' )
            // InternalMyDsl.g:3438:2: '{'
            {
             before(grammarAccess.getDomainRelationsAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDomainRelationsAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__DomainRelations__Group__3__Impl"


    // $ANTLR start "rule__DomainRelations__Group__4"
    // InternalMyDsl.g:3447:1: rule__DomainRelations__Group__4 : rule__DomainRelations__Group__4__Impl rule__DomainRelations__Group__5 ;
    public final void rule__DomainRelations__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3451:1: ( rule__DomainRelations__Group__4__Impl rule__DomainRelations__Group__5 )
            // InternalMyDsl.g:3452:2: rule__DomainRelations__Group__4__Impl rule__DomainRelations__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__DomainRelations__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainRelations__Group__5();

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
    // $ANTLR end "rule__DomainRelations__Group__4"


    // $ANTLR start "rule__DomainRelations__Group__4__Impl"
    // InternalMyDsl.g:3459:1: rule__DomainRelations__Group__4__Impl : ( ( rule__DomainRelations__ElementsAssignment_4 ) ) ;
    public final void rule__DomainRelations__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3463:1: ( ( ( rule__DomainRelations__ElementsAssignment_4 ) ) )
            // InternalMyDsl.g:3464:1: ( ( rule__DomainRelations__ElementsAssignment_4 ) )
            {
            // InternalMyDsl.g:3464:1: ( ( rule__DomainRelations__ElementsAssignment_4 ) )
            // InternalMyDsl.g:3465:2: ( rule__DomainRelations__ElementsAssignment_4 )
            {
             before(grammarAccess.getDomainRelationsAccess().getElementsAssignment_4()); 
            // InternalMyDsl.g:3466:2: ( rule__DomainRelations__ElementsAssignment_4 )
            // InternalMyDsl.g:3466:3: rule__DomainRelations__ElementsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DomainRelations__ElementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDomainRelationsAccess().getElementsAssignment_4()); 

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
    // $ANTLR end "rule__DomainRelations__Group__4__Impl"


    // $ANTLR start "rule__DomainRelations__Group__5"
    // InternalMyDsl.g:3474:1: rule__DomainRelations__Group__5 : rule__DomainRelations__Group__5__Impl rule__DomainRelations__Group__6 ;
    public final void rule__DomainRelations__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3478:1: ( rule__DomainRelations__Group__5__Impl rule__DomainRelations__Group__6 )
            // InternalMyDsl.g:3479:2: rule__DomainRelations__Group__5__Impl rule__DomainRelations__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__DomainRelations__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainRelations__Group__6();

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
    // $ANTLR end "rule__DomainRelations__Group__5"


    // $ANTLR start "rule__DomainRelations__Group__5__Impl"
    // InternalMyDsl.g:3486:1: rule__DomainRelations__Group__5__Impl : ( '}' ) ;
    public final void rule__DomainRelations__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3490:1: ( ( '}' ) )
            // InternalMyDsl.g:3491:1: ( '}' )
            {
            // InternalMyDsl.g:3491:1: ( '}' )
            // InternalMyDsl.g:3492:2: '}'
            {
             before(grammarAccess.getDomainRelationsAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDomainRelationsAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__DomainRelations__Group__5__Impl"


    // $ANTLR start "rule__DomainRelations__Group__6"
    // InternalMyDsl.g:3501:1: rule__DomainRelations__Group__6 : rule__DomainRelations__Group__6__Impl rule__DomainRelations__Group__7 ;
    public final void rule__DomainRelations__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3505:1: ( rule__DomainRelations__Group__6__Impl rule__DomainRelations__Group__7 )
            // InternalMyDsl.g:3506:2: rule__DomainRelations__Group__6__Impl rule__DomainRelations__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__DomainRelations__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainRelations__Group__7();

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
    // $ANTLR end "rule__DomainRelations__Group__6"


    // $ANTLR start "rule__DomainRelations__Group__6__Impl"
    // InternalMyDsl.g:3513:1: rule__DomainRelations__Group__6__Impl : ( ( rule__DomainRelations__ElementsAssignment_6 ) ) ;
    public final void rule__DomainRelations__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3517:1: ( ( ( rule__DomainRelations__ElementsAssignment_6 ) ) )
            // InternalMyDsl.g:3518:1: ( ( rule__DomainRelations__ElementsAssignment_6 ) )
            {
            // InternalMyDsl.g:3518:1: ( ( rule__DomainRelations__ElementsAssignment_6 ) )
            // InternalMyDsl.g:3519:2: ( rule__DomainRelations__ElementsAssignment_6 )
            {
             before(grammarAccess.getDomainRelationsAccess().getElementsAssignment_6()); 
            // InternalMyDsl.g:3520:2: ( rule__DomainRelations__ElementsAssignment_6 )
            // InternalMyDsl.g:3520:3: rule__DomainRelations__ElementsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__DomainRelations__ElementsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDomainRelationsAccess().getElementsAssignment_6()); 

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
    // $ANTLR end "rule__DomainRelations__Group__6__Impl"


    // $ANTLR start "rule__DomainRelations__Group__7"
    // InternalMyDsl.g:3528:1: rule__DomainRelations__Group__7 : rule__DomainRelations__Group__7__Impl rule__DomainRelations__Group__8 ;
    public final void rule__DomainRelations__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3532:1: ( rule__DomainRelations__Group__7__Impl rule__DomainRelations__Group__8 )
            // InternalMyDsl.g:3533:2: rule__DomainRelations__Group__7__Impl rule__DomainRelations__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__DomainRelations__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainRelations__Group__8();

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
    // $ANTLR end "rule__DomainRelations__Group__7"


    // $ANTLR start "rule__DomainRelations__Group__7__Impl"
    // InternalMyDsl.g:3540:1: rule__DomainRelations__Group__7__Impl : ( ( rule__DomainRelations__NameAssignment_7 ) ) ;
    public final void rule__DomainRelations__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3544:1: ( ( ( rule__DomainRelations__NameAssignment_7 ) ) )
            // InternalMyDsl.g:3545:1: ( ( rule__DomainRelations__NameAssignment_7 ) )
            {
            // InternalMyDsl.g:3545:1: ( ( rule__DomainRelations__NameAssignment_7 ) )
            // InternalMyDsl.g:3546:2: ( rule__DomainRelations__NameAssignment_7 )
            {
             before(grammarAccess.getDomainRelationsAccess().getNameAssignment_7()); 
            // InternalMyDsl.g:3547:2: ( rule__DomainRelations__NameAssignment_7 )
            // InternalMyDsl.g:3547:3: rule__DomainRelations__NameAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__DomainRelations__NameAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDomainRelationsAccess().getNameAssignment_7()); 

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
    // $ANTLR end "rule__DomainRelations__Group__7__Impl"


    // $ANTLR start "rule__DomainRelations__Group__8"
    // InternalMyDsl.g:3555:1: rule__DomainRelations__Group__8 : rule__DomainRelations__Group__8__Impl rule__DomainRelations__Group__9 ;
    public final void rule__DomainRelations__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3559:1: ( rule__DomainRelations__Group__8__Impl rule__DomainRelations__Group__9 )
            // InternalMyDsl.g:3560:2: rule__DomainRelations__Group__8__Impl rule__DomainRelations__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__DomainRelations__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainRelations__Group__9();

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
    // $ANTLR end "rule__DomainRelations__Group__8"


    // $ANTLR start "rule__DomainRelations__Group__8__Impl"
    // InternalMyDsl.g:3567:1: rule__DomainRelations__Group__8__Impl : ( ':' ) ;
    public final void rule__DomainRelations__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3571:1: ( ( ':' ) )
            // InternalMyDsl.g:3572:1: ( ':' )
            {
            // InternalMyDsl.g:3572:1: ( ':' )
            // InternalMyDsl.g:3573:2: ':'
            {
             before(grammarAccess.getDomainRelationsAccess().getColonKeyword_8()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDomainRelationsAccess().getColonKeyword_8()); 

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
    // $ANTLR end "rule__DomainRelations__Group__8__Impl"


    // $ANTLR start "rule__DomainRelations__Group__9"
    // InternalMyDsl.g:3582:1: rule__DomainRelations__Group__9 : rule__DomainRelations__Group__9__Impl rule__DomainRelations__Group__10 ;
    public final void rule__DomainRelations__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3586:1: ( rule__DomainRelations__Group__9__Impl rule__DomainRelations__Group__10 )
            // InternalMyDsl.g:3587:2: rule__DomainRelations__Group__9__Impl rule__DomainRelations__Group__10
            {
            pushFollow(FOLLOW_25);
            rule__DomainRelations__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainRelations__Group__10();

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
    // $ANTLR end "rule__DomainRelations__Group__9"


    // $ANTLR start "rule__DomainRelations__Group__9__Impl"
    // InternalMyDsl.g:3594:1: rule__DomainRelations__Group__9__Impl : ( '{' ) ;
    public final void rule__DomainRelations__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3598:1: ( ( '{' ) )
            // InternalMyDsl.g:3599:1: ( '{' )
            {
            // InternalMyDsl.g:3599:1: ( '{' )
            // InternalMyDsl.g:3600:2: '{'
            {
             before(grammarAccess.getDomainRelationsAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDomainRelationsAccess().getLeftCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__DomainRelations__Group__9__Impl"


    // $ANTLR start "rule__DomainRelations__Group__10"
    // InternalMyDsl.g:3609:1: rule__DomainRelations__Group__10 : rule__DomainRelations__Group__10__Impl rule__DomainRelations__Group__11 ;
    public final void rule__DomainRelations__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3613:1: ( rule__DomainRelations__Group__10__Impl rule__DomainRelations__Group__11 )
            // InternalMyDsl.g:3614:2: rule__DomainRelations__Group__10__Impl rule__DomainRelations__Group__11
            {
            pushFollow(FOLLOW_8);
            rule__DomainRelations__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainRelations__Group__11();

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
    // $ANTLR end "rule__DomainRelations__Group__10"


    // $ANTLR start "rule__DomainRelations__Group__10__Impl"
    // InternalMyDsl.g:3621:1: rule__DomainRelations__Group__10__Impl : ( ( rule__DomainRelations__ElementsAssignment_10 ) ) ;
    public final void rule__DomainRelations__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3625:1: ( ( ( rule__DomainRelations__ElementsAssignment_10 ) ) )
            // InternalMyDsl.g:3626:1: ( ( rule__DomainRelations__ElementsAssignment_10 ) )
            {
            // InternalMyDsl.g:3626:1: ( ( rule__DomainRelations__ElementsAssignment_10 ) )
            // InternalMyDsl.g:3627:2: ( rule__DomainRelations__ElementsAssignment_10 )
            {
             before(grammarAccess.getDomainRelationsAccess().getElementsAssignment_10()); 
            // InternalMyDsl.g:3628:2: ( rule__DomainRelations__ElementsAssignment_10 )
            // InternalMyDsl.g:3628:3: rule__DomainRelations__ElementsAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__DomainRelations__ElementsAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getDomainRelationsAccess().getElementsAssignment_10()); 

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
    // $ANTLR end "rule__DomainRelations__Group__10__Impl"


    // $ANTLR start "rule__DomainRelations__Group__11"
    // InternalMyDsl.g:3636:1: rule__DomainRelations__Group__11 : rule__DomainRelations__Group__11__Impl rule__DomainRelations__Group__12 ;
    public final void rule__DomainRelations__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3640:1: ( rule__DomainRelations__Group__11__Impl rule__DomainRelations__Group__12 )
            // InternalMyDsl.g:3641:2: rule__DomainRelations__Group__11__Impl rule__DomainRelations__Group__12
            {
            pushFollow(FOLLOW_13);
            rule__DomainRelations__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainRelations__Group__12();

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
    // $ANTLR end "rule__DomainRelations__Group__11"


    // $ANTLR start "rule__DomainRelations__Group__11__Impl"
    // InternalMyDsl.g:3648:1: rule__DomainRelations__Group__11__Impl : ( '}' ) ;
    public final void rule__DomainRelations__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3652:1: ( ( '}' ) )
            // InternalMyDsl.g:3653:1: ( '}' )
            {
            // InternalMyDsl.g:3653:1: ( '}' )
            // InternalMyDsl.g:3654:2: '}'
            {
             before(grammarAccess.getDomainRelationsAccess().getRightCurlyBracketKeyword_11()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDomainRelationsAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__DomainRelations__Group__11__Impl"


    // $ANTLR start "rule__DomainRelations__Group__12"
    // InternalMyDsl.g:3663:1: rule__DomainRelations__Group__12 : rule__DomainRelations__Group__12__Impl rule__DomainRelations__Group__13 ;
    public final void rule__DomainRelations__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3667:1: ( rule__DomainRelations__Group__12__Impl rule__DomainRelations__Group__13 )
            // InternalMyDsl.g:3668:2: rule__DomainRelations__Group__12__Impl rule__DomainRelations__Group__13
            {
            pushFollow(FOLLOW_9);
            rule__DomainRelations__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainRelations__Group__13();

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
    // $ANTLR end "rule__DomainRelations__Group__12"


    // $ANTLR start "rule__DomainRelations__Group__12__Impl"
    // InternalMyDsl.g:3675:1: rule__DomainRelations__Group__12__Impl : ( ( rule__DomainRelations__ElementsAssignment_12 ) ) ;
    public final void rule__DomainRelations__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3679:1: ( ( ( rule__DomainRelations__ElementsAssignment_12 ) ) )
            // InternalMyDsl.g:3680:1: ( ( rule__DomainRelations__ElementsAssignment_12 ) )
            {
            // InternalMyDsl.g:3680:1: ( ( rule__DomainRelations__ElementsAssignment_12 ) )
            // InternalMyDsl.g:3681:2: ( rule__DomainRelations__ElementsAssignment_12 )
            {
             before(grammarAccess.getDomainRelationsAccess().getElementsAssignment_12()); 
            // InternalMyDsl.g:3682:2: ( rule__DomainRelations__ElementsAssignment_12 )
            // InternalMyDsl.g:3682:3: rule__DomainRelations__ElementsAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__DomainRelations__ElementsAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getDomainRelationsAccess().getElementsAssignment_12()); 

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
    // $ANTLR end "rule__DomainRelations__Group__12__Impl"


    // $ANTLR start "rule__DomainRelations__Group__13"
    // InternalMyDsl.g:3690:1: rule__DomainRelations__Group__13 : rule__DomainRelations__Group__13__Impl rule__DomainRelations__Group__14 ;
    public final void rule__DomainRelations__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3694:1: ( rule__DomainRelations__Group__13__Impl rule__DomainRelations__Group__14 )
            // InternalMyDsl.g:3695:2: rule__DomainRelations__Group__13__Impl rule__DomainRelations__Group__14
            {
            pushFollow(FOLLOW_3);
            rule__DomainRelations__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainRelations__Group__14();

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
    // $ANTLR end "rule__DomainRelations__Group__13"


    // $ANTLR start "rule__DomainRelations__Group__13__Impl"
    // InternalMyDsl.g:3702:1: rule__DomainRelations__Group__13__Impl : ( ( rule__DomainRelations__NameAssignment_13 ) ) ;
    public final void rule__DomainRelations__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3706:1: ( ( ( rule__DomainRelations__NameAssignment_13 ) ) )
            // InternalMyDsl.g:3707:1: ( ( rule__DomainRelations__NameAssignment_13 ) )
            {
            // InternalMyDsl.g:3707:1: ( ( rule__DomainRelations__NameAssignment_13 ) )
            // InternalMyDsl.g:3708:2: ( rule__DomainRelations__NameAssignment_13 )
            {
             before(grammarAccess.getDomainRelationsAccess().getNameAssignment_13()); 
            // InternalMyDsl.g:3709:2: ( rule__DomainRelations__NameAssignment_13 )
            // InternalMyDsl.g:3709:3: rule__DomainRelations__NameAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__DomainRelations__NameAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getDomainRelationsAccess().getNameAssignment_13()); 

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
    // $ANTLR end "rule__DomainRelations__Group__13__Impl"


    // $ANTLR start "rule__DomainRelations__Group__14"
    // InternalMyDsl.g:3717:1: rule__DomainRelations__Group__14 : rule__DomainRelations__Group__14__Impl rule__DomainRelations__Group__15 ;
    public final void rule__DomainRelations__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3721:1: ( rule__DomainRelations__Group__14__Impl rule__DomainRelations__Group__15 )
            // InternalMyDsl.g:3722:2: rule__DomainRelations__Group__14__Impl rule__DomainRelations__Group__15
            {
            pushFollow(FOLLOW_4);
            rule__DomainRelations__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainRelations__Group__15();

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
    // $ANTLR end "rule__DomainRelations__Group__14"


    // $ANTLR start "rule__DomainRelations__Group__14__Impl"
    // InternalMyDsl.g:3729:1: rule__DomainRelations__Group__14__Impl : ( ':' ) ;
    public final void rule__DomainRelations__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3733:1: ( ( ':' ) )
            // InternalMyDsl.g:3734:1: ( ':' )
            {
            // InternalMyDsl.g:3734:1: ( ':' )
            // InternalMyDsl.g:3735:2: ':'
            {
             before(grammarAccess.getDomainRelationsAccess().getColonKeyword_14()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDomainRelationsAccess().getColonKeyword_14()); 

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
    // $ANTLR end "rule__DomainRelations__Group__14__Impl"


    // $ANTLR start "rule__DomainRelations__Group__15"
    // InternalMyDsl.g:3744:1: rule__DomainRelations__Group__15 : rule__DomainRelations__Group__15__Impl rule__DomainRelations__Group__16 ;
    public final void rule__DomainRelations__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3748:1: ( rule__DomainRelations__Group__15__Impl rule__DomainRelations__Group__16 )
            // InternalMyDsl.g:3749:2: rule__DomainRelations__Group__15__Impl rule__DomainRelations__Group__16
            {
            pushFollow(FOLLOW_27);
            rule__DomainRelations__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainRelations__Group__16();

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
    // $ANTLR end "rule__DomainRelations__Group__15"


    // $ANTLR start "rule__DomainRelations__Group__15__Impl"
    // InternalMyDsl.g:3756:1: rule__DomainRelations__Group__15__Impl : ( '{' ) ;
    public final void rule__DomainRelations__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3760:1: ( ( '{' ) )
            // InternalMyDsl.g:3761:1: ( '{' )
            {
            // InternalMyDsl.g:3761:1: ( '{' )
            // InternalMyDsl.g:3762:2: '{'
            {
             before(grammarAccess.getDomainRelationsAccess().getLeftCurlyBracketKeyword_15()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDomainRelationsAccess().getLeftCurlyBracketKeyword_15()); 

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
    // $ANTLR end "rule__DomainRelations__Group__15__Impl"


    // $ANTLR start "rule__DomainRelations__Group__16"
    // InternalMyDsl.g:3771:1: rule__DomainRelations__Group__16 : rule__DomainRelations__Group__16__Impl rule__DomainRelations__Group__17 ;
    public final void rule__DomainRelations__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3775:1: ( rule__DomainRelations__Group__16__Impl rule__DomainRelations__Group__17 )
            // InternalMyDsl.g:3776:2: rule__DomainRelations__Group__16__Impl rule__DomainRelations__Group__17
            {
            pushFollow(FOLLOW_8);
            rule__DomainRelations__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainRelations__Group__17();

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
    // $ANTLR end "rule__DomainRelations__Group__16"


    // $ANTLR start "rule__DomainRelations__Group__16__Impl"
    // InternalMyDsl.g:3783:1: rule__DomainRelations__Group__16__Impl : ( ( rule__DomainRelations__ElementsAssignment_16 ) ) ;
    public final void rule__DomainRelations__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3787:1: ( ( ( rule__DomainRelations__ElementsAssignment_16 ) ) )
            // InternalMyDsl.g:3788:1: ( ( rule__DomainRelations__ElementsAssignment_16 ) )
            {
            // InternalMyDsl.g:3788:1: ( ( rule__DomainRelations__ElementsAssignment_16 ) )
            // InternalMyDsl.g:3789:2: ( rule__DomainRelations__ElementsAssignment_16 )
            {
             before(grammarAccess.getDomainRelationsAccess().getElementsAssignment_16()); 
            // InternalMyDsl.g:3790:2: ( rule__DomainRelations__ElementsAssignment_16 )
            // InternalMyDsl.g:3790:3: rule__DomainRelations__ElementsAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__DomainRelations__ElementsAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getDomainRelationsAccess().getElementsAssignment_16()); 

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
    // $ANTLR end "rule__DomainRelations__Group__16__Impl"


    // $ANTLR start "rule__DomainRelations__Group__17"
    // InternalMyDsl.g:3798:1: rule__DomainRelations__Group__17 : rule__DomainRelations__Group__17__Impl rule__DomainRelations__Group__18 ;
    public final void rule__DomainRelations__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3802:1: ( rule__DomainRelations__Group__17__Impl rule__DomainRelations__Group__18 )
            // InternalMyDsl.g:3803:2: rule__DomainRelations__Group__17__Impl rule__DomainRelations__Group__18
            {
            pushFollow(FOLLOW_19);
            rule__DomainRelations__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainRelations__Group__18();

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
    // $ANTLR end "rule__DomainRelations__Group__17"


    // $ANTLR start "rule__DomainRelations__Group__17__Impl"
    // InternalMyDsl.g:3810:1: rule__DomainRelations__Group__17__Impl : ( '}' ) ;
    public final void rule__DomainRelations__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3814:1: ( ( '}' ) )
            // InternalMyDsl.g:3815:1: ( '}' )
            {
            // InternalMyDsl.g:3815:1: ( '}' )
            // InternalMyDsl.g:3816:2: '}'
            {
             before(grammarAccess.getDomainRelationsAccess().getRightCurlyBracketKeyword_17()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDomainRelationsAccess().getRightCurlyBracketKeyword_17()); 

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
    // $ANTLR end "rule__DomainRelations__Group__17__Impl"


    // $ANTLR start "rule__DomainRelations__Group__18"
    // InternalMyDsl.g:3825:1: rule__DomainRelations__Group__18 : rule__DomainRelations__Group__18__Impl rule__DomainRelations__Group__19 ;
    public final void rule__DomainRelations__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3829:1: ( rule__DomainRelations__Group__18__Impl rule__DomainRelations__Group__19 )
            // InternalMyDsl.g:3830:2: rule__DomainRelations__Group__18__Impl rule__DomainRelations__Group__19
            {
            pushFollow(FOLLOW_9);
            rule__DomainRelations__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainRelations__Group__19();

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
    // $ANTLR end "rule__DomainRelations__Group__18"


    // $ANTLR start "rule__DomainRelations__Group__18__Impl"
    // InternalMyDsl.g:3837:1: rule__DomainRelations__Group__18__Impl : ( ( rule__DomainRelations__ElementsAssignment_18 ) ) ;
    public final void rule__DomainRelations__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3841:1: ( ( ( rule__DomainRelations__ElementsAssignment_18 ) ) )
            // InternalMyDsl.g:3842:1: ( ( rule__DomainRelations__ElementsAssignment_18 ) )
            {
            // InternalMyDsl.g:3842:1: ( ( rule__DomainRelations__ElementsAssignment_18 ) )
            // InternalMyDsl.g:3843:2: ( rule__DomainRelations__ElementsAssignment_18 )
            {
             before(grammarAccess.getDomainRelationsAccess().getElementsAssignment_18()); 
            // InternalMyDsl.g:3844:2: ( rule__DomainRelations__ElementsAssignment_18 )
            // InternalMyDsl.g:3844:3: rule__DomainRelations__ElementsAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__DomainRelations__ElementsAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getDomainRelationsAccess().getElementsAssignment_18()); 

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
    // $ANTLR end "rule__DomainRelations__Group__18__Impl"


    // $ANTLR start "rule__DomainRelations__Group__19"
    // InternalMyDsl.g:3852:1: rule__DomainRelations__Group__19 : rule__DomainRelations__Group__19__Impl rule__DomainRelations__Group__20 ;
    public final void rule__DomainRelations__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3856:1: ( rule__DomainRelations__Group__19__Impl rule__DomainRelations__Group__20 )
            // InternalMyDsl.g:3857:2: rule__DomainRelations__Group__19__Impl rule__DomainRelations__Group__20
            {
            pushFollow(FOLLOW_3);
            rule__DomainRelations__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainRelations__Group__20();

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
    // $ANTLR end "rule__DomainRelations__Group__19"


    // $ANTLR start "rule__DomainRelations__Group__19__Impl"
    // InternalMyDsl.g:3864:1: rule__DomainRelations__Group__19__Impl : ( ( rule__DomainRelations__NameAssignment_19 ) ) ;
    public final void rule__DomainRelations__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3868:1: ( ( ( rule__DomainRelations__NameAssignment_19 ) ) )
            // InternalMyDsl.g:3869:1: ( ( rule__DomainRelations__NameAssignment_19 ) )
            {
            // InternalMyDsl.g:3869:1: ( ( rule__DomainRelations__NameAssignment_19 ) )
            // InternalMyDsl.g:3870:2: ( rule__DomainRelations__NameAssignment_19 )
            {
             before(grammarAccess.getDomainRelationsAccess().getNameAssignment_19()); 
            // InternalMyDsl.g:3871:2: ( rule__DomainRelations__NameAssignment_19 )
            // InternalMyDsl.g:3871:3: rule__DomainRelations__NameAssignment_19
            {
            pushFollow(FOLLOW_2);
            rule__DomainRelations__NameAssignment_19();

            state._fsp--;


            }

             after(grammarAccess.getDomainRelationsAccess().getNameAssignment_19()); 

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
    // $ANTLR end "rule__DomainRelations__Group__19__Impl"


    // $ANTLR start "rule__DomainRelations__Group__20"
    // InternalMyDsl.g:3879:1: rule__DomainRelations__Group__20 : rule__DomainRelations__Group__20__Impl rule__DomainRelations__Group__21 ;
    public final void rule__DomainRelations__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3883:1: ( rule__DomainRelations__Group__20__Impl rule__DomainRelations__Group__21 )
            // InternalMyDsl.g:3884:2: rule__DomainRelations__Group__20__Impl rule__DomainRelations__Group__21
            {
            pushFollow(FOLLOW_4);
            rule__DomainRelations__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainRelations__Group__21();

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
    // $ANTLR end "rule__DomainRelations__Group__20"


    // $ANTLR start "rule__DomainRelations__Group__20__Impl"
    // InternalMyDsl.g:3891:1: rule__DomainRelations__Group__20__Impl : ( ':' ) ;
    public final void rule__DomainRelations__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3895:1: ( ( ':' ) )
            // InternalMyDsl.g:3896:1: ( ':' )
            {
            // InternalMyDsl.g:3896:1: ( ':' )
            // InternalMyDsl.g:3897:2: ':'
            {
             before(grammarAccess.getDomainRelationsAccess().getColonKeyword_20()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDomainRelationsAccess().getColonKeyword_20()); 

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
    // $ANTLR end "rule__DomainRelations__Group__20__Impl"


    // $ANTLR start "rule__DomainRelations__Group__21"
    // InternalMyDsl.g:3906:1: rule__DomainRelations__Group__21 : rule__DomainRelations__Group__21__Impl rule__DomainRelations__Group__22 ;
    public final void rule__DomainRelations__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3910:1: ( rule__DomainRelations__Group__21__Impl rule__DomainRelations__Group__22 )
            // InternalMyDsl.g:3911:2: rule__DomainRelations__Group__21__Impl rule__DomainRelations__Group__22
            {
            pushFollow(FOLLOW_18);
            rule__DomainRelations__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainRelations__Group__22();

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
    // $ANTLR end "rule__DomainRelations__Group__21"


    // $ANTLR start "rule__DomainRelations__Group__21__Impl"
    // InternalMyDsl.g:3918:1: rule__DomainRelations__Group__21__Impl : ( '{' ) ;
    public final void rule__DomainRelations__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3922:1: ( ( '{' ) )
            // InternalMyDsl.g:3923:1: ( '{' )
            {
            // InternalMyDsl.g:3923:1: ( '{' )
            // InternalMyDsl.g:3924:2: '{'
            {
             before(grammarAccess.getDomainRelationsAccess().getLeftCurlyBracketKeyword_21()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDomainRelationsAccess().getLeftCurlyBracketKeyword_21()); 

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
    // $ANTLR end "rule__DomainRelations__Group__21__Impl"


    // $ANTLR start "rule__DomainRelations__Group__22"
    // InternalMyDsl.g:3933:1: rule__DomainRelations__Group__22 : rule__DomainRelations__Group__22__Impl rule__DomainRelations__Group__23 ;
    public final void rule__DomainRelations__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3937:1: ( rule__DomainRelations__Group__22__Impl rule__DomainRelations__Group__23 )
            // InternalMyDsl.g:3938:2: rule__DomainRelations__Group__22__Impl rule__DomainRelations__Group__23
            {
            pushFollow(FOLLOW_8);
            rule__DomainRelations__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainRelations__Group__23();

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
    // $ANTLR end "rule__DomainRelations__Group__22"


    // $ANTLR start "rule__DomainRelations__Group__22__Impl"
    // InternalMyDsl.g:3945:1: rule__DomainRelations__Group__22__Impl : ( ( rule__DomainRelations__ElementsAssignment_22 ) ) ;
    public final void rule__DomainRelations__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3949:1: ( ( ( rule__DomainRelations__ElementsAssignment_22 ) ) )
            // InternalMyDsl.g:3950:1: ( ( rule__DomainRelations__ElementsAssignment_22 ) )
            {
            // InternalMyDsl.g:3950:1: ( ( rule__DomainRelations__ElementsAssignment_22 ) )
            // InternalMyDsl.g:3951:2: ( rule__DomainRelations__ElementsAssignment_22 )
            {
             before(grammarAccess.getDomainRelationsAccess().getElementsAssignment_22()); 
            // InternalMyDsl.g:3952:2: ( rule__DomainRelations__ElementsAssignment_22 )
            // InternalMyDsl.g:3952:3: rule__DomainRelations__ElementsAssignment_22
            {
            pushFollow(FOLLOW_2);
            rule__DomainRelations__ElementsAssignment_22();

            state._fsp--;


            }

             after(grammarAccess.getDomainRelationsAccess().getElementsAssignment_22()); 

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
    // $ANTLR end "rule__DomainRelations__Group__22__Impl"


    // $ANTLR start "rule__DomainRelations__Group__23"
    // InternalMyDsl.g:3960:1: rule__DomainRelations__Group__23 : rule__DomainRelations__Group__23__Impl ;
    public final void rule__DomainRelations__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3964:1: ( rule__DomainRelations__Group__23__Impl )
            // InternalMyDsl.g:3965:2: rule__DomainRelations__Group__23__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainRelations__Group__23__Impl();

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
    // $ANTLR end "rule__DomainRelations__Group__23"


    // $ANTLR start "rule__DomainRelations__Group__23__Impl"
    // InternalMyDsl.g:3971:1: rule__DomainRelations__Group__23__Impl : ( '}' ) ;
    public final void rule__DomainRelations__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3975:1: ( ( '}' ) )
            // InternalMyDsl.g:3976:1: ( '}' )
            {
            // InternalMyDsl.g:3976:1: ( '}' )
            // InternalMyDsl.g:3977:2: '}'
            {
             before(grammarAccess.getDomainRelationsAccess().getRightCurlyBracketKeyword_23()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDomainRelationsAccess().getRightCurlyBracketKeyword_23()); 

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
    // $ANTLR end "rule__DomainRelations__Group__23__Impl"


    // $ANTLR start "rule__Architecture__Group__0"
    // InternalMyDsl.g:3987:1: rule__Architecture__Group__0 : rule__Architecture__Group__0__Impl rule__Architecture__Group__1 ;
    public final void rule__Architecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3991:1: ( rule__Architecture__Group__0__Impl rule__Architecture__Group__1 )
            // InternalMyDsl.g:3992:2: rule__Architecture__Group__0__Impl rule__Architecture__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:3999:1: rule__Architecture__Group__0__Impl : ( 'Architecture:' ) ;
    public final void rule__Architecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4003:1: ( ( 'Architecture:' ) )
            // InternalMyDsl.g:4004:1: ( 'Architecture:' )
            {
            // InternalMyDsl.g:4004:1: ( 'Architecture:' )
            // InternalMyDsl.g:4005:2: 'Architecture:'
            {
             before(grammarAccess.getArchitectureAccess().getArchitectureKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:4014:1: rule__Architecture__Group__1 : rule__Architecture__Group__1__Impl rule__Architecture__Group__2 ;
    public final void rule__Architecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4018:1: ( rule__Architecture__Group__1__Impl rule__Architecture__Group__2 )
            // InternalMyDsl.g:4019:2: rule__Architecture__Group__1__Impl rule__Architecture__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:4026:1: rule__Architecture__Group__1__Impl : ( '{' ) ;
    public final void rule__Architecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4030:1: ( ( '{' ) )
            // InternalMyDsl.g:4031:1: ( '{' )
            {
            // InternalMyDsl.g:4031:1: ( '{' )
            // InternalMyDsl.g:4032:2: '{'
            {
             before(grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
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
    // InternalMyDsl.g:4041:1: rule__Architecture__Group__2 : rule__Architecture__Group__2__Impl rule__Architecture__Group__3 ;
    public final void rule__Architecture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4045:1: ( rule__Architecture__Group__2__Impl rule__Architecture__Group__3 )
            // InternalMyDsl.g:4046:2: rule__Architecture__Group__2__Impl rule__Architecture__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:4053:1: rule__Architecture__Group__2__Impl : ( ( rule__Architecture__NameAssignment_2 ) ) ;
    public final void rule__Architecture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4057:1: ( ( ( rule__Architecture__NameAssignment_2 ) ) )
            // InternalMyDsl.g:4058:1: ( ( rule__Architecture__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:4058:1: ( ( rule__Architecture__NameAssignment_2 ) )
            // InternalMyDsl.g:4059:2: ( rule__Architecture__NameAssignment_2 )
            {
             before(grammarAccess.getArchitectureAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:4060:2: ( rule__Architecture__NameAssignment_2 )
            // InternalMyDsl.g:4060:3: rule__Architecture__NameAssignment_2
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
    // InternalMyDsl.g:4068:1: rule__Architecture__Group__3 : rule__Architecture__Group__3__Impl ;
    public final void rule__Architecture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4072:1: ( rule__Architecture__Group__3__Impl )
            // InternalMyDsl.g:4073:2: rule__Architecture__Group__3__Impl
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
    // InternalMyDsl.g:4079:1: rule__Architecture__Group__3__Impl : ( '}' ) ;
    public final void rule__Architecture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4083:1: ( ( '}' ) )
            // InternalMyDsl.g:4084:1: ( '}' )
            {
            // InternalMyDsl.g:4084:1: ( '}' )
            // InternalMyDsl.g:4085:2: '}'
            {
             before(grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:4095:1: rule__Technology__Group__0 : rule__Technology__Group__0__Impl rule__Technology__Group__1 ;
    public final void rule__Technology__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4099:1: ( rule__Technology__Group__0__Impl rule__Technology__Group__1 )
            // InternalMyDsl.g:4100:2: rule__Technology__Group__0__Impl rule__Technology__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:4107:1: rule__Technology__Group__0__Impl : ( 'Technology' ) ;
    public final void rule__Technology__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4111:1: ( ( 'Technology' ) )
            // InternalMyDsl.g:4112:1: ( 'Technology' )
            {
            // InternalMyDsl.g:4112:1: ( 'Technology' )
            // InternalMyDsl.g:4113:2: 'Technology'
            {
             before(grammarAccess.getTechnologyAccess().getTechnologyKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:4122:1: rule__Technology__Group__1 : rule__Technology__Group__1__Impl rule__Technology__Group__2 ;
    public final void rule__Technology__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4126:1: ( rule__Technology__Group__1__Impl rule__Technology__Group__2 )
            // InternalMyDsl.g:4127:2: rule__Technology__Group__1__Impl rule__Technology__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:4134:1: rule__Technology__Group__1__Impl : ( ( rule__Technology__NameAssignment_1 ) ) ;
    public final void rule__Technology__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4138:1: ( ( ( rule__Technology__NameAssignment_1 ) ) )
            // InternalMyDsl.g:4139:1: ( ( rule__Technology__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:4139:1: ( ( rule__Technology__NameAssignment_1 ) )
            // InternalMyDsl.g:4140:2: ( rule__Technology__NameAssignment_1 )
            {
             before(grammarAccess.getTechnologyAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4141:2: ( rule__Technology__NameAssignment_1 )
            // InternalMyDsl.g:4141:3: rule__Technology__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Technology__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTechnologyAccess().getNameAssignment_1()); 

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
    // InternalMyDsl.g:4149:1: rule__Technology__Group__2 : rule__Technology__Group__2__Impl rule__Technology__Group__3 ;
    public final void rule__Technology__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4153:1: ( rule__Technology__Group__2__Impl rule__Technology__Group__3 )
            // InternalMyDsl.g:4154:2: rule__Technology__Group__2__Impl rule__Technology__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:4161:1: rule__Technology__Group__2__Impl : ( ':' ) ;
    public final void rule__Technology__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4165:1: ( ( ':' ) )
            // InternalMyDsl.g:4166:1: ( ':' )
            {
            // InternalMyDsl.g:4166:1: ( ':' )
            // InternalMyDsl.g:4167:2: ':'
            {
             before(grammarAccess.getTechnologyAccess().getColonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getColonKeyword_2()); 

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
    // InternalMyDsl.g:4176:1: rule__Technology__Group__3 : rule__Technology__Group__3__Impl rule__Technology__Group__4 ;
    public final void rule__Technology__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4180:1: ( rule__Technology__Group__3__Impl rule__Technology__Group__4 )
            // InternalMyDsl.g:4181:2: rule__Technology__Group__3__Impl rule__Technology__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__Technology__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group__4();

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
    // InternalMyDsl.g:4188:1: rule__Technology__Group__3__Impl : ( '{' ) ;
    public final void rule__Technology__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4192:1: ( ( '{' ) )
            // InternalMyDsl.g:4193:1: ( '{' )
            {
            // InternalMyDsl.g:4193:1: ( '{' )
            // InternalMyDsl.g:4194:2: '{'
            {
             before(grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_3()); 

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


    // $ANTLR start "rule__Technology__Group__4"
    // InternalMyDsl.g:4203:1: rule__Technology__Group__4 : rule__Technology__Group__4__Impl rule__Technology__Group__5 ;
    public final void rule__Technology__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4207:1: ( rule__Technology__Group__4__Impl rule__Technology__Group__5 )
            // InternalMyDsl.g:4208:2: rule__Technology__Group__4__Impl rule__Technology__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Technology__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technology__Group__5();

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
    // $ANTLR end "rule__Technology__Group__4"


    // $ANTLR start "rule__Technology__Group__4__Impl"
    // InternalMyDsl.g:4215:1: rule__Technology__Group__4__Impl : ( ( rule__Technology__ElementsAssignment_4 ) ) ;
    public final void rule__Technology__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4219:1: ( ( ( rule__Technology__ElementsAssignment_4 ) ) )
            // InternalMyDsl.g:4220:1: ( ( rule__Technology__ElementsAssignment_4 ) )
            {
            // InternalMyDsl.g:4220:1: ( ( rule__Technology__ElementsAssignment_4 ) )
            // InternalMyDsl.g:4221:2: ( rule__Technology__ElementsAssignment_4 )
            {
             before(grammarAccess.getTechnologyAccess().getElementsAssignment_4()); 
            // InternalMyDsl.g:4222:2: ( rule__Technology__ElementsAssignment_4 )
            // InternalMyDsl.g:4222:3: rule__Technology__ElementsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Technology__ElementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTechnologyAccess().getElementsAssignment_4()); 

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
    // $ANTLR end "rule__Technology__Group__4__Impl"


    // $ANTLR start "rule__Technology__Group__5"
    // InternalMyDsl.g:4230:1: rule__Technology__Group__5 : rule__Technology__Group__5__Impl ;
    public final void rule__Technology__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4234:1: ( rule__Technology__Group__5__Impl )
            // InternalMyDsl.g:4235:2: rule__Technology__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Technology__Group__5__Impl();

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
    // $ANTLR end "rule__Technology__Group__5"


    // $ANTLR start "rule__Technology__Group__5__Impl"
    // InternalMyDsl.g:4241:1: rule__Technology__Group__5__Impl : ( '}' ) ;
    public final void rule__Technology__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4245:1: ( ( '}' ) )
            // InternalMyDsl.g:4246:1: ( '}' )
            {
            // InternalMyDsl.g:4246:1: ( '}' )
            // InternalMyDsl.g:4247:2: '}'
            {
             before(grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Technology__Group__5__Impl"


    // $ANTLR start "rule__Technologies__Group__0"
    // InternalMyDsl.g:4257:1: rule__Technologies__Group__0 : rule__Technologies__Group__0__Impl rule__Technologies__Group__1 ;
    public final void rule__Technologies__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4261:1: ( rule__Technologies__Group__0__Impl rule__Technologies__Group__1 )
            // InternalMyDsl.g:4262:2: rule__Technologies__Group__0__Impl rule__Technologies__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Technologies__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technologies__Group__1();

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
    // $ANTLR end "rule__Technologies__Group__0"


    // $ANTLR start "rule__Technologies__Group__0__Impl"
    // InternalMyDsl.g:4269:1: rule__Technologies__Group__0__Impl : ( ( rule__Technologies__FactorsAssignment_0 ) ) ;
    public final void rule__Technologies__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4273:1: ( ( ( rule__Technologies__FactorsAssignment_0 ) ) )
            // InternalMyDsl.g:4274:1: ( ( rule__Technologies__FactorsAssignment_0 ) )
            {
            // InternalMyDsl.g:4274:1: ( ( rule__Technologies__FactorsAssignment_0 ) )
            // InternalMyDsl.g:4275:2: ( rule__Technologies__FactorsAssignment_0 )
            {
             before(grammarAccess.getTechnologiesAccess().getFactorsAssignment_0()); 
            // InternalMyDsl.g:4276:2: ( rule__Technologies__FactorsAssignment_0 )
            // InternalMyDsl.g:4276:3: rule__Technologies__FactorsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Technologies__FactorsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTechnologiesAccess().getFactorsAssignment_0()); 

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
    // $ANTLR end "rule__Technologies__Group__0__Impl"


    // $ANTLR start "rule__Technologies__Group__1"
    // InternalMyDsl.g:4284:1: rule__Technologies__Group__1 : rule__Technologies__Group__1__Impl rule__Technologies__Group__2 ;
    public final void rule__Technologies__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4288:1: ( rule__Technologies__Group__1__Impl rule__Technologies__Group__2 )
            // InternalMyDsl.g:4289:2: rule__Technologies__Group__1__Impl rule__Technologies__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__Technologies__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technologies__Group__2();

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
    // $ANTLR end "rule__Technologies__Group__1"


    // $ANTLR start "rule__Technologies__Group__1__Impl"
    // InternalMyDsl.g:4296:1: rule__Technologies__Group__1__Impl : ( ( rule__Technologies__FactorsAssignment_1 ) ) ;
    public final void rule__Technologies__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4300:1: ( ( ( rule__Technologies__FactorsAssignment_1 ) ) )
            // InternalMyDsl.g:4301:1: ( ( rule__Technologies__FactorsAssignment_1 ) )
            {
            // InternalMyDsl.g:4301:1: ( ( rule__Technologies__FactorsAssignment_1 ) )
            // InternalMyDsl.g:4302:2: ( rule__Technologies__FactorsAssignment_1 )
            {
             before(grammarAccess.getTechnologiesAccess().getFactorsAssignment_1()); 
            // InternalMyDsl.g:4303:2: ( rule__Technologies__FactorsAssignment_1 )
            // InternalMyDsl.g:4303:3: rule__Technologies__FactorsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Technologies__FactorsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTechnologiesAccess().getFactorsAssignment_1()); 

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
    // $ANTLR end "rule__Technologies__Group__1__Impl"


    // $ANTLR start "rule__Technologies__Group__2"
    // InternalMyDsl.g:4311:1: rule__Technologies__Group__2 : rule__Technologies__Group__2__Impl rule__Technologies__Group__3 ;
    public final void rule__Technologies__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4315:1: ( rule__Technologies__Group__2__Impl rule__Technologies__Group__3 )
            // InternalMyDsl.g:4316:2: rule__Technologies__Group__2__Impl rule__Technologies__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__Technologies__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technologies__Group__3();

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
    // $ANTLR end "rule__Technologies__Group__2"


    // $ANTLR start "rule__Technologies__Group__2__Impl"
    // InternalMyDsl.g:4323:1: rule__Technologies__Group__2__Impl : ( ( rule__Technologies__FactorsAssignment_2 ) ) ;
    public final void rule__Technologies__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4327:1: ( ( ( rule__Technologies__FactorsAssignment_2 ) ) )
            // InternalMyDsl.g:4328:1: ( ( rule__Technologies__FactorsAssignment_2 ) )
            {
            // InternalMyDsl.g:4328:1: ( ( rule__Technologies__FactorsAssignment_2 ) )
            // InternalMyDsl.g:4329:2: ( rule__Technologies__FactorsAssignment_2 )
            {
             before(grammarAccess.getTechnologiesAccess().getFactorsAssignment_2()); 
            // InternalMyDsl.g:4330:2: ( rule__Technologies__FactorsAssignment_2 )
            // InternalMyDsl.g:4330:3: rule__Technologies__FactorsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Technologies__FactorsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTechnologiesAccess().getFactorsAssignment_2()); 

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
    // $ANTLR end "rule__Technologies__Group__2__Impl"


    // $ANTLR start "rule__Technologies__Group__3"
    // InternalMyDsl.g:4338:1: rule__Technologies__Group__3 : rule__Technologies__Group__3__Impl ;
    public final void rule__Technologies__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4342:1: ( rule__Technologies__Group__3__Impl )
            // InternalMyDsl.g:4343:2: rule__Technologies__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Technologies__Group__3__Impl();

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
    // $ANTLR end "rule__Technologies__Group__3"


    // $ANTLR start "rule__Technologies__Group__3__Impl"
    // InternalMyDsl.g:4349:1: rule__Technologies__Group__3__Impl : ( ( rule__Technologies__FactorsAssignment_3 ) ) ;
    public final void rule__Technologies__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4353:1: ( ( ( rule__Technologies__FactorsAssignment_3 ) ) )
            // InternalMyDsl.g:4354:1: ( ( rule__Technologies__FactorsAssignment_3 ) )
            {
            // InternalMyDsl.g:4354:1: ( ( rule__Technologies__FactorsAssignment_3 ) )
            // InternalMyDsl.g:4355:2: ( rule__Technologies__FactorsAssignment_3 )
            {
             before(grammarAccess.getTechnologiesAccess().getFactorsAssignment_3()); 
            // InternalMyDsl.g:4356:2: ( rule__Technologies__FactorsAssignment_3 )
            // InternalMyDsl.g:4356:3: rule__Technologies__FactorsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Technologies__FactorsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTechnologiesAccess().getFactorsAssignment_3()); 

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
    // $ANTLR end "rule__Technologies__Group__3__Impl"


    // $ANTLR start "rule__React__Group__0"
    // InternalMyDsl.g:4365:1: rule__React__Group__0 : rule__React__Group__0__Impl rule__React__Group__1 ;
    public final void rule__React__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4369:1: ( rule__React__Group__0__Impl rule__React__Group__1 )
            // InternalMyDsl.g:4370:2: rule__React__Group__0__Impl rule__React__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__React__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__React__Group__1();

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
    // $ANTLR end "rule__React__Group__0"


    // $ANTLR start "rule__React__Group__0__Impl"
    // InternalMyDsl.g:4377:1: rule__React__Group__0__Impl : ( 'React' ) ;
    public final void rule__React__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4381:1: ( ( 'React' ) )
            // InternalMyDsl.g:4382:1: ( 'React' )
            {
            // InternalMyDsl.g:4382:1: ( 'React' )
            // InternalMyDsl.g:4383:2: 'React'
            {
             before(grammarAccess.getReactAccess().getReactKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getReactAccess().getReactKeyword_0()); 

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
    // $ANTLR end "rule__React__Group__0__Impl"


    // $ANTLR start "rule__React__Group__1"
    // InternalMyDsl.g:4392:1: rule__React__Group__1 : rule__React__Group__1__Impl rule__React__Group__2 ;
    public final void rule__React__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4396:1: ( rule__React__Group__1__Impl rule__React__Group__2 )
            // InternalMyDsl.g:4397:2: rule__React__Group__1__Impl rule__React__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__React__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__React__Group__2();

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
    // $ANTLR end "rule__React__Group__1"


    // $ANTLR start "rule__React__Group__1__Impl"
    // InternalMyDsl.g:4404:1: rule__React__Group__1__Impl : ( ( rule__React__NameAssignment_1 ) ) ;
    public final void rule__React__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4408:1: ( ( ( rule__React__NameAssignment_1 ) ) )
            // InternalMyDsl.g:4409:1: ( ( rule__React__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:4409:1: ( ( rule__React__NameAssignment_1 ) )
            // InternalMyDsl.g:4410:2: ( rule__React__NameAssignment_1 )
            {
             before(grammarAccess.getReactAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4411:2: ( rule__React__NameAssignment_1 )
            // InternalMyDsl.g:4411:3: rule__React__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__React__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReactAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__React__Group__1__Impl"


    // $ANTLR start "rule__React__Group__2"
    // InternalMyDsl.g:4419:1: rule__React__Group__2 : rule__React__Group__2__Impl rule__React__Group__3 ;
    public final void rule__React__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4423:1: ( rule__React__Group__2__Impl rule__React__Group__3 )
            // InternalMyDsl.g:4424:2: rule__React__Group__2__Impl rule__React__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__React__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__React__Group__3();

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
    // $ANTLR end "rule__React__Group__2"


    // $ANTLR start "rule__React__Group__2__Impl"
    // InternalMyDsl.g:4431:1: rule__React__Group__2__Impl : ( ':' ) ;
    public final void rule__React__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4435:1: ( ( ':' ) )
            // InternalMyDsl.g:4436:1: ( ':' )
            {
            // InternalMyDsl.g:4436:1: ( ':' )
            // InternalMyDsl.g:4437:2: ':'
            {
             before(grammarAccess.getReactAccess().getColonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getReactAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__React__Group__2__Impl"


    // $ANTLR start "rule__React__Group__3"
    // InternalMyDsl.g:4446:1: rule__React__Group__3 : rule__React__Group__3__Impl rule__React__Group__4 ;
    public final void rule__React__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4450:1: ( rule__React__Group__3__Impl rule__React__Group__4 )
            // InternalMyDsl.g:4451:2: rule__React__Group__3__Impl rule__React__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__React__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__React__Group__4();

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
    // $ANTLR end "rule__React__Group__3"


    // $ANTLR start "rule__React__Group__3__Impl"
    // InternalMyDsl.g:4458:1: rule__React__Group__3__Impl : ( '{' ) ;
    public final void rule__React__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4462:1: ( ( '{' ) )
            // InternalMyDsl.g:4463:1: ( '{' )
            {
            // InternalMyDsl.g:4463:1: ( '{' )
            // InternalMyDsl.g:4464:2: '{'
            {
             before(grammarAccess.getReactAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getReactAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__React__Group__3__Impl"


    // $ANTLR start "rule__React__Group__4"
    // InternalMyDsl.g:4473:1: rule__React__Group__4 : rule__React__Group__4__Impl rule__React__Group__5 ;
    public final void rule__React__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4477:1: ( rule__React__Group__4__Impl rule__React__Group__5 )
            // InternalMyDsl.g:4478:2: rule__React__Group__4__Impl rule__React__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__React__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__React__Group__5();

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
    // $ANTLR end "rule__React__Group__4"


    // $ANTLR start "rule__React__Group__4__Impl"
    // InternalMyDsl.g:4485:1: rule__React__Group__4__Impl : ( ( rule__React__ReactsAssignment_4 ) ) ;
    public final void rule__React__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4489:1: ( ( ( rule__React__ReactsAssignment_4 ) ) )
            // InternalMyDsl.g:4490:1: ( ( rule__React__ReactsAssignment_4 ) )
            {
            // InternalMyDsl.g:4490:1: ( ( rule__React__ReactsAssignment_4 ) )
            // InternalMyDsl.g:4491:2: ( rule__React__ReactsAssignment_4 )
            {
             before(grammarAccess.getReactAccess().getReactsAssignment_4()); 
            // InternalMyDsl.g:4492:2: ( rule__React__ReactsAssignment_4 )
            // InternalMyDsl.g:4492:3: rule__React__ReactsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__React__ReactsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getReactAccess().getReactsAssignment_4()); 

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
    // $ANTLR end "rule__React__Group__4__Impl"


    // $ANTLR start "rule__React__Group__5"
    // InternalMyDsl.g:4500:1: rule__React__Group__5 : rule__React__Group__5__Impl ;
    public final void rule__React__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4504:1: ( rule__React__Group__5__Impl )
            // InternalMyDsl.g:4505:2: rule__React__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__React__Group__5__Impl();

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
    // $ANTLR end "rule__React__Group__5"


    // $ANTLR start "rule__React__Group__5__Impl"
    // InternalMyDsl.g:4511:1: rule__React__Group__5__Impl : ( '}' ) ;
    public final void rule__React__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4515:1: ( ( '}' ) )
            // InternalMyDsl.g:4516:1: ( '}' )
            {
            // InternalMyDsl.g:4516:1: ( '}' )
            // InternalMyDsl.g:4517:2: '}'
            {
             before(grammarAccess.getReactAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getReactAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__React__Group__5__Impl"


    // $ANTLR start "rule__ReactModules__Group__0"
    // InternalMyDsl.g:4527:1: rule__ReactModules__Group__0 : rule__ReactModules__Group__0__Impl rule__ReactModules__Group__1 ;
    public final void rule__ReactModules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4531:1: ( rule__ReactModules__Group__0__Impl rule__ReactModules__Group__1 )
            // InternalMyDsl.g:4532:2: rule__ReactModules__Group__0__Impl rule__ReactModules__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ReactModules__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactModules__Group__1();

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
    // $ANTLR end "rule__ReactModules__Group__0"


    // $ANTLR start "rule__ReactModules__Group__0__Impl"
    // InternalMyDsl.g:4539:1: rule__ReactModules__Group__0__Impl : ( 'ReactModules' ) ;
    public final void rule__ReactModules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4543:1: ( ( 'ReactModules' ) )
            // InternalMyDsl.g:4544:1: ( 'ReactModules' )
            {
            // InternalMyDsl.g:4544:1: ( 'ReactModules' )
            // InternalMyDsl.g:4545:2: 'ReactModules'
            {
             before(grammarAccess.getReactModulesAccess().getReactModulesKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getReactModulesAccess().getReactModulesKeyword_0()); 

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
    // $ANTLR end "rule__ReactModules__Group__0__Impl"


    // $ANTLR start "rule__ReactModules__Group__1"
    // InternalMyDsl.g:4554:1: rule__ReactModules__Group__1 : rule__ReactModules__Group__1__Impl rule__ReactModules__Group__2 ;
    public final void rule__ReactModules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4558:1: ( rule__ReactModules__Group__1__Impl rule__ReactModules__Group__2 )
            // InternalMyDsl.g:4559:2: rule__ReactModules__Group__1__Impl rule__ReactModules__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ReactModules__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactModules__Group__2();

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
    // $ANTLR end "rule__ReactModules__Group__1"


    // $ANTLR start "rule__ReactModules__Group__1__Impl"
    // InternalMyDsl.g:4566:1: rule__ReactModules__Group__1__Impl : ( ':' ) ;
    public final void rule__ReactModules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4570:1: ( ( ':' ) )
            // InternalMyDsl.g:4571:1: ( ':' )
            {
            // InternalMyDsl.g:4571:1: ( ':' )
            // InternalMyDsl.g:4572:2: ':'
            {
             before(grammarAccess.getReactModulesAccess().getColonKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getReactModulesAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__ReactModules__Group__1__Impl"


    // $ANTLR start "rule__ReactModules__Group__2"
    // InternalMyDsl.g:4581:1: rule__ReactModules__Group__2 : rule__ReactModules__Group__2__Impl rule__ReactModules__Group__3 ;
    public final void rule__ReactModules__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4585:1: ( rule__ReactModules__Group__2__Impl rule__ReactModules__Group__3 )
            // InternalMyDsl.g:4586:2: rule__ReactModules__Group__2__Impl rule__ReactModules__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__ReactModules__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactModules__Group__3();

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
    // $ANTLR end "rule__ReactModules__Group__2"


    // $ANTLR start "rule__ReactModules__Group__2__Impl"
    // InternalMyDsl.g:4593:1: rule__ReactModules__Group__2__Impl : ( '{' ) ;
    public final void rule__ReactModules__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4597:1: ( ( '{' ) )
            // InternalMyDsl.g:4598:1: ( '{' )
            {
            // InternalMyDsl.g:4598:1: ( '{' )
            // InternalMyDsl.g:4599:2: '{'
            {
             before(grammarAccess.getReactModulesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getReactModulesAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ReactModules__Group__2__Impl"


    // $ANTLR start "rule__ReactModules__Group__3"
    // InternalMyDsl.g:4608:1: rule__ReactModules__Group__3 : rule__ReactModules__Group__3__Impl rule__ReactModules__Group__4 ;
    public final void rule__ReactModules__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4612:1: ( rule__ReactModules__Group__3__Impl rule__ReactModules__Group__4 )
            // InternalMyDsl.g:4613:2: rule__ReactModules__Group__3__Impl rule__ReactModules__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__ReactModules__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactModules__Group__4();

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
    // $ANTLR end "rule__ReactModules__Group__3"


    // $ANTLR start "rule__ReactModules__Group__3__Impl"
    // InternalMyDsl.g:4620:1: rule__ReactModules__Group__3__Impl : ( ( rule__ReactModules__ReactmodulesAssignment_3 ) ) ;
    public final void rule__ReactModules__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4624:1: ( ( ( rule__ReactModules__ReactmodulesAssignment_3 ) ) )
            // InternalMyDsl.g:4625:1: ( ( rule__ReactModules__ReactmodulesAssignment_3 ) )
            {
            // InternalMyDsl.g:4625:1: ( ( rule__ReactModules__ReactmodulesAssignment_3 ) )
            // InternalMyDsl.g:4626:2: ( rule__ReactModules__ReactmodulesAssignment_3 )
            {
             before(grammarAccess.getReactModulesAccess().getReactmodulesAssignment_3()); 
            // InternalMyDsl.g:4627:2: ( rule__ReactModules__ReactmodulesAssignment_3 )
            // InternalMyDsl.g:4627:3: rule__ReactModules__ReactmodulesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ReactModules__ReactmodulesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReactModulesAccess().getReactmodulesAssignment_3()); 

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
    // $ANTLR end "rule__ReactModules__Group__3__Impl"


    // $ANTLR start "rule__ReactModules__Group__4"
    // InternalMyDsl.g:4635:1: rule__ReactModules__Group__4 : rule__ReactModules__Group__4__Impl ;
    public final void rule__ReactModules__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4639:1: ( rule__ReactModules__Group__4__Impl )
            // InternalMyDsl.g:4640:2: rule__ReactModules__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactModules__Group__4__Impl();

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
    // $ANTLR end "rule__ReactModules__Group__4"


    // $ANTLR start "rule__ReactModules__Group__4__Impl"
    // InternalMyDsl.g:4646:1: rule__ReactModules__Group__4__Impl : ( '}' ) ;
    public final void rule__ReactModules__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4650:1: ( ( '}' ) )
            // InternalMyDsl.g:4651:1: ( '}' )
            {
            // InternalMyDsl.g:4651:1: ( '}' )
            // InternalMyDsl.g:4652:2: '}'
            {
             before(grammarAccess.getReactModulesAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getReactModulesAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ReactModules__Group__4__Impl"


    // $ANTLR start "rule__ReactSubModules__Group__0"
    // InternalMyDsl.g:4662:1: rule__ReactSubModules__Group__0 : rule__ReactSubModules__Group__0__Impl rule__ReactSubModules__Group__1 ;
    public final void rule__ReactSubModules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4666:1: ( rule__ReactSubModules__Group__0__Impl rule__ReactSubModules__Group__1 )
            // InternalMyDsl.g:4667:2: rule__ReactSubModules__Group__0__Impl rule__ReactSubModules__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__ReactSubModules__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactSubModules__Group__1();

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
    // $ANTLR end "rule__ReactSubModules__Group__0"


    // $ANTLR start "rule__ReactSubModules__Group__0__Impl"
    // InternalMyDsl.g:4674:1: rule__ReactSubModules__Group__0__Impl : ( ( rule__ReactSubModules__ReactmodulesAssignment_0 ) ) ;
    public final void rule__ReactSubModules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4678:1: ( ( ( rule__ReactSubModules__ReactmodulesAssignment_0 ) ) )
            // InternalMyDsl.g:4679:1: ( ( rule__ReactSubModules__ReactmodulesAssignment_0 ) )
            {
            // InternalMyDsl.g:4679:1: ( ( rule__ReactSubModules__ReactmodulesAssignment_0 ) )
            // InternalMyDsl.g:4680:2: ( rule__ReactSubModules__ReactmodulesAssignment_0 )
            {
             before(grammarAccess.getReactSubModulesAccess().getReactmodulesAssignment_0()); 
            // InternalMyDsl.g:4681:2: ( rule__ReactSubModules__ReactmodulesAssignment_0 )
            // InternalMyDsl.g:4681:3: rule__ReactSubModules__ReactmodulesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ReactSubModules__ReactmodulesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getReactSubModulesAccess().getReactmodulesAssignment_0()); 

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
    // $ANTLR end "rule__ReactSubModules__Group__0__Impl"


    // $ANTLR start "rule__ReactSubModules__Group__1"
    // InternalMyDsl.g:4689:1: rule__ReactSubModules__Group__1 : rule__ReactSubModules__Group__1__Impl rule__ReactSubModules__Group__2 ;
    public final void rule__ReactSubModules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4693:1: ( rule__ReactSubModules__Group__1__Impl rule__ReactSubModules__Group__2 )
            // InternalMyDsl.g:4694:2: rule__ReactSubModules__Group__1__Impl rule__ReactSubModules__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__ReactSubModules__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactSubModules__Group__2();

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
    // $ANTLR end "rule__ReactSubModules__Group__1"


    // $ANTLR start "rule__ReactSubModules__Group__1__Impl"
    // InternalMyDsl.g:4701:1: rule__ReactSubModules__Group__1__Impl : ( ( rule__ReactSubModules__ReactmodulesAssignment_1 ) ) ;
    public final void rule__ReactSubModules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4705:1: ( ( ( rule__ReactSubModules__ReactmodulesAssignment_1 ) ) )
            // InternalMyDsl.g:4706:1: ( ( rule__ReactSubModules__ReactmodulesAssignment_1 ) )
            {
            // InternalMyDsl.g:4706:1: ( ( rule__ReactSubModules__ReactmodulesAssignment_1 ) )
            // InternalMyDsl.g:4707:2: ( rule__ReactSubModules__ReactmodulesAssignment_1 )
            {
             before(grammarAccess.getReactSubModulesAccess().getReactmodulesAssignment_1()); 
            // InternalMyDsl.g:4708:2: ( rule__ReactSubModules__ReactmodulesAssignment_1 )
            // InternalMyDsl.g:4708:3: rule__ReactSubModules__ReactmodulesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReactSubModules__ReactmodulesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReactSubModulesAccess().getReactmodulesAssignment_1()); 

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
    // $ANTLR end "rule__ReactSubModules__Group__1__Impl"


    // $ANTLR start "rule__ReactSubModules__Group__2"
    // InternalMyDsl.g:4716:1: rule__ReactSubModules__Group__2 : rule__ReactSubModules__Group__2__Impl rule__ReactSubModules__Group__3 ;
    public final void rule__ReactSubModules__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4720:1: ( rule__ReactSubModules__Group__2__Impl rule__ReactSubModules__Group__3 )
            // InternalMyDsl.g:4721:2: rule__ReactSubModules__Group__2__Impl rule__ReactSubModules__Group__3
            {
            pushFollow(FOLLOW_40);
            rule__ReactSubModules__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactSubModules__Group__3();

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
    // $ANTLR end "rule__ReactSubModules__Group__2"


    // $ANTLR start "rule__ReactSubModules__Group__2__Impl"
    // InternalMyDsl.g:4728:1: rule__ReactSubModules__Group__2__Impl : ( ( rule__ReactSubModules__ReactmodulesAssignment_2 ) ) ;
    public final void rule__ReactSubModules__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4732:1: ( ( ( rule__ReactSubModules__ReactmodulesAssignment_2 ) ) )
            // InternalMyDsl.g:4733:1: ( ( rule__ReactSubModules__ReactmodulesAssignment_2 ) )
            {
            // InternalMyDsl.g:4733:1: ( ( rule__ReactSubModules__ReactmodulesAssignment_2 ) )
            // InternalMyDsl.g:4734:2: ( rule__ReactSubModules__ReactmodulesAssignment_2 )
            {
             before(grammarAccess.getReactSubModulesAccess().getReactmodulesAssignment_2()); 
            // InternalMyDsl.g:4735:2: ( rule__ReactSubModules__ReactmodulesAssignment_2 )
            // InternalMyDsl.g:4735:3: rule__ReactSubModules__ReactmodulesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReactSubModules__ReactmodulesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReactSubModulesAccess().getReactmodulesAssignment_2()); 

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
    // $ANTLR end "rule__ReactSubModules__Group__2__Impl"


    // $ANTLR start "rule__ReactSubModules__Group__3"
    // InternalMyDsl.g:4743:1: rule__ReactSubModules__Group__3 : rule__ReactSubModules__Group__3__Impl rule__ReactSubModules__Group__4 ;
    public final void rule__ReactSubModules__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4747:1: ( rule__ReactSubModules__Group__3__Impl rule__ReactSubModules__Group__4 )
            // InternalMyDsl.g:4748:2: rule__ReactSubModules__Group__3__Impl rule__ReactSubModules__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__ReactSubModules__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactSubModules__Group__4();

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
    // $ANTLR end "rule__ReactSubModules__Group__3"


    // $ANTLR start "rule__ReactSubModules__Group__3__Impl"
    // InternalMyDsl.g:4755:1: rule__ReactSubModules__Group__3__Impl : ( ( rule__ReactSubModules__ReactmodulesAssignment_3 ) ) ;
    public final void rule__ReactSubModules__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4759:1: ( ( ( rule__ReactSubModules__ReactmodulesAssignment_3 ) ) )
            // InternalMyDsl.g:4760:1: ( ( rule__ReactSubModules__ReactmodulesAssignment_3 ) )
            {
            // InternalMyDsl.g:4760:1: ( ( rule__ReactSubModules__ReactmodulesAssignment_3 ) )
            // InternalMyDsl.g:4761:2: ( rule__ReactSubModules__ReactmodulesAssignment_3 )
            {
             before(grammarAccess.getReactSubModulesAccess().getReactmodulesAssignment_3()); 
            // InternalMyDsl.g:4762:2: ( rule__ReactSubModules__ReactmodulesAssignment_3 )
            // InternalMyDsl.g:4762:3: rule__ReactSubModules__ReactmodulesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ReactSubModules__ReactmodulesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReactSubModulesAccess().getReactmodulesAssignment_3()); 

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
    // $ANTLR end "rule__ReactSubModules__Group__3__Impl"


    // $ANTLR start "rule__ReactSubModules__Group__4"
    // InternalMyDsl.g:4770:1: rule__ReactSubModules__Group__4 : rule__ReactSubModules__Group__4__Impl ;
    public final void rule__ReactSubModules__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4774:1: ( rule__ReactSubModules__Group__4__Impl )
            // InternalMyDsl.g:4775:2: rule__ReactSubModules__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactSubModules__Group__4__Impl();

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
    // $ANTLR end "rule__ReactSubModules__Group__4"


    // $ANTLR start "rule__ReactSubModules__Group__4__Impl"
    // InternalMyDsl.g:4781:1: rule__ReactSubModules__Group__4__Impl : ( ( rule__ReactSubModules__ReactmodulesAssignment_4 ) ) ;
    public final void rule__ReactSubModules__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4785:1: ( ( ( rule__ReactSubModules__ReactmodulesAssignment_4 ) ) )
            // InternalMyDsl.g:4786:1: ( ( rule__ReactSubModules__ReactmodulesAssignment_4 ) )
            {
            // InternalMyDsl.g:4786:1: ( ( rule__ReactSubModules__ReactmodulesAssignment_4 ) )
            // InternalMyDsl.g:4787:2: ( rule__ReactSubModules__ReactmodulesAssignment_4 )
            {
             before(grammarAccess.getReactSubModulesAccess().getReactmodulesAssignment_4()); 
            // InternalMyDsl.g:4788:2: ( rule__ReactSubModules__ReactmodulesAssignment_4 )
            // InternalMyDsl.g:4788:3: rule__ReactSubModules__ReactmodulesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ReactSubModules__ReactmodulesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getReactSubModulesAccess().getReactmodulesAssignment_4()); 

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
    // $ANTLR end "rule__ReactSubModules__Group__4__Impl"


    // $ANTLR start "rule__ReactConfiguration__Group__0"
    // InternalMyDsl.g:4797:1: rule__ReactConfiguration__Group__0 : rule__ReactConfiguration__Group__0__Impl rule__ReactConfiguration__Group__1 ;
    public final void rule__ReactConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4801:1: ( rule__ReactConfiguration__Group__0__Impl rule__ReactConfiguration__Group__1 )
            // InternalMyDsl.g:4802:2: rule__ReactConfiguration__Group__0__Impl rule__ReactConfiguration__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__ReactConfiguration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactConfiguration__Group__1();

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
    // $ANTLR end "rule__ReactConfiguration__Group__0"


    // $ANTLR start "rule__ReactConfiguration__Group__0__Impl"
    // InternalMyDsl.g:4809:1: rule__ReactConfiguration__Group__0__Impl : ( 'ReactConfiguration' ) ;
    public final void rule__ReactConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4813:1: ( ( 'ReactConfiguration' ) )
            // InternalMyDsl.g:4814:1: ( 'ReactConfiguration' )
            {
            // InternalMyDsl.g:4814:1: ( 'ReactConfiguration' )
            // InternalMyDsl.g:4815:2: 'ReactConfiguration'
            {
             before(grammarAccess.getReactConfigurationAccess().getReactConfigurationKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getReactConfigurationAccess().getReactConfigurationKeyword_0()); 

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
    // $ANTLR end "rule__ReactConfiguration__Group__0__Impl"


    // $ANTLR start "rule__ReactConfiguration__Group__1"
    // InternalMyDsl.g:4824:1: rule__ReactConfiguration__Group__1 : rule__ReactConfiguration__Group__1__Impl rule__ReactConfiguration__Group__2 ;
    public final void rule__ReactConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4828:1: ( rule__ReactConfiguration__Group__1__Impl rule__ReactConfiguration__Group__2 )
            // InternalMyDsl.g:4829:2: rule__ReactConfiguration__Group__1__Impl rule__ReactConfiguration__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__ReactConfiguration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactConfiguration__Group__2();

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
    // $ANTLR end "rule__ReactConfiguration__Group__1"


    // $ANTLR start "rule__ReactConfiguration__Group__1__Impl"
    // InternalMyDsl.g:4836:1: rule__ReactConfiguration__Group__1__Impl : ( ( rule__ReactConfiguration__DependenciesAssignment_1 ) ) ;
    public final void rule__ReactConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4840:1: ( ( ( rule__ReactConfiguration__DependenciesAssignment_1 ) ) )
            // InternalMyDsl.g:4841:1: ( ( rule__ReactConfiguration__DependenciesAssignment_1 ) )
            {
            // InternalMyDsl.g:4841:1: ( ( rule__ReactConfiguration__DependenciesAssignment_1 ) )
            // InternalMyDsl.g:4842:2: ( rule__ReactConfiguration__DependenciesAssignment_1 )
            {
             before(grammarAccess.getReactConfigurationAccess().getDependenciesAssignment_1()); 
            // InternalMyDsl.g:4843:2: ( rule__ReactConfiguration__DependenciesAssignment_1 )
            // InternalMyDsl.g:4843:3: rule__ReactConfiguration__DependenciesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReactConfiguration__DependenciesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReactConfigurationAccess().getDependenciesAssignment_1()); 

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
    // $ANTLR end "rule__ReactConfiguration__Group__1__Impl"


    // $ANTLR start "rule__ReactConfiguration__Group__2"
    // InternalMyDsl.g:4851:1: rule__ReactConfiguration__Group__2 : rule__ReactConfiguration__Group__2__Impl ;
    public final void rule__ReactConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4855:1: ( rule__ReactConfiguration__Group__2__Impl )
            // InternalMyDsl.g:4856:2: rule__ReactConfiguration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactConfiguration__Group__2__Impl();

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
    // $ANTLR end "rule__ReactConfiguration__Group__2"


    // $ANTLR start "rule__ReactConfiguration__Group__2__Impl"
    // InternalMyDsl.g:4862:1: rule__ReactConfiguration__Group__2__Impl : ( ( rule__ReactConfiguration__ConfigurationsAssignment_2 ) ) ;
    public final void rule__ReactConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4866:1: ( ( ( rule__ReactConfiguration__ConfigurationsAssignment_2 ) ) )
            // InternalMyDsl.g:4867:1: ( ( rule__ReactConfiguration__ConfigurationsAssignment_2 ) )
            {
            // InternalMyDsl.g:4867:1: ( ( rule__ReactConfiguration__ConfigurationsAssignment_2 ) )
            // InternalMyDsl.g:4868:2: ( rule__ReactConfiguration__ConfigurationsAssignment_2 )
            {
             before(grammarAccess.getReactConfigurationAccess().getConfigurationsAssignment_2()); 
            // InternalMyDsl.g:4869:2: ( rule__ReactConfiguration__ConfigurationsAssignment_2 )
            // InternalMyDsl.g:4869:3: rule__ReactConfiguration__ConfigurationsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReactConfiguration__ConfigurationsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReactConfigurationAccess().getConfigurationsAssignment_2()); 

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
    // $ANTLR end "rule__ReactConfiguration__Group__2__Impl"


    // $ANTLR start "rule__ReactDependencies__Group__0"
    // InternalMyDsl.g:4878:1: rule__ReactDependencies__Group__0 : rule__ReactDependencies__Group__0__Impl rule__ReactDependencies__Group__1 ;
    public final void rule__ReactDependencies__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4882:1: ( rule__ReactDependencies__Group__0__Impl rule__ReactDependencies__Group__1 )
            // InternalMyDsl.g:4883:2: rule__ReactDependencies__Group__0__Impl rule__ReactDependencies__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__ReactDependencies__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactDependencies__Group__1();

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
    // $ANTLR end "rule__ReactDependencies__Group__0"


    // $ANTLR start "rule__ReactDependencies__Group__0__Impl"
    // InternalMyDsl.g:4890:1: rule__ReactDependencies__Group__0__Impl : ( 'DependenciesStruct' ) ;
    public final void rule__ReactDependencies__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4894:1: ( ( 'DependenciesStruct' ) )
            // InternalMyDsl.g:4895:1: ( 'DependenciesStruct' )
            {
            // InternalMyDsl.g:4895:1: ( 'DependenciesStruct' )
            // InternalMyDsl.g:4896:2: 'DependenciesStruct'
            {
             before(grammarAccess.getReactDependenciesAccess().getDependenciesStructKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getReactDependenciesAccess().getDependenciesStructKeyword_0()); 

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
    // $ANTLR end "rule__ReactDependencies__Group__0__Impl"


    // $ANTLR start "rule__ReactDependencies__Group__1"
    // InternalMyDsl.g:4905:1: rule__ReactDependencies__Group__1 : rule__ReactDependencies__Group__1__Impl ;
    public final void rule__ReactDependencies__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4909:1: ( rule__ReactDependencies__Group__1__Impl )
            // InternalMyDsl.g:4910:2: rule__ReactDependencies__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactDependencies__Group__1__Impl();

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
    // $ANTLR end "rule__ReactDependencies__Group__1"


    // $ANTLR start "rule__ReactDependencies__Group__1__Impl"
    // InternalMyDsl.g:4916:1: rule__ReactDependencies__Group__1__Impl : ( ( ( rule__ReactDependencies__DependenciesAssignment_1 ) ) ( ( rule__ReactDependencies__DependenciesAssignment_1 )* ) ) ;
    public final void rule__ReactDependencies__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4920:1: ( ( ( ( rule__ReactDependencies__DependenciesAssignment_1 ) ) ( ( rule__ReactDependencies__DependenciesAssignment_1 )* ) ) )
            // InternalMyDsl.g:4921:1: ( ( ( rule__ReactDependencies__DependenciesAssignment_1 ) ) ( ( rule__ReactDependencies__DependenciesAssignment_1 )* ) )
            {
            // InternalMyDsl.g:4921:1: ( ( ( rule__ReactDependencies__DependenciesAssignment_1 ) ) ( ( rule__ReactDependencies__DependenciesAssignment_1 )* ) )
            // InternalMyDsl.g:4922:2: ( ( rule__ReactDependencies__DependenciesAssignment_1 ) ) ( ( rule__ReactDependencies__DependenciesAssignment_1 )* )
            {
            // InternalMyDsl.g:4922:2: ( ( rule__ReactDependencies__DependenciesAssignment_1 ) )
            // InternalMyDsl.g:4923:3: ( rule__ReactDependencies__DependenciesAssignment_1 )
            {
             before(grammarAccess.getReactDependenciesAccess().getDependenciesAssignment_1()); 
            // InternalMyDsl.g:4924:3: ( rule__ReactDependencies__DependenciesAssignment_1 )
            // InternalMyDsl.g:4924:4: rule__ReactDependencies__DependenciesAssignment_1
            {
            pushFollow(FOLLOW_45);
            rule__ReactDependencies__DependenciesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReactDependenciesAccess().getDependenciesAssignment_1()); 

            }

            // InternalMyDsl.g:4927:2: ( ( rule__ReactDependencies__DependenciesAssignment_1 )* )
            // InternalMyDsl.g:4928:3: ( rule__ReactDependencies__DependenciesAssignment_1 )*
            {
             before(grammarAccess.getReactDependenciesAccess().getDependenciesAssignment_1()); 
            // InternalMyDsl.g:4929:3: ( rule__ReactDependencies__DependenciesAssignment_1 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==44) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:4929:4: rule__ReactDependencies__DependenciesAssignment_1
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__ReactDependencies__DependenciesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getReactDependenciesAccess().getDependenciesAssignment_1()); 

            }


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
    // $ANTLR end "rule__ReactDependencies__Group__1__Impl"


    // $ANTLR start "rule__ReactDependenciesRules__Group__0"
    // InternalMyDsl.g:4939:1: rule__ReactDependenciesRules__Group__0 : rule__ReactDependenciesRules__Group__0__Impl rule__ReactDependenciesRules__Group__1 ;
    public final void rule__ReactDependenciesRules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4943:1: ( rule__ReactDependenciesRules__Group__0__Impl rule__ReactDependenciesRules__Group__1 )
            // InternalMyDsl.g:4944:2: rule__ReactDependenciesRules__Group__0__Impl rule__ReactDependenciesRules__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ReactDependenciesRules__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactDependenciesRules__Group__1();

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
    // $ANTLR end "rule__ReactDependenciesRules__Group__0"


    // $ANTLR start "rule__ReactDependenciesRules__Group__0__Impl"
    // InternalMyDsl.g:4951:1: rule__ReactDependenciesRules__Group__0__Impl : ( 'DependencyType' ) ;
    public final void rule__ReactDependenciesRules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4955:1: ( ( 'DependencyType' ) )
            // InternalMyDsl.g:4956:1: ( 'DependencyType' )
            {
            // InternalMyDsl.g:4956:1: ( 'DependencyType' )
            // InternalMyDsl.g:4957:2: 'DependencyType'
            {
             before(grammarAccess.getReactDependenciesRulesAccess().getDependencyTypeKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getReactDependenciesRulesAccess().getDependencyTypeKeyword_0()); 

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
    // $ANTLR end "rule__ReactDependenciesRules__Group__0__Impl"


    // $ANTLR start "rule__ReactDependenciesRules__Group__1"
    // InternalMyDsl.g:4966:1: rule__ReactDependenciesRules__Group__1 : rule__ReactDependenciesRules__Group__1__Impl rule__ReactDependenciesRules__Group__2 ;
    public final void rule__ReactDependenciesRules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4970:1: ( rule__ReactDependenciesRules__Group__1__Impl rule__ReactDependenciesRules__Group__2 )
            // InternalMyDsl.g:4971:2: rule__ReactDependenciesRules__Group__1__Impl rule__ReactDependenciesRules__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__ReactDependenciesRules__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactDependenciesRules__Group__2();

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
    // $ANTLR end "rule__ReactDependenciesRules__Group__1"


    // $ANTLR start "rule__ReactDependenciesRules__Group__1__Impl"
    // InternalMyDsl.g:4978:1: rule__ReactDependenciesRules__Group__1__Impl : ( ( rule__ReactDependenciesRules__NameAssignment_1 ) ) ;
    public final void rule__ReactDependenciesRules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4982:1: ( ( ( rule__ReactDependenciesRules__NameAssignment_1 ) ) )
            // InternalMyDsl.g:4983:1: ( ( rule__ReactDependenciesRules__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:4983:1: ( ( rule__ReactDependenciesRules__NameAssignment_1 ) )
            // InternalMyDsl.g:4984:2: ( rule__ReactDependenciesRules__NameAssignment_1 )
            {
             before(grammarAccess.getReactDependenciesRulesAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4985:2: ( rule__ReactDependenciesRules__NameAssignment_1 )
            // InternalMyDsl.g:4985:3: rule__ReactDependenciesRules__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReactDependenciesRules__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReactDependenciesRulesAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ReactDependenciesRules__Group__1__Impl"


    // $ANTLR start "rule__ReactDependenciesRules__Group__2"
    // InternalMyDsl.g:4993:1: rule__ReactDependenciesRules__Group__2 : rule__ReactDependenciesRules__Group__2__Impl ;
    public final void rule__ReactDependenciesRules__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4997:1: ( rule__ReactDependenciesRules__Group__2__Impl )
            // InternalMyDsl.g:4998:2: rule__ReactDependenciesRules__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactDependenciesRules__Group__2__Impl();

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
    // $ANTLR end "rule__ReactDependenciesRules__Group__2"


    // $ANTLR start "rule__ReactDependenciesRules__Group__2__Impl"
    // InternalMyDsl.g:5004:1: rule__ReactDependenciesRules__Group__2__Impl : ( ( ( rule__ReactDependenciesRules__DependenciesAssignment_2 ) ) ( ( rule__ReactDependenciesRules__DependenciesAssignment_2 )* ) ) ;
    public final void rule__ReactDependenciesRules__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5008:1: ( ( ( ( rule__ReactDependenciesRules__DependenciesAssignment_2 ) ) ( ( rule__ReactDependenciesRules__DependenciesAssignment_2 )* ) ) )
            // InternalMyDsl.g:5009:1: ( ( ( rule__ReactDependenciesRules__DependenciesAssignment_2 ) ) ( ( rule__ReactDependenciesRules__DependenciesAssignment_2 )* ) )
            {
            // InternalMyDsl.g:5009:1: ( ( ( rule__ReactDependenciesRules__DependenciesAssignment_2 ) ) ( ( rule__ReactDependenciesRules__DependenciesAssignment_2 )* ) )
            // InternalMyDsl.g:5010:2: ( ( rule__ReactDependenciesRules__DependenciesAssignment_2 ) ) ( ( rule__ReactDependenciesRules__DependenciesAssignment_2 )* )
            {
            // InternalMyDsl.g:5010:2: ( ( rule__ReactDependenciesRules__DependenciesAssignment_2 ) )
            // InternalMyDsl.g:5011:3: ( rule__ReactDependenciesRules__DependenciesAssignment_2 )
            {
             before(grammarAccess.getReactDependenciesRulesAccess().getDependenciesAssignment_2()); 
            // InternalMyDsl.g:5012:3: ( rule__ReactDependenciesRules__DependenciesAssignment_2 )
            // InternalMyDsl.g:5012:4: rule__ReactDependenciesRules__DependenciesAssignment_2
            {
            pushFollow(FOLLOW_47);
            rule__ReactDependenciesRules__DependenciesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReactDependenciesRulesAccess().getDependenciesAssignment_2()); 

            }

            // InternalMyDsl.g:5015:2: ( ( rule__ReactDependenciesRules__DependenciesAssignment_2 )* )
            // InternalMyDsl.g:5016:3: ( rule__ReactDependenciesRules__DependenciesAssignment_2 )*
            {
             before(grammarAccess.getReactDependenciesRulesAccess().getDependenciesAssignment_2()); 
            // InternalMyDsl.g:5017:3: ( rule__ReactDependenciesRules__DependenciesAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==45) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:5017:4: rule__ReactDependenciesRules__DependenciesAssignment_2
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__ReactDependenciesRules__DependenciesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getReactDependenciesRulesAccess().getDependenciesAssignment_2()); 

            }


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
    // $ANTLR end "rule__ReactDependenciesRules__Group__2__Impl"


    // $ANTLR start "rule__SingleDependencies__Group__0"
    // InternalMyDsl.g:5027:1: rule__SingleDependencies__Group__0 : rule__SingleDependencies__Group__0__Impl rule__SingleDependencies__Group__1 ;
    public final void rule__SingleDependencies__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5031:1: ( rule__SingleDependencies__Group__0__Impl rule__SingleDependencies__Group__1 )
            // InternalMyDsl.g:5032:2: rule__SingleDependencies__Group__0__Impl rule__SingleDependencies__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__SingleDependencies__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleDependencies__Group__1();

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
    // $ANTLR end "rule__SingleDependencies__Group__0"


    // $ANTLR start "rule__SingleDependencies__Group__0__Impl"
    // InternalMyDsl.g:5039:1: rule__SingleDependencies__Group__0__Impl : ( ( rule__SingleDependencies__DependenciesAssignment_0 ) ) ;
    public final void rule__SingleDependencies__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5043:1: ( ( ( rule__SingleDependencies__DependenciesAssignment_0 ) ) )
            // InternalMyDsl.g:5044:1: ( ( rule__SingleDependencies__DependenciesAssignment_0 ) )
            {
            // InternalMyDsl.g:5044:1: ( ( rule__SingleDependencies__DependenciesAssignment_0 ) )
            // InternalMyDsl.g:5045:2: ( rule__SingleDependencies__DependenciesAssignment_0 )
            {
             before(grammarAccess.getSingleDependenciesAccess().getDependenciesAssignment_0()); 
            // InternalMyDsl.g:5046:2: ( rule__SingleDependencies__DependenciesAssignment_0 )
            // InternalMyDsl.g:5046:3: rule__SingleDependencies__DependenciesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SingleDependencies__DependenciesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSingleDependenciesAccess().getDependenciesAssignment_0()); 

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
    // $ANTLR end "rule__SingleDependencies__Group__0__Impl"


    // $ANTLR start "rule__SingleDependencies__Group__1"
    // InternalMyDsl.g:5054:1: rule__SingleDependencies__Group__1 : rule__SingleDependencies__Group__1__Impl ;
    public final void rule__SingleDependencies__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5058:1: ( rule__SingleDependencies__Group__1__Impl )
            // InternalMyDsl.g:5059:2: rule__SingleDependencies__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleDependencies__Group__1__Impl();

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
    // $ANTLR end "rule__SingleDependencies__Group__1"


    // $ANTLR start "rule__SingleDependencies__Group__1__Impl"
    // InternalMyDsl.g:5065:1: rule__SingleDependencies__Group__1__Impl : ( ( rule__SingleDependencies__DependenciesAssignment_1 ) ) ;
    public final void rule__SingleDependencies__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5069:1: ( ( ( rule__SingleDependencies__DependenciesAssignment_1 ) ) )
            // InternalMyDsl.g:5070:1: ( ( rule__SingleDependencies__DependenciesAssignment_1 ) )
            {
            // InternalMyDsl.g:5070:1: ( ( rule__SingleDependencies__DependenciesAssignment_1 ) )
            // InternalMyDsl.g:5071:2: ( rule__SingleDependencies__DependenciesAssignment_1 )
            {
             before(grammarAccess.getSingleDependenciesAccess().getDependenciesAssignment_1()); 
            // InternalMyDsl.g:5072:2: ( rule__SingleDependencies__DependenciesAssignment_1 )
            // InternalMyDsl.g:5072:3: rule__SingleDependencies__DependenciesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SingleDependencies__DependenciesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleDependenciesAccess().getDependenciesAssignment_1()); 

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
    // $ANTLR end "rule__SingleDependencies__Group__1__Impl"


    // $ANTLR start "rule__PackageName__Group__0"
    // InternalMyDsl.g:5081:1: rule__PackageName__Group__0 : rule__PackageName__Group__0__Impl rule__PackageName__Group__1 ;
    public final void rule__PackageName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5085:1: ( rule__PackageName__Group__0__Impl rule__PackageName__Group__1 )
            // InternalMyDsl.g:5086:2: rule__PackageName__Group__0__Impl rule__PackageName__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__PackageName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageName__Group__1();

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
    // $ANTLR end "rule__PackageName__Group__0"


    // $ANTLR start "rule__PackageName__Group__0__Impl"
    // InternalMyDsl.g:5093:1: rule__PackageName__Group__0__Impl : ( 'PackageName' ) ;
    public final void rule__PackageName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5097:1: ( ( 'PackageName' ) )
            // InternalMyDsl.g:5098:1: ( 'PackageName' )
            {
            // InternalMyDsl.g:5098:1: ( 'PackageName' )
            // InternalMyDsl.g:5099:2: 'PackageName'
            {
             before(grammarAccess.getPackageNameAccess().getPackageNameKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPackageNameAccess().getPackageNameKeyword_0()); 

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
    // $ANTLR end "rule__PackageName__Group__0__Impl"


    // $ANTLR start "rule__PackageName__Group__1"
    // InternalMyDsl.g:5108:1: rule__PackageName__Group__1 : rule__PackageName__Group__1__Impl ;
    public final void rule__PackageName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5112:1: ( rule__PackageName__Group__1__Impl )
            // InternalMyDsl.g:5113:2: rule__PackageName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackageName__Group__1__Impl();

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
    // $ANTLR end "rule__PackageName__Group__1"


    // $ANTLR start "rule__PackageName__Group__1__Impl"
    // InternalMyDsl.g:5119:1: rule__PackageName__Group__1__Impl : ( ( rule__PackageName__NameAssignment_1 ) ) ;
    public final void rule__PackageName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5123:1: ( ( ( rule__PackageName__NameAssignment_1 ) ) )
            // InternalMyDsl.g:5124:1: ( ( rule__PackageName__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:5124:1: ( ( rule__PackageName__NameAssignment_1 ) )
            // InternalMyDsl.g:5125:2: ( rule__PackageName__NameAssignment_1 )
            {
             before(grammarAccess.getPackageNameAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5126:2: ( rule__PackageName__NameAssignment_1 )
            // InternalMyDsl.g:5126:3: rule__PackageName__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PackageName__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageNameAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__PackageName__Group__1__Impl"


    // $ANTLR start "rule__PackageVersion__Group__0"
    // InternalMyDsl.g:5135:1: rule__PackageVersion__Group__0 : rule__PackageVersion__Group__0__Impl rule__PackageVersion__Group__1 ;
    public final void rule__PackageVersion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5139:1: ( rule__PackageVersion__Group__0__Impl rule__PackageVersion__Group__1 )
            // InternalMyDsl.g:5140:2: rule__PackageVersion__Group__0__Impl rule__PackageVersion__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__PackageVersion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageVersion__Group__1();

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
    // $ANTLR end "rule__PackageVersion__Group__0"


    // $ANTLR start "rule__PackageVersion__Group__0__Impl"
    // InternalMyDsl.g:5147:1: rule__PackageVersion__Group__0__Impl : ( 'PackageVersion' ) ;
    public final void rule__PackageVersion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5151:1: ( ( 'PackageVersion' ) )
            // InternalMyDsl.g:5152:1: ( 'PackageVersion' )
            {
            // InternalMyDsl.g:5152:1: ( 'PackageVersion' )
            // InternalMyDsl.g:5153:2: 'PackageVersion'
            {
             before(grammarAccess.getPackageVersionAccess().getPackageVersionKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getPackageVersionAccess().getPackageVersionKeyword_0()); 

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
    // $ANTLR end "rule__PackageVersion__Group__0__Impl"


    // $ANTLR start "rule__PackageVersion__Group__1"
    // InternalMyDsl.g:5162:1: rule__PackageVersion__Group__1 : rule__PackageVersion__Group__1__Impl ;
    public final void rule__PackageVersion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5166:1: ( rule__PackageVersion__Group__1__Impl )
            // InternalMyDsl.g:5167:2: rule__PackageVersion__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackageVersion__Group__1__Impl();

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
    // $ANTLR end "rule__PackageVersion__Group__1"


    // $ANTLR start "rule__PackageVersion__Group__1__Impl"
    // InternalMyDsl.g:5173:1: rule__PackageVersion__Group__1__Impl : ( ( rule__PackageVersion__NameAssignment_1 ) ) ;
    public final void rule__PackageVersion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5177:1: ( ( ( rule__PackageVersion__NameAssignment_1 ) ) )
            // InternalMyDsl.g:5178:1: ( ( rule__PackageVersion__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:5178:1: ( ( rule__PackageVersion__NameAssignment_1 ) )
            // InternalMyDsl.g:5179:2: ( rule__PackageVersion__NameAssignment_1 )
            {
             before(grammarAccess.getPackageVersionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5180:2: ( rule__PackageVersion__NameAssignment_1 )
            // InternalMyDsl.g:5180:3: rule__PackageVersion__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PackageVersion__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageVersionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__PackageVersion__Group__1__Impl"


    // $ANTLR start "rule__ReactConfigurations__Group__0"
    // InternalMyDsl.g:5189:1: rule__ReactConfigurations__Group__0 : rule__ReactConfigurations__Group__0__Impl rule__ReactConfigurations__Group__1 ;
    public final void rule__ReactConfigurations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5193:1: ( rule__ReactConfigurations__Group__0__Impl rule__ReactConfigurations__Group__1 )
            // InternalMyDsl.g:5194:2: rule__ReactConfigurations__Group__0__Impl rule__ReactConfigurations__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ReactConfigurations__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactConfigurations__Group__1();

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
    // $ANTLR end "rule__ReactConfigurations__Group__0"


    // $ANTLR start "rule__ReactConfigurations__Group__0__Impl"
    // InternalMyDsl.g:5201:1: rule__ReactConfigurations__Group__0__Impl : ( 'ReactDOMConfigurations' ) ;
    public final void rule__ReactConfigurations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5205:1: ( ( 'ReactDOMConfigurations' ) )
            // InternalMyDsl.g:5206:1: ( 'ReactDOMConfigurations' )
            {
            // InternalMyDsl.g:5206:1: ( 'ReactDOMConfigurations' )
            // InternalMyDsl.g:5207:2: 'ReactDOMConfigurations'
            {
             before(grammarAccess.getReactConfigurationsAccess().getReactDOMConfigurationsKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getReactConfigurationsAccess().getReactDOMConfigurationsKeyword_0()); 

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
    // $ANTLR end "rule__ReactConfigurations__Group__0__Impl"


    // $ANTLR start "rule__ReactConfigurations__Group__1"
    // InternalMyDsl.g:5216:1: rule__ReactConfigurations__Group__1 : rule__ReactConfigurations__Group__1__Impl ;
    public final void rule__ReactConfigurations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5220:1: ( rule__ReactConfigurations__Group__1__Impl )
            // InternalMyDsl.g:5221:2: rule__ReactConfigurations__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactConfigurations__Group__1__Impl();

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
    // $ANTLR end "rule__ReactConfigurations__Group__1"


    // $ANTLR start "rule__ReactConfigurations__Group__1__Impl"
    // InternalMyDsl.g:5227:1: rule__ReactConfigurations__Group__1__Impl : ( ( rule__ReactConfigurations__NameAssignment_1 ) ) ;
    public final void rule__ReactConfigurations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5231:1: ( ( ( rule__ReactConfigurations__NameAssignment_1 ) ) )
            // InternalMyDsl.g:5232:1: ( ( rule__ReactConfigurations__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:5232:1: ( ( rule__ReactConfigurations__NameAssignment_1 ) )
            // InternalMyDsl.g:5233:2: ( rule__ReactConfigurations__NameAssignment_1 )
            {
             before(grammarAccess.getReactConfigurationsAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5234:2: ( rule__ReactConfigurations__NameAssignment_1 )
            // InternalMyDsl.g:5234:3: rule__ReactConfigurations__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReactConfigurations__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReactConfigurationsAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ReactConfigurations__Group__1__Impl"


    // $ANTLR start "rule__ReactComponents__Group__0"
    // InternalMyDsl.g:5243:1: rule__ReactComponents__Group__0 : rule__ReactComponents__Group__0__Impl rule__ReactComponents__Group__1 ;
    public final void rule__ReactComponents__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5247:1: ( rule__ReactComponents__Group__0__Impl rule__ReactComponents__Group__1 )
            // InternalMyDsl.g:5248:2: rule__ReactComponents__Group__0__Impl rule__ReactComponents__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__ReactComponents__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactComponents__Group__1();

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
    // $ANTLR end "rule__ReactComponents__Group__0"


    // $ANTLR start "rule__ReactComponents__Group__0__Impl"
    // InternalMyDsl.g:5255:1: rule__ReactComponents__Group__0__Impl : ( 'ReactComponents' ) ;
    public final void rule__ReactComponents__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5259:1: ( ( 'ReactComponents' ) )
            // InternalMyDsl.g:5260:1: ( 'ReactComponents' )
            {
            // InternalMyDsl.g:5260:1: ( 'ReactComponents' )
            // InternalMyDsl.g:5261:2: 'ReactComponents'
            {
             before(grammarAccess.getReactComponentsAccess().getReactComponentsKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getReactComponentsAccess().getReactComponentsKeyword_0()); 

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
    // $ANTLR end "rule__ReactComponents__Group__0__Impl"


    // $ANTLR start "rule__ReactComponents__Group__1"
    // InternalMyDsl.g:5270:1: rule__ReactComponents__Group__1 : rule__ReactComponents__Group__1__Impl rule__ReactComponents__Group__2 ;
    public final void rule__ReactComponents__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5274:1: ( rule__ReactComponents__Group__1__Impl rule__ReactComponents__Group__2 )
            // InternalMyDsl.g:5275:2: rule__ReactComponents__Group__1__Impl rule__ReactComponents__Group__2
            {
            pushFollow(FOLLOW_50);
            rule__ReactComponents__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactComponents__Group__2();

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
    // $ANTLR end "rule__ReactComponents__Group__1"


    // $ANTLR start "rule__ReactComponents__Group__1__Impl"
    // InternalMyDsl.g:5282:1: rule__ReactComponents__Group__1__Impl : ( ( rule__ReactComponents__ComponentslogicAssignment_1 ) ) ;
    public final void rule__ReactComponents__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5286:1: ( ( ( rule__ReactComponents__ComponentslogicAssignment_1 ) ) )
            // InternalMyDsl.g:5287:1: ( ( rule__ReactComponents__ComponentslogicAssignment_1 ) )
            {
            // InternalMyDsl.g:5287:1: ( ( rule__ReactComponents__ComponentslogicAssignment_1 ) )
            // InternalMyDsl.g:5288:2: ( rule__ReactComponents__ComponentslogicAssignment_1 )
            {
             before(grammarAccess.getReactComponentsAccess().getComponentslogicAssignment_1()); 
            // InternalMyDsl.g:5289:2: ( rule__ReactComponents__ComponentslogicAssignment_1 )
            // InternalMyDsl.g:5289:3: rule__ReactComponents__ComponentslogicAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReactComponents__ComponentslogicAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReactComponentsAccess().getComponentslogicAssignment_1()); 

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
    // $ANTLR end "rule__ReactComponents__Group__1__Impl"


    // $ANTLR start "rule__ReactComponents__Group__2"
    // InternalMyDsl.g:5297:1: rule__ReactComponents__Group__2 : rule__ReactComponents__Group__2__Impl ;
    public final void rule__ReactComponents__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5301:1: ( rule__ReactComponents__Group__2__Impl )
            // InternalMyDsl.g:5302:2: rule__ReactComponents__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactComponents__Group__2__Impl();

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
    // $ANTLR end "rule__ReactComponents__Group__2"


    // $ANTLR start "rule__ReactComponents__Group__2__Impl"
    // InternalMyDsl.g:5308:1: rule__ReactComponents__Group__2__Impl : ( ( rule__ReactComponents__ComponentsuiAssignment_2 ) ) ;
    public final void rule__ReactComponents__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5312:1: ( ( ( rule__ReactComponents__ComponentsuiAssignment_2 ) ) )
            // InternalMyDsl.g:5313:1: ( ( rule__ReactComponents__ComponentsuiAssignment_2 ) )
            {
            // InternalMyDsl.g:5313:1: ( ( rule__ReactComponents__ComponentsuiAssignment_2 ) )
            // InternalMyDsl.g:5314:2: ( rule__ReactComponents__ComponentsuiAssignment_2 )
            {
             before(grammarAccess.getReactComponentsAccess().getComponentsuiAssignment_2()); 
            // InternalMyDsl.g:5315:2: ( rule__ReactComponents__ComponentsuiAssignment_2 )
            // InternalMyDsl.g:5315:3: rule__ReactComponents__ComponentsuiAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReactComponents__ComponentsuiAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReactComponentsAccess().getComponentsuiAssignment_2()); 

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
    // $ANTLR end "rule__ReactComponents__Group__2__Impl"


    // $ANTLR start "rule__ComponentsLogic__Group__0"
    // InternalMyDsl.g:5324:1: rule__ComponentsLogic__Group__0 : rule__ComponentsLogic__Group__0__Impl rule__ComponentsLogic__Group__1 ;
    public final void rule__ComponentsLogic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5328:1: ( rule__ComponentsLogic__Group__0__Impl rule__ComponentsLogic__Group__1 )
            // InternalMyDsl.g:5329:2: rule__ComponentsLogic__Group__0__Impl rule__ComponentsLogic__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ComponentsLogic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentsLogic__Group__1();

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
    // $ANTLR end "rule__ComponentsLogic__Group__0"


    // $ANTLR start "rule__ComponentsLogic__Group__0__Impl"
    // InternalMyDsl.g:5336:1: rule__ComponentsLogic__Group__0__Impl : ( 'LogicComponents' ) ;
    public final void rule__ComponentsLogic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5340:1: ( ( 'LogicComponents' ) )
            // InternalMyDsl.g:5341:1: ( 'LogicComponents' )
            {
            // InternalMyDsl.g:5341:1: ( 'LogicComponents' )
            // InternalMyDsl.g:5342:2: 'LogicComponents'
            {
             before(grammarAccess.getComponentsLogicAccess().getLogicComponentsKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getComponentsLogicAccess().getLogicComponentsKeyword_0()); 

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
    // $ANTLR end "rule__ComponentsLogic__Group__0__Impl"


    // $ANTLR start "rule__ComponentsLogic__Group__1"
    // InternalMyDsl.g:5351:1: rule__ComponentsLogic__Group__1 : rule__ComponentsLogic__Group__1__Impl ;
    public final void rule__ComponentsLogic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5355:1: ( rule__ComponentsLogic__Group__1__Impl )
            // InternalMyDsl.g:5356:2: rule__ComponentsLogic__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentsLogic__Group__1__Impl();

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
    // $ANTLR end "rule__ComponentsLogic__Group__1"


    // $ANTLR start "rule__ComponentsLogic__Group__1__Impl"
    // InternalMyDsl.g:5362:1: rule__ComponentsLogic__Group__1__Impl : ( ( rule__ComponentsLogic__NameAssignment_1 ) ) ;
    public final void rule__ComponentsLogic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5366:1: ( ( ( rule__ComponentsLogic__NameAssignment_1 ) ) )
            // InternalMyDsl.g:5367:1: ( ( rule__ComponentsLogic__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:5367:1: ( ( rule__ComponentsLogic__NameAssignment_1 ) )
            // InternalMyDsl.g:5368:2: ( rule__ComponentsLogic__NameAssignment_1 )
            {
             before(grammarAccess.getComponentsLogicAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5369:2: ( rule__ComponentsLogic__NameAssignment_1 )
            // InternalMyDsl.g:5369:3: rule__ComponentsLogic__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentsLogic__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentsLogicAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ComponentsLogic__Group__1__Impl"


    // $ANTLR start "rule__ComponentsUI__Group__0"
    // InternalMyDsl.g:5378:1: rule__ComponentsUI__Group__0 : rule__ComponentsUI__Group__0__Impl rule__ComponentsUI__Group__1 ;
    public final void rule__ComponentsUI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5382:1: ( rule__ComponentsUI__Group__0__Impl rule__ComponentsUI__Group__1 )
            // InternalMyDsl.g:5383:2: rule__ComponentsUI__Group__0__Impl rule__ComponentsUI__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ComponentsUI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentsUI__Group__1();

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
    // $ANTLR end "rule__ComponentsUI__Group__0"


    // $ANTLR start "rule__ComponentsUI__Group__0__Impl"
    // InternalMyDsl.g:5390:1: rule__ComponentsUI__Group__0__Impl : ( 'UIComponents' ) ;
    public final void rule__ComponentsUI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5394:1: ( ( 'UIComponents' ) )
            // InternalMyDsl.g:5395:1: ( 'UIComponents' )
            {
            // InternalMyDsl.g:5395:1: ( 'UIComponents' )
            // InternalMyDsl.g:5396:2: 'UIComponents'
            {
             before(grammarAccess.getComponentsUIAccess().getUIComponentsKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getComponentsUIAccess().getUIComponentsKeyword_0()); 

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
    // $ANTLR end "rule__ComponentsUI__Group__0__Impl"


    // $ANTLR start "rule__ComponentsUI__Group__1"
    // InternalMyDsl.g:5405:1: rule__ComponentsUI__Group__1 : rule__ComponentsUI__Group__1__Impl ;
    public final void rule__ComponentsUI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5409:1: ( rule__ComponentsUI__Group__1__Impl )
            // InternalMyDsl.g:5410:2: rule__ComponentsUI__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentsUI__Group__1__Impl();

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
    // $ANTLR end "rule__ComponentsUI__Group__1"


    // $ANTLR start "rule__ComponentsUI__Group__1__Impl"
    // InternalMyDsl.g:5416:1: rule__ComponentsUI__Group__1__Impl : ( ( rule__ComponentsUI__NameAssignment_1 ) ) ;
    public final void rule__ComponentsUI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5420:1: ( ( ( rule__ComponentsUI__NameAssignment_1 ) ) )
            // InternalMyDsl.g:5421:1: ( ( rule__ComponentsUI__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:5421:1: ( ( rule__ComponentsUI__NameAssignment_1 ) )
            // InternalMyDsl.g:5422:2: ( rule__ComponentsUI__NameAssignment_1 )
            {
             before(grammarAccess.getComponentsUIAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5423:2: ( rule__ComponentsUI__NameAssignment_1 )
            // InternalMyDsl.g:5423:3: rule__ComponentsUI__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentsUI__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentsUIAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ComponentsUI__Group__1__Impl"


    // $ANTLR start "rule__ReactActions__Group__0"
    // InternalMyDsl.g:5432:1: rule__ReactActions__Group__0 : rule__ReactActions__Group__0__Impl rule__ReactActions__Group__1 ;
    public final void rule__ReactActions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5436:1: ( rule__ReactActions__Group__0__Impl rule__ReactActions__Group__1 )
            // InternalMyDsl.g:5437:2: rule__ReactActions__Group__0__Impl rule__ReactActions__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ReactActions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactActions__Group__1();

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
    // $ANTLR end "rule__ReactActions__Group__0"


    // $ANTLR start "rule__ReactActions__Group__0__Impl"
    // InternalMyDsl.g:5444:1: rule__ReactActions__Group__0__Impl : ( 'ReactActions' ) ;
    public final void rule__ReactActions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5448:1: ( ( 'ReactActions' ) )
            // InternalMyDsl.g:5449:1: ( 'ReactActions' )
            {
            // InternalMyDsl.g:5449:1: ( 'ReactActions' )
            // InternalMyDsl.g:5450:2: 'ReactActions'
            {
             before(grammarAccess.getReactActionsAccess().getReactActionsKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getReactActionsAccess().getReactActionsKeyword_0()); 

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
    // $ANTLR end "rule__ReactActions__Group__0__Impl"


    // $ANTLR start "rule__ReactActions__Group__1"
    // InternalMyDsl.g:5459:1: rule__ReactActions__Group__1 : rule__ReactActions__Group__1__Impl ;
    public final void rule__ReactActions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5463:1: ( rule__ReactActions__Group__1__Impl )
            // InternalMyDsl.g:5464:2: rule__ReactActions__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactActions__Group__1__Impl();

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
    // $ANTLR end "rule__ReactActions__Group__1"


    // $ANTLR start "rule__ReactActions__Group__1__Impl"
    // InternalMyDsl.g:5470:1: rule__ReactActions__Group__1__Impl : ( ( rule__ReactActions__NameAssignment_1 ) ) ;
    public final void rule__ReactActions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5474:1: ( ( ( rule__ReactActions__NameAssignment_1 ) ) )
            // InternalMyDsl.g:5475:1: ( ( rule__ReactActions__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:5475:1: ( ( rule__ReactActions__NameAssignment_1 ) )
            // InternalMyDsl.g:5476:2: ( rule__ReactActions__NameAssignment_1 )
            {
             before(grammarAccess.getReactActionsAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5477:2: ( rule__ReactActions__NameAssignment_1 )
            // InternalMyDsl.g:5477:3: rule__ReactActions__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReactActions__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReactActionsAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ReactActions__Group__1__Impl"


    // $ANTLR start "rule__ReactLibraries__Group__0"
    // InternalMyDsl.g:5486:1: rule__ReactLibraries__Group__0 : rule__ReactLibraries__Group__0__Impl rule__ReactLibraries__Group__1 ;
    public final void rule__ReactLibraries__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5490:1: ( rule__ReactLibraries__Group__0__Impl rule__ReactLibraries__Group__1 )
            // InternalMyDsl.g:5491:2: rule__ReactLibraries__Group__0__Impl rule__ReactLibraries__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ReactLibraries__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactLibraries__Group__1();

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
    // $ANTLR end "rule__ReactLibraries__Group__0"


    // $ANTLR start "rule__ReactLibraries__Group__0__Impl"
    // InternalMyDsl.g:5498:1: rule__ReactLibraries__Group__0__Impl : ( 'Libraries' ) ;
    public final void rule__ReactLibraries__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5502:1: ( ( 'Libraries' ) )
            // InternalMyDsl.g:5503:1: ( 'Libraries' )
            {
            // InternalMyDsl.g:5503:1: ( 'Libraries' )
            // InternalMyDsl.g:5504:2: 'Libraries'
            {
             before(grammarAccess.getReactLibrariesAccess().getLibrariesKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getReactLibrariesAccess().getLibrariesKeyword_0()); 

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
    // $ANTLR end "rule__ReactLibraries__Group__0__Impl"


    // $ANTLR start "rule__ReactLibraries__Group__1"
    // InternalMyDsl.g:5513:1: rule__ReactLibraries__Group__1 : rule__ReactLibraries__Group__1__Impl ;
    public final void rule__ReactLibraries__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5517:1: ( rule__ReactLibraries__Group__1__Impl )
            // InternalMyDsl.g:5518:2: rule__ReactLibraries__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactLibraries__Group__1__Impl();

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
    // $ANTLR end "rule__ReactLibraries__Group__1"


    // $ANTLR start "rule__ReactLibraries__Group__1__Impl"
    // InternalMyDsl.g:5524:1: rule__ReactLibraries__Group__1__Impl : ( ( rule__ReactLibraries__NameAssignment_1 ) ) ;
    public final void rule__ReactLibraries__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5528:1: ( ( ( rule__ReactLibraries__NameAssignment_1 ) ) )
            // InternalMyDsl.g:5529:1: ( ( rule__ReactLibraries__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:5529:1: ( ( rule__ReactLibraries__NameAssignment_1 ) )
            // InternalMyDsl.g:5530:2: ( rule__ReactLibraries__NameAssignment_1 )
            {
             before(grammarAccess.getReactLibrariesAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5531:2: ( rule__ReactLibraries__NameAssignment_1 )
            // InternalMyDsl.g:5531:3: rule__ReactLibraries__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReactLibraries__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReactLibrariesAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ReactLibraries__Group__1__Impl"


    // $ANTLR start "rule__ReactInfo__Group__0"
    // InternalMyDsl.g:5540:1: rule__ReactInfo__Group__0 : rule__ReactInfo__Group__0__Impl rule__ReactInfo__Group__1 ;
    public final void rule__ReactInfo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5544:1: ( rule__ReactInfo__Group__0__Impl rule__ReactInfo__Group__1 )
            // InternalMyDsl.g:5545:2: rule__ReactInfo__Group__0__Impl rule__ReactInfo__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ReactInfo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactInfo__Group__1();

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
    // $ANTLR end "rule__ReactInfo__Group__0"


    // $ANTLR start "rule__ReactInfo__Group__0__Impl"
    // InternalMyDsl.g:5552:1: rule__ReactInfo__Group__0__Impl : ( 'Information' ) ;
    public final void rule__ReactInfo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5556:1: ( ( 'Information' ) )
            // InternalMyDsl.g:5557:1: ( 'Information' )
            {
            // InternalMyDsl.g:5557:1: ( 'Information' )
            // InternalMyDsl.g:5558:2: 'Information'
            {
             before(grammarAccess.getReactInfoAccess().getInformationKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getReactInfoAccess().getInformationKeyword_0()); 

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
    // $ANTLR end "rule__ReactInfo__Group__0__Impl"


    // $ANTLR start "rule__ReactInfo__Group__1"
    // InternalMyDsl.g:5567:1: rule__ReactInfo__Group__1 : rule__ReactInfo__Group__1__Impl ;
    public final void rule__ReactInfo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5571:1: ( rule__ReactInfo__Group__1__Impl )
            // InternalMyDsl.g:5572:2: rule__ReactInfo__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactInfo__Group__1__Impl();

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
    // $ANTLR end "rule__ReactInfo__Group__1"


    // $ANTLR start "rule__ReactInfo__Group__1__Impl"
    // InternalMyDsl.g:5578:1: rule__ReactInfo__Group__1__Impl : ( ( rule__ReactInfo__NameAssignment_1 ) ) ;
    public final void rule__ReactInfo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5582:1: ( ( ( rule__ReactInfo__NameAssignment_1 ) ) )
            // InternalMyDsl.g:5583:1: ( ( rule__ReactInfo__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:5583:1: ( ( rule__ReactInfo__NameAssignment_1 ) )
            // InternalMyDsl.g:5584:2: ( rule__ReactInfo__NameAssignment_1 )
            {
             before(grammarAccess.getReactInfoAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5585:2: ( rule__ReactInfo__NameAssignment_1 )
            // InternalMyDsl.g:5585:3: rule__ReactInfo__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReactInfo__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReactInfoAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ReactInfo__Group__1__Impl"


    // $ANTLR start "rule__Spring__Group__0"
    // InternalMyDsl.g:5594:1: rule__Spring__Group__0 : rule__Spring__Group__0__Impl rule__Spring__Group__1 ;
    public final void rule__Spring__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5598:1: ( rule__Spring__Group__0__Impl rule__Spring__Group__1 )
            // InternalMyDsl.g:5599:2: rule__Spring__Group__0__Impl rule__Spring__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Spring__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spring__Group__1();

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
    // $ANTLR end "rule__Spring__Group__0"


    // $ANTLR start "rule__Spring__Group__0__Impl"
    // InternalMyDsl.g:5606:1: rule__Spring__Group__0__Impl : ( 'Spring' ) ;
    public final void rule__Spring__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5610:1: ( ( 'Spring' ) )
            // InternalMyDsl.g:5611:1: ( 'Spring' )
            {
            // InternalMyDsl.g:5611:1: ( 'Spring' )
            // InternalMyDsl.g:5612:2: 'Spring'
            {
             before(grammarAccess.getSpringAccess().getSpringKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getSpringAccess().getSpringKeyword_0()); 

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
    // $ANTLR end "rule__Spring__Group__0__Impl"


    // $ANTLR start "rule__Spring__Group__1"
    // InternalMyDsl.g:5621:1: rule__Spring__Group__1 : rule__Spring__Group__1__Impl ;
    public final void rule__Spring__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5625:1: ( rule__Spring__Group__1__Impl )
            // InternalMyDsl.g:5626:2: rule__Spring__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Spring__Group__1__Impl();

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
    // $ANTLR end "rule__Spring__Group__1"


    // $ANTLR start "rule__Spring__Group__1__Impl"
    // InternalMyDsl.g:5632:1: rule__Spring__Group__1__Impl : ( ( rule__Spring__NameAssignment_1 ) ) ;
    public final void rule__Spring__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5636:1: ( ( ( rule__Spring__NameAssignment_1 ) ) )
            // InternalMyDsl.g:5637:1: ( ( rule__Spring__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:5637:1: ( ( rule__Spring__NameAssignment_1 ) )
            // InternalMyDsl.g:5638:2: ( rule__Spring__NameAssignment_1 )
            {
             before(grammarAccess.getSpringAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5639:2: ( rule__Spring__NameAssignment_1 )
            // InternalMyDsl.g:5639:3: rule__Spring__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Spring__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSpringAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Spring__Group__1__Impl"


    // $ANTLR start "rule__PostgreSQL__Group__0"
    // InternalMyDsl.g:5648:1: rule__PostgreSQL__Group__0 : rule__PostgreSQL__Group__0__Impl rule__PostgreSQL__Group__1 ;
    public final void rule__PostgreSQL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5652:1: ( rule__PostgreSQL__Group__0__Impl rule__PostgreSQL__Group__1 )
            // InternalMyDsl.g:5653:2: rule__PostgreSQL__Group__0__Impl rule__PostgreSQL__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__PostgreSQL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PostgreSQL__Group__1();

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
    // $ANTLR end "rule__PostgreSQL__Group__0"


    // $ANTLR start "rule__PostgreSQL__Group__0__Impl"
    // InternalMyDsl.g:5660:1: rule__PostgreSQL__Group__0__Impl : ( 'PostgreSQL' ) ;
    public final void rule__PostgreSQL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5664:1: ( ( 'PostgreSQL' ) )
            // InternalMyDsl.g:5665:1: ( 'PostgreSQL' )
            {
            // InternalMyDsl.g:5665:1: ( 'PostgreSQL' )
            // InternalMyDsl.g:5666:2: 'PostgreSQL'
            {
             before(grammarAccess.getPostgreSQLAccess().getPostgreSQLKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getPostgreSQLAccess().getPostgreSQLKeyword_0()); 

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
    // $ANTLR end "rule__PostgreSQL__Group__0__Impl"


    // $ANTLR start "rule__PostgreSQL__Group__1"
    // InternalMyDsl.g:5675:1: rule__PostgreSQL__Group__1 : rule__PostgreSQL__Group__1__Impl ;
    public final void rule__PostgreSQL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5679:1: ( rule__PostgreSQL__Group__1__Impl )
            // InternalMyDsl.g:5680:2: rule__PostgreSQL__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PostgreSQL__Group__1__Impl();

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
    // $ANTLR end "rule__PostgreSQL__Group__1"


    // $ANTLR start "rule__PostgreSQL__Group__1__Impl"
    // InternalMyDsl.g:5686:1: rule__PostgreSQL__Group__1__Impl : ( ( rule__PostgreSQL__NameAssignment_1 ) ) ;
    public final void rule__PostgreSQL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5690:1: ( ( ( rule__PostgreSQL__NameAssignment_1 ) ) )
            // InternalMyDsl.g:5691:1: ( ( rule__PostgreSQL__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:5691:1: ( ( rule__PostgreSQL__NameAssignment_1 ) )
            // InternalMyDsl.g:5692:2: ( rule__PostgreSQL__NameAssignment_1 )
            {
             before(grammarAccess.getPostgreSQLAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5693:2: ( rule__PostgreSQL__NameAssignment_1 )
            // InternalMyDsl.g:5693:3: rule__PostgreSQL__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PostgreSQL__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPostgreSQLAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__PostgreSQL__Group__1__Impl"


    // $ANTLR start "rule__AmazonWebServices__Group__0"
    // InternalMyDsl.g:5702:1: rule__AmazonWebServices__Group__0 : rule__AmazonWebServices__Group__0__Impl rule__AmazonWebServices__Group__1 ;
    public final void rule__AmazonWebServices__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5706:1: ( rule__AmazonWebServices__Group__0__Impl rule__AmazonWebServices__Group__1 )
            // InternalMyDsl.g:5707:2: rule__AmazonWebServices__Group__0__Impl rule__AmazonWebServices__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__AmazonWebServices__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmazonWebServices__Group__1();

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
    // $ANTLR end "rule__AmazonWebServices__Group__0"


    // $ANTLR start "rule__AmazonWebServices__Group__0__Impl"
    // InternalMyDsl.g:5714:1: rule__AmazonWebServices__Group__0__Impl : ( 'AmazonWebServices' ) ;
    public final void rule__AmazonWebServices__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5718:1: ( ( 'AmazonWebServices' ) )
            // InternalMyDsl.g:5719:1: ( 'AmazonWebServices' )
            {
            // InternalMyDsl.g:5719:1: ( 'AmazonWebServices' )
            // InternalMyDsl.g:5720:2: 'AmazonWebServices'
            {
             before(grammarAccess.getAmazonWebServicesAccess().getAmazonWebServicesKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getAmazonWebServicesAccess().getAmazonWebServicesKeyword_0()); 

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
    // $ANTLR end "rule__AmazonWebServices__Group__0__Impl"


    // $ANTLR start "rule__AmazonWebServices__Group__1"
    // InternalMyDsl.g:5729:1: rule__AmazonWebServices__Group__1 : rule__AmazonWebServices__Group__1__Impl ;
    public final void rule__AmazonWebServices__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5733:1: ( rule__AmazonWebServices__Group__1__Impl )
            // InternalMyDsl.g:5734:2: rule__AmazonWebServices__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AmazonWebServices__Group__1__Impl();

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
    // $ANTLR end "rule__AmazonWebServices__Group__1"


    // $ANTLR start "rule__AmazonWebServices__Group__1__Impl"
    // InternalMyDsl.g:5740:1: rule__AmazonWebServices__Group__1__Impl : ( ( rule__AmazonWebServices__NameAssignment_1 ) ) ;
    public final void rule__AmazonWebServices__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5744:1: ( ( ( rule__AmazonWebServices__NameAssignment_1 ) ) )
            // InternalMyDsl.g:5745:1: ( ( rule__AmazonWebServices__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:5745:1: ( ( rule__AmazonWebServices__NameAssignment_1 ) )
            // InternalMyDsl.g:5746:2: ( rule__AmazonWebServices__NameAssignment_1 )
            {
             before(grammarAccess.getAmazonWebServicesAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5747:2: ( rule__AmazonWebServices__NameAssignment_1 )
            // InternalMyDsl.g:5747:3: rule__AmazonWebServices__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AmazonWebServices__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAmazonWebServicesAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__AmazonWebServices__Group__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment_3"
    // InternalMyDsl.g:5756:1: rule__Model__ElementsAssignment_3 : ( ruleDomain ) ;
    public final void rule__Model__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5760:1: ( ( ruleDomain ) )
            // InternalMyDsl.g:5761:2: ( ruleDomain )
            {
            // InternalMyDsl.g:5761:2: ( ruleDomain )
            // InternalMyDsl.g:5762:3: ruleDomain
            {
             before(grammarAccess.getModelAccess().getElementsDomainParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsDomainParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Model__ElementsAssignment_3"


    // $ANTLR start "rule__Model__ElementsAssignment_4"
    // InternalMyDsl.g:5771:1: rule__Model__ElementsAssignment_4 : ( ruleArchitecture ) ;
    public final void rule__Model__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5775:1: ( ( ruleArchitecture ) )
            // InternalMyDsl.g:5776:2: ( ruleArchitecture )
            {
            // InternalMyDsl.g:5776:2: ( ruleArchitecture )
            // InternalMyDsl.g:5777:3: ruleArchitecture
            {
             before(grammarAccess.getModelAccess().getElementsArchitectureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleArchitecture();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsArchitectureParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Model__ElementsAssignment_4"


    // $ANTLR start "rule__Model__ElementsAssignment_5"
    // InternalMyDsl.g:5786:1: rule__Model__ElementsAssignment_5 : ( ruleTechnology ) ;
    public final void rule__Model__ElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5790:1: ( ( ruleTechnology ) )
            // InternalMyDsl.g:5791:2: ( ruleTechnology )
            {
            // InternalMyDsl.g:5791:2: ( ruleTechnology )
            // InternalMyDsl.g:5792:3: ruleTechnology
            {
             before(grammarAccess.getModelAccess().getElementsTechnologyParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTechnology();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsTechnologyParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Model__ElementsAssignment_5"


    // $ANTLR start "rule__Domain__NameAssignment_1"
    // InternalMyDsl.g:5801:1: rule__Domain__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5805:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5806:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5806:2: ( RULE_ID )
            // InternalMyDsl.g:5807:3: RULE_ID
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


    // $ANTLR start "rule__Domain__ElementsAssignment_4"
    // InternalMyDsl.g:5816:1: rule__Domain__ElementsAssignment_4 : ( ruleEntity ) ;
    public final void rule__Domain__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5820:1: ( ( ruleEntity ) )
            // InternalMyDsl.g:5821:2: ( ruleEntity )
            {
            // InternalMyDsl.g:5821:2: ( ruleEntity )
            // InternalMyDsl.g:5822:3: ruleEntity
            {
             before(grammarAccess.getDomainAccess().getElementsEntityParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getElementsEntityParserRuleCall_4_0()); 

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


    // $ANTLR start "rule__Domain__ElementsAssignment_5"
    // InternalMyDsl.g:5831:1: rule__Domain__ElementsAssignment_5 : ( ruleFunctionality ) ;
    public final void rule__Domain__ElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5835:1: ( ( ruleFunctionality ) )
            // InternalMyDsl.g:5836:2: ( ruleFunctionality )
            {
            // InternalMyDsl.g:5836:2: ( ruleFunctionality )
            // InternalMyDsl.g:5837:3: ruleFunctionality
            {
             before(grammarAccess.getDomainAccess().getElementsFunctionalityParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionality();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getElementsFunctionalityParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Domain__ElementsAssignment_5"


    // $ANTLR start "rule__Domain__ElementsAssignment_6"
    // InternalMyDsl.g:5846:1: rule__Domain__ElementsAssignment_6 : ( ruleDomainConnection ) ;
    public final void rule__Domain__ElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5850:1: ( ( ruleDomainConnection ) )
            // InternalMyDsl.g:5851:2: ( ruleDomainConnection )
            {
            // InternalMyDsl.g:5851:2: ( ruleDomainConnection )
            // InternalMyDsl.g:5852:3: ruleDomainConnection
            {
             before(grammarAccess.getDomainAccess().getElementsDomainConnectionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleDomainConnection();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getElementsDomainConnectionParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Domain__ElementsAssignment_6"


    // $ANTLR start "rule__Entity__ElementsAssignment_3"
    // InternalMyDsl.g:5861:1: rule__Entity__ElementsAssignment_3 : ( ruleEntities ) ;
    public final void rule__Entity__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5865:1: ( ( ruleEntities ) )
            // InternalMyDsl.g:5866:2: ( ruleEntities )
            {
            // InternalMyDsl.g:5866:2: ( ruleEntities )
            // InternalMyDsl.g:5867:3: ruleEntities
            {
             before(grammarAccess.getEntityAccess().getElementsEntitiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEntities();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getElementsEntitiesParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Entity__ElementsAssignment_3"


    // $ANTLR start "rule__Entities__ElementsAssignment_0"
    // InternalMyDsl.g:5876:1: rule__Entities__ElementsAssignment_0 : ( rulePhoto ) ;
    public final void rule__Entities__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5880:1: ( ( rulePhoto ) )
            // InternalMyDsl.g:5881:2: ( rulePhoto )
            {
            // InternalMyDsl.g:5881:2: ( rulePhoto )
            // InternalMyDsl.g:5882:3: rulePhoto
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
    // InternalMyDsl.g:5891:1: rule__Entities__ElementsAssignment_1 : ( ruleAlbum ) ;
    public final void rule__Entities__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5895:1: ( ( ruleAlbum ) )
            // InternalMyDsl.g:5896:2: ( ruleAlbum )
            {
            // InternalMyDsl.g:5896:2: ( ruleAlbum )
            // InternalMyDsl.g:5897:3: ruleAlbum
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
    // InternalMyDsl.g:5906:1: rule__Entities__ElementsAssignment_2 : ( ruleUserDomain ) ;
    public final void rule__Entities__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5910:1: ( ( ruleUserDomain ) )
            // InternalMyDsl.g:5911:2: ( ruleUserDomain )
            {
            // InternalMyDsl.g:5911:2: ( ruleUserDomain )
            // InternalMyDsl.g:5912:3: ruleUserDomain
            {
             before(grammarAccess.getEntitiesAccess().getElementsUserDomainParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUserDomain();

            state._fsp--;

             after(grammarAccess.getEntitiesAccess().getElementsUserDomainParserRuleCall_2_0()); 

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
    // InternalMyDsl.g:5921:1: rule__Photo__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Photo__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5925:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5926:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5926:2: ( RULE_ID )
            // InternalMyDsl.g:5927:3: RULE_ID
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
    // InternalMyDsl.g:5936:1: rule__Album__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Album__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5940:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5941:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5941:2: ( RULE_ID )
            // InternalMyDsl.g:5942:3: RULE_ID
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


    // $ANTLR start "rule__UserDomain__NameAssignment_1"
    // InternalMyDsl.g:5951:1: rule__UserDomain__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__UserDomain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5955:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5956:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5956:2: ( RULE_ID )
            // InternalMyDsl.g:5957:3: RULE_ID
            {
             before(grammarAccess.getUserDomainAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUserDomainAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__UserDomain__NameAssignment_1"


    // $ANTLR start "rule__Functionality__ElementsAssignment_3"
    // InternalMyDsl.g:5966:1: rule__Functionality__ElementsAssignment_3 : ( ruleFunctionalities ) ;
    public final void rule__Functionality__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5970:1: ( ( ruleFunctionalities ) )
            // InternalMyDsl.g:5971:2: ( ruleFunctionalities )
            {
            // InternalMyDsl.g:5971:2: ( ruleFunctionalities )
            // InternalMyDsl.g:5972:3: ruleFunctionalities
            {
             before(grammarAccess.getFunctionalityAccess().getElementsFunctionalitiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionalities();

            state._fsp--;

             after(grammarAccess.getFunctionalityAccess().getElementsFunctionalitiesParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Functionality__ElementsAssignment_3"


    // $ANTLR start "rule__Functionalities__FunctionsAssignment_0"
    // InternalMyDsl.g:5981:1: rule__Functionalities__FunctionsAssignment_0 : ( ruleProfileManagement ) ;
    public final void rule__Functionalities__FunctionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5985:1: ( ( ruleProfileManagement ) )
            // InternalMyDsl.g:5986:2: ( ruleProfileManagement )
            {
            // InternalMyDsl.g:5986:2: ( ruleProfileManagement )
            // InternalMyDsl.g:5987:3: ruleProfileManagement
            {
             before(grammarAccess.getFunctionalitiesAccess().getFunctionsProfileManagementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProfileManagement();

            state._fsp--;

             after(grammarAccess.getFunctionalitiesAccess().getFunctionsProfileManagementParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Functionalities__FunctionsAssignment_0"


    // $ANTLR start "rule__Functionalities__ElementsAssignment_1"
    // InternalMyDsl.g:5996:1: rule__Functionalities__ElementsAssignment_1 : ( ruleAppAccess ) ;
    public final void rule__Functionalities__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6000:1: ( ( ruleAppAccess ) )
            // InternalMyDsl.g:6001:2: ( ruleAppAccess )
            {
            // InternalMyDsl.g:6001:2: ( ruleAppAccess )
            // InternalMyDsl.g:6002:3: ruleAppAccess
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


    // $ANTLR start "rule__Functionalities__ItemsAssignment_2"
    // InternalMyDsl.g:6011:1: rule__Functionalities__ItemsAssignment_2 : ( ruleAlbumManagement ) ;
    public final void rule__Functionalities__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6015:1: ( ( ruleAlbumManagement ) )
            // InternalMyDsl.g:6016:2: ( ruleAlbumManagement )
            {
            // InternalMyDsl.g:6016:2: ( ruleAlbumManagement )
            // InternalMyDsl.g:6017:3: ruleAlbumManagement
            {
             before(grammarAccess.getFunctionalitiesAccess().getItemsAlbumManagementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAlbumManagement();

            state._fsp--;

             after(grammarAccess.getFunctionalitiesAccess().getItemsAlbumManagementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Functionalities__ItemsAssignment_2"


    // $ANTLR start "rule__Functionalities__ResourcesAssignment_3"
    // InternalMyDsl.g:6026:1: rule__Functionalities__ResourcesAssignment_3 : ( rulePhotoActions ) ;
    public final void rule__Functionalities__ResourcesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6030:1: ( ( rulePhotoActions ) )
            // InternalMyDsl.g:6031:2: ( rulePhotoActions )
            {
            // InternalMyDsl.g:6031:2: ( rulePhotoActions )
            // InternalMyDsl.g:6032:3: rulePhotoActions
            {
             before(grammarAccess.getFunctionalitiesAccess().getResourcesPhotoActionsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePhotoActions();

            state._fsp--;

             after(grammarAccess.getFunctionalitiesAccess().getResourcesPhotoActionsParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Functionalities__ResourcesAssignment_3"


    // $ANTLR start "rule__Functionalities__AditionalsAssignment_4"
    // InternalMyDsl.g:6041:1: rule__Functionalities__AditionalsAssignment_4 : ( ruleLandingActions ) ;
    public final void rule__Functionalities__AditionalsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6045:1: ( ( ruleLandingActions ) )
            // InternalMyDsl.g:6046:2: ( ruleLandingActions )
            {
            // InternalMyDsl.g:6046:2: ( ruleLandingActions )
            // InternalMyDsl.g:6047:3: ruleLandingActions
            {
             before(grammarAccess.getFunctionalitiesAccess().getAditionalsLandingActionsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLandingActions();

            state._fsp--;

             after(grammarAccess.getFunctionalitiesAccess().getAditionalsLandingActionsParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Functionalities__AditionalsAssignment_4"


    // $ANTLR start "rule__ProfileManagement__ItemsAssignment_2"
    // InternalMyDsl.g:6056:1: rule__ProfileManagement__ItemsAssignment_2 : ( ruleProfileManagementFunctions ) ;
    public final void rule__ProfileManagement__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6060:1: ( ( ruleProfileManagementFunctions ) )
            // InternalMyDsl.g:6061:2: ( ruleProfileManagementFunctions )
            {
            // InternalMyDsl.g:6061:2: ( ruleProfileManagementFunctions )
            // InternalMyDsl.g:6062:3: ruleProfileManagementFunctions
            {
             before(grammarAccess.getProfileManagementAccess().getItemsProfileManagementFunctionsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProfileManagementFunctions();

            state._fsp--;

             after(grammarAccess.getProfileManagementAccess().getItemsProfileManagementFunctionsParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ProfileManagement__ItemsAssignment_2"


    // $ANTLR start "rule__ProfileManagementFunctions__NameAssignment_1"
    // InternalMyDsl.g:6071:1: rule__ProfileManagementFunctions__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ProfileManagementFunctions__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6075:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6076:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6076:2: ( RULE_ID )
            // InternalMyDsl.g:6077:3: RULE_ID
            {
             before(grammarAccess.getProfileManagementFunctionsAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProfileManagementFunctionsAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ProfileManagementFunctions__NameAssignment_1"


    // $ANTLR start "rule__ProfileManagementFunctions__NameAssignment_3"
    // InternalMyDsl.g:6086:1: rule__ProfileManagementFunctions__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ProfileManagementFunctions__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6090:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6091:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6091:2: ( RULE_ID )
            // InternalMyDsl.g:6092:3: RULE_ID
            {
             before(grammarAccess.getProfileManagementFunctionsAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProfileManagementFunctionsAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__ProfileManagementFunctions__NameAssignment_3"


    // $ANTLR start "rule__AppAccess__ItemsAssignment_2"
    // InternalMyDsl.g:6101:1: rule__AppAccess__ItemsAssignment_2 : ( ruleAppAccessFunctions ) ;
    public final void rule__AppAccess__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6105:1: ( ( ruleAppAccessFunctions ) )
            // InternalMyDsl.g:6106:2: ( ruleAppAccessFunctions )
            {
            // InternalMyDsl.g:6106:2: ( ruleAppAccessFunctions )
            // InternalMyDsl.g:6107:3: ruleAppAccessFunctions
            {
             before(grammarAccess.getAppAccessAccess().getItemsAppAccessFunctionsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAppAccessFunctions();

            state._fsp--;

             after(grammarAccess.getAppAccessAccess().getItemsAppAccessFunctionsParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AppAccess__ItemsAssignment_2"


    // $ANTLR start "rule__AppAccessFunctions__NameAssignment_1"
    // InternalMyDsl.g:6116:1: rule__AppAccessFunctions__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AppAccessFunctions__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6120:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6121:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6121:2: ( RULE_ID )
            // InternalMyDsl.g:6122:3: RULE_ID
            {
             before(grammarAccess.getAppAccessFunctionsAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAppAccessFunctionsAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AppAccessFunctions__NameAssignment_1"


    // $ANTLR start "rule__AppAccessFunctions__NameAssignment_3"
    // InternalMyDsl.g:6131:1: rule__AppAccessFunctions__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__AppAccessFunctions__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6135:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6136:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6136:2: ( RULE_ID )
            // InternalMyDsl.g:6137:3: RULE_ID
            {
             before(grammarAccess.getAppAccessFunctionsAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAppAccessFunctionsAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__AppAccessFunctions__NameAssignment_3"


    // $ANTLR start "rule__AlbumManagement__ItemsAssignment_2"
    // InternalMyDsl.g:6146:1: rule__AlbumManagement__ItemsAssignment_2 : ( ruleAlbumManagementFunctions ) ;
    public final void rule__AlbumManagement__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6150:1: ( ( ruleAlbumManagementFunctions ) )
            // InternalMyDsl.g:6151:2: ( ruleAlbumManagementFunctions )
            {
            // InternalMyDsl.g:6151:2: ( ruleAlbumManagementFunctions )
            // InternalMyDsl.g:6152:3: ruleAlbumManagementFunctions
            {
             before(grammarAccess.getAlbumManagementAccess().getItemsAlbumManagementFunctionsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAlbumManagementFunctions();

            state._fsp--;

             after(grammarAccess.getAlbumManagementAccess().getItemsAlbumManagementFunctionsParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AlbumManagement__ItemsAssignment_2"


    // $ANTLR start "rule__AlbumManagementFunctions__NameAssignment_1"
    // InternalMyDsl.g:6161:1: rule__AlbumManagementFunctions__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AlbumManagementFunctions__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6165:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6166:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6166:2: ( RULE_ID )
            // InternalMyDsl.g:6167:3: RULE_ID
            {
             before(grammarAccess.getAlbumManagementFunctionsAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAlbumManagementFunctionsAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AlbumManagementFunctions__NameAssignment_1"


    // $ANTLR start "rule__AlbumManagementFunctions__NameAssignment_3"
    // InternalMyDsl.g:6176:1: rule__AlbumManagementFunctions__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__AlbumManagementFunctions__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6180:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6181:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6181:2: ( RULE_ID )
            // InternalMyDsl.g:6182:3: RULE_ID
            {
             before(grammarAccess.getAlbumManagementFunctionsAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAlbumManagementFunctionsAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__AlbumManagementFunctions__NameAssignment_3"


    // $ANTLR start "rule__PhotoActions__ItemsAssignment_2"
    // InternalMyDsl.g:6191:1: rule__PhotoActions__ItemsAssignment_2 : ( rulePhotoActionsFunctions ) ;
    public final void rule__PhotoActions__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6195:1: ( ( rulePhotoActionsFunctions ) )
            // InternalMyDsl.g:6196:2: ( rulePhotoActionsFunctions )
            {
            // InternalMyDsl.g:6196:2: ( rulePhotoActionsFunctions )
            // InternalMyDsl.g:6197:3: rulePhotoActionsFunctions
            {
             before(grammarAccess.getPhotoActionsAccess().getItemsPhotoActionsFunctionsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePhotoActionsFunctions();

            state._fsp--;

             after(grammarAccess.getPhotoActionsAccess().getItemsPhotoActionsFunctionsParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__PhotoActions__ItemsAssignment_2"


    // $ANTLR start "rule__PhotoActionsFunctions__NameAssignment_1"
    // InternalMyDsl.g:6206:1: rule__PhotoActionsFunctions__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PhotoActionsFunctions__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6210:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6211:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6211:2: ( RULE_ID )
            // InternalMyDsl.g:6212:3: RULE_ID
            {
             before(grammarAccess.getPhotoActionsFunctionsAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPhotoActionsFunctionsAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__PhotoActionsFunctions__NameAssignment_1"


    // $ANTLR start "rule__PhotoActionsFunctions__NameAssignment_3"
    // InternalMyDsl.g:6221:1: rule__PhotoActionsFunctions__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__PhotoActionsFunctions__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6225:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6226:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6226:2: ( RULE_ID )
            // InternalMyDsl.g:6227:3: RULE_ID
            {
             before(grammarAccess.getPhotoActionsFunctionsAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPhotoActionsFunctionsAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__PhotoActionsFunctions__NameAssignment_3"


    // $ANTLR start "rule__PhotoActionsFunctions__NameAssignment_5"
    // InternalMyDsl.g:6236:1: rule__PhotoActionsFunctions__NameAssignment_5 : ( RULE_ID ) ;
    public final void rule__PhotoActionsFunctions__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6240:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6241:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6241:2: ( RULE_ID )
            // InternalMyDsl.g:6242:3: RULE_ID
            {
             before(grammarAccess.getPhotoActionsFunctionsAccess().getNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPhotoActionsFunctionsAccess().getNameIDTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__PhotoActionsFunctions__NameAssignment_5"


    // $ANTLR start "rule__LandingActions__ItemsAssignment_2"
    // InternalMyDsl.g:6251:1: rule__LandingActions__ItemsAssignment_2 : ( ruleLandingFunctions ) ;
    public final void rule__LandingActions__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6255:1: ( ( ruleLandingFunctions ) )
            // InternalMyDsl.g:6256:2: ( ruleLandingFunctions )
            {
            // InternalMyDsl.g:6256:2: ( ruleLandingFunctions )
            // InternalMyDsl.g:6257:3: ruleLandingFunctions
            {
             before(grammarAccess.getLandingActionsAccess().getItemsLandingFunctionsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLandingFunctions();

            state._fsp--;

             after(grammarAccess.getLandingActionsAccess().getItemsLandingFunctionsParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__LandingActions__ItemsAssignment_2"


    // $ANTLR start "rule__LandingFunctions__NameAssignment_1"
    // InternalMyDsl.g:6266:1: rule__LandingFunctions__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LandingFunctions__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6270:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6271:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6271:2: ( RULE_ID )
            // InternalMyDsl.g:6272:3: RULE_ID
            {
             before(grammarAccess.getLandingFunctionsAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLandingFunctionsAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__LandingFunctions__NameAssignment_1"


    // $ANTLR start "rule__LandingFunctions__NameAssignment_3"
    // InternalMyDsl.g:6281:1: rule__LandingFunctions__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__LandingFunctions__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6285:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6286:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6286:2: ( RULE_ID )
            // InternalMyDsl.g:6287:3: RULE_ID
            {
             before(grammarAccess.getLandingFunctionsAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLandingFunctionsAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__LandingFunctions__NameAssignment_3"


    // $ANTLR start "rule__DomainConnection__ElementsAssignment_3"
    // InternalMyDsl.g:6296:1: rule__DomainConnection__ElementsAssignment_3 : ( ruleDomainRelations ) ;
    public final void rule__DomainConnection__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6300:1: ( ( ruleDomainRelations ) )
            // InternalMyDsl.g:6301:2: ( ruleDomainRelations )
            {
            // InternalMyDsl.g:6301:2: ( ruleDomainRelations )
            // InternalMyDsl.g:6302:3: ruleDomainRelations
            {
             before(grammarAccess.getDomainConnectionAccess().getElementsDomainRelationsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDomainRelations();

            state._fsp--;

             after(grammarAccess.getDomainConnectionAccess().getElementsDomainRelationsParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__DomainConnection__ElementsAssignment_3"


    // $ANTLR start "rule__DomainRelations__ElementsAssignment_0"
    // InternalMyDsl.g:6311:1: rule__DomainRelations__ElementsAssignment_0 : ( ruleUserDomain ) ;
    public final void rule__DomainRelations__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6315:1: ( ( ruleUserDomain ) )
            // InternalMyDsl.g:6316:2: ( ruleUserDomain )
            {
            // InternalMyDsl.g:6316:2: ( ruleUserDomain )
            // InternalMyDsl.g:6317:3: ruleUserDomain
            {
             before(grammarAccess.getDomainRelationsAccess().getElementsUserDomainParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUserDomain();

            state._fsp--;

             after(grammarAccess.getDomainRelationsAccess().getElementsUserDomainParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__DomainRelations__ElementsAssignment_0"


    // $ANTLR start "rule__DomainRelations__NameAssignment_1"
    // InternalMyDsl.g:6326:1: rule__DomainRelations__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DomainRelations__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6330:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6331:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6331:2: ( RULE_ID )
            // InternalMyDsl.g:6332:3: RULE_ID
            {
             before(grammarAccess.getDomainRelationsAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDomainRelationsAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DomainRelations__NameAssignment_1"


    // $ANTLR start "rule__DomainRelations__ElementsAssignment_4"
    // InternalMyDsl.g:6341:1: rule__DomainRelations__ElementsAssignment_4 : ( ruleFunctionalities ) ;
    public final void rule__DomainRelations__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6345:1: ( ( ruleFunctionalities ) )
            // InternalMyDsl.g:6346:2: ( ruleFunctionalities )
            {
            // InternalMyDsl.g:6346:2: ( ruleFunctionalities )
            // InternalMyDsl.g:6347:3: ruleFunctionalities
            {
             before(grammarAccess.getDomainRelationsAccess().getElementsFunctionalitiesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionalities();

            state._fsp--;

             after(grammarAccess.getDomainRelationsAccess().getElementsFunctionalitiesParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__DomainRelations__ElementsAssignment_4"


    // $ANTLR start "rule__DomainRelations__ElementsAssignment_6"
    // InternalMyDsl.g:6356:1: rule__DomainRelations__ElementsAssignment_6 : ( ruleAlbum ) ;
    public final void rule__DomainRelations__ElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6360:1: ( ( ruleAlbum ) )
            // InternalMyDsl.g:6361:2: ( ruleAlbum )
            {
            // InternalMyDsl.g:6361:2: ( ruleAlbum )
            // InternalMyDsl.g:6362:3: ruleAlbum
            {
             before(grammarAccess.getDomainRelationsAccess().getElementsAlbumParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAlbum();

            state._fsp--;

             after(grammarAccess.getDomainRelationsAccess().getElementsAlbumParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__DomainRelations__ElementsAssignment_6"


    // $ANTLR start "rule__DomainRelations__NameAssignment_7"
    // InternalMyDsl.g:6371:1: rule__DomainRelations__NameAssignment_7 : ( RULE_ID ) ;
    public final void rule__DomainRelations__NameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6375:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6376:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6376:2: ( RULE_ID )
            // InternalMyDsl.g:6377:3: RULE_ID
            {
             before(grammarAccess.getDomainRelationsAccess().getNameIDTerminalRuleCall_7_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDomainRelationsAccess().getNameIDTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__DomainRelations__NameAssignment_7"


    // $ANTLR start "rule__DomainRelations__ElementsAssignment_10"
    // InternalMyDsl.g:6386:1: rule__DomainRelations__ElementsAssignment_10 : ( ruleAlbumManagementFunctions ) ;
    public final void rule__DomainRelations__ElementsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6390:1: ( ( ruleAlbumManagementFunctions ) )
            // InternalMyDsl.g:6391:2: ( ruleAlbumManagementFunctions )
            {
            // InternalMyDsl.g:6391:2: ( ruleAlbumManagementFunctions )
            // InternalMyDsl.g:6392:3: ruleAlbumManagementFunctions
            {
             before(grammarAccess.getDomainRelationsAccess().getElementsAlbumManagementFunctionsParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleAlbumManagementFunctions();

            state._fsp--;

             after(grammarAccess.getDomainRelationsAccess().getElementsAlbumManagementFunctionsParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__DomainRelations__ElementsAssignment_10"


    // $ANTLR start "rule__DomainRelations__ElementsAssignment_12"
    // InternalMyDsl.g:6401:1: rule__DomainRelations__ElementsAssignment_12 : ( rulePhoto ) ;
    public final void rule__DomainRelations__ElementsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6405:1: ( ( rulePhoto ) )
            // InternalMyDsl.g:6406:2: ( rulePhoto )
            {
            // InternalMyDsl.g:6406:2: ( rulePhoto )
            // InternalMyDsl.g:6407:3: rulePhoto
            {
             before(grammarAccess.getDomainRelationsAccess().getElementsPhotoParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            rulePhoto();

            state._fsp--;

             after(grammarAccess.getDomainRelationsAccess().getElementsPhotoParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__DomainRelations__ElementsAssignment_12"


    // $ANTLR start "rule__DomainRelations__NameAssignment_13"
    // InternalMyDsl.g:6416:1: rule__DomainRelations__NameAssignment_13 : ( RULE_ID ) ;
    public final void rule__DomainRelations__NameAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6420:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6421:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6421:2: ( RULE_ID )
            // InternalMyDsl.g:6422:3: RULE_ID
            {
             before(grammarAccess.getDomainRelationsAccess().getNameIDTerminalRuleCall_13_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDomainRelationsAccess().getNameIDTerminalRuleCall_13_0()); 

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
    // $ANTLR end "rule__DomainRelations__NameAssignment_13"


    // $ANTLR start "rule__DomainRelations__ElementsAssignment_16"
    // InternalMyDsl.g:6431:1: rule__DomainRelations__ElementsAssignment_16 : ( rulePhotoActionsFunctions ) ;
    public final void rule__DomainRelations__ElementsAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6435:1: ( ( rulePhotoActionsFunctions ) )
            // InternalMyDsl.g:6436:2: ( rulePhotoActionsFunctions )
            {
            // InternalMyDsl.g:6436:2: ( rulePhotoActionsFunctions )
            // InternalMyDsl.g:6437:3: rulePhotoActionsFunctions
            {
             before(grammarAccess.getDomainRelationsAccess().getElementsPhotoActionsFunctionsParserRuleCall_16_0()); 
            pushFollow(FOLLOW_2);
            rulePhotoActionsFunctions();

            state._fsp--;

             after(grammarAccess.getDomainRelationsAccess().getElementsPhotoActionsFunctionsParserRuleCall_16_0()); 

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
    // $ANTLR end "rule__DomainRelations__ElementsAssignment_16"


    // $ANTLR start "rule__DomainRelations__ElementsAssignment_18"
    // InternalMyDsl.g:6446:1: rule__DomainRelations__ElementsAssignment_18 : ( rulePhotoActions ) ;
    public final void rule__DomainRelations__ElementsAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6450:1: ( ( rulePhotoActions ) )
            // InternalMyDsl.g:6451:2: ( rulePhotoActions )
            {
            // InternalMyDsl.g:6451:2: ( rulePhotoActions )
            // InternalMyDsl.g:6452:3: rulePhotoActions
            {
             before(grammarAccess.getDomainRelationsAccess().getElementsPhotoActionsParserRuleCall_18_0()); 
            pushFollow(FOLLOW_2);
            rulePhotoActions();

            state._fsp--;

             after(grammarAccess.getDomainRelationsAccess().getElementsPhotoActionsParserRuleCall_18_0()); 

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
    // $ANTLR end "rule__DomainRelations__ElementsAssignment_18"


    // $ANTLR start "rule__DomainRelations__NameAssignment_19"
    // InternalMyDsl.g:6461:1: rule__DomainRelations__NameAssignment_19 : ( RULE_ID ) ;
    public final void rule__DomainRelations__NameAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6465:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6466:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6466:2: ( RULE_ID )
            // InternalMyDsl.g:6467:3: RULE_ID
            {
             before(grammarAccess.getDomainRelationsAccess().getNameIDTerminalRuleCall_19_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDomainRelationsAccess().getNameIDTerminalRuleCall_19_0()); 

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
    // $ANTLR end "rule__DomainRelations__NameAssignment_19"


    // $ANTLR start "rule__DomainRelations__ElementsAssignment_22"
    // InternalMyDsl.g:6476:1: rule__DomainRelations__ElementsAssignment_22 : ( ruleAlbumManagement ) ;
    public final void rule__DomainRelations__ElementsAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6480:1: ( ( ruleAlbumManagement ) )
            // InternalMyDsl.g:6481:2: ( ruleAlbumManagement )
            {
            // InternalMyDsl.g:6481:2: ( ruleAlbumManagement )
            // InternalMyDsl.g:6482:3: ruleAlbumManagement
            {
             before(grammarAccess.getDomainRelationsAccess().getElementsAlbumManagementParserRuleCall_22_0()); 
            pushFollow(FOLLOW_2);
            ruleAlbumManagement();

            state._fsp--;

             after(grammarAccess.getDomainRelationsAccess().getElementsAlbumManagementParserRuleCall_22_0()); 

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
    // $ANTLR end "rule__DomainRelations__ElementsAssignment_22"


    // $ANTLR start "rule__Architecture__NameAssignment_2"
    // InternalMyDsl.g:6491:1: rule__Architecture__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Architecture__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6495:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6496:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6496:2: ( RULE_ID )
            // InternalMyDsl.g:6497:3: RULE_ID
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


    // $ANTLR start "rule__Technology__NameAssignment_1"
    // InternalMyDsl.g:6506:1: rule__Technology__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Technology__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6510:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6511:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6511:2: ( RULE_ID )
            // InternalMyDsl.g:6512:3: RULE_ID
            {
             before(grammarAccess.getTechnologyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTechnologyAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Technology__NameAssignment_1"


    // $ANTLR start "rule__Technology__ElementsAssignment_4"
    // InternalMyDsl.g:6521:1: rule__Technology__ElementsAssignment_4 : ( ruleTechnologies ) ;
    public final void rule__Technology__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6525:1: ( ( ruleTechnologies ) )
            // InternalMyDsl.g:6526:2: ( ruleTechnologies )
            {
            // InternalMyDsl.g:6526:2: ( ruleTechnologies )
            // InternalMyDsl.g:6527:3: ruleTechnologies
            {
             before(grammarAccess.getTechnologyAccess().getElementsTechnologiesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTechnologies();

            state._fsp--;

             after(grammarAccess.getTechnologyAccess().getElementsTechnologiesParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Technology__ElementsAssignment_4"


    // $ANTLR start "rule__Technologies__FactorsAssignment_0"
    // InternalMyDsl.g:6536:1: rule__Technologies__FactorsAssignment_0 : ( ruleSpring ) ;
    public final void rule__Technologies__FactorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6540:1: ( ( ruleSpring ) )
            // InternalMyDsl.g:6541:2: ( ruleSpring )
            {
            // InternalMyDsl.g:6541:2: ( ruleSpring )
            // InternalMyDsl.g:6542:3: ruleSpring
            {
             before(grammarAccess.getTechnologiesAccess().getFactorsSpringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSpring();

            state._fsp--;

             after(grammarAccess.getTechnologiesAccess().getFactorsSpringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Technologies__FactorsAssignment_0"


    // $ANTLR start "rule__Technologies__FactorsAssignment_1"
    // InternalMyDsl.g:6551:1: rule__Technologies__FactorsAssignment_1 : ( ruleReact ) ;
    public final void rule__Technologies__FactorsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6555:1: ( ( ruleReact ) )
            // InternalMyDsl.g:6556:2: ( ruleReact )
            {
            // InternalMyDsl.g:6556:2: ( ruleReact )
            // InternalMyDsl.g:6557:3: ruleReact
            {
             before(grammarAccess.getTechnologiesAccess().getFactorsReactParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReact();

            state._fsp--;

             after(grammarAccess.getTechnologiesAccess().getFactorsReactParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Technologies__FactorsAssignment_1"


    // $ANTLR start "rule__Technologies__FactorsAssignment_2"
    // InternalMyDsl.g:6566:1: rule__Technologies__FactorsAssignment_2 : ( rulePostgreSQL ) ;
    public final void rule__Technologies__FactorsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6570:1: ( ( rulePostgreSQL ) )
            // InternalMyDsl.g:6571:2: ( rulePostgreSQL )
            {
            // InternalMyDsl.g:6571:2: ( rulePostgreSQL )
            // InternalMyDsl.g:6572:3: rulePostgreSQL
            {
             before(grammarAccess.getTechnologiesAccess().getFactorsPostgreSQLParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePostgreSQL();

            state._fsp--;

             after(grammarAccess.getTechnologiesAccess().getFactorsPostgreSQLParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Technologies__FactorsAssignment_2"


    // $ANTLR start "rule__Technologies__FactorsAssignment_3"
    // InternalMyDsl.g:6581:1: rule__Technologies__FactorsAssignment_3 : ( ruleAmazonWebServices ) ;
    public final void rule__Technologies__FactorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6585:1: ( ( ruleAmazonWebServices ) )
            // InternalMyDsl.g:6586:2: ( ruleAmazonWebServices )
            {
            // InternalMyDsl.g:6586:2: ( ruleAmazonWebServices )
            // InternalMyDsl.g:6587:3: ruleAmazonWebServices
            {
             before(grammarAccess.getTechnologiesAccess().getFactorsAmazonWebServicesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAmazonWebServices();

            state._fsp--;

             after(grammarAccess.getTechnologiesAccess().getFactorsAmazonWebServicesParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Technologies__FactorsAssignment_3"


    // $ANTLR start "rule__React__NameAssignment_1"
    // InternalMyDsl.g:6596:1: rule__React__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__React__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6600:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6601:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6601:2: ( RULE_ID )
            // InternalMyDsl.g:6602:3: RULE_ID
            {
             before(grammarAccess.getReactAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReactAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__React__NameAssignment_1"


    // $ANTLR start "rule__React__ReactsAssignment_4"
    // InternalMyDsl.g:6611:1: rule__React__ReactsAssignment_4 : ( ruleReactModules ) ;
    public final void rule__React__ReactsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6615:1: ( ( ruleReactModules ) )
            // InternalMyDsl.g:6616:2: ( ruleReactModules )
            {
            // InternalMyDsl.g:6616:2: ( ruleReactModules )
            // InternalMyDsl.g:6617:3: ruleReactModules
            {
             before(grammarAccess.getReactAccess().getReactsReactModulesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleReactModules();

            state._fsp--;

             after(grammarAccess.getReactAccess().getReactsReactModulesParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__React__ReactsAssignment_4"


    // $ANTLR start "rule__ReactModules__ReactmodulesAssignment_3"
    // InternalMyDsl.g:6626:1: rule__ReactModules__ReactmodulesAssignment_3 : ( ruleReactSubModules ) ;
    public final void rule__ReactModules__ReactmodulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6630:1: ( ( ruleReactSubModules ) )
            // InternalMyDsl.g:6631:2: ( ruleReactSubModules )
            {
            // InternalMyDsl.g:6631:2: ( ruleReactSubModules )
            // InternalMyDsl.g:6632:3: ruleReactSubModules
            {
             before(grammarAccess.getReactModulesAccess().getReactmodulesReactSubModulesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleReactSubModules();

            state._fsp--;

             after(grammarAccess.getReactModulesAccess().getReactmodulesReactSubModulesParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ReactModules__ReactmodulesAssignment_3"


    // $ANTLR start "rule__ReactSubModules__ReactmodulesAssignment_0"
    // InternalMyDsl.g:6641:1: rule__ReactSubModules__ReactmodulesAssignment_0 : ( ruleReactConfiguration ) ;
    public final void rule__ReactSubModules__ReactmodulesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6645:1: ( ( ruleReactConfiguration ) )
            // InternalMyDsl.g:6646:2: ( ruleReactConfiguration )
            {
            // InternalMyDsl.g:6646:2: ( ruleReactConfiguration )
            // InternalMyDsl.g:6647:3: ruleReactConfiguration
            {
             before(grammarAccess.getReactSubModulesAccess().getReactmodulesReactConfigurationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleReactConfiguration();

            state._fsp--;

             after(grammarAccess.getReactSubModulesAccess().getReactmodulesReactConfigurationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ReactSubModules__ReactmodulesAssignment_0"


    // $ANTLR start "rule__ReactSubModules__ReactmodulesAssignment_1"
    // InternalMyDsl.g:6656:1: rule__ReactSubModules__ReactmodulesAssignment_1 : ( ruleReactComponents ) ;
    public final void rule__ReactSubModules__ReactmodulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6660:1: ( ( ruleReactComponents ) )
            // InternalMyDsl.g:6661:2: ( ruleReactComponents )
            {
            // InternalMyDsl.g:6661:2: ( ruleReactComponents )
            // InternalMyDsl.g:6662:3: ruleReactComponents
            {
             before(grammarAccess.getReactSubModulesAccess().getReactmodulesReactComponentsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReactComponents();

            state._fsp--;

             after(grammarAccess.getReactSubModulesAccess().getReactmodulesReactComponentsParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ReactSubModules__ReactmodulesAssignment_1"


    // $ANTLR start "rule__ReactSubModules__ReactmodulesAssignment_2"
    // InternalMyDsl.g:6671:1: rule__ReactSubModules__ReactmodulesAssignment_2 : ( ruleReactActions ) ;
    public final void rule__ReactSubModules__ReactmodulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6675:1: ( ( ruleReactActions ) )
            // InternalMyDsl.g:6676:2: ( ruleReactActions )
            {
            // InternalMyDsl.g:6676:2: ( ruleReactActions )
            // InternalMyDsl.g:6677:3: ruleReactActions
            {
             before(grammarAccess.getReactSubModulesAccess().getReactmodulesReactActionsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReactActions();

            state._fsp--;

             after(grammarAccess.getReactSubModulesAccess().getReactmodulesReactActionsParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ReactSubModules__ReactmodulesAssignment_2"


    // $ANTLR start "rule__ReactSubModules__ReactmodulesAssignment_3"
    // InternalMyDsl.g:6686:1: rule__ReactSubModules__ReactmodulesAssignment_3 : ( ruleReactLibraries ) ;
    public final void rule__ReactSubModules__ReactmodulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6690:1: ( ( ruleReactLibraries ) )
            // InternalMyDsl.g:6691:2: ( ruleReactLibraries )
            {
            // InternalMyDsl.g:6691:2: ( ruleReactLibraries )
            // InternalMyDsl.g:6692:3: ruleReactLibraries
            {
             before(grammarAccess.getReactSubModulesAccess().getReactmodulesReactLibrariesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleReactLibraries();

            state._fsp--;

             after(grammarAccess.getReactSubModulesAccess().getReactmodulesReactLibrariesParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ReactSubModules__ReactmodulesAssignment_3"


    // $ANTLR start "rule__ReactSubModules__ReactmodulesAssignment_4"
    // InternalMyDsl.g:6701:1: rule__ReactSubModules__ReactmodulesAssignment_4 : ( ruleReactInfo ) ;
    public final void rule__ReactSubModules__ReactmodulesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6705:1: ( ( ruleReactInfo ) )
            // InternalMyDsl.g:6706:2: ( ruleReactInfo )
            {
            // InternalMyDsl.g:6706:2: ( ruleReactInfo )
            // InternalMyDsl.g:6707:3: ruleReactInfo
            {
             before(grammarAccess.getReactSubModulesAccess().getReactmodulesReactInfoParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleReactInfo();

            state._fsp--;

             after(grammarAccess.getReactSubModulesAccess().getReactmodulesReactInfoParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ReactSubModules__ReactmodulesAssignment_4"


    // $ANTLR start "rule__ReactConfiguration__DependenciesAssignment_1"
    // InternalMyDsl.g:6716:1: rule__ReactConfiguration__DependenciesAssignment_1 : ( ruleReactDependencies ) ;
    public final void rule__ReactConfiguration__DependenciesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6720:1: ( ( ruleReactDependencies ) )
            // InternalMyDsl.g:6721:2: ( ruleReactDependencies )
            {
            // InternalMyDsl.g:6721:2: ( ruleReactDependencies )
            // InternalMyDsl.g:6722:3: ruleReactDependencies
            {
             before(grammarAccess.getReactConfigurationAccess().getDependenciesReactDependenciesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReactDependencies();

            state._fsp--;

             after(grammarAccess.getReactConfigurationAccess().getDependenciesReactDependenciesParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ReactConfiguration__DependenciesAssignment_1"


    // $ANTLR start "rule__ReactConfiguration__ConfigurationsAssignment_2"
    // InternalMyDsl.g:6731:1: rule__ReactConfiguration__ConfigurationsAssignment_2 : ( ruleReactConfigurations ) ;
    public final void rule__ReactConfiguration__ConfigurationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6735:1: ( ( ruleReactConfigurations ) )
            // InternalMyDsl.g:6736:2: ( ruleReactConfigurations )
            {
            // InternalMyDsl.g:6736:2: ( ruleReactConfigurations )
            // InternalMyDsl.g:6737:3: ruleReactConfigurations
            {
             before(grammarAccess.getReactConfigurationAccess().getConfigurationsReactConfigurationsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReactConfigurations();

            state._fsp--;

             after(grammarAccess.getReactConfigurationAccess().getConfigurationsReactConfigurationsParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ReactConfiguration__ConfigurationsAssignment_2"


    // $ANTLR start "rule__ReactDependencies__DependenciesAssignment_1"
    // InternalMyDsl.g:6746:1: rule__ReactDependencies__DependenciesAssignment_1 : ( ruleReactDependenciesRules ) ;
    public final void rule__ReactDependencies__DependenciesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6750:1: ( ( ruleReactDependenciesRules ) )
            // InternalMyDsl.g:6751:2: ( ruleReactDependenciesRules )
            {
            // InternalMyDsl.g:6751:2: ( ruleReactDependenciesRules )
            // InternalMyDsl.g:6752:3: ruleReactDependenciesRules
            {
             before(grammarAccess.getReactDependenciesAccess().getDependenciesReactDependenciesRulesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReactDependenciesRules();

            state._fsp--;

             after(grammarAccess.getReactDependenciesAccess().getDependenciesReactDependenciesRulesParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ReactDependencies__DependenciesAssignment_1"


    // $ANTLR start "rule__ReactDependenciesRules__NameAssignment_1"
    // InternalMyDsl.g:6761:1: rule__ReactDependenciesRules__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ReactDependenciesRules__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6765:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6766:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6766:2: ( RULE_ID )
            // InternalMyDsl.g:6767:3: RULE_ID
            {
             before(grammarAccess.getReactDependenciesRulesAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReactDependenciesRulesAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ReactDependenciesRules__NameAssignment_1"


    // $ANTLR start "rule__ReactDependenciesRules__DependenciesAssignment_2"
    // InternalMyDsl.g:6776:1: rule__ReactDependenciesRules__DependenciesAssignment_2 : ( ruleReactDependenciesSubRules ) ;
    public final void rule__ReactDependenciesRules__DependenciesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6780:1: ( ( ruleReactDependenciesSubRules ) )
            // InternalMyDsl.g:6781:2: ( ruleReactDependenciesSubRules )
            {
            // InternalMyDsl.g:6781:2: ( ruleReactDependenciesSubRules )
            // InternalMyDsl.g:6782:3: ruleReactDependenciesSubRules
            {
             before(grammarAccess.getReactDependenciesRulesAccess().getDependenciesReactDependenciesSubRulesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReactDependenciesSubRules();

            state._fsp--;

             after(grammarAccess.getReactDependenciesRulesAccess().getDependenciesReactDependenciesSubRulesParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ReactDependenciesRules__DependenciesAssignment_2"


    // $ANTLR start "rule__ReactDependenciesSubRules__DependenciesAssignment"
    // InternalMyDsl.g:6791:1: rule__ReactDependenciesSubRules__DependenciesAssignment : ( ruleSingleDependencies ) ;
    public final void rule__ReactDependenciesSubRules__DependenciesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6795:1: ( ( ruleSingleDependencies ) )
            // InternalMyDsl.g:6796:2: ( ruleSingleDependencies )
            {
            // InternalMyDsl.g:6796:2: ( ruleSingleDependencies )
            // InternalMyDsl.g:6797:3: ruleSingleDependencies
            {
             before(grammarAccess.getReactDependenciesSubRulesAccess().getDependenciesSingleDependenciesParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSingleDependencies();

            state._fsp--;

             after(grammarAccess.getReactDependenciesSubRulesAccess().getDependenciesSingleDependenciesParserRuleCall_0()); 

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
    // $ANTLR end "rule__ReactDependenciesSubRules__DependenciesAssignment"


    // $ANTLR start "rule__SingleDependencies__DependenciesAssignment_0"
    // InternalMyDsl.g:6806:1: rule__SingleDependencies__DependenciesAssignment_0 : ( rulePackageName ) ;
    public final void rule__SingleDependencies__DependenciesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6810:1: ( ( rulePackageName ) )
            // InternalMyDsl.g:6811:2: ( rulePackageName )
            {
            // InternalMyDsl.g:6811:2: ( rulePackageName )
            // InternalMyDsl.g:6812:3: rulePackageName
            {
             before(grammarAccess.getSingleDependenciesAccess().getDependenciesPackageNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePackageName();

            state._fsp--;

             after(grammarAccess.getSingleDependenciesAccess().getDependenciesPackageNameParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__SingleDependencies__DependenciesAssignment_0"


    // $ANTLR start "rule__SingleDependencies__DependenciesAssignment_1"
    // InternalMyDsl.g:6821:1: rule__SingleDependencies__DependenciesAssignment_1 : ( rulePackageVersion ) ;
    public final void rule__SingleDependencies__DependenciesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6825:1: ( ( rulePackageVersion ) )
            // InternalMyDsl.g:6826:2: ( rulePackageVersion )
            {
            // InternalMyDsl.g:6826:2: ( rulePackageVersion )
            // InternalMyDsl.g:6827:3: rulePackageVersion
            {
             before(grammarAccess.getSingleDependenciesAccess().getDependenciesPackageVersionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePackageVersion();

            state._fsp--;

             after(grammarAccess.getSingleDependenciesAccess().getDependenciesPackageVersionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__SingleDependencies__DependenciesAssignment_1"


    // $ANTLR start "rule__PackageName__NameAssignment_1"
    // InternalMyDsl.g:6836:1: rule__PackageName__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PackageName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6840:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6841:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6841:2: ( RULE_ID )
            // InternalMyDsl.g:6842:3: RULE_ID
            {
             before(grammarAccess.getPackageNameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPackageNameAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__PackageName__NameAssignment_1"


    // $ANTLR start "rule__PackageVersion__NameAssignment_1"
    // InternalMyDsl.g:6851:1: rule__PackageVersion__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PackageVersion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6855:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6856:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6856:2: ( RULE_ID )
            // InternalMyDsl.g:6857:3: RULE_ID
            {
             before(grammarAccess.getPackageVersionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPackageVersionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__PackageVersion__NameAssignment_1"


    // $ANTLR start "rule__ReactConfigurations__NameAssignment_1"
    // InternalMyDsl.g:6866:1: rule__ReactConfigurations__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ReactConfigurations__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6870:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6871:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6871:2: ( RULE_ID )
            // InternalMyDsl.g:6872:3: RULE_ID
            {
             before(grammarAccess.getReactConfigurationsAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReactConfigurationsAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ReactConfigurations__NameAssignment_1"


    // $ANTLR start "rule__ReactComponents__ComponentslogicAssignment_1"
    // InternalMyDsl.g:6881:1: rule__ReactComponents__ComponentslogicAssignment_1 : ( ruleComponentsLogic ) ;
    public final void rule__ReactComponents__ComponentslogicAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6885:1: ( ( ruleComponentsLogic ) )
            // InternalMyDsl.g:6886:2: ( ruleComponentsLogic )
            {
            // InternalMyDsl.g:6886:2: ( ruleComponentsLogic )
            // InternalMyDsl.g:6887:3: ruleComponentsLogic
            {
             before(grammarAccess.getReactComponentsAccess().getComponentslogicComponentsLogicParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentsLogic();

            state._fsp--;

             after(grammarAccess.getReactComponentsAccess().getComponentslogicComponentsLogicParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ReactComponents__ComponentslogicAssignment_1"


    // $ANTLR start "rule__ReactComponents__ComponentsuiAssignment_2"
    // InternalMyDsl.g:6896:1: rule__ReactComponents__ComponentsuiAssignment_2 : ( ruleComponentsUI ) ;
    public final void rule__ReactComponents__ComponentsuiAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6900:1: ( ( ruleComponentsUI ) )
            // InternalMyDsl.g:6901:2: ( ruleComponentsUI )
            {
            // InternalMyDsl.g:6901:2: ( ruleComponentsUI )
            // InternalMyDsl.g:6902:3: ruleComponentsUI
            {
             before(grammarAccess.getReactComponentsAccess().getComponentsuiComponentsUIParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentsUI();

            state._fsp--;

             after(grammarAccess.getReactComponentsAccess().getComponentsuiComponentsUIParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ReactComponents__ComponentsuiAssignment_2"


    // $ANTLR start "rule__ComponentsLogic__NameAssignment_1"
    // InternalMyDsl.g:6911:1: rule__ComponentsLogic__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ComponentsLogic__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6915:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6916:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6916:2: ( RULE_ID )
            // InternalMyDsl.g:6917:3: RULE_ID
            {
             before(grammarAccess.getComponentsLogicAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentsLogicAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ComponentsLogic__NameAssignment_1"


    // $ANTLR start "rule__ComponentsUI__NameAssignment_1"
    // InternalMyDsl.g:6926:1: rule__ComponentsUI__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ComponentsUI__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6930:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6931:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6931:2: ( RULE_ID )
            // InternalMyDsl.g:6932:3: RULE_ID
            {
             before(grammarAccess.getComponentsUIAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentsUIAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ComponentsUI__NameAssignment_1"


    // $ANTLR start "rule__ReactActions__NameAssignment_1"
    // InternalMyDsl.g:6941:1: rule__ReactActions__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ReactActions__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6945:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6946:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6946:2: ( RULE_ID )
            // InternalMyDsl.g:6947:3: RULE_ID
            {
             before(grammarAccess.getReactActionsAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReactActionsAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ReactActions__NameAssignment_1"


    // $ANTLR start "rule__ReactLibraries__NameAssignment_1"
    // InternalMyDsl.g:6956:1: rule__ReactLibraries__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ReactLibraries__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6960:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6961:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6961:2: ( RULE_ID )
            // InternalMyDsl.g:6962:3: RULE_ID
            {
             before(grammarAccess.getReactLibrariesAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReactLibrariesAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ReactLibraries__NameAssignment_1"


    // $ANTLR start "rule__ReactInfo__NameAssignment_1"
    // InternalMyDsl.g:6971:1: rule__ReactInfo__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ReactInfo__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6975:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6976:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6976:2: ( RULE_ID )
            // InternalMyDsl.g:6977:3: RULE_ID
            {
             before(grammarAccess.getReactInfoAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReactInfoAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ReactInfo__NameAssignment_1"


    // $ANTLR start "rule__Spring__NameAssignment_1"
    // InternalMyDsl.g:6986:1: rule__Spring__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Spring__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6990:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6991:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6991:2: ( RULE_ID )
            // InternalMyDsl.g:6992:3: RULE_ID
            {
             before(grammarAccess.getSpringAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpringAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Spring__NameAssignment_1"


    // $ANTLR start "rule__PostgreSQL__NameAssignment_1"
    // InternalMyDsl.g:7001:1: rule__PostgreSQL__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PostgreSQL__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7005:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7006:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7006:2: ( RULE_ID )
            // InternalMyDsl.g:7007:3: RULE_ID
            {
             before(grammarAccess.getPostgreSQLAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPostgreSQLAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__PostgreSQL__NameAssignment_1"


    // $ANTLR start "rule__AmazonWebServices__NameAssignment_1"
    // InternalMyDsl.g:7016:1: rule__AmazonWebServices__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AmazonWebServices__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7020:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7021:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7021:2: ( RULE_ID )
            // InternalMyDsl.g:7022:3: RULE_ID
            {
             before(grammarAccess.getAmazonWebServicesAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAmazonWebServicesAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AmazonWebServices__NameAssignment_1"

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