public class Person {
	String nome;

	public Person(String n) {
		this.nome = n;
	}
	//passo uma variavel de referencia do tipo Person essa variavel guardará
	//o valor do objeto que foi criado enquanto estiver dentro do escopo do metodo
	//pois o Objeto que vc criou com o nome "Joe" só exitirá
	//dentro do escopo do metodo
	public void setP1(Person p) {
		p = new Person("Joe");
	}
	//passo uma variavel de referencia do tipo Person e dou para ela o nome "Joe"
	//achei estranho, pois foi a primeira vez que vi passarem uma variavel de referencia
	//dentro de um metodo acho q não vi isso em livro algum *-*
	//mas vlw o aprendizado obrigado
	public void setP2(Person p) {
		p.nome = "Joe";
	}

	public static void main(String[] args) {

		Person p1 = new Person("Moe");
		Person p2 = new Person("Moe");
		p1.setP1(p1);
		p2.setP2(p2);

		System.out.println(p1.nome + " " + p2.nome);
	}
}
