// Copyright 2015 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package dfp.axis.v201705.userservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201705.StatementBuilder;
import com.google.api.ads.dfp.axis.v201705.User;
import com.google.api.ads.dfp.axis.v201705.UserPage;
import com.google.api.ads.dfp.axis.v201705.UserServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import java.util.Arrays;

/**
 * This example updates the role of a user to a salesperson. To determine which
 * users exist, run GetAllUsers.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdateUsers {

  private static class UpdateUsersParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.USER_ID, required = true,
        description = "The ID of the user to update.")
    private Long userId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session, long userId)
      throws Exception {
    // Get the UserService.
    UserServiceInterface userService = dfpServices.get(session, UserServiceInterface.class);

    // Create a statement to only select a single user by ID.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("id", userId);

    // Get the user.
    UserPage page =
        userService.getUsersByStatement(statementBuilder.toStatement());

    User user = Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    // Set the role of the user to a salesperson.
    // To determine what other roles exist, run GetAllRoles.java.
    user.setRoleId(-5L);

    // Update the user on the server.
    User[] users = userService.updateUsers(new User[] {user});

    for (User updatedUser : users) {
      System.out.printf("User with ID %d and name '%s' was updated.%n",
          updatedUser.getId(), updatedUser.getName());
    }
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfpSession.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    UpdateUsersParams params = new UpdateUsersParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.userId = Long.parseLong("INSERT_USER_ID_HERE");
    }

    runExample(dfpServices, session, params.userId);
  }
}
