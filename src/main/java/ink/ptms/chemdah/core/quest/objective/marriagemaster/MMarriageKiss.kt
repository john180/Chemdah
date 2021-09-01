package ink.ptms.chemdah.core.quest.objective.marriagemaster

import at.pcgamingfreaks.MarriageMaster.Bukkit.API.Events.KissEvent
import ink.ptms.chemdah.core.quest.objective.Dependency
import ink.ptms.chemdah.core.quest.objective.ObjectiveCountableI

@Dependency("MarriageMaster")
object MMarriageKiss : ObjectiveCountableI<KissEvent>() {

    override val name = "marriage kiss"
    override val event = KissEvent::class

    init {
        handler {
            player.playerOnline
        }
        addCondition("position") {
            toPosition().inside(it.player.playerOnline!!.location)
        }
    }
}