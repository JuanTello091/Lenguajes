import java.util.HashMap;
import java.util.Map;
import java.lang.Math.*;

public class SenCosTanVisitorTest extends SenCosTanBaseVisitor<Integer>{

    Map<String,Integer> memory = new HashMap<>();

    @Override
    public Integer visitAssign(SenCosTanParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        int value = visit(ctx.expr());
        memory.put(id,value);
        return value;
    }

    @Override
    public Integer visitProg(SenCosTanParser.ProgContext ctx) {
        return super.visitProg(ctx);
    }

    @Override
    public Integer visitPrint(SenCosTanParser.PrintContext ctx) {
        Integer value = visit(ctx.expr());
        System.out.println(value);
        return 0;
    }

    @Override
    public Integer visitBlank(SenCosTanParser.BlankContext ctx) {
        return super.visitBlank(ctx);
    }

    @Override
    public Integer visitId(SenCosTanParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if(memory.containsKey(id)){
            return memory.get(id);
        }
        return 0;
    }

    @Override
    public Integer visitInt(SenCosTanParser.IntContext ctx){
        return Integer.valueOf(ctx.INT().getText());
    }
    @Override
    public Integer visitAddSub(SenCosTanParser.AddSubContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        if(ctx.op.getType()== SenCosTanParser.ADD){
            return left + right;
        }
        return left - right;
    }

    @Override
    public Integer visitMulDiv(SenCosTanParser.MulDivContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        if(ctx.op.getType()== SenCosTanParser.MUL){
            return left * right;
        }	
        return left / right;
    }

    @Override
    public Integer visitParens(SenCosTanParser.ParensContext ctx) {
        return visit(ctx.expr());
    }
    
    @Override
    public Integer visitSin(SenCosTanParser.SinContext ctx) {
        double n = visit(ctx.expr(0));
        return Math.sin(Math.toRadians(n));
    }
    
    @Override
    public Integer visitCos(SenCosTanParser.CosContext ctx) {
        double n = visit(ctx.expr(0));
        return Math.cos(Math.toRadians(n));
    }
    
    @Override
    public Integer visitTan(SenCosTanParser.TanContext ctx) {
        double n = visit(ctx.expr(0));
        return Math.tan(Math.toRadians(n));
    }
}
