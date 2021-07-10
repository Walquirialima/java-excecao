
public class TestaContaComExcecaoCheked {

	public static void main(String[] args) {

		Conta conta = new Conta();
		try {
			conta.deposita();
		} catch (MinhaExcecao ex) {
			ex.printStackTrace();
			System.out.println("tratamento....");
		}
	}
}
