package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		
		double vrParc = contract.getTotalValue()/months ; 
		
		for (int i = 1; i<= months; i++) {
			LocalDate dtContractVenc = contract.getDate().plusMonths(i);
			
			double interest = onlinePaymentService.interest(vrParc,i);
			double fee = onlinePaymentService.paymentFee(vrParc + interest);
			double quota = vrParc + interest + fee;
			
			Installment installment = new Installment(dtContractVenc, quota);
			 
			contract.getInstallment().add(installment);
			
		}
	}
	
	
}
