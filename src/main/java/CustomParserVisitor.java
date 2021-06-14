public interface CustomParserVisitor
{
  Object visit(SimpleNode node, Object data);
  Object visit(ASTStart node, Object data);
  Object visit(ASTAndOr node, Object data);
  Object visit(ASTCommand node, Object data);
  Object visit(ASTCompareSign node, Object data);
  Object visit(ASTCondition node, Object data);
  Object visit(ASTConditionItem node, Object data);
  Object visit(ASTDirOrNode node, Object data);
  Object visit(ASTNewElement node, Object data);
  Object visit(ASTPath node, Object data);
  Object visit(ASTSubCondition node, Object data);
}