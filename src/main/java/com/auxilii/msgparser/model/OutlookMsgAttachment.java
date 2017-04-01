package com.auxilii.msgparser.model;

/**
 * This {@link OutlookAttachment} implementation represents a .msg object attachment. Instead of storing a byte[] of the attachment, this implementation
 * provides an embedded {@link OutlookMessage} object.
 */
public class OutlookMsgAttachment implements OutlookAttachment {

	/**
	 * The encapsulated (attached) outlookMessage.
	 */
	private final OutlookMessage outlookMessage;

	public OutlookMsgAttachment(final OutlookMessage outlookMessage) {
		this.outlookMessage = outlookMessage;
	}

	@Override
	public String toString() {
		return outlookMessage.toString();
	}

	/**
	 * Bean getter for {@link #outlookMessage}.
	 */
	@SuppressWarnings("ElementOnlyUsedFromTestCode")
	public OutlookMessage getOutlookMessage() {
		return outlookMessage;
	}
}