package pl.beda.payroll;

import java.util.Optional;
import java.util.ServiceLoader;

public interface PayrollService {

    String getCurrency();

    static PayrollService getInstance() {

        ServiceLoader<PayrollService> services = ServiceLoader.load(PayrollService.class);

        Optional<PayrollService> first = services.findFirst();

        return first.orElseThrow( () -> new RuntimeException("Missing service implementation"));
    }

}
