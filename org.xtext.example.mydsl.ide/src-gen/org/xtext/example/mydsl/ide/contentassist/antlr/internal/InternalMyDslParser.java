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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RoutingConf'", "'ServiceWorker'", "'HTMLStructure'", "'Manifest'", "'RepositoriesConf'", "'String'", "'Array'", "'Object'", "'Number'", "'null'", "'Boolean'", "'Wrapper'", "'AuxWrapper'", "'ReactDesign'", "'ReactRouting'", "'ComponentManagement'", "'StoreManagement'", "'ReactDeployment'", "'ConfigurationLibrary'", "'ReactReadme'", "'ReactAditionalInfo'", "'System'", "':'", "'{'", "'}'", "'Domain'", "'Entities'", "'Photo'", "'Album'", "'UserDomain'", "'Functionalities'", "'ProfileManagement'", "'ViewProfilePhoto'", "'EditProfileInfo'", "'AppAccess'", "'Login'", "'Register'", "'AlbumManagement'", "'CreateAlbum'", "'SelectAlbum'", "'PhotoActions'", "'ViewAllPhotos'", "'ViewExtendedPhoto'", "'LoadPhoto'", "'LandingActions'", "'ViewCarousel'", "'PassPhoto'", "'DomainRelations'", "'Architecture:'", "'Technology'", "'React'", "'ReactModules'", "'ReactConfiguration'", "'DependenciesStruct'", "'DependencyType'", "'PackageName'", "'PackageVersion'", "'ReactDOMConfigurations'", "'ReactComponents'", "'LogicComponents'", "'RoutingComponents'", "'AppComponent'", "'IndexComponent'", "'UIComponents'", "'ViewComponent'", "'Subcomponents'", "'Constructor'", "'State'", "'FunctionBindingDeclaration'", "'ComponentDidMount'", "'FunctionStructure'", "'ComponentDidUpdate'", "'ComponentWillUnmount'", "'Render'", "'RenderContent'", "'Props'", "'ReactActions'", "'ServiceType'", "'ServiceContent'", "'ServicesRelations'", "'ReactLibraries'", "'LibraryContent'", "'ReactInformation'", "'InformationContent'", "'Spring'", "'PostgreSQL'", "'AmazonWebServices'"
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


    // $ANTLR start "entryRuleDOMConfigurations"
    // InternalMyDsl.g:928:1: entryRuleDOMConfigurations : ruleDOMConfigurations EOF ;
    public final void entryRuleDOMConfigurations() throws RecognitionException {
        try {
            // InternalMyDsl.g:929:1: ( ruleDOMConfigurations EOF )
            // InternalMyDsl.g:930:1: ruleDOMConfigurations EOF
            {
             before(grammarAccess.getDOMConfigurationsRule()); 
            pushFollow(FOLLOW_1);
            ruleDOMConfigurations();

            state._fsp--;

             after(grammarAccess.getDOMConfigurationsRule()); 
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
    // $ANTLR end "entryRuleDOMConfigurations"


    // $ANTLR start "ruleDOMConfigurations"
    // InternalMyDsl.g:937:1: ruleDOMConfigurations : ( ( rule__DOMConfigurations__Group__0 ) ) ;
    public final void ruleDOMConfigurations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:941:2: ( ( ( rule__DOMConfigurations__Group__0 ) ) )
            // InternalMyDsl.g:942:2: ( ( rule__DOMConfigurations__Group__0 ) )
            {
            // InternalMyDsl.g:942:2: ( ( rule__DOMConfigurations__Group__0 ) )
            // InternalMyDsl.g:943:3: ( rule__DOMConfigurations__Group__0 )
            {
             before(grammarAccess.getDOMConfigurationsAccess().getGroup()); 
            // InternalMyDsl.g:944:3: ( rule__DOMConfigurations__Group__0 )
            // InternalMyDsl.g:944:4: rule__DOMConfigurations__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DOMConfigurations__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDOMConfigurationsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDOMConfigurations"


    // $ANTLR start "entryRuleDOMTypeConf"
    // InternalMyDsl.g:953:1: entryRuleDOMTypeConf : ruleDOMTypeConf EOF ;
    public final void entryRuleDOMTypeConf() throws RecognitionException {
        try {
            // InternalMyDsl.g:954:1: ( ruleDOMTypeConf EOF )
            // InternalMyDsl.g:955:1: ruleDOMTypeConf EOF
            {
             before(grammarAccess.getDOMTypeConfRule()); 
            pushFollow(FOLLOW_1);
            ruleDOMTypeConf();

            state._fsp--;

             after(grammarAccess.getDOMTypeConfRule()); 
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
    // $ANTLR end "entryRuleDOMTypeConf"


    // $ANTLR start "ruleDOMTypeConf"
    // InternalMyDsl.g:962:1: ruleDOMTypeConf : ( ( rule__DOMTypeConf__Alternatives ) ) ;
    public final void ruleDOMTypeConf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:966:2: ( ( ( rule__DOMTypeConf__Alternatives ) ) )
            // InternalMyDsl.g:967:2: ( ( rule__DOMTypeConf__Alternatives ) )
            {
            // InternalMyDsl.g:967:2: ( ( rule__DOMTypeConf__Alternatives ) )
            // InternalMyDsl.g:968:3: ( rule__DOMTypeConf__Alternatives )
            {
             before(grammarAccess.getDOMTypeConfAccess().getAlternatives()); 
            // InternalMyDsl.g:969:3: ( rule__DOMTypeConf__Alternatives )
            // InternalMyDsl.g:969:4: rule__DOMTypeConf__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DOMTypeConf__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDOMTypeConfAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDOMTypeConf"


    // $ANTLR start "entryRuleReactComponents"
    // InternalMyDsl.g:978:1: entryRuleReactComponents : ruleReactComponents EOF ;
    public final void entryRuleReactComponents() throws RecognitionException {
        try {
            // InternalMyDsl.g:979:1: ( ruleReactComponents EOF )
            // InternalMyDsl.g:980:1: ruleReactComponents EOF
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
    // InternalMyDsl.g:987:1: ruleReactComponents : ( ( rule__ReactComponents__Group__0 ) ) ;
    public final void ruleReactComponents() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:991:2: ( ( ( rule__ReactComponents__Group__0 ) ) )
            // InternalMyDsl.g:992:2: ( ( rule__ReactComponents__Group__0 ) )
            {
            // InternalMyDsl.g:992:2: ( ( rule__ReactComponents__Group__0 ) )
            // InternalMyDsl.g:993:3: ( rule__ReactComponents__Group__0 )
            {
             before(grammarAccess.getReactComponentsAccess().getGroup()); 
            // InternalMyDsl.g:994:3: ( rule__ReactComponents__Group__0 )
            // InternalMyDsl.g:994:4: rule__ReactComponents__Group__0
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
    // InternalMyDsl.g:1003:1: entryRuleComponentsLogic : ruleComponentsLogic EOF ;
    public final void entryRuleComponentsLogic() throws RecognitionException {
        try {
            // InternalMyDsl.g:1004:1: ( ruleComponentsLogic EOF )
            // InternalMyDsl.g:1005:1: ruleComponentsLogic EOF
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
    // InternalMyDsl.g:1012:1: ruleComponentsLogic : ( ( rule__ComponentsLogic__Group__0 ) ) ;
    public final void ruleComponentsLogic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1016:2: ( ( ( rule__ComponentsLogic__Group__0 ) ) )
            // InternalMyDsl.g:1017:2: ( ( rule__ComponentsLogic__Group__0 ) )
            {
            // InternalMyDsl.g:1017:2: ( ( rule__ComponentsLogic__Group__0 ) )
            // InternalMyDsl.g:1018:3: ( rule__ComponentsLogic__Group__0 )
            {
             before(grammarAccess.getComponentsLogicAccess().getGroup()); 
            // InternalMyDsl.g:1019:3: ( rule__ComponentsLogic__Group__0 )
            // InternalMyDsl.g:1019:4: rule__ComponentsLogic__Group__0
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


    // $ANTLR start "entryRuleLogicContent"
    // InternalMyDsl.g:1028:1: entryRuleLogicContent : ruleLogicContent EOF ;
    public final void entryRuleLogicContent() throws RecognitionException {
        try {
            // InternalMyDsl.g:1029:1: ( ruleLogicContent EOF )
            // InternalMyDsl.g:1030:1: ruleLogicContent EOF
            {
             before(grammarAccess.getLogicContentRule()); 
            pushFollow(FOLLOW_1);
            ruleLogicContent();

            state._fsp--;

             after(grammarAccess.getLogicContentRule()); 
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
    // $ANTLR end "entryRuleLogicContent"


    // $ANTLR start "ruleLogicContent"
    // InternalMyDsl.g:1037:1: ruleLogicContent : ( ( rule__LogicContent__Group__0 ) ) ;
    public final void ruleLogicContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1041:2: ( ( ( rule__LogicContent__Group__0 ) ) )
            // InternalMyDsl.g:1042:2: ( ( rule__LogicContent__Group__0 ) )
            {
            // InternalMyDsl.g:1042:2: ( ( rule__LogicContent__Group__0 ) )
            // InternalMyDsl.g:1043:3: ( rule__LogicContent__Group__0 )
            {
             before(grammarAccess.getLogicContentAccess().getGroup()); 
            // InternalMyDsl.g:1044:3: ( rule__LogicContent__Group__0 )
            // InternalMyDsl.g:1044:4: rule__LogicContent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LogicContent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicContentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicContent"


    // $ANTLR start "entryRuleLogicStructure"
    // InternalMyDsl.g:1053:1: entryRuleLogicStructure : ruleLogicStructure EOF ;
    public final void entryRuleLogicStructure() throws RecognitionException {
        try {
            // InternalMyDsl.g:1054:1: ( ruleLogicStructure EOF )
            // InternalMyDsl.g:1055:1: ruleLogicStructure EOF
            {
             before(grammarAccess.getLogicStructureRule()); 
            pushFollow(FOLLOW_1);
            ruleLogicStructure();

            state._fsp--;

             after(grammarAccess.getLogicStructureRule()); 
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
    // $ANTLR end "entryRuleLogicStructure"


    // $ANTLR start "ruleLogicStructure"
    // InternalMyDsl.g:1062:1: ruleLogicStructure : ( ( rule__LogicStructure__Group__0 ) ) ;
    public final void ruleLogicStructure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1066:2: ( ( ( rule__LogicStructure__Group__0 ) ) )
            // InternalMyDsl.g:1067:2: ( ( rule__LogicStructure__Group__0 ) )
            {
            // InternalMyDsl.g:1067:2: ( ( rule__LogicStructure__Group__0 ) )
            // InternalMyDsl.g:1068:3: ( rule__LogicStructure__Group__0 )
            {
             before(grammarAccess.getLogicStructureAccess().getGroup()); 
            // InternalMyDsl.g:1069:3: ( rule__LogicStructure__Group__0 )
            // InternalMyDsl.g:1069:4: rule__LogicStructure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LogicStructure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicStructureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicStructure"


    // $ANTLR start "entryRuleComponentsUI"
    // InternalMyDsl.g:1078:1: entryRuleComponentsUI : ruleComponentsUI EOF ;
    public final void entryRuleComponentsUI() throws RecognitionException {
        try {
            // InternalMyDsl.g:1079:1: ( ruleComponentsUI EOF )
            // InternalMyDsl.g:1080:1: ruleComponentsUI EOF
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
    // InternalMyDsl.g:1087:1: ruleComponentsUI : ( ( rule__ComponentsUI__Group__0 ) ) ;
    public final void ruleComponentsUI() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1091:2: ( ( ( rule__ComponentsUI__Group__0 ) ) )
            // InternalMyDsl.g:1092:2: ( ( rule__ComponentsUI__Group__0 ) )
            {
            // InternalMyDsl.g:1092:2: ( ( rule__ComponentsUI__Group__0 ) )
            // InternalMyDsl.g:1093:3: ( rule__ComponentsUI__Group__0 )
            {
             before(grammarAccess.getComponentsUIAccess().getGroup()); 
            // InternalMyDsl.g:1094:3: ( rule__ComponentsUI__Group__0 )
            // InternalMyDsl.g:1094:4: rule__ComponentsUI__Group__0
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


    // $ANTLR start "entryRuleUIContent"
    // InternalMyDsl.g:1103:1: entryRuleUIContent : ruleUIContent EOF ;
    public final void entryRuleUIContent() throws RecognitionException {
        try {
            // InternalMyDsl.g:1104:1: ( ruleUIContent EOF )
            // InternalMyDsl.g:1105:1: ruleUIContent EOF
            {
             before(grammarAccess.getUIContentRule()); 
            pushFollow(FOLLOW_1);
            ruleUIContent();

            state._fsp--;

             after(grammarAccess.getUIContentRule()); 
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
    // $ANTLR end "entryRuleUIContent"


    // $ANTLR start "ruleUIContent"
    // InternalMyDsl.g:1112:1: ruleUIContent : ( ( rule__UIContent__Group__0 ) ) ;
    public final void ruleUIContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1116:2: ( ( ( rule__UIContent__Group__0 ) ) )
            // InternalMyDsl.g:1117:2: ( ( rule__UIContent__Group__0 ) )
            {
            // InternalMyDsl.g:1117:2: ( ( rule__UIContent__Group__0 ) )
            // InternalMyDsl.g:1118:3: ( rule__UIContent__Group__0 )
            {
             before(grammarAccess.getUIContentAccess().getGroup()); 
            // InternalMyDsl.g:1119:3: ( rule__UIContent__Group__0 )
            // InternalMyDsl.g:1119:4: rule__UIContent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UIContent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUIContentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUIContent"


    // $ANTLR start "entryRuleComponentClass"
    // InternalMyDsl.g:1128:1: entryRuleComponentClass : ruleComponentClass EOF ;
    public final void entryRuleComponentClass() throws RecognitionException {
        try {
            // InternalMyDsl.g:1129:1: ( ruleComponentClass EOF )
            // InternalMyDsl.g:1130:1: ruleComponentClass EOF
            {
             before(grammarAccess.getComponentClassRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentClass();

            state._fsp--;

             after(grammarAccess.getComponentClassRule()); 
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
    // $ANTLR end "entryRuleComponentClass"


    // $ANTLR start "ruleComponentClass"
    // InternalMyDsl.g:1137:1: ruleComponentClass : ( ( rule__ComponentClass__Group__0 ) ) ;
    public final void ruleComponentClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1141:2: ( ( ( rule__ComponentClass__Group__0 ) ) )
            // InternalMyDsl.g:1142:2: ( ( rule__ComponentClass__Group__0 ) )
            {
            // InternalMyDsl.g:1142:2: ( ( rule__ComponentClass__Group__0 ) )
            // InternalMyDsl.g:1143:3: ( rule__ComponentClass__Group__0 )
            {
             before(grammarAccess.getComponentClassAccess().getGroup()); 
            // InternalMyDsl.g:1144:3: ( rule__ComponentClass__Group__0 )
            // InternalMyDsl.g:1144:4: rule__ComponentClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentClass"


    // $ANTLR start "entryRuleReactFunctions"
    // InternalMyDsl.g:1153:1: entryRuleReactFunctions : ruleReactFunctions EOF ;
    public final void entryRuleReactFunctions() throws RecognitionException {
        try {
            // InternalMyDsl.g:1154:1: ( ruleReactFunctions EOF )
            // InternalMyDsl.g:1155:1: ruleReactFunctions EOF
            {
             before(grammarAccess.getReactFunctionsRule()); 
            pushFollow(FOLLOW_1);
            ruleReactFunctions();

            state._fsp--;

             after(grammarAccess.getReactFunctionsRule()); 
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
    // $ANTLR end "entryRuleReactFunctions"


    // $ANTLR start "ruleReactFunctions"
    // InternalMyDsl.g:1162:1: ruleReactFunctions : ( ( rule__ReactFunctions__Group__0 ) ) ;
    public final void ruleReactFunctions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1166:2: ( ( ( rule__ReactFunctions__Group__0 ) ) )
            // InternalMyDsl.g:1167:2: ( ( rule__ReactFunctions__Group__0 ) )
            {
            // InternalMyDsl.g:1167:2: ( ( rule__ReactFunctions__Group__0 ) )
            // InternalMyDsl.g:1168:3: ( rule__ReactFunctions__Group__0 )
            {
             before(grammarAccess.getReactFunctionsAccess().getGroup()); 
            // InternalMyDsl.g:1169:3: ( rule__ReactFunctions__Group__0 )
            // InternalMyDsl.g:1169:4: rule__ReactFunctions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReactFunctions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReactFunctionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReactFunctions"


    // $ANTLR start "entryRuleReactConstructor"
    // InternalMyDsl.g:1178:1: entryRuleReactConstructor : ruleReactConstructor EOF ;
    public final void entryRuleReactConstructor() throws RecognitionException {
        try {
            // InternalMyDsl.g:1179:1: ( ruleReactConstructor EOF )
            // InternalMyDsl.g:1180:1: ruleReactConstructor EOF
            {
             before(grammarAccess.getReactConstructorRule()); 
            pushFollow(FOLLOW_1);
            ruleReactConstructor();

            state._fsp--;

             after(grammarAccess.getReactConstructorRule()); 
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
    // $ANTLR end "entryRuleReactConstructor"


    // $ANTLR start "ruleReactConstructor"
    // InternalMyDsl.g:1187:1: ruleReactConstructor : ( ( rule__ReactConstructor__Group__0 ) ) ;
    public final void ruleReactConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1191:2: ( ( ( rule__ReactConstructor__Group__0 ) ) )
            // InternalMyDsl.g:1192:2: ( ( rule__ReactConstructor__Group__0 ) )
            {
            // InternalMyDsl.g:1192:2: ( ( rule__ReactConstructor__Group__0 ) )
            // InternalMyDsl.g:1193:3: ( rule__ReactConstructor__Group__0 )
            {
             before(grammarAccess.getReactConstructorAccess().getGroup()); 
            // InternalMyDsl.g:1194:3: ( rule__ReactConstructor__Group__0 )
            // InternalMyDsl.g:1194:4: rule__ReactConstructor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReactConstructor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReactConstructorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReactConstructor"


    // $ANTLR start "entryRuleState"
    // InternalMyDsl.g:1203:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalMyDsl.g:1204:1: ( ruleState EOF )
            // InternalMyDsl.g:1205:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMyDsl.g:1212:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1216:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalMyDsl.g:1217:2: ( ( rule__State__Group__0 ) )
            {
            // InternalMyDsl.g:1217:2: ( ( rule__State__Group__0 ) )
            // InternalMyDsl.g:1218:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalMyDsl.g:1219:3: ( rule__State__Group__0 )
            // InternalMyDsl.g:1219:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleDataType"
    // InternalMyDsl.g:1228:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalMyDsl.g:1229:1: ( ruleDataType EOF )
            // InternalMyDsl.g:1230:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalMyDsl.g:1237:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1241:2: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalMyDsl.g:1242:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalMyDsl.g:1242:2: ( ( rule__DataType__Alternatives ) )
            // InternalMyDsl.g:1243:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:1244:3: ( rule__DataType__Alternatives )
            // InternalMyDsl.g:1244:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleCoreFunctionsDeclaration"
    // InternalMyDsl.g:1253:1: entryRuleCoreFunctionsDeclaration : ruleCoreFunctionsDeclaration EOF ;
    public final void entryRuleCoreFunctionsDeclaration() throws RecognitionException {
        try {
            // InternalMyDsl.g:1254:1: ( ruleCoreFunctionsDeclaration EOF )
            // InternalMyDsl.g:1255:1: ruleCoreFunctionsDeclaration EOF
            {
             before(grammarAccess.getCoreFunctionsDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleCoreFunctionsDeclaration();

            state._fsp--;

             after(grammarAccess.getCoreFunctionsDeclarationRule()); 
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
    // $ANTLR end "entryRuleCoreFunctionsDeclaration"


    // $ANTLR start "ruleCoreFunctionsDeclaration"
    // InternalMyDsl.g:1262:1: ruleCoreFunctionsDeclaration : ( ( rule__CoreFunctionsDeclaration__Group__0 ) ) ;
    public final void ruleCoreFunctionsDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1266:2: ( ( ( rule__CoreFunctionsDeclaration__Group__0 ) ) )
            // InternalMyDsl.g:1267:2: ( ( rule__CoreFunctionsDeclaration__Group__0 ) )
            {
            // InternalMyDsl.g:1267:2: ( ( rule__CoreFunctionsDeclaration__Group__0 ) )
            // InternalMyDsl.g:1268:3: ( rule__CoreFunctionsDeclaration__Group__0 )
            {
             before(grammarAccess.getCoreFunctionsDeclarationAccess().getGroup()); 
            // InternalMyDsl.g:1269:3: ( rule__CoreFunctionsDeclaration__Group__0 )
            // InternalMyDsl.g:1269:4: rule__CoreFunctionsDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CoreFunctionsDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoreFunctionsDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoreFunctionsDeclaration"


    // $ANTLR start "entryRuleReactLifeCycle"
    // InternalMyDsl.g:1278:1: entryRuleReactLifeCycle : ruleReactLifeCycle EOF ;
    public final void entryRuleReactLifeCycle() throws RecognitionException {
        try {
            // InternalMyDsl.g:1279:1: ( ruleReactLifeCycle EOF )
            // InternalMyDsl.g:1280:1: ruleReactLifeCycle EOF
            {
             before(grammarAccess.getReactLifeCycleRule()); 
            pushFollow(FOLLOW_1);
            ruleReactLifeCycle();

            state._fsp--;

             after(grammarAccess.getReactLifeCycleRule()); 
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
    // $ANTLR end "entryRuleReactLifeCycle"


    // $ANTLR start "ruleReactLifeCycle"
    // InternalMyDsl.g:1287:1: ruleReactLifeCycle : ( ( rule__ReactLifeCycle__Alternatives ) ) ;
    public final void ruleReactLifeCycle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1291:2: ( ( ( rule__ReactLifeCycle__Alternatives ) ) )
            // InternalMyDsl.g:1292:2: ( ( rule__ReactLifeCycle__Alternatives ) )
            {
            // InternalMyDsl.g:1292:2: ( ( rule__ReactLifeCycle__Alternatives ) )
            // InternalMyDsl.g:1293:3: ( rule__ReactLifeCycle__Alternatives )
            {
             before(grammarAccess.getReactLifeCycleAccess().getAlternatives()); 
            // InternalMyDsl.g:1294:3: ( rule__ReactLifeCycle__Alternatives )
            // InternalMyDsl.g:1294:4: rule__ReactLifeCycle__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ReactLifeCycle__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReactLifeCycleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReactLifeCycle"


    // $ANTLR start "entryRuleReactRender"
    // InternalMyDsl.g:1303:1: entryRuleReactRender : ruleReactRender EOF ;
    public final void entryRuleReactRender() throws RecognitionException {
        try {
            // InternalMyDsl.g:1304:1: ( ruleReactRender EOF )
            // InternalMyDsl.g:1305:1: ruleReactRender EOF
            {
             before(grammarAccess.getReactRenderRule()); 
            pushFollow(FOLLOW_1);
            ruleReactRender();

            state._fsp--;

             after(grammarAccess.getReactRenderRule()); 
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
    // $ANTLR end "entryRuleReactRender"


    // $ANTLR start "ruleReactRender"
    // InternalMyDsl.g:1312:1: ruleReactRender : ( ( rule__ReactRender__Group__0 ) ) ;
    public final void ruleReactRender() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1316:2: ( ( ( rule__ReactRender__Group__0 ) ) )
            // InternalMyDsl.g:1317:2: ( ( rule__ReactRender__Group__0 ) )
            {
            // InternalMyDsl.g:1317:2: ( ( rule__ReactRender__Group__0 ) )
            // InternalMyDsl.g:1318:3: ( rule__ReactRender__Group__0 )
            {
             before(grammarAccess.getReactRenderAccess().getGroup()); 
            // InternalMyDsl.g:1319:3: ( rule__ReactRender__Group__0 )
            // InternalMyDsl.g:1319:4: rule__ReactRender__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReactRender__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReactRenderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReactRender"


    // $ANTLR start "entryRuleProps"
    // InternalMyDsl.g:1328:1: entryRuleProps : ruleProps EOF ;
    public final void entryRuleProps() throws RecognitionException {
        try {
            // InternalMyDsl.g:1329:1: ( ruleProps EOF )
            // InternalMyDsl.g:1330:1: ruleProps EOF
            {
             before(grammarAccess.getPropsRule()); 
            pushFollow(FOLLOW_1);
            ruleProps();

            state._fsp--;

             after(grammarAccess.getPropsRule()); 
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
    // $ANTLR end "entryRuleProps"


    // $ANTLR start "ruleProps"
    // InternalMyDsl.g:1337:1: ruleProps : ( ( rule__Props__Group__0 ) ) ;
    public final void ruleProps() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1341:2: ( ( ( rule__Props__Group__0 ) ) )
            // InternalMyDsl.g:1342:2: ( ( rule__Props__Group__0 ) )
            {
            // InternalMyDsl.g:1342:2: ( ( rule__Props__Group__0 ) )
            // InternalMyDsl.g:1343:3: ( rule__Props__Group__0 )
            {
             before(grammarAccess.getPropsAccess().getGroup()); 
            // InternalMyDsl.g:1344:3: ( rule__Props__Group__0 )
            // InternalMyDsl.g:1344:4: rule__Props__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Props__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProps"


    // $ANTLR start "entryRuleReactCoreFunctions"
    // InternalMyDsl.g:1353:1: entryRuleReactCoreFunctions : ruleReactCoreFunctions EOF ;
    public final void entryRuleReactCoreFunctions() throws RecognitionException {
        try {
            // InternalMyDsl.g:1354:1: ( ruleReactCoreFunctions EOF )
            // InternalMyDsl.g:1355:1: ruleReactCoreFunctions EOF
            {
             before(grammarAccess.getReactCoreFunctionsRule()); 
            pushFollow(FOLLOW_1);
            ruleReactCoreFunctions();

            state._fsp--;

             after(grammarAccess.getReactCoreFunctionsRule()); 
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
    // $ANTLR end "entryRuleReactCoreFunctions"


    // $ANTLR start "ruleReactCoreFunctions"
    // InternalMyDsl.g:1362:1: ruleReactCoreFunctions : ( ( rule__ReactCoreFunctions__Group__0 ) ) ;
    public final void ruleReactCoreFunctions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1366:2: ( ( ( rule__ReactCoreFunctions__Group__0 ) ) )
            // InternalMyDsl.g:1367:2: ( ( rule__ReactCoreFunctions__Group__0 ) )
            {
            // InternalMyDsl.g:1367:2: ( ( rule__ReactCoreFunctions__Group__0 ) )
            // InternalMyDsl.g:1368:3: ( rule__ReactCoreFunctions__Group__0 )
            {
             before(grammarAccess.getReactCoreFunctionsAccess().getGroup()); 
            // InternalMyDsl.g:1369:3: ( rule__ReactCoreFunctions__Group__0 )
            // InternalMyDsl.g:1369:4: rule__ReactCoreFunctions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReactCoreFunctions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReactCoreFunctionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReactCoreFunctions"


    // $ANTLR start "entryRuleReactActions"
    // InternalMyDsl.g:1378:1: entryRuleReactActions : ruleReactActions EOF ;
    public final void entryRuleReactActions() throws RecognitionException {
        try {
            // InternalMyDsl.g:1379:1: ( ruleReactActions EOF )
            // InternalMyDsl.g:1380:1: ruleReactActions EOF
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
    // InternalMyDsl.g:1387:1: ruleReactActions : ( ( rule__ReactActions__Group__0 ) ) ;
    public final void ruleReactActions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1391:2: ( ( ( rule__ReactActions__Group__0 ) ) )
            // InternalMyDsl.g:1392:2: ( ( rule__ReactActions__Group__0 ) )
            {
            // InternalMyDsl.g:1392:2: ( ( rule__ReactActions__Group__0 ) )
            // InternalMyDsl.g:1393:3: ( rule__ReactActions__Group__0 )
            {
             before(grammarAccess.getReactActionsAccess().getGroup()); 
            // InternalMyDsl.g:1394:3: ( rule__ReactActions__Group__0 )
            // InternalMyDsl.g:1394:4: rule__ReactActions__Group__0
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


    // $ANTLR start "entryRuleReactActionsContent"
    // InternalMyDsl.g:1403:1: entryRuleReactActionsContent : ruleReactActionsContent EOF ;
    public final void entryRuleReactActionsContent() throws RecognitionException {
        try {
            // InternalMyDsl.g:1404:1: ( ruleReactActionsContent EOF )
            // InternalMyDsl.g:1405:1: ruleReactActionsContent EOF
            {
             before(grammarAccess.getReactActionsContentRule()); 
            pushFollow(FOLLOW_1);
            ruleReactActionsContent();

            state._fsp--;

             after(grammarAccess.getReactActionsContentRule()); 
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
    // $ANTLR end "entryRuleReactActionsContent"


    // $ANTLR start "ruleReactActionsContent"
    // InternalMyDsl.g:1412:1: ruleReactActionsContent : ( ( ( rule__ReactActionsContent__ReactrelcontentAssignment ) ) ( ( rule__ReactActionsContent__ReactrelcontentAssignment )* ) ) ;
    public final void ruleReactActionsContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1416:2: ( ( ( ( rule__ReactActionsContent__ReactrelcontentAssignment ) ) ( ( rule__ReactActionsContent__ReactrelcontentAssignment )* ) ) )
            // InternalMyDsl.g:1417:2: ( ( ( rule__ReactActionsContent__ReactrelcontentAssignment ) ) ( ( rule__ReactActionsContent__ReactrelcontentAssignment )* ) )
            {
            // InternalMyDsl.g:1417:2: ( ( ( rule__ReactActionsContent__ReactrelcontentAssignment ) ) ( ( rule__ReactActionsContent__ReactrelcontentAssignment )* ) )
            // InternalMyDsl.g:1418:3: ( ( rule__ReactActionsContent__ReactrelcontentAssignment ) ) ( ( rule__ReactActionsContent__ReactrelcontentAssignment )* )
            {
            // InternalMyDsl.g:1418:3: ( ( rule__ReactActionsContent__ReactrelcontentAssignment ) )
            // InternalMyDsl.g:1419:4: ( rule__ReactActionsContent__ReactrelcontentAssignment )
            {
             before(grammarAccess.getReactActionsContentAccess().getReactrelcontentAssignment()); 
            // InternalMyDsl.g:1420:4: ( rule__ReactActionsContent__ReactrelcontentAssignment )
            // InternalMyDsl.g:1420:5: rule__ReactActionsContent__ReactrelcontentAssignment
            {
            pushFollow(FOLLOW_3);
            rule__ReactActionsContent__ReactrelcontentAssignment();

            state._fsp--;


            }

             after(grammarAccess.getReactActionsContentAccess().getReactrelcontentAssignment()); 

            }

            // InternalMyDsl.g:1423:3: ( ( rule__ReactActionsContent__ReactrelcontentAssignment )* )
            // InternalMyDsl.g:1424:4: ( rule__ReactActionsContent__ReactrelcontentAssignment )*
            {
             before(grammarAccess.getReactActionsContentAccess().getReactrelcontentAssignment()); 
            // InternalMyDsl.g:1425:4: ( rule__ReactActionsContent__ReactrelcontentAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==90) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:1425:5: rule__ReactActionsContent__ReactrelcontentAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ReactActionsContent__ReactrelcontentAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getReactActionsContentAccess().getReactrelcontentAssignment()); 

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
    // $ANTLR end "ruleReactActionsContent"


    // $ANTLR start "entryRuleReactServicesType"
    // InternalMyDsl.g:1435:1: entryRuleReactServicesType : ruleReactServicesType EOF ;
    public final void entryRuleReactServicesType() throws RecognitionException {
        try {
            // InternalMyDsl.g:1436:1: ( ruleReactServicesType EOF )
            // InternalMyDsl.g:1437:1: ruleReactServicesType EOF
            {
             before(grammarAccess.getReactServicesTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleReactServicesType();

            state._fsp--;

             after(grammarAccess.getReactServicesTypeRule()); 
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
    // $ANTLR end "entryRuleReactServicesType"


    // $ANTLR start "ruleReactServicesType"
    // InternalMyDsl.g:1444:1: ruleReactServicesType : ( ( rule__ReactServicesType__Group__0 ) ) ;
    public final void ruleReactServicesType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1448:2: ( ( ( rule__ReactServicesType__Group__0 ) ) )
            // InternalMyDsl.g:1449:2: ( ( rule__ReactServicesType__Group__0 ) )
            {
            // InternalMyDsl.g:1449:2: ( ( rule__ReactServicesType__Group__0 ) )
            // InternalMyDsl.g:1450:3: ( rule__ReactServicesType__Group__0 )
            {
             before(grammarAccess.getReactServicesTypeAccess().getGroup()); 
            // InternalMyDsl.g:1451:3: ( rule__ReactServicesType__Group__0 )
            // InternalMyDsl.g:1451:4: rule__ReactServicesType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReactServicesType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReactServicesTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReactServicesType"


    // $ANTLR start "entryRuleReactServicesRelation"
    // InternalMyDsl.g:1460:1: entryRuleReactServicesRelation : ruleReactServicesRelation EOF ;
    public final void entryRuleReactServicesRelation() throws RecognitionException {
        try {
            // InternalMyDsl.g:1461:1: ( ruleReactServicesRelation EOF )
            // InternalMyDsl.g:1462:1: ruleReactServicesRelation EOF
            {
             before(grammarAccess.getReactServicesRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleReactServicesRelation();

            state._fsp--;

             after(grammarAccess.getReactServicesRelationRule()); 
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
    // $ANTLR end "entryRuleReactServicesRelation"


    // $ANTLR start "ruleReactServicesRelation"
    // InternalMyDsl.g:1469:1: ruleReactServicesRelation : ( ( rule__ReactServicesRelation__Group__0 ) ) ;
    public final void ruleReactServicesRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1473:2: ( ( ( rule__ReactServicesRelation__Group__0 ) ) )
            // InternalMyDsl.g:1474:2: ( ( rule__ReactServicesRelation__Group__0 ) )
            {
            // InternalMyDsl.g:1474:2: ( ( rule__ReactServicesRelation__Group__0 ) )
            // InternalMyDsl.g:1475:3: ( rule__ReactServicesRelation__Group__0 )
            {
             before(grammarAccess.getReactServicesRelationAccess().getGroup()); 
            // InternalMyDsl.g:1476:3: ( rule__ReactServicesRelation__Group__0 )
            // InternalMyDsl.g:1476:4: rule__ReactServicesRelation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReactServicesRelation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReactServicesRelationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReactServicesRelation"


    // $ANTLR start "entryRuleReactRequest"
    // InternalMyDsl.g:1485:1: entryRuleReactRequest : ruleReactRequest EOF ;
    public final void entryRuleReactRequest() throws RecognitionException {
        try {
            // InternalMyDsl.g:1486:1: ( ruleReactRequest EOF )
            // InternalMyDsl.g:1487:1: ruleReactRequest EOF
            {
             before(grammarAccess.getReactRequestRule()); 
            pushFollow(FOLLOW_1);
            ruleReactRequest();

            state._fsp--;

             after(grammarAccess.getReactRequestRule()); 
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
    // $ANTLR end "entryRuleReactRequest"


    // $ANTLR start "ruleReactRequest"
    // InternalMyDsl.g:1494:1: ruleReactRequest : ( ( rule__ReactRequest__Alternatives ) ) ;
    public final void ruleReactRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1498:2: ( ( ( rule__ReactRequest__Alternatives ) ) )
            // InternalMyDsl.g:1499:2: ( ( rule__ReactRequest__Alternatives ) )
            {
            // InternalMyDsl.g:1499:2: ( ( rule__ReactRequest__Alternatives ) )
            // InternalMyDsl.g:1500:3: ( rule__ReactRequest__Alternatives )
            {
             before(grammarAccess.getReactRequestAccess().getAlternatives()); 
            // InternalMyDsl.g:1501:3: ( rule__ReactRequest__Alternatives )
            // InternalMyDsl.g:1501:4: rule__ReactRequest__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ReactRequest__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReactRequestAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReactRequest"


    // $ANTLR start "entryRuleReactLibraries"
    // InternalMyDsl.g:1510:1: entryRuleReactLibraries : ruleReactLibraries EOF ;
    public final void entryRuleReactLibraries() throws RecognitionException {
        try {
            // InternalMyDsl.g:1511:1: ( ruleReactLibraries EOF )
            // InternalMyDsl.g:1512:1: ruleReactLibraries EOF
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
    // InternalMyDsl.g:1519:1: ruleReactLibraries : ( ( rule__ReactLibraries__Group__0 ) ) ;
    public final void ruleReactLibraries() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1523:2: ( ( ( rule__ReactLibraries__Group__0 ) ) )
            // InternalMyDsl.g:1524:2: ( ( rule__ReactLibraries__Group__0 ) )
            {
            // InternalMyDsl.g:1524:2: ( ( rule__ReactLibraries__Group__0 ) )
            // InternalMyDsl.g:1525:3: ( rule__ReactLibraries__Group__0 )
            {
             before(grammarAccess.getReactLibrariesAccess().getGroup()); 
            // InternalMyDsl.g:1526:3: ( rule__ReactLibraries__Group__0 )
            // InternalMyDsl.g:1526:4: rule__ReactLibraries__Group__0
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


    // $ANTLR start "entryRuleReactLibrary"
    // InternalMyDsl.g:1535:1: entryRuleReactLibrary : ruleReactLibrary EOF ;
    public final void entryRuleReactLibrary() throws RecognitionException {
        try {
            // InternalMyDsl.g:1536:1: ( ruleReactLibrary EOF )
            // InternalMyDsl.g:1537:1: ruleReactLibrary EOF
            {
             before(grammarAccess.getReactLibraryRule()); 
            pushFollow(FOLLOW_1);
            ruleReactLibrary();

            state._fsp--;

             after(grammarAccess.getReactLibraryRule()); 
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
    // $ANTLR end "entryRuleReactLibrary"


    // $ANTLR start "ruleReactLibrary"
    // InternalMyDsl.g:1544:1: ruleReactLibrary : ( ( rule__ReactLibrary__Group__0 ) ) ;
    public final void ruleReactLibrary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1548:2: ( ( ( rule__ReactLibrary__Group__0 ) ) )
            // InternalMyDsl.g:1549:2: ( ( rule__ReactLibrary__Group__0 ) )
            {
            // InternalMyDsl.g:1549:2: ( ( rule__ReactLibrary__Group__0 ) )
            // InternalMyDsl.g:1550:3: ( rule__ReactLibrary__Group__0 )
            {
             before(grammarAccess.getReactLibraryAccess().getGroup()); 
            // InternalMyDsl.g:1551:3: ( rule__ReactLibrary__Group__0 )
            // InternalMyDsl.g:1551:4: rule__ReactLibrary__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReactLibrary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReactLibraryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReactLibrary"


    // $ANTLR start "entryRuleReactLibraryType"
    // InternalMyDsl.g:1560:1: entryRuleReactLibraryType : ruleReactLibraryType EOF ;
    public final void entryRuleReactLibraryType() throws RecognitionException {
        try {
            // InternalMyDsl.g:1561:1: ( ruleReactLibraryType EOF )
            // InternalMyDsl.g:1562:1: ruleReactLibraryType EOF
            {
             before(grammarAccess.getReactLibraryTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleReactLibraryType();

            state._fsp--;

             after(grammarAccess.getReactLibraryTypeRule()); 
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
    // $ANTLR end "entryRuleReactLibraryType"


    // $ANTLR start "ruleReactLibraryType"
    // InternalMyDsl.g:1569:1: ruleReactLibraryType : ( ( rule__ReactLibraryType__Alternatives ) ) ;
    public final void ruleReactLibraryType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1573:2: ( ( ( rule__ReactLibraryType__Alternatives ) ) )
            // InternalMyDsl.g:1574:2: ( ( rule__ReactLibraryType__Alternatives ) )
            {
            // InternalMyDsl.g:1574:2: ( ( rule__ReactLibraryType__Alternatives ) )
            // InternalMyDsl.g:1575:3: ( rule__ReactLibraryType__Alternatives )
            {
             before(grammarAccess.getReactLibraryTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:1576:3: ( rule__ReactLibraryType__Alternatives )
            // InternalMyDsl.g:1576:4: rule__ReactLibraryType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ReactLibraryType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReactLibraryTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReactLibraryType"


    // $ANTLR start "entryRuleReactInfo"
    // InternalMyDsl.g:1585:1: entryRuleReactInfo : ruleReactInfo EOF ;
    public final void entryRuleReactInfo() throws RecognitionException {
        try {
            // InternalMyDsl.g:1586:1: ( ruleReactInfo EOF )
            // InternalMyDsl.g:1587:1: ruleReactInfo EOF
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
    // InternalMyDsl.g:1594:1: ruleReactInfo : ( ( rule__ReactInfo__Group__0 ) ) ;
    public final void ruleReactInfo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1598:2: ( ( ( rule__ReactInfo__Group__0 ) ) )
            // InternalMyDsl.g:1599:2: ( ( rule__ReactInfo__Group__0 ) )
            {
            // InternalMyDsl.g:1599:2: ( ( rule__ReactInfo__Group__0 ) )
            // InternalMyDsl.g:1600:3: ( rule__ReactInfo__Group__0 )
            {
             before(grammarAccess.getReactInfoAccess().getGroup()); 
            // InternalMyDsl.g:1601:3: ( rule__ReactInfo__Group__0 )
            // InternalMyDsl.g:1601:4: rule__ReactInfo__Group__0
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


    // $ANTLR start "entryRuleReactInformation"
    // InternalMyDsl.g:1610:1: entryRuleReactInformation : ruleReactInformation EOF ;
    public final void entryRuleReactInformation() throws RecognitionException {
        try {
            // InternalMyDsl.g:1611:1: ( ruleReactInformation EOF )
            // InternalMyDsl.g:1612:1: ruleReactInformation EOF
            {
             before(grammarAccess.getReactInformationRule()); 
            pushFollow(FOLLOW_1);
            ruleReactInformation();

            state._fsp--;

             after(grammarAccess.getReactInformationRule()); 
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
    // $ANTLR end "entryRuleReactInformation"


    // $ANTLR start "ruleReactInformation"
    // InternalMyDsl.g:1619:1: ruleReactInformation : ( ( rule__ReactInformation__Group__0 ) ) ;
    public final void ruleReactInformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1623:2: ( ( ( rule__ReactInformation__Group__0 ) ) )
            // InternalMyDsl.g:1624:2: ( ( rule__ReactInformation__Group__0 ) )
            {
            // InternalMyDsl.g:1624:2: ( ( rule__ReactInformation__Group__0 ) )
            // InternalMyDsl.g:1625:3: ( rule__ReactInformation__Group__0 )
            {
             before(grammarAccess.getReactInformationAccess().getGroup()); 
            // InternalMyDsl.g:1626:3: ( rule__ReactInformation__Group__0 )
            // InternalMyDsl.g:1626:4: rule__ReactInformation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReactInformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReactInformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReactInformation"


    // $ANTLR start "entryRuleReactInformationType"
    // InternalMyDsl.g:1635:1: entryRuleReactInformationType : ruleReactInformationType EOF ;
    public final void entryRuleReactInformationType() throws RecognitionException {
        try {
            // InternalMyDsl.g:1636:1: ( ruleReactInformationType EOF )
            // InternalMyDsl.g:1637:1: ruleReactInformationType EOF
            {
             before(grammarAccess.getReactInformationTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleReactInformationType();

            state._fsp--;

             after(grammarAccess.getReactInformationTypeRule()); 
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
    // $ANTLR end "entryRuleReactInformationType"


    // $ANTLR start "ruleReactInformationType"
    // InternalMyDsl.g:1644:1: ruleReactInformationType : ( ( rule__ReactInformationType__Alternatives ) ) ;
    public final void ruleReactInformationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1648:2: ( ( ( rule__ReactInformationType__Alternatives ) ) )
            // InternalMyDsl.g:1649:2: ( ( rule__ReactInformationType__Alternatives ) )
            {
            // InternalMyDsl.g:1649:2: ( ( rule__ReactInformationType__Alternatives ) )
            // InternalMyDsl.g:1650:3: ( rule__ReactInformationType__Alternatives )
            {
             before(grammarAccess.getReactInformationTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:1651:3: ( rule__ReactInformationType__Alternatives )
            // InternalMyDsl.g:1651:4: rule__ReactInformationType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ReactInformationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReactInformationTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReactInformationType"


    // $ANTLR start "entryRuleSpring"
    // InternalMyDsl.g:1660:1: entryRuleSpring : ruleSpring EOF ;
    public final void entryRuleSpring() throws RecognitionException {
        try {
            // InternalMyDsl.g:1661:1: ( ruleSpring EOF )
            // InternalMyDsl.g:1662:1: ruleSpring EOF
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
    // InternalMyDsl.g:1669:1: ruleSpring : ( ( rule__Spring__Group__0 ) ) ;
    public final void ruleSpring() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1673:2: ( ( ( rule__Spring__Group__0 ) ) )
            // InternalMyDsl.g:1674:2: ( ( rule__Spring__Group__0 ) )
            {
            // InternalMyDsl.g:1674:2: ( ( rule__Spring__Group__0 ) )
            // InternalMyDsl.g:1675:3: ( rule__Spring__Group__0 )
            {
             before(grammarAccess.getSpringAccess().getGroup()); 
            // InternalMyDsl.g:1676:3: ( rule__Spring__Group__0 )
            // InternalMyDsl.g:1676:4: rule__Spring__Group__0
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
    // InternalMyDsl.g:1685:1: entryRulePostgreSQL : rulePostgreSQL EOF ;
    public final void entryRulePostgreSQL() throws RecognitionException {
        try {
            // InternalMyDsl.g:1686:1: ( rulePostgreSQL EOF )
            // InternalMyDsl.g:1687:1: rulePostgreSQL EOF
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
    // InternalMyDsl.g:1694:1: rulePostgreSQL : ( ( rule__PostgreSQL__Group__0 ) ) ;
    public final void rulePostgreSQL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1698:2: ( ( ( rule__PostgreSQL__Group__0 ) ) )
            // InternalMyDsl.g:1699:2: ( ( rule__PostgreSQL__Group__0 ) )
            {
            // InternalMyDsl.g:1699:2: ( ( rule__PostgreSQL__Group__0 ) )
            // InternalMyDsl.g:1700:3: ( rule__PostgreSQL__Group__0 )
            {
             before(grammarAccess.getPostgreSQLAccess().getGroup()); 
            // InternalMyDsl.g:1701:3: ( rule__PostgreSQL__Group__0 )
            // InternalMyDsl.g:1701:4: rule__PostgreSQL__Group__0
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
    // InternalMyDsl.g:1710:1: entryRuleAmazonWebServices : ruleAmazonWebServices EOF ;
    public final void entryRuleAmazonWebServices() throws RecognitionException {
        try {
            // InternalMyDsl.g:1711:1: ( ruleAmazonWebServices EOF )
            // InternalMyDsl.g:1712:1: ruleAmazonWebServices EOF
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
    // InternalMyDsl.g:1719:1: ruleAmazonWebServices : ( ( rule__AmazonWebServices__Group__0 ) ) ;
    public final void ruleAmazonWebServices() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1723:2: ( ( ( rule__AmazonWebServices__Group__0 ) ) )
            // InternalMyDsl.g:1724:2: ( ( rule__AmazonWebServices__Group__0 ) )
            {
            // InternalMyDsl.g:1724:2: ( ( rule__AmazonWebServices__Group__0 ) )
            // InternalMyDsl.g:1725:3: ( rule__AmazonWebServices__Group__0 )
            {
             before(grammarAccess.getAmazonWebServicesAccess().getGroup()); 
            // InternalMyDsl.g:1726:3: ( rule__AmazonWebServices__Group__0 )
            // InternalMyDsl.g:1726:4: rule__AmazonWebServices__Group__0
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


    // $ANTLR start "rule__DOMTypeConf__Alternatives"
    // InternalMyDsl.g:1734:1: rule__DOMTypeConf__Alternatives : ( ( 'RoutingConf' ) | ( 'ServiceWorker' ) | ( 'HTMLStructure' ) | ( 'Manifest' ) | ( 'RepositoriesConf' ) );
    public final void rule__DOMTypeConf__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1738:1: ( ( 'RoutingConf' ) | ( 'ServiceWorker' ) | ( 'HTMLStructure' ) | ( 'Manifest' ) | ( 'RepositoriesConf' ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:1739:2: ( 'RoutingConf' )
                    {
                    // InternalMyDsl.g:1739:2: ( 'RoutingConf' )
                    // InternalMyDsl.g:1740:3: 'RoutingConf'
                    {
                     before(grammarAccess.getDOMTypeConfAccess().getRoutingConfKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getDOMTypeConfAccess().getRoutingConfKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1745:2: ( 'ServiceWorker' )
                    {
                    // InternalMyDsl.g:1745:2: ( 'ServiceWorker' )
                    // InternalMyDsl.g:1746:3: 'ServiceWorker'
                    {
                     before(grammarAccess.getDOMTypeConfAccess().getServiceWorkerKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getDOMTypeConfAccess().getServiceWorkerKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1751:2: ( 'HTMLStructure' )
                    {
                    // InternalMyDsl.g:1751:2: ( 'HTMLStructure' )
                    // InternalMyDsl.g:1752:3: 'HTMLStructure'
                    {
                     before(grammarAccess.getDOMTypeConfAccess().getHTMLStructureKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getDOMTypeConfAccess().getHTMLStructureKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1757:2: ( 'Manifest' )
                    {
                    // InternalMyDsl.g:1757:2: ( 'Manifest' )
                    // InternalMyDsl.g:1758:3: 'Manifest'
                    {
                     before(grammarAccess.getDOMTypeConfAccess().getManifestKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getDOMTypeConfAccess().getManifestKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1763:2: ( 'RepositoriesConf' )
                    {
                    // InternalMyDsl.g:1763:2: ( 'RepositoriesConf' )
                    // InternalMyDsl.g:1764:3: 'RepositoriesConf'
                    {
                     before(grammarAccess.getDOMTypeConfAccess().getRepositoriesConfKeyword_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getDOMTypeConfAccess().getRepositoriesConfKeyword_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOMTypeConf__Alternatives"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalMyDsl.g:1773:1: rule__DataType__Alternatives : ( ( 'String' ) | ( 'Array' ) | ( 'Object' ) | ( 'Number' ) | ( 'null' ) | ( 'Boolean' ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1777:1: ( ( 'String' ) | ( 'Array' ) | ( 'Object' ) | ( 'Number' ) | ( 'null' ) | ( 'Boolean' ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                alt3=4;
                }
                break;
            case 20:
                {
                alt3=5;
                }
                break;
            case 21:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:1778:2: ( 'String' )
                    {
                    // InternalMyDsl.g:1778:2: ( 'String' )
                    // InternalMyDsl.g:1779:3: 'String'
                    {
                     before(grammarAccess.getDataTypeAccess().getStringKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getDataTypeAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1784:2: ( 'Array' )
                    {
                    // InternalMyDsl.g:1784:2: ( 'Array' )
                    // InternalMyDsl.g:1785:3: 'Array'
                    {
                     before(grammarAccess.getDataTypeAccess().getArrayKeyword_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getDataTypeAccess().getArrayKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1790:2: ( 'Object' )
                    {
                    // InternalMyDsl.g:1790:2: ( 'Object' )
                    // InternalMyDsl.g:1791:3: 'Object'
                    {
                     before(grammarAccess.getDataTypeAccess().getObjectKeyword_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getDataTypeAccess().getObjectKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1796:2: ( 'Number' )
                    {
                    // InternalMyDsl.g:1796:2: ( 'Number' )
                    // InternalMyDsl.g:1797:3: 'Number'
                    {
                     before(grammarAccess.getDataTypeAccess().getNumberKeyword_3()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getDataTypeAccess().getNumberKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1802:2: ( 'null' )
                    {
                    // InternalMyDsl.g:1802:2: ( 'null' )
                    // InternalMyDsl.g:1803:3: 'null'
                    {
                     before(grammarAccess.getDataTypeAccess().getNullKeyword_4()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getDataTypeAccess().getNullKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1808:2: ( 'Boolean' )
                    {
                    // InternalMyDsl.g:1808:2: ( 'Boolean' )
                    // InternalMyDsl.g:1809:3: 'Boolean'
                    {
                     before(grammarAccess.getDataTypeAccess().getBooleanKeyword_5()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getDataTypeAccess().getBooleanKeyword_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__ReactLifeCycle__Alternatives"
    // InternalMyDsl.g:1818:1: rule__ReactLifeCycle__Alternatives : ( ( ( rule__ReactLifeCycle__Group_0__0 ) ) | ( ( rule__ReactLifeCycle__Group_1__0 ) ) | ( ( rule__ReactLifeCycle__Group_2__0 ) ) );
    public final void rule__ReactLifeCycle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1822:1: ( ( ( rule__ReactLifeCycle__Group_0__0 ) ) | ( ( rule__ReactLifeCycle__Group_1__0 ) ) | ( ( rule__ReactLifeCycle__Group_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt4=1;
                }
                break;
            case 82:
                {
                alt4=2;
                }
                break;
            case 83:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:1823:2: ( ( rule__ReactLifeCycle__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:1823:2: ( ( rule__ReactLifeCycle__Group_0__0 ) )
                    // InternalMyDsl.g:1824:3: ( rule__ReactLifeCycle__Group_0__0 )
                    {
                     before(grammarAccess.getReactLifeCycleAccess().getGroup_0()); 
                    // InternalMyDsl.g:1825:3: ( rule__ReactLifeCycle__Group_0__0 )
                    // InternalMyDsl.g:1825:4: rule__ReactLifeCycle__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReactLifeCycle__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReactLifeCycleAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1829:2: ( ( rule__ReactLifeCycle__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:1829:2: ( ( rule__ReactLifeCycle__Group_1__0 ) )
                    // InternalMyDsl.g:1830:3: ( rule__ReactLifeCycle__Group_1__0 )
                    {
                     before(grammarAccess.getReactLifeCycleAccess().getGroup_1()); 
                    // InternalMyDsl.g:1831:3: ( rule__ReactLifeCycle__Group_1__0 )
                    // InternalMyDsl.g:1831:4: rule__ReactLifeCycle__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReactLifeCycle__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReactLifeCycleAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1835:2: ( ( rule__ReactLifeCycle__Group_2__0 ) )
                    {
                    // InternalMyDsl.g:1835:2: ( ( rule__ReactLifeCycle__Group_2__0 ) )
                    // InternalMyDsl.g:1836:3: ( rule__ReactLifeCycle__Group_2__0 )
                    {
                     before(grammarAccess.getReactLifeCycleAccess().getGroup_2()); 
                    // InternalMyDsl.g:1837:3: ( rule__ReactLifeCycle__Group_2__0 )
                    // InternalMyDsl.g:1837:4: rule__ReactLifeCycle__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReactLifeCycle__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReactLifeCycleAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactLifeCycle__Alternatives"


    // $ANTLR start "rule__ReactRequest__Alternatives"
    // InternalMyDsl.g:1845:1: rule__ReactRequest__Alternatives : ( ( 'Wrapper' ) | ( 'AuxWrapper' ) );
    public final void rule__ReactRequest__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1849:1: ( ( 'Wrapper' ) | ( 'AuxWrapper' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            else if ( (LA5_0==23) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:1850:2: ( 'Wrapper' )
                    {
                    // InternalMyDsl.g:1850:2: ( 'Wrapper' )
                    // InternalMyDsl.g:1851:3: 'Wrapper'
                    {
                     before(grammarAccess.getReactRequestAccess().getWrapperKeyword_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getReactRequestAccess().getWrapperKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1856:2: ( 'AuxWrapper' )
                    {
                    // InternalMyDsl.g:1856:2: ( 'AuxWrapper' )
                    // InternalMyDsl.g:1857:3: 'AuxWrapper'
                    {
                     before(grammarAccess.getReactRequestAccess().getAuxWrapperKeyword_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getReactRequestAccess().getAuxWrapperKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactRequest__Alternatives"


    // $ANTLR start "rule__ReactLibraryType__Alternatives"
    // InternalMyDsl.g:1866:1: rule__ReactLibraryType__Alternatives : ( ( 'ReactDesign' ) | ( 'ReactRouting' ) | ( 'ComponentManagement' ) | ( 'StoreManagement' ) | ( 'ReactDeployment' ) | ( 'ConfigurationLibrary' ) );
    public final void rule__ReactLibraryType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1870:1: ( ( 'ReactDesign' ) | ( 'ReactRouting' ) | ( 'ComponentManagement' ) | ( 'StoreManagement' ) | ( 'ReactDeployment' ) | ( 'ConfigurationLibrary' ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            case 27:
                {
                alt6=4;
                }
                break;
            case 28:
                {
                alt6=5;
                }
                break;
            case 29:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:1871:2: ( 'ReactDesign' )
                    {
                    // InternalMyDsl.g:1871:2: ( 'ReactDesign' )
                    // InternalMyDsl.g:1872:3: 'ReactDesign'
                    {
                     before(grammarAccess.getReactLibraryTypeAccess().getReactDesignKeyword_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getReactLibraryTypeAccess().getReactDesignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1877:2: ( 'ReactRouting' )
                    {
                    // InternalMyDsl.g:1877:2: ( 'ReactRouting' )
                    // InternalMyDsl.g:1878:3: 'ReactRouting'
                    {
                     before(grammarAccess.getReactLibraryTypeAccess().getReactRoutingKeyword_1()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getReactLibraryTypeAccess().getReactRoutingKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1883:2: ( 'ComponentManagement' )
                    {
                    // InternalMyDsl.g:1883:2: ( 'ComponentManagement' )
                    // InternalMyDsl.g:1884:3: 'ComponentManagement'
                    {
                     before(grammarAccess.getReactLibraryTypeAccess().getComponentManagementKeyword_2()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getReactLibraryTypeAccess().getComponentManagementKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1889:2: ( 'StoreManagement' )
                    {
                    // InternalMyDsl.g:1889:2: ( 'StoreManagement' )
                    // InternalMyDsl.g:1890:3: 'StoreManagement'
                    {
                     before(grammarAccess.getReactLibraryTypeAccess().getStoreManagementKeyword_3()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getReactLibraryTypeAccess().getStoreManagementKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1895:2: ( 'ReactDeployment' )
                    {
                    // InternalMyDsl.g:1895:2: ( 'ReactDeployment' )
                    // InternalMyDsl.g:1896:3: 'ReactDeployment'
                    {
                     before(grammarAccess.getReactLibraryTypeAccess().getReactDeploymentKeyword_4()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getReactLibraryTypeAccess().getReactDeploymentKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1901:2: ( 'ConfigurationLibrary' )
                    {
                    // InternalMyDsl.g:1901:2: ( 'ConfigurationLibrary' )
                    // InternalMyDsl.g:1902:3: 'ConfigurationLibrary'
                    {
                     before(grammarAccess.getReactLibraryTypeAccess().getConfigurationLibraryKeyword_5()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getReactLibraryTypeAccess().getConfigurationLibraryKeyword_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactLibraryType__Alternatives"


    // $ANTLR start "rule__ReactInformationType__Alternatives"
    // InternalMyDsl.g:1911:1: rule__ReactInformationType__Alternatives : ( ( 'ReactReadme' ) | ( 'ReactAditionalInfo' ) );
    public final void rule__ReactInformationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1915:1: ( ( 'ReactReadme' ) | ( 'ReactAditionalInfo' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            else if ( (LA7_0==31) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1916:2: ( 'ReactReadme' )
                    {
                    // InternalMyDsl.g:1916:2: ( 'ReactReadme' )
                    // InternalMyDsl.g:1917:3: 'ReactReadme'
                    {
                     before(grammarAccess.getReactInformationTypeAccess().getReactReadmeKeyword_0()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getReactInformationTypeAccess().getReactReadmeKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1922:2: ( 'ReactAditionalInfo' )
                    {
                    // InternalMyDsl.g:1922:2: ( 'ReactAditionalInfo' )
                    // InternalMyDsl.g:1923:3: 'ReactAditionalInfo'
                    {
                     before(grammarAccess.getReactInformationTypeAccess().getReactAditionalInfoKeyword_1()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getReactInformationTypeAccess().getReactAditionalInfoKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactInformationType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMyDsl.g:1932:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1936:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyDsl.g:1937:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1944:1: rule__Model__Group__0__Impl : ( 'System' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1948:1: ( ( 'System' ) )
            // InternalMyDsl.g:1949:1: ( 'System' )
            {
            // InternalMyDsl.g:1949:1: ( 'System' )
            // InternalMyDsl.g:1950:2: 'System'
            {
             before(grammarAccess.getModelAccess().getSystemKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:1959:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1963:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalMyDsl.g:1964:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:1971:1: rule__Model__Group__1__Impl : ( ':' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1975:1: ( ( ':' ) )
            // InternalMyDsl.g:1976:1: ( ':' )
            {
            // InternalMyDsl.g:1976:1: ( ':' )
            // InternalMyDsl.g:1977:2: ':'
            {
             before(grammarAccess.getModelAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:1986:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1990:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalMyDsl.g:1991:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1998:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2002:1: ( ( '{' ) )
            // InternalMyDsl.g:2003:1: ( '{' )
            {
            // InternalMyDsl.g:2003:1: ( '{' )
            // InternalMyDsl.g:2004:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:2013:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2017:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalMyDsl.g:2018:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:2025:1: rule__Model__Group__3__Impl : ( ( rule__Model__ElementsAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2029:1: ( ( ( rule__Model__ElementsAssignment_3 ) ) )
            // InternalMyDsl.g:2030:1: ( ( rule__Model__ElementsAssignment_3 ) )
            {
            // InternalMyDsl.g:2030:1: ( ( rule__Model__ElementsAssignment_3 ) )
            // InternalMyDsl.g:2031:2: ( rule__Model__ElementsAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_3()); 
            // InternalMyDsl.g:2032:2: ( rule__Model__ElementsAssignment_3 )
            // InternalMyDsl.g:2032:3: rule__Model__ElementsAssignment_3
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
    // InternalMyDsl.g:2040:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2044:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalMyDsl.g:2045:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:2052:1: rule__Model__Group__4__Impl : ( ( rule__Model__ElementsAssignment_4 ) ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2056:1: ( ( ( rule__Model__ElementsAssignment_4 ) ) )
            // InternalMyDsl.g:2057:1: ( ( rule__Model__ElementsAssignment_4 ) )
            {
            // InternalMyDsl.g:2057:1: ( ( rule__Model__ElementsAssignment_4 ) )
            // InternalMyDsl.g:2058:2: ( rule__Model__ElementsAssignment_4 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_4()); 
            // InternalMyDsl.g:2059:2: ( rule__Model__ElementsAssignment_4 )
            // InternalMyDsl.g:2059:3: rule__Model__ElementsAssignment_4
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
    // InternalMyDsl.g:2067:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2071:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalMyDsl.g:2072:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:2079:1: rule__Model__Group__5__Impl : ( ( rule__Model__ElementsAssignment_5 ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2083:1: ( ( ( rule__Model__ElementsAssignment_5 ) ) )
            // InternalMyDsl.g:2084:1: ( ( rule__Model__ElementsAssignment_5 ) )
            {
            // InternalMyDsl.g:2084:1: ( ( rule__Model__ElementsAssignment_5 ) )
            // InternalMyDsl.g:2085:2: ( rule__Model__ElementsAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_5()); 
            // InternalMyDsl.g:2086:2: ( rule__Model__ElementsAssignment_5 )
            // InternalMyDsl.g:2086:3: rule__Model__ElementsAssignment_5
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
    // InternalMyDsl.g:2094:1: rule__Model__Group__6 : rule__Model__Group__6__Impl ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2098:1: ( rule__Model__Group__6__Impl )
            // InternalMyDsl.g:2099:2: rule__Model__Group__6__Impl
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
    // InternalMyDsl.g:2105:1: rule__Model__Group__6__Impl : ( '}' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2109:1: ( ( '}' ) )
            // InternalMyDsl.g:2110:1: ( '}' )
            {
            // InternalMyDsl.g:2110:1: ( '}' )
            // InternalMyDsl.g:2111:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:2121:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2125:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalMyDsl.g:2126:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:2133:1: rule__Domain__Group__0__Impl : ( 'Domain' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2137:1: ( ( 'Domain' ) )
            // InternalMyDsl.g:2138:1: ( 'Domain' )
            {
            // InternalMyDsl.g:2138:1: ( 'Domain' )
            // InternalMyDsl.g:2139:2: 'Domain'
            {
             before(grammarAccess.getDomainAccess().getDomainKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:2148:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2152:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // InternalMyDsl.g:2153:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:2160:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__NameAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2164:1: ( ( ( rule__Domain__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2165:1: ( ( rule__Domain__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2165:1: ( ( rule__Domain__NameAssignment_1 ) )
            // InternalMyDsl.g:2166:2: ( rule__Domain__NameAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2167:2: ( rule__Domain__NameAssignment_1 )
            // InternalMyDsl.g:2167:3: rule__Domain__NameAssignment_1
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
    // InternalMyDsl.g:2175:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2179:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // InternalMyDsl.g:2180:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:2187:1: rule__Domain__Group__2__Impl : ( ':' ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2191:1: ( ( ':' ) )
            // InternalMyDsl.g:2192:1: ( ':' )
            {
            // InternalMyDsl.g:2192:1: ( ':' )
            // InternalMyDsl.g:2193:2: ':'
            {
             before(grammarAccess.getDomainAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:2202:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl rule__Domain__Group__4 ;
    public final void rule__Domain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2206:1: ( rule__Domain__Group__3__Impl rule__Domain__Group__4 )
            // InternalMyDsl.g:2207:2: rule__Domain__Group__3__Impl rule__Domain__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:2214:1: rule__Domain__Group__3__Impl : ( '{' ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2218:1: ( ( '{' ) )
            // InternalMyDsl.g:2219:1: ( '{' )
            {
            // InternalMyDsl.g:2219:1: ( '{' )
            // InternalMyDsl.g:2220:2: '{'
            {
             before(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:2229:1: rule__Domain__Group__4 : rule__Domain__Group__4__Impl rule__Domain__Group__5 ;
    public final void rule__Domain__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2233:1: ( rule__Domain__Group__4__Impl rule__Domain__Group__5 )
            // InternalMyDsl.g:2234:2: rule__Domain__Group__4__Impl rule__Domain__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:2241:1: rule__Domain__Group__4__Impl : ( ( rule__Domain__ElementsAssignment_4 ) ) ;
    public final void rule__Domain__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2245:1: ( ( ( rule__Domain__ElementsAssignment_4 ) ) )
            // InternalMyDsl.g:2246:1: ( ( rule__Domain__ElementsAssignment_4 ) )
            {
            // InternalMyDsl.g:2246:1: ( ( rule__Domain__ElementsAssignment_4 ) )
            // InternalMyDsl.g:2247:2: ( rule__Domain__ElementsAssignment_4 )
            {
             before(grammarAccess.getDomainAccess().getElementsAssignment_4()); 
            // InternalMyDsl.g:2248:2: ( rule__Domain__ElementsAssignment_4 )
            // InternalMyDsl.g:2248:3: rule__Domain__ElementsAssignment_4
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
    // InternalMyDsl.g:2256:1: rule__Domain__Group__5 : rule__Domain__Group__5__Impl rule__Domain__Group__6 ;
    public final void rule__Domain__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2260:1: ( rule__Domain__Group__5__Impl rule__Domain__Group__6 )
            // InternalMyDsl.g:2261:2: rule__Domain__Group__5__Impl rule__Domain__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:2268:1: rule__Domain__Group__5__Impl : ( ( rule__Domain__ElementsAssignment_5 ) ) ;
    public final void rule__Domain__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2272:1: ( ( ( rule__Domain__ElementsAssignment_5 ) ) )
            // InternalMyDsl.g:2273:1: ( ( rule__Domain__ElementsAssignment_5 ) )
            {
            // InternalMyDsl.g:2273:1: ( ( rule__Domain__ElementsAssignment_5 ) )
            // InternalMyDsl.g:2274:2: ( rule__Domain__ElementsAssignment_5 )
            {
             before(grammarAccess.getDomainAccess().getElementsAssignment_5()); 
            // InternalMyDsl.g:2275:2: ( rule__Domain__ElementsAssignment_5 )
            // InternalMyDsl.g:2275:3: rule__Domain__ElementsAssignment_5
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
    // InternalMyDsl.g:2283:1: rule__Domain__Group__6 : rule__Domain__Group__6__Impl rule__Domain__Group__7 ;
    public final void rule__Domain__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2287:1: ( rule__Domain__Group__6__Impl rule__Domain__Group__7 )
            // InternalMyDsl.g:2288:2: rule__Domain__Group__6__Impl rule__Domain__Group__7
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:2295:1: rule__Domain__Group__6__Impl : ( ( rule__Domain__ElementsAssignment_6 ) ) ;
    public final void rule__Domain__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2299:1: ( ( ( rule__Domain__ElementsAssignment_6 ) ) )
            // InternalMyDsl.g:2300:1: ( ( rule__Domain__ElementsAssignment_6 ) )
            {
            // InternalMyDsl.g:2300:1: ( ( rule__Domain__ElementsAssignment_6 ) )
            // InternalMyDsl.g:2301:2: ( rule__Domain__ElementsAssignment_6 )
            {
             before(grammarAccess.getDomainAccess().getElementsAssignment_6()); 
            // InternalMyDsl.g:2302:2: ( rule__Domain__ElementsAssignment_6 )
            // InternalMyDsl.g:2302:3: rule__Domain__ElementsAssignment_6
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
    // InternalMyDsl.g:2310:1: rule__Domain__Group__7 : rule__Domain__Group__7__Impl ;
    public final void rule__Domain__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2314:1: ( rule__Domain__Group__7__Impl )
            // InternalMyDsl.g:2315:2: rule__Domain__Group__7__Impl
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
    // InternalMyDsl.g:2321:1: rule__Domain__Group__7__Impl : ( '}' ) ;
    public final void rule__Domain__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2325:1: ( ( '}' ) )
            // InternalMyDsl.g:2326:1: ( '}' )
            {
            // InternalMyDsl.g:2326:1: ( '}' )
            // InternalMyDsl.g:2327:2: '}'
            {
             before(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_7()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:2337:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2341:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalMyDsl.g:2342:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:2349:1: rule__Entity__Group__0__Impl : ( 'Entities' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2353:1: ( ( 'Entities' ) )
            // InternalMyDsl.g:2354:1: ( 'Entities' )
            {
            // InternalMyDsl.g:2354:1: ( 'Entities' )
            // InternalMyDsl.g:2355:2: 'Entities'
            {
             before(grammarAccess.getEntityAccess().getEntitiesKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:2364:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2368:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalMyDsl.g:2369:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:2376:1: rule__Entity__Group__1__Impl : ( ':' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2380:1: ( ( ':' ) )
            // InternalMyDsl.g:2381:1: ( ':' )
            {
            // InternalMyDsl.g:2381:1: ( ':' )
            // InternalMyDsl.g:2382:2: ':'
            {
             before(grammarAccess.getEntityAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:2391:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2395:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalMyDsl.g:2396:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:2403:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2407:1: ( ( '{' ) )
            // InternalMyDsl.g:2408:1: ( '{' )
            {
            // InternalMyDsl.g:2408:1: ( '{' )
            // InternalMyDsl.g:2409:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:2418:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2422:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalMyDsl.g:2423:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:2430:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__ElementsAssignment_3 ) ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2434:1: ( ( ( rule__Entity__ElementsAssignment_3 ) ) )
            // InternalMyDsl.g:2435:1: ( ( rule__Entity__ElementsAssignment_3 ) )
            {
            // InternalMyDsl.g:2435:1: ( ( rule__Entity__ElementsAssignment_3 ) )
            // InternalMyDsl.g:2436:2: ( rule__Entity__ElementsAssignment_3 )
            {
             before(grammarAccess.getEntityAccess().getElementsAssignment_3()); 
            // InternalMyDsl.g:2437:2: ( rule__Entity__ElementsAssignment_3 )
            // InternalMyDsl.g:2437:3: rule__Entity__ElementsAssignment_3
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
    // InternalMyDsl.g:2445:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2449:1: ( rule__Entity__Group__4__Impl )
            // InternalMyDsl.g:2450:2: rule__Entity__Group__4__Impl
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
    // InternalMyDsl.g:2456:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2460:1: ( ( '}' ) )
            // InternalMyDsl.g:2461:1: ( '}' )
            {
            // InternalMyDsl.g:2461:1: ( '}' )
            // InternalMyDsl.g:2462:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:2472:1: rule__Entities__Group__0 : rule__Entities__Group__0__Impl rule__Entities__Group__1 ;
    public final void rule__Entities__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2476:1: ( rule__Entities__Group__0__Impl rule__Entities__Group__1 )
            // InternalMyDsl.g:2477:2: rule__Entities__Group__0__Impl rule__Entities__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:2484:1: rule__Entities__Group__0__Impl : ( ( ( rule__Entities__ElementsAssignment_0 ) ) ( ( rule__Entities__ElementsAssignment_0 )* ) ) ;
    public final void rule__Entities__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2488:1: ( ( ( ( rule__Entities__ElementsAssignment_0 ) ) ( ( rule__Entities__ElementsAssignment_0 )* ) ) )
            // InternalMyDsl.g:2489:1: ( ( ( rule__Entities__ElementsAssignment_0 ) ) ( ( rule__Entities__ElementsAssignment_0 )* ) )
            {
            // InternalMyDsl.g:2489:1: ( ( ( rule__Entities__ElementsAssignment_0 ) ) ( ( rule__Entities__ElementsAssignment_0 )* ) )
            // InternalMyDsl.g:2490:2: ( ( rule__Entities__ElementsAssignment_0 ) ) ( ( rule__Entities__ElementsAssignment_0 )* )
            {
            // InternalMyDsl.g:2490:2: ( ( rule__Entities__ElementsAssignment_0 ) )
            // InternalMyDsl.g:2491:3: ( rule__Entities__ElementsAssignment_0 )
            {
             before(grammarAccess.getEntitiesAccess().getElementsAssignment_0()); 
            // InternalMyDsl.g:2492:3: ( rule__Entities__ElementsAssignment_0 )
            // InternalMyDsl.g:2492:4: rule__Entities__ElementsAssignment_0
            {
            pushFollow(FOLLOW_16);
            rule__Entities__ElementsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntitiesAccess().getElementsAssignment_0()); 

            }

            // InternalMyDsl.g:2495:2: ( ( rule__Entities__ElementsAssignment_0 )* )
            // InternalMyDsl.g:2496:3: ( rule__Entities__ElementsAssignment_0 )*
            {
             before(grammarAccess.getEntitiesAccess().getElementsAssignment_0()); 
            // InternalMyDsl.g:2497:3: ( rule__Entities__ElementsAssignment_0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==38) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:2497:4: rule__Entities__ElementsAssignment_0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Entities__ElementsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEntitiesAccess().getElementsAssignment_0()); 

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
    // $ANTLR end "rule__Entities__Group__0__Impl"


    // $ANTLR start "rule__Entities__Group__1"
    // InternalMyDsl.g:2506:1: rule__Entities__Group__1 : rule__Entities__Group__1__Impl rule__Entities__Group__2 ;
    public final void rule__Entities__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2510:1: ( rule__Entities__Group__1__Impl rule__Entities__Group__2 )
            // InternalMyDsl.g:2511:2: rule__Entities__Group__1__Impl rule__Entities__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2518:1: rule__Entities__Group__1__Impl : ( ( ( rule__Entities__ElementsAssignment_1 ) ) ( ( rule__Entities__ElementsAssignment_1 )* ) ) ;
    public final void rule__Entities__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2522:1: ( ( ( ( rule__Entities__ElementsAssignment_1 ) ) ( ( rule__Entities__ElementsAssignment_1 )* ) ) )
            // InternalMyDsl.g:2523:1: ( ( ( rule__Entities__ElementsAssignment_1 ) ) ( ( rule__Entities__ElementsAssignment_1 )* ) )
            {
            // InternalMyDsl.g:2523:1: ( ( ( rule__Entities__ElementsAssignment_1 ) ) ( ( rule__Entities__ElementsAssignment_1 )* ) )
            // InternalMyDsl.g:2524:2: ( ( rule__Entities__ElementsAssignment_1 ) ) ( ( rule__Entities__ElementsAssignment_1 )* )
            {
            // InternalMyDsl.g:2524:2: ( ( rule__Entities__ElementsAssignment_1 ) )
            // InternalMyDsl.g:2525:3: ( rule__Entities__ElementsAssignment_1 )
            {
             before(grammarAccess.getEntitiesAccess().getElementsAssignment_1()); 
            // InternalMyDsl.g:2526:3: ( rule__Entities__ElementsAssignment_1 )
            // InternalMyDsl.g:2526:4: rule__Entities__ElementsAssignment_1
            {
            pushFollow(FOLLOW_18);
            rule__Entities__ElementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntitiesAccess().getElementsAssignment_1()); 

            }

            // InternalMyDsl.g:2529:2: ( ( rule__Entities__ElementsAssignment_1 )* )
            // InternalMyDsl.g:2530:3: ( rule__Entities__ElementsAssignment_1 )*
            {
             before(grammarAccess.getEntitiesAccess().getElementsAssignment_1()); 
            // InternalMyDsl.g:2531:3: ( rule__Entities__ElementsAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==39) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:2531:4: rule__Entities__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Entities__ElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getEntitiesAccess().getElementsAssignment_1()); 

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
    // $ANTLR end "rule__Entities__Group__1__Impl"


    // $ANTLR start "rule__Entities__Group__2"
    // InternalMyDsl.g:2540:1: rule__Entities__Group__2 : rule__Entities__Group__2__Impl ;
    public final void rule__Entities__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2544:1: ( rule__Entities__Group__2__Impl )
            // InternalMyDsl.g:2545:2: rule__Entities__Group__2__Impl
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
    // InternalMyDsl.g:2551:1: rule__Entities__Group__2__Impl : ( ( ( rule__Entities__ElementsAssignment_2 ) ) ( ( rule__Entities__ElementsAssignment_2 )* ) ) ;
    public final void rule__Entities__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2555:1: ( ( ( ( rule__Entities__ElementsAssignment_2 ) ) ( ( rule__Entities__ElementsAssignment_2 )* ) ) )
            // InternalMyDsl.g:2556:1: ( ( ( rule__Entities__ElementsAssignment_2 ) ) ( ( rule__Entities__ElementsAssignment_2 )* ) )
            {
            // InternalMyDsl.g:2556:1: ( ( ( rule__Entities__ElementsAssignment_2 ) ) ( ( rule__Entities__ElementsAssignment_2 )* ) )
            // InternalMyDsl.g:2557:2: ( ( rule__Entities__ElementsAssignment_2 ) ) ( ( rule__Entities__ElementsAssignment_2 )* )
            {
            // InternalMyDsl.g:2557:2: ( ( rule__Entities__ElementsAssignment_2 ) )
            // InternalMyDsl.g:2558:3: ( rule__Entities__ElementsAssignment_2 )
            {
             before(grammarAccess.getEntitiesAccess().getElementsAssignment_2()); 
            // InternalMyDsl.g:2559:3: ( rule__Entities__ElementsAssignment_2 )
            // InternalMyDsl.g:2559:4: rule__Entities__ElementsAssignment_2
            {
            pushFollow(FOLLOW_19);
            rule__Entities__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntitiesAccess().getElementsAssignment_2()); 

            }

            // InternalMyDsl.g:2562:2: ( ( rule__Entities__ElementsAssignment_2 )* )
            // InternalMyDsl.g:2563:3: ( rule__Entities__ElementsAssignment_2 )*
            {
             before(grammarAccess.getEntitiesAccess().getElementsAssignment_2()); 
            // InternalMyDsl.g:2564:3: ( rule__Entities__ElementsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==40) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:2564:4: rule__Entities__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Entities__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getEntitiesAccess().getElementsAssignment_2()); 

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
    // $ANTLR end "rule__Entities__Group__2__Impl"


    // $ANTLR start "rule__Photo__Group__0"
    // InternalMyDsl.g:2574:1: rule__Photo__Group__0 : rule__Photo__Group__0__Impl rule__Photo__Group__1 ;
    public final void rule__Photo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2578:1: ( rule__Photo__Group__0__Impl rule__Photo__Group__1 )
            // InternalMyDsl.g:2579:2: rule__Photo__Group__0__Impl rule__Photo__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:2586:1: rule__Photo__Group__0__Impl : ( 'Photo' ) ;
    public final void rule__Photo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2590:1: ( ( 'Photo' ) )
            // InternalMyDsl.g:2591:1: ( 'Photo' )
            {
            // InternalMyDsl.g:2591:1: ( 'Photo' )
            // InternalMyDsl.g:2592:2: 'Photo'
            {
             before(grammarAccess.getPhotoAccess().getPhotoKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:2601:1: rule__Photo__Group__1 : rule__Photo__Group__1__Impl ;
    public final void rule__Photo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2605:1: ( rule__Photo__Group__1__Impl )
            // InternalMyDsl.g:2606:2: rule__Photo__Group__1__Impl
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
    // InternalMyDsl.g:2612:1: rule__Photo__Group__1__Impl : ( ( rule__Photo__NameAssignment_1 ) ) ;
    public final void rule__Photo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2616:1: ( ( ( rule__Photo__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2617:1: ( ( rule__Photo__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2617:1: ( ( rule__Photo__NameAssignment_1 ) )
            // InternalMyDsl.g:2618:2: ( rule__Photo__NameAssignment_1 )
            {
             before(grammarAccess.getPhotoAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2619:2: ( rule__Photo__NameAssignment_1 )
            // InternalMyDsl.g:2619:3: rule__Photo__NameAssignment_1
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
    // InternalMyDsl.g:2628:1: rule__Album__Group__0 : rule__Album__Group__0__Impl rule__Album__Group__1 ;
    public final void rule__Album__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2632:1: ( rule__Album__Group__0__Impl rule__Album__Group__1 )
            // InternalMyDsl.g:2633:2: rule__Album__Group__0__Impl rule__Album__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:2640:1: rule__Album__Group__0__Impl : ( 'Album' ) ;
    public final void rule__Album__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2644:1: ( ( 'Album' ) )
            // InternalMyDsl.g:2645:1: ( 'Album' )
            {
            // InternalMyDsl.g:2645:1: ( 'Album' )
            // InternalMyDsl.g:2646:2: 'Album'
            {
             before(grammarAccess.getAlbumAccess().getAlbumKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:2655:1: rule__Album__Group__1 : rule__Album__Group__1__Impl ;
    public final void rule__Album__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2659:1: ( rule__Album__Group__1__Impl )
            // InternalMyDsl.g:2660:2: rule__Album__Group__1__Impl
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
    // InternalMyDsl.g:2666:1: rule__Album__Group__1__Impl : ( ( rule__Album__NameAssignment_1 ) ) ;
    public final void rule__Album__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2670:1: ( ( ( rule__Album__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2671:1: ( ( rule__Album__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2671:1: ( ( rule__Album__NameAssignment_1 ) )
            // InternalMyDsl.g:2672:2: ( rule__Album__NameAssignment_1 )
            {
             before(grammarAccess.getAlbumAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2673:2: ( rule__Album__NameAssignment_1 )
            // InternalMyDsl.g:2673:3: rule__Album__NameAssignment_1
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
    // InternalMyDsl.g:2682:1: rule__UserDomain__Group__0 : rule__UserDomain__Group__0__Impl rule__UserDomain__Group__1 ;
    public final void rule__UserDomain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2686:1: ( rule__UserDomain__Group__0__Impl rule__UserDomain__Group__1 )
            // InternalMyDsl.g:2687:2: rule__UserDomain__Group__0__Impl rule__UserDomain__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:2694:1: rule__UserDomain__Group__0__Impl : ( 'UserDomain' ) ;
    public final void rule__UserDomain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2698:1: ( ( 'UserDomain' ) )
            // InternalMyDsl.g:2699:1: ( 'UserDomain' )
            {
            // InternalMyDsl.g:2699:1: ( 'UserDomain' )
            // InternalMyDsl.g:2700:2: 'UserDomain'
            {
             before(grammarAccess.getUserDomainAccess().getUserDomainKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMyDsl.g:2709:1: rule__UserDomain__Group__1 : rule__UserDomain__Group__1__Impl ;
    public final void rule__UserDomain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2713:1: ( rule__UserDomain__Group__1__Impl )
            // InternalMyDsl.g:2714:2: rule__UserDomain__Group__1__Impl
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
    // InternalMyDsl.g:2720:1: rule__UserDomain__Group__1__Impl : ( ( rule__UserDomain__NameAssignment_1 ) ) ;
    public final void rule__UserDomain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2724:1: ( ( ( rule__UserDomain__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2725:1: ( ( rule__UserDomain__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2725:1: ( ( rule__UserDomain__NameAssignment_1 ) )
            // InternalMyDsl.g:2726:2: ( rule__UserDomain__NameAssignment_1 )
            {
             before(grammarAccess.getUserDomainAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2727:2: ( rule__UserDomain__NameAssignment_1 )
            // InternalMyDsl.g:2727:3: rule__UserDomain__NameAssignment_1
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
    // InternalMyDsl.g:2736:1: rule__Functionality__Group__0 : rule__Functionality__Group__0__Impl rule__Functionality__Group__1 ;
    public final void rule__Functionality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2740:1: ( rule__Functionality__Group__0__Impl rule__Functionality__Group__1 )
            // InternalMyDsl.g:2741:2: rule__Functionality__Group__0__Impl rule__Functionality__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:2748:1: rule__Functionality__Group__0__Impl : ( 'Functionalities' ) ;
    public final void rule__Functionality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2752:1: ( ( 'Functionalities' ) )
            // InternalMyDsl.g:2753:1: ( 'Functionalities' )
            {
            // InternalMyDsl.g:2753:1: ( 'Functionalities' )
            // InternalMyDsl.g:2754:2: 'Functionalities'
            {
             before(grammarAccess.getFunctionalityAccess().getFunctionalitiesKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyDsl.g:2763:1: rule__Functionality__Group__1 : rule__Functionality__Group__1__Impl rule__Functionality__Group__2 ;
    public final void rule__Functionality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2767:1: ( rule__Functionality__Group__1__Impl rule__Functionality__Group__2 )
            // InternalMyDsl.g:2768:2: rule__Functionality__Group__1__Impl rule__Functionality__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:2775:1: rule__Functionality__Group__1__Impl : ( ':' ) ;
    public final void rule__Functionality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2779:1: ( ( ':' ) )
            // InternalMyDsl.g:2780:1: ( ':' )
            {
            // InternalMyDsl.g:2780:1: ( ':' )
            // InternalMyDsl.g:2781:2: ':'
            {
             before(grammarAccess.getFunctionalityAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:2790:1: rule__Functionality__Group__2 : rule__Functionality__Group__2__Impl rule__Functionality__Group__3 ;
    public final void rule__Functionality__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2794:1: ( rule__Functionality__Group__2__Impl rule__Functionality__Group__3 )
            // InternalMyDsl.g:2795:2: rule__Functionality__Group__2__Impl rule__Functionality__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2802:1: rule__Functionality__Group__2__Impl : ( '{' ) ;
    public final void rule__Functionality__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2806:1: ( ( '{' ) )
            // InternalMyDsl.g:2807:1: ( '{' )
            {
            // InternalMyDsl.g:2807:1: ( '{' )
            // InternalMyDsl.g:2808:2: '{'
            {
             before(grammarAccess.getFunctionalityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:2817:1: rule__Functionality__Group__3 : rule__Functionality__Group__3__Impl rule__Functionality__Group__4 ;
    public final void rule__Functionality__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2821:1: ( rule__Functionality__Group__3__Impl rule__Functionality__Group__4 )
            // InternalMyDsl.g:2822:2: rule__Functionality__Group__3__Impl rule__Functionality__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:2829:1: rule__Functionality__Group__3__Impl : ( ( rule__Functionality__ElementsAssignment_3 ) ) ;
    public final void rule__Functionality__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2833:1: ( ( ( rule__Functionality__ElementsAssignment_3 ) ) )
            // InternalMyDsl.g:2834:1: ( ( rule__Functionality__ElementsAssignment_3 ) )
            {
            // InternalMyDsl.g:2834:1: ( ( rule__Functionality__ElementsAssignment_3 ) )
            // InternalMyDsl.g:2835:2: ( rule__Functionality__ElementsAssignment_3 )
            {
             before(grammarAccess.getFunctionalityAccess().getElementsAssignment_3()); 
            // InternalMyDsl.g:2836:2: ( rule__Functionality__ElementsAssignment_3 )
            // InternalMyDsl.g:2836:3: rule__Functionality__ElementsAssignment_3
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
    // InternalMyDsl.g:2844:1: rule__Functionality__Group__4 : rule__Functionality__Group__4__Impl ;
    public final void rule__Functionality__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2848:1: ( rule__Functionality__Group__4__Impl )
            // InternalMyDsl.g:2849:2: rule__Functionality__Group__4__Impl
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
    // InternalMyDsl.g:2855:1: rule__Functionality__Group__4__Impl : ( '}' ) ;
    public final void rule__Functionality__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2859:1: ( ( '}' ) )
            // InternalMyDsl.g:2860:1: ( '}' )
            {
            // InternalMyDsl.g:2860:1: ( '}' )
            // InternalMyDsl.g:2861:2: '}'
            {
             before(grammarAccess.getFunctionalityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:2871:1: rule__Functionalities__Group__0 : rule__Functionalities__Group__0__Impl rule__Functionalities__Group__1 ;
    public final void rule__Functionalities__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2875:1: ( rule__Functionalities__Group__0__Impl rule__Functionalities__Group__1 )
            // InternalMyDsl.g:2876:2: rule__Functionalities__Group__0__Impl rule__Functionalities__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2883:1: rule__Functionalities__Group__0__Impl : ( ( rule__Functionalities__FunctionsAssignment_0 ) ) ;
    public final void rule__Functionalities__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2887:1: ( ( ( rule__Functionalities__FunctionsAssignment_0 ) ) )
            // InternalMyDsl.g:2888:1: ( ( rule__Functionalities__FunctionsAssignment_0 ) )
            {
            // InternalMyDsl.g:2888:1: ( ( rule__Functionalities__FunctionsAssignment_0 ) )
            // InternalMyDsl.g:2889:2: ( rule__Functionalities__FunctionsAssignment_0 )
            {
             before(grammarAccess.getFunctionalitiesAccess().getFunctionsAssignment_0()); 
            // InternalMyDsl.g:2890:2: ( rule__Functionalities__FunctionsAssignment_0 )
            // InternalMyDsl.g:2890:3: rule__Functionalities__FunctionsAssignment_0
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
    // InternalMyDsl.g:2898:1: rule__Functionalities__Group__1 : rule__Functionalities__Group__1__Impl rule__Functionalities__Group__2 ;
    public final void rule__Functionalities__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2902:1: ( rule__Functionalities__Group__1__Impl rule__Functionalities__Group__2 )
            // InternalMyDsl.g:2903:2: rule__Functionalities__Group__1__Impl rule__Functionalities__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2910:1: rule__Functionalities__Group__1__Impl : ( ( rule__Functionalities__ElementsAssignment_1 ) ) ;
    public final void rule__Functionalities__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2914:1: ( ( ( rule__Functionalities__ElementsAssignment_1 ) ) )
            // InternalMyDsl.g:2915:1: ( ( rule__Functionalities__ElementsAssignment_1 ) )
            {
            // InternalMyDsl.g:2915:1: ( ( rule__Functionalities__ElementsAssignment_1 ) )
            // InternalMyDsl.g:2916:2: ( rule__Functionalities__ElementsAssignment_1 )
            {
             before(grammarAccess.getFunctionalitiesAccess().getElementsAssignment_1()); 
            // InternalMyDsl.g:2917:2: ( rule__Functionalities__ElementsAssignment_1 )
            // InternalMyDsl.g:2917:3: rule__Functionalities__ElementsAssignment_1
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
    // InternalMyDsl.g:2925:1: rule__Functionalities__Group__2 : rule__Functionalities__Group__2__Impl rule__Functionalities__Group__3 ;
    public final void rule__Functionalities__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2929:1: ( rule__Functionalities__Group__2__Impl rule__Functionalities__Group__3 )
            // InternalMyDsl.g:2930:2: rule__Functionalities__Group__2__Impl rule__Functionalities__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2937:1: rule__Functionalities__Group__2__Impl : ( ( rule__Functionalities__ItemsAssignment_2 ) ) ;
    public final void rule__Functionalities__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2941:1: ( ( ( rule__Functionalities__ItemsAssignment_2 ) ) )
            // InternalMyDsl.g:2942:1: ( ( rule__Functionalities__ItemsAssignment_2 ) )
            {
            // InternalMyDsl.g:2942:1: ( ( rule__Functionalities__ItemsAssignment_2 ) )
            // InternalMyDsl.g:2943:2: ( rule__Functionalities__ItemsAssignment_2 )
            {
             before(grammarAccess.getFunctionalitiesAccess().getItemsAssignment_2()); 
            // InternalMyDsl.g:2944:2: ( rule__Functionalities__ItemsAssignment_2 )
            // InternalMyDsl.g:2944:3: rule__Functionalities__ItemsAssignment_2
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
    // InternalMyDsl.g:2952:1: rule__Functionalities__Group__3 : rule__Functionalities__Group__3__Impl rule__Functionalities__Group__4 ;
    public final void rule__Functionalities__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2956:1: ( rule__Functionalities__Group__3__Impl rule__Functionalities__Group__4 )
            // InternalMyDsl.g:2957:2: rule__Functionalities__Group__3__Impl rule__Functionalities__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2964:1: rule__Functionalities__Group__3__Impl : ( ( rule__Functionalities__ResourcesAssignment_3 ) ) ;
    public final void rule__Functionalities__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2968:1: ( ( ( rule__Functionalities__ResourcesAssignment_3 ) ) )
            // InternalMyDsl.g:2969:1: ( ( rule__Functionalities__ResourcesAssignment_3 ) )
            {
            // InternalMyDsl.g:2969:1: ( ( rule__Functionalities__ResourcesAssignment_3 ) )
            // InternalMyDsl.g:2970:2: ( rule__Functionalities__ResourcesAssignment_3 )
            {
             before(grammarAccess.getFunctionalitiesAccess().getResourcesAssignment_3()); 
            // InternalMyDsl.g:2971:2: ( rule__Functionalities__ResourcesAssignment_3 )
            // InternalMyDsl.g:2971:3: rule__Functionalities__ResourcesAssignment_3
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
    // InternalMyDsl.g:2979:1: rule__Functionalities__Group__4 : rule__Functionalities__Group__4__Impl ;
    public final void rule__Functionalities__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2983:1: ( rule__Functionalities__Group__4__Impl )
            // InternalMyDsl.g:2984:2: rule__Functionalities__Group__4__Impl
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
    // InternalMyDsl.g:2990:1: rule__Functionalities__Group__4__Impl : ( ( rule__Functionalities__AditionalsAssignment_4 ) ) ;
    public final void rule__Functionalities__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2994:1: ( ( ( rule__Functionalities__AditionalsAssignment_4 ) ) )
            // InternalMyDsl.g:2995:1: ( ( rule__Functionalities__AditionalsAssignment_4 ) )
            {
            // InternalMyDsl.g:2995:1: ( ( rule__Functionalities__AditionalsAssignment_4 ) )
            // InternalMyDsl.g:2996:2: ( rule__Functionalities__AditionalsAssignment_4 )
            {
             before(grammarAccess.getFunctionalitiesAccess().getAditionalsAssignment_4()); 
            // InternalMyDsl.g:2997:2: ( rule__Functionalities__AditionalsAssignment_4 )
            // InternalMyDsl.g:2997:3: rule__Functionalities__AditionalsAssignment_4
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
    // InternalMyDsl.g:3006:1: rule__ProfileManagement__Group__0 : rule__ProfileManagement__Group__0__Impl rule__ProfileManagement__Group__1 ;
    public final void rule__ProfileManagement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3010:1: ( rule__ProfileManagement__Group__0__Impl rule__ProfileManagement__Group__1 )
            // InternalMyDsl.g:3011:2: rule__ProfileManagement__Group__0__Impl rule__ProfileManagement__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:3018:1: rule__ProfileManagement__Group__0__Impl : ( 'ProfileManagement' ) ;
    public final void rule__ProfileManagement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3022:1: ( ( 'ProfileManagement' ) )
            // InternalMyDsl.g:3023:1: ( 'ProfileManagement' )
            {
            // InternalMyDsl.g:3023:1: ( 'ProfileManagement' )
            // InternalMyDsl.g:3024:2: 'ProfileManagement'
            {
             before(grammarAccess.getProfileManagementAccess().getProfileManagementKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMyDsl.g:3033:1: rule__ProfileManagement__Group__1 : rule__ProfileManagement__Group__1__Impl rule__ProfileManagement__Group__2 ;
    public final void rule__ProfileManagement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3037:1: ( rule__ProfileManagement__Group__1__Impl rule__ProfileManagement__Group__2 )
            // InternalMyDsl.g:3038:2: rule__ProfileManagement__Group__1__Impl rule__ProfileManagement__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:3045:1: rule__ProfileManagement__Group__1__Impl : ( ':' ) ;
    public final void rule__ProfileManagement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3049:1: ( ( ':' ) )
            // InternalMyDsl.g:3050:1: ( ':' )
            {
            // InternalMyDsl.g:3050:1: ( ':' )
            // InternalMyDsl.g:3051:2: ':'
            {
             before(grammarAccess.getProfileManagementAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:3060:1: rule__ProfileManagement__Group__2 : rule__ProfileManagement__Group__2__Impl ;
    public final void rule__ProfileManagement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3064:1: ( rule__ProfileManagement__Group__2__Impl )
            // InternalMyDsl.g:3065:2: rule__ProfileManagement__Group__2__Impl
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
    // InternalMyDsl.g:3071:1: rule__ProfileManagement__Group__2__Impl : ( ( rule__ProfileManagement__ItemsAssignment_2 ) ) ;
    public final void rule__ProfileManagement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3075:1: ( ( ( rule__ProfileManagement__ItemsAssignment_2 ) ) )
            // InternalMyDsl.g:3076:1: ( ( rule__ProfileManagement__ItemsAssignment_2 ) )
            {
            // InternalMyDsl.g:3076:1: ( ( rule__ProfileManagement__ItemsAssignment_2 ) )
            // InternalMyDsl.g:3077:2: ( rule__ProfileManagement__ItemsAssignment_2 )
            {
             before(grammarAccess.getProfileManagementAccess().getItemsAssignment_2()); 
            // InternalMyDsl.g:3078:2: ( rule__ProfileManagement__ItemsAssignment_2 )
            // InternalMyDsl.g:3078:3: rule__ProfileManagement__ItemsAssignment_2
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
    // InternalMyDsl.g:3087:1: rule__ProfileManagementFunctions__Group__0 : rule__ProfileManagementFunctions__Group__0__Impl rule__ProfileManagementFunctions__Group__1 ;
    public final void rule__ProfileManagementFunctions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3091:1: ( rule__ProfileManagementFunctions__Group__0__Impl rule__ProfileManagementFunctions__Group__1 )
            // InternalMyDsl.g:3092:2: rule__ProfileManagementFunctions__Group__0__Impl rule__ProfileManagementFunctions__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:3099:1: rule__ProfileManagementFunctions__Group__0__Impl : ( 'ViewProfilePhoto' ) ;
    public final void rule__ProfileManagementFunctions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3103:1: ( ( 'ViewProfilePhoto' ) )
            // InternalMyDsl.g:3104:1: ( 'ViewProfilePhoto' )
            {
            // InternalMyDsl.g:3104:1: ( 'ViewProfilePhoto' )
            // InternalMyDsl.g:3105:2: 'ViewProfilePhoto'
            {
             before(grammarAccess.getProfileManagementFunctionsAccess().getViewProfilePhotoKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyDsl.g:3114:1: rule__ProfileManagementFunctions__Group__1 : rule__ProfileManagementFunctions__Group__1__Impl rule__ProfileManagementFunctions__Group__2 ;
    public final void rule__ProfileManagementFunctions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3118:1: ( rule__ProfileManagementFunctions__Group__1__Impl rule__ProfileManagementFunctions__Group__2 )
            // InternalMyDsl.g:3119:2: rule__ProfileManagementFunctions__Group__1__Impl rule__ProfileManagementFunctions__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:3126:1: rule__ProfileManagementFunctions__Group__1__Impl : ( ( rule__ProfileManagementFunctions__NameAssignment_1 ) ) ;
    public final void rule__ProfileManagementFunctions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3130:1: ( ( ( rule__ProfileManagementFunctions__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3131:1: ( ( rule__ProfileManagementFunctions__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3131:1: ( ( rule__ProfileManagementFunctions__NameAssignment_1 ) )
            // InternalMyDsl.g:3132:2: ( rule__ProfileManagementFunctions__NameAssignment_1 )
            {
             before(grammarAccess.getProfileManagementFunctionsAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3133:2: ( rule__ProfileManagementFunctions__NameAssignment_1 )
            // InternalMyDsl.g:3133:3: rule__ProfileManagementFunctions__NameAssignment_1
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
    // InternalMyDsl.g:3141:1: rule__ProfileManagementFunctions__Group__2 : rule__ProfileManagementFunctions__Group__2__Impl rule__ProfileManagementFunctions__Group__3 ;
    public final void rule__ProfileManagementFunctions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3145:1: ( rule__ProfileManagementFunctions__Group__2__Impl rule__ProfileManagementFunctions__Group__3 )
            // InternalMyDsl.g:3146:2: rule__ProfileManagementFunctions__Group__2__Impl rule__ProfileManagementFunctions__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:3153:1: rule__ProfileManagementFunctions__Group__2__Impl : ( 'EditProfileInfo' ) ;
    public final void rule__ProfileManagementFunctions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3157:1: ( ( 'EditProfileInfo' ) )
            // InternalMyDsl.g:3158:1: ( 'EditProfileInfo' )
            {
            // InternalMyDsl.g:3158:1: ( 'EditProfileInfo' )
            // InternalMyDsl.g:3159:2: 'EditProfileInfo'
            {
             before(grammarAccess.getProfileManagementFunctionsAccess().getEditProfileInfoKeyword_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalMyDsl.g:3168:1: rule__ProfileManagementFunctions__Group__3 : rule__ProfileManagementFunctions__Group__3__Impl ;
    public final void rule__ProfileManagementFunctions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3172:1: ( rule__ProfileManagementFunctions__Group__3__Impl )
            // InternalMyDsl.g:3173:2: rule__ProfileManagementFunctions__Group__3__Impl
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
    // InternalMyDsl.g:3179:1: rule__ProfileManagementFunctions__Group__3__Impl : ( ( rule__ProfileManagementFunctions__NameAssignment_3 ) ) ;
    public final void rule__ProfileManagementFunctions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3183:1: ( ( ( rule__ProfileManagementFunctions__NameAssignment_3 ) ) )
            // InternalMyDsl.g:3184:1: ( ( rule__ProfileManagementFunctions__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:3184:1: ( ( rule__ProfileManagementFunctions__NameAssignment_3 ) )
            // InternalMyDsl.g:3185:2: ( rule__ProfileManagementFunctions__NameAssignment_3 )
            {
             before(grammarAccess.getProfileManagementFunctionsAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:3186:2: ( rule__ProfileManagementFunctions__NameAssignment_3 )
            // InternalMyDsl.g:3186:3: rule__ProfileManagementFunctions__NameAssignment_3
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
    // InternalMyDsl.g:3195:1: rule__AppAccess__Group__0 : rule__AppAccess__Group__0__Impl rule__AppAccess__Group__1 ;
    public final void rule__AppAccess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3199:1: ( rule__AppAccess__Group__0__Impl rule__AppAccess__Group__1 )
            // InternalMyDsl.g:3200:2: rule__AppAccess__Group__0__Impl rule__AppAccess__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:3207:1: rule__AppAccess__Group__0__Impl : ( 'AppAccess' ) ;
    public final void rule__AppAccess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3211:1: ( ( 'AppAccess' ) )
            // InternalMyDsl.g:3212:1: ( 'AppAccess' )
            {
            // InternalMyDsl.g:3212:1: ( 'AppAccess' )
            // InternalMyDsl.g:3213:2: 'AppAccess'
            {
             before(grammarAccess.getAppAccessAccess().getAppAccessKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMyDsl.g:3222:1: rule__AppAccess__Group__1 : rule__AppAccess__Group__1__Impl rule__AppAccess__Group__2 ;
    public final void rule__AppAccess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3226:1: ( rule__AppAccess__Group__1__Impl rule__AppAccess__Group__2 )
            // InternalMyDsl.g:3227:2: rule__AppAccess__Group__1__Impl rule__AppAccess__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:3234:1: rule__AppAccess__Group__1__Impl : ( ':' ) ;
    public final void rule__AppAccess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3238:1: ( ( ':' ) )
            // InternalMyDsl.g:3239:1: ( ':' )
            {
            // InternalMyDsl.g:3239:1: ( ':' )
            // InternalMyDsl.g:3240:2: ':'
            {
             before(grammarAccess.getAppAccessAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:3249:1: rule__AppAccess__Group__2 : rule__AppAccess__Group__2__Impl ;
    public final void rule__AppAccess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3253:1: ( rule__AppAccess__Group__2__Impl )
            // InternalMyDsl.g:3254:2: rule__AppAccess__Group__2__Impl
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
    // InternalMyDsl.g:3260:1: rule__AppAccess__Group__2__Impl : ( ( rule__AppAccess__ItemsAssignment_2 ) ) ;
    public final void rule__AppAccess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3264:1: ( ( ( rule__AppAccess__ItemsAssignment_2 ) ) )
            // InternalMyDsl.g:3265:1: ( ( rule__AppAccess__ItemsAssignment_2 ) )
            {
            // InternalMyDsl.g:3265:1: ( ( rule__AppAccess__ItemsAssignment_2 ) )
            // InternalMyDsl.g:3266:2: ( rule__AppAccess__ItemsAssignment_2 )
            {
             before(grammarAccess.getAppAccessAccess().getItemsAssignment_2()); 
            // InternalMyDsl.g:3267:2: ( rule__AppAccess__ItemsAssignment_2 )
            // InternalMyDsl.g:3267:3: rule__AppAccess__ItemsAssignment_2
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
    // InternalMyDsl.g:3276:1: rule__AppAccessFunctions__Group__0 : rule__AppAccessFunctions__Group__0__Impl rule__AppAccessFunctions__Group__1 ;
    public final void rule__AppAccessFunctions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3280:1: ( rule__AppAccessFunctions__Group__0__Impl rule__AppAccessFunctions__Group__1 )
            // InternalMyDsl.g:3281:2: rule__AppAccessFunctions__Group__0__Impl rule__AppAccessFunctions__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:3288:1: rule__AppAccessFunctions__Group__0__Impl : ( 'Login' ) ;
    public final void rule__AppAccessFunctions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3292:1: ( ( 'Login' ) )
            // InternalMyDsl.g:3293:1: ( 'Login' )
            {
            // InternalMyDsl.g:3293:1: ( 'Login' )
            // InternalMyDsl.g:3294:2: 'Login'
            {
             before(grammarAccess.getAppAccessFunctionsAccess().getLoginKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMyDsl.g:3303:1: rule__AppAccessFunctions__Group__1 : rule__AppAccessFunctions__Group__1__Impl rule__AppAccessFunctions__Group__2 ;
    public final void rule__AppAccessFunctions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3307:1: ( rule__AppAccessFunctions__Group__1__Impl rule__AppAccessFunctions__Group__2 )
            // InternalMyDsl.g:3308:2: rule__AppAccessFunctions__Group__1__Impl rule__AppAccessFunctions__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:3315:1: rule__AppAccessFunctions__Group__1__Impl : ( ( rule__AppAccessFunctions__NameAssignment_1 ) ) ;
    public final void rule__AppAccessFunctions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3319:1: ( ( ( rule__AppAccessFunctions__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3320:1: ( ( rule__AppAccessFunctions__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3320:1: ( ( rule__AppAccessFunctions__NameAssignment_1 ) )
            // InternalMyDsl.g:3321:2: ( rule__AppAccessFunctions__NameAssignment_1 )
            {
             before(grammarAccess.getAppAccessFunctionsAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3322:2: ( rule__AppAccessFunctions__NameAssignment_1 )
            // InternalMyDsl.g:3322:3: rule__AppAccessFunctions__NameAssignment_1
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
    // InternalMyDsl.g:3330:1: rule__AppAccessFunctions__Group__2 : rule__AppAccessFunctions__Group__2__Impl rule__AppAccessFunctions__Group__3 ;
    public final void rule__AppAccessFunctions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3334:1: ( rule__AppAccessFunctions__Group__2__Impl rule__AppAccessFunctions__Group__3 )
            // InternalMyDsl.g:3335:2: rule__AppAccessFunctions__Group__2__Impl rule__AppAccessFunctions__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:3342:1: rule__AppAccessFunctions__Group__2__Impl : ( 'Register' ) ;
    public final void rule__AppAccessFunctions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3346:1: ( ( 'Register' ) )
            // InternalMyDsl.g:3347:1: ( 'Register' )
            {
            // InternalMyDsl.g:3347:1: ( 'Register' )
            // InternalMyDsl.g:3348:2: 'Register'
            {
             before(grammarAccess.getAppAccessFunctionsAccess().getRegisterKeyword_2()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMyDsl.g:3357:1: rule__AppAccessFunctions__Group__3 : rule__AppAccessFunctions__Group__3__Impl ;
    public final void rule__AppAccessFunctions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3361:1: ( rule__AppAccessFunctions__Group__3__Impl )
            // InternalMyDsl.g:3362:2: rule__AppAccessFunctions__Group__3__Impl
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
    // InternalMyDsl.g:3368:1: rule__AppAccessFunctions__Group__3__Impl : ( ( rule__AppAccessFunctions__NameAssignment_3 ) ) ;
    public final void rule__AppAccessFunctions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3372:1: ( ( ( rule__AppAccessFunctions__NameAssignment_3 ) ) )
            // InternalMyDsl.g:3373:1: ( ( rule__AppAccessFunctions__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:3373:1: ( ( rule__AppAccessFunctions__NameAssignment_3 ) )
            // InternalMyDsl.g:3374:2: ( rule__AppAccessFunctions__NameAssignment_3 )
            {
             before(grammarAccess.getAppAccessFunctionsAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:3375:2: ( rule__AppAccessFunctions__NameAssignment_3 )
            // InternalMyDsl.g:3375:3: rule__AppAccessFunctions__NameAssignment_3
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
    // InternalMyDsl.g:3384:1: rule__AlbumManagement__Group__0 : rule__AlbumManagement__Group__0__Impl rule__AlbumManagement__Group__1 ;
    public final void rule__AlbumManagement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3388:1: ( rule__AlbumManagement__Group__0__Impl rule__AlbumManagement__Group__1 )
            // InternalMyDsl.g:3389:2: rule__AlbumManagement__Group__0__Impl rule__AlbumManagement__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:3396:1: rule__AlbumManagement__Group__0__Impl : ( 'AlbumManagement' ) ;
    public final void rule__AlbumManagement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3400:1: ( ( 'AlbumManagement' ) )
            // InternalMyDsl.g:3401:1: ( 'AlbumManagement' )
            {
            // InternalMyDsl.g:3401:1: ( 'AlbumManagement' )
            // InternalMyDsl.g:3402:2: 'AlbumManagement'
            {
             before(grammarAccess.getAlbumManagementAccess().getAlbumManagementKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMyDsl.g:3411:1: rule__AlbumManagement__Group__1 : rule__AlbumManagement__Group__1__Impl rule__AlbumManagement__Group__2 ;
    public final void rule__AlbumManagement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3415:1: ( rule__AlbumManagement__Group__1__Impl rule__AlbumManagement__Group__2 )
            // InternalMyDsl.g:3416:2: rule__AlbumManagement__Group__1__Impl rule__AlbumManagement__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:3423:1: rule__AlbumManagement__Group__1__Impl : ( ':' ) ;
    public final void rule__AlbumManagement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3427:1: ( ( ':' ) )
            // InternalMyDsl.g:3428:1: ( ':' )
            {
            // InternalMyDsl.g:3428:1: ( ':' )
            // InternalMyDsl.g:3429:2: ':'
            {
             before(grammarAccess.getAlbumManagementAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:3438:1: rule__AlbumManagement__Group__2 : rule__AlbumManagement__Group__2__Impl ;
    public final void rule__AlbumManagement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3442:1: ( rule__AlbumManagement__Group__2__Impl )
            // InternalMyDsl.g:3443:2: rule__AlbumManagement__Group__2__Impl
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
    // InternalMyDsl.g:3449:1: rule__AlbumManagement__Group__2__Impl : ( ( rule__AlbumManagement__ItemsAssignment_2 ) ) ;
    public final void rule__AlbumManagement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3453:1: ( ( ( rule__AlbumManagement__ItemsAssignment_2 ) ) )
            // InternalMyDsl.g:3454:1: ( ( rule__AlbumManagement__ItemsAssignment_2 ) )
            {
            // InternalMyDsl.g:3454:1: ( ( rule__AlbumManagement__ItemsAssignment_2 ) )
            // InternalMyDsl.g:3455:2: ( rule__AlbumManagement__ItemsAssignment_2 )
            {
             before(grammarAccess.getAlbumManagementAccess().getItemsAssignment_2()); 
            // InternalMyDsl.g:3456:2: ( rule__AlbumManagement__ItemsAssignment_2 )
            // InternalMyDsl.g:3456:3: rule__AlbumManagement__ItemsAssignment_2
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
    // InternalMyDsl.g:3465:1: rule__AlbumManagementFunctions__Group__0 : rule__AlbumManagementFunctions__Group__0__Impl rule__AlbumManagementFunctions__Group__1 ;
    public final void rule__AlbumManagementFunctions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3469:1: ( rule__AlbumManagementFunctions__Group__0__Impl rule__AlbumManagementFunctions__Group__1 )
            // InternalMyDsl.g:3470:2: rule__AlbumManagementFunctions__Group__0__Impl rule__AlbumManagementFunctions__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:3477:1: rule__AlbumManagementFunctions__Group__0__Impl : ( 'CreateAlbum' ) ;
    public final void rule__AlbumManagementFunctions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3481:1: ( ( 'CreateAlbum' ) )
            // InternalMyDsl.g:3482:1: ( 'CreateAlbum' )
            {
            // InternalMyDsl.g:3482:1: ( 'CreateAlbum' )
            // InternalMyDsl.g:3483:2: 'CreateAlbum'
            {
             before(grammarAccess.getAlbumManagementFunctionsAccess().getCreateAlbumKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMyDsl.g:3492:1: rule__AlbumManagementFunctions__Group__1 : rule__AlbumManagementFunctions__Group__1__Impl rule__AlbumManagementFunctions__Group__2 ;
    public final void rule__AlbumManagementFunctions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3496:1: ( rule__AlbumManagementFunctions__Group__1__Impl rule__AlbumManagementFunctions__Group__2 )
            // InternalMyDsl.g:3497:2: rule__AlbumManagementFunctions__Group__1__Impl rule__AlbumManagementFunctions__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:3504:1: rule__AlbumManagementFunctions__Group__1__Impl : ( ( rule__AlbumManagementFunctions__NameAssignment_1 ) ) ;
    public final void rule__AlbumManagementFunctions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3508:1: ( ( ( rule__AlbumManagementFunctions__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3509:1: ( ( rule__AlbumManagementFunctions__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3509:1: ( ( rule__AlbumManagementFunctions__NameAssignment_1 ) )
            // InternalMyDsl.g:3510:2: ( rule__AlbumManagementFunctions__NameAssignment_1 )
            {
             before(grammarAccess.getAlbumManagementFunctionsAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3511:2: ( rule__AlbumManagementFunctions__NameAssignment_1 )
            // InternalMyDsl.g:3511:3: rule__AlbumManagementFunctions__NameAssignment_1
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
    // InternalMyDsl.g:3519:1: rule__AlbumManagementFunctions__Group__2 : rule__AlbumManagementFunctions__Group__2__Impl rule__AlbumManagementFunctions__Group__3 ;
    public final void rule__AlbumManagementFunctions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3523:1: ( rule__AlbumManagementFunctions__Group__2__Impl rule__AlbumManagementFunctions__Group__3 )
            // InternalMyDsl.g:3524:2: rule__AlbumManagementFunctions__Group__2__Impl rule__AlbumManagementFunctions__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:3531:1: rule__AlbumManagementFunctions__Group__2__Impl : ( 'SelectAlbum' ) ;
    public final void rule__AlbumManagementFunctions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3535:1: ( ( 'SelectAlbum' ) )
            // InternalMyDsl.g:3536:1: ( 'SelectAlbum' )
            {
            // InternalMyDsl.g:3536:1: ( 'SelectAlbum' )
            // InternalMyDsl.g:3537:2: 'SelectAlbum'
            {
             before(grammarAccess.getAlbumManagementFunctionsAccess().getSelectAlbumKeyword_2()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMyDsl.g:3546:1: rule__AlbumManagementFunctions__Group__3 : rule__AlbumManagementFunctions__Group__3__Impl ;
    public final void rule__AlbumManagementFunctions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3550:1: ( rule__AlbumManagementFunctions__Group__3__Impl )
            // InternalMyDsl.g:3551:2: rule__AlbumManagementFunctions__Group__3__Impl
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
    // InternalMyDsl.g:3557:1: rule__AlbumManagementFunctions__Group__3__Impl : ( ( rule__AlbumManagementFunctions__NameAssignment_3 ) ) ;
    public final void rule__AlbumManagementFunctions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3561:1: ( ( ( rule__AlbumManagementFunctions__NameAssignment_3 ) ) )
            // InternalMyDsl.g:3562:1: ( ( rule__AlbumManagementFunctions__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:3562:1: ( ( rule__AlbumManagementFunctions__NameAssignment_3 ) )
            // InternalMyDsl.g:3563:2: ( rule__AlbumManagementFunctions__NameAssignment_3 )
            {
             before(grammarAccess.getAlbumManagementFunctionsAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:3564:2: ( rule__AlbumManagementFunctions__NameAssignment_3 )
            // InternalMyDsl.g:3564:3: rule__AlbumManagementFunctions__NameAssignment_3
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
    // InternalMyDsl.g:3573:1: rule__PhotoActions__Group__0 : rule__PhotoActions__Group__0__Impl rule__PhotoActions__Group__1 ;
    public final void rule__PhotoActions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3577:1: ( rule__PhotoActions__Group__0__Impl rule__PhotoActions__Group__1 )
            // InternalMyDsl.g:3578:2: rule__PhotoActions__Group__0__Impl rule__PhotoActions__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:3585:1: rule__PhotoActions__Group__0__Impl : ( 'PhotoActions' ) ;
    public final void rule__PhotoActions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3589:1: ( ( 'PhotoActions' ) )
            // InternalMyDsl.g:3590:1: ( 'PhotoActions' )
            {
            // InternalMyDsl.g:3590:1: ( 'PhotoActions' )
            // InternalMyDsl.g:3591:2: 'PhotoActions'
            {
             before(grammarAccess.getPhotoActionsAccess().getPhotoActionsKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyDsl.g:3600:1: rule__PhotoActions__Group__1 : rule__PhotoActions__Group__1__Impl rule__PhotoActions__Group__2 ;
    public final void rule__PhotoActions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3604:1: ( rule__PhotoActions__Group__1__Impl rule__PhotoActions__Group__2 )
            // InternalMyDsl.g:3605:2: rule__PhotoActions__Group__1__Impl rule__PhotoActions__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:3612:1: rule__PhotoActions__Group__1__Impl : ( ':' ) ;
    public final void rule__PhotoActions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3616:1: ( ( ':' ) )
            // InternalMyDsl.g:3617:1: ( ':' )
            {
            // InternalMyDsl.g:3617:1: ( ':' )
            // InternalMyDsl.g:3618:2: ':'
            {
             before(grammarAccess.getPhotoActionsAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:3627:1: rule__PhotoActions__Group__2 : rule__PhotoActions__Group__2__Impl ;
    public final void rule__PhotoActions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3631:1: ( rule__PhotoActions__Group__2__Impl )
            // InternalMyDsl.g:3632:2: rule__PhotoActions__Group__2__Impl
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
    // InternalMyDsl.g:3638:1: rule__PhotoActions__Group__2__Impl : ( ( rule__PhotoActions__ItemsAssignment_2 ) ) ;
    public final void rule__PhotoActions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3642:1: ( ( ( rule__PhotoActions__ItemsAssignment_2 ) ) )
            // InternalMyDsl.g:3643:1: ( ( rule__PhotoActions__ItemsAssignment_2 ) )
            {
            // InternalMyDsl.g:3643:1: ( ( rule__PhotoActions__ItemsAssignment_2 ) )
            // InternalMyDsl.g:3644:2: ( rule__PhotoActions__ItemsAssignment_2 )
            {
             before(grammarAccess.getPhotoActionsAccess().getItemsAssignment_2()); 
            // InternalMyDsl.g:3645:2: ( rule__PhotoActions__ItemsAssignment_2 )
            // InternalMyDsl.g:3645:3: rule__PhotoActions__ItemsAssignment_2
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
    // InternalMyDsl.g:3654:1: rule__PhotoActionsFunctions__Group__0 : rule__PhotoActionsFunctions__Group__0__Impl rule__PhotoActionsFunctions__Group__1 ;
    public final void rule__PhotoActionsFunctions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3658:1: ( rule__PhotoActionsFunctions__Group__0__Impl rule__PhotoActionsFunctions__Group__1 )
            // InternalMyDsl.g:3659:2: rule__PhotoActionsFunctions__Group__0__Impl rule__PhotoActionsFunctions__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:3666:1: rule__PhotoActionsFunctions__Group__0__Impl : ( 'ViewAllPhotos' ) ;
    public final void rule__PhotoActionsFunctions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3670:1: ( ( 'ViewAllPhotos' ) )
            // InternalMyDsl.g:3671:1: ( 'ViewAllPhotos' )
            {
            // InternalMyDsl.g:3671:1: ( 'ViewAllPhotos' )
            // InternalMyDsl.g:3672:2: 'ViewAllPhotos'
            {
             before(grammarAccess.getPhotoActionsFunctionsAccess().getViewAllPhotosKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMyDsl.g:3681:1: rule__PhotoActionsFunctions__Group__1 : rule__PhotoActionsFunctions__Group__1__Impl rule__PhotoActionsFunctions__Group__2 ;
    public final void rule__PhotoActionsFunctions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3685:1: ( rule__PhotoActionsFunctions__Group__1__Impl rule__PhotoActionsFunctions__Group__2 )
            // InternalMyDsl.g:3686:2: rule__PhotoActionsFunctions__Group__1__Impl rule__PhotoActionsFunctions__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:3693:1: rule__PhotoActionsFunctions__Group__1__Impl : ( ( rule__PhotoActionsFunctions__NameAssignment_1 ) ) ;
    public final void rule__PhotoActionsFunctions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3697:1: ( ( ( rule__PhotoActionsFunctions__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3698:1: ( ( rule__PhotoActionsFunctions__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3698:1: ( ( rule__PhotoActionsFunctions__NameAssignment_1 ) )
            // InternalMyDsl.g:3699:2: ( rule__PhotoActionsFunctions__NameAssignment_1 )
            {
             before(grammarAccess.getPhotoActionsFunctionsAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3700:2: ( rule__PhotoActionsFunctions__NameAssignment_1 )
            // InternalMyDsl.g:3700:3: rule__PhotoActionsFunctions__NameAssignment_1
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
    // InternalMyDsl.g:3708:1: rule__PhotoActionsFunctions__Group__2 : rule__PhotoActionsFunctions__Group__2__Impl rule__PhotoActionsFunctions__Group__3 ;
    public final void rule__PhotoActionsFunctions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3712:1: ( rule__PhotoActionsFunctions__Group__2__Impl rule__PhotoActionsFunctions__Group__3 )
            // InternalMyDsl.g:3713:2: rule__PhotoActionsFunctions__Group__2__Impl rule__PhotoActionsFunctions__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:3720:1: rule__PhotoActionsFunctions__Group__2__Impl : ( 'ViewExtendedPhoto' ) ;
    public final void rule__PhotoActionsFunctions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3724:1: ( ( 'ViewExtendedPhoto' ) )
            // InternalMyDsl.g:3725:1: ( 'ViewExtendedPhoto' )
            {
            // InternalMyDsl.g:3725:1: ( 'ViewExtendedPhoto' )
            // InternalMyDsl.g:3726:2: 'ViewExtendedPhoto'
            {
             before(grammarAccess.getPhotoActionsFunctionsAccess().getViewExtendedPhotoKeyword_2()); 
            match(input,53,FOLLOW_2); 
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
    // InternalMyDsl.g:3735:1: rule__PhotoActionsFunctions__Group__3 : rule__PhotoActionsFunctions__Group__3__Impl rule__PhotoActionsFunctions__Group__4 ;
    public final void rule__PhotoActionsFunctions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3739:1: ( rule__PhotoActionsFunctions__Group__3__Impl rule__PhotoActionsFunctions__Group__4 )
            // InternalMyDsl.g:3740:2: rule__PhotoActionsFunctions__Group__3__Impl rule__PhotoActionsFunctions__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:3747:1: rule__PhotoActionsFunctions__Group__3__Impl : ( ( rule__PhotoActionsFunctions__NameAssignment_3 ) ) ;
    public final void rule__PhotoActionsFunctions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3751:1: ( ( ( rule__PhotoActionsFunctions__NameAssignment_3 ) ) )
            // InternalMyDsl.g:3752:1: ( ( rule__PhotoActionsFunctions__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:3752:1: ( ( rule__PhotoActionsFunctions__NameAssignment_3 ) )
            // InternalMyDsl.g:3753:2: ( rule__PhotoActionsFunctions__NameAssignment_3 )
            {
             before(grammarAccess.getPhotoActionsFunctionsAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:3754:2: ( rule__PhotoActionsFunctions__NameAssignment_3 )
            // InternalMyDsl.g:3754:3: rule__PhotoActionsFunctions__NameAssignment_3
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
    // InternalMyDsl.g:3762:1: rule__PhotoActionsFunctions__Group__4 : rule__PhotoActionsFunctions__Group__4__Impl rule__PhotoActionsFunctions__Group__5 ;
    public final void rule__PhotoActionsFunctions__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3766:1: ( rule__PhotoActionsFunctions__Group__4__Impl rule__PhotoActionsFunctions__Group__5 )
            // InternalMyDsl.g:3767:2: rule__PhotoActionsFunctions__Group__4__Impl rule__PhotoActionsFunctions__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:3774:1: rule__PhotoActionsFunctions__Group__4__Impl : ( 'LoadPhoto' ) ;
    public final void rule__PhotoActionsFunctions__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3778:1: ( ( 'LoadPhoto' ) )
            // InternalMyDsl.g:3779:1: ( 'LoadPhoto' )
            {
            // InternalMyDsl.g:3779:1: ( 'LoadPhoto' )
            // InternalMyDsl.g:3780:2: 'LoadPhoto'
            {
             before(grammarAccess.getPhotoActionsFunctionsAccess().getLoadPhotoKeyword_4()); 
            match(input,54,FOLLOW_2); 
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
    // InternalMyDsl.g:3789:1: rule__PhotoActionsFunctions__Group__5 : rule__PhotoActionsFunctions__Group__5__Impl ;
    public final void rule__PhotoActionsFunctions__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3793:1: ( rule__PhotoActionsFunctions__Group__5__Impl )
            // InternalMyDsl.g:3794:2: rule__PhotoActionsFunctions__Group__5__Impl
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
    // InternalMyDsl.g:3800:1: rule__PhotoActionsFunctions__Group__5__Impl : ( ( rule__PhotoActionsFunctions__NameAssignment_5 ) ) ;
    public final void rule__PhotoActionsFunctions__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3804:1: ( ( ( rule__PhotoActionsFunctions__NameAssignment_5 ) ) )
            // InternalMyDsl.g:3805:1: ( ( rule__PhotoActionsFunctions__NameAssignment_5 ) )
            {
            // InternalMyDsl.g:3805:1: ( ( rule__PhotoActionsFunctions__NameAssignment_5 ) )
            // InternalMyDsl.g:3806:2: ( rule__PhotoActionsFunctions__NameAssignment_5 )
            {
             before(grammarAccess.getPhotoActionsFunctionsAccess().getNameAssignment_5()); 
            // InternalMyDsl.g:3807:2: ( rule__PhotoActionsFunctions__NameAssignment_5 )
            // InternalMyDsl.g:3807:3: rule__PhotoActionsFunctions__NameAssignment_5
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
    // InternalMyDsl.g:3816:1: rule__LandingActions__Group__0 : rule__LandingActions__Group__0__Impl rule__LandingActions__Group__1 ;
    public final void rule__LandingActions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3820:1: ( rule__LandingActions__Group__0__Impl rule__LandingActions__Group__1 )
            // InternalMyDsl.g:3821:2: rule__LandingActions__Group__0__Impl rule__LandingActions__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:3828:1: rule__LandingActions__Group__0__Impl : ( 'LandingActions' ) ;
    public final void rule__LandingActions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3832:1: ( ( 'LandingActions' ) )
            // InternalMyDsl.g:3833:1: ( 'LandingActions' )
            {
            // InternalMyDsl.g:3833:1: ( 'LandingActions' )
            // InternalMyDsl.g:3834:2: 'LandingActions'
            {
             before(grammarAccess.getLandingActionsAccess().getLandingActionsKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalMyDsl.g:3843:1: rule__LandingActions__Group__1 : rule__LandingActions__Group__1__Impl rule__LandingActions__Group__2 ;
    public final void rule__LandingActions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3847:1: ( rule__LandingActions__Group__1__Impl rule__LandingActions__Group__2 )
            // InternalMyDsl.g:3848:2: rule__LandingActions__Group__1__Impl rule__LandingActions__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyDsl.g:3855:1: rule__LandingActions__Group__1__Impl : ( ':' ) ;
    public final void rule__LandingActions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3859:1: ( ( ':' ) )
            // InternalMyDsl.g:3860:1: ( ':' )
            {
            // InternalMyDsl.g:3860:1: ( ':' )
            // InternalMyDsl.g:3861:2: ':'
            {
             before(grammarAccess.getLandingActionsAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:3870:1: rule__LandingActions__Group__2 : rule__LandingActions__Group__2__Impl ;
    public final void rule__LandingActions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3874:1: ( rule__LandingActions__Group__2__Impl )
            // InternalMyDsl.g:3875:2: rule__LandingActions__Group__2__Impl
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
    // InternalMyDsl.g:3881:1: rule__LandingActions__Group__2__Impl : ( ( rule__LandingActions__ItemsAssignment_2 ) ) ;
    public final void rule__LandingActions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3885:1: ( ( ( rule__LandingActions__ItemsAssignment_2 ) ) )
            // InternalMyDsl.g:3886:1: ( ( rule__LandingActions__ItemsAssignment_2 ) )
            {
            // InternalMyDsl.g:3886:1: ( ( rule__LandingActions__ItemsAssignment_2 ) )
            // InternalMyDsl.g:3887:2: ( rule__LandingActions__ItemsAssignment_2 )
            {
             before(grammarAccess.getLandingActionsAccess().getItemsAssignment_2()); 
            // InternalMyDsl.g:3888:2: ( rule__LandingActions__ItemsAssignment_2 )
            // InternalMyDsl.g:3888:3: rule__LandingActions__ItemsAssignment_2
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
    // InternalMyDsl.g:3897:1: rule__LandingFunctions__Group__0 : rule__LandingFunctions__Group__0__Impl rule__LandingFunctions__Group__1 ;
    public final void rule__LandingFunctions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3901:1: ( rule__LandingFunctions__Group__0__Impl rule__LandingFunctions__Group__1 )
            // InternalMyDsl.g:3902:2: rule__LandingFunctions__Group__0__Impl rule__LandingFunctions__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:3909:1: rule__LandingFunctions__Group__0__Impl : ( 'ViewCarousel' ) ;
    public final void rule__LandingFunctions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3913:1: ( ( 'ViewCarousel' ) )
            // InternalMyDsl.g:3914:1: ( 'ViewCarousel' )
            {
            // InternalMyDsl.g:3914:1: ( 'ViewCarousel' )
            // InternalMyDsl.g:3915:2: 'ViewCarousel'
            {
             before(grammarAccess.getLandingFunctionsAccess().getViewCarouselKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalMyDsl.g:3924:1: rule__LandingFunctions__Group__1 : rule__LandingFunctions__Group__1__Impl rule__LandingFunctions__Group__2 ;
    public final void rule__LandingFunctions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3928:1: ( rule__LandingFunctions__Group__1__Impl rule__LandingFunctions__Group__2 )
            // InternalMyDsl.g:3929:2: rule__LandingFunctions__Group__1__Impl rule__LandingFunctions__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:3936:1: rule__LandingFunctions__Group__1__Impl : ( ( rule__LandingFunctions__NameAssignment_1 ) ) ;
    public final void rule__LandingFunctions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3940:1: ( ( ( rule__LandingFunctions__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3941:1: ( ( rule__LandingFunctions__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3941:1: ( ( rule__LandingFunctions__NameAssignment_1 ) )
            // InternalMyDsl.g:3942:2: ( rule__LandingFunctions__NameAssignment_1 )
            {
             before(grammarAccess.getLandingFunctionsAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3943:2: ( rule__LandingFunctions__NameAssignment_1 )
            // InternalMyDsl.g:3943:3: rule__LandingFunctions__NameAssignment_1
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
    // InternalMyDsl.g:3951:1: rule__LandingFunctions__Group__2 : rule__LandingFunctions__Group__2__Impl rule__LandingFunctions__Group__3 ;
    public final void rule__LandingFunctions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3955:1: ( rule__LandingFunctions__Group__2__Impl rule__LandingFunctions__Group__3 )
            // InternalMyDsl.g:3956:2: rule__LandingFunctions__Group__2__Impl rule__LandingFunctions__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:3963:1: rule__LandingFunctions__Group__2__Impl : ( 'PassPhoto' ) ;
    public final void rule__LandingFunctions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3967:1: ( ( 'PassPhoto' ) )
            // InternalMyDsl.g:3968:1: ( 'PassPhoto' )
            {
            // InternalMyDsl.g:3968:1: ( 'PassPhoto' )
            // InternalMyDsl.g:3969:2: 'PassPhoto'
            {
             before(grammarAccess.getLandingFunctionsAccess().getPassPhotoKeyword_2()); 
            match(input,57,FOLLOW_2); 
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
    // InternalMyDsl.g:3978:1: rule__LandingFunctions__Group__3 : rule__LandingFunctions__Group__3__Impl ;
    public final void rule__LandingFunctions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3982:1: ( rule__LandingFunctions__Group__3__Impl )
            // InternalMyDsl.g:3983:2: rule__LandingFunctions__Group__3__Impl
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
    // InternalMyDsl.g:3989:1: rule__LandingFunctions__Group__3__Impl : ( ( rule__LandingFunctions__NameAssignment_3 ) ) ;
    public final void rule__LandingFunctions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3993:1: ( ( ( rule__LandingFunctions__NameAssignment_3 ) ) )
            // InternalMyDsl.g:3994:1: ( ( rule__LandingFunctions__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:3994:1: ( ( rule__LandingFunctions__NameAssignment_3 ) )
            // InternalMyDsl.g:3995:2: ( rule__LandingFunctions__NameAssignment_3 )
            {
             before(grammarAccess.getLandingFunctionsAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:3996:2: ( rule__LandingFunctions__NameAssignment_3 )
            // InternalMyDsl.g:3996:3: rule__LandingFunctions__NameAssignment_3
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
    // InternalMyDsl.g:4005:1: rule__DomainConnection__Group__0 : rule__DomainConnection__Group__0__Impl rule__DomainConnection__Group__1 ;
    public final void rule__DomainConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4009:1: ( rule__DomainConnection__Group__0__Impl rule__DomainConnection__Group__1 )
            // InternalMyDsl.g:4010:2: rule__DomainConnection__Group__0__Impl rule__DomainConnection__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:4017:1: rule__DomainConnection__Group__0__Impl : ( 'DomainRelations' ) ;
    public final void rule__DomainConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4021:1: ( ( 'DomainRelations' ) )
            // InternalMyDsl.g:4022:1: ( 'DomainRelations' )
            {
            // InternalMyDsl.g:4022:1: ( 'DomainRelations' )
            // InternalMyDsl.g:4023:2: 'DomainRelations'
            {
             before(grammarAccess.getDomainConnectionAccess().getDomainRelationsKeyword_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalMyDsl.g:4032:1: rule__DomainConnection__Group__1 : rule__DomainConnection__Group__1__Impl rule__DomainConnection__Group__2 ;
    public final void rule__DomainConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4036:1: ( rule__DomainConnection__Group__1__Impl rule__DomainConnection__Group__2 )
            // InternalMyDsl.g:4037:2: rule__DomainConnection__Group__1__Impl rule__DomainConnection__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:4044:1: rule__DomainConnection__Group__1__Impl : ( ':' ) ;
    public final void rule__DomainConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4048:1: ( ( ':' ) )
            // InternalMyDsl.g:4049:1: ( ':' )
            {
            // InternalMyDsl.g:4049:1: ( ':' )
            // InternalMyDsl.g:4050:2: ':'
            {
             before(grammarAccess.getDomainConnectionAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:4059:1: rule__DomainConnection__Group__2 : rule__DomainConnection__Group__2__Impl rule__DomainConnection__Group__3 ;
    public final void rule__DomainConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4063:1: ( rule__DomainConnection__Group__2__Impl rule__DomainConnection__Group__3 )
            // InternalMyDsl.g:4064:2: rule__DomainConnection__Group__2__Impl rule__DomainConnection__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:4071:1: rule__DomainConnection__Group__2__Impl : ( '{' ) ;
    public final void rule__DomainConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4075:1: ( ( '{' ) )
            // InternalMyDsl.g:4076:1: ( '{' )
            {
            // InternalMyDsl.g:4076:1: ( '{' )
            // InternalMyDsl.g:4077:2: '{'
            {
             before(grammarAccess.getDomainConnectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:4086:1: rule__DomainConnection__Group__3 : rule__DomainConnection__Group__3__Impl rule__DomainConnection__Group__4 ;
    public final void rule__DomainConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4090:1: ( rule__DomainConnection__Group__3__Impl rule__DomainConnection__Group__4 )
            // InternalMyDsl.g:4091:2: rule__DomainConnection__Group__3__Impl rule__DomainConnection__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:4098:1: rule__DomainConnection__Group__3__Impl : ( ( rule__DomainConnection__ElementsAssignment_3 ) ) ;
    public final void rule__DomainConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4102:1: ( ( ( rule__DomainConnection__ElementsAssignment_3 ) ) )
            // InternalMyDsl.g:4103:1: ( ( rule__DomainConnection__ElementsAssignment_3 ) )
            {
            // InternalMyDsl.g:4103:1: ( ( rule__DomainConnection__ElementsAssignment_3 ) )
            // InternalMyDsl.g:4104:2: ( rule__DomainConnection__ElementsAssignment_3 )
            {
             before(grammarAccess.getDomainConnectionAccess().getElementsAssignment_3()); 
            // InternalMyDsl.g:4105:2: ( rule__DomainConnection__ElementsAssignment_3 )
            // InternalMyDsl.g:4105:3: rule__DomainConnection__ElementsAssignment_3
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
    // InternalMyDsl.g:4113:1: rule__DomainConnection__Group__4 : rule__DomainConnection__Group__4__Impl ;
    public final void rule__DomainConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4117:1: ( rule__DomainConnection__Group__4__Impl )
            // InternalMyDsl.g:4118:2: rule__DomainConnection__Group__4__Impl
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
    // InternalMyDsl.g:4124:1: rule__DomainConnection__Group__4__Impl : ( '}' ) ;
    public final void rule__DomainConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4128:1: ( ( '}' ) )
            // InternalMyDsl.g:4129:1: ( '}' )
            {
            // InternalMyDsl.g:4129:1: ( '}' )
            // InternalMyDsl.g:4130:2: '}'
            {
             before(grammarAccess.getDomainConnectionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:4140:1: rule__DomainRelations__Group__0 : rule__DomainRelations__Group__0__Impl rule__DomainRelations__Group__1 ;
    public final void rule__DomainRelations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4144:1: ( rule__DomainRelations__Group__0__Impl rule__DomainRelations__Group__1 )
            // InternalMyDsl.g:4145:2: rule__DomainRelations__Group__0__Impl rule__DomainRelations__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:4152:1: rule__DomainRelations__Group__0__Impl : ( ( rule__DomainRelations__ElementsAssignment_0 ) ) ;
    public final void rule__DomainRelations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4156:1: ( ( ( rule__DomainRelations__ElementsAssignment_0 ) ) )
            // InternalMyDsl.g:4157:1: ( ( rule__DomainRelations__ElementsAssignment_0 ) )
            {
            // InternalMyDsl.g:4157:1: ( ( rule__DomainRelations__ElementsAssignment_0 ) )
            // InternalMyDsl.g:4158:2: ( rule__DomainRelations__ElementsAssignment_0 )
            {
             before(grammarAccess.getDomainRelationsAccess().getElementsAssignment_0()); 
            // InternalMyDsl.g:4159:2: ( rule__DomainRelations__ElementsAssignment_0 )
            // InternalMyDsl.g:4159:3: rule__DomainRelations__ElementsAssignment_0
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
    // InternalMyDsl.g:4167:1: rule__DomainRelations__Group__1 : rule__DomainRelations__Group__1__Impl rule__DomainRelations__Group__2 ;
    public final void rule__DomainRelations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4171:1: ( rule__DomainRelations__Group__1__Impl rule__DomainRelations__Group__2 )
            // InternalMyDsl.g:4172:2: rule__DomainRelations__Group__1__Impl rule__DomainRelations__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:4179:1: rule__DomainRelations__Group__1__Impl : ( ( rule__DomainRelations__NameAssignment_1 ) ) ;
    public final void rule__DomainRelations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4183:1: ( ( ( rule__DomainRelations__NameAssignment_1 ) ) )
            // InternalMyDsl.g:4184:1: ( ( rule__DomainRelations__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:4184:1: ( ( rule__DomainRelations__NameAssignment_1 ) )
            // InternalMyDsl.g:4185:2: ( rule__DomainRelations__NameAssignment_1 )
            {
             before(grammarAccess.getDomainRelationsAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4186:2: ( rule__DomainRelations__NameAssignment_1 )
            // InternalMyDsl.g:4186:3: rule__DomainRelations__NameAssignment_1
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
    // InternalMyDsl.g:4194:1: rule__DomainRelations__Group__2 : rule__DomainRelations__Group__2__Impl rule__DomainRelations__Group__3 ;
    public final void rule__DomainRelations__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4198:1: ( rule__DomainRelations__Group__2__Impl rule__DomainRelations__Group__3 )
            // InternalMyDsl.g:4199:2: rule__DomainRelations__Group__2__Impl rule__DomainRelations__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:4206:1: rule__DomainRelations__Group__2__Impl : ( ':' ) ;
    public final void rule__DomainRelations__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4210:1: ( ( ':' ) )
            // InternalMyDsl.g:4211:1: ( ':' )
            {
            // InternalMyDsl.g:4211:1: ( ':' )
            // InternalMyDsl.g:4212:2: ':'
            {
             before(grammarAccess.getDomainRelationsAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:4221:1: rule__DomainRelations__Group__3 : rule__DomainRelations__Group__3__Impl rule__DomainRelations__Group__4 ;
    public final void rule__DomainRelations__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4225:1: ( rule__DomainRelations__Group__3__Impl rule__DomainRelations__Group__4 )
            // InternalMyDsl.g:4226:2: rule__DomainRelations__Group__3__Impl rule__DomainRelations__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:4233:1: rule__DomainRelations__Group__3__Impl : ( '{' ) ;
    public final void rule__DomainRelations__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4237:1: ( ( '{' ) )
            // InternalMyDsl.g:4238:1: ( '{' )
            {
            // InternalMyDsl.g:4238:1: ( '{' )
            // InternalMyDsl.g:4239:2: '{'
            {
             before(grammarAccess.getDomainRelationsAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:4248:1: rule__DomainRelations__Group__4 : rule__DomainRelations__Group__4__Impl rule__DomainRelations__Group__5 ;
    public final void rule__DomainRelations__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4252:1: ( rule__DomainRelations__Group__4__Impl rule__DomainRelations__Group__5 )
            // InternalMyDsl.g:4253:2: rule__DomainRelations__Group__4__Impl rule__DomainRelations__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:4260:1: rule__DomainRelations__Group__4__Impl : ( ( rule__DomainRelations__ElementsAssignment_4 ) ) ;
    public final void rule__DomainRelations__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4264:1: ( ( ( rule__DomainRelations__ElementsAssignment_4 ) ) )
            // InternalMyDsl.g:4265:1: ( ( rule__DomainRelations__ElementsAssignment_4 ) )
            {
            // InternalMyDsl.g:4265:1: ( ( rule__DomainRelations__ElementsAssignment_4 ) )
            // InternalMyDsl.g:4266:2: ( rule__DomainRelations__ElementsAssignment_4 )
            {
             before(grammarAccess.getDomainRelationsAccess().getElementsAssignment_4()); 
            // InternalMyDsl.g:4267:2: ( rule__DomainRelations__ElementsAssignment_4 )
            // InternalMyDsl.g:4267:3: rule__DomainRelations__ElementsAssignment_4
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
    // InternalMyDsl.g:4275:1: rule__DomainRelations__Group__5 : rule__DomainRelations__Group__5__Impl rule__DomainRelations__Group__6 ;
    public final void rule__DomainRelations__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4279:1: ( rule__DomainRelations__Group__5__Impl rule__DomainRelations__Group__6 )
            // InternalMyDsl.g:4280:2: rule__DomainRelations__Group__5__Impl rule__DomainRelations__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:4287:1: rule__DomainRelations__Group__5__Impl : ( '}' ) ;
    public final void rule__DomainRelations__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4291:1: ( ( '}' ) )
            // InternalMyDsl.g:4292:1: ( '}' )
            {
            // InternalMyDsl.g:4292:1: ( '}' )
            // InternalMyDsl.g:4293:2: '}'
            {
             before(grammarAccess.getDomainRelationsAccess().getRightCurlyBracketKeyword_5()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:4302:1: rule__DomainRelations__Group__6 : rule__DomainRelations__Group__6__Impl rule__DomainRelations__Group__7 ;
    public final void rule__DomainRelations__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4306:1: ( rule__DomainRelations__Group__6__Impl rule__DomainRelations__Group__7 )
            // InternalMyDsl.g:4307:2: rule__DomainRelations__Group__6__Impl rule__DomainRelations__Group__7
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:4314:1: rule__DomainRelations__Group__6__Impl : ( ( rule__DomainRelations__ElementsAssignment_6 ) ) ;
    public final void rule__DomainRelations__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4318:1: ( ( ( rule__DomainRelations__ElementsAssignment_6 ) ) )
            // InternalMyDsl.g:4319:1: ( ( rule__DomainRelations__ElementsAssignment_6 ) )
            {
            // InternalMyDsl.g:4319:1: ( ( rule__DomainRelations__ElementsAssignment_6 ) )
            // InternalMyDsl.g:4320:2: ( rule__DomainRelations__ElementsAssignment_6 )
            {
             before(grammarAccess.getDomainRelationsAccess().getElementsAssignment_6()); 
            // InternalMyDsl.g:4321:2: ( rule__DomainRelations__ElementsAssignment_6 )
            // InternalMyDsl.g:4321:3: rule__DomainRelations__ElementsAssignment_6
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
    // InternalMyDsl.g:4329:1: rule__DomainRelations__Group__7 : rule__DomainRelations__Group__7__Impl rule__DomainRelations__Group__8 ;
    public final void rule__DomainRelations__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4333:1: ( rule__DomainRelations__Group__7__Impl rule__DomainRelations__Group__8 )
            // InternalMyDsl.g:4334:2: rule__DomainRelations__Group__7__Impl rule__DomainRelations__Group__8
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:4341:1: rule__DomainRelations__Group__7__Impl : ( ( rule__DomainRelations__NameAssignment_7 ) ) ;
    public final void rule__DomainRelations__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4345:1: ( ( ( rule__DomainRelations__NameAssignment_7 ) ) )
            // InternalMyDsl.g:4346:1: ( ( rule__DomainRelations__NameAssignment_7 ) )
            {
            // InternalMyDsl.g:4346:1: ( ( rule__DomainRelations__NameAssignment_7 ) )
            // InternalMyDsl.g:4347:2: ( rule__DomainRelations__NameAssignment_7 )
            {
             before(grammarAccess.getDomainRelationsAccess().getNameAssignment_7()); 
            // InternalMyDsl.g:4348:2: ( rule__DomainRelations__NameAssignment_7 )
            // InternalMyDsl.g:4348:3: rule__DomainRelations__NameAssignment_7
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
    // InternalMyDsl.g:4356:1: rule__DomainRelations__Group__8 : rule__DomainRelations__Group__8__Impl rule__DomainRelations__Group__9 ;
    public final void rule__DomainRelations__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4360:1: ( rule__DomainRelations__Group__8__Impl rule__DomainRelations__Group__9 )
            // InternalMyDsl.g:4361:2: rule__DomainRelations__Group__8__Impl rule__DomainRelations__Group__9
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:4368:1: rule__DomainRelations__Group__8__Impl : ( ':' ) ;
    public final void rule__DomainRelations__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4372:1: ( ( ':' ) )
            // InternalMyDsl.g:4373:1: ( ':' )
            {
            // InternalMyDsl.g:4373:1: ( ':' )
            // InternalMyDsl.g:4374:2: ':'
            {
             before(grammarAccess.getDomainRelationsAccess().getColonKeyword_8()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:4383:1: rule__DomainRelations__Group__9 : rule__DomainRelations__Group__9__Impl rule__DomainRelations__Group__10 ;
    public final void rule__DomainRelations__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4387:1: ( rule__DomainRelations__Group__9__Impl rule__DomainRelations__Group__10 )
            // InternalMyDsl.g:4388:2: rule__DomainRelations__Group__9__Impl rule__DomainRelations__Group__10
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:4395:1: rule__DomainRelations__Group__9__Impl : ( '{' ) ;
    public final void rule__DomainRelations__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4399:1: ( ( '{' ) )
            // InternalMyDsl.g:4400:1: ( '{' )
            {
            // InternalMyDsl.g:4400:1: ( '{' )
            // InternalMyDsl.g:4401:2: '{'
            {
             before(grammarAccess.getDomainRelationsAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:4410:1: rule__DomainRelations__Group__10 : rule__DomainRelations__Group__10__Impl rule__DomainRelations__Group__11 ;
    public final void rule__DomainRelations__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4414:1: ( rule__DomainRelations__Group__10__Impl rule__DomainRelations__Group__11 )
            // InternalMyDsl.g:4415:2: rule__DomainRelations__Group__10__Impl rule__DomainRelations__Group__11
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:4422:1: rule__DomainRelations__Group__10__Impl : ( ( rule__DomainRelations__ElementsAssignment_10 ) ) ;
    public final void rule__DomainRelations__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4426:1: ( ( ( rule__DomainRelations__ElementsAssignment_10 ) ) )
            // InternalMyDsl.g:4427:1: ( ( rule__DomainRelations__ElementsAssignment_10 ) )
            {
            // InternalMyDsl.g:4427:1: ( ( rule__DomainRelations__ElementsAssignment_10 ) )
            // InternalMyDsl.g:4428:2: ( rule__DomainRelations__ElementsAssignment_10 )
            {
             before(grammarAccess.getDomainRelationsAccess().getElementsAssignment_10()); 
            // InternalMyDsl.g:4429:2: ( rule__DomainRelations__ElementsAssignment_10 )
            // InternalMyDsl.g:4429:3: rule__DomainRelations__ElementsAssignment_10
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
    // InternalMyDsl.g:4437:1: rule__DomainRelations__Group__11 : rule__DomainRelations__Group__11__Impl rule__DomainRelations__Group__12 ;
    public final void rule__DomainRelations__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4441:1: ( rule__DomainRelations__Group__11__Impl rule__DomainRelations__Group__12 )
            // InternalMyDsl.g:4442:2: rule__DomainRelations__Group__11__Impl rule__DomainRelations__Group__12
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:4449:1: rule__DomainRelations__Group__11__Impl : ( '}' ) ;
    public final void rule__DomainRelations__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4453:1: ( ( '}' ) )
            // InternalMyDsl.g:4454:1: ( '}' )
            {
            // InternalMyDsl.g:4454:1: ( '}' )
            // InternalMyDsl.g:4455:2: '}'
            {
             before(grammarAccess.getDomainRelationsAccess().getRightCurlyBracketKeyword_11()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:4464:1: rule__DomainRelations__Group__12 : rule__DomainRelations__Group__12__Impl rule__DomainRelations__Group__13 ;
    public final void rule__DomainRelations__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4468:1: ( rule__DomainRelations__Group__12__Impl rule__DomainRelations__Group__13 )
            // InternalMyDsl.g:4469:2: rule__DomainRelations__Group__12__Impl rule__DomainRelations__Group__13
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:4476:1: rule__DomainRelations__Group__12__Impl : ( ( rule__DomainRelations__ElementsAssignment_12 ) ) ;
    public final void rule__DomainRelations__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4480:1: ( ( ( rule__DomainRelations__ElementsAssignment_12 ) ) )
            // InternalMyDsl.g:4481:1: ( ( rule__DomainRelations__ElementsAssignment_12 ) )
            {
            // InternalMyDsl.g:4481:1: ( ( rule__DomainRelations__ElementsAssignment_12 ) )
            // InternalMyDsl.g:4482:2: ( rule__DomainRelations__ElementsAssignment_12 )
            {
             before(grammarAccess.getDomainRelationsAccess().getElementsAssignment_12()); 
            // InternalMyDsl.g:4483:2: ( rule__DomainRelations__ElementsAssignment_12 )
            // InternalMyDsl.g:4483:3: rule__DomainRelations__ElementsAssignment_12
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
    // InternalMyDsl.g:4491:1: rule__DomainRelations__Group__13 : rule__DomainRelations__Group__13__Impl rule__DomainRelations__Group__14 ;
    public final void rule__DomainRelations__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4495:1: ( rule__DomainRelations__Group__13__Impl rule__DomainRelations__Group__14 )
            // InternalMyDsl.g:4496:2: rule__DomainRelations__Group__13__Impl rule__DomainRelations__Group__14
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:4503:1: rule__DomainRelations__Group__13__Impl : ( ( rule__DomainRelations__NameAssignment_13 ) ) ;
    public final void rule__DomainRelations__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4507:1: ( ( ( rule__DomainRelations__NameAssignment_13 ) ) )
            // InternalMyDsl.g:4508:1: ( ( rule__DomainRelations__NameAssignment_13 ) )
            {
            // InternalMyDsl.g:4508:1: ( ( rule__DomainRelations__NameAssignment_13 ) )
            // InternalMyDsl.g:4509:2: ( rule__DomainRelations__NameAssignment_13 )
            {
             before(grammarAccess.getDomainRelationsAccess().getNameAssignment_13()); 
            // InternalMyDsl.g:4510:2: ( rule__DomainRelations__NameAssignment_13 )
            // InternalMyDsl.g:4510:3: rule__DomainRelations__NameAssignment_13
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
    // InternalMyDsl.g:4518:1: rule__DomainRelations__Group__14 : rule__DomainRelations__Group__14__Impl rule__DomainRelations__Group__15 ;
    public final void rule__DomainRelations__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4522:1: ( rule__DomainRelations__Group__14__Impl rule__DomainRelations__Group__15 )
            // InternalMyDsl.g:4523:2: rule__DomainRelations__Group__14__Impl rule__DomainRelations__Group__15
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:4530:1: rule__DomainRelations__Group__14__Impl : ( ':' ) ;
    public final void rule__DomainRelations__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4534:1: ( ( ':' ) )
            // InternalMyDsl.g:4535:1: ( ':' )
            {
            // InternalMyDsl.g:4535:1: ( ':' )
            // InternalMyDsl.g:4536:2: ':'
            {
             before(grammarAccess.getDomainRelationsAccess().getColonKeyword_14()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:4545:1: rule__DomainRelations__Group__15 : rule__DomainRelations__Group__15__Impl rule__DomainRelations__Group__16 ;
    public final void rule__DomainRelations__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4549:1: ( rule__DomainRelations__Group__15__Impl rule__DomainRelations__Group__16 )
            // InternalMyDsl.g:4550:2: rule__DomainRelations__Group__15__Impl rule__DomainRelations__Group__16
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:4557:1: rule__DomainRelations__Group__15__Impl : ( '{' ) ;
    public final void rule__DomainRelations__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4561:1: ( ( '{' ) )
            // InternalMyDsl.g:4562:1: ( '{' )
            {
            // InternalMyDsl.g:4562:1: ( '{' )
            // InternalMyDsl.g:4563:2: '{'
            {
             before(grammarAccess.getDomainRelationsAccess().getLeftCurlyBracketKeyword_15()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:4572:1: rule__DomainRelations__Group__16 : rule__DomainRelations__Group__16__Impl rule__DomainRelations__Group__17 ;
    public final void rule__DomainRelations__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4576:1: ( rule__DomainRelations__Group__16__Impl rule__DomainRelations__Group__17 )
            // InternalMyDsl.g:4577:2: rule__DomainRelations__Group__16__Impl rule__DomainRelations__Group__17
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:4584:1: rule__DomainRelations__Group__16__Impl : ( ( rule__DomainRelations__ElementsAssignment_16 ) ) ;
    public final void rule__DomainRelations__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4588:1: ( ( ( rule__DomainRelations__ElementsAssignment_16 ) ) )
            // InternalMyDsl.g:4589:1: ( ( rule__DomainRelations__ElementsAssignment_16 ) )
            {
            // InternalMyDsl.g:4589:1: ( ( rule__DomainRelations__ElementsAssignment_16 ) )
            // InternalMyDsl.g:4590:2: ( rule__DomainRelations__ElementsAssignment_16 )
            {
             before(grammarAccess.getDomainRelationsAccess().getElementsAssignment_16()); 
            // InternalMyDsl.g:4591:2: ( rule__DomainRelations__ElementsAssignment_16 )
            // InternalMyDsl.g:4591:3: rule__DomainRelations__ElementsAssignment_16
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
    // InternalMyDsl.g:4599:1: rule__DomainRelations__Group__17 : rule__DomainRelations__Group__17__Impl rule__DomainRelations__Group__18 ;
    public final void rule__DomainRelations__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4603:1: ( rule__DomainRelations__Group__17__Impl rule__DomainRelations__Group__18 )
            // InternalMyDsl.g:4604:2: rule__DomainRelations__Group__17__Impl rule__DomainRelations__Group__18
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:4611:1: rule__DomainRelations__Group__17__Impl : ( '}' ) ;
    public final void rule__DomainRelations__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4615:1: ( ( '}' ) )
            // InternalMyDsl.g:4616:1: ( '}' )
            {
            // InternalMyDsl.g:4616:1: ( '}' )
            // InternalMyDsl.g:4617:2: '}'
            {
             before(grammarAccess.getDomainRelationsAccess().getRightCurlyBracketKeyword_17()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:4626:1: rule__DomainRelations__Group__18 : rule__DomainRelations__Group__18__Impl rule__DomainRelations__Group__19 ;
    public final void rule__DomainRelations__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4630:1: ( rule__DomainRelations__Group__18__Impl rule__DomainRelations__Group__19 )
            // InternalMyDsl.g:4631:2: rule__DomainRelations__Group__18__Impl rule__DomainRelations__Group__19
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:4638:1: rule__DomainRelations__Group__18__Impl : ( ( rule__DomainRelations__ElementsAssignment_18 ) ) ;
    public final void rule__DomainRelations__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4642:1: ( ( ( rule__DomainRelations__ElementsAssignment_18 ) ) )
            // InternalMyDsl.g:4643:1: ( ( rule__DomainRelations__ElementsAssignment_18 ) )
            {
            // InternalMyDsl.g:4643:1: ( ( rule__DomainRelations__ElementsAssignment_18 ) )
            // InternalMyDsl.g:4644:2: ( rule__DomainRelations__ElementsAssignment_18 )
            {
             before(grammarAccess.getDomainRelationsAccess().getElementsAssignment_18()); 
            // InternalMyDsl.g:4645:2: ( rule__DomainRelations__ElementsAssignment_18 )
            // InternalMyDsl.g:4645:3: rule__DomainRelations__ElementsAssignment_18
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
    // InternalMyDsl.g:4653:1: rule__DomainRelations__Group__19 : rule__DomainRelations__Group__19__Impl rule__DomainRelations__Group__20 ;
    public final void rule__DomainRelations__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4657:1: ( rule__DomainRelations__Group__19__Impl rule__DomainRelations__Group__20 )
            // InternalMyDsl.g:4658:2: rule__DomainRelations__Group__19__Impl rule__DomainRelations__Group__20
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:4665:1: rule__DomainRelations__Group__19__Impl : ( ( rule__DomainRelations__NameAssignment_19 ) ) ;
    public final void rule__DomainRelations__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4669:1: ( ( ( rule__DomainRelations__NameAssignment_19 ) ) )
            // InternalMyDsl.g:4670:1: ( ( rule__DomainRelations__NameAssignment_19 ) )
            {
            // InternalMyDsl.g:4670:1: ( ( rule__DomainRelations__NameAssignment_19 ) )
            // InternalMyDsl.g:4671:2: ( rule__DomainRelations__NameAssignment_19 )
            {
             before(grammarAccess.getDomainRelationsAccess().getNameAssignment_19()); 
            // InternalMyDsl.g:4672:2: ( rule__DomainRelations__NameAssignment_19 )
            // InternalMyDsl.g:4672:3: rule__DomainRelations__NameAssignment_19
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
    // InternalMyDsl.g:4680:1: rule__DomainRelations__Group__20 : rule__DomainRelations__Group__20__Impl rule__DomainRelations__Group__21 ;
    public final void rule__DomainRelations__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4684:1: ( rule__DomainRelations__Group__20__Impl rule__DomainRelations__Group__21 )
            // InternalMyDsl.g:4685:2: rule__DomainRelations__Group__20__Impl rule__DomainRelations__Group__21
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:4692:1: rule__DomainRelations__Group__20__Impl : ( ':' ) ;
    public final void rule__DomainRelations__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4696:1: ( ( ':' ) )
            // InternalMyDsl.g:4697:1: ( ':' )
            {
            // InternalMyDsl.g:4697:1: ( ':' )
            // InternalMyDsl.g:4698:2: ':'
            {
             before(grammarAccess.getDomainRelationsAccess().getColonKeyword_20()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:4707:1: rule__DomainRelations__Group__21 : rule__DomainRelations__Group__21__Impl rule__DomainRelations__Group__22 ;
    public final void rule__DomainRelations__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4711:1: ( rule__DomainRelations__Group__21__Impl rule__DomainRelations__Group__22 )
            // InternalMyDsl.g:4712:2: rule__DomainRelations__Group__21__Impl rule__DomainRelations__Group__22
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:4719:1: rule__DomainRelations__Group__21__Impl : ( '{' ) ;
    public final void rule__DomainRelations__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4723:1: ( ( '{' ) )
            // InternalMyDsl.g:4724:1: ( '{' )
            {
            // InternalMyDsl.g:4724:1: ( '{' )
            // InternalMyDsl.g:4725:2: '{'
            {
             before(grammarAccess.getDomainRelationsAccess().getLeftCurlyBracketKeyword_21()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:4734:1: rule__DomainRelations__Group__22 : rule__DomainRelations__Group__22__Impl rule__DomainRelations__Group__23 ;
    public final void rule__DomainRelations__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4738:1: ( rule__DomainRelations__Group__22__Impl rule__DomainRelations__Group__23 )
            // InternalMyDsl.g:4739:2: rule__DomainRelations__Group__22__Impl rule__DomainRelations__Group__23
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:4746:1: rule__DomainRelations__Group__22__Impl : ( ( rule__DomainRelations__ElementsAssignment_22 ) ) ;
    public final void rule__DomainRelations__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4750:1: ( ( ( rule__DomainRelations__ElementsAssignment_22 ) ) )
            // InternalMyDsl.g:4751:1: ( ( rule__DomainRelations__ElementsAssignment_22 ) )
            {
            // InternalMyDsl.g:4751:1: ( ( rule__DomainRelations__ElementsAssignment_22 ) )
            // InternalMyDsl.g:4752:2: ( rule__DomainRelations__ElementsAssignment_22 )
            {
             before(grammarAccess.getDomainRelationsAccess().getElementsAssignment_22()); 
            // InternalMyDsl.g:4753:2: ( rule__DomainRelations__ElementsAssignment_22 )
            // InternalMyDsl.g:4753:3: rule__DomainRelations__ElementsAssignment_22
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
    // InternalMyDsl.g:4761:1: rule__DomainRelations__Group__23 : rule__DomainRelations__Group__23__Impl ;
    public final void rule__DomainRelations__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4765:1: ( rule__DomainRelations__Group__23__Impl )
            // InternalMyDsl.g:4766:2: rule__DomainRelations__Group__23__Impl
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
    // InternalMyDsl.g:4772:1: rule__DomainRelations__Group__23__Impl : ( '}' ) ;
    public final void rule__DomainRelations__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4776:1: ( ( '}' ) )
            // InternalMyDsl.g:4777:1: ( '}' )
            {
            // InternalMyDsl.g:4777:1: ( '}' )
            // InternalMyDsl.g:4778:2: '}'
            {
             before(grammarAccess.getDomainRelationsAccess().getRightCurlyBracketKeyword_23()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:4788:1: rule__Architecture__Group__0 : rule__Architecture__Group__0__Impl rule__Architecture__Group__1 ;
    public final void rule__Architecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4792:1: ( rule__Architecture__Group__0__Impl rule__Architecture__Group__1 )
            // InternalMyDsl.g:4793:2: rule__Architecture__Group__0__Impl rule__Architecture__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:4800:1: rule__Architecture__Group__0__Impl : ( 'Architecture:' ) ;
    public final void rule__Architecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4804:1: ( ( 'Architecture:' ) )
            // InternalMyDsl.g:4805:1: ( 'Architecture:' )
            {
            // InternalMyDsl.g:4805:1: ( 'Architecture:' )
            // InternalMyDsl.g:4806:2: 'Architecture:'
            {
             before(grammarAccess.getArchitectureAccess().getArchitectureKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalMyDsl.g:4815:1: rule__Architecture__Group__1 : rule__Architecture__Group__1__Impl rule__Architecture__Group__2 ;
    public final void rule__Architecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4819:1: ( rule__Architecture__Group__1__Impl rule__Architecture__Group__2 )
            // InternalMyDsl.g:4820:2: rule__Architecture__Group__1__Impl rule__Architecture__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:4827:1: rule__Architecture__Group__1__Impl : ( '{' ) ;
    public final void rule__Architecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4831:1: ( ( '{' ) )
            // InternalMyDsl.g:4832:1: ( '{' )
            {
            // InternalMyDsl.g:4832:1: ( '{' )
            // InternalMyDsl.g:4833:2: '{'
            {
             before(grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:4842:1: rule__Architecture__Group__2 : rule__Architecture__Group__2__Impl rule__Architecture__Group__3 ;
    public final void rule__Architecture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4846:1: ( rule__Architecture__Group__2__Impl rule__Architecture__Group__3 )
            // InternalMyDsl.g:4847:2: rule__Architecture__Group__2__Impl rule__Architecture__Group__3
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
    // InternalMyDsl.g:4854:1: rule__Architecture__Group__2__Impl : ( ( rule__Architecture__NameAssignment_2 ) ) ;
    public final void rule__Architecture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4858:1: ( ( ( rule__Architecture__NameAssignment_2 ) ) )
            // InternalMyDsl.g:4859:1: ( ( rule__Architecture__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:4859:1: ( ( rule__Architecture__NameAssignment_2 ) )
            // InternalMyDsl.g:4860:2: ( rule__Architecture__NameAssignment_2 )
            {
             before(grammarAccess.getArchitectureAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:4861:2: ( rule__Architecture__NameAssignment_2 )
            // InternalMyDsl.g:4861:3: rule__Architecture__NameAssignment_2
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
    // InternalMyDsl.g:4869:1: rule__Architecture__Group__3 : rule__Architecture__Group__3__Impl ;
    public final void rule__Architecture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4873:1: ( rule__Architecture__Group__3__Impl )
            // InternalMyDsl.g:4874:2: rule__Architecture__Group__3__Impl
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
    // InternalMyDsl.g:4880:1: rule__Architecture__Group__3__Impl : ( '}' ) ;
    public final void rule__Architecture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4884:1: ( ( '}' ) )
            // InternalMyDsl.g:4885:1: ( '}' )
            {
            // InternalMyDsl.g:4885:1: ( '}' )
            // InternalMyDsl.g:4886:2: '}'
            {
             before(grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:4896:1: rule__Technology__Group__0 : rule__Technology__Group__0__Impl rule__Technology__Group__1 ;
    public final void rule__Technology__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4900:1: ( rule__Technology__Group__0__Impl rule__Technology__Group__1 )
            // InternalMyDsl.g:4901:2: rule__Technology__Group__0__Impl rule__Technology__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:4908:1: rule__Technology__Group__0__Impl : ( 'Technology' ) ;
    public final void rule__Technology__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4912:1: ( ( 'Technology' ) )
            // InternalMyDsl.g:4913:1: ( 'Technology' )
            {
            // InternalMyDsl.g:4913:1: ( 'Technology' )
            // InternalMyDsl.g:4914:2: 'Technology'
            {
             before(grammarAccess.getTechnologyAccess().getTechnologyKeyword_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalMyDsl.g:4923:1: rule__Technology__Group__1 : rule__Technology__Group__1__Impl rule__Technology__Group__2 ;
    public final void rule__Technology__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4927:1: ( rule__Technology__Group__1__Impl rule__Technology__Group__2 )
            // InternalMyDsl.g:4928:2: rule__Technology__Group__1__Impl rule__Technology__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:4935:1: rule__Technology__Group__1__Impl : ( ( rule__Technology__NameAssignment_1 ) ) ;
    public final void rule__Technology__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4939:1: ( ( ( rule__Technology__NameAssignment_1 ) ) )
            // InternalMyDsl.g:4940:1: ( ( rule__Technology__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:4940:1: ( ( rule__Technology__NameAssignment_1 ) )
            // InternalMyDsl.g:4941:2: ( rule__Technology__NameAssignment_1 )
            {
             before(grammarAccess.getTechnologyAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4942:2: ( rule__Technology__NameAssignment_1 )
            // InternalMyDsl.g:4942:3: rule__Technology__NameAssignment_1
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
    // InternalMyDsl.g:4950:1: rule__Technology__Group__2 : rule__Technology__Group__2__Impl rule__Technology__Group__3 ;
    public final void rule__Technology__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4954:1: ( rule__Technology__Group__2__Impl rule__Technology__Group__3 )
            // InternalMyDsl.g:4955:2: rule__Technology__Group__2__Impl rule__Technology__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:4962:1: rule__Technology__Group__2__Impl : ( ':' ) ;
    public final void rule__Technology__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4966:1: ( ( ':' ) )
            // InternalMyDsl.g:4967:1: ( ':' )
            {
            // InternalMyDsl.g:4967:1: ( ':' )
            // InternalMyDsl.g:4968:2: ':'
            {
             before(grammarAccess.getTechnologyAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:4977:1: rule__Technology__Group__3 : rule__Technology__Group__3__Impl rule__Technology__Group__4 ;
    public final void rule__Technology__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4981:1: ( rule__Technology__Group__3__Impl rule__Technology__Group__4 )
            // InternalMyDsl.g:4982:2: rule__Technology__Group__3__Impl rule__Technology__Group__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyDsl.g:4989:1: rule__Technology__Group__3__Impl : ( '{' ) ;
    public final void rule__Technology__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4993:1: ( ( '{' ) )
            // InternalMyDsl.g:4994:1: ( '{' )
            {
            // InternalMyDsl.g:4994:1: ( '{' )
            // InternalMyDsl.g:4995:2: '{'
            {
             before(grammarAccess.getTechnologyAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:5004:1: rule__Technology__Group__4 : rule__Technology__Group__4__Impl rule__Technology__Group__5 ;
    public final void rule__Technology__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5008:1: ( rule__Technology__Group__4__Impl rule__Technology__Group__5 )
            // InternalMyDsl.g:5009:2: rule__Technology__Group__4__Impl rule__Technology__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:5016:1: rule__Technology__Group__4__Impl : ( ( rule__Technology__ElementsAssignment_4 ) ) ;
    public final void rule__Technology__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5020:1: ( ( ( rule__Technology__ElementsAssignment_4 ) ) )
            // InternalMyDsl.g:5021:1: ( ( rule__Technology__ElementsAssignment_4 ) )
            {
            // InternalMyDsl.g:5021:1: ( ( rule__Technology__ElementsAssignment_4 ) )
            // InternalMyDsl.g:5022:2: ( rule__Technology__ElementsAssignment_4 )
            {
             before(grammarAccess.getTechnologyAccess().getElementsAssignment_4()); 
            // InternalMyDsl.g:5023:2: ( rule__Technology__ElementsAssignment_4 )
            // InternalMyDsl.g:5023:3: rule__Technology__ElementsAssignment_4
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
    // InternalMyDsl.g:5031:1: rule__Technology__Group__5 : rule__Technology__Group__5__Impl ;
    public final void rule__Technology__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5035:1: ( rule__Technology__Group__5__Impl )
            // InternalMyDsl.g:5036:2: rule__Technology__Group__5__Impl
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
    // InternalMyDsl.g:5042:1: rule__Technology__Group__5__Impl : ( '}' ) ;
    public final void rule__Technology__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5046:1: ( ( '}' ) )
            // InternalMyDsl.g:5047:1: ( '}' )
            {
            // InternalMyDsl.g:5047:1: ( '}' )
            // InternalMyDsl.g:5048:2: '}'
            {
             before(grammarAccess.getTechnologyAccess().getRightCurlyBracketKeyword_5()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:5058:1: rule__Technologies__Group__0 : rule__Technologies__Group__0__Impl rule__Technologies__Group__1 ;
    public final void rule__Technologies__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5062:1: ( rule__Technologies__Group__0__Impl rule__Technologies__Group__1 )
            // InternalMyDsl.g:5063:2: rule__Technologies__Group__0__Impl rule__Technologies__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyDsl.g:5070:1: rule__Technologies__Group__0__Impl : ( ( rule__Technologies__FactorsAssignment_0 ) ) ;
    public final void rule__Technologies__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5074:1: ( ( ( rule__Technologies__FactorsAssignment_0 ) ) )
            // InternalMyDsl.g:5075:1: ( ( rule__Technologies__FactorsAssignment_0 ) )
            {
            // InternalMyDsl.g:5075:1: ( ( rule__Technologies__FactorsAssignment_0 ) )
            // InternalMyDsl.g:5076:2: ( rule__Technologies__FactorsAssignment_0 )
            {
             before(grammarAccess.getTechnologiesAccess().getFactorsAssignment_0()); 
            // InternalMyDsl.g:5077:2: ( rule__Technologies__FactorsAssignment_0 )
            // InternalMyDsl.g:5077:3: rule__Technologies__FactorsAssignment_0
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
    // InternalMyDsl.g:5085:1: rule__Technologies__Group__1 : rule__Technologies__Group__1__Impl rule__Technologies__Group__2 ;
    public final void rule__Technologies__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5089:1: ( rule__Technologies__Group__1__Impl rule__Technologies__Group__2 )
            // InternalMyDsl.g:5090:2: rule__Technologies__Group__1__Impl rule__Technologies__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyDsl.g:5097:1: rule__Technologies__Group__1__Impl : ( ( rule__Technologies__FactorsAssignment_1 ) ) ;
    public final void rule__Technologies__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5101:1: ( ( ( rule__Technologies__FactorsAssignment_1 ) ) )
            // InternalMyDsl.g:5102:1: ( ( rule__Technologies__FactorsAssignment_1 ) )
            {
            // InternalMyDsl.g:5102:1: ( ( rule__Technologies__FactorsAssignment_1 ) )
            // InternalMyDsl.g:5103:2: ( rule__Technologies__FactorsAssignment_1 )
            {
             before(grammarAccess.getTechnologiesAccess().getFactorsAssignment_1()); 
            // InternalMyDsl.g:5104:2: ( rule__Technologies__FactorsAssignment_1 )
            // InternalMyDsl.g:5104:3: rule__Technologies__FactorsAssignment_1
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
    // InternalMyDsl.g:5112:1: rule__Technologies__Group__2 : rule__Technologies__Group__2__Impl rule__Technologies__Group__3 ;
    public final void rule__Technologies__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5116:1: ( rule__Technologies__Group__2__Impl rule__Technologies__Group__3 )
            // InternalMyDsl.g:5117:2: rule__Technologies__Group__2__Impl rule__Technologies__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:5124:1: rule__Technologies__Group__2__Impl : ( ( rule__Technologies__FactorsAssignment_2 ) ) ;
    public final void rule__Technologies__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5128:1: ( ( ( rule__Technologies__FactorsAssignment_2 ) ) )
            // InternalMyDsl.g:5129:1: ( ( rule__Technologies__FactorsAssignment_2 ) )
            {
            // InternalMyDsl.g:5129:1: ( ( rule__Technologies__FactorsAssignment_2 ) )
            // InternalMyDsl.g:5130:2: ( rule__Technologies__FactorsAssignment_2 )
            {
             before(grammarAccess.getTechnologiesAccess().getFactorsAssignment_2()); 
            // InternalMyDsl.g:5131:2: ( rule__Technologies__FactorsAssignment_2 )
            // InternalMyDsl.g:5131:3: rule__Technologies__FactorsAssignment_2
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
    // InternalMyDsl.g:5139:1: rule__Technologies__Group__3 : rule__Technologies__Group__3__Impl ;
    public final void rule__Technologies__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5143:1: ( rule__Technologies__Group__3__Impl )
            // InternalMyDsl.g:5144:2: rule__Technologies__Group__3__Impl
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
    // InternalMyDsl.g:5150:1: rule__Technologies__Group__3__Impl : ( ( rule__Technologies__FactorsAssignment_3 ) ) ;
    public final void rule__Technologies__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5154:1: ( ( ( rule__Technologies__FactorsAssignment_3 ) ) )
            // InternalMyDsl.g:5155:1: ( ( rule__Technologies__FactorsAssignment_3 ) )
            {
            // InternalMyDsl.g:5155:1: ( ( rule__Technologies__FactorsAssignment_3 ) )
            // InternalMyDsl.g:5156:2: ( rule__Technologies__FactorsAssignment_3 )
            {
             before(grammarAccess.getTechnologiesAccess().getFactorsAssignment_3()); 
            // InternalMyDsl.g:5157:2: ( rule__Technologies__FactorsAssignment_3 )
            // InternalMyDsl.g:5157:3: rule__Technologies__FactorsAssignment_3
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
    // InternalMyDsl.g:5166:1: rule__React__Group__0 : rule__React__Group__0__Impl rule__React__Group__1 ;
    public final void rule__React__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5170:1: ( rule__React__Group__0__Impl rule__React__Group__1 )
            // InternalMyDsl.g:5171:2: rule__React__Group__0__Impl rule__React__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:5178:1: rule__React__Group__0__Impl : ( 'React' ) ;
    public final void rule__React__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5182:1: ( ( 'React' ) )
            // InternalMyDsl.g:5183:1: ( 'React' )
            {
            // InternalMyDsl.g:5183:1: ( 'React' )
            // InternalMyDsl.g:5184:2: 'React'
            {
             before(grammarAccess.getReactAccess().getReactKeyword_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalMyDsl.g:5193:1: rule__React__Group__1 : rule__React__Group__1__Impl rule__React__Group__2 ;
    public final void rule__React__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5197:1: ( rule__React__Group__1__Impl rule__React__Group__2 )
            // InternalMyDsl.g:5198:2: rule__React__Group__1__Impl rule__React__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:5205:1: rule__React__Group__1__Impl : ( ( rule__React__NameAssignment_1 ) ) ;
    public final void rule__React__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5209:1: ( ( ( rule__React__NameAssignment_1 ) ) )
            // InternalMyDsl.g:5210:1: ( ( rule__React__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:5210:1: ( ( rule__React__NameAssignment_1 ) )
            // InternalMyDsl.g:5211:2: ( rule__React__NameAssignment_1 )
            {
             before(grammarAccess.getReactAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5212:2: ( rule__React__NameAssignment_1 )
            // InternalMyDsl.g:5212:3: rule__React__NameAssignment_1
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
    // InternalMyDsl.g:5220:1: rule__React__Group__2 : rule__React__Group__2__Impl rule__React__Group__3 ;
    public final void rule__React__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5224:1: ( rule__React__Group__2__Impl rule__React__Group__3 )
            // InternalMyDsl.g:5225:2: rule__React__Group__2__Impl rule__React__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:5232:1: rule__React__Group__2__Impl : ( ':' ) ;
    public final void rule__React__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5236:1: ( ( ':' ) )
            // InternalMyDsl.g:5237:1: ( ':' )
            {
            // InternalMyDsl.g:5237:1: ( ':' )
            // InternalMyDsl.g:5238:2: ':'
            {
             before(grammarAccess.getReactAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:5247:1: rule__React__Group__3 : rule__React__Group__3__Impl rule__React__Group__4 ;
    public final void rule__React__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5251:1: ( rule__React__Group__3__Impl rule__React__Group__4 )
            // InternalMyDsl.g:5252:2: rule__React__Group__3__Impl rule__React__Group__4
            {
            pushFollow(FOLLOW_40);
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
    // InternalMyDsl.g:5259:1: rule__React__Group__3__Impl : ( '{' ) ;
    public final void rule__React__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5263:1: ( ( '{' ) )
            // InternalMyDsl.g:5264:1: ( '{' )
            {
            // InternalMyDsl.g:5264:1: ( '{' )
            // InternalMyDsl.g:5265:2: '{'
            {
             before(grammarAccess.getReactAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:5274:1: rule__React__Group__4 : rule__React__Group__4__Impl rule__React__Group__5 ;
    public final void rule__React__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5278:1: ( rule__React__Group__4__Impl rule__React__Group__5 )
            // InternalMyDsl.g:5279:2: rule__React__Group__4__Impl rule__React__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:5286:1: rule__React__Group__4__Impl : ( ( rule__React__ReactsAssignment_4 ) ) ;
    public final void rule__React__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5290:1: ( ( ( rule__React__ReactsAssignment_4 ) ) )
            // InternalMyDsl.g:5291:1: ( ( rule__React__ReactsAssignment_4 ) )
            {
            // InternalMyDsl.g:5291:1: ( ( rule__React__ReactsAssignment_4 ) )
            // InternalMyDsl.g:5292:2: ( rule__React__ReactsAssignment_4 )
            {
             before(grammarAccess.getReactAccess().getReactsAssignment_4()); 
            // InternalMyDsl.g:5293:2: ( rule__React__ReactsAssignment_4 )
            // InternalMyDsl.g:5293:3: rule__React__ReactsAssignment_4
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
    // InternalMyDsl.g:5301:1: rule__React__Group__5 : rule__React__Group__5__Impl ;
    public final void rule__React__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5305:1: ( rule__React__Group__5__Impl )
            // InternalMyDsl.g:5306:2: rule__React__Group__5__Impl
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
    // InternalMyDsl.g:5312:1: rule__React__Group__5__Impl : ( '}' ) ;
    public final void rule__React__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5316:1: ( ( '}' ) )
            // InternalMyDsl.g:5317:1: ( '}' )
            {
            // InternalMyDsl.g:5317:1: ( '}' )
            // InternalMyDsl.g:5318:2: '}'
            {
             before(grammarAccess.getReactAccess().getRightCurlyBracketKeyword_5()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:5328:1: rule__ReactModules__Group__0 : rule__ReactModules__Group__0__Impl rule__ReactModules__Group__1 ;
    public final void rule__ReactModules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5332:1: ( rule__ReactModules__Group__0__Impl rule__ReactModules__Group__1 )
            // InternalMyDsl.g:5333:2: rule__ReactModules__Group__0__Impl rule__ReactModules__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:5340:1: rule__ReactModules__Group__0__Impl : ( 'ReactModules' ) ;
    public final void rule__ReactModules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5344:1: ( ( 'ReactModules' ) )
            // InternalMyDsl.g:5345:1: ( 'ReactModules' )
            {
            // InternalMyDsl.g:5345:1: ( 'ReactModules' )
            // InternalMyDsl.g:5346:2: 'ReactModules'
            {
             before(grammarAccess.getReactModulesAccess().getReactModulesKeyword_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalMyDsl.g:5355:1: rule__ReactModules__Group__1 : rule__ReactModules__Group__1__Impl rule__ReactModules__Group__2 ;
    public final void rule__ReactModules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5359:1: ( rule__ReactModules__Group__1__Impl rule__ReactModules__Group__2 )
            // InternalMyDsl.g:5360:2: rule__ReactModules__Group__1__Impl rule__ReactModules__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:5367:1: rule__ReactModules__Group__1__Impl : ( ':' ) ;
    public final void rule__ReactModules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5371:1: ( ( ':' ) )
            // InternalMyDsl.g:5372:1: ( ':' )
            {
            // InternalMyDsl.g:5372:1: ( ':' )
            // InternalMyDsl.g:5373:2: ':'
            {
             before(grammarAccess.getReactModulesAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:5382:1: rule__ReactModules__Group__2 : rule__ReactModules__Group__2__Impl rule__ReactModules__Group__3 ;
    public final void rule__ReactModules__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5386:1: ( rule__ReactModules__Group__2__Impl rule__ReactModules__Group__3 )
            // InternalMyDsl.g:5387:2: rule__ReactModules__Group__2__Impl rule__ReactModules__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalMyDsl.g:5394:1: rule__ReactModules__Group__2__Impl : ( '{' ) ;
    public final void rule__ReactModules__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5398:1: ( ( '{' ) )
            // InternalMyDsl.g:5399:1: ( '{' )
            {
            // InternalMyDsl.g:5399:1: ( '{' )
            // InternalMyDsl.g:5400:2: '{'
            {
             before(grammarAccess.getReactModulesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:5409:1: rule__ReactModules__Group__3 : rule__ReactModules__Group__3__Impl rule__ReactModules__Group__4 ;
    public final void rule__ReactModules__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5413:1: ( rule__ReactModules__Group__3__Impl rule__ReactModules__Group__4 )
            // InternalMyDsl.g:5414:2: rule__ReactModules__Group__3__Impl rule__ReactModules__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:5421:1: rule__ReactModules__Group__3__Impl : ( ( rule__ReactModules__ReactmodulesAssignment_3 ) ) ;
    public final void rule__ReactModules__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5425:1: ( ( ( rule__ReactModules__ReactmodulesAssignment_3 ) ) )
            // InternalMyDsl.g:5426:1: ( ( rule__ReactModules__ReactmodulesAssignment_3 ) )
            {
            // InternalMyDsl.g:5426:1: ( ( rule__ReactModules__ReactmodulesAssignment_3 ) )
            // InternalMyDsl.g:5427:2: ( rule__ReactModules__ReactmodulesAssignment_3 )
            {
             before(grammarAccess.getReactModulesAccess().getReactmodulesAssignment_3()); 
            // InternalMyDsl.g:5428:2: ( rule__ReactModules__ReactmodulesAssignment_3 )
            // InternalMyDsl.g:5428:3: rule__ReactModules__ReactmodulesAssignment_3
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
    // InternalMyDsl.g:5436:1: rule__ReactModules__Group__4 : rule__ReactModules__Group__4__Impl ;
    public final void rule__ReactModules__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5440:1: ( rule__ReactModules__Group__4__Impl )
            // InternalMyDsl.g:5441:2: rule__ReactModules__Group__4__Impl
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
    // InternalMyDsl.g:5447:1: rule__ReactModules__Group__4__Impl : ( '}' ) ;
    public final void rule__ReactModules__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5451:1: ( ( '}' ) )
            // InternalMyDsl.g:5452:1: ( '}' )
            {
            // InternalMyDsl.g:5452:1: ( '}' )
            // InternalMyDsl.g:5453:2: '}'
            {
             before(grammarAccess.getReactModulesAccess().getRightCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:5463:1: rule__ReactSubModules__Group__0 : rule__ReactSubModules__Group__0__Impl rule__ReactSubModules__Group__1 ;
    public final void rule__ReactSubModules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5467:1: ( rule__ReactSubModules__Group__0__Impl rule__ReactSubModules__Group__1 )
            // InternalMyDsl.g:5468:2: rule__ReactSubModules__Group__0__Impl rule__ReactSubModules__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalMyDsl.g:5475:1: rule__ReactSubModules__Group__0__Impl : ( ( rule__ReactSubModules__ReactmodulesAssignment_0 ) ) ;
    public final void rule__ReactSubModules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5479:1: ( ( ( rule__ReactSubModules__ReactmodulesAssignment_0 ) ) )
            // InternalMyDsl.g:5480:1: ( ( rule__ReactSubModules__ReactmodulesAssignment_0 ) )
            {
            // InternalMyDsl.g:5480:1: ( ( rule__ReactSubModules__ReactmodulesAssignment_0 ) )
            // InternalMyDsl.g:5481:2: ( rule__ReactSubModules__ReactmodulesAssignment_0 )
            {
             before(grammarAccess.getReactSubModulesAccess().getReactmodulesAssignment_0()); 
            // InternalMyDsl.g:5482:2: ( rule__ReactSubModules__ReactmodulesAssignment_0 )
            // InternalMyDsl.g:5482:3: rule__ReactSubModules__ReactmodulesAssignment_0
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
    // InternalMyDsl.g:5490:1: rule__ReactSubModules__Group__1 : rule__ReactSubModules__Group__1__Impl rule__ReactSubModules__Group__2 ;
    public final void rule__ReactSubModules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5494:1: ( rule__ReactSubModules__Group__1__Impl rule__ReactSubModules__Group__2 )
            // InternalMyDsl.g:5495:2: rule__ReactSubModules__Group__1__Impl rule__ReactSubModules__Group__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalMyDsl.g:5502:1: rule__ReactSubModules__Group__1__Impl : ( ( rule__ReactSubModules__ReactmodulesAssignment_1 ) ) ;
    public final void rule__ReactSubModules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5506:1: ( ( ( rule__ReactSubModules__ReactmodulesAssignment_1 ) ) )
            // InternalMyDsl.g:5507:1: ( ( rule__ReactSubModules__ReactmodulesAssignment_1 ) )
            {
            // InternalMyDsl.g:5507:1: ( ( rule__ReactSubModules__ReactmodulesAssignment_1 ) )
            // InternalMyDsl.g:5508:2: ( rule__ReactSubModules__ReactmodulesAssignment_1 )
            {
             before(grammarAccess.getReactSubModulesAccess().getReactmodulesAssignment_1()); 
            // InternalMyDsl.g:5509:2: ( rule__ReactSubModules__ReactmodulesAssignment_1 )
            // InternalMyDsl.g:5509:3: rule__ReactSubModules__ReactmodulesAssignment_1
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
    // InternalMyDsl.g:5517:1: rule__ReactSubModules__Group__2 : rule__ReactSubModules__Group__2__Impl rule__ReactSubModules__Group__3 ;
    public final void rule__ReactSubModules__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5521:1: ( rule__ReactSubModules__Group__2__Impl rule__ReactSubModules__Group__3 )
            // InternalMyDsl.g:5522:2: rule__ReactSubModules__Group__2__Impl rule__ReactSubModules__Group__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyDsl.g:5529:1: rule__ReactSubModules__Group__2__Impl : ( ( rule__ReactSubModules__ReactmodulesAssignment_2 ) ) ;
    public final void rule__ReactSubModules__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5533:1: ( ( ( rule__ReactSubModules__ReactmodulesAssignment_2 ) ) )
            // InternalMyDsl.g:5534:1: ( ( rule__ReactSubModules__ReactmodulesAssignment_2 ) )
            {
            // InternalMyDsl.g:5534:1: ( ( rule__ReactSubModules__ReactmodulesAssignment_2 ) )
            // InternalMyDsl.g:5535:2: ( rule__ReactSubModules__ReactmodulesAssignment_2 )
            {
             before(grammarAccess.getReactSubModulesAccess().getReactmodulesAssignment_2()); 
            // InternalMyDsl.g:5536:2: ( rule__ReactSubModules__ReactmodulesAssignment_2 )
            // InternalMyDsl.g:5536:3: rule__ReactSubModules__ReactmodulesAssignment_2
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
    // InternalMyDsl.g:5544:1: rule__ReactSubModules__Group__3 : rule__ReactSubModules__Group__3__Impl rule__ReactSubModules__Group__4 ;
    public final void rule__ReactSubModules__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5548:1: ( rule__ReactSubModules__Group__3__Impl rule__ReactSubModules__Group__4 )
            // InternalMyDsl.g:5549:2: rule__ReactSubModules__Group__3__Impl rule__ReactSubModules__Group__4
            {
            pushFollow(FOLLOW_45);
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
    // InternalMyDsl.g:5556:1: rule__ReactSubModules__Group__3__Impl : ( ( rule__ReactSubModules__ReactmodulesAssignment_3 ) ) ;
    public final void rule__ReactSubModules__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5560:1: ( ( ( rule__ReactSubModules__ReactmodulesAssignment_3 ) ) )
            // InternalMyDsl.g:5561:1: ( ( rule__ReactSubModules__ReactmodulesAssignment_3 ) )
            {
            // InternalMyDsl.g:5561:1: ( ( rule__ReactSubModules__ReactmodulesAssignment_3 ) )
            // InternalMyDsl.g:5562:2: ( rule__ReactSubModules__ReactmodulesAssignment_3 )
            {
             before(grammarAccess.getReactSubModulesAccess().getReactmodulesAssignment_3()); 
            // InternalMyDsl.g:5563:2: ( rule__ReactSubModules__ReactmodulesAssignment_3 )
            // InternalMyDsl.g:5563:3: rule__ReactSubModules__ReactmodulesAssignment_3
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
    // InternalMyDsl.g:5571:1: rule__ReactSubModules__Group__4 : rule__ReactSubModules__Group__4__Impl ;
    public final void rule__ReactSubModules__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5575:1: ( rule__ReactSubModules__Group__4__Impl )
            // InternalMyDsl.g:5576:2: rule__ReactSubModules__Group__4__Impl
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
    // InternalMyDsl.g:5582:1: rule__ReactSubModules__Group__4__Impl : ( ( rule__ReactSubModules__ReactmodulesAssignment_4 ) ) ;
    public final void rule__ReactSubModules__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5586:1: ( ( ( rule__ReactSubModules__ReactmodulesAssignment_4 ) ) )
            // InternalMyDsl.g:5587:1: ( ( rule__ReactSubModules__ReactmodulesAssignment_4 ) )
            {
            // InternalMyDsl.g:5587:1: ( ( rule__ReactSubModules__ReactmodulesAssignment_4 ) )
            // InternalMyDsl.g:5588:2: ( rule__ReactSubModules__ReactmodulesAssignment_4 )
            {
             before(grammarAccess.getReactSubModulesAccess().getReactmodulesAssignment_4()); 
            // InternalMyDsl.g:5589:2: ( rule__ReactSubModules__ReactmodulesAssignment_4 )
            // InternalMyDsl.g:5589:3: rule__ReactSubModules__ReactmodulesAssignment_4
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
    // InternalMyDsl.g:5598:1: rule__ReactConfiguration__Group__0 : rule__ReactConfiguration__Group__0__Impl rule__ReactConfiguration__Group__1 ;
    public final void rule__ReactConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5602:1: ( rule__ReactConfiguration__Group__0__Impl rule__ReactConfiguration__Group__1 )
            // InternalMyDsl.g:5603:2: rule__ReactConfiguration__Group__0__Impl rule__ReactConfiguration__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:5610:1: rule__ReactConfiguration__Group__0__Impl : ( 'ReactConfiguration' ) ;
    public final void rule__ReactConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5614:1: ( ( 'ReactConfiguration' ) )
            // InternalMyDsl.g:5615:1: ( 'ReactConfiguration' )
            {
            // InternalMyDsl.g:5615:1: ( 'ReactConfiguration' )
            // InternalMyDsl.g:5616:2: 'ReactConfiguration'
            {
             before(grammarAccess.getReactConfigurationAccess().getReactConfigurationKeyword_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalMyDsl.g:5625:1: rule__ReactConfiguration__Group__1 : rule__ReactConfiguration__Group__1__Impl rule__ReactConfiguration__Group__2 ;
    public final void rule__ReactConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5629:1: ( rule__ReactConfiguration__Group__1__Impl rule__ReactConfiguration__Group__2 )
            // InternalMyDsl.g:5630:2: rule__ReactConfiguration__Group__1__Impl rule__ReactConfiguration__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:5637:1: rule__ReactConfiguration__Group__1__Impl : ( ':' ) ;
    public final void rule__ReactConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5641:1: ( ( ':' ) )
            // InternalMyDsl.g:5642:1: ( ':' )
            {
            // InternalMyDsl.g:5642:1: ( ':' )
            // InternalMyDsl.g:5643:2: ':'
            {
             before(grammarAccess.getReactConfigurationAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getReactConfigurationAccess().getColonKeyword_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:5652:1: rule__ReactConfiguration__Group__2 : rule__ReactConfiguration__Group__2__Impl rule__ReactConfiguration__Group__3 ;
    public final void rule__ReactConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5656:1: ( rule__ReactConfiguration__Group__2__Impl rule__ReactConfiguration__Group__3 )
            // InternalMyDsl.g:5657:2: rule__ReactConfiguration__Group__2__Impl rule__ReactConfiguration__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__ReactConfiguration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactConfiguration__Group__3();

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
    // InternalMyDsl.g:5664:1: rule__ReactConfiguration__Group__2__Impl : ( '{' ) ;
    public final void rule__ReactConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5668:1: ( ( '{' ) )
            // InternalMyDsl.g:5669:1: ( '{' )
            {
            // InternalMyDsl.g:5669:1: ( '{' )
            // InternalMyDsl.g:5670:2: '{'
            {
             before(grammarAccess.getReactConfigurationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getReactConfigurationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ReactConfiguration__Group__3"
    // InternalMyDsl.g:5679:1: rule__ReactConfiguration__Group__3 : rule__ReactConfiguration__Group__3__Impl rule__ReactConfiguration__Group__4 ;
    public final void rule__ReactConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5683:1: ( rule__ReactConfiguration__Group__3__Impl rule__ReactConfiguration__Group__4 )
            // InternalMyDsl.g:5684:2: rule__ReactConfiguration__Group__3__Impl rule__ReactConfiguration__Group__4
            {
            pushFollow(FOLLOW_47);
            rule__ReactConfiguration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactConfiguration__Group__4();

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
    // $ANTLR end "rule__ReactConfiguration__Group__3"


    // $ANTLR start "rule__ReactConfiguration__Group__3__Impl"
    // InternalMyDsl.g:5691:1: rule__ReactConfiguration__Group__3__Impl : ( ( rule__ReactConfiguration__DependenciesAssignment_3 ) ) ;
    public final void rule__ReactConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5695:1: ( ( ( rule__ReactConfiguration__DependenciesAssignment_3 ) ) )
            // InternalMyDsl.g:5696:1: ( ( rule__ReactConfiguration__DependenciesAssignment_3 ) )
            {
            // InternalMyDsl.g:5696:1: ( ( rule__ReactConfiguration__DependenciesAssignment_3 ) )
            // InternalMyDsl.g:5697:2: ( rule__ReactConfiguration__DependenciesAssignment_3 )
            {
             before(grammarAccess.getReactConfigurationAccess().getDependenciesAssignment_3()); 
            // InternalMyDsl.g:5698:2: ( rule__ReactConfiguration__DependenciesAssignment_3 )
            // InternalMyDsl.g:5698:3: rule__ReactConfiguration__DependenciesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ReactConfiguration__DependenciesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReactConfigurationAccess().getDependenciesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactConfiguration__Group__3__Impl"


    // $ANTLR start "rule__ReactConfiguration__Group__4"
    // InternalMyDsl.g:5706:1: rule__ReactConfiguration__Group__4 : rule__ReactConfiguration__Group__4__Impl rule__ReactConfiguration__Group__5 ;
    public final void rule__ReactConfiguration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5710:1: ( rule__ReactConfiguration__Group__4__Impl rule__ReactConfiguration__Group__5 )
            // InternalMyDsl.g:5711:2: rule__ReactConfiguration__Group__4__Impl rule__ReactConfiguration__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__ReactConfiguration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactConfiguration__Group__5();

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
    // $ANTLR end "rule__ReactConfiguration__Group__4"


    // $ANTLR start "rule__ReactConfiguration__Group__4__Impl"
    // InternalMyDsl.g:5718:1: rule__ReactConfiguration__Group__4__Impl : ( ( rule__ReactConfiguration__ConfigurationsAssignment_4 ) ) ;
    public final void rule__ReactConfiguration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5722:1: ( ( ( rule__ReactConfiguration__ConfigurationsAssignment_4 ) ) )
            // InternalMyDsl.g:5723:1: ( ( rule__ReactConfiguration__ConfigurationsAssignment_4 ) )
            {
            // InternalMyDsl.g:5723:1: ( ( rule__ReactConfiguration__ConfigurationsAssignment_4 ) )
            // InternalMyDsl.g:5724:2: ( rule__ReactConfiguration__ConfigurationsAssignment_4 )
            {
             before(grammarAccess.getReactConfigurationAccess().getConfigurationsAssignment_4()); 
            // InternalMyDsl.g:5725:2: ( rule__ReactConfiguration__ConfigurationsAssignment_4 )
            // InternalMyDsl.g:5725:3: rule__ReactConfiguration__ConfigurationsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ReactConfiguration__ConfigurationsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getReactConfigurationAccess().getConfigurationsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactConfiguration__Group__4__Impl"


    // $ANTLR start "rule__ReactConfiguration__Group__5"
    // InternalMyDsl.g:5733:1: rule__ReactConfiguration__Group__5 : rule__ReactConfiguration__Group__5__Impl ;
    public final void rule__ReactConfiguration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5737:1: ( rule__ReactConfiguration__Group__5__Impl )
            // InternalMyDsl.g:5738:2: rule__ReactConfiguration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactConfiguration__Group__5__Impl();

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
    // $ANTLR end "rule__ReactConfiguration__Group__5"


    // $ANTLR start "rule__ReactConfiguration__Group__5__Impl"
    // InternalMyDsl.g:5744:1: rule__ReactConfiguration__Group__5__Impl : ( '}' ) ;
    public final void rule__ReactConfiguration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5748:1: ( ( '}' ) )
            // InternalMyDsl.g:5749:1: ( '}' )
            {
            // InternalMyDsl.g:5749:1: ( '}' )
            // InternalMyDsl.g:5750:2: '}'
            {
             before(grammarAccess.getReactConfigurationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getReactConfigurationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactConfiguration__Group__5__Impl"


    // $ANTLR start "rule__ReactDependencies__Group__0"
    // InternalMyDsl.g:5760:1: rule__ReactDependencies__Group__0 : rule__ReactDependencies__Group__0__Impl rule__ReactDependencies__Group__1 ;
    public final void rule__ReactDependencies__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5764:1: ( rule__ReactDependencies__Group__0__Impl rule__ReactDependencies__Group__1 )
            // InternalMyDsl.g:5765:2: rule__ReactDependencies__Group__0__Impl rule__ReactDependencies__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalMyDsl.g:5772:1: rule__ReactDependencies__Group__0__Impl : ( 'DependenciesStruct' ) ;
    public final void rule__ReactDependencies__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5776:1: ( ( 'DependenciesStruct' ) )
            // InternalMyDsl.g:5777:1: ( 'DependenciesStruct' )
            {
            // InternalMyDsl.g:5777:1: ( 'DependenciesStruct' )
            // InternalMyDsl.g:5778:2: 'DependenciesStruct'
            {
             before(grammarAccess.getReactDependenciesAccess().getDependenciesStructKeyword_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalMyDsl.g:5787:1: rule__ReactDependencies__Group__1 : rule__ReactDependencies__Group__1__Impl ;
    public final void rule__ReactDependencies__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5791:1: ( rule__ReactDependencies__Group__1__Impl )
            // InternalMyDsl.g:5792:2: rule__ReactDependencies__Group__1__Impl
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
    // InternalMyDsl.g:5798:1: rule__ReactDependencies__Group__1__Impl : ( ( ( rule__ReactDependencies__DependenciesAssignment_1 ) ) ( ( rule__ReactDependencies__DependenciesAssignment_1 )* ) ) ;
    public final void rule__ReactDependencies__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5802:1: ( ( ( ( rule__ReactDependencies__DependenciesAssignment_1 ) ) ( ( rule__ReactDependencies__DependenciesAssignment_1 )* ) ) )
            // InternalMyDsl.g:5803:1: ( ( ( rule__ReactDependencies__DependenciesAssignment_1 ) ) ( ( rule__ReactDependencies__DependenciesAssignment_1 )* ) )
            {
            // InternalMyDsl.g:5803:1: ( ( ( rule__ReactDependencies__DependenciesAssignment_1 ) ) ( ( rule__ReactDependencies__DependenciesAssignment_1 )* ) )
            // InternalMyDsl.g:5804:2: ( ( rule__ReactDependencies__DependenciesAssignment_1 ) ) ( ( rule__ReactDependencies__DependenciesAssignment_1 )* )
            {
            // InternalMyDsl.g:5804:2: ( ( rule__ReactDependencies__DependenciesAssignment_1 ) )
            // InternalMyDsl.g:5805:3: ( rule__ReactDependencies__DependenciesAssignment_1 )
            {
             before(grammarAccess.getReactDependenciesAccess().getDependenciesAssignment_1()); 
            // InternalMyDsl.g:5806:3: ( rule__ReactDependencies__DependenciesAssignment_1 )
            // InternalMyDsl.g:5806:4: rule__ReactDependencies__DependenciesAssignment_1
            {
            pushFollow(FOLLOW_49);
            rule__ReactDependencies__DependenciesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReactDependenciesAccess().getDependenciesAssignment_1()); 

            }

            // InternalMyDsl.g:5809:2: ( ( rule__ReactDependencies__DependenciesAssignment_1 )* )
            // InternalMyDsl.g:5810:3: ( rule__ReactDependencies__DependenciesAssignment_1 )*
            {
             before(grammarAccess.getReactDependenciesAccess().getDependenciesAssignment_1()); 
            // InternalMyDsl.g:5811:3: ( rule__ReactDependencies__DependenciesAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==65) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:5811:4: rule__ReactDependencies__DependenciesAssignment_1
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__ReactDependencies__DependenciesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalMyDsl.g:5821:1: rule__ReactDependenciesRules__Group__0 : rule__ReactDependenciesRules__Group__0__Impl rule__ReactDependenciesRules__Group__1 ;
    public final void rule__ReactDependenciesRules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5825:1: ( rule__ReactDependenciesRules__Group__0__Impl rule__ReactDependenciesRules__Group__1 )
            // InternalMyDsl.g:5826:2: rule__ReactDependenciesRules__Group__0__Impl rule__ReactDependenciesRules__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:5833:1: rule__ReactDependenciesRules__Group__0__Impl : ( 'DependencyType' ) ;
    public final void rule__ReactDependenciesRules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5837:1: ( ( 'DependencyType' ) )
            // InternalMyDsl.g:5838:1: ( 'DependencyType' )
            {
            // InternalMyDsl.g:5838:1: ( 'DependencyType' )
            // InternalMyDsl.g:5839:2: 'DependencyType'
            {
             before(grammarAccess.getReactDependenciesRulesAccess().getDependencyTypeKeyword_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalMyDsl.g:5848:1: rule__ReactDependenciesRules__Group__1 : rule__ReactDependenciesRules__Group__1__Impl rule__ReactDependenciesRules__Group__2 ;
    public final void rule__ReactDependenciesRules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5852:1: ( rule__ReactDependenciesRules__Group__1__Impl rule__ReactDependenciesRules__Group__2 )
            // InternalMyDsl.g:5853:2: rule__ReactDependenciesRules__Group__1__Impl rule__ReactDependenciesRules__Group__2
            {
            pushFollow(FOLLOW_50);
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
    // InternalMyDsl.g:5860:1: rule__ReactDependenciesRules__Group__1__Impl : ( ( rule__ReactDependenciesRules__NameAssignment_1 ) ) ;
    public final void rule__ReactDependenciesRules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5864:1: ( ( ( rule__ReactDependenciesRules__NameAssignment_1 ) ) )
            // InternalMyDsl.g:5865:1: ( ( rule__ReactDependenciesRules__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:5865:1: ( ( rule__ReactDependenciesRules__NameAssignment_1 ) )
            // InternalMyDsl.g:5866:2: ( rule__ReactDependenciesRules__NameAssignment_1 )
            {
             before(grammarAccess.getReactDependenciesRulesAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5867:2: ( rule__ReactDependenciesRules__NameAssignment_1 )
            // InternalMyDsl.g:5867:3: rule__ReactDependenciesRules__NameAssignment_1
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
    // InternalMyDsl.g:5875:1: rule__ReactDependenciesRules__Group__2 : rule__ReactDependenciesRules__Group__2__Impl ;
    public final void rule__ReactDependenciesRules__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5879:1: ( rule__ReactDependenciesRules__Group__2__Impl )
            // InternalMyDsl.g:5880:2: rule__ReactDependenciesRules__Group__2__Impl
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
    // InternalMyDsl.g:5886:1: rule__ReactDependenciesRules__Group__2__Impl : ( ( ( rule__ReactDependenciesRules__DependenciesAssignment_2 ) ) ( ( rule__ReactDependenciesRules__DependenciesAssignment_2 )* ) ) ;
    public final void rule__ReactDependenciesRules__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5890:1: ( ( ( ( rule__ReactDependenciesRules__DependenciesAssignment_2 ) ) ( ( rule__ReactDependenciesRules__DependenciesAssignment_2 )* ) ) )
            // InternalMyDsl.g:5891:1: ( ( ( rule__ReactDependenciesRules__DependenciesAssignment_2 ) ) ( ( rule__ReactDependenciesRules__DependenciesAssignment_2 )* ) )
            {
            // InternalMyDsl.g:5891:1: ( ( ( rule__ReactDependenciesRules__DependenciesAssignment_2 ) ) ( ( rule__ReactDependenciesRules__DependenciesAssignment_2 )* ) )
            // InternalMyDsl.g:5892:2: ( ( rule__ReactDependenciesRules__DependenciesAssignment_2 ) ) ( ( rule__ReactDependenciesRules__DependenciesAssignment_2 )* )
            {
            // InternalMyDsl.g:5892:2: ( ( rule__ReactDependenciesRules__DependenciesAssignment_2 ) )
            // InternalMyDsl.g:5893:3: ( rule__ReactDependenciesRules__DependenciesAssignment_2 )
            {
             before(grammarAccess.getReactDependenciesRulesAccess().getDependenciesAssignment_2()); 
            // InternalMyDsl.g:5894:3: ( rule__ReactDependenciesRules__DependenciesAssignment_2 )
            // InternalMyDsl.g:5894:4: rule__ReactDependenciesRules__DependenciesAssignment_2
            {
            pushFollow(FOLLOW_51);
            rule__ReactDependenciesRules__DependenciesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReactDependenciesRulesAccess().getDependenciesAssignment_2()); 

            }

            // InternalMyDsl.g:5897:2: ( ( rule__ReactDependenciesRules__DependenciesAssignment_2 )* )
            // InternalMyDsl.g:5898:3: ( rule__ReactDependenciesRules__DependenciesAssignment_2 )*
            {
             before(grammarAccess.getReactDependenciesRulesAccess().getDependenciesAssignment_2()); 
            // InternalMyDsl.g:5899:3: ( rule__ReactDependenciesRules__DependenciesAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==66) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:5899:4: rule__ReactDependenciesRules__DependenciesAssignment_2
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__ReactDependenciesRules__DependenciesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalMyDsl.g:5909:1: rule__SingleDependencies__Group__0 : rule__SingleDependencies__Group__0__Impl rule__SingleDependencies__Group__1 ;
    public final void rule__SingleDependencies__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5913:1: ( rule__SingleDependencies__Group__0__Impl rule__SingleDependencies__Group__1 )
            // InternalMyDsl.g:5914:2: rule__SingleDependencies__Group__0__Impl rule__SingleDependencies__Group__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalMyDsl.g:5921:1: rule__SingleDependencies__Group__0__Impl : ( ( rule__SingleDependencies__DependenciesAssignment_0 ) ) ;
    public final void rule__SingleDependencies__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5925:1: ( ( ( rule__SingleDependencies__DependenciesAssignment_0 ) ) )
            // InternalMyDsl.g:5926:1: ( ( rule__SingleDependencies__DependenciesAssignment_0 ) )
            {
            // InternalMyDsl.g:5926:1: ( ( rule__SingleDependencies__DependenciesAssignment_0 ) )
            // InternalMyDsl.g:5927:2: ( rule__SingleDependencies__DependenciesAssignment_0 )
            {
             before(grammarAccess.getSingleDependenciesAccess().getDependenciesAssignment_0()); 
            // InternalMyDsl.g:5928:2: ( rule__SingleDependencies__DependenciesAssignment_0 )
            // InternalMyDsl.g:5928:3: rule__SingleDependencies__DependenciesAssignment_0
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
    // InternalMyDsl.g:5936:1: rule__SingleDependencies__Group__1 : rule__SingleDependencies__Group__1__Impl ;
    public final void rule__SingleDependencies__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5940:1: ( rule__SingleDependencies__Group__1__Impl )
            // InternalMyDsl.g:5941:2: rule__SingleDependencies__Group__1__Impl
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
    // InternalMyDsl.g:5947:1: rule__SingleDependencies__Group__1__Impl : ( ( rule__SingleDependencies__DependenciesAssignment_1 ) ) ;
    public final void rule__SingleDependencies__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5951:1: ( ( ( rule__SingleDependencies__DependenciesAssignment_1 ) ) )
            // InternalMyDsl.g:5952:1: ( ( rule__SingleDependencies__DependenciesAssignment_1 ) )
            {
            // InternalMyDsl.g:5952:1: ( ( rule__SingleDependencies__DependenciesAssignment_1 ) )
            // InternalMyDsl.g:5953:2: ( rule__SingleDependencies__DependenciesAssignment_1 )
            {
             before(grammarAccess.getSingleDependenciesAccess().getDependenciesAssignment_1()); 
            // InternalMyDsl.g:5954:2: ( rule__SingleDependencies__DependenciesAssignment_1 )
            // InternalMyDsl.g:5954:3: rule__SingleDependencies__DependenciesAssignment_1
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
    // InternalMyDsl.g:5963:1: rule__PackageName__Group__0 : rule__PackageName__Group__0__Impl rule__PackageName__Group__1 ;
    public final void rule__PackageName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5967:1: ( rule__PackageName__Group__0__Impl rule__PackageName__Group__1 )
            // InternalMyDsl.g:5968:2: rule__PackageName__Group__0__Impl rule__PackageName__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:5975:1: rule__PackageName__Group__0__Impl : ( 'PackageName' ) ;
    public final void rule__PackageName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5979:1: ( ( 'PackageName' ) )
            // InternalMyDsl.g:5980:1: ( 'PackageName' )
            {
            // InternalMyDsl.g:5980:1: ( 'PackageName' )
            // InternalMyDsl.g:5981:2: 'PackageName'
            {
             before(grammarAccess.getPackageNameAccess().getPackageNameKeyword_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalMyDsl.g:5990:1: rule__PackageName__Group__1 : rule__PackageName__Group__1__Impl ;
    public final void rule__PackageName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5994:1: ( rule__PackageName__Group__1__Impl )
            // InternalMyDsl.g:5995:2: rule__PackageName__Group__1__Impl
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
    // InternalMyDsl.g:6001:1: rule__PackageName__Group__1__Impl : ( ( rule__PackageName__NameAssignment_1 ) ) ;
    public final void rule__PackageName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6005:1: ( ( ( rule__PackageName__NameAssignment_1 ) ) )
            // InternalMyDsl.g:6006:1: ( ( rule__PackageName__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:6006:1: ( ( rule__PackageName__NameAssignment_1 ) )
            // InternalMyDsl.g:6007:2: ( rule__PackageName__NameAssignment_1 )
            {
             before(grammarAccess.getPackageNameAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:6008:2: ( rule__PackageName__NameAssignment_1 )
            // InternalMyDsl.g:6008:3: rule__PackageName__NameAssignment_1
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
    // InternalMyDsl.g:6017:1: rule__PackageVersion__Group__0 : rule__PackageVersion__Group__0__Impl rule__PackageVersion__Group__1 ;
    public final void rule__PackageVersion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6021:1: ( rule__PackageVersion__Group__0__Impl rule__PackageVersion__Group__1 )
            // InternalMyDsl.g:6022:2: rule__PackageVersion__Group__0__Impl rule__PackageVersion__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:6029:1: rule__PackageVersion__Group__0__Impl : ( 'PackageVersion' ) ;
    public final void rule__PackageVersion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6033:1: ( ( 'PackageVersion' ) )
            // InternalMyDsl.g:6034:1: ( 'PackageVersion' )
            {
            // InternalMyDsl.g:6034:1: ( 'PackageVersion' )
            // InternalMyDsl.g:6035:2: 'PackageVersion'
            {
             before(grammarAccess.getPackageVersionAccess().getPackageVersionKeyword_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalMyDsl.g:6044:1: rule__PackageVersion__Group__1 : rule__PackageVersion__Group__1__Impl ;
    public final void rule__PackageVersion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6048:1: ( rule__PackageVersion__Group__1__Impl )
            // InternalMyDsl.g:6049:2: rule__PackageVersion__Group__1__Impl
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
    // InternalMyDsl.g:6055:1: rule__PackageVersion__Group__1__Impl : ( ( rule__PackageVersion__NameAssignment_1 ) ) ;
    public final void rule__PackageVersion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6059:1: ( ( ( rule__PackageVersion__NameAssignment_1 ) ) )
            // InternalMyDsl.g:6060:1: ( ( rule__PackageVersion__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:6060:1: ( ( rule__PackageVersion__NameAssignment_1 ) )
            // InternalMyDsl.g:6061:2: ( rule__PackageVersion__NameAssignment_1 )
            {
             before(grammarAccess.getPackageVersionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:6062:2: ( rule__PackageVersion__NameAssignment_1 )
            // InternalMyDsl.g:6062:3: rule__PackageVersion__NameAssignment_1
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
    // InternalMyDsl.g:6071:1: rule__ReactConfigurations__Group__0 : rule__ReactConfigurations__Group__0__Impl rule__ReactConfigurations__Group__1 ;
    public final void rule__ReactConfigurations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6075:1: ( rule__ReactConfigurations__Group__0__Impl rule__ReactConfigurations__Group__1 )
            // InternalMyDsl.g:6076:2: rule__ReactConfigurations__Group__0__Impl rule__ReactConfigurations__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:6083:1: rule__ReactConfigurations__Group__0__Impl : ( 'ReactDOMConfigurations' ) ;
    public final void rule__ReactConfigurations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6087:1: ( ( 'ReactDOMConfigurations' ) )
            // InternalMyDsl.g:6088:1: ( 'ReactDOMConfigurations' )
            {
            // InternalMyDsl.g:6088:1: ( 'ReactDOMConfigurations' )
            // InternalMyDsl.g:6089:2: 'ReactDOMConfigurations'
            {
             before(grammarAccess.getReactConfigurationsAccess().getReactDOMConfigurationsKeyword_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalMyDsl.g:6098:1: rule__ReactConfigurations__Group__1 : rule__ReactConfigurations__Group__1__Impl rule__ReactConfigurations__Group__2 ;
    public final void rule__ReactConfigurations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6102:1: ( rule__ReactConfigurations__Group__1__Impl rule__ReactConfigurations__Group__2 )
            // InternalMyDsl.g:6103:2: rule__ReactConfigurations__Group__1__Impl rule__ReactConfigurations__Group__2
            {
            pushFollow(FOLLOW_53);
            rule__ReactConfigurations__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactConfigurations__Group__2();

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
    // InternalMyDsl.g:6110:1: rule__ReactConfigurations__Group__1__Impl : ( ( rule__ReactConfigurations__NameAssignment_1 ) ) ;
    public final void rule__ReactConfigurations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6114:1: ( ( ( rule__ReactConfigurations__NameAssignment_1 ) ) )
            // InternalMyDsl.g:6115:1: ( ( rule__ReactConfigurations__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:6115:1: ( ( rule__ReactConfigurations__NameAssignment_1 ) )
            // InternalMyDsl.g:6116:2: ( rule__ReactConfigurations__NameAssignment_1 )
            {
             before(grammarAccess.getReactConfigurationsAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:6117:2: ( rule__ReactConfigurations__NameAssignment_1 )
            // InternalMyDsl.g:6117:3: rule__ReactConfigurations__NameAssignment_1
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


    // $ANTLR start "rule__ReactConfigurations__Group__2"
    // InternalMyDsl.g:6125:1: rule__ReactConfigurations__Group__2 : rule__ReactConfigurations__Group__2__Impl ;
    public final void rule__ReactConfigurations__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6129:1: ( rule__ReactConfigurations__Group__2__Impl )
            // InternalMyDsl.g:6130:2: rule__ReactConfigurations__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactConfigurations__Group__2__Impl();

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
    // $ANTLR end "rule__ReactConfigurations__Group__2"


    // $ANTLR start "rule__ReactConfigurations__Group__2__Impl"
    // InternalMyDsl.g:6136:1: rule__ReactConfigurations__Group__2__Impl : ( ( ( rule__ReactConfigurations__ConfigurationsAssignment_2 ) ) ( ( rule__ReactConfigurations__ConfigurationsAssignment_2 )* ) ) ;
    public final void rule__ReactConfigurations__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6140:1: ( ( ( ( rule__ReactConfigurations__ConfigurationsAssignment_2 ) ) ( ( rule__ReactConfigurations__ConfigurationsAssignment_2 )* ) ) )
            // InternalMyDsl.g:6141:1: ( ( ( rule__ReactConfigurations__ConfigurationsAssignment_2 ) ) ( ( rule__ReactConfigurations__ConfigurationsAssignment_2 )* ) )
            {
            // InternalMyDsl.g:6141:1: ( ( ( rule__ReactConfigurations__ConfigurationsAssignment_2 ) ) ( ( rule__ReactConfigurations__ConfigurationsAssignment_2 )* ) )
            // InternalMyDsl.g:6142:2: ( ( rule__ReactConfigurations__ConfigurationsAssignment_2 ) ) ( ( rule__ReactConfigurations__ConfigurationsAssignment_2 )* )
            {
            // InternalMyDsl.g:6142:2: ( ( rule__ReactConfigurations__ConfigurationsAssignment_2 ) )
            // InternalMyDsl.g:6143:3: ( rule__ReactConfigurations__ConfigurationsAssignment_2 )
            {
             before(grammarAccess.getReactConfigurationsAccess().getConfigurationsAssignment_2()); 
            // InternalMyDsl.g:6144:3: ( rule__ReactConfigurations__ConfigurationsAssignment_2 )
            // InternalMyDsl.g:6144:4: rule__ReactConfigurations__ConfigurationsAssignment_2
            {
            pushFollow(FOLLOW_54);
            rule__ReactConfigurations__ConfigurationsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReactConfigurationsAccess().getConfigurationsAssignment_2()); 

            }

            // InternalMyDsl.g:6147:2: ( ( rule__ReactConfigurations__ConfigurationsAssignment_2 )* )
            // InternalMyDsl.g:6148:3: ( rule__ReactConfigurations__ConfigurationsAssignment_2 )*
            {
             before(grammarAccess.getReactConfigurationsAccess().getConfigurationsAssignment_2()); 
            // InternalMyDsl.g:6149:3: ( rule__ReactConfigurations__ConfigurationsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=11 && LA13_0<=15)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:6149:4: rule__ReactConfigurations__ConfigurationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_54);
            	    rule__ReactConfigurations__ConfigurationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getReactConfigurationsAccess().getConfigurationsAssignment_2()); 

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
    // $ANTLR end "rule__ReactConfigurations__Group__2__Impl"


    // $ANTLR start "rule__DOMConfigurations__Group__0"
    // InternalMyDsl.g:6159:1: rule__DOMConfigurations__Group__0 : rule__DOMConfigurations__Group__0__Impl rule__DOMConfigurations__Group__1 ;
    public final void rule__DOMConfigurations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6163:1: ( rule__DOMConfigurations__Group__0__Impl rule__DOMConfigurations__Group__1 )
            // InternalMyDsl.g:6164:2: rule__DOMConfigurations__Group__0__Impl rule__DOMConfigurations__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__DOMConfigurations__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOMConfigurations__Group__1();

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
    // $ANTLR end "rule__DOMConfigurations__Group__0"


    // $ANTLR start "rule__DOMConfigurations__Group__0__Impl"
    // InternalMyDsl.g:6171:1: rule__DOMConfigurations__Group__0__Impl : ( ( rule__DOMConfigurations__ElementsAssignment_0 ) ) ;
    public final void rule__DOMConfigurations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6175:1: ( ( ( rule__DOMConfigurations__ElementsAssignment_0 ) ) )
            // InternalMyDsl.g:6176:1: ( ( rule__DOMConfigurations__ElementsAssignment_0 ) )
            {
            // InternalMyDsl.g:6176:1: ( ( rule__DOMConfigurations__ElementsAssignment_0 ) )
            // InternalMyDsl.g:6177:2: ( rule__DOMConfigurations__ElementsAssignment_0 )
            {
             before(grammarAccess.getDOMConfigurationsAccess().getElementsAssignment_0()); 
            // InternalMyDsl.g:6178:2: ( rule__DOMConfigurations__ElementsAssignment_0 )
            // InternalMyDsl.g:6178:3: rule__DOMConfigurations__ElementsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DOMConfigurations__ElementsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDOMConfigurationsAccess().getElementsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOMConfigurations__Group__0__Impl"


    // $ANTLR start "rule__DOMConfigurations__Group__1"
    // InternalMyDsl.g:6186:1: rule__DOMConfigurations__Group__1 : rule__DOMConfigurations__Group__1__Impl ;
    public final void rule__DOMConfigurations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6190:1: ( rule__DOMConfigurations__Group__1__Impl )
            // InternalMyDsl.g:6191:2: rule__DOMConfigurations__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOMConfigurations__Group__1__Impl();

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
    // $ANTLR end "rule__DOMConfigurations__Group__1"


    // $ANTLR start "rule__DOMConfigurations__Group__1__Impl"
    // InternalMyDsl.g:6197:1: rule__DOMConfigurations__Group__1__Impl : ( ( rule__DOMConfigurations__NameAssignment_1 ) ) ;
    public final void rule__DOMConfigurations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6201:1: ( ( ( rule__DOMConfigurations__NameAssignment_1 ) ) )
            // InternalMyDsl.g:6202:1: ( ( rule__DOMConfigurations__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:6202:1: ( ( rule__DOMConfigurations__NameAssignment_1 ) )
            // InternalMyDsl.g:6203:2: ( rule__DOMConfigurations__NameAssignment_1 )
            {
             before(grammarAccess.getDOMConfigurationsAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:6204:2: ( rule__DOMConfigurations__NameAssignment_1 )
            // InternalMyDsl.g:6204:3: rule__DOMConfigurations__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DOMConfigurations__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDOMConfigurationsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOMConfigurations__Group__1__Impl"


    // $ANTLR start "rule__ReactComponents__Group__0"
    // InternalMyDsl.g:6213:1: rule__ReactComponents__Group__0 : rule__ReactComponents__Group__0__Impl rule__ReactComponents__Group__1 ;
    public final void rule__ReactComponents__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6217:1: ( rule__ReactComponents__Group__0__Impl rule__ReactComponents__Group__1 )
            // InternalMyDsl.g:6218:2: rule__ReactComponents__Group__0__Impl rule__ReactComponents__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:6225:1: rule__ReactComponents__Group__0__Impl : ( 'ReactComponents' ) ;
    public final void rule__ReactComponents__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6229:1: ( ( 'ReactComponents' ) )
            // InternalMyDsl.g:6230:1: ( 'ReactComponents' )
            {
            // InternalMyDsl.g:6230:1: ( 'ReactComponents' )
            // InternalMyDsl.g:6231:2: 'ReactComponents'
            {
             before(grammarAccess.getReactComponentsAccess().getReactComponentsKeyword_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalMyDsl.g:6240:1: rule__ReactComponents__Group__1 : rule__ReactComponents__Group__1__Impl rule__ReactComponents__Group__2 ;
    public final void rule__ReactComponents__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6244:1: ( rule__ReactComponents__Group__1__Impl rule__ReactComponents__Group__2 )
            // InternalMyDsl.g:6245:2: rule__ReactComponents__Group__1__Impl rule__ReactComponents__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:6252:1: rule__ReactComponents__Group__1__Impl : ( ':' ) ;
    public final void rule__ReactComponents__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6256:1: ( ( ':' ) )
            // InternalMyDsl.g:6257:1: ( ':' )
            {
            // InternalMyDsl.g:6257:1: ( ':' )
            // InternalMyDsl.g:6258:2: ':'
            {
             before(grammarAccess.getReactComponentsAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getReactComponentsAccess().getColonKeyword_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:6267:1: rule__ReactComponents__Group__2 : rule__ReactComponents__Group__2__Impl rule__ReactComponents__Group__3 ;
    public final void rule__ReactComponents__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6271:1: ( rule__ReactComponents__Group__2__Impl rule__ReactComponents__Group__3 )
            // InternalMyDsl.g:6272:2: rule__ReactComponents__Group__2__Impl rule__ReactComponents__Group__3
            {
            pushFollow(FOLLOW_55);
            rule__ReactComponents__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactComponents__Group__3();

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
    // InternalMyDsl.g:6279:1: rule__ReactComponents__Group__2__Impl : ( '{' ) ;
    public final void rule__ReactComponents__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6283:1: ( ( '{' ) )
            // InternalMyDsl.g:6284:1: ( '{' )
            {
            // InternalMyDsl.g:6284:1: ( '{' )
            // InternalMyDsl.g:6285:2: '{'
            {
             before(grammarAccess.getReactComponentsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getReactComponentsAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ReactComponents__Group__3"
    // InternalMyDsl.g:6294:1: rule__ReactComponents__Group__3 : rule__ReactComponents__Group__3__Impl rule__ReactComponents__Group__4 ;
    public final void rule__ReactComponents__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6298:1: ( rule__ReactComponents__Group__3__Impl rule__ReactComponents__Group__4 )
            // InternalMyDsl.g:6299:2: rule__ReactComponents__Group__3__Impl rule__ReactComponents__Group__4
            {
            pushFollow(FOLLOW_56);
            rule__ReactComponents__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactComponents__Group__4();

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
    // $ANTLR end "rule__ReactComponents__Group__3"


    // $ANTLR start "rule__ReactComponents__Group__3__Impl"
    // InternalMyDsl.g:6306:1: rule__ReactComponents__Group__3__Impl : ( ( rule__ReactComponents__ComponentslogicAssignment_3 ) ) ;
    public final void rule__ReactComponents__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6310:1: ( ( ( rule__ReactComponents__ComponentslogicAssignment_3 ) ) )
            // InternalMyDsl.g:6311:1: ( ( rule__ReactComponents__ComponentslogicAssignment_3 ) )
            {
            // InternalMyDsl.g:6311:1: ( ( rule__ReactComponents__ComponentslogicAssignment_3 ) )
            // InternalMyDsl.g:6312:2: ( rule__ReactComponents__ComponentslogicAssignment_3 )
            {
             before(grammarAccess.getReactComponentsAccess().getComponentslogicAssignment_3()); 
            // InternalMyDsl.g:6313:2: ( rule__ReactComponents__ComponentslogicAssignment_3 )
            // InternalMyDsl.g:6313:3: rule__ReactComponents__ComponentslogicAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ReactComponents__ComponentslogicAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReactComponentsAccess().getComponentslogicAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactComponents__Group__3__Impl"


    // $ANTLR start "rule__ReactComponents__Group__4"
    // InternalMyDsl.g:6321:1: rule__ReactComponents__Group__4 : rule__ReactComponents__Group__4__Impl rule__ReactComponents__Group__5 ;
    public final void rule__ReactComponents__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6325:1: ( rule__ReactComponents__Group__4__Impl rule__ReactComponents__Group__5 )
            // InternalMyDsl.g:6326:2: rule__ReactComponents__Group__4__Impl rule__ReactComponents__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__ReactComponents__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactComponents__Group__5();

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
    // $ANTLR end "rule__ReactComponents__Group__4"


    // $ANTLR start "rule__ReactComponents__Group__4__Impl"
    // InternalMyDsl.g:6333:1: rule__ReactComponents__Group__4__Impl : ( ( rule__ReactComponents__ComponentsuiAssignment_4 ) ) ;
    public final void rule__ReactComponents__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6337:1: ( ( ( rule__ReactComponents__ComponentsuiAssignment_4 ) ) )
            // InternalMyDsl.g:6338:1: ( ( rule__ReactComponents__ComponentsuiAssignment_4 ) )
            {
            // InternalMyDsl.g:6338:1: ( ( rule__ReactComponents__ComponentsuiAssignment_4 ) )
            // InternalMyDsl.g:6339:2: ( rule__ReactComponents__ComponentsuiAssignment_4 )
            {
             before(grammarAccess.getReactComponentsAccess().getComponentsuiAssignment_4()); 
            // InternalMyDsl.g:6340:2: ( rule__ReactComponents__ComponentsuiAssignment_4 )
            // InternalMyDsl.g:6340:3: rule__ReactComponents__ComponentsuiAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ReactComponents__ComponentsuiAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getReactComponentsAccess().getComponentsuiAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactComponents__Group__4__Impl"


    // $ANTLR start "rule__ReactComponents__Group__5"
    // InternalMyDsl.g:6348:1: rule__ReactComponents__Group__5 : rule__ReactComponents__Group__5__Impl ;
    public final void rule__ReactComponents__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6352:1: ( rule__ReactComponents__Group__5__Impl )
            // InternalMyDsl.g:6353:2: rule__ReactComponents__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactComponents__Group__5__Impl();

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
    // $ANTLR end "rule__ReactComponents__Group__5"


    // $ANTLR start "rule__ReactComponents__Group__5__Impl"
    // InternalMyDsl.g:6359:1: rule__ReactComponents__Group__5__Impl : ( '}' ) ;
    public final void rule__ReactComponents__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6363:1: ( ( '}' ) )
            // InternalMyDsl.g:6364:1: ( '}' )
            {
            // InternalMyDsl.g:6364:1: ( '}' )
            // InternalMyDsl.g:6365:2: '}'
            {
             before(grammarAccess.getReactComponentsAccess().getRightCurlyBracketKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getReactComponentsAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactComponents__Group__5__Impl"


    // $ANTLR start "rule__ComponentsLogic__Group__0"
    // InternalMyDsl.g:6375:1: rule__ComponentsLogic__Group__0 : rule__ComponentsLogic__Group__0__Impl rule__ComponentsLogic__Group__1 ;
    public final void rule__ComponentsLogic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6379:1: ( rule__ComponentsLogic__Group__0__Impl rule__ComponentsLogic__Group__1 )
            // InternalMyDsl.g:6380:2: rule__ComponentsLogic__Group__0__Impl rule__ComponentsLogic__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:6387:1: rule__ComponentsLogic__Group__0__Impl : ( 'LogicComponents' ) ;
    public final void rule__ComponentsLogic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6391:1: ( ( 'LogicComponents' ) )
            // InternalMyDsl.g:6392:1: ( 'LogicComponents' )
            {
            // InternalMyDsl.g:6392:1: ( 'LogicComponents' )
            // InternalMyDsl.g:6393:2: 'LogicComponents'
            {
             before(grammarAccess.getComponentsLogicAccess().getLogicComponentsKeyword_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalMyDsl.g:6402:1: rule__ComponentsLogic__Group__1 : rule__ComponentsLogic__Group__1__Impl rule__ComponentsLogic__Group__2 ;
    public final void rule__ComponentsLogic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6406:1: ( rule__ComponentsLogic__Group__1__Impl rule__ComponentsLogic__Group__2 )
            // InternalMyDsl.g:6407:2: rule__ComponentsLogic__Group__1__Impl rule__ComponentsLogic__Group__2
            {
            pushFollow(FOLLOW_57);
            rule__ComponentsLogic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentsLogic__Group__2();

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
    // InternalMyDsl.g:6414:1: rule__ComponentsLogic__Group__1__Impl : ( ( rule__ComponentsLogic__NameAssignment_1 ) ) ;
    public final void rule__ComponentsLogic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6418:1: ( ( ( rule__ComponentsLogic__NameAssignment_1 ) ) )
            // InternalMyDsl.g:6419:1: ( ( rule__ComponentsLogic__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:6419:1: ( ( rule__ComponentsLogic__NameAssignment_1 ) )
            // InternalMyDsl.g:6420:2: ( rule__ComponentsLogic__NameAssignment_1 )
            {
             before(grammarAccess.getComponentsLogicAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:6421:2: ( rule__ComponentsLogic__NameAssignment_1 )
            // InternalMyDsl.g:6421:3: rule__ComponentsLogic__NameAssignment_1
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


    // $ANTLR start "rule__ComponentsLogic__Group__2"
    // InternalMyDsl.g:6429:1: rule__ComponentsLogic__Group__2 : rule__ComponentsLogic__Group__2__Impl ;
    public final void rule__ComponentsLogic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6433:1: ( rule__ComponentsLogic__Group__2__Impl )
            // InternalMyDsl.g:6434:2: rule__ComponentsLogic__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentsLogic__Group__2__Impl();

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
    // $ANTLR end "rule__ComponentsLogic__Group__2"


    // $ANTLR start "rule__ComponentsLogic__Group__2__Impl"
    // InternalMyDsl.g:6440:1: rule__ComponentsLogic__Group__2__Impl : ( ( rule__ComponentsLogic__LogiccomponentsAssignment_2 ) ) ;
    public final void rule__ComponentsLogic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6444:1: ( ( ( rule__ComponentsLogic__LogiccomponentsAssignment_2 ) ) )
            // InternalMyDsl.g:6445:1: ( ( rule__ComponentsLogic__LogiccomponentsAssignment_2 ) )
            {
            // InternalMyDsl.g:6445:1: ( ( rule__ComponentsLogic__LogiccomponentsAssignment_2 ) )
            // InternalMyDsl.g:6446:2: ( rule__ComponentsLogic__LogiccomponentsAssignment_2 )
            {
             before(grammarAccess.getComponentsLogicAccess().getLogiccomponentsAssignment_2()); 
            // InternalMyDsl.g:6447:2: ( rule__ComponentsLogic__LogiccomponentsAssignment_2 )
            // InternalMyDsl.g:6447:3: rule__ComponentsLogic__LogiccomponentsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentsLogic__LogiccomponentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentsLogicAccess().getLogiccomponentsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentsLogic__Group__2__Impl"


    // $ANTLR start "rule__LogicContent__Group__0"
    // InternalMyDsl.g:6456:1: rule__LogicContent__Group__0 : rule__LogicContent__Group__0__Impl rule__LogicContent__Group__1 ;
    public final void rule__LogicContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6460:1: ( rule__LogicContent__Group__0__Impl rule__LogicContent__Group__1 )
            // InternalMyDsl.g:6461:2: rule__LogicContent__Group__0__Impl rule__LogicContent__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__LogicContent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicContent__Group__1();

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
    // $ANTLR end "rule__LogicContent__Group__0"


    // $ANTLR start "rule__LogicContent__Group__0__Impl"
    // InternalMyDsl.g:6468:1: rule__LogicContent__Group__0__Impl : ( 'RoutingComponents' ) ;
    public final void rule__LogicContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6472:1: ( ( 'RoutingComponents' ) )
            // InternalMyDsl.g:6473:1: ( 'RoutingComponents' )
            {
            // InternalMyDsl.g:6473:1: ( 'RoutingComponents' )
            // InternalMyDsl.g:6474:2: 'RoutingComponents'
            {
             before(grammarAccess.getLogicContentAccess().getRoutingComponentsKeyword_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getLogicContentAccess().getRoutingComponentsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicContent__Group__0__Impl"


    // $ANTLR start "rule__LogicContent__Group__1"
    // InternalMyDsl.g:6483:1: rule__LogicContent__Group__1 : rule__LogicContent__Group__1__Impl rule__LogicContent__Group__2 ;
    public final void rule__LogicContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6487:1: ( rule__LogicContent__Group__1__Impl rule__LogicContent__Group__2 )
            // InternalMyDsl.g:6488:2: rule__LogicContent__Group__1__Impl rule__LogicContent__Group__2
            {
            pushFollow(FOLLOW_58);
            rule__LogicContent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicContent__Group__2();

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
    // $ANTLR end "rule__LogicContent__Group__1"


    // $ANTLR start "rule__LogicContent__Group__1__Impl"
    // InternalMyDsl.g:6495:1: rule__LogicContent__Group__1__Impl : ( ( rule__LogicContent__NameAssignment_1 ) ) ;
    public final void rule__LogicContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6499:1: ( ( ( rule__LogicContent__NameAssignment_1 ) ) )
            // InternalMyDsl.g:6500:1: ( ( rule__LogicContent__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:6500:1: ( ( rule__LogicContent__NameAssignment_1 ) )
            // InternalMyDsl.g:6501:2: ( rule__LogicContent__NameAssignment_1 )
            {
             before(grammarAccess.getLogicContentAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:6502:2: ( rule__LogicContent__NameAssignment_1 )
            // InternalMyDsl.g:6502:3: rule__LogicContent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LogicContent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLogicContentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicContent__Group__1__Impl"


    // $ANTLR start "rule__LogicContent__Group__2"
    // InternalMyDsl.g:6510:1: rule__LogicContent__Group__2 : rule__LogicContent__Group__2__Impl ;
    public final void rule__LogicContent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6514:1: ( rule__LogicContent__Group__2__Impl )
            // InternalMyDsl.g:6515:2: rule__LogicContent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicContent__Group__2__Impl();

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
    // $ANTLR end "rule__LogicContent__Group__2"


    // $ANTLR start "rule__LogicContent__Group__2__Impl"
    // InternalMyDsl.g:6521:1: rule__LogicContent__Group__2__Impl : ( ( rule__LogicContent__LogiccomponentsAssignment_2 ) ) ;
    public final void rule__LogicContent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6525:1: ( ( ( rule__LogicContent__LogiccomponentsAssignment_2 ) ) )
            // InternalMyDsl.g:6526:1: ( ( rule__LogicContent__LogiccomponentsAssignment_2 ) )
            {
            // InternalMyDsl.g:6526:1: ( ( rule__LogicContent__LogiccomponentsAssignment_2 ) )
            // InternalMyDsl.g:6527:2: ( rule__LogicContent__LogiccomponentsAssignment_2 )
            {
             before(grammarAccess.getLogicContentAccess().getLogiccomponentsAssignment_2()); 
            // InternalMyDsl.g:6528:2: ( rule__LogicContent__LogiccomponentsAssignment_2 )
            // InternalMyDsl.g:6528:3: rule__LogicContent__LogiccomponentsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LogicContent__LogiccomponentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLogicContentAccess().getLogiccomponentsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicContent__Group__2__Impl"


    // $ANTLR start "rule__LogicStructure__Group__0"
    // InternalMyDsl.g:6537:1: rule__LogicStructure__Group__0 : rule__LogicStructure__Group__0__Impl rule__LogicStructure__Group__1 ;
    public final void rule__LogicStructure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6541:1: ( rule__LogicStructure__Group__0__Impl rule__LogicStructure__Group__1 )
            // InternalMyDsl.g:6542:2: rule__LogicStructure__Group__0__Impl rule__LogicStructure__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__LogicStructure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicStructure__Group__1();

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
    // $ANTLR end "rule__LogicStructure__Group__0"


    // $ANTLR start "rule__LogicStructure__Group__0__Impl"
    // InternalMyDsl.g:6549:1: rule__LogicStructure__Group__0__Impl : ( 'AppComponent' ) ;
    public final void rule__LogicStructure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6553:1: ( ( 'AppComponent' ) )
            // InternalMyDsl.g:6554:1: ( 'AppComponent' )
            {
            // InternalMyDsl.g:6554:1: ( 'AppComponent' )
            // InternalMyDsl.g:6555:2: 'AppComponent'
            {
             before(grammarAccess.getLogicStructureAccess().getAppComponentKeyword_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getLogicStructureAccess().getAppComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicStructure__Group__0__Impl"


    // $ANTLR start "rule__LogicStructure__Group__1"
    // InternalMyDsl.g:6564:1: rule__LogicStructure__Group__1 : rule__LogicStructure__Group__1__Impl rule__LogicStructure__Group__2 ;
    public final void rule__LogicStructure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6568:1: ( rule__LogicStructure__Group__1__Impl rule__LogicStructure__Group__2 )
            // InternalMyDsl.g:6569:2: rule__LogicStructure__Group__1__Impl rule__LogicStructure__Group__2
            {
            pushFollow(FOLLOW_59);
            rule__LogicStructure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicStructure__Group__2();

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
    // $ANTLR end "rule__LogicStructure__Group__1"


    // $ANTLR start "rule__LogicStructure__Group__1__Impl"
    // InternalMyDsl.g:6576:1: rule__LogicStructure__Group__1__Impl : ( ( rule__LogicStructure__NameAssignment_1 ) ) ;
    public final void rule__LogicStructure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6580:1: ( ( ( rule__LogicStructure__NameAssignment_1 ) ) )
            // InternalMyDsl.g:6581:1: ( ( rule__LogicStructure__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:6581:1: ( ( rule__LogicStructure__NameAssignment_1 ) )
            // InternalMyDsl.g:6582:2: ( rule__LogicStructure__NameAssignment_1 )
            {
             before(grammarAccess.getLogicStructureAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:6583:2: ( rule__LogicStructure__NameAssignment_1 )
            // InternalMyDsl.g:6583:3: rule__LogicStructure__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LogicStructure__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLogicStructureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicStructure__Group__1__Impl"


    // $ANTLR start "rule__LogicStructure__Group__2"
    // InternalMyDsl.g:6591:1: rule__LogicStructure__Group__2 : rule__LogicStructure__Group__2__Impl rule__LogicStructure__Group__3 ;
    public final void rule__LogicStructure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6595:1: ( rule__LogicStructure__Group__2__Impl rule__LogicStructure__Group__3 )
            // InternalMyDsl.g:6596:2: rule__LogicStructure__Group__2__Impl rule__LogicStructure__Group__3
            {
            pushFollow(FOLLOW_60);
            rule__LogicStructure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicStructure__Group__3();

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
    // $ANTLR end "rule__LogicStructure__Group__2"


    // $ANTLR start "rule__LogicStructure__Group__2__Impl"
    // InternalMyDsl.g:6603:1: rule__LogicStructure__Group__2__Impl : ( ( rule__LogicStructure__LogiccomponentsAssignment_2 ) ) ;
    public final void rule__LogicStructure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6607:1: ( ( ( rule__LogicStructure__LogiccomponentsAssignment_2 ) ) )
            // InternalMyDsl.g:6608:1: ( ( rule__LogicStructure__LogiccomponentsAssignment_2 ) )
            {
            // InternalMyDsl.g:6608:1: ( ( rule__LogicStructure__LogiccomponentsAssignment_2 ) )
            // InternalMyDsl.g:6609:2: ( rule__LogicStructure__LogiccomponentsAssignment_2 )
            {
             before(grammarAccess.getLogicStructureAccess().getLogiccomponentsAssignment_2()); 
            // InternalMyDsl.g:6610:2: ( rule__LogicStructure__LogiccomponentsAssignment_2 )
            // InternalMyDsl.g:6610:3: rule__LogicStructure__LogiccomponentsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LogicStructure__LogiccomponentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLogicStructureAccess().getLogiccomponentsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicStructure__Group__2__Impl"


    // $ANTLR start "rule__LogicStructure__Group__3"
    // InternalMyDsl.g:6618:1: rule__LogicStructure__Group__3 : rule__LogicStructure__Group__3__Impl rule__LogicStructure__Group__4 ;
    public final void rule__LogicStructure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6622:1: ( rule__LogicStructure__Group__3__Impl rule__LogicStructure__Group__4 )
            // InternalMyDsl.g:6623:2: rule__LogicStructure__Group__3__Impl rule__LogicStructure__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__LogicStructure__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicStructure__Group__4();

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
    // $ANTLR end "rule__LogicStructure__Group__3"


    // $ANTLR start "rule__LogicStructure__Group__3__Impl"
    // InternalMyDsl.g:6630:1: rule__LogicStructure__Group__3__Impl : ( 'IndexComponent' ) ;
    public final void rule__LogicStructure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6634:1: ( ( 'IndexComponent' ) )
            // InternalMyDsl.g:6635:1: ( 'IndexComponent' )
            {
            // InternalMyDsl.g:6635:1: ( 'IndexComponent' )
            // InternalMyDsl.g:6636:2: 'IndexComponent'
            {
             before(grammarAccess.getLogicStructureAccess().getIndexComponentKeyword_3()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getLogicStructureAccess().getIndexComponentKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicStructure__Group__3__Impl"


    // $ANTLR start "rule__LogicStructure__Group__4"
    // InternalMyDsl.g:6645:1: rule__LogicStructure__Group__4 : rule__LogicStructure__Group__4__Impl ;
    public final void rule__LogicStructure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6649:1: ( rule__LogicStructure__Group__4__Impl )
            // InternalMyDsl.g:6650:2: rule__LogicStructure__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicStructure__Group__4__Impl();

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
    // $ANTLR end "rule__LogicStructure__Group__4"


    // $ANTLR start "rule__LogicStructure__Group__4__Impl"
    // InternalMyDsl.g:6656:1: rule__LogicStructure__Group__4__Impl : ( ( rule__LogicStructure__NameAssignment_4 ) ) ;
    public final void rule__LogicStructure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6660:1: ( ( ( rule__LogicStructure__NameAssignment_4 ) ) )
            // InternalMyDsl.g:6661:1: ( ( rule__LogicStructure__NameAssignment_4 ) )
            {
            // InternalMyDsl.g:6661:1: ( ( rule__LogicStructure__NameAssignment_4 ) )
            // InternalMyDsl.g:6662:2: ( rule__LogicStructure__NameAssignment_4 )
            {
             before(grammarAccess.getLogicStructureAccess().getNameAssignment_4()); 
            // InternalMyDsl.g:6663:2: ( rule__LogicStructure__NameAssignment_4 )
            // InternalMyDsl.g:6663:3: rule__LogicStructure__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LogicStructure__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLogicStructureAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicStructure__Group__4__Impl"


    // $ANTLR start "rule__ComponentsUI__Group__0"
    // InternalMyDsl.g:6672:1: rule__ComponentsUI__Group__0 : rule__ComponentsUI__Group__0__Impl rule__ComponentsUI__Group__1 ;
    public final void rule__ComponentsUI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6676:1: ( rule__ComponentsUI__Group__0__Impl rule__ComponentsUI__Group__1 )
            // InternalMyDsl.g:6677:2: rule__ComponentsUI__Group__0__Impl rule__ComponentsUI__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:6684:1: rule__ComponentsUI__Group__0__Impl : ( 'UIComponents' ) ;
    public final void rule__ComponentsUI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6688:1: ( ( 'UIComponents' ) )
            // InternalMyDsl.g:6689:1: ( 'UIComponents' )
            {
            // InternalMyDsl.g:6689:1: ( 'UIComponents' )
            // InternalMyDsl.g:6690:2: 'UIComponents'
            {
             before(grammarAccess.getComponentsUIAccess().getUIComponentsKeyword_0()); 
            match(input,74,FOLLOW_2); 
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
    // InternalMyDsl.g:6699:1: rule__ComponentsUI__Group__1 : rule__ComponentsUI__Group__1__Impl rule__ComponentsUI__Group__2 ;
    public final void rule__ComponentsUI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6703:1: ( rule__ComponentsUI__Group__1__Impl rule__ComponentsUI__Group__2 )
            // InternalMyDsl.g:6704:2: rule__ComponentsUI__Group__1__Impl rule__ComponentsUI__Group__2
            {
            pushFollow(FOLLOW_61);
            rule__ComponentsUI__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentsUI__Group__2();

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
    // InternalMyDsl.g:6711:1: rule__ComponentsUI__Group__1__Impl : ( ( rule__ComponentsUI__NameAssignment_1 ) ) ;
    public final void rule__ComponentsUI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6715:1: ( ( ( rule__ComponentsUI__NameAssignment_1 ) ) )
            // InternalMyDsl.g:6716:1: ( ( rule__ComponentsUI__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:6716:1: ( ( rule__ComponentsUI__NameAssignment_1 ) )
            // InternalMyDsl.g:6717:2: ( rule__ComponentsUI__NameAssignment_1 )
            {
             before(grammarAccess.getComponentsUIAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:6718:2: ( rule__ComponentsUI__NameAssignment_1 )
            // InternalMyDsl.g:6718:3: rule__ComponentsUI__NameAssignment_1
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


    // $ANTLR start "rule__ComponentsUI__Group__2"
    // InternalMyDsl.g:6726:1: rule__ComponentsUI__Group__2 : rule__ComponentsUI__Group__2__Impl ;
    public final void rule__ComponentsUI__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6730:1: ( rule__ComponentsUI__Group__2__Impl )
            // InternalMyDsl.g:6731:2: rule__ComponentsUI__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentsUI__Group__2__Impl();

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
    // $ANTLR end "rule__ComponentsUI__Group__2"


    // $ANTLR start "rule__ComponentsUI__Group__2__Impl"
    // InternalMyDsl.g:6737:1: rule__ComponentsUI__Group__2__Impl : ( ( rule__ComponentsUI__UicomponentsAssignment_2 ) ) ;
    public final void rule__ComponentsUI__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6741:1: ( ( ( rule__ComponentsUI__UicomponentsAssignment_2 ) ) )
            // InternalMyDsl.g:6742:1: ( ( rule__ComponentsUI__UicomponentsAssignment_2 ) )
            {
            // InternalMyDsl.g:6742:1: ( ( rule__ComponentsUI__UicomponentsAssignment_2 ) )
            // InternalMyDsl.g:6743:2: ( rule__ComponentsUI__UicomponentsAssignment_2 )
            {
             before(grammarAccess.getComponentsUIAccess().getUicomponentsAssignment_2()); 
            // InternalMyDsl.g:6744:2: ( rule__ComponentsUI__UicomponentsAssignment_2 )
            // InternalMyDsl.g:6744:3: rule__ComponentsUI__UicomponentsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentsUI__UicomponentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentsUIAccess().getUicomponentsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentsUI__Group__2__Impl"


    // $ANTLR start "rule__UIContent__Group__0"
    // InternalMyDsl.g:6753:1: rule__UIContent__Group__0 : rule__UIContent__Group__0__Impl rule__UIContent__Group__1 ;
    public final void rule__UIContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6757:1: ( rule__UIContent__Group__0__Impl rule__UIContent__Group__1 )
            // InternalMyDsl.g:6758:2: rule__UIContent__Group__0__Impl rule__UIContent__Group__1
            {
            pushFollow(FOLLOW_62);
            rule__UIContent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UIContent__Group__1();

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
    // $ANTLR end "rule__UIContent__Group__0"


    // $ANTLR start "rule__UIContent__Group__0__Impl"
    // InternalMyDsl.g:6765:1: rule__UIContent__Group__0__Impl : ( ( ( rule__UIContent__Group_0__0 ) ) ( ( rule__UIContent__Group_0__0 )* ) ) ;
    public final void rule__UIContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6769:1: ( ( ( ( rule__UIContent__Group_0__0 ) ) ( ( rule__UIContent__Group_0__0 )* ) ) )
            // InternalMyDsl.g:6770:1: ( ( ( rule__UIContent__Group_0__0 ) ) ( ( rule__UIContent__Group_0__0 )* ) )
            {
            // InternalMyDsl.g:6770:1: ( ( ( rule__UIContent__Group_0__0 ) ) ( ( rule__UIContent__Group_0__0 )* ) )
            // InternalMyDsl.g:6771:2: ( ( rule__UIContent__Group_0__0 ) ) ( ( rule__UIContent__Group_0__0 )* )
            {
            // InternalMyDsl.g:6771:2: ( ( rule__UIContent__Group_0__0 ) )
            // InternalMyDsl.g:6772:3: ( rule__UIContent__Group_0__0 )
            {
             before(grammarAccess.getUIContentAccess().getGroup_0()); 
            // InternalMyDsl.g:6773:3: ( rule__UIContent__Group_0__0 )
            // InternalMyDsl.g:6773:4: rule__UIContent__Group_0__0
            {
            pushFollow(FOLLOW_63);
            rule__UIContent__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getUIContentAccess().getGroup_0()); 

            }

            // InternalMyDsl.g:6776:2: ( ( rule__UIContent__Group_0__0 )* )
            // InternalMyDsl.g:6777:3: ( rule__UIContent__Group_0__0 )*
            {
             before(grammarAccess.getUIContentAccess().getGroup_0()); 
            // InternalMyDsl.g:6778:3: ( rule__UIContent__Group_0__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==75) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:6778:4: rule__UIContent__Group_0__0
            	    {
            	    pushFollow(FOLLOW_63);
            	    rule__UIContent__Group_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getUIContentAccess().getGroup_0()); 

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
    // $ANTLR end "rule__UIContent__Group__0__Impl"


    // $ANTLR start "rule__UIContent__Group__1"
    // InternalMyDsl.g:6787:1: rule__UIContent__Group__1 : rule__UIContent__Group__1__Impl ;
    public final void rule__UIContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6791:1: ( rule__UIContent__Group__1__Impl )
            // InternalMyDsl.g:6792:2: rule__UIContent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UIContent__Group__1__Impl();

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
    // $ANTLR end "rule__UIContent__Group__1"


    // $ANTLR start "rule__UIContent__Group__1__Impl"
    // InternalMyDsl.g:6798:1: rule__UIContent__Group__1__Impl : ( ( ( rule__UIContent__Group_1__0 ) ) ( ( rule__UIContent__Group_1__0 )* ) ) ;
    public final void rule__UIContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6802:1: ( ( ( ( rule__UIContent__Group_1__0 ) ) ( ( rule__UIContent__Group_1__0 )* ) ) )
            // InternalMyDsl.g:6803:1: ( ( ( rule__UIContent__Group_1__0 ) ) ( ( rule__UIContent__Group_1__0 )* ) )
            {
            // InternalMyDsl.g:6803:1: ( ( ( rule__UIContent__Group_1__0 ) ) ( ( rule__UIContent__Group_1__0 )* ) )
            // InternalMyDsl.g:6804:2: ( ( rule__UIContent__Group_1__0 ) ) ( ( rule__UIContent__Group_1__0 )* )
            {
            // InternalMyDsl.g:6804:2: ( ( rule__UIContent__Group_1__0 ) )
            // InternalMyDsl.g:6805:3: ( rule__UIContent__Group_1__0 )
            {
             before(grammarAccess.getUIContentAccess().getGroup_1()); 
            // InternalMyDsl.g:6806:3: ( rule__UIContent__Group_1__0 )
            // InternalMyDsl.g:6806:4: rule__UIContent__Group_1__0
            {
            pushFollow(FOLLOW_64);
            rule__UIContent__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getUIContentAccess().getGroup_1()); 

            }

            // InternalMyDsl.g:6809:2: ( ( rule__UIContent__Group_1__0 )* )
            // InternalMyDsl.g:6810:3: ( rule__UIContent__Group_1__0 )*
            {
             before(grammarAccess.getUIContentAccess().getGroup_1()); 
            // InternalMyDsl.g:6811:3: ( rule__UIContent__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==76) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:6811:4: rule__UIContent__Group_1__0
            	    {
            	    pushFollow(FOLLOW_64);
            	    rule__UIContent__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getUIContentAccess().getGroup_1()); 

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
    // $ANTLR end "rule__UIContent__Group__1__Impl"


    // $ANTLR start "rule__UIContent__Group_0__0"
    // InternalMyDsl.g:6821:1: rule__UIContent__Group_0__0 : rule__UIContent__Group_0__0__Impl rule__UIContent__Group_0__1 ;
    public final void rule__UIContent__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6825:1: ( rule__UIContent__Group_0__0__Impl rule__UIContent__Group_0__1 )
            // InternalMyDsl.g:6826:2: rule__UIContent__Group_0__0__Impl rule__UIContent__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__UIContent__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UIContent__Group_0__1();

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
    // $ANTLR end "rule__UIContent__Group_0__0"


    // $ANTLR start "rule__UIContent__Group_0__0__Impl"
    // InternalMyDsl.g:6833:1: rule__UIContent__Group_0__0__Impl : ( 'ViewComponent' ) ;
    public final void rule__UIContent__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6837:1: ( ( 'ViewComponent' ) )
            // InternalMyDsl.g:6838:1: ( 'ViewComponent' )
            {
            // InternalMyDsl.g:6838:1: ( 'ViewComponent' )
            // InternalMyDsl.g:6839:2: 'ViewComponent'
            {
             before(grammarAccess.getUIContentAccess().getViewComponentKeyword_0_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getUIContentAccess().getViewComponentKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContent__Group_0__0__Impl"


    // $ANTLR start "rule__UIContent__Group_0__1"
    // InternalMyDsl.g:6848:1: rule__UIContent__Group_0__1 : rule__UIContent__Group_0__1__Impl rule__UIContent__Group_0__2 ;
    public final void rule__UIContent__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6852:1: ( rule__UIContent__Group_0__1__Impl rule__UIContent__Group_0__2 )
            // InternalMyDsl.g:6853:2: rule__UIContent__Group_0__1__Impl rule__UIContent__Group_0__2
            {
            pushFollow(FOLLOW_59);
            rule__UIContent__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UIContent__Group_0__2();

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
    // $ANTLR end "rule__UIContent__Group_0__1"


    // $ANTLR start "rule__UIContent__Group_0__1__Impl"
    // InternalMyDsl.g:6860:1: rule__UIContent__Group_0__1__Impl : ( ( rule__UIContent__NameAssignment_0_1 ) ) ;
    public final void rule__UIContent__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6864:1: ( ( ( rule__UIContent__NameAssignment_0_1 ) ) )
            // InternalMyDsl.g:6865:1: ( ( rule__UIContent__NameAssignment_0_1 ) )
            {
            // InternalMyDsl.g:6865:1: ( ( rule__UIContent__NameAssignment_0_1 ) )
            // InternalMyDsl.g:6866:2: ( rule__UIContent__NameAssignment_0_1 )
            {
             before(grammarAccess.getUIContentAccess().getNameAssignment_0_1()); 
            // InternalMyDsl.g:6867:2: ( rule__UIContent__NameAssignment_0_1 )
            // InternalMyDsl.g:6867:3: rule__UIContent__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__UIContent__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getUIContentAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContent__Group_0__1__Impl"


    // $ANTLR start "rule__UIContent__Group_0__2"
    // InternalMyDsl.g:6875:1: rule__UIContent__Group_0__2 : rule__UIContent__Group_0__2__Impl ;
    public final void rule__UIContent__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6879:1: ( rule__UIContent__Group_0__2__Impl )
            // InternalMyDsl.g:6880:2: rule__UIContent__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UIContent__Group_0__2__Impl();

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
    // $ANTLR end "rule__UIContent__Group_0__2"


    // $ANTLR start "rule__UIContent__Group_0__2__Impl"
    // InternalMyDsl.g:6886:1: rule__UIContent__Group_0__2__Impl : ( ( rule__UIContent__UicontentAssignment_0_2 ) ) ;
    public final void rule__UIContent__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6890:1: ( ( ( rule__UIContent__UicontentAssignment_0_2 ) ) )
            // InternalMyDsl.g:6891:1: ( ( rule__UIContent__UicontentAssignment_0_2 ) )
            {
            // InternalMyDsl.g:6891:1: ( ( rule__UIContent__UicontentAssignment_0_2 ) )
            // InternalMyDsl.g:6892:2: ( rule__UIContent__UicontentAssignment_0_2 )
            {
             before(grammarAccess.getUIContentAccess().getUicontentAssignment_0_2()); 
            // InternalMyDsl.g:6893:2: ( rule__UIContent__UicontentAssignment_0_2 )
            // InternalMyDsl.g:6893:3: rule__UIContent__UicontentAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__UIContent__UicontentAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getUIContentAccess().getUicontentAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContent__Group_0__2__Impl"


    // $ANTLR start "rule__UIContent__Group_1__0"
    // InternalMyDsl.g:6902:1: rule__UIContent__Group_1__0 : rule__UIContent__Group_1__0__Impl rule__UIContent__Group_1__1 ;
    public final void rule__UIContent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6906:1: ( rule__UIContent__Group_1__0__Impl rule__UIContent__Group_1__1 )
            // InternalMyDsl.g:6907:2: rule__UIContent__Group_1__0__Impl rule__UIContent__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__UIContent__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UIContent__Group_1__1();

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
    // $ANTLR end "rule__UIContent__Group_1__0"


    // $ANTLR start "rule__UIContent__Group_1__0__Impl"
    // InternalMyDsl.g:6914:1: rule__UIContent__Group_1__0__Impl : ( 'Subcomponents' ) ;
    public final void rule__UIContent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6918:1: ( ( 'Subcomponents' ) )
            // InternalMyDsl.g:6919:1: ( 'Subcomponents' )
            {
            // InternalMyDsl.g:6919:1: ( 'Subcomponents' )
            // InternalMyDsl.g:6920:2: 'Subcomponents'
            {
             before(grammarAccess.getUIContentAccess().getSubcomponentsKeyword_1_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getUIContentAccess().getSubcomponentsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContent__Group_1__0__Impl"


    // $ANTLR start "rule__UIContent__Group_1__1"
    // InternalMyDsl.g:6929:1: rule__UIContent__Group_1__1 : rule__UIContent__Group_1__1__Impl rule__UIContent__Group_1__2 ;
    public final void rule__UIContent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6933:1: ( rule__UIContent__Group_1__1__Impl rule__UIContent__Group_1__2 )
            // InternalMyDsl.g:6934:2: rule__UIContent__Group_1__1__Impl rule__UIContent__Group_1__2
            {
            pushFollow(FOLLOW_59);
            rule__UIContent__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UIContent__Group_1__2();

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
    // $ANTLR end "rule__UIContent__Group_1__1"


    // $ANTLR start "rule__UIContent__Group_1__1__Impl"
    // InternalMyDsl.g:6941:1: rule__UIContent__Group_1__1__Impl : ( ( rule__UIContent__NameAssignment_1_1 ) ) ;
    public final void rule__UIContent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6945:1: ( ( ( rule__UIContent__NameAssignment_1_1 ) ) )
            // InternalMyDsl.g:6946:1: ( ( rule__UIContent__NameAssignment_1_1 ) )
            {
            // InternalMyDsl.g:6946:1: ( ( rule__UIContent__NameAssignment_1_1 ) )
            // InternalMyDsl.g:6947:2: ( rule__UIContent__NameAssignment_1_1 )
            {
             before(grammarAccess.getUIContentAccess().getNameAssignment_1_1()); 
            // InternalMyDsl.g:6948:2: ( rule__UIContent__NameAssignment_1_1 )
            // InternalMyDsl.g:6948:3: rule__UIContent__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__UIContent__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getUIContentAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContent__Group_1__1__Impl"


    // $ANTLR start "rule__UIContent__Group_1__2"
    // InternalMyDsl.g:6956:1: rule__UIContent__Group_1__2 : rule__UIContent__Group_1__2__Impl ;
    public final void rule__UIContent__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6960:1: ( rule__UIContent__Group_1__2__Impl )
            // InternalMyDsl.g:6961:2: rule__UIContent__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UIContent__Group_1__2__Impl();

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
    // $ANTLR end "rule__UIContent__Group_1__2"


    // $ANTLR start "rule__UIContent__Group_1__2__Impl"
    // InternalMyDsl.g:6967:1: rule__UIContent__Group_1__2__Impl : ( ( rule__UIContent__UicontentAssignment_1_2 ) ) ;
    public final void rule__UIContent__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6971:1: ( ( ( rule__UIContent__UicontentAssignment_1_2 ) ) )
            // InternalMyDsl.g:6972:1: ( ( rule__UIContent__UicontentAssignment_1_2 ) )
            {
            // InternalMyDsl.g:6972:1: ( ( rule__UIContent__UicontentAssignment_1_2 ) )
            // InternalMyDsl.g:6973:2: ( rule__UIContent__UicontentAssignment_1_2 )
            {
             before(grammarAccess.getUIContentAccess().getUicontentAssignment_1_2()); 
            // InternalMyDsl.g:6974:2: ( rule__UIContent__UicontentAssignment_1_2 )
            // InternalMyDsl.g:6974:3: rule__UIContent__UicontentAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__UIContent__UicontentAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getUIContentAccess().getUicontentAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContent__Group_1__2__Impl"


    // $ANTLR start "rule__ComponentClass__Group__0"
    // InternalMyDsl.g:6983:1: rule__ComponentClass__Group__0 : rule__ComponentClass__Group__0__Impl rule__ComponentClass__Group__1 ;
    public final void rule__ComponentClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6987:1: ( rule__ComponentClass__Group__0__Impl rule__ComponentClass__Group__1 )
            // InternalMyDsl.g:6988:2: rule__ComponentClass__Group__0__Impl rule__ComponentClass__Group__1
            {
            pushFollow(FOLLOW_65);
            rule__ComponentClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentClass__Group__1();

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
    // $ANTLR end "rule__ComponentClass__Group__0"


    // $ANTLR start "rule__ComponentClass__Group__0__Impl"
    // InternalMyDsl.g:6995:1: rule__ComponentClass__Group__0__Impl : ( ( rule__ComponentClass__ComponentclassAssignment_0 ) ) ;
    public final void rule__ComponentClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6999:1: ( ( ( rule__ComponentClass__ComponentclassAssignment_0 ) ) )
            // InternalMyDsl.g:7000:1: ( ( rule__ComponentClass__ComponentclassAssignment_0 ) )
            {
            // InternalMyDsl.g:7000:1: ( ( rule__ComponentClass__ComponentclassAssignment_0 ) )
            // InternalMyDsl.g:7001:2: ( rule__ComponentClass__ComponentclassAssignment_0 )
            {
             before(grammarAccess.getComponentClassAccess().getComponentclassAssignment_0()); 
            // InternalMyDsl.g:7002:2: ( rule__ComponentClass__ComponentclassAssignment_0 )
            // InternalMyDsl.g:7002:3: rule__ComponentClass__ComponentclassAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentClass__ComponentclassAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComponentClassAccess().getComponentclassAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentClass__Group__0__Impl"


    // $ANTLR start "rule__ComponentClass__Group__1"
    // InternalMyDsl.g:7010:1: rule__ComponentClass__Group__1 : rule__ComponentClass__Group__1__Impl ;
    public final void rule__ComponentClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7014:1: ( rule__ComponentClass__Group__1__Impl )
            // InternalMyDsl.g:7015:2: rule__ComponentClass__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentClass__Group__1__Impl();

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
    // $ANTLR end "rule__ComponentClass__Group__1"


    // $ANTLR start "rule__ComponentClass__Group__1__Impl"
    // InternalMyDsl.g:7021:1: rule__ComponentClass__Group__1__Impl : ( ( rule__ComponentClass__ComponentclassAssignment_1 ) ) ;
    public final void rule__ComponentClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7025:1: ( ( ( rule__ComponentClass__ComponentclassAssignment_1 ) ) )
            // InternalMyDsl.g:7026:1: ( ( rule__ComponentClass__ComponentclassAssignment_1 ) )
            {
            // InternalMyDsl.g:7026:1: ( ( rule__ComponentClass__ComponentclassAssignment_1 ) )
            // InternalMyDsl.g:7027:2: ( rule__ComponentClass__ComponentclassAssignment_1 )
            {
             before(grammarAccess.getComponentClassAccess().getComponentclassAssignment_1()); 
            // InternalMyDsl.g:7028:2: ( rule__ComponentClass__ComponentclassAssignment_1 )
            // InternalMyDsl.g:7028:3: rule__ComponentClass__ComponentclassAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentClass__ComponentclassAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentClassAccess().getComponentclassAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentClass__Group__1__Impl"


    // $ANTLR start "rule__ReactFunctions__Group__0"
    // InternalMyDsl.g:7037:1: rule__ReactFunctions__Group__0 : rule__ReactFunctions__Group__0__Impl rule__ReactFunctions__Group__1 ;
    public final void rule__ReactFunctions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7041:1: ( rule__ReactFunctions__Group__0__Impl rule__ReactFunctions__Group__1 )
            // InternalMyDsl.g:7042:2: rule__ReactFunctions__Group__0__Impl rule__ReactFunctions__Group__1
            {
            pushFollow(FOLLOW_66);
            rule__ReactFunctions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactFunctions__Group__1();

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
    // $ANTLR end "rule__ReactFunctions__Group__0"


    // $ANTLR start "rule__ReactFunctions__Group__0__Impl"
    // InternalMyDsl.g:7049:1: rule__ReactFunctions__Group__0__Impl : ( ( rule__ReactFunctions__ComponentclassAssignment_0 ) ) ;
    public final void rule__ReactFunctions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7053:1: ( ( ( rule__ReactFunctions__ComponentclassAssignment_0 ) ) )
            // InternalMyDsl.g:7054:1: ( ( rule__ReactFunctions__ComponentclassAssignment_0 ) )
            {
            // InternalMyDsl.g:7054:1: ( ( rule__ReactFunctions__ComponentclassAssignment_0 ) )
            // InternalMyDsl.g:7055:2: ( rule__ReactFunctions__ComponentclassAssignment_0 )
            {
             before(grammarAccess.getReactFunctionsAccess().getComponentclassAssignment_0()); 
            // InternalMyDsl.g:7056:2: ( rule__ReactFunctions__ComponentclassAssignment_0 )
            // InternalMyDsl.g:7056:3: rule__ReactFunctions__ComponentclassAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ReactFunctions__ComponentclassAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getReactFunctionsAccess().getComponentclassAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactFunctions__Group__0__Impl"


    // $ANTLR start "rule__ReactFunctions__Group__1"
    // InternalMyDsl.g:7064:1: rule__ReactFunctions__Group__1 : rule__ReactFunctions__Group__1__Impl rule__ReactFunctions__Group__2 ;
    public final void rule__ReactFunctions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7068:1: ( rule__ReactFunctions__Group__1__Impl rule__ReactFunctions__Group__2 )
            // InternalMyDsl.g:7069:2: rule__ReactFunctions__Group__1__Impl rule__ReactFunctions__Group__2
            {
            pushFollow(FOLLOW_66);
            rule__ReactFunctions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactFunctions__Group__2();

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
    // $ANTLR end "rule__ReactFunctions__Group__1"


    // $ANTLR start "rule__ReactFunctions__Group__1__Impl"
    // InternalMyDsl.g:7076:1: rule__ReactFunctions__Group__1__Impl : ( ( rule__ReactFunctions__LifecycleclassAssignment_1 )* ) ;
    public final void rule__ReactFunctions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7080:1: ( ( ( rule__ReactFunctions__LifecycleclassAssignment_1 )* ) )
            // InternalMyDsl.g:7081:1: ( ( rule__ReactFunctions__LifecycleclassAssignment_1 )* )
            {
            // InternalMyDsl.g:7081:1: ( ( rule__ReactFunctions__LifecycleclassAssignment_1 )* )
            // InternalMyDsl.g:7082:2: ( rule__ReactFunctions__LifecycleclassAssignment_1 )*
            {
             before(grammarAccess.getReactFunctionsAccess().getLifecycleclassAssignment_1()); 
            // InternalMyDsl.g:7083:2: ( rule__ReactFunctions__LifecycleclassAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==80||(LA16_0>=82 && LA16_0<=83)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:7083:3: rule__ReactFunctions__LifecycleclassAssignment_1
            	    {
            	    pushFollow(FOLLOW_67);
            	    rule__ReactFunctions__LifecycleclassAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getReactFunctionsAccess().getLifecycleclassAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactFunctions__Group__1__Impl"


    // $ANTLR start "rule__ReactFunctions__Group__2"
    // InternalMyDsl.g:7091:1: rule__ReactFunctions__Group__2 : rule__ReactFunctions__Group__2__Impl rule__ReactFunctions__Group__3 ;
    public final void rule__ReactFunctions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7095:1: ( rule__ReactFunctions__Group__2__Impl rule__ReactFunctions__Group__3 )
            // InternalMyDsl.g:7096:2: rule__ReactFunctions__Group__2__Impl rule__ReactFunctions__Group__3
            {
            pushFollow(FOLLOW_66);
            rule__ReactFunctions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactFunctions__Group__3();

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
    // $ANTLR end "rule__ReactFunctions__Group__2"


    // $ANTLR start "rule__ReactFunctions__Group__2__Impl"
    // InternalMyDsl.g:7103:1: rule__ReactFunctions__Group__2__Impl : ( ( rule__ReactFunctions__ComponentclassAssignment_2 )* ) ;
    public final void rule__ReactFunctions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7107:1: ( ( ( rule__ReactFunctions__ComponentclassAssignment_2 )* ) )
            // InternalMyDsl.g:7108:1: ( ( rule__ReactFunctions__ComponentclassAssignment_2 )* )
            {
            // InternalMyDsl.g:7108:1: ( ( rule__ReactFunctions__ComponentclassAssignment_2 )* )
            // InternalMyDsl.g:7109:2: ( rule__ReactFunctions__ComponentclassAssignment_2 )*
            {
             before(grammarAccess.getReactFunctionsAccess().getComponentclassAssignment_2()); 
            // InternalMyDsl.g:7110:2: ( rule__ReactFunctions__ComponentclassAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:7110:3: rule__ReactFunctions__ComponentclassAssignment_2
            	    {
            	    pushFollow(FOLLOW_68);
            	    rule__ReactFunctions__ComponentclassAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getReactFunctionsAccess().getComponentclassAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactFunctions__Group__2__Impl"


    // $ANTLR start "rule__ReactFunctions__Group__3"
    // InternalMyDsl.g:7118:1: rule__ReactFunctions__Group__3 : rule__ReactFunctions__Group__3__Impl ;
    public final void rule__ReactFunctions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7122:1: ( rule__ReactFunctions__Group__3__Impl )
            // InternalMyDsl.g:7123:2: rule__ReactFunctions__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactFunctions__Group__3__Impl();

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
    // $ANTLR end "rule__ReactFunctions__Group__3"


    // $ANTLR start "rule__ReactFunctions__Group__3__Impl"
    // InternalMyDsl.g:7129:1: rule__ReactFunctions__Group__3__Impl : ( ( rule__ReactFunctions__RenderclassAssignment_3 ) ) ;
    public final void rule__ReactFunctions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7133:1: ( ( ( rule__ReactFunctions__RenderclassAssignment_3 ) ) )
            // InternalMyDsl.g:7134:1: ( ( rule__ReactFunctions__RenderclassAssignment_3 ) )
            {
            // InternalMyDsl.g:7134:1: ( ( rule__ReactFunctions__RenderclassAssignment_3 ) )
            // InternalMyDsl.g:7135:2: ( rule__ReactFunctions__RenderclassAssignment_3 )
            {
             before(grammarAccess.getReactFunctionsAccess().getRenderclassAssignment_3()); 
            // InternalMyDsl.g:7136:2: ( rule__ReactFunctions__RenderclassAssignment_3 )
            // InternalMyDsl.g:7136:3: rule__ReactFunctions__RenderclassAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ReactFunctions__RenderclassAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReactFunctionsAccess().getRenderclassAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactFunctions__Group__3__Impl"


    // $ANTLR start "rule__ReactConstructor__Group__0"
    // InternalMyDsl.g:7145:1: rule__ReactConstructor__Group__0 : rule__ReactConstructor__Group__0__Impl rule__ReactConstructor__Group__1 ;
    public final void rule__ReactConstructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7149:1: ( rule__ReactConstructor__Group__0__Impl rule__ReactConstructor__Group__1 )
            // InternalMyDsl.g:7150:2: rule__ReactConstructor__Group__0__Impl rule__ReactConstructor__Group__1
            {
            pushFollow(FOLLOW_69);
            rule__ReactConstructor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactConstructor__Group__1();

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
    // $ANTLR end "rule__ReactConstructor__Group__0"


    // $ANTLR start "rule__ReactConstructor__Group__0__Impl"
    // InternalMyDsl.g:7157:1: rule__ReactConstructor__Group__0__Impl : ( 'Constructor' ) ;
    public final void rule__ReactConstructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7161:1: ( ( 'Constructor' ) )
            // InternalMyDsl.g:7162:1: ( 'Constructor' )
            {
            // InternalMyDsl.g:7162:1: ( 'Constructor' )
            // InternalMyDsl.g:7163:2: 'Constructor'
            {
             before(grammarAccess.getReactConstructorAccess().getConstructorKeyword_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getReactConstructorAccess().getConstructorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactConstructor__Group__0__Impl"


    // $ANTLR start "rule__ReactConstructor__Group__1"
    // InternalMyDsl.g:7172:1: rule__ReactConstructor__Group__1 : rule__ReactConstructor__Group__1__Impl rule__ReactConstructor__Group__2 ;
    public final void rule__ReactConstructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7176:1: ( rule__ReactConstructor__Group__1__Impl rule__ReactConstructor__Group__2 )
            // InternalMyDsl.g:7177:2: rule__ReactConstructor__Group__1__Impl rule__ReactConstructor__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ReactConstructor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactConstructor__Group__2();

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
    // $ANTLR end "rule__ReactConstructor__Group__1"


    // $ANTLR start "rule__ReactConstructor__Group__1__Impl"
    // InternalMyDsl.g:7184:1: rule__ReactConstructor__Group__1__Impl : ( ( rule__ReactConstructor__ComponentclassAssignment_1 ) ) ;
    public final void rule__ReactConstructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7188:1: ( ( ( rule__ReactConstructor__ComponentclassAssignment_1 ) ) )
            // InternalMyDsl.g:7189:1: ( ( rule__ReactConstructor__ComponentclassAssignment_1 ) )
            {
            // InternalMyDsl.g:7189:1: ( ( rule__ReactConstructor__ComponentclassAssignment_1 ) )
            // InternalMyDsl.g:7190:2: ( rule__ReactConstructor__ComponentclassAssignment_1 )
            {
             before(grammarAccess.getReactConstructorAccess().getComponentclassAssignment_1()); 
            // InternalMyDsl.g:7191:2: ( rule__ReactConstructor__ComponentclassAssignment_1 )
            // InternalMyDsl.g:7191:3: rule__ReactConstructor__ComponentclassAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReactConstructor__ComponentclassAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReactConstructorAccess().getComponentclassAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactConstructor__Group__1__Impl"


    // $ANTLR start "rule__ReactConstructor__Group__2"
    // InternalMyDsl.g:7199:1: rule__ReactConstructor__Group__2 : rule__ReactConstructor__Group__2__Impl ;
    public final void rule__ReactConstructor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7203:1: ( rule__ReactConstructor__Group__2__Impl )
            // InternalMyDsl.g:7204:2: rule__ReactConstructor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactConstructor__Group__2__Impl();

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
    // $ANTLR end "rule__ReactConstructor__Group__2"


    // $ANTLR start "rule__ReactConstructor__Group__2__Impl"
    // InternalMyDsl.g:7210:1: rule__ReactConstructor__Group__2__Impl : ( ( rule__ReactConstructor__ComponentclassAssignment_2 )* ) ;
    public final void rule__ReactConstructor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7214:1: ( ( ( rule__ReactConstructor__ComponentclassAssignment_2 )* ) )
            // InternalMyDsl.g:7215:1: ( ( rule__ReactConstructor__ComponentclassAssignment_2 )* )
            {
            // InternalMyDsl.g:7215:1: ( ( rule__ReactConstructor__ComponentclassAssignment_2 )* )
            // InternalMyDsl.g:7216:2: ( rule__ReactConstructor__ComponentclassAssignment_2 )*
            {
             before(grammarAccess.getReactConstructorAccess().getComponentclassAssignment_2()); 
            // InternalMyDsl.g:7217:2: ( rule__ReactConstructor__ComponentclassAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    int LA18_2 = input.LA(2);

                    if ( (LA18_2==79) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:7217:3: rule__ReactConstructor__ComponentclassAssignment_2
            	    {
            	    pushFollow(FOLLOW_68);
            	    rule__ReactConstructor__ComponentclassAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getReactConstructorAccess().getComponentclassAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactConstructor__Group__2__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalMyDsl.g:7226:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7230:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalMyDsl.g:7231:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

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
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalMyDsl.g:7238:1: rule__State__Group__0__Impl : ( 'State' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7242:1: ( ( 'State' ) )
            // InternalMyDsl.g:7243:1: ( 'State' )
            {
            // InternalMyDsl.g:7243:1: ( 'State' )
            // InternalMyDsl.g:7244:2: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getStateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalMyDsl.g:7253:1: rule__State__Group__1 : rule__State__Group__1__Impl ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7257:1: ( rule__State__Group__1__Impl )
            // InternalMyDsl.g:7258:2: rule__State__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__1__Impl();

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
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalMyDsl.g:7264:1: rule__State__Group__1__Impl : ( ( rule__State__Group_1__0 )* ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7268:1: ( ( ( rule__State__Group_1__0 )* ) )
            // InternalMyDsl.g:7269:1: ( ( rule__State__Group_1__0 )* )
            {
            // InternalMyDsl.g:7269:1: ( ( rule__State__Group_1__0 )* )
            // InternalMyDsl.g:7270:2: ( rule__State__Group_1__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_1()); 
            // InternalMyDsl.g:7271:2: ( rule__State__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    int LA19_2 = input.LA(2);

                    if ( ((LA19_2>=16 && LA19_2<=21)) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:7271:3: rule__State__Group_1__0
            	    {
            	    pushFollow(FOLLOW_68);
            	    rule__State__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group_1__0"
    // InternalMyDsl.g:7280:1: rule__State__Group_1__0 : rule__State__Group_1__0__Impl rule__State__Group_1__1 ;
    public final void rule__State__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7284:1: ( rule__State__Group_1__0__Impl rule__State__Group_1__1 )
            // InternalMyDsl.g:7285:2: rule__State__Group_1__0__Impl rule__State__Group_1__1
            {
            pushFollow(FOLLOW_70);
            rule__State__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_1__1();

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
    // $ANTLR end "rule__State__Group_1__0"


    // $ANTLR start "rule__State__Group_1__0__Impl"
    // InternalMyDsl.g:7292:1: rule__State__Group_1__0__Impl : ( ( rule__State__NameAssignment_1_0 ) ) ;
    public final void rule__State__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7296:1: ( ( ( rule__State__NameAssignment_1_0 ) ) )
            // InternalMyDsl.g:7297:1: ( ( rule__State__NameAssignment_1_0 ) )
            {
            // InternalMyDsl.g:7297:1: ( ( rule__State__NameAssignment_1_0 ) )
            // InternalMyDsl.g:7298:2: ( rule__State__NameAssignment_1_0 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1_0()); 
            // InternalMyDsl.g:7299:2: ( rule__State__NameAssignment_1_0 )
            // InternalMyDsl.g:7299:3: rule__State__NameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_1__0__Impl"


    // $ANTLR start "rule__State__Group_1__1"
    // InternalMyDsl.g:7307:1: rule__State__Group_1__1 : rule__State__Group_1__1__Impl ;
    public final void rule__State__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7311:1: ( rule__State__Group_1__1__Impl )
            // InternalMyDsl.g:7312:2: rule__State__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_1__1__Impl();

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
    // $ANTLR end "rule__State__Group_1__1"


    // $ANTLR start "rule__State__Group_1__1__Impl"
    // InternalMyDsl.g:7318:1: rule__State__Group_1__1__Impl : ( ( rule__State__ComponentclassAssignment_1_1 ) ) ;
    public final void rule__State__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7322:1: ( ( ( rule__State__ComponentclassAssignment_1_1 ) ) )
            // InternalMyDsl.g:7323:1: ( ( rule__State__ComponentclassAssignment_1_1 ) )
            {
            // InternalMyDsl.g:7323:1: ( ( rule__State__ComponentclassAssignment_1_1 ) )
            // InternalMyDsl.g:7324:2: ( rule__State__ComponentclassAssignment_1_1 )
            {
             before(grammarAccess.getStateAccess().getComponentclassAssignment_1_1()); 
            // InternalMyDsl.g:7325:2: ( rule__State__ComponentclassAssignment_1_1 )
            // InternalMyDsl.g:7325:3: rule__State__ComponentclassAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__State__ComponentclassAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getComponentclassAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_1__1__Impl"


    // $ANTLR start "rule__CoreFunctionsDeclaration__Group__0"
    // InternalMyDsl.g:7334:1: rule__CoreFunctionsDeclaration__Group__0 : rule__CoreFunctionsDeclaration__Group__0__Impl rule__CoreFunctionsDeclaration__Group__1 ;
    public final void rule__CoreFunctionsDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7338:1: ( rule__CoreFunctionsDeclaration__Group__0__Impl rule__CoreFunctionsDeclaration__Group__1 )
            // InternalMyDsl.g:7339:2: rule__CoreFunctionsDeclaration__Group__0__Impl rule__CoreFunctionsDeclaration__Group__1
            {
            pushFollow(FOLLOW_71);
            rule__CoreFunctionsDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoreFunctionsDeclaration__Group__1();

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
    // $ANTLR end "rule__CoreFunctionsDeclaration__Group__0"


    // $ANTLR start "rule__CoreFunctionsDeclaration__Group__0__Impl"
    // InternalMyDsl.g:7346:1: rule__CoreFunctionsDeclaration__Group__0__Impl : ( ( rule__CoreFunctionsDeclaration__NameAssignment_0 ) ) ;
    public final void rule__CoreFunctionsDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7350:1: ( ( ( rule__CoreFunctionsDeclaration__NameAssignment_0 ) ) )
            // InternalMyDsl.g:7351:1: ( ( rule__CoreFunctionsDeclaration__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:7351:1: ( ( rule__CoreFunctionsDeclaration__NameAssignment_0 ) )
            // InternalMyDsl.g:7352:2: ( rule__CoreFunctionsDeclaration__NameAssignment_0 )
            {
             before(grammarAccess.getCoreFunctionsDeclarationAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:7353:2: ( rule__CoreFunctionsDeclaration__NameAssignment_0 )
            // InternalMyDsl.g:7353:3: rule__CoreFunctionsDeclaration__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CoreFunctionsDeclaration__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCoreFunctionsDeclarationAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoreFunctionsDeclaration__Group__0__Impl"


    // $ANTLR start "rule__CoreFunctionsDeclaration__Group__1"
    // InternalMyDsl.g:7361:1: rule__CoreFunctionsDeclaration__Group__1 : rule__CoreFunctionsDeclaration__Group__1__Impl ;
    public final void rule__CoreFunctionsDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7365:1: ( rule__CoreFunctionsDeclaration__Group__1__Impl )
            // InternalMyDsl.g:7366:2: rule__CoreFunctionsDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoreFunctionsDeclaration__Group__1__Impl();

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
    // $ANTLR end "rule__CoreFunctionsDeclaration__Group__1"


    // $ANTLR start "rule__CoreFunctionsDeclaration__Group__1__Impl"
    // InternalMyDsl.g:7372:1: rule__CoreFunctionsDeclaration__Group__1__Impl : ( 'FunctionBindingDeclaration' ) ;
    public final void rule__CoreFunctionsDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7376:1: ( ( 'FunctionBindingDeclaration' ) )
            // InternalMyDsl.g:7377:1: ( 'FunctionBindingDeclaration' )
            {
            // InternalMyDsl.g:7377:1: ( 'FunctionBindingDeclaration' )
            // InternalMyDsl.g:7378:2: 'FunctionBindingDeclaration'
            {
             before(grammarAccess.getCoreFunctionsDeclarationAccess().getFunctionBindingDeclarationKeyword_1()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getCoreFunctionsDeclarationAccess().getFunctionBindingDeclarationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoreFunctionsDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ReactLifeCycle__Group_0__0"
    // InternalMyDsl.g:7388:1: rule__ReactLifeCycle__Group_0__0 : rule__ReactLifeCycle__Group_0__0__Impl rule__ReactLifeCycle__Group_0__1 ;
    public final void rule__ReactLifeCycle__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7392:1: ( rule__ReactLifeCycle__Group_0__0__Impl rule__ReactLifeCycle__Group_0__1 )
            // InternalMyDsl.g:7393:2: rule__ReactLifeCycle__Group_0__0__Impl rule__ReactLifeCycle__Group_0__1
            {
            pushFollow(FOLLOW_72);
            rule__ReactLifeCycle__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactLifeCycle__Group_0__1();

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
    // $ANTLR end "rule__ReactLifeCycle__Group_0__0"


    // $ANTLR start "rule__ReactLifeCycle__Group_0__0__Impl"
    // InternalMyDsl.g:7400:1: rule__ReactLifeCycle__Group_0__0__Impl : ( 'ComponentDidMount' ) ;
    public final void rule__ReactLifeCycle__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7404:1: ( ( 'ComponentDidMount' ) )
            // InternalMyDsl.g:7405:1: ( 'ComponentDidMount' )
            {
            // InternalMyDsl.g:7405:1: ( 'ComponentDidMount' )
            // InternalMyDsl.g:7406:2: 'ComponentDidMount'
            {
             before(grammarAccess.getReactLifeCycleAccess().getComponentDidMountKeyword_0_0()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getReactLifeCycleAccess().getComponentDidMountKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactLifeCycle__Group_0__0__Impl"


    // $ANTLR start "rule__ReactLifeCycle__Group_0__1"
    // InternalMyDsl.g:7415:1: rule__ReactLifeCycle__Group_0__1 : rule__ReactLifeCycle__Group_0__1__Impl ;
    public final void rule__ReactLifeCycle__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7419:1: ( rule__ReactLifeCycle__Group_0__1__Impl )
            // InternalMyDsl.g:7420:2: rule__ReactLifeCycle__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactLifeCycle__Group_0__1__Impl();

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
    // $ANTLR end "rule__ReactLifeCycle__Group_0__1"


    // $ANTLR start "rule__ReactLifeCycle__Group_0__1__Impl"
    // InternalMyDsl.g:7426:1: rule__ReactLifeCycle__Group_0__1__Impl : ( 'FunctionStructure' ) ;
    public final void rule__ReactLifeCycle__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7430:1: ( ( 'FunctionStructure' ) )
            // InternalMyDsl.g:7431:1: ( 'FunctionStructure' )
            {
            // InternalMyDsl.g:7431:1: ( 'FunctionStructure' )
            // InternalMyDsl.g:7432:2: 'FunctionStructure'
            {
             before(grammarAccess.getReactLifeCycleAccess().getFunctionStructureKeyword_0_1()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getReactLifeCycleAccess().getFunctionStructureKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactLifeCycle__Group_0__1__Impl"


    // $ANTLR start "rule__ReactLifeCycle__Group_1__0"
    // InternalMyDsl.g:7442:1: rule__ReactLifeCycle__Group_1__0 : rule__ReactLifeCycle__Group_1__0__Impl rule__ReactLifeCycle__Group_1__1 ;
    public final void rule__ReactLifeCycle__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7446:1: ( rule__ReactLifeCycle__Group_1__0__Impl rule__ReactLifeCycle__Group_1__1 )
            // InternalMyDsl.g:7447:2: rule__ReactLifeCycle__Group_1__0__Impl rule__ReactLifeCycle__Group_1__1
            {
            pushFollow(FOLLOW_72);
            rule__ReactLifeCycle__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactLifeCycle__Group_1__1();

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
    // $ANTLR end "rule__ReactLifeCycle__Group_1__0"


    // $ANTLR start "rule__ReactLifeCycle__Group_1__0__Impl"
    // InternalMyDsl.g:7454:1: rule__ReactLifeCycle__Group_1__0__Impl : ( 'ComponentDidUpdate' ) ;
    public final void rule__ReactLifeCycle__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7458:1: ( ( 'ComponentDidUpdate' ) )
            // InternalMyDsl.g:7459:1: ( 'ComponentDidUpdate' )
            {
            // InternalMyDsl.g:7459:1: ( 'ComponentDidUpdate' )
            // InternalMyDsl.g:7460:2: 'ComponentDidUpdate'
            {
             before(grammarAccess.getReactLifeCycleAccess().getComponentDidUpdateKeyword_1_0()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getReactLifeCycleAccess().getComponentDidUpdateKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactLifeCycle__Group_1__0__Impl"


    // $ANTLR start "rule__ReactLifeCycle__Group_1__1"
    // InternalMyDsl.g:7469:1: rule__ReactLifeCycle__Group_1__1 : rule__ReactLifeCycle__Group_1__1__Impl ;
    public final void rule__ReactLifeCycle__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7473:1: ( rule__ReactLifeCycle__Group_1__1__Impl )
            // InternalMyDsl.g:7474:2: rule__ReactLifeCycle__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactLifeCycle__Group_1__1__Impl();

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
    // $ANTLR end "rule__ReactLifeCycle__Group_1__1"


    // $ANTLR start "rule__ReactLifeCycle__Group_1__1__Impl"
    // InternalMyDsl.g:7480:1: rule__ReactLifeCycle__Group_1__1__Impl : ( 'FunctionStructure' ) ;
    public final void rule__ReactLifeCycle__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7484:1: ( ( 'FunctionStructure' ) )
            // InternalMyDsl.g:7485:1: ( 'FunctionStructure' )
            {
            // InternalMyDsl.g:7485:1: ( 'FunctionStructure' )
            // InternalMyDsl.g:7486:2: 'FunctionStructure'
            {
             before(grammarAccess.getReactLifeCycleAccess().getFunctionStructureKeyword_1_1()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getReactLifeCycleAccess().getFunctionStructureKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactLifeCycle__Group_1__1__Impl"


    // $ANTLR start "rule__ReactLifeCycle__Group_2__0"
    // InternalMyDsl.g:7496:1: rule__ReactLifeCycle__Group_2__0 : rule__ReactLifeCycle__Group_2__0__Impl rule__ReactLifeCycle__Group_2__1 ;
    public final void rule__ReactLifeCycle__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7500:1: ( rule__ReactLifeCycle__Group_2__0__Impl rule__ReactLifeCycle__Group_2__1 )
            // InternalMyDsl.g:7501:2: rule__ReactLifeCycle__Group_2__0__Impl rule__ReactLifeCycle__Group_2__1
            {
            pushFollow(FOLLOW_72);
            rule__ReactLifeCycle__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactLifeCycle__Group_2__1();

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
    // $ANTLR end "rule__ReactLifeCycle__Group_2__0"


    // $ANTLR start "rule__ReactLifeCycle__Group_2__0__Impl"
    // InternalMyDsl.g:7508:1: rule__ReactLifeCycle__Group_2__0__Impl : ( 'ComponentWillUnmount' ) ;
    public final void rule__ReactLifeCycle__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7512:1: ( ( 'ComponentWillUnmount' ) )
            // InternalMyDsl.g:7513:1: ( 'ComponentWillUnmount' )
            {
            // InternalMyDsl.g:7513:1: ( 'ComponentWillUnmount' )
            // InternalMyDsl.g:7514:2: 'ComponentWillUnmount'
            {
             before(grammarAccess.getReactLifeCycleAccess().getComponentWillUnmountKeyword_2_0()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getReactLifeCycleAccess().getComponentWillUnmountKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactLifeCycle__Group_2__0__Impl"


    // $ANTLR start "rule__ReactLifeCycle__Group_2__1"
    // InternalMyDsl.g:7523:1: rule__ReactLifeCycle__Group_2__1 : rule__ReactLifeCycle__Group_2__1__Impl ;
    public final void rule__ReactLifeCycle__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7527:1: ( rule__ReactLifeCycle__Group_2__1__Impl )
            // InternalMyDsl.g:7528:2: rule__ReactLifeCycle__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactLifeCycle__Group_2__1__Impl();

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
    // $ANTLR end "rule__ReactLifeCycle__Group_2__1"


    // $ANTLR start "rule__ReactLifeCycle__Group_2__1__Impl"
    // InternalMyDsl.g:7534:1: rule__ReactLifeCycle__Group_2__1__Impl : ( 'FunctionStructure' ) ;
    public final void rule__ReactLifeCycle__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7538:1: ( ( 'FunctionStructure' ) )
            // InternalMyDsl.g:7539:1: ( 'FunctionStructure' )
            {
            // InternalMyDsl.g:7539:1: ( 'FunctionStructure' )
            // InternalMyDsl.g:7540:2: 'FunctionStructure'
            {
             before(grammarAccess.getReactLifeCycleAccess().getFunctionStructureKeyword_2_1()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getReactLifeCycleAccess().getFunctionStructureKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactLifeCycle__Group_2__1__Impl"


    // $ANTLR start "rule__ReactRender__Group__0"
    // InternalMyDsl.g:7550:1: rule__ReactRender__Group__0 : rule__ReactRender__Group__0__Impl rule__ReactRender__Group__1 ;
    public final void rule__ReactRender__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7554:1: ( rule__ReactRender__Group__0__Impl rule__ReactRender__Group__1 )
            // InternalMyDsl.g:7555:2: rule__ReactRender__Group__0__Impl rule__ReactRender__Group__1
            {
            pushFollow(FOLLOW_73);
            rule__ReactRender__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactRender__Group__1();

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
    // $ANTLR end "rule__ReactRender__Group__0"


    // $ANTLR start "rule__ReactRender__Group__0__Impl"
    // InternalMyDsl.g:7562:1: rule__ReactRender__Group__0__Impl : ( 'Render' ) ;
    public final void rule__ReactRender__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7566:1: ( ( 'Render' ) )
            // InternalMyDsl.g:7567:1: ( 'Render' )
            {
            // InternalMyDsl.g:7567:1: ( 'Render' )
            // InternalMyDsl.g:7568:2: 'Render'
            {
             before(grammarAccess.getReactRenderAccess().getRenderKeyword_0()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getReactRenderAccess().getRenderKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactRender__Group__0__Impl"


    // $ANTLR start "rule__ReactRender__Group__1"
    // InternalMyDsl.g:7577:1: rule__ReactRender__Group__1 : rule__ReactRender__Group__1__Impl ;
    public final void rule__ReactRender__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7581:1: ( rule__ReactRender__Group__1__Impl )
            // InternalMyDsl.g:7582:2: rule__ReactRender__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactRender__Group__1__Impl();

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
    // $ANTLR end "rule__ReactRender__Group__1"


    // $ANTLR start "rule__ReactRender__Group__1__Impl"
    // InternalMyDsl.g:7588:1: rule__ReactRender__Group__1__Impl : ( 'RenderContent' ) ;
    public final void rule__ReactRender__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7592:1: ( ( 'RenderContent' ) )
            // InternalMyDsl.g:7593:1: ( 'RenderContent' )
            {
            // InternalMyDsl.g:7593:1: ( 'RenderContent' )
            // InternalMyDsl.g:7594:2: 'RenderContent'
            {
             before(grammarAccess.getReactRenderAccess().getRenderContentKeyword_1()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getReactRenderAccess().getRenderContentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactRender__Group__1__Impl"


    // $ANTLR start "rule__Props__Group__0"
    // InternalMyDsl.g:7604:1: rule__Props__Group__0 : rule__Props__Group__0__Impl rule__Props__Group__1 ;
    public final void rule__Props__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7608:1: ( rule__Props__Group__0__Impl rule__Props__Group__1 )
            // InternalMyDsl.g:7609:2: rule__Props__Group__0__Impl rule__Props__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Props__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Props__Group__1();

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
    // $ANTLR end "rule__Props__Group__0"


    // $ANTLR start "rule__Props__Group__0__Impl"
    // InternalMyDsl.g:7616:1: rule__Props__Group__0__Impl : ( 'Props' ) ;
    public final void rule__Props__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7620:1: ( ( 'Props' ) )
            // InternalMyDsl.g:7621:1: ( 'Props' )
            {
            // InternalMyDsl.g:7621:1: ( 'Props' )
            // InternalMyDsl.g:7622:2: 'Props'
            {
             before(grammarAccess.getPropsAccess().getPropsKeyword_0()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getPropsAccess().getPropsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Props__Group__0__Impl"


    // $ANTLR start "rule__Props__Group__1"
    // InternalMyDsl.g:7631:1: rule__Props__Group__1 : rule__Props__Group__1__Impl ;
    public final void rule__Props__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7635:1: ( rule__Props__Group__1__Impl )
            // InternalMyDsl.g:7636:2: rule__Props__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Props__Group__1__Impl();

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
    // $ANTLR end "rule__Props__Group__1"


    // $ANTLR start "rule__Props__Group__1__Impl"
    // InternalMyDsl.g:7642:1: rule__Props__Group__1__Impl : ( ( rule__Props__Group_1__0 )* ) ;
    public final void rule__Props__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7646:1: ( ( ( rule__Props__Group_1__0 )* ) )
            // InternalMyDsl.g:7647:1: ( ( rule__Props__Group_1__0 )* )
            {
            // InternalMyDsl.g:7647:1: ( ( rule__Props__Group_1__0 )* )
            // InternalMyDsl.g:7648:2: ( rule__Props__Group_1__0 )*
            {
             before(grammarAccess.getPropsAccess().getGroup_1()); 
            // InternalMyDsl.g:7649:2: ( rule__Props__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:7649:3: rule__Props__Group_1__0
            	    {
            	    pushFollow(FOLLOW_68);
            	    rule__Props__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getPropsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Props__Group__1__Impl"


    // $ANTLR start "rule__Props__Group_1__0"
    // InternalMyDsl.g:7658:1: rule__Props__Group_1__0 : rule__Props__Group_1__0__Impl rule__Props__Group_1__1 ;
    public final void rule__Props__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7662:1: ( rule__Props__Group_1__0__Impl rule__Props__Group_1__1 )
            // InternalMyDsl.g:7663:2: rule__Props__Group_1__0__Impl rule__Props__Group_1__1
            {
            pushFollow(FOLLOW_70);
            rule__Props__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Props__Group_1__1();

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
    // $ANTLR end "rule__Props__Group_1__0"


    // $ANTLR start "rule__Props__Group_1__0__Impl"
    // InternalMyDsl.g:7670:1: rule__Props__Group_1__0__Impl : ( ( rule__Props__NameAssignment_1_0 ) ) ;
    public final void rule__Props__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7674:1: ( ( ( rule__Props__NameAssignment_1_0 ) ) )
            // InternalMyDsl.g:7675:1: ( ( rule__Props__NameAssignment_1_0 ) )
            {
            // InternalMyDsl.g:7675:1: ( ( rule__Props__NameAssignment_1_0 ) )
            // InternalMyDsl.g:7676:2: ( rule__Props__NameAssignment_1_0 )
            {
             before(grammarAccess.getPropsAccess().getNameAssignment_1_0()); 
            // InternalMyDsl.g:7677:2: ( rule__Props__NameAssignment_1_0 )
            // InternalMyDsl.g:7677:3: rule__Props__NameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Props__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPropsAccess().getNameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Props__Group_1__0__Impl"


    // $ANTLR start "rule__Props__Group_1__1"
    // InternalMyDsl.g:7685:1: rule__Props__Group_1__1 : rule__Props__Group_1__1__Impl ;
    public final void rule__Props__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7689:1: ( rule__Props__Group_1__1__Impl )
            // InternalMyDsl.g:7690:2: rule__Props__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Props__Group_1__1__Impl();

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
    // $ANTLR end "rule__Props__Group_1__1"


    // $ANTLR start "rule__Props__Group_1__1__Impl"
    // InternalMyDsl.g:7696:1: rule__Props__Group_1__1__Impl : ( ( rule__Props__ComponentclassAssignment_1_1 ) ) ;
    public final void rule__Props__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7700:1: ( ( ( rule__Props__ComponentclassAssignment_1_1 ) ) )
            // InternalMyDsl.g:7701:1: ( ( rule__Props__ComponentclassAssignment_1_1 ) )
            {
            // InternalMyDsl.g:7701:1: ( ( rule__Props__ComponentclassAssignment_1_1 ) )
            // InternalMyDsl.g:7702:2: ( rule__Props__ComponentclassAssignment_1_1 )
            {
             before(grammarAccess.getPropsAccess().getComponentclassAssignment_1_1()); 
            // InternalMyDsl.g:7703:2: ( rule__Props__ComponentclassAssignment_1_1 )
            // InternalMyDsl.g:7703:3: rule__Props__ComponentclassAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Props__ComponentclassAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPropsAccess().getComponentclassAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Props__Group_1__1__Impl"


    // $ANTLR start "rule__ReactCoreFunctions__Group__0"
    // InternalMyDsl.g:7712:1: rule__ReactCoreFunctions__Group__0 : rule__ReactCoreFunctions__Group__0__Impl rule__ReactCoreFunctions__Group__1 ;
    public final void rule__ReactCoreFunctions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7716:1: ( rule__ReactCoreFunctions__Group__0__Impl rule__ReactCoreFunctions__Group__1 )
            // InternalMyDsl.g:7717:2: rule__ReactCoreFunctions__Group__0__Impl rule__ReactCoreFunctions__Group__1
            {
            pushFollow(FOLLOW_72);
            rule__ReactCoreFunctions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactCoreFunctions__Group__1();

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
    // $ANTLR end "rule__ReactCoreFunctions__Group__0"


    // $ANTLR start "rule__ReactCoreFunctions__Group__0__Impl"
    // InternalMyDsl.g:7724:1: rule__ReactCoreFunctions__Group__0__Impl : ( ( rule__ReactCoreFunctions__NameAssignment_0 ) ) ;
    public final void rule__ReactCoreFunctions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7728:1: ( ( ( rule__ReactCoreFunctions__NameAssignment_0 ) ) )
            // InternalMyDsl.g:7729:1: ( ( rule__ReactCoreFunctions__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:7729:1: ( ( rule__ReactCoreFunctions__NameAssignment_0 ) )
            // InternalMyDsl.g:7730:2: ( rule__ReactCoreFunctions__NameAssignment_0 )
            {
             before(grammarAccess.getReactCoreFunctionsAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:7731:2: ( rule__ReactCoreFunctions__NameAssignment_0 )
            // InternalMyDsl.g:7731:3: rule__ReactCoreFunctions__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ReactCoreFunctions__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getReactCoreFunctionsAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactCoreFunctions__Group__0__Impl"


    // $ANTLR start "rule__ReactCoreFunctions__Group__1"
    // InternalMyDsl.g:7739:1: rule__ReactCoreFunctions__Group__1 : rule__ReactCoreFunctions__Group__1__Impl ;
    public final void rule__ReactCoreFunctions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7743:1: ( rule__ReactCoreFunctions__Group__1__Impl )
            // InternalMyDsl.g:7744:2: rule__ReactCoreFunctions__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactCoreFunctions__Group__1__Impl();

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
    // $ANTLR end "rule__ReactCoreFunctions__Group__1"


    // $ANTLR start "rule__ReactCoreFunctions__Group__1__Impl"
    // InternalMyDsl.g:7750:1: rule__ReactCoreFunctions__Group__1__Impl : ( 'FunctionStructure' ) ;
    public final void rule__ReactCoreFunctions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7754:1: ( ( 'FunctionStructure' ) )
            // InternalMyDsl.g:7755:1: ( 'FunctionStructure' )
            {
            // InternalMyDsl.g:7755:1: ( 'FunctionStructure' )
            // InternalMyDsl.g:7756:2: 'FunctionStructure'
            {
             before(grammarAccess.getReactCoreFunctionsAccess().getFunctionStructureKeyword_1()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getReactCoreFunctionsAccess().getFunctionStructureKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactCoreFunctions__Group__1__Impl"


    // $ANTLR start "rule__ReactActions__Group__0"
    // InternalMyDsl.g:7766:1: rule__ReactActions__Group__0 : rule__ReactActions__Group__0__Impl rule__ReactActions__Group__1 ;
    public final void rule__ReactActions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7770:1: ( rule__ReactActions__Group__0__Impl rule__ReactActions__Group__1 )
            // InternalMyDsl.g:7771:2: rule__ReactActions__Group__0__Impl rule__ReactActions__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:7778:1: rule__ReactActions__Group__0__Impl : ( 'ReactActions' ) ;
    public final void rule__ReactActions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7782:1: ( ( 'ReactActions' ) )
            // InternalMyDsl.g:7783:1: ( 'ReactActions' )
            {
            // InternalMyDsl.g:7783:1: ( 'ReactActions' )
            // InternalMyDsl.g:7784:2: 'ReactActions'
            {
             before(grammarAccess.getReactActionsAccess().getReactActionsKeyword_0()); 
            match(input,87,FOLLOW_2); 
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
    // InternalMyDsl.g:7793:1: rule__ReactActions__Group__1 : rule__ReactActions__Group__1__Impl rule__ReactActions__Group__2 ;
    public final void rule__ReactActions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7797:1: ( rule__ReactActions__Group__1__Impl rule__ReactActions__Group__2 )
            // InternalMyDsl.g:7798:2: rule__ReactActions__Group__1__Impl rule__ReactActions__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ReactActions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactActions__Group__2();

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
    // InternalMyDsl.g:7805:1: rule__ReactActions__Group__1__Impl : ( ':' ) ;
    public final void rule__ReactActions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7809:1: ( ( ':' ) )
            // InternalMyDsl.g:7810:1: ( ':' )
            {
            // InternalMyDsl.g:7810:1: ( ':' )
            // InternalMyDsl.g:7811:2: ':'
            {
             before(grammarAccess.getReactActionsAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getReactActionsAccess().getColonKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ReactActions__Group__2"
    // InternalMyDsl.g:7820:1: rule__ReactActions__Group__2 : rule__ReactActions__Group__2__Impl rule__ReactActions__Group__3 ;
    public final void rule__ReactActions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7824:1: ( rule__ReactActions__Group__2__Impl rule__ReactActions__Group__3 )
            // InternalMyDsl.g:7825:2: rule__ReactActions__Group__2__Impl rule__ReactActions__Group__3
            {
            pushFollow(FOLLOW_74);
            rule__ReactActions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactActions__Group__3();

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
    // $ANTLR end "rule__ReactActions__Group__2"


    // $ANTLR start "rule__ReactActions__Group__2__Impl"
    // InternalMyDsl.g:7832:1: rule__ReactActions__Group__2__Impl : ( '{' ) ;
    public final void rule__ReactActions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7836:1: ( ( '{' ) )
            // InternalMyDsl.g:7837:1: ( '{' )
            {
            // InternalMyDsl.g:7837:1: ( '{' )
            // InternalMyDsl.g:7838:2: '{'
            {
             before(grammarAccess.getReactActionsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getReactActionsAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactActions__Group__2__Impl"


    // $ANTLR start "rule__ReactActions__Group__3"
    // InternalMyDsl.g:7847:1: rule__ReactActions__Group__3 : rule__ReactActions__Group__3__Impl rule__ReactActions__Group__4 ;
    public final void rule__ReactActions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7851:1: ( rule__ReactActions__Group__3__Impl rule__ReactActions__Group__4 )
            // InternalMyDsl.g:7852:2: rule__ReactActions__Group__3__Impl rule__ReactActions__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__ReactActions__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactActions__Group__4();

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
    // $ANTLR end "rule__ReactActions__Group__3"


    // $ANTLR start "rule__ReactActions__Group__3__Impl"
    // InternalMyDsl.g:7859:1: rule__ReactActions__Group__3__Impl : ( ( rule__ReactActions__ReactactcontentAssignment_3 ) ) ;
    public final void rule__ReactActions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7863:1: ( ( ( rule__ReactActions__ReactactcontentAssignment_3 ) ) )
            // InternalMyDsl.g:7864:1: ( ( rule__ReactActions__ReactactcontentAssignment_3 ) )
            {
            // InternalMyDsl.g:7864:1: ( ( rule__ReactActions__ReactactcontentAssignment_3 ) )
            // InternalMyDsl.g:7865:2: ( rule__ReactActions__ReactactcontentAssignment_3 )
            {
             before(grammarAccess.getReactActionsAccess().getReactactcontentAssignment_3()); 
            // InternalMyDsl.g:7866:2: ( rule__ReactActions__ReactactcontentAssignment_3 )
            // InternalMyDsl.g:7866:3: rule__ReactActions__ReactactcontentAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ReactActions__ReactactcontentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReactActionsAccess().getReactactcontentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactActions__Group__3__Impl"


    // $ANTLR start "rule__ReactActions__Group__4"
    // InternalMyDsl.g:7874:1: rule__ReactActions__Group__4 : rule__ReactActions__Group__4__Impl ;
    public final void rule__ReactActions__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7878:1: ( rule__ReactActions__Group__4__Impl )
            // InternalMyDsl.g:7879:2: rule__ReactActions__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactActions__Group__4__Impl();

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
    // $ANTLR end "rule__ReactActions__Group__4"


    // $ANTLR start "rule__ReactActions__Group__4__Impl"
    // InternalMyDsl.g:7885:1: rule__ReactActions__Group__4__Impl : ( '}' ) ;
    public final void rule__ReactActions__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7889:1: ( ( '}' ) )
            // InternalMyDsl.g:7890:1: ( '}' )
            {
            // InternalMyDsl.g:7890:1: ( '}' )
            // InternalMyDsl.g:7891:2: '}'
            {
             before(grammarAccess.getReactActionsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getReactActionsAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactActions__Group__4__Impl"


    // $ANTLR start "rule__ReactServicesType__Group__0"
    // InternalMyDsl.g:7901:1: rule__ReactServicesType__Group__0 : rule__ReactServicesType__Group__0__Impl rule__ReactServicesType__Group__1 ;
    public final void rule__ReactServicesType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7905:1: ( rule__ReactServicesType__Group__0__Impl rule__ReactServicesType__Group__1 )
            // InternalMyDsl.g:7906:2: rule__ReactServicesType__Group__0__Impl rule__ReactServicesType__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ReactServicesType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactServicesType__Group__1();

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
    // $ANTLR end "rule__ReactServicesType__Group__0"


    // $ANTLR start "rule__ReactServicesType__Group__0__Impl"
    // InternalMyDsl.g:7913:1: rule__ReactServicesType__Group__0__Impl : ( 'ServiceType' ) ;
    public final void rule__ReactServicesType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7917:1: ( ( 'ServiceType' ) )
            // InternalMyDsl.g:7918:1: ( 'ServiceType' )
            {
            // InternalMyDsl.g:7918:1: ( 'ServiceType' )
            // InternalMyDsl.g:7919:2: 'ServiceType'
            {
             before(grammarAccess.getReactServicesTypeAccess().getServiceTypeKeyword_0()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getReactServicesTypeAccess().getServiceTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactServicesType__Group__0__Impl"


    // $ANTLR start "rule__ReactServicesType__Group__1"
    // InternalMyDsl.g:7928:1: rule__ReactServicesType__Group__1 : rule__ReactServicesType__Group__1__Impl rule__ReactServicesType__Group__2 ;
    public final void rule__ReactServicesType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7932:1: ( rule__ReactServicesType__Group__1__Impl rule__ReactServicesType__Group__2 )
            // InternalMyDsl.g:7933:2: rule__ReactServicesType__Group__1__Impl rule__ReactServicesType__Group__2
            {
            pushFollow(FOLLOW_75);
            rule__ReactServicesType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactServicesType__Group__2();

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
    // $ANTLR end "rule__ReactServicesType__Group__1"


    // $ANTLR start "rule__ReactServicesType__Group__1__Impl"
    // InternalMyDsl.g:7940:1: rule__ReactServicesType__Group__1__Impl : ( ( rule__ReactServicesType__NameAssignment_1 ) ) ;
    public final void rule__ReactServicesType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7944:1: ( ( ( rule__ReactServicesType__NameAssignment_1 ) ) )
            // InternalMyDsl.g:7945:1: ( ( rule__ReactServicesType__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:7945:1: ( ( rule__ReactServicesType__NameAssignment_1 ) )
            // InternalMyDsl.g:7946:2: ( rule__ReactServicesType__NameAssignment_1 )
            {
             before(grammarAccess.getReactServicesTypeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:7947:2: ( rule__ReactServicesType__NameAssignment_1 )
            // InternalMyDsl.g:7947:3: rule__ReactServicesType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReactServicesType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReactServicesTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactServicesType__Group__1__Impl"


    // $ANTLR start "rule__ReactServicesType__Group__2"
    // InternalMyDsl.g:7955:1: rule__ReactServicesType__Group__2 : rule__ReactServicesType__Group__2__Impl ;
    public final void rule__ReactServicesType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7959:1: ( rule__ReactServicesType__Group__2__Impl )
            // InternalMyDsl.g:7960:2: rule__ReactServicesType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactServicesType__Group__2__Impl();

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
    // $ANTLR end "rule__ReactServicesType__Group__2"


    // $ANTLR start "rule__ReactServicesType__Group__2__Impl"
    // InternalMyDsl.g:7966:1: rule__ReactServicesType__Group__2__Impl : ( 'ServiceContent' ) ;
    public final void rule__ReactServicesType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7970:1: ( ( 'ServiceContent' ) )
            // InternalMyDsl.g:7971:1: ( 'ServiceContent' )
            {
            // InternalMyDsl.g:7971:1: ( 'ServiceContent' )
            // InternalMyDsl.g:7972:2: 'ServiceContent'
            {
             before(grammarAccess.getReactServicesTypeAccess().getServiceContentKeyword_2()); 
            match(input,89,FOLLOW_2); 
             after(grammarAccess.getReactServicesTypeAccess().getServiceContentKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactServicesType__Group__2__Impl"


    // $ANTLR start "rule__ReactServicesRelation__Group__0"
    // InternalMyDsl.g:7982:1: rule__ReactServicesRelation__Group__0 : rule__ReactServicesRelation__Group__0__Impl rule__ReactServicesRelation__Group__1 ;
    public final void rule__ReactServicesRelation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7986:1: ( rule__ReactServicesRelation__Group__0__Impl rule__ReactServicesRelation__Group__1 )
            // InternalMyDsl.g:7987:2: rule__ReactServicesRelation__Group__0__Impl rule__ReactServicesRelation__Group__1
            {
            pushFollow(FOLLOW_76);
            rule__ReactServicesRelation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactServicesRelation__Group__1();

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
    // $ANTLR end "rule__ReactServicesRelation__Group__0"


    // $ANTLR start "rule__ReactServicesRelation__Group__0__Impl"
    // InternalMyDsl.g:7994:1: rule__ReactServicesRelation__Group__0__Impl : ( 'ServicesRelations' ) ;
    public final void rule__ReactServicesRelation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7998:1: ( ( 'ServicesRelations' ) )
            // InternalMyDsl.g:7999:1: ( 'ServicesRelations' )
            {
            // InternalMyDsl.g:7999:1: ( 'ServicesRelations' )
            // InternalMyDsl.g:8000:2: 'ServicesRelations'
            {
             before(grammarAccess.getReactServicesRelationAccess().getServicesRelationsKeyword_0()); 
            match(input,90,FOLLOW_2); 
             after(grammarAccess.getReactServicesRelationAccess().getServicesRelationsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactServicesRelation__Group__0__Impl"


    // $ANTLR start "rule__ReactServicesRelation__Group__1"
    // InternalMyDsl.g:8009:1: rule__ReactServicesRelation__Group__1 : rule__ReactServicesRelation__Group__1__Impl ;
    public final void rule__ReactServicesRelation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8013:1: ( rule__ReactServicesRelation__Group__1__Impl )
            // InternalMyDsl.g:8014:2: rule__ReactServicesRelation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactServicesRelation__Group__1__Impl();

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
    // $ANTLR end "rule__ReactServicesRelation__Group__1"


    // $ANTLR start "rule__ReactServicesRelation__Group__1__Impl"
    // InternalMyDsl.g:8020:1: rule__ReactServicesRelation__Group__1__Impl : ( ( ( rule__ReactServicesRelation__Group_1__0 ) ) ( ( rule__ReactServicesRelation__Group_1__0 )* ) ) ;
    public final void rule__ReactServicesRelation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8024:1: ( ( ( ( rule__ReactServicesRelation__Group_1__0 ) ) ( ( rule__ReactServicesRelation__Group_1__0 )* ) ) )
            // InternalMyDsl.g:8025:1: ( ( ( rule__ReactServicesRelation__Group_1__0 ) ) ( ( rule__ReactServicesRelation__Group_1__0 )* ) )
            {
            // InternalMyDsl.g:8025:1: ( ( ( rule__ReactServicesRelation__Group_1__0 ) ) ( ( rule__ReactServicesRelation__Group_1__0 )* ) )
            // InternalMyDsl.g:8026:2: ( ( rule__ReactServicesRelation__Group_1__0 ) ) ( ( rule__ReactServicesRelation__Group_1__0 )* )
            {
            // InternalMyDsl.g:8026:2: ( ( rule__ReactServicesRelation__Group_1__0 ) )
            // InternalMyDsl.g:8027:3: ( rule__ReactServicesRelation__Group_1__0 )
            {
             before(grammarAccess.getReactServicesRelationAccess().getGroup_1()); 
            // InternalMyDsl.g:8028:3: ( rule__ReactServicesRelation__Group_1__0 )
            // InternalMyDsl.g:8028:4: rule__ReactServicesRelation__Group_1__0
            {
            pushFollow(FOLLOW_77);
            rule__ReactServicesRelation__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getReactServicesRelationAccess().getGroup_1()); 

            }

            // InternalMyDsl.g:8031:2: ( ( rule__ReactServicesRelation__Group_1__0 )* )
            // InternalMyDsl.g:8032:3: ( rule__ReactServicesRelation__Group_1__0 )*
            {
             before(grammarAccess.getReactServicesRelationAccess().getGroup_1()); 
            // InternalMyDsl.g:8033:3: ( rule__ReactServicesRelation__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==88) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:8033:4: rule__ReactServicesRelation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_77);
            	    rule__ReactServicesRelation__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getReactServicesRelationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ReactServicesRelation__Group__1__Impl"


    // $ANTLR start "rule__ReactServicesRelation__Group_1__0"
    // InternalMyDsl.g:8043:1: rule__ReactServicesRelation__Group_1__0 : rule__ReactServicesRelation__Group_1__0__Impl rule__ReactServicesRelation__Group_1__1 ;
    public final void rule__ReactServicesRelation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8047:1: ( rule__ReactServicesRelation__Group_1__0__Impl rule__ReactServicesRelation__Group_1__1 )
            // InternalMyDsl.g:8048:2: rule__ReactServicesRelation__Group_1__0__Impl rule__ReactServicesRelation__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__ReactServicesRelation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactServicesRelation__Group_1__1();

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
    // $ANTLR end "rule__ReactServicesRelation__Group_1__0"


    // $ANTLR start "rule__ReactServicesRelation__Group_1__0__Impl"
    // InternalMyDsl.g:8055:1: rule__ReactServicesRelation__Group_1__0__Impl : ( ( rule__ReactServicesRelation__ReactrelationcontentAssignment_1_0 ) ) ;
    public final void rule__ReactServicesRelation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8059:1: ( ( ( rule__ReactServicesRelation__ReactrelationcontentAssignment_1_0 ) ) )
            // InternalMyDsl.g:8060:1: ( ( rule__ReactServicesRelation__ReactrelationcontentAssignment_1_0 ) )
            {
            // InternalMyDsl.g:8060:1: ( ( rule__ReactServicesRelation__ReactrelationcontentAssignment_1_0 ) )
            // InternalMyDsl.g:8061:2: ( rule__ReactServicesRelation__ReactrelationcontentAssignment_1_0 )
            {
             before(grammarAccess.getReactServicesRelationAccess().getReactrelationcontentAssignment_1_0()); 
            // InternalMyDsl.g:8062:2: ( rule__ReactServicesRelation__ReactrelationcontentAssignment_1_0 )
            // InternalMyDsl.g:8062:3: rule__ReactServicesRelation__ReactrelationcontentAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ReactServicesRelation__ReactrelationcontentAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getReactServicesRelationAccess().getReactrelationcontentAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactServicesRelation__Group_1__0__Impl"


    // $ANTLR start "rule__ReactServicesRelation__Group_1__1"
    // InternalMyDsl.g:8070:1: rule__ReactServicesRelation__Group_1__1 : rule__ReactServicesRelation__Group_1__1__Impl rule__ReactServicesRelation__Group_1__2 ;
    public final void rule__ReactServicesRelation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8074:1: ( rule__ReactServicesRelation__Group_1__1__Impl rule__ReactServicesRelation__Group_1__2 )
            // InternalMyDsl.g:8075:2: rule__ReactServicesRelation__Group_1__1__Impl rule__ReactServicesRelation__Group_1__2
            {
            pushFollow(FOLLOW_78);
            rule__ReactServicesRelation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactServicesRelation__Group_1__2();

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
    // $ANTLR end "rule__ReactServicesRelation__Group_1__1"


    // $ANTLR start "rule__ReactServicesRelation__Group_1__1__Impl"
    // InternalMyDsl.g:8082:1: rule__ReactServicesRelation__Group_1__1__Impl : ( ( rule__ReactServicesRelation__NameAssignment_1_1 ) ) ;
    public final void rule__ReactServicesRelation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8086:1: ( ( ( rule__ReactServicesRelation__NameAssignment_1_1 ) ) )
            // InternalMyDsl.g:8087:1: ( ( rule__ReactServicesRelation__NameAssignment_1_1 ) )
            {
            // InternalMyDsl.g:8087:1: ( ( rule__ReactServicesRelation__NameAssignment_1_1 ) )
            // InternalMyDsl.g:8088:2: ( rule__ReactServicesRelation__NameAssignment_1_1 )
            {
             before(grammarAccess.getReactServicesRelationAccess().getNameAssignment_1_1()); 
            // InternalMyDsl.g:8089:2: ( rule__ReactServicesRelation__NameAssignment_1_1 )
            // InternalMyDsl.g:8089:3: rule__ReactServicesRelation__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ReactServicesRelation__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getReactServicesRelationAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactServicesRelation__Group_1__1__Impl"


    // $ANTLR start "rule__ReactServicesRelation__Group_1__2"
    // InternalMyDsl.g:8097:1: rule__ReactServicesRelation__Group_1__2 : rule__ReactServicesRelation__Group_1__2__Impl ;
    public final void rule__ReactServicesRelation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8101:1: ( rule__ReactServicesRelation__Group_1__2__Impl )
            // InternalMyDsl.g:8102:2: rule__ReactServicesRelation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactServicesRelation__Group_1__2__Impl();

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
    // $ANTLR end "rule__ReactServicesRelation__Group_1__2"


    // $ANTLR start "rule__ReactServicesRelation__Group_1__2__Impl"
    // InternalMyDsl.g:8108:1: rule__ReactServicesRelation__Group_1__2__Impl : ( ruleReactRequest ) ;
    public final void rule__ReactServicesRelation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8112:1: ( ( ruleReactRequest ) )
            // InternalMyDsl.g:8113:1: ( ruleReactRequest )
            {
            // InternalMyDsl.g:8113:1: ( ruleReactRequest )
            // InternalMyDsl.g:8114:2: ruleReactRequest
            {
             before(grammarAccess.getReactServicesRelationAccess().getReactRequestParserRuleCall_1_2()); 
            pushFollow(FOLLOW_2);
            ruleReactRequest();

            state._fsp--;

             after(grammarAccess.getReactServicesRelationAccess().getReactRequestParserRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactServicesRelation__Group_1__2__Impl"


    // $ANTLR start "rule__ReactLibraries__Group__0"
    // InternalMyDsl.g:8124:1: rule__ReactLibraries__Group__0 : rule__ReactLibraries__Group__0__Impl rule__ReactLibraries__Group__1 ;
    public final void rule__ReactLibraries__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8128:1: ( rule__ReactLibraries__Group__0__Impl rule__ReactLibraries__Group__1 )
            // InternalMyDsl.g:8129:2: rule__ReactLibraries__Group__0__Impl rule__ReactLibraries__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:8136:1: rule__ReactLibraries__Group__0__Impl : ( 'ReactLibraries' ) ;
    public final void rule__ReactLibraries__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8140:1: ( ( 'ReactLibraries' ) )
            // InternalMyDsl.g:8141:1: ( 'ReactLibraries' )
            {
            // InternalMyDsl.g:8141:1: ( 'ReactLibraries' )
            // InternalMyDsl.g:8142:2: 'ReactLibraries'
            {
             before(grammarAccess.getReactLibrariesAccess().getReactLibrariesKeyword_0()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getReactLibrariesAccess().getReactLibrariesKeyword_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:8151:1: rule__ReactLibraries__Group__1 : rule__ReactLibraries__Group__1__Impl rule__ReactLibraries__Group__2 ;
    public final void rule__ReactLibraries__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8155:1: ( rule__ReactLibraries__Group__1__Impl rule__ReactLibraries__Group__2 )
            // InternalMyDsl.g:8156:2: rule__ReactLibraries__Group__1__Impl rule__ReactLibraries__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ReactLibraries__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactLibraries__Group__2();

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
    // InternalMyDsl.g:8163:1: rule__ReactLibraries__Group__1__Impl : ( ':' ) ;
    public final void rule__ReactLibraries__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8167:1: ( ( ':' ) )
            // InternalMyDsl.g:8168:1: ( ':' )
            {
            // InternalMyDsl.g:8168:1: ( ':' )
            // InternalMyDsl.g:8169:2: ':'
            {
             before(grammarAccess.getReactLibrariesAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getReactLibrariesAccess().getColonKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ReactLibraries__Group__2"
    // InternalMyDsl.g:8178:1: rule__ReactLibraries__Group__2 : rule__ReactLibraries__Group__2__Impl rule__ReactLibraries__Group__3 ;
    public final void rule__ReactLibraries__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8182:1: ( rule__ReactLibraries__Group__2__Impl rule__ReactLibraries__Group__3 )
            // InternalMyDsl.g:8183:2: rule__ReactLibraries__Group__2__Impl rule__ReactLibraries__Group__3
            {
            pushFollow(FOLLOW_79);
            rule__ReactLibraries__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactLibraries__Group__3();

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
    // $ANTLR end "rule__ReactLibraries__Group__2"


    // $ANTLR start "rule__ReactLibraries__Group__2__Impl"
    // InternalMyDsl.g:8190:1: rule__ReactLibraries__Group__2__Impl : ( '{' ) ;
    public final void rule__ReactLibraries__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8194:1: ( ( '{' ) )
            // InternalMyDsl.g:8195:1: ( '{' )
            {
            // InternalMyDsl.g:8195:1: ( '{' )
            // InternalMyDsl.g:8196:2: '{'
            {
             before(grammarAccess.getReactLibrariesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getReactLibrariesAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactLibraries__Group__2__Impl"


    // $ANTLR start "rule__ReactLibraries__Group__3"
    // InternalMyDsl.g:8205:1: rule__ReactLibraries__Group__3 : rule__ReactLibraries__Group__3__Impl rule__ReactLibraries__Group__4 ;
    public final void rule__ReactLibraries__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8209:1: ( rule__ReactLibraries__Group__3__Impl rule__ReactLibraries__Group__4 )
            // InternalMyDsl.g:8210:2: rule__ReactLibraries__Group__3__Impl rule__ReactLibraries__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__ReactLibraries__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactLibraries__Group__4();

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
    // $ANTLR end "rule__ReactLibraries__Group__3"


    // $ANTLR start "rule__ReactLibraries__Group__3__Impl"
    // InternalMyDsl.g:8217:1: rule__ReactLibraries__Group__3__Impl : ( ( ( rule__ReactLibraries__ReactlibrariesAssignment_3 ) ) ( ( rule__ReactLibraries__ReactlibrariesAssignment_3 )* ) ) ;
    public final void rule__ReactLibraries__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8221:1: ( ( ( ( rule__ReactLibraries__ReactlibrariesAssignment_3 ) ) ( ( rule__ReactLibraries__ReactlibrariesAssignment_3 )* ) ) )
            // InternalMyDsl.g:8222:1: ( ( ( rule__ReactLibraries__ReactlibrariesAssignment_3 ) ) ( ( rule__ReactLibraries__ReactlibrariesAssignment_3 )* ) )
            {
            // InternalMyDsl.g:8222:1: ( ( ( rule__ReactLibraries__ReactlibrariesAssignment_3 ) ) ( ( rule__ReactLibraries__ReactlibrariesAssignment_3 )* ) )
            // InternalMyDsl.g:8223:2: ( ( rule__ReactLibraries__ReactlibrariesAssignment_3 ) ) ( ( rule__ReactLibraries__ReactlibrariesAssignment_3 )* )
            {
            // InternalMyDsl.g:8223:2: ( ( rule__ReactLibraries__ReactlibrariesAssignment_3 ) )
            // InternalMyDsl.g:8224:3: ( rule__ReactLibraries__ReactlibrariesAssignment_3 )
            {
             before(grammarAccess.getReactLibrariesAccess().getReactlibrariesAssignment_3()); 
            // InternalMyDsl.g:8225:3: ( rule__ReactLibraries__ReactlibrariesAssignment_3 )
            // InternalMyDsl.g:8225:4: rule__ReactLibraries__ReactlibrariesAssignment_3
            {
            pushFollow(FOLLOW_80);
            rule__ReactLibraries__ReactlibrariesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReactLibrariesAccess().getReactlibrariesAssignment_3()); 

            }

            // InternalMyDsl.g:8228:2: ( ( rule__ReactLibraries__ReactlibrariesAssignment_3 )* )
            // InternalMyDsl.g:8229:3: ( rule__ReactLibraries__ReactlibrariesAssignment_3 )*
            {
             before(grammarAccess.getReactLibrariesAccess().getReactlibrariesAssignment_3()); 
            // InternalMyDsl.g:8230:3: ( rule__ReactLibraries__ReactlibrariesAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=24 && LA22_0<=29)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:8230:4: rule__ReactLibraries__ReactlibrariesAssignment_3
            	    {
            	    pushFollow(FOLLOW_80);
            	    rule__ReactLibraries__ReactlibrariesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getReactLibrariesAccess().getReactlibrariesAssignment_3()); 

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
    // $ANTLR end "rule__ReactLibraries__Group__3__Impl"


    // $ANTLR start "rule__ReactLibraries__Group__4"
    // InternalMyDsl.g:8239:1: rule__ReactLibraries__Group__4 : rule__ReactLibraries__Group__4__Impl ;
    public final void rule__ReactLibraries__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8243:1: ( rule__ReactLibraries__Group__4__Impl )
            // InternalMyDsl.g:8244:2: rule__ReactLibraries__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactLibraries__Group__4__Impl();

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
    // $ANTLR end "rule__ReactLibraries__Group__4"


    // $ANTLR start "rule__ReactLibraries__Group__4__Impl"
    // InternalMyDsl.g:8250:1: rule__ReactLibraries__Group__4__Impl : ( '}' ) ;
    public final void rule__ReactLibraries__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8254:1: ( ( '}' ) )
            // InternalMyDsl.g:8255:1: ( '}' )
            {
            // InternalMyDsl.g:8255:1: ( '}' )
            // InternalMyDsl.g:8256:2: '}'
            {
             before(grammarAccess.getReactLibrariesAccess().getRightCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getReactLibrariesAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactLibraries__Group__4__Impl"


    // $ANTLR start "rule__ReactLibrary__Group__0"
    // InternalMyDsl.g:8266:1: rule__ReactLibrary__Group__0 : rule__ReactLibrary__Group__0__Impl rule__ReactLibrary__Group__1 ;
    public final void rule__ReactLibrary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8270:1: ( rule__ReactLibrary__Group__0__Impl rule__ReactLibrary__Group__1 )
            // InternalMyDsl.g:8271:2: rule__ReactLibrary__Group__0__Impl rule__ReactLibrary__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ReactLibrary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactLibrary__Group__1();

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
    // $ANTLR end "rule__ReactLibrary__Group__0"


    // $ANTLR start "rule__ReactLibrary__Group__0__Impl"
    // InternalMyDsl.g:8278:1: rule__ReactLibrary__Group__0__Impl : ( ruleReactLibraryType ) ;
    public final void rule__ReactLibrary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8282:1: ( ( ruleReactLibraryType ) )
            // InternalMyDsl.g:8283:1: ( ruleReactLibraryType )
            {
            // InternalMyDsl.g:8283:1: ( ruleReactLibraryType )
            // InternalMyDsl.g:8284:2: ruleReactLibraryType
            {
             before(grammarAccess.getReactLibraryAccess().getReactLibraryTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleReactLibraryType();

            state._fsp--;

             after(grammarAccess.getReactLibraryAccess().getReactLibraryTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactLibrary__Group__0__Impl"


    // $ANTLR start "rule__ReactLibrary__Group__1"
    // InternalMyDsl.g:8293:1: rule__ReactLibrary__Group__1 : rule__ReactLibrary__Group__1__Impl rule__ReactLibrary__Group__2 ;
    public final void rule__ReactLibrary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8297:1: ( rule__ReactLibrary__Group__1__Impl rule__ReactLibrary__Group__2 )
            // InternalMyDsl.g:8298:2: rule__ReactLibrary__Group__1__Impl rule__ReactLibrary__Group__2
            {
            pushFollow(FOLLOW_81);
            rule__ReactLibrary__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactLibrary__Group__2();

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
    // $ANTLR end "rule__ReactLibrary__Group__1"


    // $ANTLR start "rule__ReactLibrary__Group__1__Impl"
    // InternalMyDsl.g:8305:1: rule__ReactLibrary__Group__1__Impl : ( ( rule__ReactLibrary__NameAssignment_1 ) ) ;
    public final void rule__ReactLibrary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8309:1: ( ( ( rule__ReactLibrary__NameAssignment_1 ) ) )
            // InternalMyDsl.g:8310:1: ( ( rule__ReactLibrary__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:8310:1: ( ( rule__ReactLibrary__NameAssignment_1 ) )
            // InternalMyDsl.g:8311:2: ( rule__ReactLibrary__NameAssignment_1 )
            {
             before(grammarAccess.getReactLibraryAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:8312:2: ( rule__ReactLibrary__NameAssignment_1 )
            // InternalMyDsl.g:8312:3: rule__ReactLibrary__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReactLibrary__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReactLibraryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactLibrary__Group__1__Impl"


    // $ANTLR start "rule__ReactLibrary__Group__2"
    // InternalMyDsl.g:8320:1: rule__ReactLibrary__Group__2 : rule__ReactLibrary__Group__2__Impl ;
    public final void rule__ReactLibrary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8324:1: ( rule__ReactLibrary__Group__2__Impl )
            // InternalMyDsl.g:8325:2: rule__ReactLibrary__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactLibrary__Group__2__Impl();

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
    // $ANTLR end "rule__ReactLibrary__Group__2"


    // $ANTLR start "rule__ReactLibrary__Group__2__Impl"
    // InternalMyDsl.g:8331:1: rule__ReactLibrary__Group__2__Impl : ( 'LibraryContent' ) ;
    public final void rule__ReactLibrary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8335:1: ( ( 'LibraryContent' ) )
            // InternalMyDsl.g:8336:1: ( 'LibraryContent' )
            {
            // InternalMyDsl.g:8336:1: ( 'LibraryContent' )
            // InternalMyDsl.g:8337:2: 'LibraryContent'
            {
             before(grammarAccess.getReactLibraryAccess().getLibraryContentKeyword_2()); 
            match(input,92,FOLLOW_2); 
             after(grammarAccess.getReactLibraryAccess().getLibraryContentKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactLibrary__Group__2__Impl"


    // $ANTLR start "rule__ReactInfo__Group__0"
    // InternalMyDsl.g:8347:1: rule__ReactInfo__Group__0 : rule__ReactInfo__Group__0__Impl rule__ReactInfo__Group__1 ;
    public final void rule__ReactInfo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8351:1: ( rule__ReactInfo__Group__0__Impl rule__ReactInfo__Group__1 )
            // InternalMyDsl.g:8352:2: rule__ReactInfo__Group__0__Impl rule__ReactInfo__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:8359:1: rule__ReactInfo__Group__0__Impl : ( 'ReactInformation' ) ;
    public final void rule__ReactInfo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8363:1: ( ( 'ReactInformation' ) )
            // InternalMyDsl.g:8364:1: ( 'ReactInformation' )
            {
            // InternalMyDsl.g:8364:1: ( 'ReactInformation' )
            // InternalMyDsl.g:8365:2: 'ReactInformation'
            {
             before(grammarAccess.getReactInfoAccess().getReactInformationKeyword_0()); 
            match(input,93,FOLLOW_2); 
             after(grammarAccess.getReactInfoAccess().getReactInformationKeyword_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:8374:1: rule__ReactInfo__Group__1 : rule__ReactInfo__Group__1__Impl rule__ReactInfo__Group__2 ;
    public final void rule__ReactInfo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8378:1: ( rule__ReactInfo__Group__1__Impl rule__ReactInfo__Group__2 )
            // InternalMyDsl.g:8379:2: rule__ReactInfo__Group__1__Impl rule__ReactInfo__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ReactInfo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactInfo__Group__2();

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
    // InternalMyDsl.g:8386:1: rule__ReactInfo__Group__1__Impl : ( ':' ) ;
    public final void rule__ReactInfo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8390:1: ( ( ':' ) )
            // InternalMyDsl.g:8391:1: ( ':' )
            {
            // InternalMyDsl.g:8391:1: ( ':' )
            // InternalMyDsl.g:8392:2: ':'
            {
             before(grammarAccess.getReactInfoAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getReactInfoAccess().getColonKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ReactInfo__Group__2"
    // InternalMyDsl.g:8401:1: rule__ReactInfo__Group__2 : rule__ReactInfo__Group__2__Impl rule__ReactInfo__Group__3 ;
    public final void rule__ReactInfo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8405:1: ( rule__ReactInfo__Group__2__Impl rule__ReactInfo__Group__3 )
            // InternalMyDsl.g:8406:2: rule__ReactInfo__Group__2__Impl rule__ReactInfo__Group__3
            {
            pushFollow(FOLLOW_82);
            rule__ReactInfo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactInfo__Group__3();

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
    // $ANTLR end "rule__ReactInfo__Group__2"


    // $ANTLR start "rule__ReactInfo__Group__2__Impl"
    // InternalMyDsl.g:8413:1: rule__ReactInfo__Group__2__Impl : ( '{' ) ;
    public final void rule__ReactInfo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8417:1: ( ( '{' ) )
            // InternalMyDsl.g:8418:1: ( '{' )
            {
            // InternalMyDsl.g:8418:1: ( '{' )
            // InternalMyDsl.g:8419:2: '{'
            {
             before(grammarAccess.getReactInfoAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getReactInfoAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactInfo__Group__2__Impl"


    // $ANTLR start "rule__ReactInfo__Group__3"
    // InternalMyDsl.g:8428:1: rule__ReactInfo__Group__3 : rule__ReactInfo__Group__3__Impl rule__ReactInfo__Group__4 ;
    public final void rule__ReactInfo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8432:1: ( rule__ReactInfo__Group__3__Impl rule__ReactInfo__Group__4 )
            // InternalMyDsl.g:8433:2: rule__ReactInfo__Group__3__Impl rule__ReactInfo__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__ReactInfo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactInfo__Group__4();

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
    // $ANTLR end "rule__ReactInfo__Group__3"


    // $ANTLR start "rule__ReactInfo__Group__3__Impl"
    // InternalMyDsl.g:8440:1: rule__ReactInfo__Group__3__Impl : ( ( ( rule__ReactInfo__ReactinformationAssignment_3 ) ) ( ( rule__ReactInfo__ReactinformationAssignment_3 )* ) ) ;
    public final void rule__ReactInfo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8444:1: ( ( ( ( rule__ReactInfo__ReactinformationAssignment_3 ) ) ( ( rule__ReactInfo__ReactinformationAssignment_3 )* ) ) )
            // InternalMyDsl.g:8445:1: ( ( ( rule__ReactInfo__ReactinformationAssignment_3 ) ) ( ( rule__ReactInfo__ReactinformationAssignment_3 )* ) )
            {
            // InternalMyDsl.g:8445:1: ( ( ( rule__ReactInfo__ReactinformationAssignment_3 ) ) ( ( rule__ReactInfo__ReactinformationAssignment_3 )* ) )
            // InternalMyDsl.g:8446:2: ( ( rule__ReactInfo__ReactinformationAssignment_3 ) ) ( ( rule__ReactInfo__ReactinformationAssignment_3 )* )
            {
            // InternalMyDsl.g:8446:2: ( ( rule__ReactInfo__ReactinformationAssignment_3 ) )
            // InternalMyDsl.g:8447:3: ( rule__ReactInfo__ReactinformationAssignment_3 )
            {
             before(grammarAccess.getReactInfoAccess().getReactinformationAssignment_3()); 
            // InternalMyDsl.g:8448:3: ( rule__ReactInfo__ReactinformationAssignment_3 )
            // InternalMyDsl.g:8448:4: rule__ReactInfo__ReactinformationAssignment_3
            {
            pushFollow(FOLLOW_83);
            rule__ReactInfo__ReactinformationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReactInfoAccess().getReactinformationAssignment_3()); 

            }

            // InternalMyDsl.g:8451:2: ( ( rule__ReactInfo__ReactinformationAssignment_3 )* )
            // InternalMyDsl.g:8452:3: ( rule__ReactInfo__ReactinformationAssignment_3 )*
            {
             before(grammarAccess.getReactInfoAccess().getReactinformationAssignment_3()); 
            // InternalMyDsl.g:8453:3: ( rule__ReactInfo__ReactinformationAssignment_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=30 && LA23_0<=31)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:8453:4: rule__ReactInfo__ReactinformationAssignment_3
            	    {
            	    pushFollow(FOLLOW_83);
            	    rule__ReactInfo__ReactinformationAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getReactInfoAccess().getReactinformationAssignment_3()); 

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
    // $ANTLR end "rule__ReactInfo__Group__3__Impl"


    // $ANTLR start "rule__ReactInfo__Group__4"
    // InternalMyDsl.g:8462:1: rule__ReactInfo__Group__4 : rule__ReactInfo__Group__4__Impl ;
    public final void rule__ReactInfo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8466:1: ( rule__ReactInfo__Group__4__Impl )
            // InternalMyDsl.g:8467:2: rule__ReactInfo__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactInfo__Group__4__Impl();

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
    // $ANTLR end "rule__ReactInfo__Group__4"


    // $ANTLR start "rule__ReactInfo__Group__4__Impl"
    // InternalMyDsl.g:8473:1: rule__ReactInfo__Group__4__Impl : ( '}' ) ;
    public final void rule__ReactInfo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8477:1: ( ( '}' ) )
            // InternalMyDsl.g:8478:1: ( '}' )
            {
            // InternalMyDsl.g:8478:1: ( '}' )
            // InternalMyDsl.g:8479:2: '}'
            {
             before(grammarAccess.getReactInfoAccess().getRightCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getReactInfoAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactInfo__Group__4__Impl"


    // $ANTLR start "rule__ReactInformation__Group__0"
    // InternalMyDsl.g:8489:1: rule__ReactInformation__Group__0 : rule__ReactInformation__Group__0__Impl rule__ReactInformation__Group__1 ;
    public final void rule__ReactInformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8493:1: ( rule__ReactInformation__Group__0__Impl rule__ReactInformation__Group__1 )
            // InternalMyDsl.g:8494:2: rule__ReactInformation__Group__0__Impl rule__ReactInformation__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ReactInformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactInformation__Group__1();

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
    // $ANTLR end "rule__ReactInformation__Group__0"


    // $ANTLR start "rule__ReactInformation__Group__0__Impl"
    // InternalMyDsl.g:8501:1: rule__ReactInformation__Group__0__Impl : ( ruleReactInformationType ) ;
    public final void rule__ReactInformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8505:1: ( ( ruleReactInformationType ) )
            // InternalMyDsl.g:8506:1: ( ruleReactInformationType )
            {
            // InternalMyDsl.g:8506:1: ( ruleReactInformationType )
            // InternalMyDsl.g:8507:2: ruleReactInformationType
            {
             before(grammarAccess.getReactInformationAccess().getReactInformationTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleReactInformationType();

            state._fsp--;

             after(grammarAccess.getReactInformationAccess().getReactInformationTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactInformation__Group__0__Impl"


    // $ANTLR start "rule__ReactInformation__Group__1"
    // InternalMyDsl.g:8516:1: rule__ReactInformation__Group__1 : rule__ReactInformation__Group__1__Impl rule__ReactInformation__Group__2 ;
    public final void rule__ReactInformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8520:1: ( rule__ReactInformation__Group__1__Impl rule__ReactInformation__Group__2 )
            // InternalMyDsl.g:8521:2: rule__ReactInformation__Group__1__Impl rule__ReactInformation__Group__2
            {
            pushFollow(FOLLOW_84);
            rule__ReactInformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReactInformation__Group__2();

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
    // $ANTLR end "rule__ReactInformation__Group__1"


    // $ANTLR start "rule__ReactInformation__Group__1__Impl"
    // InternalMyDsl.g:8528:1: rule__ReactInformation__Group__1__Impl : ( ( rule__ReactInformation__NameAssignment_1 ) ) ;
    public final void rule__ReactInformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8532:1: ( ( ( rule__ReactInformation__NameAssignment_1 ) ) )
            // InternalMyDsl.g:8533:1: ( ( rule__ReactInformation__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:8533:1: ( ( rule__ReactInformation__NameAssignment_1 ) )
            // InternalMyDsl.g:8534:2: ( rule__ReactInformation__NameAssignment_1 )
            {
             before(grammarAccess.getReactInformationAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:8535:2: ( rule__ReactInformation__NameAssignment_1 )
            // InternalMyDsl.g:8535:3: rule__ReactInformation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReactInformation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReactInformationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactInformation__Group__1__Impl"


    // $ANTLR start "rule__ReactInformation__Group__2"
    // InternalMyDsl.g:8543:1: rule__ReactInformation__Group__2 : rule__ReactInformation__Group__2__Impl ;
    public final void rule__ReactInformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8547:1: ( rule__ReactInformation__Group__2__Impl )
            // InternalMyDsl.g:8548:2: rule__ReactInformation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReactInformation__Group__2__Impl();

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
    // $ANTLR end "rule__ReactInformation__Group__2"


    // $ANTLR start "rule__ReactInformation__Group__2__Impl"
    // InternalMyDsl.g:8554:1: rule__ReactInformation__Group__2__Impl : ( 'InformationContent' ) ;
    public final void rule__ReactInformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8558:1: ( ( 'InformationContent' ) )
            // InternalMyDsl.g:8559:1: ( 'InformationContent' )
            {
            // InternalMyDsl.g:8559:1: ( 'InformationContent' )
            // InternalMyDsl.g:8560:2: 'InformationContent'
            {
             before(grammarAccess.getReactInformationAccess().getInformationContentKeyword_2()); 
            match(input,94,FOLLOW_2); 
             after(grammarAccess.getReactInformationAccess().getInformationContentKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactInformation__Group__2__Impl"


    // $ANTLR start "rule__Spring__Group__0"
    // InternalMyDsl.g:8570:1: rule__Spring__Group__0 : rule__Spring__Group__0__Impl rule__Spring__Group__1 ;
    public final void rule__Spring__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8574:1: ( rule__Spring__Group__0__Impl rule__Spring__Group__1 )
            // InternalMyDsl.g:8575:2: rule__Spring__Group__0__Impl rule__Spring__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:8582:1: rule__Spring__Group__0__Impl : ( 'Spring' ) ;
    public final void rule__Spring__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8586:1: ( ( 'Spring' ) )
            // InternalMyDsl.g:8587:1: ( 'Spring' )
            {
            // InternalMyDsl.g:8587:1: ( 'Spring' )
            // InternalMyDsl.g:8588:2: 'Spring'
            {
             before(grammarAccess.getSpringAccess().getSpringKeyword_0()); 
            match(input,95,FOLLOW_2); 
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
    // InternalMyDsl.g:8597:1: rule__Spring__Group__1 : rule__Spring__Group__1__Impl ;
    public final void rule__Spring__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8601:1: ( rule__Spring__Group__1__Impl )
            // InternalMyDsl.g:8602:2: rule__Spring__Group__1__Impl
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
    // InternalMyDsl.g:8608:1: rule__Spring__Group__1__Impl : ( ( rule__Spring__NameAssignment_1 ) ) ;
    public final void rule__Spring__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8612:1: ( ( ( rule__Spring__NameAssignment_1 ) ) )
            // InternalMyDsl.g:8613:1: ( ( rule__Spring__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:8613:1: ( ( rule__Spring__NameAssignment_1 ) )
            // InternalMyDsl.g:8614:2: ( rule__Spring__NameAssignment_1 )
            {
             before(grammarAccess.getSpringAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:8615:2: ( rule__Spring__NameAssignment_1 )
            // InternalMyDsl.g:8615:3: rule__Spring__NameAssignment_1
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
    // InternalMyDsl.g:8624:1: rule__PostgreSQL__Group__0 : rule__PostgreSQL__Group__0__Impl rule__PostgreSQL__Group__1 ;
    public final void rule__PostgreSQL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8628:1: ( rule__PostgreSQL__Group__0__Impl rule__PostgreSQL__Group__1 )
            // InternalMyDsl.g:8629:2: rule__PostgreSQL__Group__0__Impl rule__PostgreSQL__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:8636:1: rule__PostgreSQL__Group__0__Impl : ( 'PostgreSQL' ) ;
    public final void rule__PostgreSQL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8640:1: ( ( 'PostgreSQL' ) )
            // InternalMyDsl.g:8641:1: ( 'PostgreSQL' )
            {
            // InternalMyDsl.g:8641:1: ( 'PostgreSQL' )
            // InternalMyDsl.g:8642:2: 'PostgreSQL'
            {
             before(grammarAccess.getPostgreSQLAccess().getPostgreSQLKeyword_0()); 
            match(input,96,FOLLOW_2); 
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
    // InternalMyDsl.g:8651:1: rule__PostgreSQL__Group__1 : rule__PostgreSQL__Group__1__Impl ;
    public final void rule__PostgreSQL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8655:1: ( rule__PostgreSQL__Group__1__Impl )
            // InternalMyDsl.g:8656:2: rule__PostgreSQL__Group__1__Impl
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
    // InternalMyDsl.g:8662:1: rule__PostgreSQL__Group__1__Impl : ( ( rule__PostgreSQL__NameAssignment_1 ) ) ;
    public final void rule__PostgreSQL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8666:1: ( ( ( rule__PostgreSQL__NameAssignment_1 ) ) )
            // InternalMyDsl.g:8667:1: ( ( rule__PostgreSQL__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:8667:1: ( ( rule__PostgreSQL__NameAssignment_1 ) )
            // InternalMyDsl.g:8668:2: ( rule__PostgreSQL__NameAssignment_1 )
            {
             before(grammarAccess.getPostgreSQLAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:8669:2: ( rule__PostgreSQL__NameAssignment_1 )
            // InternalMyDsl.g:8669:3: rule__PostgreSQL__NameAssignment_1
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
    // InternalMyDsl.g:8678:1: rule__AmazonWebServices__Group__0 : rule__AmazonWebServices__Group__0__Impl rule__AmazonWebServices__Group__1 ;
    public final void rule__AmazonWebServices__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8682:1: ( rule__AmazonWebServices__Group__0__Impl rule__AmazonWebServices__Group__1 )
            // InternalMyDsl.g:8683:2: rule__AmazonWebServices__Group__0__Impl rule__AmazonWebServices__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:8690:1: rule__AmazonWebServices__Group__0__Impl : ( 'AmazonWebServices' ) ;
    public final void rule__AmazonWebServices__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8694:1: ( ( 'AmazonWebServices' ) )
            // InternalMyDsl.g:8695:1: ( 'AmazonWebServices' )
            {
            // InternalMyDsl.g:8695:1: ( 'AmazonWebServices' )
            // InternalMyDsl.g:8696:2: 'AmazonWebServices'
            {
             before(grammarAccess.getAmazonWebServicesAccess().getAmazonWebServicesKeyword_0()); 
            match(input,97,FOLLOW_2); 
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
    // InternalMyDsl.g:8705:1: rule__AmazonWebServices__Group__1 : rule__AmazonWebServices__Group__1__Impl ;
    public final void rule__AmazonWebServices__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8709:1: ( rule__AmazonWebServices__Group__1__Impl )
            // InternalMyDsl.g:8710:2: rule__AmazonWebServices__Group__1__Impl
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
    // InternalMyDsl.g:8716:1: rule__AmazonWebServices__Group__1__Impl : ( ( rule__AmazonWebServices__NameAssignment_1 ) ) ;
    public final void rule__AmazonWebServices__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8720:1: ( ( ( rule__AmazonWebServices__NameAssignment_1 ) ) )
            // InternalMyDsl.g:8721:1: ( ( rule__AmazonWebServices__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:8721:1: ( ( rule__AmazonWebServices__NameAssignment_1 ) )
            // InternalMyDsl.g:8722:2: ( rule__AmazonWebServices__NameAssignment_1 )
            {
             before(grammarAccess.getAmazonWebServicesAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:8723:2: ( rule__AmazonWebServices__NameAssignment_1 )
            // InternalMyDsl.g:8723:3: rule__AmazonWebServices__NameAssignment_1
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
    // InternalMyDsl.g:8732:1: rule__Model__ElementsAssignment_3 : ( ruleDomain ) ;
    public final void rule__Model__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8736:1: ( ( ruleDomain ) )
            // InternalMyDsl.g:8737:2: ( ruleDomain )
            {
            // InternalMyDsl.g:8737:2: ( ruleDomain )
            // InternalMyDsl.g:8738:3: ruleDomain
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
    // InternalMyDsl.g:8747:1: rule__Model__ElementsAssignment_4 : ( ruleArchitecture ) ;
    public final void rule__Model__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8751:1: ( ( ruleArchitecture ) )
            // InternalMyDsl.g:8752:2: ( ruleArchitecture )
            {
            // InternalMyDsl.g:8752:2: ( ruleArchitecture )
            // InternalMyDsl.g:8753:3: ruleArchitecture
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
    // InternalMyDsl.g:8762:1: rule__Model__ElementsAssignment_5 : ( ruleTechnology ) ;
    public final void rule__Model__ElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8766:1: ( ( ruleTechnology ) )
            // InternalMyDsl.g:8767:2: ( ruleTechnology )
            {
            // InternalMyDsl.g:8767:2: ( ruleTechnology )
            // InternalMyDsl.g:8768:3: ruleTechnology
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
    // InternalMyDsl.g:8777:1: rule__Domain__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8781:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8782:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8782:2: ( RULE_ID )
            // InternalMyDsl.g:8783:3: RULE_ID
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
    // InternalMyDsl.g:8792:1: rule__Domain__ElementsAssignment_4 : ( ruleEntity ) ;
    public final void rule__Domain__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8796:1: ( ( ruleEntity ) )
            // InternalMyDsl.g:8797:2: ( ruleEntity )
            {
            // InternalMyDsl.g:8797:2: ( ruleEntity )
            // InternalMyDsl.g:8798:3: ruleEntity
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
    // InternalMyDsl.g:8807:1: rule__Domain__ElementsAssignment_5 : ( ruleFunctionality ) ;
    public final void rule__Domain__ElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8811:1: ( ( ruleFunctionality ) )
            // InternalMyDsl.g:8812:2: ( ruleFunctionality )
            {
            // InternalMyDsl.g:8812:2: ( ruleFunctionality )
            // InternalMyDsl.g:8813:3: ruleFunctionality
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
    // InternalMyDsl.g:8822:1: rule__Domain__ElementsAssignment_6 : ( ruleDomainConnection ) ;
    public final void rule__Domain__ElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8826:1: ( ( ruleDomainConnection ) )
            // InternalMyDsl.g:8827:2: ( ruleDomainConnection )
            {
            // InternalMyDsl.g:8827:2: ( ruleDomainConnection )
            // InternalMyDsl.g:8828:3: ruleDomainConnection
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
    // InternalMyDsl.g:8837:1: rule__Entity__ElementsAssignment_3 : ( ruleEntities ) ;
    public final void rule__Entity__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8841:1: ( ( ruleEntities ) )
            // InternalMyDsl.g:8842:2: ( ruleEntities )
            {
            // InternalMyDsl.g:8842:2: ( ruleEntities )
            // InternalMyDsl.g:8843:3: ruleEntities
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
    // InternalMyDsl.g:8852:1: rule__Entities__ElementsAssignment_0 : ( rulePhoto ) ;
    public final void rule__Entities__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8856:1: ( ( rulePhoto ) )
            // InternalMyDsl.g:8857:2: ( rulePhoto )
            {
            // InternalMyDsl.g:8857:2: ( rulePhoto )
            // InternalMyDsl.g:8858:3: rulePhoto
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
    // InternalMyDsl.g:8867:1: rule__Entities__ElementsAssignment_1 : ( ruleAlbum ) ;
    public final void rule__Entities__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8871:1: ( ( ruleAlbum ) )
            // InternalMyDsl.g:8872:2: ( ruleAlbum )
            {
            // InternalMyDsl.g:8872:2: ( ruleAlbum )
            // InternalMyDsl.g:8873:3: ruleAlbum
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
    // InternalMyDsl.g:8882:1: rule__Entities__ElementsAssignment_2 : ( ruleUserDomain ) ;
    public final void rule__Entities__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8886:1: ( ( ruleUserDomain ) )
            // InternalMyDsl.g:8887:2: ( ruleUserDomain )
            {
            // InternalMyDsl.g:8887:2: ( ruleUserDomain )
            // InternalMyDsl.g:8888:3: ruleUserDomain
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
    // InternalMyDsl.g:8897:1: rule__Photo__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Photo__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8901:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8902:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8902:2: ( RULE_ID )
            // InternalMyDsl.g:8903:3: RULE_ID
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
    // InternalMyDsl.g:8912:1: rule__Album__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Album__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8916:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8917:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8917:2: ( RULE_ID )
            // InternalMyDsl.g:8918:3: RULE_ID
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
    // InternalMyDsl.g:8927:1: rule__UserDomain__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__UserDomain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8931:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8932:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8932:2: ( RULE_ID )
            // InternalMyDsl.g:8933:3: RULE_ID
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
    // InternalMyDsl.g:8942:1: rule__Functionality__ElementsAssignment_3 : ( ruleFunctionalities ) ;
    public final void rule__Functionality__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8946:1: ( ( ruleFunctionalities ) )
            // InternalMyDsl.g:8947:2: ( ruleFunctionalities )
            {
            // InternalMyDsl.g:8947:2: ( ruleFunctionalities )
            // InternalMyDsl.g:8948:3: ruleFunctionalities
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
    // InternalMyDsl.g:8957:1: rule__Functionalities__FunctionsAssignment_0 : ( ruleProfileManagement ) ;
    public final void rule__Functionalities__FunctionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8961:1: ( ( ruleProfileManagement ) )
            // InternalMyDsl.g:8962:2: ( ruleProfileManagement )
            {
            // InternalMyDsl.g:8962:2: ( ruleProfileManagement )
            // InternalMyDsl.g:8963:3: ruleProfileManagement
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
    // InternalMyDsl.g:8972:1: rule__Functionalities__ElementsAssignment_1 : ( ruleAppAccess ) ;
    public final void rule__Functionalities__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8976:1: ( ( ruleAppAccess ) )
            // InternalMyDsl.g:8977:2: ( ruleAppAccess )
            {
            // InternalMyDsl.g:8977:2: ( ruleAppAccess )
            // InternalMyDsl.g:8978:3: ruleAppAccess
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
    // InternalMyDsl.g:8987:1: rule__Functionalities__ItemsAssignment_2 : ( ruleAlbumManagement ) ;
    public final void rule__Functionalities__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8991:1: ( ( ruleAlbumManagement ) )
            // InternalMyDsl.g:8992:2: ( ruleAlbumManagement )
            {
            // InternalMyDsl.g:8992:2: ( ruleAlbumManagement )
            // InternalMyDsl.g:8993:3: ruleAlbumManagement
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
    // InternalMyDsl.g:9002:1: rule__Functionalities__ResourcesAssignment_3 : ( rulePhotoActions ) ;
    public final void rule__Functionalities__ResourcesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9006:1: ( ( rulePhotoActions ) )
            // InternalMyDsl.g:9007:2: ( rulePhotoActions )
            {
            // InternalMyDsl.g:9007:2: ( rulePhotoActions )
            // InternalMyDsl.g:9008:3: rulePhotoActions
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
    // InternalMyDsl.g:9017:1: rule__Functionalities__AditionalsAssignment_4 : ( ruleLandingActions ) ;
    public final void rule__Functionalities__AditionalsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9021:1: ( ( ruleLandingActions ) )
            // InternalMyDsl.g:9022:2: ( ruleLandingActions )
            {
            // InternalMyDsl.g:9022:2: ( ruleLandingActions )
            // InternalMyDsl.g:9023:3: ruleLandingActions
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
    // InternalMyDsl.g:9032:1: rule__ProfileManagement__ItemsAssignment_2 : ( ruleProfileManagementFunctions ) ;
    public final void rule__ProfileManagement__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9036:1: ( ( ruleProfileManagementFunctions ) )
            // InternalMyDsl.g:9037:2: ( ruleProfileManagementFunctions )
            {
            // InternalMyDsl.g:9037:2: ( ruleProfileManagementFunctions )
            // InternalMyDsl.g:9038:3: ruleProfileManagementFunctions
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
    // InternalMyDsl.g:9047:1: rule__ProfileManagementFunctions__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ProfileManagementFunctions__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9051:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9052:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9052:2: ( RULE_ID )
            // InternalMyDsl.g:9053:3: RULE_ID
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
    // InternalMyDsl.g:9062:1: rule__ProfileManagementFunctions__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ProfileManagementFunctions__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9066:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9067:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9067:2: ( RULE_ID )
            // InternalMyDsl.g:9068:3: RULE_ID
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
    // InternalMyDsl.g:9077:1: rule__AppAccess__ItemsAssignment_2 : ( ruleAppAccessFunctions ) ;
    public final void rule__AppAccess__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9081:1: ( ( ruleAppAccessFunctions ) )
            // InternalMyDsl.g:9082:2: ( ruleAppAccessFunctions )
            {
            // InternalMyDsl.g:9082:2: ( ruleAppAccessFunctions )
            // InternalMyDsl.g:9083:3: ruleAppAccessFunctions
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
    // InternalMyDsl.g:9092:1: rule__AppAccessFunctions__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AppAccessFunctions__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9096:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9097:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9097:2: ( RULE_ID )
            // InternalMyDsl.g:9098:3: RULE_ID
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
    // InternalMyDsl.g:9107:1: rule__AppAccessFunctions__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__AppAccessFunctions__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9111:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9112:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9112:2: ( RULE_ID )
            // InternalMyDsl.g:9113:3: RULE_ID
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
    // InternalMyDsl.g:9122:1: rule__AlbumManagement__ItemsAssignment_2 : ( ruleAlbumManagementFunctions ) ;
    public final void rule__AlbumManagement__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9126:1: ( ( ruleAlbumManagementFunctions ) )
            // InternalMyDsl.g:9127:2: ( ruleAlbumManagementFunctions )
            {
            // InternalMyDsl.g:9127:2: ( ruleAlbumManagementFunctions )
            // InternalMyDsl.g:9128:3: ruleAlbumManagementFunctions
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
    // InternalMyDsl.g:9137:1: rule__AlbumManagementFunctions__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AlbumManagementFunctions__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9141:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9142:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9142:2: ( RULE_ID )
            // InternalMyDsl.g:9143:3: RULE_ID
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
    // InternalMyDsl.g:9152:1: rule__AlbumManagementFunctions__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__AlbumManagementFunctions__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9156:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9157:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9157:2: ( RULE_ID )
            // InternalMyDsl.g:9158:3: RULE_ID
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
    // InternalMyDsl.g:9167:1: rule__PhotoActions__ItemsAssignment_2 : ( rulePhotoActionsFunctions ) ;
    public final void rule__PhotoActions__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9171:1: ( ( rulePhotoActionsFunctions ) )
            // InternalMyDsl.g:9172:2: ( rulePhotoActionsFunctions )
            {
            // InternalMyDsl.g:9172:2: ( rulePhotoActionsFunctions )
            // InternalMyDsl.g:9173:3: rulePhotoActionsFunctions
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
    // InternalMyDsl.g:9182:1: rule__PhotoActionsFunctions__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PhotoActionsFunctions__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9186:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9187:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9187:2: ( RULE_ID )
            // InternalMyDsl.g:9188:3: RULE_ID
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
    // InternalMyDsl.g:9197:1: rule__PhotoActionsFunctions__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__PhotoActionsFunctions__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9201:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9202:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9202:2: ( RULE_ID )
            // InternalMyDsl.g:9203:3: RULE_ID
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
    // InternalMyDsl.g:9212:1: rule__PhotoActionsFunctions__NameAssignment_5 : ( RULE_ID ) ;
    public final void rule__PhotoActionsFunctions__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9216:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9217:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9217:2: ( RULE_ID )
            // InternalMyDsl.g:9218:3: RULE_ID
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
    // InternalMyDsl.g:9227:1: rule__LandingActions__ItemsAssignment_2 : ( ruleLandingFunctions ) ;
    public final void rule__LandingActions__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9231:1: ( ( ruleLandingFunctions ) )
            // InternalMyDsl.g:9232:2: ( ruleLandingFunctions )
            {
            // InternalMyDsl.g:9232:2: ( ruleLandingFunctions )
            // InternalMyDsl.g:9233:3: ruleLandingFunctions
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
    // InternalMyDsl.g:9242:1: rule__LandingFunctions__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LandingFunctions__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9246:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9247:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9247:2: ( RULE_ID )
            // InternalMyDsl.g:9248:3: RULE_ID
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
    // InternalMyDsl.g:9257:1: rule__LandingFunctions__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__LandingFunctions__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9261:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9262:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9262:2: ( RULE_ID )
            // InternalMyDsl.g:9263:3: RULE_ID
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
    // InternalMyDsl.g:9272:1: rule__DomainConnection__ElementsAssignment_3 : ( ruleDomainRelations ) ;
    public final void rule__DomainConnection__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9276:1: ( ( ruleDomainRelations ) )
            // InternalMyDsl.g:9277:2: ( ruleDomainRelations )
            {
            // InternalMyDsl.g:9277:2: ( ruleDomainRelations )
            // InternalMyDsl.g:9278:3: ruleDomainRelations
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
    // InternalMyDsl.g:9287:1: rule__DomainRelations__ElementsAssignment_0 : ( ruleUserDomain ) ;
    public final void rule__DomainRelations__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9291:1: ( ( ruleUserDomain ) )
            // InternalMyDsl.g:9292:2: ( ruleUserDomain )
            {
            // InternalMyDsl.g:9292:2: ( ruleUserDomain )
            // InternalMyDsl.g:9293:3: ruleUserDomain
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
    // InternalMyDsl.g:9302:1: rule__DomainRelations__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DomainRelations__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9306:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9307:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9307:2: ( RULE_ID )
            // InternalMyDsl.g:9308:3: RULE_ID
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
    // InternalMyDsl.g:9317:1: rule__DomainRelations__ElementsAssignment_4 : ( ruleFunctionalities ) ;
    public final void rule__DomainRelations__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9321:1: ( ( ruleFunctionalities ) )
            // InternalMyDsl.g:9322:2: ( ruleFunctionalities )
            {
            // InternalMyDsl.g:9322:2: ( ruleFunctionalities )
            // InternalMyDsl.g:9323:3: ruleFunctionalities
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
    // InternalMyDsl.g:9332:1: rule__DomainRelations__ElementsAssignment_6 : ( ruleAlbum ) ;
    public final void rule__DomainRelations__ElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9336:1: ( ( ruleAlbum ) )
            // InternalMyDsl.g:9337:2: ( ruleAlbum )
            {
            // InternalMyDsl.g:9337:2: ( ruleAlbum )
            // InternalMyDsl.g:9338:3: ruleAlbum
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
    // InternalMyDsl.g:9347:1: rule__DomainRelations__NameAssignment_7 : ( RULE_ID ) ;
    public final void rule__DomainRelations__NameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9351:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9352:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9352:2: ( RULE_ID )
            // InternalMyDsl.g:9353:3: RULE_ID
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
    // InternalMyDsl.g:9362:1: rule__DomainRelations__ElementsAssignment_10 : ( ruleAlbumManagementFunctions ) ;
    public final void rule__DomainRelations__ElementsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9366:1: ( ( ruleAlbumManagementFunctions ) )
            // InternalMyDsl.g:9367:2: ( ruleAlbumManagementFunctions )
            {
            // InternalMyDsl.g:9367:2: ( ruleAlbumManagementFunctions )
            // InternalMyDsl.g:9368:3: ruleAlbumManagementFunctions
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
    // InternalMyDsl.g:9377:1: rule__DomainRelations__ElementsAssignment_12 : ( rulePhoto ) ;
    public final void rule__DomainRelations__ElementsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9381:1: ( ( rulePhoto ) )
            // InternalMyDsl.g:9382:2: ( rulePhoto )
            {
            // InternalMyDsl.g:9382:2: ( rulePhoto )
            // InternalMyDsl.g:9383:3: rulePhoto
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
    // InternalMyDsl.g:9392:1: rule__DomainRelations__NameAssignment_13 : ( RULE_ID ) ;
    public final void rule__DomainRelations__NameAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9396:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9397:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9397:2: ( RULE_ID )
            // InternalMyDsl.g:9398:3: RULE_ID
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
    // InternalMyDsl.g:9407:1: rule__DomainRelations__ElementsAssignment_16 : ( rulePhotoActionsFunctions ) ;
    public final void rule__DomainRelations__ElementsAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9411:1: ( ( rulePhotoActionsFunctions ) )
            // InternalMyDsl.g:9412:2: ( rulePhotoActionsFunctions )
            {
            // InternalMyDsl.g:9412:2: ( rulePhotoActionsFunctions )
            // InternalMyDsl.g:9413:3: rulePhotoActionsFunctions
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
    // InternalMyDsl.g:9422:1: rule__DomainRelations__ElementsAssignment_18 : ( rulePhotoActions ) ;
    public final void rule__DomainRelations__ElementsAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9426:1: ( ( rulePhotoActions ) )
            // InternalMyDsl.g:9427:2: ( rulePhotoActions )
            {
            // InternalMyDsl.g:9427:2: ( rulePhotoActions )
            // InternalMyDsl.g:9428:3: rulePhotoActions
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
    // InternalMyDsl.g:9437:1: rule__DomainRelations__NameAssignment_19 : ( RULE_ID ) ;
    public final void rule__DomainRelations__NameAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9441:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9442:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9442:2: ( RULE_ID )
            // InternalMyDsl.g:9443:3: RULE_ID
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
    // InternalMyDsl.g:9452:1: rule__DomainRelations__ElementsAssignment_22 : ( ruleAlbumManagement ) ;
    public final void rule__DomainRelations__ElementsAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9456:1: ( ( ruleAlbumManagement ) )
            // InternalMyDsl.g:9457:2: ( ruleAlbumManagement )
            {
            // InternalMyDsl.g:9457:2: ( ruleAlbumManagement )
            // InternalMyDsl.g:9458:3: ruleAlbumManagement
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
    // InternalMyDsl.g:9467:1: rule__Architecture__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Architecture__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9471:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9472:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9472:2: ( RULE_ID )
            // InternalMyDsl.g:9473:3: RULE_ID
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
    // InternalMyDsl.g:9482:1: rule__Technology__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Technology__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9486:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9487:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9487:2: ( RULE_ID )
            // InternalMyDsl.g:9488:3: RULE_ID
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
    // InternalMyDsl.g:9497:1: rule__Technology__ElementsAssignment_4 : ( ruleTechnologies ) ;
    public final void rule__Technology__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9501:1: ( ( ruleTechnologies ) )
            // InternalMyDsl.g:9502:2: ( ruleTechnologies )
            {
            // InternalMyDsl.g:9502:2: ( ruleTechnologies )
            // InternalMyDsl.g:9503:3: ruleTechnologies
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
    // InternalMyDsl.g:9512:1: rule__Technologies__FactorsAssignment_0 : ( ruleSpring ) ;
    public final void rule__Technologies__FactorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9516:1: ( ( ruleSpring ) )
            // InternalMyDsl.g:9517:2: ( ruleSpring )
            {
            // InternalMyDsl.g:9517:2: ( ruleSpring )
            // InternalMyDsl.g:9518:3: ruleSpring
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
    // InternalMyDsl.g:9527:1: rule__Technologies__FactorsAssignment_1 : ( ruleReact ) ;
    public final void rule__Technologies__FactorsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9531:1: ( ( ruleReact ) )
            // InternalMyDsl.g:9532:2: ( ruleReact )
            {
            // InternalMyDsl.g:9532:2: ( ruleReact )
            // InternalMyDsl.g:9533:3: ruleReact
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
    // InternalMyDsl.g:9542:1: rule__Technologies__FactorsAssignment_2 : ( rulePostgreSQL ) ;
    public final void rule__Technologies__FactorsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9546:1: ( ( rulePostgreSQL ) )
            // InternalMyDsl.g:9547:2: ( rulePostgreSQL )
            {
            // InternalMyDsl.g:9547:2: ( rulePostgreSQL )
            // InternalMyDsl.g:9548:3: rulePostgreSQL
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
    // InternalMyDsl.g:9557:1: rule__Technologies__FactorsAssignment_3 : ( ruleAmazonWebServices ) ;
    public final void rule__Technologies__FactorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9561:1: ( ( ruleAmazonWebServices ) )
            // InternalMyDsl.g:9562:2: ( ruleAmazonWebServices )
            {
            // InternalMyDsl.g:9562:2: ( ruleAmazonWebServices )
            // InternalMyDsl.g:9563:3: ruleAmazonWebServices
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
    // InternalMyDsl.g:9572:1: rule__React__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__React__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9576:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9577:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9577:2: ( RULE_ID )
            // InternalMyDsl.g:9578:3: RULE_ID
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
    // InternalMyDsl.g:9587:1: rule__React__ReactsAssignment_4 : ( ruleReactModules ) ;
    public final void rule__React__ReactsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9591:1: ( ( ruleReactModules ) )
            // InternalMyDsl.g:9592:2: ( ruleReactModules )
            {
            // InternalMyDsl.g:9592:2: ( ruleReactModules )
            // InternalMyDsl.g:9593:3: ruleReactModules
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
    // InternalMyDsl.g:9602:1: rule__ReactModules__ReactmodulesAssignment_3 : ( ruleReactSubModules ) ;
    public final void rule__ReactModules__ReactmodulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9606:1: ( ( ruleReactSubModules ) )
            // InternalMyDsl.g:9607:2: ( ruleReactSubModules )
            {
            // InternalMyDsl.g:9607:2: ( ruleReactSubModules )
            // InternalMyDsl.g:9608:3: ruleReactSubModules
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
    // InternalMyDsl.g:9617:1: rule__ReactSubModules__ReactmodulesAssignment_0 : ( ruleReactConfiguration ) ;
    public final void rule__ReactSubModules__ReactmodulesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9621:1: ( ( ruleReactConfiguration ) )
            // InternalMyDsl.g:9622:2: ( ruleReactConfiguration )
            {
            // InternalMyDsl.g:9622:2: ( ruleReactConfiguration )
            // InternalMyDsl.g:9623:3: ruleReactConfiguration
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
    // InternalMyDsl.g:9632:1: rule__ReactSubModules__ReactmodulesAssignment_1 : ( ruleReactComponents ) ;
    public final void rule__ReactSubModules__ReactmodulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9636:1: ( ( ruleReactComponents ) )
            // InternalMyDsl.g:9637:2: ( ruleReactComponents )
            {
            // InternalMyDsl.g:9637:2: ( ruleReactComponents )
            // InternalMyDsl.g:9638:3: ruleReactComponents
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
    // InternalMyDsl.g:9647:1: rule__ReactSubModules__ReactmodulesAssignment_2 : ( ruleReactActions ) ;
    public final void rule__ReactSubModules__ReactmodulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9651:1: ( ( ruleReactActions ) )
            // InternalMyDsl.g:9652:2: ( ruleReactActions )
            {
            // InternalMyDsl.g:9652:2: ( ruleReactActions )
            // InternalMyDsl.g:9653:3: ruleReactActions
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
    // InternalMyDsl.g:9662:1: rule__ReactSubModules__ReactmodulesAssignment_3 : ( ruleReactLibraries ) ;
    public final void rule__ReactSubModules__ReactmodulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9666:1: ( ( ruleReactLibraries ) )
            // InternalMyDsl.g:9667:2: ( ruleReactLibraries )
            {
            // InternalMyDsl.g:9667:2: ( ruleReactLibraries )
            // InternalMyDsl.g:9668:3: ruleReactLibraries
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
    // InternalMyDsl.g:9677:1: rule__ReactSubModules__ReactmodulesAssignment_4 : ( ruleReactInfo ) ;
    public final void rule__ReactSubModules__ReactmodulesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9681:1: ( ( ruleReactInfo ) )
            // InternalMyDsl.g:9682:2: ( ruleReactInfo )
            {
            // InternalMyDsl.g:9682:2: ( ruleReactInfo )
            // InternalMyDsl.g:9683:3: ruleReactInfo
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


    // $ANTLR start "rule__ReactConfiguration__DependenciesAssignment_3"
    // InternalMyDsl.g:9692:1: rule__ReactConfiguration__DependenciesAssignment_3 : ( ruleReactDependencies ) ;
    public final void rule__ReactConfiguration__DependenciesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9696:1: ( ( ruleReactDependencies ) )
            // InternalMyDsl.g:9697:2: ( ruleReactDependencies )
            {
            // InternalMyDsl.g:9697:2: ( ruleReactDependencies )
            // InternalMyDsl.g:9698:3: ruleReactDependencies
            {
             before(grammarAccess.getReactConfigurationAccess().getDependenciesReactDependenciesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleReactDependencies();

            state._fsp--;

             after(grammarAccess.getReactConfigurationAccess().getDependenciesReactDependenciesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactConfiguration__DependenciesAssignment_3"


    // $ANTLR start "rule__ReactConfiguration__ConfigurationsAssignment_4"
    // InternalMyDsl.g:9707:1: rule__ReactConfiguration__ConfigurationsAssignment_4 : ( ruleReactConfigurations ) ;
    public final void rule__ReactConfiguration__ConfigurationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9711:1: ( ( ruleReactConfigurations ) )
            // InternalMyDsl.g:9712:2: ( ruleReactConfigurations )
            {
            // InternalMyDsl.g:9712:2: ( ruleReactConfigurations )
            // InternalMyDsl.g:9713:3: ruleReactConfigurations
            {
             before(grammarAccess.getReactConfigurationAccess().getConfigurationsReactConfigurationsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleReactConfigurations();

            state._fsp--;

             after(grammarAccess.getReactConfigurationAccess().getConfigurationsReactConfigurationsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactConfiguration__ConfigurationsAssignment_4"


    // $ANTLR start "rule__ReactDependencies__DependenciesAssignment_1"
    // InternalMyDsl.g:9722:1: rule__ReactDependencies__DependenciesAssignment_1 : ( ruleReactDependenciesRules ) ;
    public final void rule__ReactDependencies__DependenciesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9726:1: ( ( ruleReactDependenciesRules ) )
            // InternalMyDsl.g:9727:2: ( ruleReactDependenciesRules )
            {
            // InternalMyDsl.g:9727:2: ( ruleReactDependenciesRules )
            // InternalMyDsl.g:9728:3: ruleReactDependenciesRules
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
    // InternalMyDsl.g:9737:1: rule__ReactDependenciesRules__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ReactDependenciesRules__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9741:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9742:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9742:2: ( RULE_ID )
            // InternalMyDsl.g:9743:3: RULE_ID
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
    // InternalMyDsl.g:9752:1: rule__ReactDependenciesRules__DependenciesAssignment_2 : ( ruleReactDependenciesSubRules ) ;
    public final void rule__ReactDependenciesRules__DependenciesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9756:1: ( ( ruleReactDependenciesSubRules ) )
            // InternalMyDsl.g:9757:2: ( ruleReactDependenciesSubRules )
            {
            // InternalMyDsl.g:9757:2: ( ruleReactDependenciesSubRules )
            // InternalMyDsl.g:9758:3: ruleReactDependenciesSubRules
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
    // InternalMyDsl.g:9767:1: rule__ReactDependenciesSubRules__DependenciesAssignment : ( ruleSingleDependencies ) ;
    public final void rule__ReactDependenciesSubRules__DependenciesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9771:1: ( ( ruleSingleDependencies ) )
            // InternalMyDsl.g:9772:2: ( ruleSingleDependencies )
            {
            // InternalMyDsl.g:9772:2: ( ruleSingleDependencies )
            // InternalMyDsl.g:9773:3: ruleSingleDependencies
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
    // InternalMyDsl.g:9782:1: rule__SingleDependencies__DependenciesAssignment_0 : ( rulePackageName ) ;
    public final void rule__SingleDependencies__DependenciesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9786:1: ( ( rulePackageName ) )
            // InternalMyDsl.g:9787:2: ( rulePackageName )
            {
            // InternalMyDsl.g:9787:2: ( rulePackageName )
            // InternalMyDsl.g:9788:3: rulePackageName
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
    // InternalMyDsl.g:9797:1: rule__SingleDependencies__DependenciesAssignment_1 : ( rulePackageVersion ) ;
    public final void rule__SingleDependencies__DependenciesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9801:1: ( ( rulePackageVersion ) )
            // InternalMyDsl.g:9802:2: ( rulePackageVersion )
            {
            // InternalMyDsl.g:9802:2: ( rulePackageVersion )
            // InternalMyDsl.g:9803:3: rulePackageVersion
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
    // InternalMyDsl.g:9812:1: rule__PackageName__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PackageName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9816:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9817:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9817:2: ( RULE_ID )
            // InternalMyDsl.g:9818:3: RULE_ID
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
    // InternalMyDsl.g:9827:1: rule__PackageVersion__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PackageVersion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9831:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9832:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9832:2: ( RULE_ID )
            // InternalMyDsl.g:9833:3: RULE_ID
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
    // InternalMyDsl.g:9842:1: rule__ReactConfigurations__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ReactConfigurations__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9846:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9847:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9847:2: ( RULE_ID )
            // InternalMyDsl.g:9848:3: RULE_ID
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


    // $ANTLR start "rule__ReactConfigurations__ConfigurationsAssignment_2"
    // InternalMyDsl.g:9857:1: rule__ReactConfigurations__ConfigurationsAssignment_2 : ( ruleDOMConfigurations ) ;
    public final void rule__ReactConfigurations__ConfigurationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9861:1: ( ( ruleDOMConfigurations ) )
            // InternalMyDsl.g:9862:2: ( ruleDOMConfigurations )
            {
            // InternalMyDsl.g:9862:2: ( ruleDOMConfigurations )
            // InternalMyDsl.g:9863:3: ruleDOMConfigurations
            {
             before(grammarAccess.getReactConfigurationsAccess().getConfigurationsDOMConfigurationsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOMConfigurations();

            state._fsp--;

             after(grammarAccess.getReactConfigurationsAccess().getConfigurationsDOMConfigurationsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactConfigurations__ConfigurationsAssignment_2"


    // $ANTLR start "rule__DOMConfigurations__ElementsAssignment_0"
    // InternalMyDsl.g:9872:1: rule__DOMConfigurations__ElementsAssignment_0 : ( ruleDOMTypeConf ) ;
    public final void rule__DOMConfigurations__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9876:1: ( ( ruleDOMTypeConf ) )
            // InternalMyDsl.g:9877:2: ( ruleDOMTypeConf )
            {
            // InternalMyDsl.g:9877:2: ( ruleDOMTypeConf )
            // InternalMyDsl.g:9878:3: ruleDOMTypeConf
            {
             before(grammarAccess.getDOMConfigurationsAccess().getElementsDOMTypeConfParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDOMTypeConf();

            state._fsp--;

             after(grammarAccess.getDOMConfigurationsAccess().getElementsDOMTypeConfParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOMConfigurations__ElementsAssignment_0"


    // $ANTLR start "rule__DOMConfigurations__NameAssignment_1"
    // InternalMyDsl.g:9887:1: rule__DOMConfigurations__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DOMConfigurations__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9891:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9892:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9892:2: ( RULE_ID )
            // InternalMyDsl.g:9893:3: RULE_ID
            {
             before(grammarAccess.getDOMConfigurationsAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDOMConfigurationsAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOMConfigurations__NameAssignment_1"


    // $ANTLR start "rule__ReactComponents__ComponentslogicAssignment_3"
    // InternalMyDsl.g:9902:1: rule__ReactComponents__ComponentslogicAssignment_3 : ( ruleComponentsLogic ) ;
    public final void rule__ReactComponents__ComponentslogicAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9906:1: ( ( ruleComponentsLogic ) )
            // InternalMyDsl.g:9907:2: ( ruleComponentsLogic )
            {
            // InternalMyDsl.g:9907:2: ( ruleComponentsLogic )
            // InternalMyDsl.g:9908:3: ruleComponentsLogic
            {
             before(grammarAccess.getReactComponentsAccess().getComponentslogicComponentsLogicParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentsLogic();

            state._fsp--;

             after(grammarAccess.getReactComponentsAccess().getComponentslogicComponentsLogicParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactComponents__ComponentslogicAssignment_3"


    // $ANTLR start "rule__ReactComponents__ComponentsuiAssignment_4"
    // InternalMyDsl.g:9917:1: rule__ReactComponents__ComponentsuiAssignment_4 : ( ruleComponentsUI ) ;
    public final void rule__ReactComponents__ComponentsuiAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9921:1: ( ( ruleComponentsUI ) )
            // InternalMyDsl.g:9922:2: ( ruleComponentsUI )
            {
            // InternalMyDsl.g:9922:2: ( ruleComponentsUI )
            // InternalMyDsl.g:9923:3: ruleComponentsUI
            {
             before(grammarAccess.getReactComponentsAccess().getComponentsuiComponentsUIParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentsUI();

            state._fsp--;

             after(grammarAccess.getReactComponentsAccess().getComponentsuiComponentsUIParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactComponents__ComponentsuiAssignment_4"


    // $ANTLR start "rule__ComponentsLogic__NameAssignment_1"
    // InternalMyDsl.g:9932:1: rule__ComponentsLogic__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ComponentsLogic__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9936:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9937:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9937:2: ( RULE_ID )
            // InternalMyDsl.g:9938:3: RULE_ID
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


    // $ANTLR start "rule__ComponentsLogic__LogiccomponentsAssignment_2"
    // InternalMyDsl.g:9947:1: rule__ComponentsLogic__LogiccomponentsAssignment_2 : ( ruleLogicContent ) ;
    public final void rule__ComponentsLogic__LogiccomponentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9951:1: ( ( ruleLogicContent ) )
            // InternalMyDsl.g:9952:2: ( ruleLogicContent )
            {
            // InternalMyDsl.g:9952:2: ( ruleLogicContent )
            // InternalMyDsl.g:9953:3: ruleLogicContent
            {
             before(grammarAccess.getComponentsLogicAccess().getLogiccomponentsLogicContentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLogicContent();

            state._fsp--;

             after(grammarAccess.getComponentsLogicAccess().getLogiccomponentsLogicContentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentsLogic__LogiccomponentsAssignment_2"


    // $ANTLR start "rule__LogicContent__NameAssignment_1"
    // InternalMyDsl.g:9962:1: rule__LogicContent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LogicContent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9966:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9967:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9967:2: ( RULE_ID )
            // InternalMyDsl.g:9968:3: RULE_ID
            {
             before(grammarAccess.getLogicContentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLogicContentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicContent__NameAssignment_1"


    // $ANTLR start "rule__LogicContent__LogiccomponentsAssignment_2"
    // InternalMyDsl.g:9977:1: rule__LogicContent__LogiccomponentsAssignment_2 : ( ruleLogicStructure ) ;
    public final void rule__LogicContent__LogiccomponentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9981:1: ( ( ruleLogicStructure ) )
            // InternalMyDsl.g:9982:2: ( ruleLogicStructure )
            {
            // InternalMyDsl.g:9982:2: ( ruleLogicStructure )
            // InternalMyDsl.g:9983:3: ruleLogicStructure
            {
             before(grammarAccess.getLogicContentAccess().getLogiccomponentsLogicStructureParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLogicStructure();

            state._fsp--;

             after(grammarAccess.getLogicContentAccess().getLogiccomponentsLogicStructureParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicContent__LogiccomponentsAssignment_2"


    // $ANTLR start "rule__LogicStructure__NameAssignment_1"
    // InternalMyDsl.g:9992:1: rule__LogicStructure__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LogicStructure__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9996:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9997:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9997:2: ( RULE_ID )
            // InternalMyDsl.g:9998:3: RULE_ID
            {
             before(grammarAccess.getLogicStructureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLogicStructureAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicStructure__NameAssignment_1"


    // $ANTLR start "rule__LogicStructure__LogiccomponentsAssignment_2"
    // InternalMyDsl.g:10007:1: rule__LogicStructure__LogiccomponentsAssignment_2 : ( ruleComponentClass ) ;
    public final void rule__LogicStructure__LogiccomponentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10011:1: ( ( ruleComponentClass ) )
            // InternalMyDsl.g:10012:2: ( ruleComponentClass )
            {
            // InternalMyDsl.g:10012:2: ( ruleComponentClass )
            // InternalMyDsl.g:10013:3: ruleComponentClass
            {
             before(grammarAccess.getLogicStructureAccess().getLogiccomponentsComponentClassParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentClass();

            state._fsp--;

             after(grammarAccess.getLogicStructureAccess().getLogiccomponentsComponentClassParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicStructure__LogiccomponentsAssignment_2"


    // $ANTLR start "rule__LogicStructure__NameAssignment_4"
    // InternalMyDsl.g:10022:1: rule__LogicStructure__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__LogicStructure__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10026:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:10027:2: ( RULE_ID )
            {
            // InternalMyDsl.g:10027:2: ( RULE_ID )
            // InternalMyDsl.g:10028:3: RULE_ID
            {
             before(grammarAccess.getLogicStructureAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLogicStructureAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicStructure__NameAssignment_4"


    // $ANTLR start "rule__ComponentsUI__NameAssignment_1"
    // InternalMyDsl.g:10037:1: rule__ComponentsUI__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ComponentsUI__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10041:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:10042:2: ( RULE_ID )
            {
            // InternalMyDsl.g:10042:2: ( RULE_ID )
            // InternalMyDsl.g:10043:3: RULE_ID
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


    // $ANTLR start "rule__ComponentsUI__UicomponentsAssignment_2"
    // InternalMyDsl.g:10052:1: rule__ComponentsUI__UicomponentsAssignment_2 : ( ruleUIContent ) ;
    public final void rule__ComponentsUI__UicomponentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10056:1: ( ( ruleUIContent ) )
            // InternalMyDsl.g:10057:2: ( ruleUIContent )
            {
            // InternalMyDsl.g:10057:2: ( ruleUIContent )
            // InternalMyDsl.g:10058:3: ruleUIContent
            {
             before(grammarAccess.getComponentsUIAccess().getUicomponentsUIContentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUIContent();

            state._fsp--;

             after(grammarAccess.getComponentsUIAccess().getUicomponentsUIContentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentsUI__UicomponentsAssignment_2"


    // $ANTLR start "rule__UIContent__NameAssignment_0_1"
    // InternalMyDsl.g:10067:1: rule__UIContent__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__UIContent__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10071:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:10072:2: ( RULE_ID )
            {
            // InternalMyDsl.g:10072:2: ( RULE_ID )
            // InternalMyDsl.g:10073:3: RULE_ID
            {
             before(grammarAccess.getUIContentAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUIContentAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContent__NameAssignment_0_1"


    // $ANTLR start "rule__UIContent__UicontentAssignment_0_2"
    // InternalMyDsl.g:10082:1: rule__UIContent__UicontentAssignment_0_2 : ( ruleComponentClass ) ;
    public final void rule__UIContent__UicontentAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10086:1: ( ( ruleComponentClass ) )
            // InternalMyDsl.g:10087:2: ( ruleComponentClass )
            {
            // InternalMyDsl.g:10087:2: ( ruleComponentClass )
            // InternalMyDsl.g:10088:3: ruleComponentClass
            {
             before(grammarAccess.getUIContentAccess().getUicontentComponentClassParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentClass();

            state._fsp--;

             after(grammarAccess.getUIContentAccess().getUicontentComponentClassParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContent__UicontentAssignment_0_2"


    // $ANTLR start "rule__UIContent__NameAssignment_1_1"
    // InternalMyDsl.g:10097:1: rule__UIContent__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__UIContent__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10101:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:10102:2: ( RULE_ID )
            {
            // InternalMyDsl.g:10102:2: ( RULE_ID )
            // InternalMyDsl.g:10103:3: RULE_ID
            {
             before(grammarAccess.getUIContentAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUIContentAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContent__NameAssignment_1_1"


    // $ANTLR start "rule__UIContent__UicontentAssignment_1_2"
    // InternalMyDsl.g:10112:1: rule__UIContent__UicontentAssignment_1_2 : ( ruleComponentClass ) ;
    public final void rule__UIContent__UicontentAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10116:1: ( ( ruleComponentClass ) )
            // InternalMyDsl.g:10117:2: ( ruleComponentClass )
            {
            // InternalMyDsl.g:10117:2: ( ruleComponentClass )
            // InternalMyDsl.g:10118:3: ruleComponentClass
            {
             before(grammarAccess.getUIContentAccess().getUicontentComponentClassParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentClass();

            state._fsp--;

             after(grammarAccess.getUIContentAccess().getUicontentComponentClassParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIContent__UicontentAssignment_1_2"


    // $ANTLR start "rule__ComponentClass__ComponentclassAssignment_0"
    // InternalMyDsl.g:10127:1: rule__ComponentClass__ComponentclassAssignment_0 : ( ruleReactFunctions ) ;
    public final void rule__ComponentClass__ComponentclassAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10131:1: ( ( ruleReactFunctions ) )
            // InternalMyDsl.g:10132:2: ( ruleReactFunctions )
            {
            // InternalMyDsl.g:10132:2: ( ruleReactFunctions )
            // InternalMyDsl.g:10133:3: ruleReactFunctions
            {
             before(grammarAccess.getComponentClassAccess().getComponentclassReactFunctionsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleReactFunctions();

            state._fsp--;

             after(grammarAccess.getComponentClassAccess().getComponentclassReactFunctionsParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentClass__ComponentclassAssignment_0"


    // $ANTLR start "rule__ComponentClass__ComponentclassAssignment_1"
    // InternalMyDsl.g:10142:1: rule__ComponentClass__ComponentclassAssignment_1 : ( ruleProps ) ;
    public final void rule__ComponentClass__ComponentclassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10146:1: ( ( ruleProps ) )
            // InternalMyDsl.g:10147:2: ( ruleProps )
            {
            // InternalMyDsl.g:10147:2: ( ruleProps )
            // InternalMyDsl.g:10148:3: ruleProps
            {
             before(grammarAccess.getComponentClassAccess().getComponentclassPropsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProps();

            state._fsp--;

             after(grammarAccess.getComponentClassAccess().getComponentclassPropsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentClass__ComponentclassAssignment_1"


    // $ANTLR start "rule__ReactFunctions__ComponentclassAssignment_0"
    // InternalMyDsl.g:10157:1: rule__ReactFunctions__ComponentclassAssignment_0 : ( ruleReactConstructor ) ;
    public final void rule__ReactFunctions__ComponentclassAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10161:1: ( ( ruleReactConstructor ) )
            // InternalMyDsl.g:10162:2: ( ruleReactConstructor )
            {
            // InternalMyDsl.g:10162:2: ( ruleReactConstructor )
            // InternalMyDsl.g:10163:3: ruleReactConstructor
            {
             before(grammarAccess.getReactFunctionsAccess().getComponentclassReactConstructorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleReactConstructor();

            state._fsp--;

             after(grammarAccess.getReactFunctionsAccess().getComponentclassReactConstructorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactFunctions__ComponentclassAssignment_0"


    // $ANTLR start "rule__ReactFunctions__LifecycleclassAssignment_1"
    // InternalMyDsl.g:10172:1: rule__ReactFunctions__LifecycleclassAssignment_1 : ( ruleReactLifeCycle ) ;
    public final void rule__ReactFunctions__LifecycleclassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10176:1: ( ( ruleReactLifeCycle ) )
            // InternalMyDsl.g:10177:2: ( ruleReactLifeCycle )
            {
            // InternalMyDsl.g:10177:2: ( ruleReactLifeCycle )
            // InternalMyDsl.g:10178:3: ruleReactLifeCycle
            {
             before(grammarAccess.getReactFunctionsAccess().getLifecycleclassReactLifeCycleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReactLifeCycle();

            state._fsp--;

             after(grammarAccess.getReactFunctionsAccess().getLifecycleclassReactLifeCycleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactFunctions__LifecycleclassAssignment_1"


    // $ANTLR start "rule__ReactFunctions__ComponentclassAssignment_2"
    // InternalMyDsl.g:10187:1: rule__ReactFunctions__ComponentclassAssignment_2 : ( ruleReactCoreFunctions ) ;
    public final void rule__ReactFunctions__ComponentclassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10191:1: ( ( ruleReactCoreFunctions ) )
            // InternalMyDsl.g:10192:2: ( ruleReactCoreFunctions )
            {
            // InternalMyDsl.g:10192:2: ( ruleReactCoreFunctions )
            // InternalMyDsl.g:10193:3: ruleReactCoreFunctions
            {
             before(grammarAccess.getReactFunctionsAccess().getComponentclassReactCoreFunctionsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReactCoreFunctions();

            state._fsp--;

             after(grammarAccess.getReactFunctionsAccess().getComponentclassReactCoreFunctionsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactFunctions__ComponentclassAssignment_2"


    // $ANTLR start "rule__ReactFunctions__RenderclassAssignment_3"
    // InternalMyDsl.g:10202:1: rule__ReactFunctions__RenderclassAssignment_3 : ( ruleReactRender ) ;
    public final void rule__ReactFunctions__RenderclassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10206:1: ( ( ruleReactRender ) )
            // InternalMyDsl.g:10207:2: ( ruleReactRender )
            {
            // InternalMyDsl.g:10207:2: ( ruleReactRender )
            // InternalMyDsl.g:10208:3: ruleReactRender
            {
             before(grammarAccess.getReactFunctionsAccess().getRenderclassReactRenderParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleReactRender();

            state._fsp--;

             after(grammarAccess.getReactFunctionsAccess().getRenderclassReactRenderParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactFunctions__RenderclassAssignment_3"


    // $ANTLR start "rule__ReactConstructor__ComponentclassAssignment_1"
    // InternalMyDsl.g:10217:1: rule__ReactConstructor__ComponentclassAssignment_1 : ( ruleState ) ;
    public final void rule__ReactConstructor__ComponentclassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10221:1: ( ( ruleState ) )
            // InternalMyDsl.g:10222:2: ( ruleState )
            {
            // InternalMyDsl.g:10222:2: ( ruleState )
            // InternalMyDsl.g:10223:3: ruleState
            {
             before(grammarAccess.getReactConstructorAccess().getComponentclassStateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getReactConstructorAccess().getComponentclassStateParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactConstructor__ComponentclassAssignment_1"


    // $ANTLR start "rule__ReactConstructor__ComponentclassAssignment_2"
    // InternalMyDsl.g:10232:1: rule__ReactConstructor__ComponentclassAssignment_2 : ( ruleCoreFunctionsDeclaration ) ;
    public final void rule__ReactConstructor__ComponentclassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10236:1: ( ( ruleCoreFunctionsDeclaration ) )
            // InternalMyDsl.g:10237:2: ( ruleCoreFunctionsDeclaration )
            {
            // InternalMyDsl.g:10237:2: ( ruleCoreFunctionsDeclaration )
            // InternalMyDsl.g:10238:3: ruleCoreFunctionsDeclaration
            {
             before(grammarAccess.getReactConstructorAccess().getComponentclassCoreFunctionsDeclarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCoreFunctionsDeclaration();

            state._fsp--;

             after(grammarAccess.getReactConstructorAccess().getComponentclassCoreFunctionsDeclarationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactConstructor__ComponentclassAssignment_2"


    // $ANTLR start "rule__State__NameAssignment_1_0"
    // InternalMyDsl.g:10247:1: rule__State__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10251:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:10252:2: ( RULE_ID )
            {
            // InternalMyDsl.g:10252:2: ( RULE_ID )
            // InternalMyDsl.g:10253:3: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_1_0"


    // $ANTLR start "rule__State__ComponentclassAssignment_1_1"
    // InternalMyDsl.g:10262:1: rule__State__ComponentclassAssignment_1_1 : ( ruleDataType ) ;
    public final void rule__State__ComponentclassAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10266:1: ( ( ruleDataType ) )
            // InternalMyDsl.g:10267:2: ( ruleDataType )
            {
            // InternalMyDsl.g:10267:2: ( ruleDataType )
            // InternalMyDsl.g:10268:3: ruleDataType
            {
             before(grammarAccess.getStateAccess().getComponentclassDataTypeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getStateAccess().getComponentclassDataTypeParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__ComponentclassAssignment_1_1"


    // $ANTLR start "rule__CoreFunctionsDeclaration__NameAssignment_0"
    // InternalMyDsl.g:10277:1: rule__CoreFunctionsDeclaration__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__CoreFunctionsDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10281:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:10282:2: ( RULE_ID )
            {
            // InternalMyDsl.g:10282:2: ( RULE_ID )
            // InternalMyDsl.g:10283:3: RULE_ID
            {
             before(grammarAccess.getCoreFunctionsDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCoreFunctionsDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoreFunctionsDeclaration__NameAssignment_0"


    // $ANTLR start "rule__Props__NameAssignment_1_0"
    // InternalMyDsl.g:10292:1: rule__Props__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Props__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10296:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:10297:2: ( RULE_ID )
            {
            // InternalMyDsl.g:10297:2: ( RULE_ID )
            // InternalMyDsl.g:10298:3: RULE_ID
            {
             before(grammarAccess.getPropsAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropsAccess().getNameIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Props__NameAssignment_1_0"


    // $ANTLR start "rule__Props__ComponentclassAssignment_1_1"
    // InternalMyDsl.g:10307:1: rule__Props__ComponentclassAssignment_1_1 : ( ruleDataType ) ;
    public final void rule__Props__ComponentclassAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10311:1: ( ( ruleDataType ) )
            // InternalMyDsl.g:10312:2: ( ruleDataType )
            {
            // InternalMyDsl.g:10312:2: ( ruleDataType )
            // InternalMyDsl.g:10313:3: ruleDataType
            {
             before(grammarAccess.getPropsAccess().getComponentclassDataTypeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getPropsAccess().getComponentclassDataTypeParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Props__ComponentclassAssignment_1_1"


    // $ANTLR start "rule__ReactCoreFunctions__NameAssignment_0"
    // InternalMyDsl.g:10322:1: rule__ReactCoreFunctions__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ReactCoreFunctions__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10326:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:10327:2: ( RULE_ID )
            {
            // InternalMyDsl.g:10327:2: ( RULE_ID )
            // InternalMyDsl.g:10328:3: RULE_ID
            {
             before(grammarAccess.getReactCoreFunctionsAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReactCoreFunctionsAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactCoreFunctions__NameAssignment_0"


    // $ANTLR start "rule__ReactActions__ReactactcontentAssignment_3"
    // InternalMyDsl.g:10337:1: rule__ReactActions__ReactactcontentAssignment_3 : ( ruleReactActionsContent ) ;
    public final void rule__ReactActions__ReactactcontentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10341:1: ( ( ruleReactActionsContent ) )
            // InternalMyDsl.g:10342:2: ( ruleReactActionsContent )
            {
            // InternalMyDsl.g:10342:2: ( ruleReactActionsContent )
            // InternalMyDsl.g:10343:3: ruleReactActionsContent
            {
             before(grammarAccess.getReactActionsAccess().getReactactcontentReactActionsContentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleReactActionsContent();

            state._fsp--;

             after(grammarAccess.getReactActionsAccess().getReactactcontentReactActionsContentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactActions__ReactactcontentAssignment_3"


    // $ANTLR start "rule__ReactActionsContent__ReactrelcontentAssignment"
    // InternalMyDsl.g:10352:1: rule__ReactActionsContent__ReactrelcontentAssignment : ( ruleReactServicesRelation ) ;
    public final void rule__ReactActionsContent__ReactrelcontentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10356:1: ( ( ruleReactServicesRelation ) )
            // InternalMyDsl.g:10357:2: ( ruleReactServicesRelation )
            {
            // InternalMyDsl.g:10357:2: ( ruleReactServicesRelation )
            // InternalMyDsl.g:10358:3: ruleReactServicesRelation
            {
             before(grammarAccess.getReactActionsContentAccess().getReactrelcontentReactServicesRelationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleReactServicesRelation();

            state._fsp--;

             after(grammarAccess.getReactActionsContentAccess().getReactrelcontentReactServicesRelationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactActionsContent__ReactrelcontentAssignment"


    // $ANTLR start "rule__ReactServicesType__NameAssignment_1"
    // InternalMyDsl.g:10367:1: rule__ReactServicesType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ReactServicesType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10371:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:10372:2: ( RULE_ID )
            {
            // InternalMyDsl.g:10372:2: ( RULE_ID )
            // InternalMyDsl.g:10373:3: RULE_ID
            {
             before(grammarAccess.getReactServicesTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReactServicesTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactServicesType__NameAssignment_1"


    // $ANTLR start "rule__ReactServicesRelation__ReactrelationcontentAssignment_1_0"
    // InternalMyDsl.g:10382:1: rule__ReactServicesRelation__ReactrelationcontentAssignment_1_0 : ( ruleReactServicesType ) ;
    public final void rule__ReactServicesRelation__ReactrelationcontentAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10386:1: ( ( ruleReactServicesType ) )
            // InternalMyDsl.g:10387:2: ( ruleReactServicesType )
            {
            // InternalMyDsl.g:10387:2: ( ruleReactServicesType )
            // InternalMyDsl.g:10388:3: ruleReactServicesType
            {
             before(grammarAccess.getReactServicesRelationAccess().getReactrelationcontentReactServicesTypeParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleReactServicesType();

            state._fsp--;

             after(grammarAccess.getReactServicesRelationAccess().getReactrelationcontentReactServicesTypeParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactServicesRelation__ReactrelationcontentAssignment_1_0"


    // $ANTLR start "rule__ReactServicesRelation__NameAssignment_1_1"
    // InternalMyDsl.g:10397:1: rule__ReactServicesRelation__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__ReactServicesRelation__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10401:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:10402:2: ( RULE_ID )
            {
            // InternalMyDsl.g:10402:2: ( RULE_ID )
            // InternalMyDsl.g:10403:3: RULE_ID
            {
             before(grammarAccess.getReactServicesRelationAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReactServicesRelationAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactServicesRelation__NameAssignment_1_1"


    // $ANTLR start "rule__ReactLibraries__ReactlibrariesAssignment_3"
    // InternalMyDsl.g:10412:1: rule__ReactLibraries__ReactlibrariesAssignment_3 : ( ruleReactLibrary ) ;
    public final void rule__ReactLibraries__ReactlibrariesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10416:1: ( ( ruleReactLibrary ) )
            // InternalMyDsl.g:10417:2: ( ruleReactLibrary )
            {
            // InternalMyDsl.g:10417:2: ( ruleReactLibrary )
            // InternalMyDsl.g:10418:3: ruleReactLibrary
            {
             before(grammarAccess.getReactLibrariesAccess().getReactlibrariesReactLibraryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleReactLibrary();

            state._fsp--;

             after(grammarAccess.getReactLibrariesAccess().getReactlibrariesReactLibraryParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactLibraries__ReactlibrariesAssignment_3"


    // $ANTLR start "rule__ReactLibrary__NameAssignment_1"
    // InternalMyDsl.g:10427:1: rule__ReactLibrary__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ReactLibrary__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10431:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:10432:2: ( RULE_ID )
            {
            // InternalMyDsl.g:10432:2: ( RULE_ID )
            // InternalMyDsl.g:10433:3: RULE_ID
            {
             before(grammarAccess.getReactLibraryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReactLibraryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactLibrary__NameAssignment_1"


    // $ANTLR start "rule__ReactInfo__ReactinformationAssignment_3"
    // InternalMyDsl.g:10442:1: rule__ReactInfo__ReactinformationAssignment_3 : ( ruleReactInformation ) ;
    public final void rule__ReactInfo__ReactinformationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10446:1: ( ( ruleReactInformation ) )
            // InternalMyDsl.g:10447:2: ( ruleReactInformation )
            {
            // InternalMyDsl.g:10447:2: ( ruleReactInformation )
            // InternalMyDsl.g:10448:3: ruleReactInformation
            {
             before(grammarAccess.getReactInfoAccess().getReactinformationReactInformationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleReactInformation();

            state._fsp--;

             after(grammarAccess.getReactInfoAccess().getReactinformationReactInformationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactInfo__ReactinformationAssignment_3"


    // $ANTLR start "rule__ReactInformation__NameAssignment_1"
    // InternalMyDsl.g:10457:1: rule__ReactInformation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ReactInformation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10461:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:10462:2: ( RULE_ID )
            {
            // InternalMyDsl.g:10462:2: ( RULE_ID )
            // InternalMyDsl.g:10463:3: RULE_ID
            {
             before(grammarAccess.getReactInformationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReactInformationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReactInformation__NameAssignment_1"


    // $ANTLR start "rule__Spring__NameAssignment_1"
    // InternalMyDsl.g:10472:1: rule__Spring__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Spring__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10476:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:10477:2: ( RULE_ID )
            {
            // InternalMyDsl.g:10477:2: ( RULE_ID )
            // InternalMyDsl.g:10478:3: RULE_ID
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
    // InternalMyDsl.g:10487:1: rule__PostgreSQL__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PostgreSQL__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10491:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:10492:2: ( RULE_ID )
            {
            // InternalMyDsl.g:10492:2: ( RULE_ID )
            // InternalMyDsl.g:10493:3: RULE_ID
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
    // InternalMyDsl.g:10502:1: rule__AmazonWebServices__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AmazonWebServices__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10506:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:10507:2: ( RULE_ID )
            {
            // InternalMyDsl.g:10507:2: ( RULE_ID )
            // InternalMyDsl.g:10508:3: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x000000000000F802L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000010L,0x00000000001D0000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000002L,0x00000000000D0000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x00000000003F0000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x000000003F000002L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});

}