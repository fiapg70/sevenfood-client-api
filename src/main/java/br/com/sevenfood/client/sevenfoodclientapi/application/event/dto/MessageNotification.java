package br.com.sevenfood.client.sevenfoodclientapi.application.event.dto;

public record MessageNotification(String requestId, String userName, String userAddress, String userPhone, String reason, String status, String requestDate) {}