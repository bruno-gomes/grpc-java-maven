package com.br.estudos.grpc.service;

import com.br.estudos.grpc.RegisterMemberRequest;
import com.br.estudos.grpc.RegisterMemberResponse;
import com.br.estudos.grpc.BarbecueServiceGrpc.BarbecueServiceImplBase;

import io.grpc.stub.StreamObserver;

public class BarbecueService extends BarbecueServiceImplBase{
	
	@Override
	public void registerMember(RegisterMemberRequest request, StreamObserver<RegisterMemberResponse> responseObserver) {
		
		System.out.println("Request received from client:\n" + request);
		
		StringBuilder response = new StringBuilder().append("Bem vindo a ")
				.append(request.getEventName())
				.append(" ")
				.append(request.getFirstName())
				.append(" ")
				.append(request.getLastName())
				;
		
		RegisterMemberResponse registerMemberResponse = RegisterMemberResponse.newBuilder().setWelcomeMessage(response.toString()).build();
		
		responseObserver.onNext(registerMemberResponse);
		responseObserver.onCompleted();
	}
	
	

}
