package ptbs;
abstract public class NodeVisitor {
	
	public NodeVisitor() {
	}

	public NodeVisitor(Object visitee) {
	}

	abstract public void visitProduct(Product product);

	abstract public void visitTrading(Trading trading);

	abstract public void visitFacade(Facade facade);

}
