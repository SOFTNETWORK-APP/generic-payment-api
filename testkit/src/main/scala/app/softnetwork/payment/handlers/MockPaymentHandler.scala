package app.softnetwork.payment.handlers

object MockPaymentHandler extends MockPaymentHandler

trait MockPaymentHandler extends GenericPaymentHandler with MockPaymentTypeKey
