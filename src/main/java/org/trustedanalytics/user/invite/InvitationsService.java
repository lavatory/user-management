/**
 *  Copyright (c) 2015 Intel Corporation 
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.trustedanalytics.user.invite;

import org.trustedanalytics.user.invite.securitycode.SecurityCode;
import org.trustedanalytics.user.invite.securitycode.SecurityCodeService;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;

public interface InvitationsService {
    String sendInviteEmail(String email, String currentUser);
    String resendInviteEmail(String email, String currentUser);
    Optional<UUID> createUser(String username, String password, String orgName);
    Optional<UUID> createUser(String username, String password);
    boolean userExists(String username);
    Set<String> getPendingInvitationsEmails();
    void deleteInvitation(String email);
}
