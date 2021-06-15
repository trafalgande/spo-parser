i
public class CustomParser {
    public static void main(String[] args) {
       CustomParser customParser = new CustomParser(System.in);
       try {
           ASTStart root = customParser.Start();
           root.dump("");
           JsonDTO jsonDTO = new JsonDTO();
           com.google.gson.Gson gson = new com.google.gson.Gson();
           for(int i = 0; i < root.jjtGetNumChildren(); i++) {
               Node current = root.jjtGetChild(i);
                   if (current.toString().contains(":")) {
                       String[] split = current.toString().split(":");
                       switch (split[0]) {
                              case "Command" : {
                                  jsonDTO.setCmd(split[1].trim());
                                  break;
                              }
                              case "Param" : {
                                  jsonDTO.setParam(split[1].trim());
                                  break;
                              }
                              case "Path" : {
                                  jsonDTO.setPath(split[1].trim());
                                  break;
                              }
                              case "New Element" : {
                                  jsonDTO.setNelem(split[1].trim());
                                  break;
                              }
                          }
                   }
                   if (current.jjtGetNumChildren() > 0) {
                   for(int j = 0; j < current.jjtGetNumChildren(); j++) {
                       Node subCurrent = current.jjtGetChild(j);
                       if (subCurrent.jjtGetNumChildren() > 0) {
                           for(int k = 0; k < subCurrent.jjtGetNumChildren(); k++) {
                               Node subSubCurrent = subCurrent.jjtGetChild(k);
                                if (subSubCurrent.toString().contains(":")) {
                                  String[] split = subSubCurrent.toString().split(":");
                                  switch (split[0]) {
                                      case "Sign" : {
                                          jsonDTO.setSign(split[1].trim());
                                          break;
                                      }
                                      case "Right Item" : {
                                          jsonDTO.setRight(split[1].trim());
                                          break;
                                      }
                                  }
                              }
                           }
                       }
                   }
               }
           }
           String json = gson.toJson(jsonDTO);
          System.out.println(json);
       } catch (Exception e) {
         System.out.println(e.getMessage());
         e.printStackTrace();
       }
    ASTStart Start() {
 ASTStart jjtThis = new ASTStart();


Input()/*seq*/
/*seq*/
 return jjtThis; 

}
void Input() {
 
Command()/*seq*/
if (/*?*/i0()) {DirOrNode()}/*seq*/
Path()/*seq*/
if (/*?*/i1()) {NewElement()}/*seq*/
if (/*?*/i2()) {Condition()}
}
void Path() {
 ASTPath jjtThis = new ASTPath();

Token t;
t = getToken(1);/*seq*/
jjtThis.setName(t.image);

}
void DirOrNode() {
 ASTDirOrNode jjtThis = new ASTDirOrNode();

Token t;
t = getToken(1);/*seq*/
jjtThis.setName(t.image);

}
void Command() {
 ASTCommand jjtThis = new ASTCommand();

Token t;
t = getToken(1);/*seq*/
jjtThis.setName(t.image);

}
void Condition() {
 ASTCondition jjtThis = new ASTCondition();


/*seq*/
while (/* +* */i4()) {SubCondition()/*seq*/
if (/*?*/i3()) {AndOr()/*seq*/
SubCondition()}}/*seq*/


}
void SubCondition() {
 ASTSubCondition jjtThis = new ASTSubCondition();


/*seq*/
CompareSign()/*seq*/
ConditionItem()

}
void ConditionItem() {
 ASTConditionItem jjtThis = new ASTConditionItem();

Token t;
t = getToken(1);/*seq*/
jjtThis.setName(t.image);

}
void CompareSign() {
 ASTCompareSign jjtThis = new ASTCompareSign();

Token t;
t = getToken(1);/*seq*/
jjtThis.setName(t.image);

}
void AndOr() {
 ASTAndOr jjtThis = new ASTAndOr();

Token t;
t = getToken(1);/*seq*/
jjtThis.setName(t.image);

}
void NewElement() {
 ASTNewElement jjtThis = new ASTNewElement();

Token t;
t = getToken(1);/*seq*/
/*seq*/
jjtThis.setName(t.next.image);

}}                        /** Only available in JJTree grammars. */
protected JJTCustomParserState jjtree = new JJTCustomParserState();

                        /**
                         * Returns the token at the given index (0 means last consumed token, 1 is the token just in front of us). 
                         */
                        final public Token getToken(int index) {}

                        /** @deprecated Use {@link #getToken(int) getToken(0)} */
                        @Deprecated
                        public Token token;
                        /* Returns the next token. */
                        @Deprecated
                        final public Token getNextToken() {}

                        /** Generate a parse exception. */
                        public ParseException generateParseException() {}

                        public void ReInit(CustomParserTokenManager tm) {}

                        /** Generated Token Manager. */
                        public CustomParserTokenManager token_source;

                        /* This is hidden, as it's the internals of the parser.
                        public Token jj_nt;
                        private Token jj_scanpos, jj_lastpos;
                        private int jj_la;
                        private int jj_gen;
                        final private int[] jj_la1 = new int[75];
                        static private int[] jj_la1_0;
                        static private int[] jj_la1_1;
                        static private int[] jj_la1_2;
                        static private int[] jj_la1_3;
                        private static void jj_la1_init_0() {}
                        private static void jj_la1_init_1() {}
                        private static void jj_la1_init_2() {}
                        private static void jj_la1_init_3() {}
                        final private JJCalls[] jj_2_rtns = new JJCalls[5];
                        private boolean jj_rescan = false;
                        private int jj_gc = 0;

                        final private LookaheadSuccess jj_ls = new LookaheadSuccess();
                        private boolean jj_scan_token(int kind) {}
                        private Token jj_consume_token(int kind) throws ParseException {}

                        private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
                        private int[] jj_expentry;
                        private int jj_kind = -1;
                        private int[] jj_lasttokens = new int[100];
                        private int jj_endpos;

                        private void jj_save(int indices, int xla) {}
                        private void jj_rescan_token() {}

                        private void jj_add_error_token(int kind, int pos) {}
                        static private final class LookaheadSuccess extends java.lang.Error { }

                        static final class JJCalls {
                            int gen;
                            Token first;
                            int arg;
                            JJCalls next;
                        }
                        */}