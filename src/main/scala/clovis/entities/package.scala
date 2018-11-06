/*
 * Copyright (C) 2018  Well-Factored Software Ltd.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package clovis

/**
  * These are REST entities, so the names of the case class parameters use snake_case instead of
  * camelCase so that the automatic json codec derivation will map the expected json
  */
package object entities {
  type AccountId          = EntityId[Account]
  type AttachmentId       = EntityId[Attachment]
  type FilterId           = EntityId[Filter]
  type MembershipListId   = EntityId[MembershipList]
  type NotificationId     = EntityId[Notification]
  type PushSubscriptionId = EntityId[PushSubscription]
  type ReportId           = EntityId[Report]
  type StatusId           = EntityId[Status]

  type OEmbedData = String
}