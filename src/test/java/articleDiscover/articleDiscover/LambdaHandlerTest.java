//package articleDiscover.articleDiscover;
//
//import java.io.IOException;
//
//import org.assertj.core.api.Assertions;
//import org.junit.Ignore;
//import org.junit.Test;
//
//import com.amazonaws.serverless.proxy.internal.testutils.AwsProxyRequestBuilder;
//import com.amazonaws.serverless.proxy.model.AwsProxyRequest;
//import com.amazonaws.serverless.proxy.model.AwsProxyResponse;
//import com.amazonaws.services.lambda.runtime.ClientContext;
//import com.amazonaws.services.lambda.runtime.CognitoIdentity;
//import com.amazonaws.services.lambda.runtime.Context;
//import com.amazonaws.services.lambda.runtime.LambdaLogger;
//
//import articlediscover.LambdaHandler;
//
//@Ignore
//class LambdaHandlerTest {
//	@Test
//	void whenTheUsersPathIsInvokedViaLambda_thenShouldReturnAList() throws IOException {
//		LambdaHandler lambdaHandler = new LambdaHandler();
//		AwsProxyRequest req = new AwsProxyRequestBuilder("/articles/55560", "GET").build();
//		Context lambdaContext = new Context() {
//
//			@Override
//			public int getRemainingTimeInMillis() {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//
//			@Override
//			public int getMemoryLimitInMB() {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//
//			@Override
//			public LambdaLogger getLogger() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public String getLogStreamName() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public String getLogGroupName() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public String getInvokedFunctionArn() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public CognitoIdentity getIdentity() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public String getFunctionVersion() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public String getFunctionName() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public ClientContext getClientContext() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public String getAwsRequestId() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//		};
//		AwsProxyResponse resp = lambdaHandler.handleRequest(req, lambdaContext);
//		Assertions.assertThat(resp.getBody() != null);
//		Assertions.assertThat(200 == resp.getStatusCode());
//	}
//
//}
