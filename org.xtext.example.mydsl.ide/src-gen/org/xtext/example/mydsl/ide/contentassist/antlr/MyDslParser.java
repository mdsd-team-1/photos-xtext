/*
 * generated by Xtext 2.18.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getDirectoryContentAccess().getAlternatives(), "rule__DirectoryContent__Alternatives");
			builder.put(grammarAccess.getRelationTypeAccess().getAlternatives(), "rule__RelationType__Alternatives");
			builder.put(grammarAccess.getLayerRelationNameAccess().getAlternatives(), "rule__LayerRelationName__Alternatives");
			builder.put(grammarAccess.getConnectionTypeAccess().getAlternatives(), "rule__ConnectionType__Alternatives");
			builder.put(grammarAccess.getNTiersRelationsAccess().getAlternatives(), "rule__NTiersRelations__Alternatives");
			builder.put(grammarAccess.getDOMTypeConfAccess().getAlternatives(), "rule__DOMTypeConf__Alternatives");
			builder.put(grammarAccess.getDataTypeAccess().getAlternatives(), "rule__DataType__Alternatives");
			builder.put(grammarAccess.getReactLifeCycleAccess().getAlternatives(), "rule__ReactLifeCycle__Alternatives");
			builder.put(grammarAccess.getReactRequestAccess().getAlternatives(), "rule__ReactRequest__Alternatives");
			builder.put(grammarAccess.getReactLibraryTypeAccess().getAlternatives(), "rule__ReactLibraryType__Alternatives");
			builder.put(grammarAccess.getReactInformationTypeAccess().getAlternatives(), "rule__ReactInformationType__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getDomainAccess().getGroup(), "rule__Domain__Group__0");
			builder.put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
			builder.put(grammarAccess.getEntitiesAccess().getGroup(), "rule__Entities__Group__0");
			builder.put(grammarAccess.getPhotoAccess().getGroup(), "rule__Photo__Group__0");
			builder.put(grammarAccess.getAlbumAccess().getGroup(), "rule__Album__Group__0");
			builder.put(grammarAccess.getUserDomainAccess().getGroup(), "rule__UserDomain__Group__0");
			builder.put(grammarAccess.getFunctionalityAccess().getGroup(), "rule__Functionality__Group__0");
			builder.put(grammarAccess.getFunctionalitiesAccess().getGroup(), "rule__Functionalities__Group__0");
			builder.put(grammarAccess.getProfileManagementAccess().getGroup(), "rule__ProfileManagement__Group__0");
			builder.put(grammarAccess.getProfileManagementFunctionsAccess().getGroup(), "rule__ProfileManagementFunctions__Group__0");
			builder.put(grammarAccess.getAppAccessAccess().getGroup(), "rule__AppAccess__Group__0");
			builder.put(grammarAccess.getAppAccessFunctionsAccess().getGroup(), "rule__AppAccessFunctions__Group__0");
			builder.put(grammarAccess.getAlbumManagementAccess().getGroup(), "rule__AlbumManagement__Group__0");
			builder.put(grammarAccess.getAlbumManagementFunctionsAccess().getGroup(), "rule__AlbumManagementFunctions__Group__0");
			builder.put(grammarAccess.getPhotoActionsAccess().getGroup(), "rule__PhotoActions__Group__0");
			builder.put(grammarAccess.getPhotoActionsFunctionsAccess().getGroup(), "rule__PhotoActionsFunctions__Group__0");
			builder.put(grammarAccess.getLandingActionsAccess().getGroup(), "rule__LandingActions__Group__0");
			builder.put(grammarAccess.getLandingFunctionsAccess().getGroup(), "rule__LandingFunctions__Group__0");
			builder.put(grammarAccess.getDomainConnectionAccess().getGroup(), "rule__DomainConnection__Group__0");
			builder.put(grammarAccess.getDomainRelationsAccess().getGroup(), "rule__DomainRelations__Group__0");
			builder.put(grammarAccess.getArchitectureAccess().getGroup(), "rule__Architecture__Group__0");
			builder.put(grammarAccess.getNTiersAccess().getGroup(), "rule__NTiers__Group__0");
			builder.put(grammarAccess.getLayerAccess().getGroup(), "rule__Layer__Group__0");
			builder.put(grammarAccess.getPresentationLayerAccess().getGroup(), "rule__PresentationLayer__Group__0");
			builder.put(grammarAccess.getPresentationContentAccess().getGroup(), "rule__PresentationContent__Group__0");
			builder.put(grammarAccess.getPresentationSegmentsAccess().getGroup(), "rule__PresentationSegments__Group__0");
			builder.put(grammarAccess.getBusinessLogicLayerAccess().getGroup(), "rule__BusinessLogicLayer__Group__0");
			builder.put(grammarAccess.getBusinessLogicContentAccess().getGroup(), "rule__BusinessLogicContent__Group__0");
			builder.put(grammarAccess.getBusinessLogicSegmentsAccess().getGroup(), "rule__BusinessLogicSegments__Group__0");
			builder.put(grammarAccess.getDataPersistenceLayerAccess().getGroup(), "rule__DataPersistenceLayer__Group__0");
			builder.put(grammarAccess.getDataPersistenceContentAccess().getGroup(), "rule__DataPersistenceContent__Group__0");
			builder.put(grammarAccess.getDataPersistenceSegmentsAccess().getGroup(), "rule__DataPersistenceSegments__Group__0");
			builder.put(grammarAccess.getSegmentStructureAccess().getGroup(), "rule__SegmentStructure__Group__0");
			builder.put(grammarAccess.getSegmentStructureContentAccess().getGroup(), "rule__SegmentStructureContent__Group__0");
			builder.put(grammarAccess.getDirectoryContentAccess().getGroup_0(), "rule__DirectoryContent__Group_0__0");
			builder.put(grammarAccess.getSingleFileAccess().getGroup(), "rule__SingleFile__Group__0");
			builder.put(grammarAccess.getMultipleFileAccess().getGroup(), "rule__MultipleFile__Group__0");
			builder.put(grammarAccess.getLayerRelationsAccess().getGroup(), "rule__LayerRelations__Group__0");
			builder.put(grammarAccess.getLayerSourceAccess().getGroup(), "rule__LayerSource__Group__0");
			builder.put(grammarAccess.getLayerTargetAccess().getGroup(), "rule__LayerTarget__Group__0");
			builder.put(grammarAccess.getArchitectureComponentsAccess().getGroup(), "rule__ArchitectureComponents__Group__0");
			builder.put(grammarAccess.getFrontEndAccess().getGroup(), "rule__FrontEnd__Group__0");
			builder.put(grammarAccess.getBackEndAccess().getGroup(), "rule__BackEnd__Group__0");
			builder.put(grammarAccess.getPersistenceDataComponentAccess().getGroup(), "rule__PersistenceDataComponent__Group__0");
			builder.put(grammarAccess.getNTiersConnectionsAccess().getGroup(), "rule__NTiersConnections__Group__0");
			builder.put(grammarAccess.getNTiersConnectionsAccess().getGroup_1(), "rule__NTiersConnections__Group_1__0");
			builder.put(grammarAccess.getNTierSourceAccess().getGroup(), "rule__NTierSource__Group__0");
			builder.put(grammarAccess.getNTierTargetAccess().getGroup(), "rule__NTierTarget__Group__0");
			builder.put(grammarAccess.getNTiersRelationsAccess().getGroup_0(), "rule__NTiersRelations__Group_0__0");
			builder.put(grammarAccess.getNTiersRelationsAccess().getGroup_1(), "rule__NTiersRelations__Group_1__0");
			builder.put(grammarAccess.getNTiersRelationsAccess().getGroup_2(), "rule__NTiersRelations__Group_2__0");
			builder.put(grammarAccess.getNTiersRelationsAccess().getGroup_3(), "rule__NTiersRelations__Group_3__0");
			builder.put(grammarAccess.getTechnologyAccess().getGroup(), "rule__Technology__Group__0");
			builder.put(grammarAccess.getTechnologiesAccess().getGroup(), "rule__Technologies__Group__0");
			builder.put(grammarAccess.getReactAccess().getGroup(), "rule__React__Group__0");
			builder.put(grammarAccess.getReactModulesAccess().getGroup(), "rule__ReactModules__Group__0");
			builder.put(grammarAccess.getReactSubModulesAccess().getGroup(), "rule__ReactSubModules__Group__0");
			builder.put(grammarAccess.getReactConfigurationAccess().getGroup(), "rule__ReactConfiguration__Group__0");
			builder.put(grammarAccess.getReactDependenciesAccess().getGroup(), "rule__ReactDependencies__Group__0");
			builder.put(grammarAccess.getReactDependenciesRulesAccess().getGroup(), "rule__ReactDependenciesRules__Group__0");
			builder.put(grammarAccess.getSingleDependenciesAccess().getGroup(), "rule__SingleDependencies__Group__0");
			builder.put(grammarAccess.getPackageNameAccess().getGroup(), "rule__PackageName__Group__0");
			builder.put(grammarAccess.getPackageVersionAccess().getGroup(), "rule__PackageVersion__Group__0");
			builder.put(grammarAccess.getReactConfigurationsAccess().getGroup(), "rule__ReactConfigurations__Group__0");
			builder.put(grammarAccess.getDOMConfigurationsAccess().getGroup(), "rule__DOMConfigurations__Group__0");
			builder.put(grammarAccess.getReactComponentsAccess().getGroup(), "rule__ReactComponents__Group__0");
			builder.put(grammarAccess.getComponentsLogicAccess().getGroup(), "rule__ComponentsLogic__Group__0");
			builder.put(grammarAccess.getLogicContentAccess().getGroup(), "rule__LogicContent__Group__0");
			builder.put(grammarAccess.getLogicStructureAccess().getGroup(), "rule__LogicStructure__Group__0");
			builder.put(grammarAccess.getComponentsUIAccess().getGroup(), "rule__ComponentsUI__Group__0");
			builder.put(grammarAccess.getUIContentAccess().getGroup(), "rule__UIContent__Group__0");
			builder.put(grammarAccess.getUIContentAccess().getGroup_0(), "rule__UIContent__Group_0__0");
			builder.put(grammarAccess.getUIContentAccess().getGroup_1(), "rule__UIContent__Group_1__0");
			builder.put(grammarAccess.getComponentClassAccess().getGroup(), "rule__ComponentClass__Group__0");
			builder.put(grammarAccess.getReactFunctionsAccess().getGroup(), "rule__ReactFunctions__Group__0");
			builder.put(grammarAccess.getReactConstructorAccess().getGroup(), "rule__ReactConstructor__Group__0");
			builder.put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
			builder.put(grammarAccess.getStateAccess().getGroup_1(), "rule__State__Group_1__0");
			builder.put(grammarAccess.getCoreFunctionsDeclarationAccess().getGroup(), "rule__CoreFunctionsDeclaration__Group__0");
			builder.put(grammarAccess.getReactLifeCycleAccess().getGroup_0(), "rule__ReactLifeCycle__Group_0__0");
			builder.put(grammarAccess.getReactLifeCycleAccess().getGroup_1(), "rule__ReactLifeCycle__Group_1__0");
			builder.put(grammarAccess.getReactLifeCycleAccess().getGroup_2(), "rule__ReactLifeCycle__Group_2__0");
			builder.put(grammarAccess.getReactRenderAccess().getGroup(), "rule__ReactRender__Group__0");
			builder.put(grammarAccess.getPropsAccess().getGroup(), "rule__Props__Group__0");
			builder.put(grammarAccess.getPropsAccess().getGroup_1(), "rule__Props__Group_1__0");
			builder.put(grammarAccess.getReactCoreFunctionsAccess().getGroup(), "rule__ReactCoreFunctions__Group__0");
			builder.put(grammarAccess.getReactActionsAccess().getGroup(), "rule__ReactActions__Group__0");
			builder.put(grammarAccess.getReactServicesTypeAccess().getGroup(), "rule__ReactServicesType__Group__0");
			builder.put(grammarAccess.getReactServicesRelationAccess().getGroup(), "rule__ReactServicesRelation__Group__0");
			builder.put(grammarAccess.getReactServicesRelationAccess().getGroup_1(), "rule__ReactServicesRelation__Group_1__0");
			builder.put(grammarAccess.getReactLibrariesAccess().getGroup(), "rule__ReactLibraries__Group__0");
			builder.put(grammarAccess.getReactLibraryAccess().getGroup(), "rule__ReactLibrary__Group__0");
			builder.put(grammarAccess.getReactInfoAccess().getGroup(), "rule__ReactInfo__Group__0");
			builder.put(grammarAccess.getReactInformationAccess().getGroup(), "rule__ReactInformation__Group__0");
			builder.put(grammarAccess.getSpringAccess().getGroup(), "rule__Spring__Group__0");
			builder.put(grammarAccess.getPostgreSQLAccess().getGroup(), "rule__PostgreSQL__Group__0");
			builder.put(grammarAccess.getAmazonWebServicesAccess().getGroup(), "rule__AmazonWebServices__Group__0");
			builder.put(grammarAccess.getModelAccess().getElementsAssignment_3(), "rule__Model__ElementsAssignment_3");
			builder.put(grammarAccess.getModelAccess().getElementsAssignment_4(), "rule__Model__ElementsAssignment_4");
			builder.put(grammarAccess.getModelAccess().getElementsAssignment_5(), "rule__Model__ElementsAssignment_5");
			builder.put(grammarAccess.getDomainAccess().getNameAssignment_1(), "rule__Domain__NameAssignment_1");
			builder.put(grammarAccess.getDomainAccess().getElementsAssignment_4(), "rule__Domain__ElementsAssignment_4");
			builder.put(grammarAccess.getDomainAccess().getElementsAssignment_5(), "rule__Domain__ElementsAssignment_5");
			builder.put(grammarAccess.getDomainAccess().getElementsAssignment_6(), "rule__Domain__ElementsAssignment_6");
			builder.put(grammarAccess.getEntityAccess().getElementsAssignment_3(), "rule__Entity__ElementsAssignment_3");
			builder.put(grammarAccess.getEntitiesAccess().getElementsAssignment_0(), "rule__Entities__ElementsAssignment_0");
			builder.put(grammarAccess.getEntitiesAccess().getElementsAssignment_1(), "rule__Entities__ElementsAssignment_1");
			builder.put(grammarAccess.getEntitiesAccess().getElementsAssignment_2(), "rule__Entities__ElementsAssignment_2");
			builder.put(grammarAccess.getPhotoAccess().getNameAssignment_1(), "rule__Photo__NameAssignment_1");
			builder.put(grammarAccess.getAlbumAccess().getNameAssignment_1(), "rule__Album__NameAssignment_1");
			builder.put(grammarAccess.getUserDomainAccess().getNameAssignment_1(), "rule__UserDomain__NameAssignment_1");
			builder.put(grammarAccess.getFunctionalityAccess().getElementsAssignment_3(), "rule__Functionality__ElementsAssignment_3");
			builder.put(grammarAccess.getFunctionalitiesAccess().getFunctionsAssignment_0(), "rule__Functionalities__FunctionsAssignment_0");
			builder.put(grammarAccess.getFunctionalitiesAccess().getElementsAssignment_1(), "rule__Functionalities__ElementsAssignment_1");
			builder.put(grammarAccess.getFunctionalitiesAccess().getItemsAssignment_2(), "rule__Functionalities__ItemsAssignment_2");
			builder.put(grammarAccess.getFunctionalitiesAccess().getResourcesAssignment_3(), "rule__Functionalities__ResourcesAssignment_3");
			builder.put(grammarAccess.getFunctionalitiesAccess().getAditionalsAssignment_4(), "rule__Functionalities__AditionalsAssignment_4");
			builder.put(grammarAccess.getProfileManagementAccess().getItemsAssignment_2(), "rule__ProfileManagement__ItemsAssignment_2");
			builder.put(grammarAccess.getProfileManagementFunctionsAccess().getNameAssignment_1(), "rule__ProfileManagementFunctions__NameAssignment_1");
			builder.put(grammarAccess.getProfileManagementFunctionsAccess().getNameAssignment_3(), "rule__ProfileManagementFunctions__NameAssignment_3");
			builder.put(grammarAccess.getAppAccessAccess().getItemsAssignment_2(), "rule__AppAccess__ItemsAssignment_2");
			builder.put(grammarAccess.getAppAccessFunctionsAccess().getNameAssignment_1(), "rule__AppAccessFunctions__NameAssignment_1");
			builder.put(grammarAccess.getAppAccessFunctionsAccess().getNameAssignment_3(), "rule__AppAccessFunctions__NameAssignment_3");
			builder.put(grammarAccess.getAlbumManagementAccess().getItemsAssignment_2(), "rule__AlbumManagement__ItemsAssignment_2");
			builder.put(grammarAccess.getAlbumManagementFunctionsAccess().getNameAssignment_1(), "rule__AlbumManagementFunctions__NameAssignment_1");
			builder.put(grammarAccess.getAlbumManagementFunctionsAccess().getNameAssignment_3(), "rule__AlbumManagementFunctions__NameAssignment_3");
			builder.put(grammarAccess.getPhotoActionsAccess().getItemsAssignment_2(), "rule__PhotoActions__ItemsAssignment_2");
			builder.put(grammarAccess.getPhotoActionsFunctionsAccess().getNameAssignment_1(), "rule__PhotoActionsFunctions__NameAssignment_1");
			builder.put(grammarAccess.getPhotoActionsFunctionsAccess().getNameAssignment_3(), "rule__PhotoActionsFunctions__NameAssignment_3");
			builder.put(grammarAccess.getPhotoActionsFunctionsAccess().getNameAssignment_5(), "rule__PhotoActionsFunctions__NameAssignment_5");
			builder.put(grammarAccess.getLandingActionsAccess().getItemsAssignment_2(), "rule__LandingActions__ItemsAssignment_2");
			builder.put(grammarAccess.getLandingFunctionsAccess().getNameAssignment_1(), "rule__LandingFunctions__NameAssignment_1");
			builder.put(grammarAccess.getLandingFunctionsAccess().getNameAssignment_3(), "rule__LandingFunctions__NameAssignment_3");
			builder.put(grammarAccess.getDomainConnectionAccess().getElementsAssignment_3(), "rule__DomainConnection__ElementsAssignment_3");
			builder.put(grammarAccess.getDomainRelationsAccess().getElementsAssignment_0(), "rule__DomainRelations__ElementsAssignment_0");
			builder.put(grammarAccess.getDomainRelationsAccess().getNameAssignment_1(), "rule__DomainRelations__NameAssignment_1");
			builder.put(grammarAccess.getDomainRelationsAccess().getElementsAssignment_4(), "rule__DomainRelations__ElementsAssignment_4");
			builder.put(grammarAccess.getDomainRelationsAccess().getElementsAssignment_6(), "rule__DomainRelations__ElementsAssignment_6");
			builder.put(grammarAccess.getDomainRelationsAccess().getNameAssignment_7(), "rule__DomainRelations__NameAssignment_7");
			builder.put(grammarAccess.getDomainRelationsAccess().getElementsAssignment_10(), "rule__DomainRelations__ElementsAssignment_10");
			builder.put(grammarAccess.getDomainRelationsAccess().getElementsAssignment_12(), "rule__DomainRelations__ElementsAssignment_12");
			builder.put(grammarAccess.getDomainRelationsAccess().getNameAssignment_13(), "rule__DomainRelations__NameAssignment_13");
			builder.put(grammarAccess.getDomainRelationsAccess().getElementsAssignment_16(), "rule__DomainRelations__ElementsAssignment_16");
			builder.put(grammarAccess.getDomainRelationsAccess().getElementsAssignment_18(), "rule__DomainRelations__ElementsAssignment_18");
			builder.put(grammarAccess.getDomainRelationsAccess().getNameAssignment_19(), "rule__DomainRelations__NameAssignment_19");
			builder.put(grammarAccess.getDomainRelationsAccess().getElementsAssignment_22(), "rule__DomainRelations__ElementsAssignment_22");
			builder.put(grammarAccess.getArchitectureAccess().getElementsAssignment_2(), "rule__Architecture__ElementsAssignment_2");
			builder.put(grammarAccess.getArchitectureAccess().getElementsAssignment_3(), "rule__Architecture__ElementsAssignment_3");
			builder.put(grammarAccess.getNTiersAccess().getElementsAssignment_1(), "rule__NTiers__ElementsAssignment_1");
			builder.put(grammarAccess.getNTiersAccess().getElementsAssignment_3(), "rule__NTiers__ElementsAssignment_3");
			builder.put(grammarAccess.getNTiersAccess().getElementsAssignment_5(), "rule__NTiers__ElementsAssignment_5");
			builder.put(grammarAccess.getLayerAccess().getElementsAssignment_0(), "rule__Layer__ElementsAssignment_0");
			builder.put(grammarAccess.getLayerAccess().getElementsAssignment_1(), "rule__Layer__ElementsAssignment_1");
			builder.put(grammarAccess.getLayerAccess().getElementsAssignment_2(), "rule__Layer__ElementsAssignment_2");
			builder.put(grammarAccess.getPresentationLayerAccess().getElementsAssignment_1(), "rule__PresentationLayer__ElementsAssignment_1");
			builder.put(grammarAccess.getPresentationLayerAccess().getElementsAssignment_2(), "rule__PresentationLayer__ElementsAssignment_2");
			builder.put(grammarAccess.getPresentationContentAccess().getElementsAssignment_1(), "rule__PresentationContent__ElementsAssignment_1");
			builder.put(grammarAccess.getPresentationSegmentsAccess().getNameAssignment_1(), "rule__PresentationSegments__NameAssignment_1");
			builder.put(grammarAccess.getPresentationSegmentsAccess().getNameAssignment_3(), "rule__PresentationSegments__NameAssignment_3");
			builder.put(grammarAccess.getPresentationSegmentsAccess().getNameAssignment_5(), "rule__PresentationSegments__NameAssignment_5");
			builder.put(grammarAccess.getBusinessLogicLayerAccess().getElementsAssignment_1(), "rule__BusinessLogicLayer__ElementsAssignment_1");
			builder.put(grammarAccess.getBusinessLogicLayerAccess().getElementsAssignment_2(), "rule__BusinessLogicLayer__ElementsAssignment_2");
			builder.put(grammarAccess.getBusinessLogicContentAccess().getElementsAssignment_1(), "rule__BusinessLogicContent__ElementsAssignment_1");
			builder.put(grammarAccess.getBusinessLogicSegmentsAccess().getNameAssignment_1(), "rule__BusinessLogicSegments__NameAssignment_1");
			builder.put(grammarAccess.getBusinessLogicSegmentsAccess().getNameAssignment_3(), "rule__BusinessLogicSegments__NameAssignment_3");
			builder.put(grammarAccess.getBusinessLogicSegmentsAccess().getNameAssignment_5(), "rule__BusinessLogicSegments__NameAssignment_5");
			builder.put(grammarAccess.getBusinessLogicSegmentsAccess().getNameAssignment_7(), "rule__BusinessLogicSegments__NameAssignment_7");
			builder.put(grammarAccess.getDataPersistenceLayerAccess().getElementsAssignment_1(), "rule__DataPersistenceLayer__ElementsAssignment_1");
			builder.put(grammarAccess.getDataPersistenceContentAccess().getElementsAssignment_1(), "rule__DataPersistenceContent__ElementsAssignment_1");
			builder.put(grammarAccess.getDataPersistenceSegmentsAccess().getNameAssignment_1(), "rule__DataPersistenceSegments__NameAssignment_1");
			builder.put(grammarAccess.getDataPersistenceSegmentsAccess().getNameAssignment_3(), "rule__DataPersistenceSegments__NameAssignment_3");
			builder.put(grammarAccess.getSegmentStructureAccess().getElementsAssignment_1(), "rule__SegmentStructure__ElementsAssignment_1");
			builder.put(grammarAccess.getSegmentStructureContentAccess().getNameAssignment_1(), "rule__SegmentStructureContent__NameAssignment_1");
			builder.put(grammarAccess.getSegmentStructureContentAccess().getElementsAssignment_2(), "rule__SegmentStructureContent__ElementsAssignment_2");
			builder.put(grammarAccess.getDirectoryContentAccess().getNameAssignment_0_1(), "rule__DirectoryContent__NameAssignment_0_1");
			builder.put(grammarAccess.getDirectoryContentAccess().getElementsAssignment_0_2(), "rule__DirectoryContent__ElementsAssignment_0_2");
			builder.put(grammarAccess.getDirectoryContentAccess().getElementsAssignment_1(), "rule__DirectoryContent__ElementsAssignment_1");
			builder.put(grammarAccess.getDirectoriesAccess().getElementsAssignment(), "rule__Directories__ElementsAssignment");
			builder.put(grammarAccess.getSingleFileAccess().getNameAssignment_1(), "rule__SingleFile__NameAssignment_1");
			builder.put(grammarAccess.getMultipleFileAccess().getNameAssignment_1(), "rule__MultipleFile__NameAssignment_1");
			builder.put(grammarAccess.getLayerRelationsAccess().getLayerelationsAssignment_0(), "rule__LayerRelations__LayerelationsAssignment_0");
			builder.put(grammarAccess.getLayerRelationsAccess().getNameAssignment_1(), "rule__LayerRelations__NameAssignment_1");
			builder.put(grammarAccess.getLayerRelationsAccess().getLayeroriginAssignment_2(), "rule__LayerRelations__LayeroriginAssignment_2");
			builder.put(grammarAccess.getLayerRelationsAccess().getLayertargetAssignment_3(), "rule__LayerRelations__LayertargetAssignment_3");
			builder.put(grammarAccess.getLayerSourceAccess().getLayerelationsAssignment_1(), "rule__LayerSource__LayerelationsAssignment_1");
			builder.put(grammarAccess.getLayerTargetAccess().getLayerelationsAssignment_1(), "rule__LayerTarget__LayerelationsAssignment_1");
			builder.put(grammarAccess.getArchitectureComponentsAccess().getArchcomponentAssignment_1(), "rule__ArchitectureComponents__ArchcomponentAssignment_1");
			builder.put(grammarAccess.getArchitectureComponentsAccess().getArchcomponentAssignment_2(), "rule__ArchitectureComponents__ArchcomponentAssignment_2");
			builder.put(grammarAccess.getArchitectureComponentsAccess().getArchcomponentAssignment_3(), "rule__ArchitectureComponents__ArchcomponentAssignment_3");
			builder.put(grammarAccess.getFrontEndAccess().getNameAssignment_1(), "rule__FrontEnd__NameAssignment_1");
			builder.put(grammarAccess.getBackEndAccess().getNameAssignment_1(), "rule__BackEnd__NameAssignment_1");
			builder.put(grammarAccess.getPersistenceDataComponentAccess().getNameAssignment_1(), "rule__PersistenceDataComponent__NameAssignment_1");
			builder.put(grammarAccess.getNTiersConnectionsAccess().getNtierconnectionAssignment_1_0(), "rule__NTiersConnections__NtierconnectionAssignment_1_0");
			builder.put(grammarAccess.getNTiersConnectionsAccess().getNameAssignment_1_1(), "rule__NTiersConnections__NameAssignment_1_1");
			builder.put(grammarAccess.getNTiersConnectionsAccess().getNtieroriginAssignment_1_2(), "rule__NTiersConnections__NtieroriginAssignment_1_2");
			builder.put(grammarAccess.getNTiersConnectionsAccess().getNtiertargetAssignment_1_3(), "rule__NTiersConnections__NtiertargetAssignment_1_3");
			builder.put(grammarAccess.getNTierSourceAccess().getNtierconnectionAssignment_1(), "rule__NTierSource__NtierconnectionAssignment_1");
			builder.put(grammarAccess.getNTierTargetAccess().getNtierconnectionAssignment_1(), "rule__NTierTarget__NtierconnectionAssignment_1");
			builder.put(grammarAccess.getNTiersRelationsAccess().getNameAssignment_0_1(), "rule__NTiersRelations__NameAssignment_0_1");
			builder.put(grammarAccess.getNTiersRelationsAccess().getNameAssignment_1_1(), "rule__NTiersRelations__NameAssignment_1_1");
			builder.put(grammarAccess.getNTiersRelationsAccess().getNameAssignment_2_1(), "rule__NTiersRelations__NameAssignment_2_1");
			builder.put(grammarAccess.getNTiersRelationsAccess().getNameAssignment_3_1(), "rule__NTiersRelations__NameAssignment_3_1");
			builder.put(grammarAccess.getTechnologyAccess().getNameAssignment_1(), "rule__Technology__NameAssignment_1");
			builder.put(grammarAccess.getTechnologyAccess().getElementsAssignment_4(), "rule__Technology__ElementsAssignment_4");
			builder.put(grammarAccess.getTechnologiesAccess().getFactorsAssignment_0(), "rule__Technologies__FactorsAssignment_0");
			builder.put(grammarAccess.getTechnologiesAccess().getFactorsAssignment_1(), "rule__Technologies__FactorsAssignment_1");
			builder.put(grammarAccess.getTechnologiesAccess().getFactorsAssignment_2(), "rule__Technologies__FactorsAssignment_2");
			builder.put(grammarAccess.getTechnologiesAccess().getFactorsAssignment_3(), "rule__Technologies__FactorsAssignment_3");
			builder.put(grammarAccess.getReactAccess().getNameAssignment_1(), "rule__React__NameAssignment_1");
			builder.put(grammarAccess.getReactAccess().getReactsAssignment_4(), "rule__React__ReactsAssignment_4");
			builder.put(grammarAccess.getReactModulesAccess().getReactmodulesAssignment_3(), "rule__ReactModules__ReactmodulesAssignment_3");
			builder.put(grammarAccess.getReactSubModulesAccess().getReactmodulesAssignment_0(), "rule__ReactSubModules__ReactmodulesAssignment_0");
			builder.put(grammarAccess.getReactSubModulesAccess().getReactmodulesAssignment_1(), "rule__ReactSubModules__ReactmodulesAssignment_1");
			builder.put(grammarAccess.getReactSubModulesAccess().getReactmodulesAssignment_2(), "rule__ReactSubModules__ReactmodulesAssignment_2");
			builder.put(grammarAccess.getReactSubModulesAccess().getReactmodulesAssignment_3(), "rule__ReactSubModules__ReactmodulesAssignment_3");
			builder.put(grammarAccess.getReactSubModulesAccess().getReactmodulesAssignment_4(), "rule__ReactSubModules__ReactmodulesAssignment_4");
			builder.put(grammarAccess.getReactConfigurationAccess().getDependenciesAssignment_3(), "rule__ReactConfiguration__DependenciesAssignment_3");
			builder.put(grammarAccess.getReactConfigurationAccess().getConfigurationsAssignment_4(), "rule__ReactConfiguration__ConfigurationsAssignment_4");
			builder.put(grammarAccess.getReactDependenciesAccess().getDependenciesAssignment_1(), "rule__ReactDependencies__DependenciesAssignment_1");
			builder.put(grammarAccess.getReactDependenciesRulesAccess().getNameAssignment_1(), "rule__ReactDependenciesRules__NameAssignment_1");
			builder.put(grammarAccess.getReactDependenciesRulesAccess().getDependenciesAssignment_2(), "rule__ReactDependenciesRules__DependenciesAssignment_2");
			builder.put(grammarAccess.getReactDependenciesSubRulesAccess().getDependenciesAssignment(), "rule__ReactDependenciesSubRules__DependenciesAssignment");
			builder.put(grammarAccess.getSingleDependenciesAccess().getDependenciesAssignment_0(), "rule__SingleDependencies__DependenciesAssignment_0");
			builder.put(grammarAccess.getSingleDependenciesAccess().getDependenciesAssignment_1(), "rule__SingleDependencies__DependenciesAssignment_1");
			builder.put(grammarAccess.getPackageNameAccess().getNameAssignment_1(), "rule__PackageName__NameAssignment_1");
			builder.put(grammarAccess.getPackageVersionAccess().getNameAssignment_1(), "rule__PackageVersion__NameAssignment_1");
			builder.put(grammarAccess.getReactConfigurationsAccess().getNameAssignment_1(), "rule__ReactConfigurations__NameAssignment_1");
			builder.put(grammarAccess.getReactConfigurationsAccess().getConfigurationsAssignment_2(), "rule__ReactConfigurations__ConfigurationsAssignment_2");
			builder.put(grammarAccess.getDOMConfigurationsAccess().getElementsAssignment_0(), "rule__DOMConfigurations__ElementsAssignment_0");
			builder.put(grammarAccess.getDOMConfigurationsAccess().getNameAssignment_1(), "rule__DOMConfigurations__NameAssignment_1");
			builder.put(grammarAccess.getReactComponentsAccess().getComponentslogicAssignment_3(), "rule__ReactComponents__ComponentslogicAssignment_3");
			builder.put(grammarAccess.getReactComponentsAccess().getComponentsuiAssignment_4(), "rule__ReactComponents__ComponentsuiAssignment_4");
			builder.put(grammarAccess.getComponentsLogicAccess().getNameAssignment_1(), "rule__ComponentsLogic__NameAssignment_1");
			builder.put(grammarAccess.getComponentsLogicAccess().getLogiccomponentsAssignment_2(), "rule__ComponentsLogic__LogiccomponentsAssignment_2");
			builder.put(grammarAccess.getLogicContentAccess().getNameAssignment_1(), "rule__LogicContent__NameAssignment_1");
			builder.put(grammarAccess.getLogicContentAccess().getLogiccomponentsAssignment_2(), "rule__LogicContent__LogiccomponentsAssignment_2");
			builder.put(grammarAccess.getLogicStructureAccess().getNameAssignment_1(), "rule__LogicStructure__NameAssignment_1");
			builder.put(grammarAccess.getLogicStructureAccess().getLogiccomponentsAssignment_2(), "rule__LogicStructure__LogiccomponentsAssignment_2");
			builder.put(grammarAccess.getLogicStructureAccess().getNameAssignment_4(), "rule__LogicStructure__NameAssignment_4");
			builder.put(grammarAccess.getComponentsUIAccess().getNameAssignment_1(), "rule__ComponentsUI__NameAssignment_1");
			builder.put(grammarAccess.getComponentsUIAccess().getUicomponentsAssignment_2(), "rule__ComponentsUI__UicomponentsAssignment_2");
			builder.put(grammarAccess.getUIContentAccess().getNameAssignment_0_1(), "rule__UIContent__NameAssignment_0_1");
			builder.put(grammarAccess.getUIContentAccess().getUicontentAssignment_0_2(), "rule__UIContent__UicontentAssignment_0_2");
			builder.put(grammarAccess.getUIContentAccess().getNameAssignment_1_1(), "rule__UIContent__NameAssignment_1_1");
			builder.put(grammarAccess.getUIContentAccess().getUicontentAssignment_1_2(), "rule__UIContent__UicontentAssignment_1_2");
			builder.put(grammarAccess.getComponentClassAccess().getComponentclassAssignment_0(), "rule__ComponentClass__ComponentclassAssignment_0");
			builder.put(grammarAccess.getComponentClassAccess().getComponentclassAssignment_1(), "rule__ComponentClass__ComponentclassAssignment_1");
			builder.put(grammarAccess.getReactFunctionsAccess().getComponentclassAssignment_0(), "rule__ReactFunctions__ComponentclassAssignment_0");
			builder.put(grammarAccess.getReactFunctionsAccess().getLifecycleclassAssignment_1(), "rule__ReactFunctions__LifecycleclassAssignment_1");
			builder.put(grammarAccess.getReactFunctionsAccess().getComponentclassAssignment_2(), "rule__ReactFunctions__ComponentclassAssignment_2");
			builder.put(grammarAccess.getReactFunctionsAccess().getRenderclassAssignment_3(), "rule__ReactFunctions__RenderclassAssignment_3");
			builder.put(grammarAccess.getReactConstructorAccess().getComponentclassAssignment_1(), "rule__ReactConstructor__ComponentclassAssignment_1");
			builder.put(grammarAccess.getReactConstructorAccess().getComponentclassAssignment_2(), "rule__ReactConstructor__ComponentclassAssignment_2");
			builder.put(grammarAccess.getStateAccess().getNameAssignment_1_0(), "rule__State__NameAssignment_1_0");
			builder.put(grammarAccess.getStateAccess().getComponentclassAssignment_1_1(), "rule__State__ComponentclassAssignment_1_1");
			builder.put(grammarAccess.getCoreFunctionsDeclarationAccess().getNameAssignment_0(), "rule__CoreFunctionsDeclaration__NameAssignment_0");
			builder.put(grammarAccess.getPropsAccess().getNameAssignment_1_0(), "rule__Props__NameAssignment_1_0");
			builder.put(grammarAccess.getPropsAccess().getComponentclassAssignment_1_1(), "rule__Props__ComponentclassAssignment_1_1");
			builder.put(grammarAccess.getReactCoreFunctionsAccess().getNameAssignment_0(), "rule__ReactCoreFunctions__NameAssignment_0");
			builder.put(grammarAccess.getReactActionsAccess().getReactactcontentAssignment_3(), "rule__ReactActions__ReactactcontentAssignment_3");
			builder.put(grammarAccess.getReactActionsContentAccess().getReactrelcontentAssignment(), "rule__ReactActionsContent__ReactrelcontentAssignment");
			builder.put(grammarAccess.getReactServicesTypeAccess().getNameAssignment_1(), "rule__ReactServicesType__NameAssignment_1");
			builder.put(grammarAccess.getReactServicesRelationAccess().getReactrelationcontentAssignment_1_0(), "rule__ReactServicesRelation__ReactrelationcontentAssignment_1_0");
			builder.put(grammarAccess.getReactServicesRelationAccess().getNameAssignment_1_1(), "rule__ReactServicesRelation__NameAssignment_1_1");
			builder.put(grammarAccess.getReactLibrariesAccess().getReactlibrariesAssignment_3(), "rule__ReactLibraries__ReactlibrariesAssignment_3");
			builder.put(grammarAccess.getReactLibraryAccess().getNameAssignment_1(), "rule__ReactLibrary__NameAssignment_1");
			builder.put(grammarAccess.getReactInfoAccess().getReactinformationAssignment_3(), "rule__ReactInfo__ReactinformationAssignment_3");
			builder.put(grammarAccess.getReactInformationAccess().getNameAssignment_1(), "rule__ReactInformation__NameAssignment_1");
			builder.put(grammarAccess.getSpringAccess().getNameAssignment_1(), "rule__Spring__NameAssignment_1");
			builder.put(grammarAccess.getPostgreSQLAccess().getNameAssignment_1(), "rule__PostgreSQL__NameAssignment_1");
			builder.put(grammarAccess.getAmazonWebServicesAccess().getNameAssignment_1(), "rule__AmazonWebServices__NameAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
