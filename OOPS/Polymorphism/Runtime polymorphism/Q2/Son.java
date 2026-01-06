class Son extends Father {
	@Override
	public ScientificCalculator buyCalculator(){        //covariant override
		return new ScientificCalculator();              
	}
}