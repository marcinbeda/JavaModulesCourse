module PolishPayroll {

    requires PayrollService;

    provides pl.beda.payroll.PayrollService with pl.beda.PolishPayrollImpl;
}