package one.digitalinnovation.gof;

import Facade.Facade;
import Singleton.SingletonEager;
import Singleton.SingletonLazy;
import Singleton.SingletonLazyHolder;
import Strategy.Comportamento;
import Strategy.ComportamentoAgressivo;
import Strategy.ComportamentoDefensivo;
import Strategy.ComportamentoNormal;
import Strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		//Singleton
		
		SingletonLazy lazy = SingletonLazy.getinstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getinstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getinstancia();
		System.out.println(eager);
		eager = SingletonEager.getinstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getinstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getinstancia();
		System.out.println(lazyHolder);
		
		//Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();

		//Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Adauto", "51021010");
		
		
	}

}
