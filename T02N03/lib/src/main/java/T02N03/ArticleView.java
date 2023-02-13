package T02N03;

import java.text.DecimalFormat;
import java.util.List;

public class ArticleView {
	
	private CurrencyConverter currencyConverter;
	
	DecimalFormat eurDF = new DecimalFormat("0.00€");
	DecimalFormat usdDF = new DecimalFormat("$0.00 USD");
	DecimalFormat gbpDF = new DecimalFormat("£0.00 GBP");
	
	public ArticleView(CurrencyConverter currencyConverter) {
		this.currencyConverter = currencyConverter;
	}
	
	public void print(List<Article> articles) {
		switch(currencyConverter.getResultCurrency()) {
			case EUR:
				articles.forEach(c -> System.out.println("Nom: " + c.getName() + " | Preu: " + eurDF.format(currencyConverter.convert(c.getPrice()))));
				break;
			case USD:
				articles.forEach(c -> System.out.println("Nom: " + c.getName() + " | Preu: " + usdDF.format(currencyConverter.convert(c.getPrice()))));
				break;
			case GBP:
				articles.forEach(c -> System.out.println("Nom: " + c.getName() + " | Preu: " + gbpDF.format(currencyConverter.convert(c.getPrice()))));
				break;
		}
		
	}
}
