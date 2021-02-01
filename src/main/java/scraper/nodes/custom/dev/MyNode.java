package scraper.nodes.custom.dev;

import scraper.annotations.NotNull;
import scraper.annotations.node.*;
import scraper.api.flow.FlowMap;
import scraper.api.node.container.FunctionalNodeContainer;
import scraper.api.node.type.FunctionalNode;
import scraper.api.template.L;
import scraper.api.template.T;


/**
 * Custom functional node. Identity.
 */
@NodePlugin("0.1.0")
public final class MyNode <X> implements FunctionalNode {

    @FlowKey T<X> myInput = new T<>(){};
    @FlowKey L<X> myOutput = new L<>(){};

    @Override
    public void modify(@NotNull FunctionalNodeContainer n, @NotNull FlowMap o) {
        X input = o.eval(myInput);
        o.output(myOutput, input);
    }
}
