package com.x.collaboration.core.message.notification;

public class AttendanceAppealAcceptMessage extends NotificationMessage {

	public AttendanceAppealAcceptMessage(String person, String id, String detailId, String messageContent) {
		super(NotificationType.attendanceAppealAccept, person);
		this.id = id;
		this.detailId = detailId;
		this.messageContent = messageContent;
	}

	private String id;
	private String detailId;
	private String messageContent;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDetailId() {
		return detailId;
	}

	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}

	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

}
