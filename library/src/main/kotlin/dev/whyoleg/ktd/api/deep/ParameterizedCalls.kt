@file:Suppress("unused")

package dev.whyoleg.ktd.api.deep

import dev.whyoleg.ktd.*
import dev.whyoleg.ktd.api.TdApi.*

/**
 * Returns information about a tg: deep link. Use "tg:need_update_for_some_feature" or "tg:some_unsupported_feature" for testing. Returns a 404 error for unknown links. Can be called before authorization
 *
 * @link - The link
 */
suspend fun TelegramClient.getDeepLinkInfo(
    link: String
): DeepLinkInfo = deep(
    GetDeepLinkInfo(
        link
    )
)