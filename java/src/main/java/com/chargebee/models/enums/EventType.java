package com.chargebee.models.enums;

public enum EventType {
    CUSTOMER_CREATED,
    CUSTOMER_CHANGED,
    SUBSCRIPTION_CREATED,
    SUBSCRIPTION_STARTED,
    SUBSCRIPTION_TRIAL_ENDING,
    SUBSCRIPTION_ACTIVATED,
    SUBSCRIPTION_CHANGED,
    SUBSCRIPTION_CANCELLATION_SCHEDULED,
    SUBSCRIPTION_CANCELLING,
    SUBSCRIPTION_CANCELLED,
    SUBSCRIPTION_REACTIVATED,
    SUBSCRIPTION_RENEWED,
    SUBSCRIPTION_SCHEDULED_CANCELLATION_REMOVED,
    INVOICE_RECEIPT,
    INVOICE_CREATED,
    INVOICE_DELETED,
    
    
    
    PAYMENT_SUCCEEDED,
    PAYMENT_FAILED,
    PAYMENT_REFUNDED,
    CARD_ADDED,
    CARD_UPDATED,
    CARD_EXPIRING,
    CARD_EXPIRED,
    CARD_DELETED,
    _UNKNOWN; /*Indicates unexpected value for this enum. You can get this when there is a
    java-client version incompatibility. We suggest you to upgrade to the latest version */
}