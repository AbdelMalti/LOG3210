/* Generated By:JJTree&JavaCC: Do not edit this line. LEParserTokenManager.java */

/** Token Manager. */
public class LEParserTokenManager implements LEParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x781500060000L) != 0L)
         {
            jjmatchedKind = 16;
            return 21;
         }
         if ((active0 & 0x2800L) != 0L)
         {
            jjmatchedKind = 37;
            return 18;
         }
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 37;
            return 5;
         }
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 37;
            return 15;
         }
         if ((active0 & 0xa00000014L) != 0L)
         {
            jjmatchedKind = 16;
            return 3;
         }
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 37;
            return 12;
         }
         return -1;
      case 1:
         if ((active0 & 0x2000L) != 0L)
            return 18;
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 9;
            jjmatchedPos = 1;
            return 18;
         }
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 37;
            jjmatchedPos = 1;
            return 14;
         }
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 37;
            jjmatchedPos = 1;
            return 11;
         }
         if ((active0 & 0x10L) != 0L)
            return 1;
         if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 37;
            jjmatchedPos = 1;
            return 18;
         }
         return -1;
      case 2:
         if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 37;
            jjmatchedPos = 2;
            return 18;
         }
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 37;
            jjmatchedPos = 2;
            return 10;
         }
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 9;
            jjmatchedPos = 2;
            return 18;
         }
         return -1;
      case 3:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 37;
            jjmatchedPos = 3;
            return 7;
         }
         if ((active0 & 0x800L) != 0L)
            return 18;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 25;
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 37:
         jjmatchedKind = 16;
         return jjMoveStringLiteralDfa1_0(0x400000000000L);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 40:
         return jjStopAtPos(0, 20);
      case 41:
         return jjStopAtPos(0, 21);
      case 42:
         jjmatchedKind = 16;
         return jjMoveStringLiteralDfa1_0(0x200000000000L);
      case 43:
         jjmatchedKind = 16;
         return jjMoveStringLiteralDfa1_0(0x80000000000L);
      case 45:
         jjmatchedKind = 16;
         return jjMoveStringLiteralDfa1_0(0x100000000000L);
      case 47:
         jjmatchedKind = 16;
         return jjMoveStringLiteralDfa1_0(0x800000014L);
      case 59:
         return jjStopAtPos(0, 22);
      case 60:
         jjmatchedKind = 28;
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 61:
         jjmatchedKind = 19;
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 62:
         jjmatchedKind = 27;
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 94:
         return jjStartNfaWithStates_0(0, 16, 21);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 710:
         return jjMoveStringLiteralDfa1_0(0x800000000000L);
      default :
         return jjMoveNfa_0(4, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(1, 23);
         break;
      case 42:
         if ((active0 & 0x10L) != 0L)
            return jjStartNfaWithStates_0(1, 4, 1);
         break;
      case 47:
         if ((active0 & 0x4L) != 0L)
            return jjStopAtPos(1, 2);
         break;
      case 61:
         if ((active0 & 0x4000000L) != 0L)
            return jjStopAtPos(1, 26);
         else if ((active0 & 0x20000000L) != 0L)
            return jjStopAtPos(1, 29);
         else if ((active0 & 0x40000000L) != 0L)
            return jjStopAtPos(1, 30);
         else if ((active0 & 0x80000000L) != 0L)
            return jjStopAtPos(1, 31);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(1, 35);
         else if ((active0 & 0x80000000000L) != 0L)
            return jjStopAtPos(1, 43);
         else if ((active0 & 0x100000000000L) != 0L)
            return jjStopAtPos(1, 44);
         else if ((active0 & 0x200000000000L) != 0L)
            return jjStopAtPos(1, 45);
         else if ((active0 & 0x400000000000L) != 0L)
            return jjStopAtPos(1, 46);
         else if ((active0 & 0x800000000000L) != 0L)
            return jjStopAtPos(1, 47);
         break;
      case 102:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(1, 9, 18);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      case 111:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(1, 13, 18);
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
      case 124:
         if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(1, 24);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
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
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 114:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(2, 9, 18);
         break;
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
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
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(3, 11, 18);
         break;
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
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
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(4, 12, 9);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 39;
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
               case 12:
               case 18:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAdd(18);
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 39)
                        kind = 39;
                  }
                  else if ((0xac2000000000L & l) != 0L)
                  {
                     if (kind > 16)
                        kind = 16;
                     jjstateSet[jjnewStateCnt++] = 21;
                  }
                  else if ((0x100002600L & l) != 0L)
                  {
                     if (kind > 1)
                        kind = 1;
                     jjCheckNAdd(0);
                  }
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 40)
                        kind = 40;
                     jjCheckNAddStates(0, 8);
                  }
                  else if (curChar == 48)
                  {
                     if (kind > 40)
                        kind = 40;
                     jjCheckNAddStates(9, 14);
                  }
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAdd(18);
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAdd(18);
                  break;
               case 15:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAdd(18);
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAdd(18);
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 15)
                        kind = 15;
                  }
                  else if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 11:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAdd(18);
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAdd(18);
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAdd(18);
                  break;
               case 0:
                  if ((0x100002600L & l) == 0L)
                     break;
                  if (kind > 1)
                     kind = 1;
                  jjCheckNAdd(0);
                  break;
               case 1:
                  if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 2:
                  if ((0xffff7fffffffffffL & l) != 0L && kind > 3)
                     kind = 3;
                  break;
               case 19:
                  if ((0x3ff000000000000L & l) != 0L && kind > 39)
                     kind = 39;
                  break;
               case 20:
                  if ((0xac2000000000L & l) == 0L)
                     break;
                  if (kind > 16)
                     kind = 16;
                  jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 21:
                  if ((0x3ff000000000000L & l) != 0L && kind > 15)
                     kind = 15;
                  break;
               case 22:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 40)
                     kind = 40;
                  jjCheckNAddStates(0, 8);
                  break;
               case 23:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 40)
                     kind = 40;
                  jjCheckNAdd(23);
                  break;
               case 24:
                  if ((0x3fe000000000000L & l) != 0L)
                     jjCheckNAddStates(15, 18);
                  break;
               case 25:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(15, 18);
                  break;
               case 26:
                  if (curChar == 48)
                     jjCheckNAddStates(19, 21);
                  break;
               case 27:
                  if (curChar == 46)
                     jjCheckNAdd(28);
                  break;
               case 28:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAddTwoStates(28, 29);
                  break;
               case 30:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(31);
                  break;
               case 31:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(31);
                  break;
               case 32:
                  if ((0x3fe000000000000L & l) != 0L)
                     jjCheckNAddStates(22, 25);
                  break;
               case 33:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(22, 25);
                  break;
               case 34:
                  if (curChar == 48)
                     jjCheckNAddStates(26, 28);
                  break;
               case 36:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(37);
                  break;
               case 37:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(37);
                  break;
               case 38:
                  if (curChar != 48)
                     break;
                  if (kind > 40)
                     kind = 40;
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
               case 12:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 37)
                        kind = 37;
                     jjCheckNAdd(18);
                  }
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 4:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 37)
                        kind = 37;
                     jjCheckNAdd(18);
                  }
                  else if (curChar == 94)
                  {
                     if (kind > 16)
                        kind = 16;
                     jjstateSet[jjnewStateCnt++] = 21;
                  }
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 15;
                  else if (curChar == 119)
                     jjstateSet[jjnewStateCnt++] = 12;
                  else if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 10:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 37)
                        kind = 37;
                     jjCheckNAdd(18);
                  }
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 37)
                        kind = 37;
                     jjCheckNAdd(18);
                  }
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 15:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 37)
                        kind = 37;
                     jjCheckNAdd(18);
                  }
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 7:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 37)
                        kind = 37;
                     jjCheckNAdd(18);
                  }
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 11:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 37)
                        kind = 37;
                     jjCheckNAdd(18);
                  }
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 5:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 37)
                        kind = 37;
                     jjCheckNAdd(18);
                  }
                  if (curChar == 102)
                  {
                     if (kind > 9)
                        kind = 9;
                  }
                  break;
               case 14:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 37)
                        kind = 37;
                     jjCheckNAdd(18);
                  }
                  if (curChar == 114)
                  {
                     if (kind > 9)
                        kind = 9;
                  }
                  break;
               case 2:
                  if (kind > 3)
                     kind = 3;
                  break;
               case 6:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 8:
                  if (curChar == 111 && kind > 9)
                     kind = 9;
                  break;
               case 13:
                  if (curChar == 119)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 16:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 17:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAdd(18);
                  break;
               case 18:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAdd(18);
                  break;
               case 20:
                  if (curChar != 94)
                     break;
                  if (kind > 16)
                     kind = 16;
                  jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 29:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(29, 30);
                  break;
               case 35:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(31, 32);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2) && kind > 3)
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
      if ((i = jjnewStateCnt) == (startsAt = 39 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_3()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_3(0x80L);
      default :
         return 1;
   }
}
private int jjMoveStringLiteralDfa1_3(long active0)
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
private int jjMoveStringLiteralDfa0_1()
{
   return jjMoveNfa_1(0, 0);
}
private int jjMoveNfa_1(int startState, int curPos)
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
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
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
private int jjMoveStringLiteralDfa0_2()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_2(0x40L);
      default :
         return 1;
   }
}
private int jjMoveStringLiteralDfa1_2(long active0)
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
   23, 24, 25, 26, 27, 32, 33, 34, 35, 24, 26, 27, 32, 34, 35, 24, 
   25, 26, 27, 24, 26, 27, 32, 33, 34, 35, 32, 34, 35, 30, 31, 36, 
   37, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default :
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, "\151\146", 
"\145\154\163\145", "\167\150\151\154\145", "\144\157", "\146\157\162", null, null, "\53", "\55", 
"\75", "\50", "\51", "\73", "\46\46", "\174\174", "\41", "\41\75", "\76", "\74", 
"\76\75", "\74\75", "\75\75", "\52", "\57", "\136", "\57\75", "\45", null, null, null, 
null, null, null, "\53\75", "\55\75", "\52\75", "\45\75", "\u02c6\75", };

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
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0xfbbffffffe01L, 
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
protected JavaCharStream input_stream;
private final int[] jjrounds = new int[39];
private final int[] jjstateSet = new int[78];
private final StringBuilder jjimage = new StringBuilder();
private StringBuilder image = jjimage;
private int jjimageLen;
private int lengthOfMatch;
protected char curChar;
/** Constructor. */
public LEParserTokenManager(JavaCharStream stream){
   if (JavaCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public LEParserTokenManager(JavaCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(JavaCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 39; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(JavaCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 4 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
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

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
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

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void MoreLexicalActions()
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
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}