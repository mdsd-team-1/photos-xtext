/*
 * generated by Xtext 2.17.1
 */
package org.xtext.photos.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.photos.mydsl.MyDsl.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cElementsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cElementsDomainParserRuleCall_0_0 = (RuleCall)cElementsAssignment_0.eContents().get(0);
		private final Assignment cElementsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cElementsArchitectureParserRuleCall_1_0 = (RuleCall)cElementsAssignment_1.eContents().get(0);
		private final Assignment cElementsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cElementsTechnologyParserRuleCall_2_0 = (RuleCall)cElementsAssignment_2.eContents().get(0);
		
		//// (elements+=Domain)* = 0 o muchos
		//// (elements+=Domain)+ = 1 o muchos
		//// elements+=Domain    = obligatorio
		//Model:
		//	elements+=Domain elements+=Architecture elements+=Technology;
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=Domain elements+=Architecture elements+=Technology
		public Group getGroup() { return cGroup; }
		
		//elements+=Domain
		public Assignment getElementsAssignment_0() { return cElementsAssignment_0; }
		
		//Domain
		public RuleCall getElementsDomainParserRuleCall_0_0() { return cElementsDomainParserRuleCall_0_0; }
		
		//elements+=Architecture
		public Assignment getElementsAssignment_1() { return cElementsAssignment_1; }
		
		//Architecture
		public RuleCall getElementsArchitectureParserRuleCall_1_0() { return cElementsArchitectureParserRuleCall_1_0; }
		
		//elements+=Technology
		public Assignment getElementsAssignment_2() { return cElementsAssignment_2; }
		
		//Technology
		public RuleCall getElementsTechnologyParserRuleCall_2_0() { return cElementsTechnologyParserRuleCall_2_0; }
	}
	public class DomainElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.photos.mydsl.MyDsl.Domain");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDomainKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cElementsEntityParserRuleCall_3_0 = (RuleCall)cElementsAssignment_3.eContents().get(0);
		private final Assignment cElementsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cElementsFunctionalityParserRuleCall_4_0 = (RuleCall)cElementsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//// Main
		//Domain:
		//	'Domain:' name=ID '{' elements+=Entity elements+=Functionality '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Domain:' name=ID '{' elements+=Entity elements+=Functionality '}'
		public Group getGroup() { return cGroup; }
		
		//'Domain:'
		public Keyword getDomainKeyword_0() { return cDomainKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//elements+=Entity
		public Assignment getElementsAssignment_3() { return cElementsAssignment_3; }
		
		//Entity
		public RuleCall getElementsEntityParserRuleCall_3_0() { return cElementsEntityParserRuleCall_3_0; }
		
		//elements+=Functionality
		public Assignment getElementsAssignment_4() { return cElementsAssignment_4; }
		
		//Functionality
		public RuleCall getElementsFunctionalityParserRuleCall_4_0() { return cElementsFunctionalityParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class ArchitectureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.photos.mydsl.MyDsl.Architecture");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cArchitectureKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Architecture:
		//	'Architecture:' '{' name=ID '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Architecture:' '{' name=ID '}'
		public Group getGroup() { return cGroup; }
		
		//'Architecture:'
		public Keyword getArchitectureKeyword_0() { return cArchitectureKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class TechnologyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.photos.mydsl.MyDsl.Technology");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTechnologyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Technology:
		//	'Technology:' '{' name=ID '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Technology:' '{' name=ID '}'
		public Group getGroup() { return cGroup; }
		
		//'Technology:'
		public Keyword getTechnologyKeyword_0() { return cTechnologyKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.photos.mydsl.MyDsl.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntitiesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cElementsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cElementsEntitiesParserRuleCall_1_0 = (RuleCall)cElementsAssignment_1.eContents().get(0);
		
		//// Domain
		//Entity:
		//	'Entities' elements+=Entities;
		@Override public ParserRule getRule() { return rule; }
		
		//'Entities' elements+=Entities
		public Group getGroup() { return cGroup; }
		
		//'Entities'
		public Keyword getEntitiesKeyword_0() { return cEntitiesKeyword_0; }
		
		//elements+=Entities
		public Assignment getElementsAssignment_1() { return cElementsAssignment_1; }
		
		//Entities
		public RuleCall getElementsEntitiesParserRuleCall_1_0() { return cElementsEntitiesParserRuleCall_1_0; }
	}
	public class FunctionalityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.photos.mydsl.MyDsl.Functionality");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFunctionalitiesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cElementsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cElementsFunctionalitiesParserRuleCall_1_0 = (RuleCall)cElementsAssignment_1.eContents().get(0);
		
		//Functionality:
		//	'Functionalities' elements+=Functionalities;
		@Override public ParserRule getRule() { return rule; }
		
		//'Functionalities' elements+=Functionalities
		public Group getGroup() { return cGroup; }
		
		//'Functionalities'
		public Keyword getFunctionalitiesKeyword_0() { return cFunctionalitiesKeyword_0; }
		
		//elements+=Functionalities
		public Assignment getElementsAssignment_1() { return cElementsAssignment_1; }
		
		//Functionalities
		public RuleCall getElementsFunctionalitiesParserRuleCall_1_0() { return cElementsFunctionalitiesParserRuleCall_1_0; }
	}
	public class EntitiesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.photos.mydsl.MyDsl.Entities");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cElementsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cElementsPhotoParserRuleCall_0_0 = (RuleCall)cElementsAssignment_0.eContents().get(0);
		private final Assignment cElementsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cElementsAlbumParserRuleCall_1_0 = (RuleCall)cElementsAssignment_1.eContents().get(0);
		private final Assignment cElementsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cElementsUser_dParserRuleCall_2_0 = (RuleCall)cElementsAssignment_2.eContents().get(0);
		
		//Entities:
		//	elements+=Photo elements+=Album elements+=User_d;
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=Photo elements+=Album elements+=User_d
		public Group getGroup() { return cGroup; }
		
		//elements+=Photo
		public Assignment getElementsAssignment_0() { return cElementsAssignment_0; }
		
		//Photo
		public RuleCall getElementsPhotoParserRuleCall_0_0() { return cElementsPhotoParserRuleCall_0_0; }
		
		//elements+=Album
		public Assignment getElementsAssignment_1() { return cElementsAssignment_1; }
		
		//Album
		public RuleCall getElementsAlbumParserRuleCall_1_0() { return cElementsAlbumParserRuleCall_1_0; }
		
		//elements+=User_d
		public Assignment getElementsAssignment_2() { return cElementsAssignment_2; }
		
		//User_d
		public RuleCall getElementsUser_dParserRuleCall_2_0() { return cElementsUser_dParserRuleCall_2_0; }
	}
	public class PhotoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.photos.mydsl.MyDsl.Photo");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPhotoKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Photo:
		//	'Photo' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'Photo' name=ID
		public Group getGroup() { return cGroup; }
		
		//'Photo'
		public Keyword getPhotoKeyword_0() { return cPhotoKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class AlbumElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.photos.mydsl.MyDsl.Album");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAlbumKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Album:
		//	'Album' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'Album' name=ID
		public Group getGroup() { return cGroup; }
		
		//'Album'
		public Keyword getAlbumKeyword_0() { return cAlbumKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class User_dElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.photos.mydsl.MyDsl.User_d");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUser_dKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//User_d:
		//	'User_d' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'User_d' name=ID
		public Group getGroup() { return cGroup; }
		
		//'User_d'
		public Keyword getUser_dKeyword_0() { return cUser_dKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class FunctionalitiesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.photos.mydsl.MyDsl.Functionalities");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cElementsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cElementsProfileManagementParserRuleCall_0_0 = (RuleCall)cElementsAssignment_0.eContents().get(0);
		private final Assignment cElementsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cElementsAppAccessParserRuleCall_1_0 = (RuleCall)cElementsAssignment_1.eContents().get(0);
		private final Assignment cElementsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cElementsAlbumManagementParserRuleCall_2_0 = (RuleCall)cElementsAssignment_2.eContents().get(0);
		private final Assignment cElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cElementsPhotoActionsParserRuleCall_3_0 = (RuleCall)cElementsAssignment_3.eContents().get(0);
		
		//Functionalities:
		//	elements+=ProfileManagement elements+=AppAccess elements+=AlbumManagement elements+=PhotoActions;
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=ProfileManagement elements+=AppAccess elements+=AlbumManagement elements+=PhotoActions
		public Group getGroup() { return cGroup; }
		
		//elements+=ProfileManagement
		public Assignment getElementsAssignment_0() { return cElementsAssignment_0; }
		
		//ProfileManagement
		public RuleCall getElementsProfileManagementParserRuleCall_0_0() { return cElementsProfileManagementParserRuleCall_0_0; }
		
		//elements+=AppAccess
		public Assignment getElementsAssignment_1() { return cElementsAssignment_1; }
		
		//AppAccess
		public RuleCall getElementsAppAccessParserRuleCall_1_0() { return cElementsAppAccessParserRuleCall_1_0; }
		
		//elements+=AlbumManagement
		public Assignment getElementsAssignment_2() { return cElementsAssignment_2; }
		
		//AlbumManagement
		public RuleCall getElementsAlbumManagementParserRuleCall_2_0() { return cElementsAlbumManagementParserRuleCall_2_0; }
		
		//elements+=PhotoActions
		public Assignment getElementsAssignment_3() { return cElementsAssignment_3; }
		
		//PhotoActions
		public RuleCall getElementsPhotoActionsParserRuleCall_3_0() { return cElementsPhotoActionsParserRuleCall_3_0; }
	}
	public class ProfileManagementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.photos.mydsl.MyDsl.ProfileManagement");
		private final Keyword cProfileManagementKeyword = (Keyword)rule.eContents().get(1);
		
		//ProfileManagement:
		//	'ProfileManagement';
		@Override public ParserRule getRule() { return rule; }
		
		//'ProfileManagement'
		public Keyword getProfileManagementKeyword() { return cProfileManagementKeyword; }
	}
	public class AppAccessElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.photos.mydsl.MyDsl.AppAccess");
		private final Keyword cAppAccessKeyword = (Keyword)rule.eContents().get(1);
		
		//AppAccess:
		//	'AppAccess';
		@Override public ParserRule getRule() { return rule; }
		
		//'AppAccess'
		public Keyword getAppAccessKeyword() { return cAppAccessKeyword; }
	}
	public class AlbumManagementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.photos.mydsl.MyDsl.AlbumManagement");
		private final Keyword cAlbumManagementKeyword = (Keyword)rule.eContents().get(1);
		
		//AlbumManagement:
		//	'AlbumManagement';
		@Override public ParserRule getRule() { return rule; }
		
		//'AlbumManagement'
		public Keyword getAlbumManagementKeyword() { return cAlbumManagementKeyword; }
	}
	public class PhotoActionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.photos.mydsl.MyDsl.PhotoActions");
		private final Keyword cPhotoActionsKeyword = (Keyword)rule.eContents().get(1);
		
		//PhotoActions:
		//	'PhotoActions';
		@Override public ParserRule getRule() { return rule; }
		
		//'PhotoActions'
		public Keyword getPhotoActionsKeyword() { return cPhotoActionsKeyword; }
	}
	
	
	private final ModelElements pModel;
	private final DomainElements pDomain;
	private final ArchitectureElements pArchitecture;
	private final TechnologyElements pTechnology;
	private final EntityElements pEntity;
	private final FunctionalityElements pFunctionality;
	private final EntitiesElements pEntities;
	private final PhotoElements pPhoto;
	private final AlbumElements pAlbum;
	private final User_dElements pUser_d;
	private final FunctionalitiesElements pFunctionalities;
	private final ProfileManagementElements pProfileManagement;
	private final AppAccessElements pAppAccess;
	private final AlbumManagementElements pAlbumManagement;
	private final PhotoActionsElements pPhotoActions;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pDomain = new DomainElements();
		this.pArchitecture = new ArchitectureElements();
		this.pTechnology = new TechnologyElements();
		this.pEntity = new EntityElements();
		this.pFunctionality = new FunctionalityElements();
		this.pEntities = new EntitiesElements();
		this.pPhoto = new PhotoElements();
		this.pAlbum = new AlbumElements();
		this.pUser_d = new User_dElements();
		this.pFunctionalities = new FunctionalitiesElements();
		this.pProfileManagement = new ProfileManagementElements();
		this.pAppAccess = new AppAccessElements();
		this.pAlbumManagement = new AlbumManagementElements();
		this.pPhotoActions = new PhotoActionsElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.photos.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//// (elements+=Domain)* = 0 o muchos
	//// (elements+=Domain)+ = 1 o muchos
	//// elements+=Domain    = obligatorio
	//Model:
	//	elements+=Domain elements+=Architecture elements+=Technology;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//// Main
	//Domain:
	//	'Domain:' name=ID '{' elements+=Entity elements+=Functionality '}';
	public DomainElements getDomainAccess() {
		return pDomain;
	}
	
	public ParserRule getDomainRule() {
		return getDomainAccess().getRule();
	}
	
	//Architecture:
	//	'Architecture:' '{' name=ID '}';
	public ArchitectureElements getArchitectureAccess() {
		return pArchitecture;
	}
	
	public ParserRule getArchitectureRule() {
		return getArchitectureAccess().getRule();
	}
	
	//Technology:
	//	'Technology:' '{' name=ID '}';
	public TechnologyElements getTechnologyAccess() {
		return pTechnology;
	}
	
	public ParserRule getTechnologyRule() {
		return getTechnologyAccess().getRule();
	}
	
	//// Domain
	//Entity:
	//	'Entities' elements+=Entities;
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	//Functionality:
	//	'Functionalities' elements+=Functionalities;
	public FunctionalityElements getFunctionalityAccess() {
		return pFunctionality;
	}
	
	public ParserRule getFunctionalityRule() {
		return getFunctionalityAccess().getRule();
	}
	
	//Entities:
	//	elements+=Photo elements+=Album elements+=User_d;
	public EntitiesElements getEntitiesAccess() {
		return pEntities;
	}
	
	public ParserRule getEntitiesRule() {
		return getEntitiesAccess().getRule();
	}
	
	//Photo:
	//	'Photo' name=ID;
	public PhotoElements getPhotoAccess() {
		return pPhoto;
	}
	
	public ParserRule getPhotoRule() {
		return getPhotoAccess().getRule();
	}
	
	//Album:
	//	'Album' name=ID;
	public AlbumElements getAlbumAccess() {
		return pAlbum;
	}
	
	public ParserRule getAlbumRule() {
		return getAlbumAccess().getRule();
	}
	
	//User_d:
	//	'User_d' name=ID;
	public User_dElements getUser_dAccess() {
		return pUser_d;
	}
	
	public ParserRule getUser_dRule() {
		return getUser_dAccess().getRule();
	}
	
	//Functionalities:
	//	elements+=ProfileManagement elements+=AppAccess elements+=AlbumManagement elements+=PhotoActions;
	public FunctionalitiesElements getFunctionalitiesAccess() {
		return pFunctionalities;
	}
	
	public ParserRule getFunctionalitiesRule() {
		return getFunctionalitiesAccess().getRule();
	}
	
	//ProfileManagement:
	//	'ProfileManagement';
	public ProfileManagementElements getProfileManagementAccess() {
		return pProfileManagement;
	}
	
	public ParserRule getProfileManagementRule() {
		return getProfileManagementAccess().getRule();
	}
	
	//AppAccess:
	//	'AppAccess';
	public AppAccessElements getAppAccessAccess() {
		return pAppAccess;
	}
	
	public ParserRule getAppAccessRule() {
		return getAppAccessAccess().getRule();
	}
	
	//AlbumManagement:
	//	'AlbumManagement';
	public AlbumManagementElements getAlbumManagementAccess() {
		return pAlbumManagement;
	}
	
	public ParserRule getAlbumManagementRule() {
		return getAlbumManagementAccess().getRule();
	}
	
	//PhotoActions:
	//	'PhotoActions';
	public PhotoActionsElements getPhotoActionsAccess() {
		return pPhotoActions;
	}
	
	public ParserRule getPhotoActionsRule() {
		return getPhotoActionsAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
