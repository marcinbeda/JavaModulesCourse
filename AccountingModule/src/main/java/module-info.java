module AccountingModule {

    requires java.logging;
    requires PayrollService;
    requires PolishPayroll;

    exports pl.beda.accounting;
}