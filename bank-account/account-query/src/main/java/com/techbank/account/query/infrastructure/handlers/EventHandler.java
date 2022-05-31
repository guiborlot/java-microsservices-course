package com.techbank.account.query.infrastructure.handlers;

import com.techbank.account.common.events.AccountClosedEvent;
import com.techbank.account.common.events.AccountOpenedEvent;
import com.techbank.account.common.events.FoundsDepositedEvent;
import com.techbank.account.common.events.FoundsWithdrawEvent;

public interface EventHandler {
    void on(AccountOpenedEvent event);
    void on(FoundsDepositedEvent event);
    void on(AccountClosedEvent event);
    void on(FoundsWithdrawEvent event);
}
