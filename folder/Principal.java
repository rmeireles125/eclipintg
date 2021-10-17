
public class Principal {
public static void main(String[] args) {
		
		XDAO dao = new XDAO();
		
		dao.conectar();

		X x = new X(01,134);
		if(dao.inserir(x) == true) {
			System.out.println("Inserção com sucesso -> " + x.toString());
		}

		x.valor = 11;
		dao.atualizar(x);

		dao.excluir(x.id);

		X[] xs = dao.getXs();
		System.out.println("==== Mostrar Xs === ");		
		for(int i = 0; i < xs.length; i++) {
			System.out.println(xs[i].toString());
		}
		
		dao.close();
	}
}
