/* Generated By:JJTree: Do not edit this line. ASTidentifiant.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTidentifiant extends SimpleNode {
  public ASTidentifiant(int id) {
    super(id);
  }

  public ASTidentifiant(LEParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(LEParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=ea8ce479951c4efb910426fa2a175d16 (do not edit this line) */
