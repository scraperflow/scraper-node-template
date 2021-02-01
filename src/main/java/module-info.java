import scraper.api.node.type.Node;
import scraper.nodes.custom.dev.MyNode;

open module scraper.nodes.custom.dev {
    requires scraper.core;
    provides Node with MyNode;
}
