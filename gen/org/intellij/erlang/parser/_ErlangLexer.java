// Generated by JFlex 1.9.1 http://jflex.de/  (tweaked for IntelliJ platform)
// source: Erlang.flex

package org.intellij.erlang.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.tree.IElementType;
import org.intellij.erlang.sdk.ErlangSdkRelease;
import org.intellij.erlang.sdk.ErlangSdkType;
import org.jetbrains.annotations.Nullable;
import static org.intellij.erlang.ErlangParserDefinition.*;
import static org.intellij.erlang.ErlangTypes.*;


public class _ErlangLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int IN_QUOTES = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1, 1
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\u10ff\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\1\0\10\1\1\0\1\2\2\1\1\3\21\1\2\0"+
    "\1\4\1\5\1\6\1\7\1\10\1\1\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\10\22"+
    "\2\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\4\33\1\34\25\33\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
    "\1\52\1\53\2\54\1\55\1\56\1\57\1\60\2\54"+
    "\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70"+
    "\1\54\1\71\1\72\1\73\42\1\1\0\u015f\1";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[512];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\2\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\17\32\1\33\1\34\1\35\1\32"+
    "\1\36\1\2\1\0\1\37\1\0\1\40\2\5\1\6"+
    "\1\41\1\32\1\42\1\43\1\44\1\45\1\46\2\0"+
    "\1\20\1\47\1\50\1\51\1\52\1\53\2\0\1\54"+
    "\1\55\1\56\1\57\1\60\1\61\15\32\1\62\2\32"+
    "\1\63\1\64\4\32\1\65\2\0\1\5\1\0\1\41"+
    "\1\66\1\67\1\20\1\70\1\20\1\71\1\72\1\32"+
    "\1\73\3\32\1\74\1\75\1\76\3\32\1\77\1\32"+
    "\1\100\1\101\1\32\1\102\2\32\1\103\1\104\1\32"+
    "\1\105\1\5\1\0\2\32\1\106\1\32\1\107\1\110"+
    "\1\111\1\32\1\112\3\32\1\113\1\0\1\70\1\114"+
    "\1\32\1\115\1\116\1\117\3\32\1\120\1\32\1\121"+
    "\1\122";

  private static int [] zzUnpackAction() {
    int [] result = new int[166];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\74\0\170\0\264\0\264\0\360\0\u012c\0\u0168"+
    "\0\u01a4\0\u01e0\0\264\0\264\0\264\0\u021c\0\264\0\u0258"+
    "\0\u0294\0\u02d0\0\u030c\0\u0348\0\264\0\u0384\0\u03c0\0\u03fc"+
    "\0\u0438\0\u0474\0\264\0\264\0\u04b0\0\u04ec\0\u0528\0\u0564"+
    "\0\u05a0\0\u05dc\0\u0618\0\u0654\0\u0690\0\u06cc\0\u0708\0\u0744"+
    "\0\u0780\0\u07bc\0\u07f8\0\264\0\u0834\0\264\0\u0870\0\264"+
    "\0\u08ac\0\360\0\264\0\u08e8\0\u0924\0\264\0\u0960\0\u099c"+
    "\0\u09d8\0\264\0\264\0\264\0\264\0\u0a14\0\264\0\u0a50"+
    "\0\u0a8c\0\u0ac8\0\264\0\264\0\264\0\264\0\264\0\u0b04"+
    "\0\u0b40\0\264\0\264\0\264\0\264\0\264\0\264\0\u0b7c"+
    "\0\u0bb8\0\u0bf4\0\u0c30\0\u0c6c\0\u0ca8\0\u0ce4\0\u0d20\0\u0d5c"+
    "\0\u0d98\0\u0dd4\0\u0e10\0\u0e4c\0\u0618\0\u0e88\0\u0ec4\0\u0618"+
    "\0\u0f00\0\u0f3c\0\u0f78\0\u0fb4\0\u0ff0\0\264\0\u08ac\0\u102c"+
    "\0\u1068\0\u10a4\0\u10e0\0\u111c\0\264\0\u0a50\0\u1158\0\u1194"+
    "\0\264\0\264\0\u11d0\0\u120c\0\u1248\0\u1284\0\u12c0\0\u0618"+
    "\0\u0618\0\u0618\0\u12fc\0\u1338\0\u1374\0\u0618\0\u13b0\0\u0618"+
    "\0\u0618\0\u13ec\0\u0618\0\u1428\0\u1464\0\u0618\0\u0618\0\u14a0"+
    "\0\u0618\0\u14dc\0\u1518\0\u1554\0\u1590\0\u0618\0\u15cc\0\u0618"+
    "\0\u0618\0\u0618\0\u1608\0\u0618\0\u1644\0\u1680\0\u16bc\0\u0618"+
    "\0\u16f8\0\u16f8\0\u0618\0\u1734\0\u0618\0\u0618\0\u0618\0\u1770"+
    "\0\u17ac\0\u17e8\0\u0618\0\u1824\0\u0618\0\u0618";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[166];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\3\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\2\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\4\2\32\1\33\1\4\1\34\1\4\1\32"+
    "\1\4\1\35\1\36\1\37\1\40\1\41\1\42\2\43"+
    "\1\44\2\43\1\45\1\46\1\47\1\50\1\43\1\51"+
    "\2\43\1\52\1\53\1\43\1\54\1\55\1\56\11\57"+
    "\1\60\24\57\1\61\35\57\1\3\1\0\1\3\165\0"+
    "\5\62\1\63\30\62\1\64\35\62\4\0\1\65\67\0"+
    "\2\66\1\0\33\66\1\67\35\66\2\70\2\0\4\70"+
    "\1\71\63\70\11\0\1\72\77\0\1\73\75\0\1\74"+
    "\10\0\1\75\63\0\1\76\102\0\1\77\52\0\1\100"+
    "\11\0\1\101\1\0\2\102\74\0\1\103\2\0\1\104"+
    "\63\0\1\105\6\0\1\106\1\107\65\0\1\110\2\0"+
    "\1\111\1\0\1\112\1\113\1\114\72\0\1\115\1\116"+
    "\72\0\1\117\66\0\2\32\6\0\3\32\4\0\1\32"+
    "\1\0\26\32\25\0\2\43\6\0\3\43\4\0\1\43"+
    "\1\0\5\43\1\120\6\43\1\121\11\43\25\0\2\43"+
    "\6\0\3\43\4\0\1\43\1\0\1\122\3\43\1\123"+
    "\7\43\1\124\1\125\1\43\1\126\4\43\1\127\1\43"+
    "\25\0\2\43\6\0\3\43\4\0\1\43\1\0\1\130"+
    "\25\43\25\0\2\43\6\0\3\43\4\0\1\43\1\0"+
    "\10\43\1\131\15\43\25\0\2\43\6\0\3\43\4\0"+
    "\1\43\1\0\12\43\1\132\1\43\1\133\11\43\25\0"+
    "\2\43\6\0\3\43\4\0\1\43\1\0\21\43\1\134"+
    "\4\43\25\0\2\43\6\0\3\43\4\0\1\43\1\0"+
    "\26\43\25\0\2\43\6\0\3\43\4\0\1\43\1\0"+
    "\5\43\1\135\20\43\25\0\2\43\6\0\3\43\4\0"+
    "\1\43\1\0\1\136\25\43\25\0\2\43\6\0\3\43"+
    "\4\0\1\43\1\0\15\43\1\137\10\43\25\0\2\43"+
    "\6\0\3\43\4\0\1\43\1\0\5\43\1\140\10\43"+
    "\1\141\7\43\25\0\2\43\6\0\3\43\4\0\1\43"+
    "\1\0\4\43\1\142\21\43\25\0\2\43\6\0\3\43"+
    "\4\0\1\43\1\0\16\43\1\143\7\43\25\0\2\43"+
    "\6\0\3\43\4\0\1\43\1\0\7\43\1\144\16\43"+
    "\25\0\2\43\6\0\3\43\4\0\1\43\1\0\15\43"+
    "\1\145\10\43\75\0\1\146\1\0\11\57\1\0\24\57"+
    "\1\147\35\57\5\0\1\57\1\0\3\57\4\0\1\57"+
    "\1\0\1\57\1\0\1\57\4\0\1\57\5\0\3\57"+
    "\1\150\2\57\1\0\1\57\1\0\3\57\6\0\1\57"+
    "\1\0\3\57\1\0\1\57\3\0\1\57\1\0\1\57"+
    "\74\62\2\65\2\0\70\65\1\66\1\0\1\66\2\0"+
    "\1\66\1\0\3\66\4\0\1\66\1\0\1\66\1\0"+
    "\1\151\4\0\1\66\5\0\3\66\1\152\2\66\1\0"+
    "\1\66\1\0\3\66\6\0\1\66\1\0\3\66\1\0"+
    "\1\66\3\0\1\66\1\0\1\66\2\70\2\0\70\70"+
    "\2\153\2\0\4\153\1\154\63\153\20\0\1\155\75\0"+
    "\2\156\7\0\2\156\6\0\26\156\25\0\2\157\56\0"+
    "\1\100\11\0\1\101\1\0\2\160\77\0\1\161\73\0"+
    "\1\162\66\0\2\43\6\0\3\43\4\0\1\43\1\0"+
    "\20\43\1\163\5\43\25\0\2\43\6\0\3\43\4\0"+
    "\1\43\1\0\3\43\1\164\22\43\25\0\2\43\6\0"+
    "\3\43\4\0\1\43\1\0\14\43\1\165\11\43\25\0"+
    "\2\43\6\0\3\43\4\0\1\43\1\0\6\43\1\166"+
    "\17\43\25\0\2\43\6\0\3\43\4\0\1\43\1\0"+
    "\15\43\1\167\10\43\25\0\2\43\6\0\3\43\4\0"+
    "\1\43\1\0\16\43\1\170\7\43\25\0\2\43\6\0"+
    "\3\43\4\0\1\43\1\0\12\43\1\171\3\43\1\172"+
    "\7\43\25\0\2\43\6\0\3\43\4\0\1\43\1\0"+
    "\15\43\1\173\10\43\25\0\2\43\6\0\3\43\4\0"+
    "\1\43\1\0\17\43\1\174\1\175\5\43\25\0\2\43"+
    "\6\0\3\43\4\0\1\43\1\0\22\43\1\176\3\43"+
    "\25\0\2\43\6\0\3\43\4\0\1\43\1\0\17\43"+
    "\1\177\6\43\25\0\2\43\6\0\3\43\4\0\1\43"+
    "\1\0\3\43\1\200\22\43\25\0\2\43\6\0\3\43"+
    "\4\0\1\43\1\0\14\43\1\201\11\43\25\0\2\43"+
    "\6\0\3\43\4\0\1\43\1\0\25\43\1\202\25\0"+
    "\2\43\6\0\3\43\4\0\1\43\1\0\20\43\1\203"+
    "\5\43\25\0\2\43\6\0\3\43\4\0\1\43\1\0"+
    "\4\43\1\204\21\43\25\0\2\43\6\0\3\43\4\0"+
    "\1\43\1\0\2\43\1\205\10\43\1\206\12\43\25\0"+
    "\2\43\6\0\3\43\4\0\1\43\1\0\25\43\1\207"+
    "\25\0\2\43\6\0\3\43\4\0\1\43\1\0\4\43"+
    "\1\210\21\43\25\0\2\43\6\0\3\43\4\0\1\43"+
    "\1\0\16\43\1\211\7\43\35\0\10\57\54\0\1\212"+
    "\103\0\10\66\32\0\2\153\2\0\70\153\2\154\2\0"+
    "\70\154\22\0\2\157\10\0\1\213\12\0\1\213\44\0"+
    "\1\101\1\0\2\160\72\0\2\43\6\0\3\43\4\0"+
    "\1\43\1\0\4\43\1\214\21\43\25\0\2\43\6\0"+
    "\3\43\4\0\1\43\1\0\1\215\25\43\25\0\2\43"+
    "\6\0\3\43\4\0\1\43\1\0\3\43\1\216\22\43"+
    "\25\0\2\43\6\0\3\43\4\0\1\43\1\0\10\43"+
    "\1\217\15\43\25\0\2\43\6\0\3\43\4\0\1\43"+
    "\1\0\20\43\1\220\5\43\25\0\2\43\6\0\3\43"+
    "\4\0\1\43\1\0\16\43\1\221\7\43\25\0\2\43"+
    "\6\0\3\43\4\0\1\43\1\0\4\43\1\222\21\43"+
    "\25\0\2\43\6\0\3\43\4\0\1\43\1\0\2\43"+
    "\1\223\23\43\25\0\2\43\6\0\3\43\4\0\1\43"+
    "\1\0\4\43\1\224\21\43\25\0\2\43\6\0\3\43"+
    "\4\0\1\43\1\0\1\43\1\225\24\43\25\0\2\43"+
    "\6\0\3\43\4\0\1\43\1\0\12\43\1\226\13\43"+
    "\25\0\2\43\6\0\3\43\4\0\1\43\1\0\4\43"+
    "\1\227\21\43\25\0\2\43\6\0\3\43\4\0\1\43"+
    "\1\0\14\43\1\230\11\43\25\0\1\66\66\0\1\231"+
    "\1\0\1\231\2\0\2\232\72\0\2\43\6\0\3\43"+
    "\4\0\1\43\1\0\16\43\1\233\7\43\25\0\2\43"+
    "\6\0\3\43\4\0\1\43\1\0\12\43\1\234\13\43"+
    "\25\0\2\43\6\0\3\43\4\0\1\43\1\0\14\43"+
    "\1\235\11\43\25\0\2\43\6\0\3\43\4\0\1\43"+
    "\1\0\7\43\1\236\16\43\25\0\2\43\6\0\3\43"+
    "\4\0\1\43\1\0\4\43\1\237\21\43\25\0\2\43"+
    "\6\0\3\43\4\0\1\43\1\0\17\43\1\240\6\43"+
    "\25\0\2\43\6\0\3\43\4\0\1\43\1\0\10\43"+
    "\1\241\15\43\25\0\2\232\72\0\2\43\6\0\3\43"+
    "\4\0\1\43\1\0\17\43\1\242\6\43\25\0\2\43"+
    "\6\0\3\43\4\0\1\43\1\0\4\43\1\243\21\43"+
    "\25\0\2\43\6\0\3\43\4\0\1\43\1\0\22\43"+
    "\1\244\3\43\25\0\2\43\6\0\3\43\4\0\1\43"+
    "\1\0\15\43\1\245\10\43\25\0\2\43\6\0\3\43"+
    "\4\0\1\43\1\0\4\43\1\246\21\43\3\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[6240];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\1\2\11\5\1\3\11\1\1\1\11\5\1"+
    "\1\11\5\1\2\11\17\1\1\11\1\1\1\11\1\1"+
    "\1\11\1\1\1\0\1\11\1\0\1\1\1\11\3\1"+
    "\4\11\1\1\1\11\2\0\1\1\5\11\2\0\6\11"+
    "\26\1\1\11\2\0\1\1\1\0\2\1\1\11\3\1"+
    "\2\11\30\1\1\0\15\1\1\0\15\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[166];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  protected int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    // Used by the tokenizer to request language features to be enabled
    public Project project = null;

    public _ErlangLexer(@Nullable Project project_) {
      this((java.io.Reader)null);
      this.project = project_;
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _ErlangLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return com.intellij.psi.TokenType.WHITE_SPACE;
            }
          // fall through
          case 83: break;
          case 2:
            { yybegin(YYINITIAL); return com.intellij.psi.TokenType.BAD_CHARACTER;
            }
          // fall through
          case 84: break;
          case 3:
            { return ERL_OP_EXL;
            }
          // fall through
          case 85: break;
          case 4:
            { return ERL_RADIX;
            }
          // fall through
          case 86: break;
          case 5:
            { return ERL_CHAR;
            }
          // fall through
          case 87: break;
          case 6:
            { return ERL_COMMENT;
            }
          // fall through
          case 88: break;
          case 7:
            { yybegin(IN_QUOTES); return ERL_SINGLE_QUOTE;
            }
          // fall through
          case 89: break;
          case 8:
            { return ERL_PAR_LEFT;
            }
          // fall through
          case 90: break;
          case 9:
            { return ERL_PAR_RIGHT;
            }
          // fall through
          case 91: break;
          case 10:
            { return ERL_OP_AR_MUL;
            }
          // fall through
          case 92: break;
          case 11:
            { return ERL_OP_PLUS;
            }
          // fall through
          case 93: break;
          case 12:
            { return ERL_COMMA;
            }
          // fall through
          case 94: break;
          case 13:
            { return ERL_OP_MINUS;
            }
          // fall through
          case 95: break;
          case 14:
            { return ERL_DOT;
            }
          // fall through
          case 96: break;
          case 15:
            { return ERL_OP_AR_DIV;
            }
          // fall through
          case 97: break;
          case 16:
            { return ERL_INTEGER;
            }
          // fall through
          case 98: break;
          case 17:
            { return ERL_COLON;
            }
          // fall through
          case 99: break;
          case 18:
            { return ERL_SEMI;
            }
          // fall through
          case 100: break;
          case 19:
            { return ERL_OP_LT;
            }
          // fall through
          case 101: break;
          case 20:
            { return ERL_OP_EQ;
            }
          // fall through
          case 102: break;
          case 21:
            { return ERL_OP_GT;
            }
          // fall through
          case 103: break;
          case 22:
            { return ERL_QMARK;
            }
          // fall through
          case 104: break;
          case 23:
            { return ERL_VAR;
            }
          // fall through
          case 105: break;
          case 24:
            { return ERL_BRACKET_LEFT;
            }
          // fall through
          case 106: break;
          case 25:
            { return ERL_BRACKET_RIGHT;
            }
          // fall through
          case 107: break;
          case 26:
            { return ERL_ATOM_NAME;
            }
          // fall through
          case 108: break;
          case 27:
            { return ERL_CURLY_LEFT;
            }
          // fall through
          case 109: break;
          case 28:
            { return ERL_OP_OR;
            }
          // fall through
          case 110: break;
          case 29:
            { return ERL_CURLY_RIGHT;
            }
          // fall through
          case 111: break;
          case 30:
            { yybegin(YYINITIAL); return ERL_SINGLE_QUOTE;
            }
          // fall through
          case 112: break;
          case 31:
            { return ERL_STRING;
            }
          // fall through
          case 113: break;
          case 32:
            { return getTokenStart() == 0 ? ERL_SHEBANG : com.intellij.psi.TokenType.ERROR_ELEMENT;
            }
          // fall through
          case 114: break;
          case 33:
            { return ERL_FUNCTION_DOC_COMMENT;
            }
          // fall through
          case 115: break;
          case 34:
            { return ERL_OP_PLUS_PLUS;
            }
          // fall through
          case 116: break;
          case 35:
            { return ERL_OP_MINUS_MINUS;
            }
          // fall through
          case 117: break;
          case 36:
            { return ERL_ARROW;
            }
          // fall through
          case 118: break;
          case 37:
            { return ERL_DOT_DOT;
            }
          // fall through
          case 119: break;
          case 38:
            { return ERL_OP_DIV_EQ;
            }
          // fall through
          case 120: break;
          case 39:
            { return ERL_COLON_COLON;
            }
          // fall through
          case 121: break;
          case 40:
            { return ERL_MATCH;
            }
          // fall through
          case 122: break;
          case 41:
            { return ERL_OP_LT_MINUS;
            }
          // fall through
          case 123: break;
          case 42:
            { return ERL_BIN_START;
            }
          // fall through
          case 124: break;
          case 43:
            { return ERL_OP_LT_EQ;
            }
          // fall through
          case 125: break;
          case 44:
            { return ERL_OP_EQ_LT;
            }
          // fall through
          case 126: break;
          case 45:
            { return ERL_OP_EQ_EQ;
            }
          // fall through
          case 127: break;
          case 46:
            { return ERL_ASSOC;
            }
          // fall through
          case 128: break;
          case 47:
            { return ERL_OP_GT_EQ;
            }
          // fall through
          case 129: break;
          case 48:
            { return ERL_BIN_END;
            }
          // fall through
          case 130: break;
          case 49:
            { return ERL_OP_MAYBE_EQ;
            }
          // fall through
          case 131: break;
          case 50:
            { return ERL_IF;
            }
          // fall through
          case 132: break;
          case 51:
            { return ERL_OF;
            }
          // fall through
          case 133: break;
          case 52:
            { return ERL_OR;
            }
          // fall through
          case 134: break;
          case 53:
            { return ERL_OR_OR;
            }
          // fall through
          case 135: break;
          case 54:
            { return ERL_MODULE_DOC_COMMENT;
            }
          // fall through
          case 136: break;
          case 55:
            { return ERL_DOT_DOT_DOT;
            }
          // fall through
          case 137: break;
          case 56:
            { return ERL_FLOAT;
            }
          // fall through
          case 138: break;
          case 57:
            { return ERL_OP_EQ_DIV_EQ;
            }
          // fall through
          case 139: break;
          case 58:
            { return ERL_OP_EQ_COL_EQ;
            }
          // fall through
          case 140: break;
          case 59:
            { return ERL_AND;
            }
          // fall through
          case 141: break;
          case 60:
            { return ERL_BOR;
            }
          // fall through
          case 142: break;
          case 61:
            { return ERL_BSL;
            }
          // fall through
          case 143: break;
          case 62:
            { return ERL_BSR;
            }
          // fall through
          case 144: break;
          case 63:
            { return ERL_DIV;
            }
          // fall through
          case 145: break;
          case 64:
            { return ERL_END;
            }
          // fall through
          case 146: break;
          case 65:
            { return ERL_FUN;
            }
          // fall through
          case 147: break;
          case 66:
            { return ERL_NOT;
            }
          // fall through
          case 148: break;
          case 67:
            { return ERL_REM;
            }
          // fall through
          case 149: break;
          case 68:
            { return ERL_TRY;
            }
          // fall through
          case 150: break;
          case 69:
            { return ERL_XOR;
            }
          // fall through
          case 151: break;
          case 70:
            { return ERL_BAND;
            }
          // fall through
          case 152: break;
          case 71:
            { return ERL_BNOT;
            }
          // fall through
          case 153: break;
          case 72:
            { return ERL_BXOR;
            }
          // fall through
          case 154: break;
          case 73:
            { return ERL_CASE;
            }
          // fall through
          case 155: break;
          case 74:
            { return ERL_ELSE;
            }
          // fall through
          case 156: break;
          case 75:
            { return ERL_WHEN;
            }
          // fall through
          case 157: break;
          case 76:
            { return ERL_AFTER;
            }
          // fall through
          case 158: break;
          case 77:
            { return ERL_BEGIN;
            }
          // fall through
          case 159: break;
          case 78:
            { return ERL_CATCH;
            }
          // fall through
          case 160: break;
          case 79:
            { boolean isSupported = ErlangSdkType.getRelease(this.project).erlangFeatureMaybe();
        return isSupported ? ERL_MAYBE : ERL_ATOM_NAME;
            }
          // fall through
          case 161: break;
          case 80:
            { return ERL_ORELSE;
            }
          // fall through
          case 162: break;
          case 81:
            { return ERL_ANDALSO;
            }
          // fall through
          case 163: break;
          case 82:
            { return ERL_RECEIVE;
            }
          // fall through
          case 164: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
