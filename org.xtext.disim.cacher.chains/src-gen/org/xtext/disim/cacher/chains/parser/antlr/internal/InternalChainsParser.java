package org.xtext.disim.cacher.chains.parser.antlr.internal;

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
import org.xtext.disim.cacher.chains.services.ChainsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalChainsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'This'", "'is'", "'.'", "'Chain'", "'these'", "'prompts'", "':'", "'Generate'", "'all'", "'using'", "','", "'='", "'('", "')'", "'none'", "'natural language'", "'tag based'"
    };
    public static final int RULE_STRING=5;
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
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalChainsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalChainsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalChainsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalChains.g"; }



     	private ChainsGrammarAccess grammarAccess;

        public InternalChainsParser(TokenStream input, ChainsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Chain";
       	}

       	@Override
       	protected ChainsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleChain"
    // InternalChains.g:65:1: entryRuleChain returns [EObject current=null] : iv_ruleChain= ruleChain EOF ;
    public final EObject entryRuleChain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChain = null;


        try {
            // InternalChains.g:65:46: (iv_ruleChain= ruleChain EOF )
            // InternalChains.g:66:2: iv_ruleChain= ruleChain EOF
            {
             newCompositeNode(grammarAccess.getChainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChain=ruleChain();

            state._fsp--;

             current =iv_ruleChain; 
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
    // $ANTLR end "entryRuleChain"


    // $ANTLR start "ruleChain"
    // InternalChains.g:72:1: ruleChain returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'Chain' otherlv_6= 'these' otherlv_7= 'prompts' otherlv_8= ':' ( (lv_chain_9_0= rulePromptChain ) ) ) (otherlv_10= 'Generate' otherlv_11= 'all' otherlv_12= 'using' ( (lv_chainType_13_0= ruleChainType ) ) otherlv_14= 'prompts' otherlv_15= '.' )? ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleChain() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_chain_9_0 = null;

        Enumerator lv_chainType_13_0 = null;



        	enterRule();

        try {
            // InternalChains.g:78:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'Chain' otherlv_6= 'these' otherlv_7= 'prompts' otherlv_8= ':' ( (lv_chain_9_0= rulePromptChain ) ) ) (otherlv_10= 'Generate' otherlv_11= 'all' otherlv_12= 'using' ( (lv_chainType_13_0= ruleChainType ) ) otherlv_14= 'prompts' otherlv_15= '.' )? ) ) ) ) )+ {...}?) ) ) )
            // InternalChains.g:79:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'Chain' otherlv_6= 'these' otherlv_7= 'prompts' otherlv_8= ':' ( (lv_chain_9_0= rulePromptChain ) ) ) (otherlv_10= 'Generate' otherlv_11= 'all' otherlv_12= 'using' ( (lv_chainType_13_0= ruleChainType ) ) otherlv_14= 'prompts' otherlv_15= '.' )? ) ) ) ) )+ {...}?) ) )
            {
            // InternalChains.g:79:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'Chain' otherlv_6= 'these' otherlv_7= 'prompts' otherlv_8= ':' ( (lv_chain_9_0= rulePromptChain ) ) ) (otherlv_10= 'Generate' otherlv_11= 'all' otherlv_12= 'using' ( (lv_chainType_13_0= ruleChainType ) ) otherlv_14= 'prompts' otherlv_15= '.' )? ) ) ) ) )+ {...}?) ) )
            // InternalChains.g:80:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'Chain' otherlv_6= 'these' otherlv_7= 'prompts' otherlv_8= ':' ( (lv_chain_9_0= rulePromptChain ) ) ) (otherlv_10= 'Generate' otherlv_11= 'all' otherlv_12= 'using' ( (lv_chainType_13_0= ruleChainType ) ) otherlv_14= 'prompts' otherlv_15= '.' )? ) ) ) ) )+ {...}?) )
            {
            // InternalChains.g:80:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'Chain' otherlv_6= 'these' otherlv_7= 'prompts' otherlv_8= ':' ( (lv_chain_9_0= rulePromptChain ) ) ) (otherlv_10= 'Generate' otherlv_11= 'all' otherlv_12= 'using' ( (lv_chainType_13_0= ruleChainType ) ) otherlv_14= 'prompts' otherlv_15= '.' )? ) ) ) ) )+ {...}?) )
            // InternalChains.g:81:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'Chain' otherlv_6= 'these' otherlv_7= 'prompts' otherlv_8= ':' ( (lv_chain_9_0= rulePromptChain ) ) ) (otherlv_10= 'Generate' otherlv_11= 'all' otherlv_12= 'using' ( (lv_chainType_13_0= ruleChainType ) ) otherlv_14= 'prompts' otherlv_15= '.' )? ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getChainAccess().getUnorderedGroup());
            			
            // InternalChains.g:84:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'Chain' otherlv_6= 'these' otherlv_7= 'prompts' otherlv_8= ':' ( (lv_chain_9_0= rulePromptChain ) ) ) (otherlv_10= 'Generate' otherlv_11= 'all' otherlv_12= 'using' ( (lv_chainType_13_0= ruleChainType ) ) otherlv_14= 'prompts' otherlv_15= '.' )? ) ) ) ) )+ {...}?)
            // InternalChains.g:85:5: ( ({...}? => ( ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'Chain' otherlv_6= 'these' otherlv_7= 'prompts' otherlv_8= ':' ( (lv_chain_9_0= rulePromptChain ) ) ) (otherlv_10= 'Generate' otherlv_11= 'all' otherlv_12= 'using' ( (lv_chainType_13_0= ruleChainType ) ) otherlv_14= 'prompts' otherlv_15= '.' )? ) ) ) ) )+ {...}?
            {
            // InternalChains.g:85:5: ( ({...}? => ( ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= 'Chain' otherlv_6= 'these' otherlv_7= 'prompts' otherlv_8= ':' ( (lv_chain_9_0= rulePromptChain ) ) ) (otherlv_10= 'Generate' otherlv_11= 'all' otherlv_12= 'using' ( (lv_chainType_13_0= ruleChainType ) ) otherlv_14= 'prompts' otherlv_15= '.' )? ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( LA2_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getChainAccess().getUnorderedGroup(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getChainAccess().getUnorderedGroup(), 1) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalChains.g:86:3: ({...}? => ( ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) ) ) )
            	    {
            	    // InternalChains.g:86:3: ({...}? => ( ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) ) ) )
            	    // InternalChains.g:87:4: {...}? => ( ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getChainAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleChain", "getUnorderedGroupHelper().canSelect(grammarAccess.getChainAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalChains.g:87:99: ( ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) ) )
            	    // InternalChains.g:88:5: ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getChainAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalChains.g:91:8: ({...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' ) )
            	    // InternalChains.g:91:9: {...}? => (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleChain", "true");
            	    }
            	    // InternalChains.g:91:18: (otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.' )
            	    // InternalChains.g:91:19: otherlv_1= 'This' otherlv_2= 'is' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '.'
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getChainAccess().getThisKeyword_0_0());
            	    							
            	    otherlv_2=(Token)match(input,12,FOLLOW_4); 

            	    								newLeafNode(otherlv_2, grammarAccess.getChainAccess().getIsKeyword_0_1());
            	    							
            	    // InternalChains.g:99:8: ( (lv_name_3_0= RULE_ID ) )
            	    // InternalChains.g:100:9: (lv_name_3_0= RULE_ID )
            	    {
            	    // InternalChains.g:100:9: (lv_name_3_0= RULE_ID )
            	    // InternalChains.g:101:10: lv_name_3_0= RULE_ID
            	    {
            	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    										newLeafNode(lv_name_3_0, grammarAccess.getChainAccess().getNameIDTerminalRuleCall_0_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getChainRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"name",
            	    											lv_name_3_0,
            	    											"org.eclipse.xtext.common.Terminals.ID");
            	    									

            	    }


            	    }

            	    otherlv_4=(Token)match(input,13,FOLLOW_6); 

            	    								newLeafNode(otherlv_4, grammarAccess.getChainAccess().getFullStopKeyword_0_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getChainAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalChains.g:127:3: ({...}? => ( ({...}? => ( (otherlv_5= 'Chain' otherlv_6= 'these' otherlv_7= 'prompts' otherlv_8= ':' ( (lv_chain_9_0= rulePromptChain ) ) ) (otherlv_10= 'Generate' otherlv_11= 'all' otherlv_12= 'using' ( (lv_chainType_13_0= ruleChainType ) ) otherlv_14= 'prompts' otherlv_15= '.' )? ) ) ) )
            	    {
            	    // InternalChains.g:127:3: ({...}? => ( ({...}? => ( (otherlv_5= 'Chain' otherlv_6= 'these' otherlv_7= 'prompts' otherlv_8= ':' ( (lv_chain_9_0= rulePromptChain ) ) ) (otherlv_10= 'Generate' otherlv_11= 'all' otherlv_12= 'using' ( (lv_chainType_13_0= ruleChainType ) ) otherlv_14= 'prompts' otherlv_15= '.' )? ) ) ) )
            	    // InternalChains.g:128:4: {...}? => ( ({...}? => ( (otherlv_5= 'Chain' otherlv_6= 'these' otherlv_7= 'prompts' otherlv_8= ':' ( (lv_chain_9_0= rulePromptChain ) ) ) (otherlv_10= 'Generate' otherlv_11= 'all' otherlv_12= 'using' ( (lv_chainType_13_0= ruleChainType ) ) otherlv_14= 'prompts' otherlv_15= '.' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getChainAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleChain", "getUnorderedGroupHelper().canSelect(grammarAccess.getChainAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalChains.g:128:99: ( ({...}? => ( (otherlv_5= 'Chain' otherlv_6= 'these' otherlv_7= 'prompts' otherlv_8= ':' ( (lv_chain_9_0= rulePromptChain ) ) ) (otherlv_10= 'Generate' otherlv_11= 'all' otherlv_12= 'using' ( (lv_chainType_13_0= ruleChainType ) ) otherlv_14= 'prompts' otherlv_15= '.' )? ) ) )
            	    // InternalChains.g:129:5: ({...}? => ( (otherlv_5= 'Chain' otherlv_6= 'these' otherlv_7= 'prompts' otherlv_8= ':' ( (lv_chain_9_0= rulePromptChain ) ) ) (otherlv_10= 'Generate' otherlv_11= 'all' otherlv_12= 'using' ( (lv_chainType_13_0= ruleChainType ) ) otherlv_14= 'prompts' otherlv_15= '.' )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getChainAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalChains.g:132:8: ({...}? => ( (otherlv_5= 'Chain' otherlv_6= 'these' otherlv_7= 'prompts' otherlv_8= ':' ( (lv_chain_9_0= rulePromptChain ) ) ) (otherlv_10= 'Generate' otherlv_11= 'all' otherlv_12= 'using' ( (lv_chainType_13_0= ruleChainType ) ) otherlv_14= 'prompts' otherlv_15= '.' )? ) )
            	    // InternalChains.g:132:9: {...}? => ( (otherlv_5= 'Chain' otherlv_6= 'these' otherlv_7= 'prompts' otherlv_8= ':' ( (lv_chain_9_0= rulePromptChain ) ) ) (otherlv_10= 'Generate' otherlv_11= 'all' otherlv_12= 'using' ( (lv_chainType_13_0= ruleChainType ) ) otherlv_14= 'prompts' otherlv_15= '.' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleChain", "true");
            	    }
            	    // InternalChains.g:132:18: ( (otherlv_5= 'Chain' otherlv_6= 'these' otherlv_7= 'prompts' otherlv_8= ':' ( (lv_chain_9_0= rulePromptChain ) ) ) (otherlv_10= 'Generate' otherlv_11= 'all' otherlv_12= 'using' ( (lv_chainType_13_0= ruleChainType ) ) otherlv_14= 'prompts' otherlv_15= '.' )? )
            	    // InternalChains.g:132:19: (otherlv_5= 'Chain' otherlv_6= 'these' otherlv_7= 'prompts' otherlv_8= ':' ( (lv_chain_9_0= rulePromptChain ) ) ) (otherlv_10= 'Generate' otherlv_11= 'all' otherlv_12= 'using' ( (lv_chainType_13_0= ruleChainType ) ) otherlv_14= 'prompts' otherlv_15= '.' )?
            	    {
            	    // InternalChains.g:132:19: (otherlv_5= 'Chain' otherlv_6= 'these' otherlv_7= 'prompts' otherlv_8= ':' ( (lv_chain_9_0= rulePromptChain ) ) )
            	    // InternalChains.g:133:9: otherlv_5= 'Chain' otherlv_6= 'these' otherlv_7= 'prompts' otherlv_8= ':' ( (lv_chain_9_0= rulePromptChain ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_7); 

            	    									newLeafNode(otherlv_5, grammarAccess.getChainAccess().getChainKeyword_1_0_0());
            	    								
            	    otherlv_6=(Token)match(input,15,FOLLOW_8); 

            	    									newLeafNode(otherlv_6, grammarAccess.getChainAccess().getTheseKeyword_1_0_1());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_9); 

            	    									newLeafNode(otherlv_7, grammarAccess.getChainAccess().getPromptsKeyword_1_0_2());
            	    								
            	    otherlv_8=(Token)match(input,17,FOLLOW_4); 

            	    									newLeafNode(otherlv_8, grammarAccess.getChainAccess().getColonKeyword_1_0_3());
            	    								
            	    // InternalChains.g:149:9: ( (lv_chain_9_0= rulePromptChain ) )
            	    // InternalChains.g:150:10: (lv_chain_9_0= rulePromptChain )
            	    {
            	    // InternalChains.g:150:10: (lv_chain_9_0= rulePromptChain )
            	    // InternalChains.g:151:11: lv_chain_9_0= rulePromptChain
            	    {

            	    											newCompositeNode(grammarAccess.getChainAccess().getChainPromptChainParserRuleCall_1_0_4_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_chain_9_0=rulePromptChain();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getChainRule());
            	    											}
            	    											set(
            	    												current,
            	    												"chain",
            	    												lv_chain_9_0,
            	    												"org.xtext.disim.cacher.chains.Chains.PromptChain");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }

            	    // InternalChains.g:169:8: (otherlv_10= 'Generate' otherlv_11= 'all' otherlv_12= 'using' ( (lv_chainType_13_0= ruleChainType ) ) otherlv_14= 'prompts' otherlv_15= '.' )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==18) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalChains.g:170:9: otherlv_10= 'Generate' otherlv_11= 'all' otherlv_12= 'using' ( (lv_chainType_13_0= ruleChainType ) ) otherlv_14= 'prompts' otherlv_15= '.'
            	            {
            	            otherlv_10=(Token)match(input,18,FOLLOW_11); 

            	            									newLeafNode(otherlv_10, grammarAccess.getChainAccess().getGenerateKeyword_1_1_0());
            	            								
            	            otherlv_11=(Token)match(input,19,FOLLOW_12); 

            	            									newLeafNode(otherlv_11, grammarAccess.getChainAccess().getAllKeyword_1_1_1());
            	            								
            	            otherlv_12=(Token)match(input,20,FOLLOW_13); 

            	            									newLeafNode(otherlv_12, grammarAccess.getChainAccess().getUsingKeyword_1_1_2());
            	            								
            	            // InternalChains.g:182:9: ( (lv_chainType_13_0= ruleChainType ) )
            	            // InternalChains.g:183:10: (lv_chainType_13_0= ruleChainType )
            	            {
            	            // InternalChains.g:183:10: (lv_chainType_13_0= ruleChainType )
            	            // InternalChains.g:184:11: lv_chainType_13_0= ruleChainType
            	            {

            	            											newCompositeNode(grammarAccess.getChainAccess().getChainTypeChainTypeEnumRuleCall_1_1_3_0());
            	            										
            	            pushFollow(FOLLOW_8);
            	            lv_chainType_13_0=ruleChainType();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getChainRule());
            	            											}
            	            											set(
            	            												current,
            	            												"chainType",
            	            												lv_chainType_13_0,
            	            												"org.xtext.disim.cacher.chains.Chains.ChainType");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }

            	            otherlv_14=(Token)match(input,16,FOLLOW_5); 

            	            									newLeafNode(otherlv_14, grammarAccess.getChainAccess().getPromptsKeyword_1_1_4());
            	            								
            	            otherlv_15=(Token)match(input,13,FOLLOW_6); 

            	            									newLeafNode(otherlv_15, grammarAccess.getChainAccess().getFullStopKeyword_1_1_5());
            	            								

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getChainAccess().getUnorderedGroup());
            	    				

            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getChainAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleChain", "getUnorderedGroupHelper().canLeave(grammarAccess.getChainAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getChainAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "ruleChain"


    // $ANTLR start "entryRulePromptChain"
    // InternalChains.g:227:1: entryRulePromptChain returns [EObject current=null] : iv_rulePromptChain= rulePromptChain EOF ;
    public final EObject entryRulePromptChain() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePromptChain = null;


        try {
            // InternalChains.g:227:52: (iv_rulePromptChain= rulePromptChain EOF )
            // InternalChains.g:228:2: iv_rulePromptChain= rulePromptChain EOF
            {
             newCompositeNode(grammarAccess.getPromptChainRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePromptChain=rulePromptChain();

            state._fsp--;

             current =iv_rulePromptChain; 
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
    // $ANTLR end "entryRulePromptChain"


    // $ANTLR start "rulePromptChain"
    // InternalChains.g:234:1: rulePromptChain returns [EObject current=null] : ( ( (lv_list_0_0= ruleExternalRef ) ) (otherlv_1= ',' ( (lv_list_2_0= ruleExternalRef ) ) )* otherlv_3= '.' ) ;
    public final EObject rulePromptChain() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_list_0_0 = null;

        EObject lv_list_2_0 = null;



        	enterRule();

        try {
            // InternalChains.g:240:2: ( ( ( (lv_list_0_0= ruleExternalRef ) ) (otherlv_1= ',' ( (lv_list_2_0= ruleExternalRef ) ) )* otherlv_3= '.' ) )
            // InternalChains.g:241:2: ( ( (lv_list_0_0= ruleExternalRef ) ) (otherlv_1= ',' ( (lv_list_2_0= ruleExternalRef ) ) )* otherlv_3= '.' )
            {
            // InternalChains.g:241:2: ( ( (lv_list_0_0= ruleExternalRef ) ) (otherlv_1= ',' ( (lv_list_2_0= ruleExternalRef ) ) )* otherlv_3= '.' )
            // InternalChains.g:242:3: ( (lv_list_0_0= ruleExternalRef ) ) (otherlv_1= ',' ( (lv_list_2_0= ruleExternalRef ) ) )* otherlv_3= '.'
            {
            // InternalChains.g:242:3: ( (lv_list_0_0= ruleExternalRef ) )
            // InternalChains.g:243:4: (lv_list_0_0= ruleExternalRef )
            {
            // InternalChains.g:243:4: (lv_list_0_0= ruleExternalRef )
            // InternalChains.g:244:5: lv_list_0_0= ruleExternalRef
            {

            					newCompositeNode(grammarAccess.getPromptChainAccess().getListExternalRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_list_0_0=ruleExternalRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPromptChainRule());
            					}
            					add(
            						current,
            						"list",
            						lv_list_0_0,
            						"org.xtext.disim.cacher.chains.Chains.ExternalRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalChains.g:261:3: (otherlv_1= ',' ( (lv_list_2_0= ruleExternalRef ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalChains.g:262:4: otherlv_1= ',' ( (lv_list_2_0= ruleExternalRef ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getPromptChainAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalChains.g:266:4: ( (lv_list_2_0= ruleExternalRef ) )
            	    // InternalChains.g:267:5: (lv_list_2_0= ruleExternalRef )
            	    {
            	    // InternalChains.g:267:5: (lv_list_2_0= ruleExternalRef )
            	    // InternalChains.g:268:6: lv_list_2_0= ruleExternalRef
            	    {

            	    						newCompositeNode(grammarAccess.getPromptChainAccess().getListExternalRefParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_list_2_0=ruleExternalRef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPromptChainRule());
            	    						}
            	    						add(
            	    							current,
            	    							"list",
            	    							lv_list_2_0,
            	    							"org.xtext.disim.cacher.chains.Chains.ExternalRef");
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

            			newLeafNode(otherlv_3, grammarAccess.getPromptChainAccess().getFullStopKeyword_2());
            		

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
    // $ANTLR end "rulePromptChain"


    // $ANTLR start "entryRuleExternalRefParam"
    // InternalChains.g:294:1: entryRuleExternalRefParam returns [EObject current=null] : iv_ruleExternalRefParam= ruleExternalRefParam EOF ;
    public final EObject entryRuleExternalRefParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalRefParam = null;


        try {
            // InternalChains.g:294:57: (iv_ruleExternalRefParam= ruleExternalRefParam EOF )
            // InternalChains.g:295:2: iv_ruleExternalRefParam= ruleExternalRefParam EOF
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
    // InternalChains.g:301:1: ruleExternalRefParam returns [EObject current=null] : ( ( (lv_pname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_pval_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleExternalRefParam() throws RecognitionException {
        EObject current = null;

        Token lv_pname_0_0=null;
        Token otherlv_1=null;
        Token lv_pval_2_0=null;


        	enterRule();

        try {
            // InternalChains.g:307:2: ( ( ( (lv_pname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_pval_2_0= RULE_STRING ) ) ) )
            // InternalChains.g:308:2: ( ( (lv_pname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_pval_2_0= RULE_STRING ) ) )
            {
            // InternalChains.g:308:2: ( ( (lv_pname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_pval_2_0= RULE_STRING ) ) )
            // InternalChains.g:309:3: ( (lv_pname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_pval_2_0= RULE_STRING ) )
            {
            // InternalChains.g:309:3: ( (lv_pname_0_0= RULE_ID ) )
            // InternalChains.g:310:4: (lv_pname_0_0= RULE_ID )
            {
            // InternalChains.g:310:4: (lv_pname_0_0= RULE_ID )
            // InternalChains.g:311:5: lv_pname_0_0= RULE_ID
            {
            lv_pname_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            otherlv_1=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalRefParamAccess().getEqualsSignKeyword_1());
            		
            // InternalChains.g:331:3: ( (lv_pval_2_0= RULE_STRING ) )
            // InternalChains.g:332:4: (lv_pval_2_0= RULE_STRING )
            {
            // InternalChains.g:332:4: (lv_pval_2_0= RULE_STRING )
            // InternalChains.g:333:5: lv_pval_2_0= RULE_STRING
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
    // InternalChains.g:353:1: entryRuleExternalRef returns [EObject current=null] : iv_ruleExternalRef= ruleExternalRef EOF ;
    public final EObject entryRuleExternalRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalRef = null;


        try {
            // InternalChains.g:353:52: (iv_ruleExternalRef= ruleExternalRef EOF )
            // InternalChains.g:354:2: iv_ruleExternalRef= ruleExternalRef EOF
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
    // InternalChains.g:360:1: ruleExternalRef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleExternalRefParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExternalRefParam ) ) )* otherlv_5= ')' )? ) ;
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
            // InternalChains.g:366:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleExternalRefParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExternalRefParam ) ) )* otherlv_5= ')' )? ) )
            // InternalChains.g:367:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleExternalRefParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExternalRefParam ) ) )* otherlv_5= ')' )? )
            {
            // InternalChains.g:367:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleExternalRefParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExternalRefParam ) ) )* otherlv_5= ')' )? )
            // InternalChains.g:368:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleExternalRefParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExternalRefParam ) ) )* otherlv_5= ')' )?
            {
            // InternalChains.g:368:3: ( (otherlv_0= RULE_ID ) )
            // InternalChains.g:369:4: (otherlv_0= RULE_ID )
            {
            // InternalChains.g:369:4: (otherlv_0= RULE_ID )
            // InternalChains.g:370:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalRefRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_0, grammarAccess.getExternalRefAccess().getPartPromptCrossReference_0_0());
            				

            }


            }

            // InternalChains.g:381:3: (otherlv_1= '(' ( (lv_params_2_0= ruleExternalRefParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExternalRefParam ) ) )* otherlv_5= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalChains.g:382:4: otherlv_1= '(' ( (lv_params_2_0= ruleExternalRefParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExternalRefParam ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getExternalRefAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalChains.g:386:4: ( (lv_params_2_0= ruleExternalRefParam ) )
                    // InternalChains.g:387:5: (lv_params_2_0= ruleExternalRefParam )
                    {
                    // InternalChains.g:387:5: (lv_params_2_0= ruleExternalRefParam )
                    // InternalChains.g:388:6: lv_params_2_0= ruleExternalRefParam
                    {

                    						newCompositeNode(grammarAccess.getExternalRefAccess().getParamsExternalRefParamParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_params_2_0=ruleExternalRefParam();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalRefRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_2_0,
                    							"org.xtext.disim.cacher.chains.Chains.ExternalRefParam");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalChains.g:405:4: (otherlv_3= ',' ( (lv_params_4_0= ruleExternalRefParam ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==21) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalChains.g:406:5: otherlv_3= ',' ( (lv_params_4_0= ruleExternalRefParam ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getExternalRefAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalChains.g:410:5: ( (lv_params_4_0= ruleExternalRefParam ) )
                    	    // InternalChains.g:411:6: (lv_params_4_0= ruleExternalRefParam )
                    	    {
                    	    // InternalChains.g:411:6: (lv_params_4_0= ruleExternalRefParam )
                    	    // InternalChains.g:412:7: lv_params_4_0= ruleExternalRefParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalRefAccess().getParamsExternalRefParamParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_params_4_0=ruleExternalRefParam();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalRefRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_4_0,
                    	    								"org.xtext.disim.cacher.chains.Chains.ExternalRefParam");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,24,FOLLOW_2); 

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


    // $ANTLR start "ruleChainType"
    // InternalChains.g:439:1: ruleChainType returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'natural language' ) | (enumLiteral_2= 'tag based' ) ) ;
    public final Enumerator ruleChainType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalChains.g:445:2: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'natural language' ) | (enumLiteral_2= 'tag based' ) ) )
            // InternalChains.g:446:2: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'natural language' ) | (enumLiteral_2= 'tag based' ) )
            {
            // InternalChains.g:446:2: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'natural language' ) | (enumLiteral_2= 'tag based' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt6=1;
                }
                break;
            case 26:
                {
                alt6=2;
                }
                break;
            case 27:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalChains.g:447:3: (enumLiteral_0= 'none' )
                    {
                    // InternalChains.g:447:3: (enumLiteral_0= 'none' )
                    // InternalChains.g:448:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getChainTypeAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getChainTypeAccess().getNONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalChains.g:455:3: (enumLiteral_1= 'natural language' )
                    {
                    // InternalChains.g:455:3: (enumLiteral_1= 'natural language' )
                    // InternalChains.g:456:4: enumLiteral_1= 'natural language'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getChainTypeAccess().getNLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getChainTypeAccess().getNLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalChains.g:463:3: (enumLiteral_2= 'tag based' )
                    {
                    // InternalChains.g:463:3: (enumLiteral_2= 'tag based' )
                    // InternalChains.g:464:4: enumLiteral_2= 'tag based'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getChainTypeAccess().getTAGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getChainTypeAccess().getTAGEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleChainType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000044802L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001200000L});

}
