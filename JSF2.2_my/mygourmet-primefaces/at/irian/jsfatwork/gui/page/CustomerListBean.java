package at.irian.jsfatwork.gui.page;

import at.irian.jsfatwork.domain.Customer;
import at.irian.jsfatwork.domain.Provider;
import at.irian.jsfatwork.service.CustomerService;
import org.apache.myfaces.extensions.cdi.core.api.scope.conversation.ViewAccessScoped;
import org.apache.myfaces.extensions.cdi.jsf.api.config.view.PreRenderView;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewAccessScoped
public class CustomerListBean implements Serializable {

	@Inject
	private CustomerService customerService;

	private List<Customer> customerList;

	private Customer customer;

	@PreRenderView
	public void preRenderView() {
		customerList = customerService.findAll();
	}

	public List<Customer> getCustomerList() {
		return customerList;
	}

	public void deleteCustomer() {
		if (customer != null) {
			customerService.delete(customer);
			customer = null;
		}
	}

	public void selectCustomer(Customer customer) {
		this.customer = customer;
	}

}
