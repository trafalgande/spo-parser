/* Generated By:JJTree&JavaCC: Do not edit this line. CustomParser.java */
public class CustomParser/*@bgen(jjtree)*/implements CustomParserTreeConstants, CustomParserConstants {/*@bgen(jjtree)*/
  protected static JJTCustomParserState jjtree = new JJTCustomParserState();public static void main(String[] args) {
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
    }

  static final public ASTStart Start() throws ParseException {
                           /*@bgen(jjtree) Start */
  ASTStart jjtn000 = new ASTStart(JJTSTART);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      Input();
      jj_consume_token(EOL);
    jjtree.closeNodeScope(jjtn000, true);
    jjtc000 = false;
    {if (true) return jjtn000;}
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
    throw new Error("Missing return statement in function");
  }

  static final public void Input() throws ParseException {
    Command();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case DIR_OR_NODE:
      DirOrNode();
      break;
    default:
      jj_la1[0] = jj_gen;
      ;
    }
    Path();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 19:
      NewElement();
      break;
    default:
      jj_la1[1] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 17:
      Condition();
      break;
    default:
      jj_la1[2] = jj_gen;
      ;
    }
  }

  static final public void Path() throws ParseException {
                     /*@bgen(jjtree) Path */
                     ASTPath jjtn000 = new ASTPath(JJTPATH);
                     boolean jjtc000 = true;
                     jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(PATH);
               jjtree.closeNodeScope(jjtn000, true);
               jjtc000 = false;
              jjtn000.setName(t.image);
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  static final public void DirOrNode() throws ParseException {
                               /*@bgen(jjtree) DirOrNode */
                               ASTDirOrNode jjtn000 = new ASTDirOrNode(JJTDIRORNODE);
                               boolean jjtc000 = true;
                               jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(DIR_OR_NODE);
                      jjtree.closeNodeScope(jjtn000, true);
                      jjtc000 = false;
                     jjtn000.setName(t.image);
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  static final public void Command() throws ParseException {
                           /*@bgen(jjtree) Command */
                           ASTCommand jjtn000 = new ASTCommand(JJTCOMMAND);
                           boolean jjtc000 = true;
                           jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(CMD);
              jjtree.closeNodeScope(jjtn000, true);
              jjtc000 = false;
             jjtn000.setName(t.image);
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  static final public void Condition() throws ParseException {
                               /*@bgen(jjtree) Condition */
  ASTCondition jjtn000 = new ASTCondition(JJTCONDITION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(17);
      label_1:
      while (true) {
        SubCondition();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case AND_OR:
          AndOr();
          SubCondition();
          break;
        default:
          jj_la1[3] = jj_gen;
          ;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case WORD:
          ;
          break;
        default:
          jj_la1[4] = jj_gen;
          break label_1;
        }
      }
      jj_consume_token(18);
    } catch (Throwable jjte000) {
      if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  static final public void SubCondition() throws ParseException {
                                     /*@bgen(jjtree) SubCondition */
  ASTSubCondition jjtn000 = new ASTSubCondition(JJTSUBCONDITION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(WORD);
      CompareSign();
      ConditionItem();
    } catch (Throwable jjte000) {
      if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  static final public void ConditionItem() throws ParseException {
                                       /*@bgen(jjtree) ConditionItem */
                                       ASTConditionItem jjtn000 = new ASTConditionItem(JJTCONDITIONITEM);
                                       boolean jjtc000 = true;
                                       jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(WORD);
               jjtree.closeNodeScope(jjtn000, true);
               jjtc000 = false;
              jjtn000.setName(t.image);
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  static final public void CompareSign() throws ParseException {
                                   /*@bgen(jjtree) CompareSign */
                                   ASTCompareSign jjtn000 = new ASTCompareSign(JJTCOMPARESIGN);
                                   boolean jjtc000 = true;
                                   jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(COMPARE);
                  jjtree.closeNodeScope(jjtn000, true);
                  jjtc000 = false;
                 jjtn000.setName(t.image);
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  static final public void AndOr() throws ParseException {
                       /*@bgen(jjtree) AndOr */
                       ASTAndOr jjtn000 = new ASTAndOr(JJTANDOR);
                       boolean jjtc000 = true;
                       jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(AND_OR);
                 jjtree.closeNodeScope(jjtn000, true);
                 jjtc000 = false;
                jjtn000.setName(t.image);
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  static final public void NewElement() throws ParseException {
                                 /*@bgen(jjtree) NewElement */
                                 ASTNewElement jjtn000 = new ASTNewElement(JJTNEWELEMENT);
                                 boolean jjtc000 = true;
                                 jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(19);
      jj_consume_token(WORD);
                  jjtree.closeNodeScope(jjtn000, true);
                  jjtc000 = false;
                 jjtn000.setName(t.next.image);
    } finally {
      if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public CustomParserTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[5];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x20,0x80000,0x20000,0x10000,0x100,};
   }

  /** Constructor with InputStream. */
  public CustomParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public CustomParser(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new CustomParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public CustomParser(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new CustomParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public CustomParser(CustomParserTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(CustomParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List jj_expentries = new java.util.ArrayList();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[20];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 5; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 20; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = (int[])jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
