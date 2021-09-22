package pl.beda;

import pl.beda.payroll.PayrollService;

public class PolishPayrollImpl implements PayrollService {
    @Override
    public String getCurrency() {
        return "PLN";
    }
}
