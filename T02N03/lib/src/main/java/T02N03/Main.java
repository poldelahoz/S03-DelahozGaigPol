package T02N03;

import java.util.ArrayList;
import java.util.List;

import T02N03.CurrencyConverter.CURRENCY;

public class Main {
	
	private static List<Article> articles = new ArrayList<Article>();

	public static void main(String[] args) {
		
		System.out.println("Es creen articles de prova amb preus en EUR.");
		createDemoData();
		
		System.out.println("Articles amb preus en EUR");
		CurrencyConverter currencyConverter = new CurrencyConverter(CURRENCY.EUR, CURRENCY.EUR);
		ArticleView articleView = new ArticleView(currencyConverter);
		articleView.print(articles);
		
		System.out.println();
		System.out.println("Articles amb preus en USD (EUR -> USD):");
		currencyConverter = new CurrencyConverter(CURRENCY.EUR, CURRENCY.USD);
		articleView = new ArticleView(currencyConverter);
		articleView.print(articles);
		
		System.out.println();
		System.out.println("Articles amb preus en GBP (EUR -> GBP):");
		currencyConverter = new CurrencyConverter(CURRENCY.USD, CURRENCY.GBP);
		articleView = new ArticleView(currencyConverter);
		articleView.print(articles);
	}
	
	
	public static void createDemoData() {
		articles.add(new Article("Article 1", 10));
		articles.add(new Article("Article 2", 20));
		articles.add(new Article("Article 3", 30));
	}
}
