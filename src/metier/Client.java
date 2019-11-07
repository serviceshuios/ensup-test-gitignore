package metier;

public class Client extends Personne{

	private int numAdherent;

	private Login login;
	
	public int getNumAdherent() {
		return numAdherent;
	}

	public void setNumAdherent(int numAdherent) {
		this.numAdherent = numAdherent;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	@Override
	public String toString() {
		return "Client [numAdherent=" + numAdherent + ", toString()=" + super.toString() + "]";
	}
}
