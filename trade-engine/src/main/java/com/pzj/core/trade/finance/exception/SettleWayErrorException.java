/**
 * piaozhijia.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.pzj.core.trade.finance.exception;

/**
 * 结算方式错误
 *
 * @author DongChunfu
 * @version $Id: SaasRoleErrorException.java, v 0.1 2017年5月18日 上午9:52:25 DongChunfu Exp $
 */
public class SettleWayErrorException extends FinanceErrorException {

	private static final long serialVersionUID = 8772817825085547686L;

	/**
	 * @param errCode
	 * @param message
	 */
	public SettleWayErrorException(final int errCode, final String message) {
		super(errCode, message);
	}

}
