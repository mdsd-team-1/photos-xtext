/*
 * generated by Xtext 2.17.1
 */
package org.xtext.photos.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.photos.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.photos.mydsl.services.MyDslGrammarAccess;

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
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getDomainAccess().getGroup(), "rule__Domain__Group__0");
			builder.put(grammarAccess.getArchitectureAccess().getGroup(), "rule__Architecture__Group__0");
			builder.put(grammarAccess.getTechnologyAccess().getGroup(), "rule__Technology__Group__0");
			builder.put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
			builder.put(grammarAccess.getFunctionalityAccess().getGroup(), "rule__Functionality__Group__0");
			builder.put(grammarAccess.getEntitiesAccess().getGroup(), "rule__Entities__Group__0");
			builder.put(grammarAccess.getPhotoAccess().getGroup(), "rule__Photo__Group__0");
			builder.put(grammarAccess.getAlbumAccess().getGroup(), "rule__Album__Group__0");
			builder.put(grammarAccess.getUser_dAccess().getGroup(), "rule__User_d__Group__0");
			builder.put(grammarAccess.getFunctionalitiesAccess().getGroup(), "rule__Functionalities__Group__0");
			builder.put(grammarAccess.getModelAccess().getElementsAssignment_0(), "rule__Model__ElementsAssignment_0");
			builder.put(grammarAccess.getModelAccess().getElementsAssignment_1(), "rule__Model__ElementsAssignment_1");
			builder.put(grammarAccess.getModelAccess().getElementsAssignment_2(), "rule__Model__ElementsAssignment_2");
			builder.put(grammarAccess.getDomainAccess().getNameAssignment_1(), "rule__Domain__NameAssignment_1");
			builder.put(grammarAccess.getDomainAccess().getElementsAssignment_3(), "rule__Domain__ElementsAssignment_3");
			builder.put(grammarAccess.getDomainAccess().getElementsAssignment_4(), "rule__Domain__ElementsAssignment_4");
			builder.put(grammarAccess.getArchitectureAccess().getNameAssignment_2(), "rule__Architecture__NameAssignment_2");
			builder.put(grammarAccess.getTechnologyAccess().getNameAssignment_2(), "rule__Technology__NameAssignment_2");
			builder.put(grammarAccess.getEntityAccess().getElementsAssignment_1(), "rule__Entity__ElementsAssignment_1");
			builder.put(grammarAccess.getFunctionalityAccess().getElementsAssignment_1(), "rule__Functionality__ElementsAssignment_1");
			builder.put(grammarAccess.getEntitiesAccess().getElementsAssignment_0(), "rule__Entities__ElementsAssignment_0");
			builder.put(grammarAccess.getEntitiesAccess().getElementsAssignment_1(), "rule__Entities__ElementsAssignment_1");
			builder.put(grammarAccess.getEntitiesAccess().getElementsAssignment_2(), "rule__Entities__ElementsAssignment_2");
			builder.put(grammarAccess.getPhotoAccess().getNameAssignment_1(), "rule__Photo__NameAssignment_1");
			builder.put(grammarAccess.getAlbumAccess().getNameAssignment_1(), "rule__Album__NameAssignment_1");
			builder.put(grammarAccess.getUser_dAccess().getNameAssignment_1(), "rule__User_d__NameAssignment_1");
			builder.put(grammarAccess.getFunctionalitiesAccess().getElementsAssignment_0(), "rule__Functionalities__ElementsAssignment_0");
			builder.put(grammarAccess.getFunctionalitiesAccess().getElementsAssignment_1(), "rule__Functionalities__ElementsAssignment_1");
			builder.put(grammarAccess.getFunctionalitiesAccess().getElementsAssignment_2(), "rule__Functionalities__ElementsAssignment_2");
			builder.put(grammarAccess.getFunctionalitiesAccess().getElementsAssignment_3(), "rule__Functionalities__ElementsAssignment_3");
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
