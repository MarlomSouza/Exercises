function MaximumComumDivisor(){
	var valores = getValue("valores");
	var numeros = valores.value.split(",");
	
	var divisorComum = 2;
	var maximoDivisor = 1;
	
	do{
		var obterProximoNumero = true;
		var machesAll = true;
		var existeDivisor = false;
		
		for (i = 0; i < numeros.length; i++) { 
			var canDivide = numeros[i] % divisorComum == 0;
			
			if(canDivide){
				numeros[i] /= divisorComum;
				obterProximoNumero = false;
			}else
				machesAll = false;
			
			if(numeros[i] > 1)
				existeDivisor = true;
		}
		
		if(machesAll)
			maximoDivisor *= divisorComum;
		

		if(obterProximoNumero)
			divisorComum = obterProximoNumeroPrimo(divisorComum);
	}while(existeDivisor);
	
	setValue("resultado",maximoDivisor);
	return maximoDivisor;
	
}
function getValue(id){
	return document.getElementById(id);
}

function setValue(id, valor){
	getValue(id).value = valor;
}

function obterProximoNumeroPrimo(numero){	
	var primo = false;
	
	while(primo == false){
		numero++;
		var possuiDivisores = false;
		
		for (i = 2; i < numero; i++) {
			var restoDivisao = numero % i;
			
			if (restoDivisao == 0) {
				possuiDivisores = true;
				break;
			}
		}
		
		if (!possuiDivisores)
			primo = true
	}
	
	return numero;
}

function _obterProximoNumeroPrimo(numero){
	var primo = false;
	debugger;
	while(primo == false){
		numero++;
		if((numero % 1 == 0 && numero % numero == 0 && (numero % 2 != 0 && numero % 2 == 1)) || numero == 2)
			primo = true;
	}	
	return numero;
}
