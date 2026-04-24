package org.xtext.disim.cacher.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.disim.cacher.services.CacherGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCacherParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'This'", "'is'", "'.'", "'Use'", "'Accepts'", "'as'", "'parameters'", "'The'", "'given'", "'context'", "'My'", "'problem'", "'You'", "'must'", "':'", "'not'", "'output'", "'Generate'", "'a'", "'prompt'", "','", "'and'", "';'", "'='", "'('", "')'", "'natural language'", "'tag based'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCacherParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCacherParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCacherParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCacher.g"; }



     	private CacherGrammarAccess grammarAccess;

        public InternalCacherParser(TokenStream input, CacherGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Prompt";
       	}

       	@Override
       	protected CacherGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePrompt"
    // InternalCacher.g:65:1: entryRulePrompt returns [EObject current=null] : iv_rulePrompt= rulePrompt EOF ;
    public final EObject entryRulePrompt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrompt = null;


        try {
            // InternalCacher.g:65:47: (iv_rulePrompt= rulePrompt EOF )
            // InternalCacher.g:66:2: iv_rulePrompt= rulePrompt EOF
            {
             newCompositeNode(grammarAccess.getPromptRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrompt=rulePrompt();

            state._fsp--;

             current =iv_rulePrompt; 
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
    // $ANTLR end "entryRulePrompt"


    // $ANTLR start "rulePrompt"
    // InternalCacher.g:72:1: rulePrompt returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Use' ( (lv_usedPrompts_6_0= ruleUsedPromptsList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Accepts' ( (lv_bodyParams_8_0= ruleBodyParamsList ) ) otherlv_9= 'as' otherlv_10= 'parameters' otherlv_11= '.' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'The' otherlv_13= 'given' otherlv_14= 'context' otherlv_15= 'is' ( (lv_context_16_0= ruleContext ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'My' otherlv_18= 'problem' otherlv_19= 'is' ( (lv_request_20_0= ruleRequest ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'You' otherlv_22= 'must' otherlv_23= ':' ( (lv_posConst_24_0= ruleConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'You' otherlv_26= 'must' otherlv_27= 'not' otherlv_28= ':' ( (lv_negConst_29_0= ruleConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'The' otherlv_31= 'output' otherlv_32= 'must' otherlv_33= ':' ( (lv_dataPresent_34_0= ruleOutputConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Generate' otherlv_36= 'a' ( (lv_promptType_37_0= rulePromptType ) ) otherlv_38= 'prompt' otherlv_39= '.' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject rulePrompt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        EObject lv_usedPrompts_6_0 = null;

        EObject lv_bodyParams_8_0 = null;

        EObject lv_context_16_0 = null;

        EObject lv_request_20_0 = null;

        EObject lv_posConst_24_0 = null;

        EObject lv_negConst_29_0 = null;

        EObject lv_dataPresent_34_0 = null;

        Enumerator lv_promptType_37_0 = null;



        	enterRule();

        try {
            // InternalCacher.g:78:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Use' ( (lv_usedPrompts_6_0= ruleUsedPromptsList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Accepts' ( (lv_bodyParams_8_0= ruleBodyParamsList ) ) otherlv_9= 'as' otherlv_10= 'parameters' otherlv_11= '.' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'The' otherlv_13= 'given' otherlv_14= 'context' otherlv_15= 'is' ( (lv_context_16_0= ruleContext ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'My' otherlv_18= 'problem' otherlv_19= 'is' ( (lv_request_20_0= ruleRequest ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'You' otherlv_22= 'must' otherlv_23= ':' ( (lv_posConst_24_0= ruleConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'You' otherlv_26= 'must' otherlv_27= 'not' otherlv_28= ':' ( (lv_negConst_29_0= ruleConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'The' otherlv_31= 'output' otherlv_32= 'must' otherlv_33= ':' ( (lv_dataPresent_34_0= ruleOutputConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Generate' otherlv_36= 'a' ( (lv_promptType_37_0= rulePromptType ) ) otherlv_38= 'prompt' otherlv_39= '.' ) ) ) ) )+ {...}?) ) ) )
            // InternalCacher.g:79:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Use' ( (lv_usedPrompts_6_0= ruleUsedPromptsList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Accepts' ( (lv_bodyParams_8_0= ruleBodyParamsList ) ) otherlv_9= 'as' otherlv_10= 'parameters' otherlv_11= '.' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'The' otherlv_13= 'given' otherlv_14= 'context' otherlv_15= 'is' ( (lv_context_16_0= ruleContext ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'My' otherlv_18= 'problem' otherlv_19= 'is' ( (lv_request_20_0= ruleRequest ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'You' otherlv_22= 'must' otherlv_23= ':' ( (lv_posConst_24_0= ruleConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'You' otherlv_26= 'must' otherlv_27= 'not' otherlv_28= ':' ( (lv_negConst_29_0= ruleConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'The' otherlv_31= 'output' otherlv_32= 'must' otherlv_33= ':' ( (lv_dataPresent_34_0= ruleOutputConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Generate' otherlv_36= 'a' ( (lv_promptType_37_0= rulePromptType ) ) otherlv_38= 'prompt' otherlv_39= '.' ) ) ) ) )+ {...}?) ) )
            {
            // InternalCacher.g:79:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Use' ( (lv_usedPrompts_6_0= ruleUsedPromptsList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Accepts' ( (lv_bodyParams_8_0= ruleBodyParamsList ) ) otherlv_9= 'as' otherlv_10= 'parameters' otherlv_11= '.' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'The' otherlv_13= 'given' otherlv_14= 'context' otherlv_15= 'is' ( (lv_context_16_0= ruleContext ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'My' otherlv_18= 'problem' otherlv_19= 'is' ( (lv_request_20_0= ruleRequest ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'You' otherlv_22= 'must' otherlv_23= ':' ( (lv_posConst_24_0= ruleConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'You' otherlv_26= 'must' otherlv_27= 'not' otherlv_28= ':' ( (lv_negConst_29_0= ruleConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'The' otherlv_31= 'output' otherlv_32= 'must' otherlv_33= ':' ( (lv_dataPresent_34_0= ruleOutputConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Generate' otherlv_36= 'a' ( (lv_promptType_37_0= rulePromptType ) ) otherlv_38= 'prompt' otherlv_39= '.' ) ) ) ) )+ {...}?) ) )
            // InternalCacher.g:80:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Use' ( (lv_usedPrompts_6_0= ruleUsedPromptsList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Accepts' ( (lv_bodyParams_8_0= ruleBodyParamsList ) ) otherlv_9= 'as' otherlv_10= 'parameters' otherlv_11= '.' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'The' otherlv_13= 'given' otherlv_14= 'context' otherlv_15= 'is' ( (lv_context_16_0= ruleContext ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'My' otherlv_18= 'problem' otherlv_19= 'is' ( (lv_request_20_0= ruleRequest ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'You' otherlv_22= 'must' otherlv_23= ':' ( (lv_posConst_24_0= ruleConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'You' otherlv_26= 'must' otherlv_27= 'not' otherlv_28= ':' ( (lv_negConst_29_0= ruleConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'The' otherlv_31= 'output' otherlv_32= 'must' otherlv_33= ':' ( (lv_dataPresent_34_0= ruleOutputConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Generate' otherlv_36= 'a' ( (lv_promptType_37_0= rulePromptType ) ) otherlv_38= 'prompt' otherlv_39= '.' ) ) ) ) )+ {...}?) )
            {
            // InternalCacher.g:80:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Use' ( (lv_usedPrompts_6_0= ruleUsedPromptsList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Accepts' ( (lv_bodyParams_8_0= ruleBodyParamsList ) ) otherlv_9= 'as' otherlv_10= 'parameters' otherlv_11= '.' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'The' otherlv_13= 'given' otherlv_14= 'context' otherlv_15= 'is' ( (lv_context_16_0= ruleContext ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'My' otherlv_18= 'problem' otherlv_19= 'is' ( (lv_request_20_0= ruleRequest ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'You' otherlv_22= 'must' otherlv_23= ':' ( (lv_posConst_24_0= ruleConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'You' otherlv_26= 'must' otherlv_27= 'not' otherlv_28= ':' ( (lv_negConst_29_0= ruleConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'The' otherlv_31= 'output' otherlv_32= 'must' otherlv_33= ':' ( (lv_dataPresent_34_0= ruleOutputConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Generate' otherlv_36= 'a' ( (lv_promptType_37_0= rulePromptType ) ) otherlv_38= 'prompt' otherlv_39= '.' ) ) ) ) )+ {...}?) )
            // InternalCacher.g:81:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Use' ( (lv_usedPrompts_6_0= ruleUsedPromptsList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Accepts' ( (lv_bodyParams_8_0= ruleBodyParamsList ) ) otherlv_9= 'as' otherlv_10= 'parameters' otherlv_11= '.' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'The' otherlv_13= 'given' otherlv_14= 'context' otherlv_15= 'is' ( (lv_context_16_0= ruleContext ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'My' otherlv_18= 'problem' otherlv_19= 'is' ( (lv_request_20_0= ruleRequest ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'You' otherlv_22= 'must' otherlv_23= ':' ( (lv_posConst_24_0= ruleConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'You' otherlv_26= 'must' otherlv_27= 'not' otherlv_28= ':' ( (lv_negConst_29_0= ruleConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'The' otherlv_31= 'output' otherlv_32= 'must' otherlv_33= ':' ( (lv_dataPresent_34_0= ruleOutputConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Generate' otherlv_36= 'a' ( (lv_promptType_37_0= rulePromptType ) ) otherlv_38= 'prompt' otherlv_39= '.' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getPromptAccess().getUnorderedGroup());
            			
            // InternalCacher.g:84:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Use' ( (lv_usedPrompts_6_0= ruleUsedPromptsList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Accepts' ( (lv_bodyParams_8_0= ruleBodyParamsList ) ) otherlv_9= 'as' otherlv_10= 'parameters' otherlv_11= '.' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'The' otherlv_13= 'given' otherlv_14= 'context' otherlv_15= 'is' ( (lv_context_16_0= ruleContext ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'My' otherlv_18= 'problem' otherlv_19= 'is' ( (lv_request_20_0= ruleRequest ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'You' otherlv_22= 'must' otherlv_23= ':' ( (lv_posConst_24_0= ruleConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'You' otherlv_26= 'must' otherlv_27= 'not' otherlv_28= ':' ( (lv_negConst_29_0= ruleConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'The' otherlv_31= 'output' otherlv_32= 'must' otherlv_33= ':' ( (lv_dataPresent_34_0= ruleOutputConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Generate' otherlv_36= 'a' ( (lv_promptType_37_0= rulePromptType ) ) otherlv_38= 'prompt' otherlv_39= '.' ) ) ) ) )+ {...}?)
            // InternalCacher.g:85:5: ( ({...}? => ( ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Use' ( (lv_usedPrompts_6_0= ruleUsedPromptsList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Accepts' ( (lv_bodyParams_8_0= ruleBodyParamsList ) ) otherlv_9= 'as' otherlv_10= 'parameters' otherlv_11= '.' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'The' otherlv_13= 'given' otherlv_14= 'context' otherlv_15= 'is' ( (lv_context_16_0= ruleContext ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'My' otherlv_18= 'problem' otherlv_19= 'is' ( (lv_request_20_0= ruleRequest ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'You' otherlv_22= 'must' otherlv_23= ':' ( (lv_posConst_24_0= ruleConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'You' otherlv_26= 'must' otherlv_27= 'not' otherlv_28= ':' ( (lv_negConst_29_0= ruleConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'The' otherlv_31= 'output' otherlv_32= 'must' otherlv_33= ':' ( (lv_dataPresent_34_0= ruleOutputConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Generate' otherlv_36= 'a' ( (lv_promptType_37_0= rulePromptType ) ) otherlv_38= 'prompt' otherlv_39= '.' ) ) ) ) )+ {...}?
            {
            // InternalCacher.g:85:5: ( ({...}? => ( ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Use' ( (lv_usedPrompts_6_0= ruleUsedPromptsList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Accepts' ( (lv_bodyParams_8_0= ruleBodyParamsList ) ) otherlv_9= 'as' otherlv_10= 'parameters' otherlv_11= '.' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'The' otherlv_13= 'given' otherlv_14= 'context' otherlv_15= 'is' ( (lv_context_16_0= ruleContext ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'My' otherlv_18= 'problem' otherlv_19= 'is' ( (lv_request_20_0= ruleRequest ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'You' otherlv_22= 'must' otherlv_23= ':' ( (lv_posConst_24_0= ruleConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'You' otherlv_26= 'must' otherlv_27= 'not' otherlv_28= ':' ( (lv_negConst_29_0= ruleConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'The' otherlv_31= 'output' otherlv_32= 'must' otherlv_33= ':' ( (lv_dataPresent_34_0= ruleOutputConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Generate' otherlv_36= 'a' ( (lv_promptType_37_0= rulePromptType ) ) otherlv_38= 'prompt' otherlv_39= '.' ) ) ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=10;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // InternalCacher.g:86:3: ({...}? => ( ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) ) ) )
            	    {
            	    // InternalCacher.g:86:3: ({...}? => ( ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) ) ) )
            	    // InternalCacher.g:87:4: {...}? => ( ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePrompt", "getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalCacher.g:87:100: ( ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) ) )
            	    // InternalCacher.g:88:5: ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPromptAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalCacher.g:91:8: ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) )
            	    // InternalCacher.g:91:9: {...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePrompt", "true");
            	    }
            	    // InternalCacher.g:91:18: (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' )
            	    // InternalCacher.g:91:19: otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.'
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getPromptAccess().getThisKeyword_0_0());
            	    							
            	    otherlv_2=(Token)match(input,12,FOLLOW_4); 

            	    								newLeafNode(otherlv_2, grammarAccess.getPromptAccess().getIsKeyword_0_1());
            	    							
            	    // InternalCacher.g:99:8: ( (lv_name_3_0= RULE_ID ) )
            	    // InternalCacher.g:100:9: (lv_name_3_0= RULE_ID )
            	    {
            	    // InternalCacher.g:100:9: (lv_name_3_0= RULE_ID )
            	    // InternalCacher.g:101:10: lv_name_3_0= RULE_ID
            	    {
            	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    										newLeafNode(lv_name_3_0, grammarAccess.getPromptAccess().getNameIDTerminalRuleCall_0_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getPromptRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"name",
            	    											lv_name_3_0,
            	    											"org.eclipse.xtext.common.Terminals.ID");
            	    									

            	    }


            	    }

            	    otherlv_4=(Token)match(input,13,FOLLOW_6); 

            	    								newLeafNode(otherlv_4, grammarAccess.getPromptAccess().getFullStopKeyword_0_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPromptAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCacher.g:127:3: ({...}? => ( ({...}? => (otherlv_5= 'Use' ( (lv_usedPrompts_6_0= ruleUsedPromptsList ) ) ) ) ) )
            	    {
            	    // InternalCacher.g:127:3: ({...}? => ( ({...}? => (otherlv_5= 'Use' ( (lv_usedPrompts_6_0= ruleUsedPromptsList ) ) ) ) ) )
            	    // InternalCacher.g:128:4: {...}? => ( ({...}? => (otherlv_5= 'Use' ( (lv_usedPrompts_6_0= ruleUsedPromptsList ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePrompt", "getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalCacher.g:128:100: ( ({...}? => (otherlv_5= 'Use' ( (lv_usedPrompts_6_0= ruleUsedPromptsList ) ) ) ) )
            	    // InternalCacher.g:129:5: ({...}? => (otherlv_5= 'Use' ( (lv_usedPrompts_6_0= ruleUsedPromptsList ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPromptAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalCacher.g:132:8: ({...}? => (otherlv_5= 'Use' ( (lv_usedPrompts_6_0= ruleUsedPromptsList ) ) ) )
            	    // InternalCacher.g:132:9: {...}? => (otherlv_5= 'Use' ( (lv_usedPrompts_6_0= ruleUsedPromptsList ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePrompt", "true");
            	    }
            	    // InternalCacher.g:132:18: (otherlv_5= 'Use' ( (lv_usedPrompts_6_0= ruleUsedPromptsList ) ) )
            	    // InternalCacher.g:132:19: otherlv_5= 'Use' ( (lv_usedPrompts_6_0= ruleUsedPromptsList ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_4); 

            	    								newLeafNode(otherlv_5, grammarAccess.getPromptAccess().getUseKeyword_1_0());
            	    							
            	    // InternalCacher.g:136:8: ( (lv_usedPrompts_6_0= ruleUsedPromptsList ) )
            	    // InternalCacher.g:137:9: (lv_usedPrompts_6_0= ruleUsedPromptsList )
            	    {
            	    // InternalCacher.g:137:9: (lv_usedPrompts_6_0= ruleUsedPromptsList )
            	    // InternalCacher.g:138:10: lv_usedPrompts_6_0= ruleUsedPromptsList
            	    {

            	    										newCompositeNode(grammarAccess.getPromptAccess().getUsedPromptsUsedPromptsListParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_6);
            	    lv_usedPrompts_6_0=ruleUsedPromptsList();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPromptRule());
            	    										}
            	    										set(
            	    											current,
            	    											"usedPrompts",
            	    											lv_usedPrompts_6_0,
            	    											"org.xtext.disim.cacher.Cacher.UsedPromptsList");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPromptAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalCacher.g:161:3: ({...}? => ( ({...}? => (otherlv_7= 'Accepts' ( (lv_bodyParams_8_0= ruleBodyParamsList ) ) otherlv_9= 'as' otherlv_10= 'parameters' otherlv_11= '.' ) ) ) )
            	    {
            	    // InternalCacher.g:161:3: ({...}? => ( ({...}? => (otherlv_7= 'Accepts' ( (lv_bodyParams_8_0= ruleBodyParamsList ) ) otherlv_9= 'as' otherlv_10= 'parameters' otherlv_11= '.' ) ) ) )
            	    // InternalCacher.g:162:4: {...}? => ( ({...}? => (otherlv_7= 'Accepts' ( (lv_bodyParams_8_0= ruleBodyParamsList ) ) otherlv_9= 'as' otherlv_10= 'parameters' otherlv_11= '.' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePrompt", "getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalCacher.g:162:100: ( ({...}? => (otherlv_7= 'Accepts' ( (lv_bodyParams_8_0= ruleBodyParamsList ) ) otherlv_9= 'as' otherlv_10= 'parameters' otherlv_11= '.' ) ) )
            	    // InternalCacher.g:163:5: ({...}? => (otherlv_7= 'Accepts' ( (lv_bodyParams_8_0= ruleBodyParamsList ) ) otherlv_9= 'as' otherlv_10= 'parameters' otherlv_11= '.' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPromptAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalCacher.g:166:8: ({...}? => (otherlv_7= 'Accepts' ( (lv_bodyParams_8_0= ruleBodyParamsList ) ) otherlv_9= 'as' otherlv_10= 'parameters' otherlv_11= '.' ) )
            	    // InternalCacher.g:166:9: {...}? => (otherlv_7= 'Accepts' ( (lv_bodyParams_8_0= ruleBodyParamsList ) ) otherlv_9= 'as' otherlv_10= 'parameters' otherlv_11= '.' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePrompt", "true");
            	    }
            	    // InternalCacher.g:166:18: (otherlv_7= 'Accepts' ( (lv_bodyParams_8_0= ruleBodyParamsList ) ) otherlv_9= 'as' otherlv_10= 'parameters' otherlv_11= '.' )
            	    // InternalCacher.g:166:19: otherlv_7= 'Accepts' ( (lv_bodyParams_8_0= ruleBodyParamsList ) ) otherlv_9= 'as' otherlv_10= 'parameters' otherlv_11= '.'
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_4); 

            	    								newLeafNode(otherlv_7, grammarAccess.getPromptAccess().getAcceptsKeyword_2_0());
            	    							
            	    // InternalCacher.g:170:8: ( (lv_bodyParams_8_0= ruleBodyParamsList ) )
            	    // InternalCacher.g:171:9: (lv_bodyParams_8_0= ruleBodyParamsList )
            	    {
            	    // InternalCacher.g:171:9: (lv_bodyParams_8_0= ruleBodyParamsList )
            	    // InternalCacher.g:172:10: lv_bodyParams_8_0= ruleBodyParamsList
            	    {

            	    										newCompositeNode(grammarAccess.getPromptAccess().getBodyParamsBodyParamsListParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_7);
            	    lv_bodyParams_8_0=ruleBodyParamsList();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPromptRule());
            	    										}
            	    										set(
            	    											current,
            	    											"bodyParams",
            	    											lv_bodyParams_8_0,
            	    											"org.xtext.disim.cacher.Cacher.BodyParamsList");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_9=(Token)match(input,16,FOLLOW_8); 

            	    								newLeafNode(otherlv_9, grammarAccess.getPromptAccess().getAsKeyword_2_2());
            	    							
            	    otherlv_10=(Token)match(input,17,FOLLOW_5); 

            	    								newLeafNode(otherlv_10, grammarAccess.getPromptAccess().getParametersKeyword_2_3());
            	    							
            	    otherlv_11=(Token)match(input,13,FOLLOW_6); 

            	    								newLeafNode(otherlv_11, grammarAccess.getPromptAccess().getFullStopKeyword_2_4());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPromptAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalCacher.g:207:3: ({...}? => ( ({...}? => (otherlv_12= 'The' otherlv_13= 'given' otherlv_14= 'context' otherlv_15= 'is' ( (lv_context_16_0= ruleContext ) ) ) ) ) )
            	    {
            	    // InternalCacher.g:207:3: ({...}? => ( ({...}? => (otherlv_12= 'The' otherlv_13= 'given' otherlv_14= 'context' otherlv_15= 'is' ( (lv_context_16_0= ruleContext ) ) ) ) ) )
            	    // InternalCacher.g:208:4: {...}? => ( ({...}? => (otherlv_12= 'The' otherlv_13= 'given' otherlv_14= 'context' otherlv_15= 'is' ( (lv_context_16_0= ruleContext ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePrompt", "getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalCacher.g:208:100: ( ({...}? => (otherlv_12= 'The' otherlv_13= 'given' otherlv_14= 'context' otherlv_15= 'is' ( (lv_context_16_0= ruleContext ) ) ) ) )
            	    // InternalCacher.g:209:5: ({...}? => (otherlv_12= 'The' otherlv_13= 'given' otherlv_14= 'context' otherlv_15= 'is' ( (lv_context_16_0= ruleContext ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPromptAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalCacher.g:212:8: ({...}? => (otherlv_12= 'The' otherlv_13= 'given' otherlv_14= 'context' otherlv_15= 'is' ( (lv_context_16_0= ruleContext ) ) ) )
            	    // InternalCacher.g:212:9: {...}? => (otherlv_12= 'The' otherlv_13= 'given' otherlv_14= 'context' otherlv_15= 'is' ( (lv_context_16_0= ruleContext ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePrompt", "true");
            	    }
            	    // InternalCacher.g:212:18: (otherlv_12= 'The' otherlv_13= 'given' otherlv_14= 'context' otherlv_15= 'is' ( (lv_context_16_0= ruleContext ) ) )
            	    // InternalCacher.g:212:19: otherlv_12= 'The' otherlv_13= 'given' otherlv_14= 'context' otherlv_15= 'is' ( (lv_context_16_0= ruleContext ) )
            	    {
            	    otherlv_12=(Token)match(input,18,FOLLOW_9); 

            	    								newLeafNode(otherlv_12, grammarAccess.getPromptAccess().getTheKeyword_3_0());
            	    							
            	    otherlv_13=(Token)match(input,19,FOLLOW_10); 

            	    								newLeafNode(otherlv_13, grammarAccess.getPromptAccess().getGivenKeyword_3_1());
            	    							
            	    otherlv_14=(Token)match(input,20,FOLLOW_3); 

            	    								newLeafNode(otherlv_14, grammarAccess.getPromptAccess().getContextKeyword_3_2());
            	    							
            	    otherlv_15=(Token)match(input,12,FOLLOW_11); 

            	    								newLeafNode(otherlv_15, grammarAccess.getPromptAccess().getIsKeyword_3_3());
            	    							
            	    // InternalCacher.g:228:8: ( (lv_context_16_0= ruleContext ) )
            	    // InternalCacher.g:229:9: (lv_context_16_0= ruleContext )
            	    {
            	    // InternalCacher.g:229:9: (lv_context_16_0= ruleContext )
            	    // InternalCacher.g:230:10: lv_context_16_0= ruleContext
            	    {

            	    										newCompositeNode(grammarAccess.getPromptAccess().getContextContextParserRuleCall_3_4_0());
            	    									
            	    pushFollow(FOLLOW_6);
            	    lv_context_16_0=ruleContext();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPromptRule());
            	    										}
            	    										set(
            	    											current,
            	    											"context",
            	    											lv_context_16_0,
            	    											"org.xtext.disim.cacher.Cacher.Context");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPromptAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalCacher.g:253:3: ({...}? => ( ({...}? => (otherlv_17= 'My' otherlv_18= 'problem' otherlv_19= 'is' ( (lv_request_20_0= ruleRequest ) ) ) ) ) )
            	    {
            	    // InternalCacher.g:253:3: ({...}? => ( ({...}? => (otherlv_17= 'My' otherlv_18= 'problem' otherlv_19= 'is' ( (lv_request_20_0= ruleRequest ) ) ) ) ) )
            	    // InternalCacher.g:254:4: {...}? => ( ({...}? => (otherlv_17= 'My' otherlv_18= 'problem' otherlv_19= 'is' ( (lv_request_20_0= ruleRequest ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "rulePrompt", "getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalCacher.g:254:100: ( ({...}? => (otherlv_17= 'My' otherlv_18= 'problem' otherlv_19= 'is' ( (lv_request_20_0= ruleRequest ) ) ) ) )
            	    // InternalCacher.g:255:5: ({...}? => (otherlv_17= 'My' otherlv_18= 'problem' otherlv_19= 'is' ( (lv_request_20_0= ruleRequest ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPromptAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalCacher.g:258:8: ({...}? => (otherlv_17= 'My' otherlv_18= 'problem' otherlv_19= 'is' ( (lv_request_20_0= ruleRequest ) ) ) )
            	    // InternalCacher.g:258:9: {...}? => (otherlv_17= 'My' otherlv_18= 'problem' otherlv_19= 'is' ( (lv_request_20_0= ruleRequest ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePrompt", "true");
            	    }
            	    // InternalCacher.g:258:18: (otherlv_17= 'My' otherlv_18= 'problem' otherlv_19= 'is' ( (lv_request_20_0= ruleRequest ) ) )
            	    // InternalCacher.g:258:19: otherlv_17= 'My' otherlv_18= 'problem' otherlv_19= 'is' ( (lv_request_20_0= ruleRequest ) )
            	    {
            	    otherlv_17=(Token)match(input,21,FOLLOW_12); 

            	    								newLeafNode(otherlv_17, grammarAccess.getPromptAccess().getMyKeyword_4_0());
            	    							
            	    otherlv_18=(Token)match(input,22,FOLLOW_3); 

            	    								newLeafNode(otherlv_18, grammarAccess.getPromptAccess().getProblemKeyword_4_1());
            	    							
            	    otherlv_19=(Token)match(input,12,FOLLOW_11); 

            	    								newLeafNode(otherlv_19, grammarAccess.getPromptAccess().getIsKeyword_4_2());
            	    							
            	    // InternalCacher.g:270:8: ( (lv_request_20_0= ruleRequest ) )
            	    // InternalCacher.g:271:9: (lv_request_20_0= ruleRequest )
            	    {
            	    // InternalCacher.g:271:9: (lv_request_20_0= ruleRequest )
            	    // InternalCacher.g:272:10: lv_request_20_0= ruleRequest
            	    {

            	    										newCompositeNode(grammarAccess.getPromptAccess().getRequestRequestParserRuleCall_4_3_0());
            	    									
            	    pushFollow(FOLLOW_6);
            	    lv_request_20_0=ruleRequest();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPromptRule());
            	    										}
            	    										set(
            	    											current,
            	    											"request",
            	    											lv_request_20_0,
            	    											"org.xtext.disim.cacher.Cacher.Request");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPromptAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalCacher.g:295:3: ({...}? => ( ({...}? => (otherlv_21= 'You' otherlv_22= 'must' otherlv_23= ':' ( (lv_posConst_24_0= ruleConstraintList ) ) ) ) ) )
            	    {
            	    // InternalCacher.g:295:3: ({...}? => ( ({...}? => (otherlv_21= 'You' otherlv_22= 'must' otherlv_23= ':' ( (lv_posConst_24_0= ruleConstraintList ) ) ) ) ) )
            	    // InternalCacher.g:296:4: {...}? => ( ({...}? => (otherlv_21= 'You' otherlv_22= 'must' otherlv_23= ':' ( (lv_posConst_24_0= ruleConstraintList ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "rulePrompt", "getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalCacher.g:296:100: ( ({...}? => (otherlv_21= 'You' otherlv_22= 'must' otherlv_23= ':' ( (lv_posConst_24_0= ruleConstraintList ) ) ) ) )
            	    // InternalCacher.g:297:5: ({...}? => (otherlv_21= 'You' otherlv_22= 'must' otherlv_23= ':' ( (lv_posConst_24_0= ruleConstraintList ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPromptAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalCacher.g:300:8: ({...}? => (otherlv_21= 'You' otherlv_22= 'must' otherlv_23= ':' ( (lv_posConst_24_0= ruleConstraintList ) ) ) )
            	    // InternalCacher.g:300:9: {...}? => (otherlv_21= 'You' otherlv_22= 'must' otherlv_23= ':' ( (lv_posConst_24_0= ruleConstraintList ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePrompt", "true");
            	    }
            	    // InternalCacher.g:300:18: (otherlv_21= 'You' otherlv_22= 'must' otherlv_23= ':' ( (lv_posConst_24_0= ruleConstraintList ) ) )
            	    // InternalCacher.g:300:19: otherlv_21= 'You' otherlv_22= 'must' otherlv_23= ':' ( (lv_posConst_24_0= ruleConstraintList ) )
            	    {
            	    otherlv_21=(Token)match(input,23,FOLLOW_13); 

            	    								newLeafNode(otherlv_21, grammarAccess.getPromptAccess().getYouKeyword_5_0());
            	    							
            	    otherlv_22=(Token)match(input,24,FOLLOW_14); 

            	    								newLeafNode(otherlv_22, grammarAccess.getPromptAccess().getMustKeyword_5_1());
            	    							
            	    otherlv_23=(Token)match(input,25,FOLLOW_11); 

            	    								newLeafNode(otherlv_23, grammarAccess.getPromptAccess().getColonKeyword_5_2());
            	    							
            	    // InternalCacher.g:312:8: ( (lv_posConst_24_0= ruleConstraintList ) )
            	    // InternalCacher.g:313:9: (lv_posConst_24_0= ruleConstraintList )
            	    {
            	    // InternalCacher.g:313:9: (lv_posConst_24_0= ruleConstraintList )
            	    // InternalCacher.g:314:10: lv_posConst_24_0= ruleConstraintList
            	    {

            	    										newCompositeNode(grammarAccess.getPromptAccess().getPosConstConstraintListParserRuleCall_5_3_0());
            	    									
            	    pushFollow(FOLLOW_6);
            	    lv_posConst_24_0=ruleConstraintList();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPromptRule());
            	    										}
            	    										set(
            	    											current,
            	    											"posConst",
            	    											lv_posConst_24_0,
            	    											"org.xtext.disim.cacher.Cacher.ConstraintList");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPromptAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalCacher.g:337:3: ({...}? => ( ({...}? => (otherlv_25= 'You' otherlv_26= 'must' otherlv_27= 'not' otherlv_28= ':' ( (lv_negConst_29_0= ruleConstraintList ) ) ) ) ) )
            	    {
            	    // InternalCacher.g:337:3: ({...}? => ( ({...}? => (otherlv_25= 'You' otherlv_26= 'must' otherlv_27= 'not' otherlv_28= ':' ( (lv_negConst_29_0= ruleConstraintList ) ) ) ) ) )
            	    // InternalCacher.g:338:4: {...}? => ( ({...}? => (otherlv_25= 'You' otherlv_26= 'must' otherlv_27= 'not' otherlv_28= ':' ( (lv_negConst_29_0= ruleConstraintList ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "rulePrompt", "getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalCacher.g:338:100: ( ({...}? => (otherlv_25= 'You' otherlv_26= 'must' otherlv_27= 'not' otherlv_28= ':' ( (lv_negConst_29_0= ruleConstraintList ) ) ) ) )
            	    // InternalCacher.g:339:5: ({...}? => (otherlv_25= 'You' otherlv_26= 'must' otherlv_27= 'not' otherlv_28= ':' ( (lv_negConst_29_0= ruleConstraintList ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPromptAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalCacher.g:342:8: ({...}? => (otherlv_25= 'You' otherlv_26= 'must' otherlv_27= 'not' otherlv_28= ':' ( (lv_negConst_29_0= ruleConstraintList ) ) ) )
            	    // InternalCacher.g:342:9: {...}? => (otherlv_25= 'You' otherlv_26= 'must' otherlv_27= 'not' otherlv_28= ':' ( (lv_negConst_29_0= ruleConstraintList ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePrompt", "true");
            	    }
            	    // InternalCacher.g:342:18: (otherlv_25= 'You' otherlv_26= 'must' otherlv_27= 'not' otherlv_28= ':' ( (lv_negConst_29_0= ruleConstraintList ) ) )
            	    // InternalCacher.g:342:19: otherlv_25= 'You' otherlv_26= 'must' otherlv_27= 'not' otherlv_28= ':' ( (lv_negConst_29_0= ruleConstraintList ) )
            	    {
            	    otherlv_25=(Token)match(input,23,FOLLOW_13); 

            	    								newLeafNode(otherlv_25, grammarAccess.getPromptAccess().getYouKeyword_6_0());
            	    							
            	    otherlv_26=(Token)match(input,24,FOLLOW_15); 

            	    								newLeafNode(otherlv_26, grammarAccess.getPromptAccess().getMustKeyword_6_1());
            	    							
            	    otherlv_27=(Token)match(input,26,FOLLOW_14); 

            	    								newLeafNode(otherlv_27, grammarAccess.getPromptAccess().getNotKeyword_6_2());
            	    							
            	    otherlv_28=(Token)match(input,25,FOLLOW_11); 

            	    								newLeafNode(otherlv_28, grammarAccess.getPromptAccess().getColonKeyword_6_3());
            	    							
            	    // InternalCacher.g:358:8: ( (lv_negConst_29_0= ruleConstraintList ) )
            	    // InternalCacher.g:359:9: (lv_negConst_29_0= ruleConstraintList )
            	    {
            	    // InternalCacher.g:359:9: (lv_negConst_29_0= ruleConstraintList )
            	    // InternalCacher.g:360:10: lv_negConst_29_0= ruleConstraintList
            	    {

            	    										newCompositeNode(grammarAccess.getPromptAccess().getNegConstConstraintListParserRuleCall_6_4_0());
            	    									
            	    pushFollow(FOLLOW_6);
            	    lv_negConst_29_0=ruleConstraintList();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPromptRule());
            	    										}
            	    										set(
            	    											current,
            	    											"negConst",
            	    											lv_negConst_29_0,
            	    											"org.xtext.disim.cacher.Cacher.ConstraintList");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPromptAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalCacher.g:383:3: ({...}? => ( ({...}? => (otherlv_30= 'The' otherlv_31= 'output' otherlv_32= 'must' otherlv_33= ':' ( (lv_dataPresent_34_0= ruleOutputConstraintList ) ) ) ) ) )
            	    {
            	    // InternalCacher.g:383:3: ({...}? => ( ({...}? => (otherlv_30= 'The' otherlv_31= 'output' otherlv_32= 'must' otherlv_33= ':' ( (lv_dataPresent_34_0= ruleOutputConstraintList ) ) ) ) ) )
            	    // InternalCacher.g:384:4: {...}? => ( ({...}? => (otherlv_30= 'The' otherlv_31= 'output' otherlv_32= 'must' otherlv_33= ':' ( (lv_dataPresent_34_0= ruleOutputConstraintList ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "rulePrompt", "getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalCacher.g:384:100: ( ({...}? => (otherlv_30= 'The' otherlv_31= 'output' otherlv_32= 'must' otherlv_33= ':' ( (lv_dataPresent_34_0= ruleOutputConstraintList ) ) ) ) )
            	    // InternalCacher.g:385:5: ({...}? => (otherlv_30= 'The' otherlv_31= 'output' otherlv_32= 'must' otherlv_33= ':' ( (lv_dataPresent_34_0= ruleOutputConstraintList ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPromptAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalCacher.g:388:8: ({...}? => (otherlv_30= 'The' otherlv_31= 'output' otherlv_32= 'must' otherlv_33= ':' ( (lv_dataPresent_34_0= ruleOutputConstraintList ) ) ) )
            	    // InternalCacher.g:388:9: {...}? => (otherlv_30= 'The' otherlv_31= 'output' otherlv_32= 'must' otherlv_33= ':' ( (lv_dataPresent_34_0= ruleOutputConstraintList ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePrompt", "true");
            	    }
            	    // InternalCacher.g:388:18: (otherlv_30= 'The' otherlv_31= 'output' otherlv_32= 'must' otherlv_33= ':' ( (lv_dataPresent_34_0= ruleOutputConstraintList ) ) )
            	    // InternalCacher.g:388:19: otherlv_30= 'The' otherlv_31= 'output' otherlv_32= 'must' otherlv_33= ':' ( (lv_dataPresent_34_0= ruleOutputConstraintList ) )
            	    {
            	    otherlv_30=(Token)match(input,18,FOLLOW_16); 

            	    								newLeafNode(otherlv_30, grammarAccess.getPromptAccess().getTheKeyword_7_0());
            	    							
            	    otherlv_31=(Token)match(input,27,FOLLOW_13); 

            	    								newLeafNode(otherlv_31, grammarAccess.getPromptAccess().getOutputKeyword_7_1());
            	    							
            	    otherlv_32=(Token)match(input,24,FOLLOW_14); 

            	    								newLeafNode(otherlv_32, grammarAccess.getPromptAccess().getMustKeyword_7_2());
            	    							
            	    otherlv_33=(Token)match(input,25,FOLLOW_11); 

            	    								newLeafNode(otherlv_33, grammarAccess.getPromptAccess().getColonKeyword_7_3());
            	    							
            	    // InternalCacher.g:404:8: ( (lv_dataPresent_34_0= ruleOutputConstraintList ) )
            	    // InternalCacher.g:405:9: (lv_dataPresent_34_0= ruleOutputConstraintList )
            	    {
            	    // InternalCacher.g:405:9: (lv_dataPresent_34_0= ruleOutputConstraintList )
            	    // InternalCacher.g:406:10: lv_dataPresent_34_0= ruleOutputConstraintList
            	    {

            	    										newCompositeNode(grammarAccess.getPromptAccess().getDataPresentOutputConstraintListParserRuleCall_7_4_0());
            	    									
            	    pushFollow(FOLLOW_6);
            	    lv_dataPresent_34_0=ruleOutputConstraintList();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPromptRule());
            	    										}
            	    										set(
            	    											current,
            	    											"dataPresent",
            	    											lv_dataPresent_34_0,
            	    											"org.xtext.disim.cacher.Cacher.OutputConstraintList");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPromptAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalCacher.g:429:3: ({...}? => ( ({...}? => (otherlv_35= 'Generate' otherlv_36= 'a' ( (lv_promptType_37_0= rulePromptType ) ) otherlv_38= 'prompt' otherlv_39= '.' ) ) ) )
            	    {
            	    // InternalCacher.g:429:3: ({...}? => ( ({...}? => (otherlv_35= 'Generate' otherlv_36= 'a' ( (lv_promptType_37_0= rulePromptType ) ) otherlv_38= 'prompt' otherlv_39= '.' ) ) ) )
            	    // InternalCacher.g:430:4: {...}? => ( ({...}? => (otherlv_35= 'Generate' otherlv_36= 'a' ( (lv_promptType_37_0= rulePromptType ) ) otherlv_38= 'prompt' otherlv_39= '.' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 8) ) {
            	        throw new FailedPredicateException(input, "rulePrompt", "getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 8)");
            	    }
            	    // InternalCacher.g:430:100: ( ({...}? => (otherlv_35= 'Generate' otherlv_36= 'a' ( (lv_promptType_37_0= rulePromptType ) ) otherlv_38= 'prompt' otherlv_39= '.' ) ) )
            	    // InternalCacher.g:431:5: ({...}? => (otherlv_35= 'Generate' otherlv_36= 'a' ( (lv_promptType_37_0= rulePromptType ) ) otherlv_38= 'prompt' otherlv_39= '.' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPromptAccess().getUnorderedGroup(), 8);
            	    				
            	    // InternalCacher.g:434:8: ({...}? => (otherlv_35= 'Generate' otherlv_36= 'a' ( (lv_promptType_37_0= rulePromptType ) ) otherlv_38= 'prompt' otherlv_39= '.' ) )
            	    // InternalCacher.g:434:9: {...}? => (otherlv_35= 'Generate' otherlv_36= 'a' ( (lv_promptType_37_0= rulePromptType ) ) otherlv_38= 'prompt' otherlv_39= '.' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePrompt", "true");
            	    }
            	    // InternalCacher.g:434:18: (otherlv_35= 'Generate' otherlv_36= 'a' ( (lv_promptType_37_0= rulePromptType ) ) otherlv_38= 'prompt' otherlv_39= '.' )
            	    // InternalCacher.g:434:19: otherlv_35= 'Generate' otherlv_36= 'a' ( (lv_promptType_37_0= rulePromptType ) ) otherlv_38= 'prompt' otherlv_39= '.'
            	    {
            	    otherlv_35=(Token)match(input,28,FOLLOW_17); 

            	    								newLeafNode(otherlv_35, grammarAccess.getPromptAccess().getGenerateKeyword_8_0());
            	    							
            	    otherlv_36=(Token)match(input,29,FOLLOW_18); 

            	    								newLeafNode(otherlv_36, grammarAccess.getPromptAccess().getAKeyword_8_1());
            	    							
            	    // InternalCacher.g:442:8: ( (lv_promptType_37_0= rulePromptType ) )
            	    // InternalCacher.g:443:9: (lv_promptType_37_0= rulePromptType )
            	    {
            	    // InternalCacher.g:443:9: (lv_promptType_37_0= rulePromptType )
            	    // InternalCacher.g:444:10: lv_promptType_37_0= rulePromptType
            	    {

            	    										newCompositeNode(grammarAccess.getPromptAccess().getPromptTypePromptTypeEnumRuleCall_8_2_0());
            	    									
            	    pushFollow(FOLLOW_19);
            	    lv_promptType_37_0=rulePromptType();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPromptRule());
            	    										}
            	    										set(
            	    											current,
            	    											"promptType",
            	    											lv_promptType_37_0,
            	    											"org.xtext.disim.cacher.Cacher.PromptType");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_38=(Token)match(input,30,FOLLOW_5); 

            	    								newLeafNode(otherlv_38, grammarAccess.getPromptAccess().getPromptKeyword_8_3());
            	    							
            	    otherlv_39=(Token)match(input,13,FOLLOW_6); 

            	    								newLeafNode(otherlv_39, grammarAccess.getPromptAccess().getFullStopKeyword_8_4());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPromptAccess().getUnorderedGroup());
            	    				

            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPromptAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rulePrompt", "getUnorderedGroupHelper().canLeave(grammarAccess.getPromptAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getPromptAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "rulePrompt"


    // $ANTLR start "entryRuleBodyParamsList"
    // InternalCacher.g:486:1: entryRuleBodyParamsList returns [EObject current=null] : iv_ruleBodyParamsList= ruleBodyParamsList EOF ;
    public final EObject entryRuleBodyParamsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyParamsList = null;


        try {
            // InternalCacher.g:486:55: (iv_ruleBodyParamsList= ruleBodyParamsList EOF )
            // InternalCacher.g:487:2: iv_ruleBodyParamsList= ruleBodyParamsList EOF
            {
             newCompositeNode(grammarAccess.getBodyParamsListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBodyParamsList=ruleBodyParamsList();

            state._fsp--;

             current =iv_ruleBodyParamsList; 
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
    // $ANTLR end "entryRuleBodyParamsList"


    // $ANTLR start "ruleBodyParamsList"
    // InternalCacher.g:493:1: ruleBodyParamsList returns [EObject current=null] : ( ( (lv_list_0_0= ruleBodyParam ) ) (otherlv_1= ',' ( (lv_list_2_0= ruleBodyParam ) ) )* ) ;
    public final EObject ruleBodyParamsList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_list_0_0 = null;

        EObject lv_list_2_0 = null;



        	enterRule();

        try {
            // InternalCacher.g:499:2: ( ( ( (lv_list_0_0= ruleBodyParam ) ) (otherlv_1= ',' ( (lv_list_2_0= ruleBodyParam ) ) )* ) )
            // InternalCacher.g:500:2: ( ( (lv_list_0_0= ruleBodyParam ) ) (otherlv_1= ',' ( (lv_list_2_0= ruleBodyParam ) ) )* )
            {
            // InternalCacher.g:500:2: ( ( (lv_list_0_0= ruleBodyParam ) ) (otherlv_1= ',' ( (lv_list_2_0= ruleBodyParam ) ) )* )
            // InternalCacher.g:501:3: ( (lv_list_0_0= ruleBodyParam ) ) (otherlv_1= ',' ( (lv_list_2_0= ruleBodyParam ) ) )*
            {
            // InternalCacher.g:501:3: ( (lv_list_0_0= ruleBodyParam ) )
            // InternalCacher.g:502:4: (lv_list_0_0= ruleBodyParam )
            {
            // InternalCacher.g:502:4: (lv_list_0_0= ruleBodyParam )
            // InternalCacher.g:503:5: lv_list_0_0= ruleBodyParam
            {

            					newCompositeNode(grammarAccess.getBodyParamsListAccess().getListBodyParamParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_list_0_0=ruleBodyParam();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBodyParamsListRule());
            					}
            					add(
            						current,
            						"list",
            						lv_list_0_0,
            						"org.xtext.disim.cacher.Cacher.BodyParam");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCacher.g:520:3: (otherlv_1= ',' ( (lv_list_2_0= ruleBodyParam ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==31) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCacher.g:521:4: otherlv_1= ',' ( (lv_list_2_0= ruleBodyParam ) )
            	    {
            	    otherlv_1=(Token)match(input,31,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getBodyParamsListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalCacher.g:525:4: ( (lv_list_2_0= ruleBodyParam ) )
            	    // InternalCacher.g:526:5: (lv_list_2_0= ruleBodyParam )
            	    {
            	    // InternalCacher.g:526:5: (lv_list_2_0= ruleBodyParam )
            	    // InternalCacher.g:527:6: lv_list_2_0= ruleBodyParam
            	    {

            	    						newCompositeNode(grammarAccess.getBodyParamsListAccess().getListBodyParamParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_list_2_0=ruleBodyParam();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBodyParamsListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"list",
            	    							lv_list_2_0,
            	    							"org.xtext.disim.cacher.Cacher.BodyParam");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleBodyParamsList"


    // $ANTLR start "entryRuleUsedPromptsList"
    // InternalCacher.g:549:1: entryRuleUsedPromptsList returns [EObject current=null] : iv_ruleUsedPromptsList= ruleUsedPromptsList EOF ;
    public final EObject entryRuleUsedPromptsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsedPromptsList = null;


        try {
            // InternalCacher.g:549:56: (iv_ruleUsedPromptsList= ruleUsedPromptsList EOF )
            // InternalCacher.g:550:2: iv_ruleUsedPromptsList= ruleUsedPromptsList EOF
            {
             newCompositeNode(grammarAccess.getUsedPromptsListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUsedPromptsList=ruleUsedPromptsList();

            state._fsp--;

             current =iv_ruleUsedPromptsList; 
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
    // $ANTLR end "entryRuleUsedPromptsList"


    // $ANTLR start "ruleUsedPromptsList"
    // InternalCacher.g:556:1: ruleUsedPromptsList returns [EObject current=null] : ( ( (lv_list_0_0= ruleExternalRef ) ) (otherlv_1= ',' ( (lv_list_2_0= ruleExternalRef ) ) )* otherlv_3= '.' ) ;
    public final EObject ruleUsedPromptsList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_list_0_0 = null;

        EObject lv_list_2_0 = null;



        	enterRule();

        try {
            // InternalCacher.g:562:2: ( ( ( (lv_list_0_0= ruleExternalRef ) ) (otherlv_1= ',' ( (lv_list_2_0= ruleExternalRef ) ) )* otherlv_3= '.' ) )
            // InternalCacher.g:563:2: ( ( (lv_list_0_0= ruleExternalRef ) ) (otherlv_1= ',' ( (lv_list_2_0= ruleExternalRef ) ) )* otherlv_3= '.' )
            {
            // InternalCacher.g:563:2: ( ( (lv_list_0_0= ruleExternalRef ) ) (otherlv_1= ',' ( (lv_list_2_0= ruleExternalRef ) ) )* otherlv_3= '.' )
            // InternalCacher.g:564:3: ( (lv_list_0_0= ruleExternalRef ) ) (otherlv_1= ',' ( (lv_list_2_0= ruleExternalRef ) ) )* otherlv_3= '.'
            {
            // InternalCacher.g:564:3: ( (lv_list_0_0= ruleExternalRef ) )
            // InternalCacher.g:565:4: (lv_list_0_0= ruleExternalRef )
            {
            // InternalCacher.g:565:4: (lv_list_0_0= ruleExternalRef )
            // InternalCacher.g:566:5: lv_list_0_0= ruleExternalRef
            {

            					newCompositeNode(grammarAccess.getUsedPromptsListAccess().getListExternalRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_list_0_0=ruleExternalRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUsedPromptsListRule());
            					}
            					add(
            						current,
            						"list",
            						lv_list_0_0,
            						"org.xtext.disim.cacher.Cacher.ExternalRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCacher.g:583:3: (otherlv_1= ',' ( (lv_list_2_0= ruleExternalRef ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==31) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCacher.g:584:4: otherlv_1= ',' ( (lv_list_2_0= ruleExternalRef ) )
            	    {
            	    otherlv_1=(Token)match(input,31,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getUsedPromptsListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalCacher.g:588:4: ( (lv_list_2_0= ruleExternalRef ) )
            	    // InternalCacher.g:589:5: (lv_list_2_0= ruleExternalRef )
            	    {
            	    // InternalCacher.g:589:5: (lv_list_2_0= ruleExternalRef )
            	    // InternalCacher.g:590:6: lv_list_2_0= ruleExternalRef
            	    {

            	    						newCompositeNode(grammarAccess.getUsedPromptsListAccess().getListExternalRefParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_list_2_0=ruleExternalRef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUsedPromptsListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"list",
            	    							lv_list_2_0,
            	    							"org.xtext.disim.cacher.Cacher.ExternalRef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getUsedPromptsListAccess().getFullStopKeyword_2());
            		

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
    // $ANTLR end "ruleUsedPromptsList"


    // $ANTLR start "entryRuleContext"
    // InternalCacher.g:616:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // InternalCacher.g:616:48: (iv_ruleContext= ruleContext EOF )
            // InternalCacher.g:617:2: iv_ruleContext= ruleContext EOF
            {
             newCompositeNode(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContext=ruleContext();

            state._fsp--;

             current =iv_ruleContext; 
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
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // InternalCacher.g:623:1: ruleContext returns [EObject current=null] : ( ( ( ( (lv_external_0_0= ruleExternalRef ) ) (otherlv_1= 'and' ( (lv_external_2_0= ruleExternalRef ) ) )* ) | ( (lv_body_3_0= RULE_STRING ) ) ) otherlv_4= '.' ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_body_3_0=null;
        Token otherlv_4=null;
        EObject lv_external_0_0 = null;

        EObject lv_external_2_0 = null;



        	enterRule();

        try {
            // InternalCacher.g:629:2: ( ( ( ( ( (lv_external_0_0= ruleExternalRef ) ) (otherlv_1= 'and' ( (lv_external_2_0= ruleExternalRef ) ) )* ) | ( (lv_body_3_0= RULE_STRING ) ) ) otherlv_4= '.' ) )
            // InternalCacher.g:630:2: ( ( ( ( (lv_external_0_0= ruleExternalRef ) ) (otherlv_1= 'and' ( (lv_external_2_0= ruleExternalRef ) ) )* ) | ( (lv_body_3_0= RULE_STRING ) ) ) otherlv_4= '.' )
            {
            // InternalCacher.g:630:2: ( ( ( ( (lv_external_0_0= ruleExternalRef ) ) (otherlv_1= 'and' ( (lv_external_2_0= ruleExternalRef ) ) )* ) | ( (lv_body_3_0= RULE_STRING ) ) ) otherlv_4= '.' )
            // InternalCacher.g:631:3: ( ( ( (lv_external_0_0= ruleExternalRef ) ) (otherlv_1= 'and' ( (lv_external_2_0= ruleExternalRef ) ) )* ) | ( (lv_body_3_0= RULE_STRING ) ) ) otherlv_4= '.'
            {
            // InternalCacher.g:631:3: ( ( ( (lv_external_0_0= ruleExternalRef ) ) (otherlv_1= 'and' ( (lv_external_2_0= ruleExternalRef ) ) )* ) | ( (lv_body_3_0= RULE_STRING ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCacher.g:632:4: ( ( (lv_external_0_0= ruleExternalRef ) ) (otherlv_1= 'and' ( (lv_external_2_0= ruleExternalRef ) ) )* )
                    {
                    // InternalCacher.g:632:4: ( ( (lv_external_0_0= ruleExternalRef ) ) (otherlv_1= 'and' ( (lv_external_2_0= ruleExternalRef ) ) )* )
                    // InternalCacher.g:633:5: ( (lv_external_0_0= ruleExternalRef ) ) (otherlv_1= 'and' ( (lv_external_2_0= ruleExternalRef ) ) )*
                    {
                    // InternalCacher.g:633:5: ( (lv_external_0_0= ruleExternalRef ) )
                    // InternalCacher.g:634:6: (lv_external_0_0= ruleExternalRef )
                    {
                    // InternalCacher.g:634:6: (lv_external_0_0= ruleExternalRef )
                    // InternalCacher.g:635:7: lv_external_0_0= ruleExternalRef
                    {

                    							newCompositeNode(grammarAccess.getContextAccess().getExternalExternalRefParserRuleCall_0_0_0_0());
                    						
                    pushFollow(FOLLOW_22);
                    lv_external_0_0=ruleExternalRef();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getContextRule());
                    							}
                    							add(
                    								current,
                    								"external",
                    								lv_external_0_0,
                    								"org.xtext.disim.cacher.Cacher.ExternalRef");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalCacher.g:652:5: (otherlv_1= 'and' ( (lv_external_2_0= ruleExternalRef ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==32) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalCacher.g:653:6: otherlv_1= 'and' ( (lv_external_2_0= ruleExternalRef ) )
                    	    {
                    	    otherlv_1=(Token)match(input,32,FOLLOW_4); 

                    	    						newLeafNode(otherlv_1, grammarAccess.getContextAccess().getAndKeyword_0_0_1_0());
                    	    					
                    	    // InternalCacher.g:657:6: ( (lv_external_2_0= ruleExternalRef ) )
                    	    // InternalCacher.g:658:7: (lv_external_2_0= ruleExternalRef )
                    	    {
                    	    // InternalCacher.g:658:7: (lv_external_2_0= ruleExternalRef )
                    	    // InternalCacher.g:659:8: lv_external_2_0= ruleExternalRef
                    	    {

                    	    								newCompositeNode(grammarAccess.getContextAccess().getExternalExternalRefParserRuleCall_0_0_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_22);
                    	    lv_external_2_0=ruleExternalRef();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getContextRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"external",
                    	    									lv_external_2_0,
                    	    									"org.xtext.disim.cacher.Cacher.ExternalRef");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalCacher.g:679:4: ( (lv_body_3_0= RULE_STRING ) )
                    {
                    // InternalCacher.g:679:4: ( (lv_body_3_0= RULE_STRING ) )
                    // InternalCacher.g:680:5: (lv_body_3_0= RULE_STRING )
                    {
                    // InternalCacher.g:680:5: (lv_body_3_0= RULE_STRING )
                    // InternalCacher.g:681:6: lv_body_3_0= RULE_STRING
                    {
                    lv_body_3_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_body_3_0, grammarAccess.getContextAccess().getBodySTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContextRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"body",
                    							lv_body_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getContextAccess().getFullStopKeyword_1());
            		

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
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleRequest"
    // InternalCacher.g:706:1: entryRuleRequest returns [EObject current=null] : iv_ruleRequest= ruleRequest EOF ;
    public final EObject entryRuleRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequest = null;


        try {
            // InternalCacher.g:706:48: (iv_ruleRequest= ruleRequest EOF )
            // InternalCacher.g:707:2: iv_ruleRequest= ruleRequest EOF
            {
             newCompositeNode(grammarAccess.getRequestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequest=ruleRequest();

            state._fsp--;

             current =iv_ruleRequest; 
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
    // $ANTLR end "entryRuleRequest"


    // $ANTLR start "ruleRequest"
    // InternalCacher.g:713:1: ruleRequest returns [EObject current=null] : ( ( (lv_body_0_0= ruleBodyPart ) ) (otherlv_1= ',' ( (lv_body_2_0= ruleBodyPart ) ) )* otherlv_3= '.' ) ;
    public final EObject ruleRequest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_body_0_0 = null;

        EObject lv_body_2_0 = null;



        	enterRule();

        try {
            // InternalCacher.g:719:2: ( ( ( (lv_body_0_0= ruleBodyPart ) ) (otherlv_1= ',' ( (lv_body_2_0= ruleBodyPart ) ) )* otherlv_3= '.' ) )
            // InternalCacher.g:720:2: ( ( (lv_body_0_0= ruleBodyPart ) ) (otherlv_1= ',' ( (lv_body_2_0= ruleBodyPart ) ) )* otherlv_3= '.' )
            {
            // InternalCacher.g:720:2: ( ( (lv_body_0_0= ruleBodyPart ) ) (otherlv_1= ',' ( (lv_body_2_0= ruleBodyPart ) ) )* otherlv_3= '.' )
            // InternalCacher.g:721:3: ( (lv_body_0_0= ruleBodyPart ) ) (otherlv_1= ',' ( (lv_body_2_0= ruleBodyPart ) ) )* otherlv_3= '.'
            {
            // InternalCacher.g:721:3: ( (lv_body_0_0= ruleBodyPart ) )
            // InternalCacher.g:722:4: (lv_body_0_0= ruleBodyPart )
            {
            // InternalCacher.g:722:4: (lv_body_0_0= ruleBodyPart )
            // InternalCacher.g:723:5: lv_body_0_0= ruleBodyPart
            {

            					newCompositeNode(grammarAccess.getRequestAccess().getBodyBodyPartParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_body_0_0=ruleBodyPart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequestRule());
            					}
            					add(
            						current,
            						"body",
            						lv_body_0_0,
            						"org.xtext.disim.cacher.Cacher.BodyPart");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCacher.g:740:3: (otherlv_1= ',' ( (lv_body_2_0= ruleBodyPart ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==31) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCacher.g:741:4: otherlv_1= ',' ( (lv_body_2_0= ruleBodyPart ) )
            	    {
            	    otherlv_1=(Token)match(input,31,FOLLOW_11); 

            	    				newLeafNode(otherlv_1, grammarAccess.getRequestAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalCacher.g:745:4: ( (lv_body_2_0= ruleBodyPart ) )
            	    // InternalCacher.g:746:5: (lv_body_2_0= ruleBodyPart )
            	    {
            	    // InternalCacher.g:746:5: (lv_body_2_0= ruleBodyPart )
            	    // InternalCacher.g:747:6: lv_body_2_0= ruleBodyPart
            	    {

            	    						newCompositeNode(grammarAccess.getRequestAccess().getBodyBodyPartParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_body_2_0=ruleBodyPart();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRequestRule());
            	    						}
            	    						add(
            	    							current,
            	    							"body",
            	    							lv_body_2_0,
            	    							"org.xtext.disim.cacher.Cacher.BodyPart");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRequestAccess().getFullStopKeyword_2());
            		

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
    // $ANTLR end "ruleRequest"


    // $ANTLR start "entryRuleConstraintList"
    // InternalCacher.g:773:1: entryRuleConstraintList returns [EObject current=null] : iv_ruleConstraintList= ruleConstraintList EOF ;
    public final EObject entryRuleConstraintList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintList = null;


        try {
            // InternalCacher.g:773:55: (iv_ruleConstraintList= ruleConstraintList EOF )
            // InternalCacher.g:774:2: iv_ruleConstraintList= ruleConstraintList EOF
            {
             newCompositeNode(grammarAccess.getConstraintListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraintList=ruleConstraintList();

            state._fsp--;

             current =iv_ruleConstraintList; 
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
    // $ANTLR end "entryRuleConstraintList"


    // $ANTLR start "ruleConstraintList"
    // InternalCacher.g:780:1: ruleConstraintList returns [EObject current=null] : ( ( (lv_list_0_0= ruleConstraint ) ) (otherlv_1= ';' ( (lv_list_2_0= ruleConstraint ) ) )* otherlv_3= '.' ) ;
    public final EObject ruleConstraintList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_list_0_0 = null;

        EObject lv_list_2_0 = null;



        	enterRule();

        try {
            // InternalCacher.g:786:2: ( ( ( (lv_list_0_0= ruleConstraint ) ) (otherlv_1= ';' ( (lv_list_2_0= ruleConstraint ) ) )* otherlv_3= '.' ) )
            // InternalCacher.g:787:2: ( ( (lv_list_0_0= ruleConstraint ) ) (otherlv_1= ';' ( (lv_list_2_0= ruleConstraint ) ) )* otherlv_3= '.' )
            {
            // InternalCacher.g:787:2: ( ( (lv_list_0_0= ruleConstraint ) ) (otherlv_1= ';' ( (lv_list_2_0= ruleConstraint ) ) )* otherlv_3= '.' )
            // InternalCacher.g:788:3: ( (lv_list_0_0= ruleConstraint ) ) (otherlv_1= ';' ( (lv_list_2_0= ruleConstraint ) ) )* otherlv_3= '.'
            {
            // InternalCacher.g:788:3: ( (lv_list_0_0= ruleConstraint ) )
            // InternalCacher.g:789:4: (lv_list_0_0= ruleConstraint )
            {
            // InternalCacher.g:789:4: (lv_list_0_0= ruleConstraint )
            // InternalCacher.g:790:5: lv_list_0_0= ruleConstraint
            {

            					newCompositeNode(grammarAccess.getConstraintListAccess().getListConstraintParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_list_0_0=ruleConstraint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintListRule());
            					}
            					add(
            						current,
            						"list",
            						lv_list_0_0,
            						"org.xtext.disim.cacher.Cacher.Constraint");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCacher.g:807:3: (otherlv_1= ';' ( (lv_list_2_0= ruleConstraint ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==33) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCacher.g:808:4: otherlv_1= ';' ( (lv_list_2_0= ruleConstraint ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_11); 

            	    				newLeafNode(otherlv_1, grammarAccess.getConstraintListAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalCacher.g:812:4: ( (lv_list_2_0= ruleConstraint ) )
            	    // InternalCacher.g:813:5: (lv_list_2_0= ruleConstraint )
            	    {
            	    // InternalCacher.g:813:5: (lv_list_2_0= ruleConstraint )
            	    // InternalCacher.g:814:6: lv_list_2_0= ruleConstraint
            	    {

            	    						newCompositeNode(grammarAccess.getConstraintListAccess().getListConstraintParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_list_2_0=ruleConstraint();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConstraintListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"list",
            	    							lv_list_2_0,
            	    							"org.xtext.disim.cacher.Cacher.Constraint");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConstraintListAccess().getFullStopKeyword_2());
            		

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
    // $ANTLR end "ruleConstraintList"


    // $ANTLR start "entryRuleConstraint"
    // InternalCacher.g:840:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalCacher.g:840:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalCacher.g:841:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalCacher.g:847:1: ruleConstraint returns [EObject current=null] : ( ( (lv_body_0_0= ruleBodyPart ) ) (otherlv_1= ',' ( (lv_body_2_0= ruleBodyPart ) ) )* ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_body_0_0 = null;

        EObject lv_body_2_0 = null;



        	enterRule();

        try {
            // InternalCacher.g:853:2: ( ( ( (lv_body_0_0= ruleBodyPart ) ) (otherlv_1= ',' ( (lv_body_2_0= ruleBodyPart ) ) )* ) )
            // InternalCacher.g:854:2: ( ( (lv_body_0_0= ruleBodyPart ) ) (otherlv_1= ',' ( (lv_body_2_0= ruleBodyPart ) ) )* )
            {
            // InternalCacher.g:854:2: ( ( (lv_body_0_0= ruleBodyPart ) ) (otherlv_1= ',' ( (lv_body_2_0= ruleBodyPart ) ) )* )
            // InternalCacher.g:855:3: ( (lv_body_0_0= ruleBodyPart ) ) (otherlv_1= ',' ( (lv_body_2_0= ruleBodyPart ) ) )*
            {
            // InternalCacher.g:855:3: ( (lv_body_0_0= ruleBodyPart ) )
            // InternalCacher.g:856:4: (lv_body_0_0= ruleBodyPart )
            {
            // InternalCacher.g:856:4: (lv_body_0_0= ruleBodyPart )
            // InternalCacher.g:857:5: lv_body_0_0= ruleBodyPart
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getBodyBodyPartParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_body_0_0=ruleBodyPart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintRule());
            					}
            					add(
            						current,
            						"body",
            						lv_body_0_0,
            						"org.xtext.disim.cacher.Cacher.BodyPart");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCacher.g:874:3: (otherlv_1= ',' ( (lv_body_2_0= ruleBodyPart ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==31) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCacher.g:875:4: otherlv_1= ',' ( (lv_body_2_0= ruleBodyPart ) )
            	    {
            	    otherlv_1=(Token)match(input,31,FOLLOW_11); 

            	    				newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalCacher.g:879:4: ( (lv_body_2_0= ruleBodyPart ) )
            	    // InternalCacher.g:880:5: (lv_body_2_0= ruleBodyPart )
            	    {
            	    // InternalCacher.g:880:5: (lv_body_2_0= ruleBodyPart )
            	    // InternalCacher.g:881:6: lv_body_2_0= ruleBodyPart
            	    {

            	    						newCompositeNode(grammarAccess.getConstraintAccess().getBodyBodyPartParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_body_2_0=ruleBodyPart();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConstraintRule());
            	    						}
            	    						add(
            	    							current,
            	    							"body",
            	    							lv_body_2_0,
            	    							"org.xtext.disim.cacher.Cacher.BodyPart");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleOutputConstraintList"
    // InternalCacher.g:903:1: entryRuleOutputConstraintList returns [EObject current=null] : iv_ruleOutputConstraintList= ruleOutputConstraintList EOF ;
    public final EObject entryRuleOutputConstraintList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputConstraintList = null;


        try {
            // InternalCacher.g:903:61: (iv_ruleOutputConstraintList= ruleOutputConstraintList EOF )
            // InternalCacher.g:904:2: iv_ruleOutputConstraintList= ruleOutputConstraintList EOF
            {
             newCompositeNode(grammarAccess.getOutputConstraintListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputConstraintList=ruleOutputConstraintList();

            state._fsp--;

             current =iv_ruleOutputConstraintList; 
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
    // $ANTLR end "entryRuleOutputConstraintList"


    // $ANTLR start "ruleOutputConstraintList"
    // InternalCacher.g:910:1: ruleOutputConstraintList returns [EObject current=null] : ( ( (lv_list_0_0= ruleOutputConstraint ) ) (otherlv_1= ';' ( (lv_list_2_0= ruleOutputConstraint ) ) )* otherlv_3= '.' ) ;
    public final EObject ruleOutputConstraintList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_list_0_0 = null;

        EObject lv_list_2_0 = null;



        	enterRule();

        try {
            // InternalCacher.g:916:2: ( ( ( (lv_list_0_0= ruleOutputConstraint ) ) (otherlv_1= ';' ( (lv_list_2_0= ruleOutputConstraint ) ) )* otherlv_3= '.' ) )
            // InternalCacher.g:917:2: ( ( (lv_list_0_0= ruleOutputConstraint ) ) (otherlv_1= ';' ( (lv_list_2_0= ruleOutputConstraint ) ) )* otherlv_3= '.' )
            {
            // InternalCacher.g:917:2: ( ( (lv_list_0_0= ruleOutputConstraint ) ) (otherlv_1= ';' ( (lv_list_2_0= ruleOutputConstraint ) ) )* otherlv_3= '.' )
            // InternalCacher.g:918:3: ( (lv_list_0_0= ruleOutputConstraint ) ) (otherlv_1= ';' ( (lv_list_2_0= ruleOutputConstraint ) ) )* otherlv_3= '.'
            {
            // InternalCacher.g:918:3: ( (lv_list_0_0= ruleOutputConstraint ) )
            // InternalCacher.g:919:4: (lv_list_0_0= ruleOutputConstraint )
            {
            // InternalCacher.g:919:4: (lv_list_0_0= ruleOutputConstraint )
            // InternalCacher.g:920:5: lv_list_0_0= ruleOutputConstraint
            {

            					newCompositeNode(grammarAccess.getOutputConstraintListAccess().getListOutputConstraintParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_list_0_0=ruleOutputConstraint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputConstraintListRule());
            					}
            					add(
            						current,
            						"list",
            						lv_list_0_0,
            						"org.xtext.disim.cacher.Cacher.OutputConstraint");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCacher.g:937:3: (otherlv_1= ';' ( (lv_list_2_0= ruleOutputConstraint ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==33) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCacher.g:938:4: otherlv_1= ';' ( (lv_list_2_0= ruleOutputConstraint ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_11); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOutputConstraintListAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalCacher.g:942:4: ( (lv_list_2_0= ruleOutputConstraint ) )
            	    // InternalCacher.g:943:5: (lv_list_2_0= ruleOutputConstraint )
            	    {
            	    // InternalCacher.g:943:5: (lv_list_2_0= ruleOutputConstraint )
            	    // InternalCacher.g:944:6: lv_list_2_0= ruleOutputConstraint
            	    {

            	    						newCompositeNode(grammarAccess.getOutputConstraintListAccess().getListOutputConstraintParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_list_2_0=ruleOutputConstraint();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOutputConstraintListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"list",
            	    							lv_list_2_0,
            	    							"org.xtext.disim.cacher.Cacher.OutputConstraint");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getOutputConstraintListAccess().getFullStopKeyword_2());
            		

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
    // $ANTLR end "ruleOutputConstraintList"


    // $ANTLR start "entryRuleOutputConstraint"
    // InternalCacher.g:970:1: entryRuleOutputConstraint returns [EObject current=null] : iv_ruleOutputConstraint= ruleOutputConstraint EOF ;
    public final EObject entryRuleOutputConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputConstraint = null;


        try {
            // InternalCacher.g:970:57: (iv_ruleOutputConstraint= ruleOutputConstraint EOF )
            // InternalCacher.g:971:2: iv_ruleOutputConstraint= ruleOutputConstraint EOF
            {
             newCompositeNode(grammarAccess.getOutputConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputConstraint=ruleOutputConstraint();

            state._fsp--;

             current =iv_ruleOutputConstraint; 
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
    // $ANTLR end "entryRuleOutputConstraint"


    // $ANTLR start "ruleOutputConstraint"
    // InternalCacher.g:977:1: ruleOutputConstraint returns [EObject current=null] : ( ( (lv_body_0_0= ruleBodyPart ) ) (otherlv_1= ',' ( (lv_body_2_0= ruleBodyPart ) ) )* ) ;
    public final EObject ruleOutputConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_body_0_0 = null;

        EObject lv_body_2_0 = null;



        	enterRule();

        try {
            // InternalCacher.g:983:2: ( ( ( (lv_body_0_0= ruleBodyPart ) ) (otherlv_1= ',' ( (lv_body_2_0= ruleBodyPart ) ) )* ) )
            // InternalCacher.g:984:2: ( ( (lv_body_0_0= ruleBodyPart ) ) (otherlv_1= ',' ( (lv_body_2_0= ruleBodyPart ) ) )* )
            {
            // InternalCacher.g:984:2: ( ( (lv_body_0_0= ruleBodyPart ) ) (otherlv_1= ',' ( (lv_body_2_0= ruleBodyPart ) ) )* )
            // InternalCacher.g:985:3: ( (lv_body_0_0= ruleBodyPart ) ) (otherlv_1= ',' ( (lv_body_2_0= ruleBodyPart ) ) )*
            {
            // InternalCacher.g:985:3: ( (lv_body_0_0= ruleBodyPart ) )
            // InternalCacher.g:986:4: (lv_body_0_0= ruleBodyPart )
            {
            // InternalCacher.g:986:4: (lv_body_0_0= ruleBodyPart )
            // InternalCacher.g:987:5: lv_body_0_0= ruleBodyPart
            {

            					newCompositeNode(grammarAccess.getOutputConstraintAccess().getBodyBodyPartParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_body_0_0=ruleBodyPart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputConstraintRule());
            					}
            					add(
            						current,
            						"body",
            						lv_body_0_0,
            						"org.xtext.disim.cacher.Cacher.BodyPart");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCacher.g:1004:3: (otherlv_1= ',' ( (lv_body_2_0= ruleBodyPart ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==31) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCacher.g:1005:4: otherlv_1= ',' ( (lv_body_2_0= ruleBodyPart ) )
            	    {
            	    otherlv_1=(Token)match(input,31,FOLLOW_11); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOutputConstraintAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalCacher.g:1009:4: ( (lv_body_2_0= ruleBodyPart ) )
            	    // InternalCacher.g:1010:5: (lv_body_2_0= ruleBodyPart )
            	    {
            	    // InternalCacher.g:1010:5: (lv_body_2_0= ruleBodyPart )
            	    // InternalCacher.g:1011:6: lv_body_2_0= ruleBodyPart
            	    {

            	    						newCompositeNode(grammarAccess.getOutputConstraintAccess().getBodyBodyPartParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_body_2_0=ruleBodyPart();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOutputConstraintRule());
            	    						}
            	    						add(
            	    							current,
            	    							"body",
            	    							lv_body_2_0,
            	    							"org.xtext.disim.cacher.Cacher.BodyPart");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleOutputConstraint"


    // $ANTLR start "entryRuleExternalRefParam"
    // InternalCacher.g:1033:1: entryRuleExternalRefParam returns [EObject current=null] : iv_ruleExternalRefParam= ruleExternalRefParam EOF ;
    public final EObject entryRuleExternalRefParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalRefParam = null;


        try {
            // InternalCacher.g:1033:57: (iv_ruleExternalRefParam= ruleExternalRefParam EOF )
            // InternalCacher.g:1034:2: iv_ruleExternalRefParam= ruleExternalRefParam EOF
            {
             newCompositeNode(grammarAccess.getExternalRefParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalRefParam=ruleExternalRefParam();

            state._fsp--;

             current =iv_ruleExternalRefParam; 
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
    // $ANTLR end "entryRuleExternalRefParam"


    // $ANTLR start "ruleExternalRefParam"
    // InternalCacher.g:1040:1: ruleExternalRefParam returns [EObject current=null] : ( ( (lv_pname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_pval_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleExternalRefParam() throws RecognitionException {
        EObject current = null;

        Token lv_pname_0_0=null;
        Token otherlv_1=null;
        Token lv_pval_2_0=null;


        	enterRule();

        try {
            // InternalCacher.g:1046:2: ( ( ( (lv_pname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_pval_2_0= RULE_STRING ) ) ) )
            // InternalCacher.g:1047:2: ( ( (lv_pname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_pval_2_0= RULE_STRING ) ) )
            {
            // InternalCacher.g:1047:2: ( ( (lv_pname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_pval_2_0= RULE_STRING ) ) )
            // InternalCacher.g:1048:3: ( (lv_pname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_pval_2_0= RULE_STRING ) )
            {
            // InternalCacher.g:1048:3: ( (lv_pname_0_0= RULE_ID ) )
            // InternalCacher.g:1049:4: (lv_pname_0_0= RULE_ID )
            {
            // InternalCacher.g:1049:4: (lv_pname_0_0= RULE_ID )
            // InternalCacher.g:1050:5: lv_pname_0_0= RULE_ID
            {
            lv_pname_0_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_pname_0_0, grammarAccess.getExternalRefParamAccess().getPnameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalRefParamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pname",
            						lv_pname_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalRefParamAccess().getEqualsSignKeyword_1());
            		
            // InternalCacher.g:1070:3: ( (lv_pval_2_0= RULE_STRING ) )
            // InternalCacher.g:1071:4: (lv_pval_2_0= RULE_STRING )
            {
            // InternalCacher.g:1071:4: (lv_pval_2_0= RULE_STRING )
            // InternalCacher.g:1072:5: lv_pval_2_0= RULE_STRING
            {
            lv_pval_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_pval_2_0, grammarAccess.getExternalRefParamAccess().getPvalSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalRefParamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pval",
            						lv_pval_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleExternalRefParam"


    // $ANTLR start "entryRuleExternalRef"
    // InternalCacher.g:1092:1: entryRuleExternalRef returns [EObject current=null] : iv_ruleExternalRef= ruleExternalRef EOF ;
    public final EObject entryRuleExternalRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalRef = null;


        try {
            // InternalCacher.g:1092:52: (iv_ruleExternalRef= ruleExternalRef EOF )
            // InternalCacher.g:1093:2: iv_ruleExternalRef= ruleExternalRef EOF
            {
             newCompositeNode(grammarAccess.getExternalRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalRef=ruleExternalRef();

            state._fsp--;

             current =iv_ruleExternalRef; 
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
    // $ANTLR end "entryRuleExternalRef"


    // $ANTLR start "ruleExternalRef"
    // InternalCacher.g:1099:1: ruleExternalRef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleExternalRefParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExternalRefParam ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleExternalRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;



        	enterRule();

        try {
            // InternalCacher.g:1105:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleExternalRefParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExternalRefParam ) ) )* otherlv_5= ')' )? ) )
            // InternalCacher.g:1106:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleExternalRefParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExternalRefParam ) ) )* otherlv_5= ')' )? )
            {
            // InternalCacher.g:1106:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleExternalRefParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExternalRefParam ) ) )* otherlv_5= ')' )? )
            // InternalCacher.g:1107:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleExternalRefParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExternalRefParam ) ) )* otherlv_5= ')' )?
            {
            // InternalCacher.g:1107:3: ( (otherlv_0= RULE_ID ) )
            // InternalCacher.g:1108:4: (otherlv_0= RULE_ID )
            {
            // InternalCacher.g:1108:4: (otherlv_0= RULE_ID )
            // InternalCacher.g:1109:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalRefRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_0, grammarAccess.getExternalRefAccess().getPartPromptCrossReference_0_0());
            				

            }


            }

            // InternalCacher.g:1120:3: (otherlv_1= '(' ( (lv_params_2_0= ruleExternalRefParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExternalRefParam ) ) )* otherlv_5= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCacher.g:1121:4: otherlv_1= '(' ( (lv_params_2_0= ruleExternalRefParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExternalRefParam ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getExternalRefAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalCacher.g:1125:4: ( (lv_params_2_0= ruleExternalRefParam ) )
                    // InternalCacher.g:1126:5: (lv_params_2_0= ruleExternalRefParam )
                    {
                    // InternalCacher.g:1126:5: (lv_params_2_0= ruleExternalRefParam )
                    // InternalCacher.g:1127:6: lv_params_2_0= ruleExternalRefParam
                    {

                    						newCompositeNode(grammarAccess.getExternalRefAccess().getParamsExternalRefParamParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_params_2_0=ruleExternalRefParam();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalRefRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_2_0,
                    							"org.xtext.disim.cacher.Cacher.ExternalRefParam");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCacher.g:1144:4: (otherlv_3= ',' ( (lv_params_4_0= ruleExternalRefParam ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==31) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalCacher.g:1145:5: otherlv_3= ',' ( (lv_params_4_0= ruleExternalRefParam ) )
                    	    {
                    	    otherlv_3=(Token)match(input,31,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getExternalRefAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalCacher.g:1149:5: ( (lv_params_4_0= ruleExternalRefParam ) )
                    	    // InternalCacher.g:1150:6: (lv_params_4_0= ruleExternalRefParam )
                    	    {
                    	    // InternalCacher.g:1150:6: (lv_params_4_0= ruleExternalRefParam )
                    	    // InternalCacher.g:1151:7: lv_params_4_0= ruleExternalRefParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalRefAccess().getParamsExternalRefParamParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_params_4_0=ruleExternalRefParam();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalRefRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_4_0,
                    	    								"org.xtext.disim.cacher.Cacher.ExternalRefParam");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getExternalRefAccess().getRightParenthesisKeyword_1_3());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleExternalRef"


    // $ANTLR start "entryRuleBodyParam"
    // InternalCacher.g:1178:1: entryRuleBodyParam returns [EObject current=null] : iv_ruleBodyParam= ruleBodyParam EOF ;
    public final EObject entryRuleBodyParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyParam = null;


        try {
            // InternalCacher.g:1178:50: (iv_ruleBodyParam= ruleBodyParam EOF )
            // InternalCacher.g:1179:2: iv_ruleBodyParam= ruleBodyParam EOF
            {
             newCompositeNode(grammarAccess.getBodyParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBodyParam=ruleBodyParam();

            state._fsp--;

             current =iv_ruleBodyParam; 
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
    // $ANTLR end "entryRuleBodyParam"


    // $ANTLR start "ruleBodyParam"
    // InternalCacher.g:1185:1: ruleBodyParam returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_def_2_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleBodyParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_def_2_0=null;


        	enterRule();

        try {
            // InternalCacher.g:1191:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_def_2_0= RULE_STRING ) ) )? ) )
            // InternalCacher.g:1192:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_def_2_0= RULE_STRING ) ) )? )
            {
            // InternalCacher.g:1192:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_def_2_0= RULE_STRING ) ) )? )
            // InternalCacher.g:1193:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_def_2_0= RULE_STRING ) ) )?
            {
            // InternalCacher.g:1193:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCacher.g:1194:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCacher.g:1194:4: (lv_name_0_0= RULE_ID )
            // InternalCacher.g:1195:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_name_0_0, grammarAccess.getBodyParamAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBodyParamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCacher.g:1211:3: (otherlv_1= '=' ( (lv_def_2_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCacher.g:1212:4: otherlv_1= '=' ( (lv_def_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_25); 

                    				newLeafNode(otherlv_1, grammarAccess.getBodyParamAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalCacher.g:1216:4: ( (lv_def_2_0= RULE_STRING ) )
                    // InternalCacher.g:1217:5: (lv_def_2_0= RULE_STRING )
                    {
                    // InternalCacher.g:1217:5: (lv_def_2_0= RULE_STRING )
                    // InternalCacher.g:1218:6: lv_def_2_0= RULE_STRING
                    {
                    lv_def_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_def_2_0, grammarAccess.getBodyParamAccess().getDefSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBodyParamRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"def",
                    							lv_def_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleBodyParam"


    // $ANTLR start "entryRuleBodyPart"
    // InternalCacher.g:1239:1: entryRuleBodyPart returns [EObject current=null] : iv_ruleBodyPart= ruleBodyPart EOF ;
    public final EObject entryRuleBodyPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyPart = null;


        try {
            // InternalCacher.g:1239:49: (iv_ruleBodyPart= ruleBodyPart EOF )
            // InternalCacher.g:1240:2: iv_ruleBodyPart= ruleBodyPart EOF
            {
             newCompositeNode(grammarAccess.getBodyPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBodyPart=ruleBodyPart();

            state._fsp--;

             current =iv_ruleBodyPart; 
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
    // $ANTLR end "entryRuleBodyPart"


    // $ANTLR start "ruleBodyPart"
    // InternalCacher.g:1246:1: ruleBodyPart returns [EObject current=null] : ( ( (lv_content_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleBodyPart() throws RecognitionException {
        EObject current = null;

        Token lv_content_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCacher.g:1252:2: ( ( ( (lv_content_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // InternalCacher.g:1253:2: ( ( (lv_content_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalCacher.g:1253:2: ( ( (lv_content_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalCacher.g:1254:3: ( (lv_content_0_0= RULE_STRING ) )
                    {
                    // InternalCacher.g:1254:3: ( (lv_content_0_0= RULE_STRING ) )
                    // InternalCacher.g:1255:4: (lv_content_0_0= RULE_STRING )
                    {
                    // InternalCacher.g:1255:4: (lv_content_0_0= RULE_STRING )
                    // InternalCacher.g:1256:5: lv_content_0_0= RULE_STRING
                    {
                    lv_content_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_content_0_0, grammarAccess.getBodyPartAccess().getContentSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBodyPartRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"content",
                    						lv_content_0_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCacher.g:1273:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalCacher.g:1273:3: ( (otherlv_1= RULE_ID ) )
                    // InternalCacher.g:1274:4: (otherlv_1= RULE_ID )
                    {
                    // InternalCacher.g:1274:4: (otherlv_1= RULE_ID )
                    // InternalCacher.g:1275:5: otherlv_1= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBodyPartRule());
                    					}
                    				
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_1, grammarAccess.getBodyPartAccess().getParamBodyParamCrossReference_1_0());
                    				

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
    // $ANTLR end "ruleBodyPart"


    // $ANTLR start "rulePromptType"
    // InternalCacher.g:1290:1: rulePromptType returns [Enumerator current=null] : ( (enumLiteral_0= 'natural language' ) | (enumLiteral_1= 'tag based' ) ) ;
    public final Enumerator rulePromptType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCacher.g:1296:2: ( ( (enumLiteral_0= 'natural language' ) | (enumLiteral_1= 'tag based' ) ) )
            // InternalCacher.g:1297:2: ( (enumLiteral_0= 'natural language' ) | (enumLiteral_1= 'tag based' ) )
            {
            // InternalCacher.g:1297:2: ( (enumLiteral_0= 'natural language' ) | (enumLiteral_1= 'tag based' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            else if ( (LA15_0==38) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalCacher.g:1298:3: (enumLiteral_0= 'natural language' )
                    {
                    // InternalCacher.g:1298:3: (enumLiteral_0= 'natural language' )
                    // InternalCacher.g:1299:4: enumLiteral_0= 'natural language'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getPromptTypeAccess().getNLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPromptTypeAccess().getNLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCacher.g:1306:3: (enumLiteral_1= 'tag based' )
                    {
                    // InternalCacher.g:1306:3: (enumLiteral_1= 'tag based' )
                    // InternalCacher.g:1307:4: enumLiteral_1= 'tag based'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getPromptTypeAccess().getTAGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPromptTypeAccess().getTAGEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "rulePromptType"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\1\15\uffff";
    static final String dfa_3s = "\1\13\4\uffff\1\23\1\uffff\1\30\3\uffff\1\31\2\uffff";
    static final String dfa_4s = "\1\34\4\uffff\1\33\1\uffff\1\30\3\uffff\1\32\2\uffff";
    static final String dfa_5s = "\1\uffff\1\12\1\1\1\2\1\3\1\uffff\1\5\1\uffff\1\11\1\10\1\4\1\uffff\1\6\1\7";
    static final String dfa_6s = "\1\1\4\uffff\1\2\1\uffff\1\3\3\uffff\1\0\2\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\2\uffff\1\3\1\4\2\uffff\1\5\2\uffff\1\6\1\uffff\1\7\4\uffff\1\10",
            "",
            "",
            "",
            "",
            "\1\12\7\uffff\1\11",
            "",
            "\1\13",
            "",
            "",
            "",
            "\1\14\1\15",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 85:5: ( ({...}? => ( ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'Use' ( (lv_usedPrompts_6_0= ruleUsedPromptsList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'Accepts' ( (lv_bodyParams_8_0= ruleBodyParamsList ) ) otherlv_9= 'as' otherlv_10= 'parameters' otherlv_11= '.' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'The' otherlv_13= 'given' otherlv_14= 'context' otherlv_15= 'is' ( (lv_context_16_0= ruleContext ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'My' otherlv_18= 'problem' otherlv_19= 'is' ( (lv_request_20_0= ruleRequest ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'You' otherlv_22= 'must' otherlv_23= ':' ( (lv_posConst_24_0= ruleConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'You' otherlv_26= 'must' otherlv_27= 'not' otherlv_28= ':' ( (lv_negConst_29_0= ruleConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'The' otherlv_31= 'output' otherlv_32= 'must' otherlv_33= ':' ( (lv_dataPresent_34_0= ruleOutputConstraintList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'Generate' otherlv_36= 'a' ( (lv_promptType_37_0= rulePromptType ) ) otherlv_38= 'prompt' otherlv_39= '.' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_11 = input.LA(1);

                         
                        int index1_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA1_11 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 5) ) {s = 12;}

                        else if ( LA1_11 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 6) ) {s = 13;}

                         
                        input.seek(index1_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_0 = input.LA(1);

                         
                        int index1_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_0==EOF) ) {s = 1;}

                        else if ( LA1_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA1_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( LA1_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA1_0 == 18 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 7) ) ) {s = 5;}

                        else if ( LA1_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 4) ) {s = 6;}

                        else if ( LA1_0 == 23 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 5) ) ) {s = 7;}

                        else if ( LA1_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 8) ) {s = 8;}

                         
                        input.seek(index1_0);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_5 = input.LA(1);

                         
                        int index1_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA1_5 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 7) ) {s = 9;}

                        else if ( LA1_5 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 3) ) {s = 10;}

                         
                        input.seek(index1_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_7 = input.LA(1);

                         
                        int index1_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA1_7 == 24 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getPromptAccess().getUnorderedGroup(), 5) ) ) {s = 11;}

                         
                        input.seek(index1_7);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010A4C802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000002L});

}
