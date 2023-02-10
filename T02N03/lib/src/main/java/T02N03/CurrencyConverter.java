package T02N03;

public class CurrencyConverter {
	
	private static final float eurUsdExchangePrice = 1.068f;
	private static final float usdGbpExchangePrice = 0.827f;
	private static final float gbpEurExchangePrice = 1.132f;
	
	private CURRENCY sourceCurrency;
	private CURRENCY resultCurrency;
	
	public enum CURRENCY{
		EUR,
		USD,
		GBP
	}
	
	public CurrencyConverter(CURRENCY sourceCurrency, CURRENCY resultCurrency) {
		this.sourceCurrency = sourceCurrency;
		this.resultCurrency = resultCurrency;
	}
	
	public CURRENCY getSourceCurrency() {
		return sourceCurrency;
	}
	
	public void setSourceCurrency(CURRENCY sourceCurrency) {
		this.sourceCurrency = sourceCurrency;
	}
	
	public CURRENCY getResultCurrency() {
		return resultCurrency;
	}

	public void setResultCurrency(CURRENCY resultCurrency) {
		this.resultCurrency = resultCurrency;
	}
	
	public float convert(float price) {
		switch(sourceCurrency) {
			case EUR:
				switch(resultCurrency) {
					case USD:
						return price*eurUsdExchangePrice;
					case GBP:
						return price/gbpEurExchangePrice;
					default:
						return price;
				}
			case USD:
				switch(resultCurrency) {
					case EUR:
						return price/eurUsdExchangePrice;
					case GBP:
						return price*usdGbpExchangePrice;
					default:
						return price;
				}
			case GBP:
				switch(resultCurrency) {
					case EUR:
						return price*gbpEurExchangePrice;
					case USD:
						return price/usdGbpExchangePrice;
					default:
						return price;
				}
			default:
				return price;
		}
	}
}
