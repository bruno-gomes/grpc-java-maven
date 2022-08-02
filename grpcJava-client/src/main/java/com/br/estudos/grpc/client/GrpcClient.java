package com.br.estudos.grpc.client;

import com.br.estudos.grpc.BarbecueServiceGrpc;
import com.br.estudos.grpc.RegisterMemberRequest;
import com.br.estudos.grpc.RegisterMemberResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {
	
	public static void main(String[] args) {
		int portServer = 8080;
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", portServer).usePlaintext().build();
		
		BarbecueServiceGrpc.BarbecueServiceBlockingStub stub = BarbecueServiceGrpc.newBlockingStub(channel);
		
		RegisterMemberResponse registerMemberResponse = stub.registerMember(RegisterMemberRequest.newBuilder()
				.setEventName("Festa da Nuvem")
				.setFirstName("Bruno")
				.setLastName("Gomes")
				.build() );
		
		 System.out.println("Response received from server:\n" + registerMemberResponse);
		 
		 channel.shutdown();
	}

}
