/* Generated By:JavaCC: Do not edit this line. Exercice2TokenManager.java */

/** Token Manager. */
public class Exercice2TokenManager implements Exercice2Constants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x400020c00L) != 0L)
         {
            jjmatchedKind = 48;
            return 31;
         }
         if ((active0 & 0x40200L) != 0L)
         {
            jjmatchedKind = 48;
            return 8;
         }
         if ((active0 & 0x40000014L) != 0L)
            return 35;
         if ((active0 & 0xb8000000L) != 0L)
            return 19;
         return -1;
      case 1:
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 48;
            jjmatchedPos = 1;
            return 53;
         }
         if ((active0 & 0x200L) != 0L)
            return 31;
         if ((active0 & 0x400020c00L) != 0L)
         {
            jjmatchedKind = 48;
            jjmatchedPos = 1;
            return 31;
         }
         if ((active0 & 0x10L) != 0L)
            return 33;
         return -1;
      case 2:
         if ((active0 & 0x400000000L) != 0L)
            return 31;
         if ((active0 & 0x60c00L) != 0L)
         {
            jjmatchedKind = 48;
            jjmatchedPos = 2;
            return 31;
         }
         return -1;
      case 3:
         if ((active0 & 0x60800L) != 0L)
         {
            jjmatchedKind = 48;
            jjmatchedPos = 3;
            return 31;
         }
         if ((active0 & 0x400L) != 0L)
            return 31;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 38:
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 40:
         return jjStopAtPos(0, 41);
      case 41:
         return jjStopAtPos(0, 42);
      case 42:
         return jjStartNfaWithStates_0(0, 29, 19);
      case 43:
         return jjStartNfaWithStates_0(0, 27, 19);
      case 44:
         return jjStopAtPos(0, 47);
      case 45:
         return jjStartNfaWithStates_0(0, 28, 19);
      case 47:
         jjmatchedKind = 30;
         return jjMoveStringLiteralDfa1_0(0x14L);
      case 58:
         return jjStopAtPos(0, 45);
      case 59:
         return jjStopAtPos(0, 46);
      case 94:
         return jjStartNfaWithStates_0(0, 31, 19);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x40200L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x400000000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 123:
         return jjStopAtPos(0, 43);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x200000000L);
      case 125:
         return jjStopAtPos(0, 44);
      default :
         return jjMoveNfa_0(6, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x100000000L) != 0L)
            return jjStopAtPos(1, 32);
         break;
      case 42:
         if ((active0 & 0x10L) != 0L)
            return jjStartNfaWithStates_0(1, 4, 33);
         break;
      case 47:
         if ((active0 & 0x4L) != 0L)
            return jjStopAtPos(1, 2);
         break;
      case 102:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(1, 9, 31);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000L);
      case 124:
         if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(1, 33);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x20800L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 116:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(2, 34, 31);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(3, 10, 31);
         break;
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(4, 11, 31);
         break;
      case 116:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(4, 17, 31);
         else if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(4, 18, 31);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 53;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 35:
                  if (curChar == 61)
                  {
                     if (kind > 19)
                        kind = 19;
                  }
                  else if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 33;
                  break;
               case 6:
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 51)
                        kind = 51;
                     jjCheckNAddStates(0, 8);
                  }
                  else if ((0x100002600L & l) != 0L)
                  {
                     if (kind > 1)
                        kind = 1;
                     jjCheckNAdd(0);
                  }
                  else if ((0x5000000000000000L & l) != 0L)
                  {
                     if (kind > 20)
                        kind = 20;
                  }
                  else if (curChar == 48)
                  {
                     if (kind > 51)
                        kind = 51;
                     jjCheckNAddStates(9, 14);
                  }
                  else if (curChar == 47)
                     jjCheckNAddTwoStates(35, 19);
                  else if (curChar == 61)
                     jjCheckNAdd(25);
                  else if (curChar == 33)
                     jjCheckNAdd(25);
                  else if (curChar == 42)
                     jjCheckNAdd(19);
                  else if (curChar == 45)
                     jjCheckNAdd(19);
                  else if (curChar == 43)
                     jjCheckNAdd(19);
                  if (curChar == 62)
                     jjCheckNAdd(25);
                  else if (curChar == 60)
                     jjCheckNAdd(25);
                  else if (curChar == 61)
                  {
                     if (kind > 19)
                        kind = 19;
                  }
                  break;
               case 8:
               case 31:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 48)
                     kind = 48;
                  jjCheckNAdd(31);
                  break;
               case 53:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 48)
                     kind = 48;
                  jjCheckNAdd(31);
                  break;
               case 0:
                  if ((0x100002600L & l) == 0L)
                     break;
                  if (kind > 1)
                     kind = 1;
                  jjCheckNAdd(0);
                  break;
               case 18:
                  if (curChar == 61 && kind > 19)
                     kind = 19;
                  break;
               case 19:
                  if (curChar == 61 && kind > 19)
                     kind = 19;
                  break;
               case 20:
                  if (curChar == 43)
                     jjCheckNAdd(19);
                  break;
               case 21:
                  if (curChar == 45)
                     jjCheckNAdd(19);
                  break;
               case 23:
                  if (curChar == 42)
                     jjCheckNAdd(19);
                  break;
               case 24:
                  if ((0x5000000000000000L & l) != 0L && kind > 20)
                     kind = 20;
                  break;
               case 25:
                  if (curChar == 61 && kind > 20)
                     kind = 20;
                  break;
               case 26:
                  if (curChar == 60)
                     jjCheckNAdd(25);
                  break;
               case 27:
                  if (curChar == 62)
                     jjCheckNAdd(25);
                  break;
               case 28:
                  if (curChar == 33)
                     jjCheckNAdd(25);
                  break;
               case 29:
                  if (curChar == 61)
                     jjCheckNAdd(25);
                  break;
               case 32:
                  if (curChar == 47)
                     jjCheckNAddTwoStates(35, 19);
                  break;
               case 33:
                  if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 34;
                  break;
               case 34:
                  if ((0xffff7fffffffffffL & l) != 0L && kind > 3)
                     kind = 3;
                  break;
               case 36:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAddStates(0, 8);
                  break;
               case 37:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAdd(37);
                  break;
               case 38:
                  if ((0x3fe000000000000L & l) != 0L)
                     jjCheckNAddStates(15, 18);
                  break;
               case 39:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(15, 18);
                  break;
               case 40:
                  if (curChar == 48)
                     jjCheckNAddStates(19, 21);
                  break;
               case 41:
                  if (curChar == 46)
                     jjCheckNAdd(42);
                  break;
               case 42:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 52)
                     kind = 52;
                  jjCheckNAddTwoStates(42, 43);
                  break;
               case 44:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(45);
                  break;
               case 45:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 52)
                     kind = 52;
                  jjCheckNAdd(45);
                  break;
               case 46:
                  if ((0x3fe000000000000L & l) != 0L)
                     jjCheckNAddStates(22, 25);
                  break;
               case 47:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(22, 25);
                  break;
               case 48:
                  if (curChar == 48)
                     jjCheckNAddStates(26, 28);
                  break;
               case 50:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(51);
                  break;
               case 51:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 52)
                     kind = 52;
                  jjCheckNAdd(51);
                  break;
               case 52:
                  if (curChar != 48)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAddStates(9, 14);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 6:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 48)
                        kind = 48;
                     jjCheckNAdd(31);
                  }
                  else if (curChar == 94)
                     jjstateSet[jjnewStateCnt++] = 19;
                  if (curChar == 98)
                     jjstateSet[jjnewStateCnt++] = 16;
                  else if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 12;
                  else if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 8;
                  else if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 8:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 48)
                        kind = 48;
                     jjCheckNAdd(31);
                  }
                  if (curChar == 110)
                     jjCheckNAdd(7);
                  break;
               case 53:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 48)
                        kind = 48;
                     jjCheckNAdd(31);
                  }
                  if (curChar == 116)
                  {
                     if (kind > 12)
                        kind = 12;
                  }
                  break;
               case 1:
                  if (curChar == 103 && kind > 12)
                     kind = 12;
                  break;
               case 2:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 3:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 4:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 5:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 7:
                  if (curChar == 116 && kind > 12)
                     kind = 12;
                  break;
               case 9:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if (curChar == 97)
                     jjCheckNAdd(7);
                  break;
               case 11:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 13:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 14:
                  if (curChar == 108 && kind > 12)
                     kind = 12;
                  break;
               case 15:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 16:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 17:
                  if (curChar == 98)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 22:
                  if (curChar == 94)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 30:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 48)
                     kind = 48;
                  jjCheckNAdd(31);
                  break;
               case 31:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 48)
                     kind = 48;
                  jjCheckNAdd(31);
                  break;
               case 34:
                  if (kind > 3)
                     kind = 3;
                  break;
               case 43:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(29, 30);
                  break;
               case 49:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(31, 32);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 34:
                  if ((jjbitVec0[i2] & l2) != 0L && kind > 3)
                     kind = 3;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 53 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static private int jjMoveStringLiteralDfa0_3()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_3(0x80L);
      default :
         return 1;
   }
}
static private int jjMoveStringLiteralDfa1_3(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(1, 7);
         break;
      default :
         return 2;
   }
   return 2;
}
static private int jjMoveStringLiteralDfa0_1()
{
   return jjMoveNfa_1(0, 0);
}
static private int jjMoveNfa_1(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 3;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x2400L & l) != 0L)
                  {
                     if (kind > 5)
                        kind = 5;
                  }
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 1:
                  if (curChar == 10 && kind > 5)
                     kind = 5;
                  break;
               case 2:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 3 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static private int jjMoveStringLiteralDfa0_2()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_2(0x40L);
      default :
         return 1;
   }
}
static private int jjMoveStringLiteralDfa1_2(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
   37, 38, 39, 40, 41, 46, 47, 48, 49, 38, 40, 41, 46, 48, 49, 38, 
   39, 40, 41, 38, 40, 41, 46, 47, 48, 49, 46, 48, 49, 44, 45, 50, 
   51, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, "\151\146", 
"\145\154\163\145", "\167\150\151\154\145", null, null, null, null, null, "\160\162\151\156\164", 
"\151\156\160\165\164", null, null, null, null, null, null, null, null, "\53", "\55", "\52", "\57", 
"\136", "\46\46", "\174\174", "\156\157\164", null, null, null, null, null, null, 
"\50", "\51", "\173", "\175", "\72", "\73", "\54", null, null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "IN_SINGLE_LINE_COMMENT",
   "IN_FORMAL_COMMENT",
   "IN_MULTI_LINE_COMMENT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, 1, 2, 3, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x19fe07f81e1e01L, 
};
static final long[] jjtoSkip = {
   0xe2L, 
};
static final long[] jjtoSpecial = {
   0xe0L, 
};
static final long[] jjtoMore = {
   0x11cL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[53];
static private final int[] jjstateSet = new int[106];
private static final StringBuilder jjimage = new StringBuilder();
private static StringBuilder image = jjimage;
private static int jjimageLen;
private static int lengthOfMatch;
static protected char curChar;
/** Constructor. */
public Exercice2TokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public Exercice2TokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 53; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 4 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         if (jjmatchedPos == 0 && jjmatchedKind > 8)
         {
            jjmatchedKind = 8;
         }
         break;
       case 2:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_2();
         if (jjmatchedPos == 0 && jjmatchedKind > 8)
         {
            jjmatchedKind = 8;
         }
         break;
       case 3:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_3();
         if (jjmatchedPos == 0 && jjmatchedKind > 8)
         {
            jjmatchedKind = 8;
         }
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           matchedToken.specialToken = specialToken;
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
           {
              matchedToken = jjFillToken();
              if (specialToken == null)
                 specialToken = matchedToken;
              else
              {
                 matchedToken.specialToken = specialToken;
                 specialToken = (specialToken.next = matchedToken);
              }
              SkipLexicalActions(matchedToken);
           }
           else
              SkipLexicalActions(null);
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
        MoreLexicalActions();
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      case 3 :
         image.append(input_stream.GetSuffix(jjimageLen));
         jjimageLen = 0;
                   input_stream.backup(1);
         break;
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}