package lambdas_streams_frameworks.generics.lambda.interface_funcional;

//indica ao compilador que essa interface deve ter apenas um método abstrato.
@FunctionalInterface
public interface Operacao {
    //método abstrato
    int executar (int a, int b);
}
